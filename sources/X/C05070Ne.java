package X;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import com.whatsapp.util.NativeUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.0Ne */
/* loaded from: classes.dex */
public class C05070Ne {
    public long A00;
    public long A01;
    public Boolean A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final InterfaceC05060Nd A06;
    public final AnonymousClass035 A07;
    public final String A08;
    public final String A09;
    public final List A0D = new LinkedList();
    public final List A0C = new LinkedList();
    public final List A0B = new LinkedList();
    public final List A0A = new LinkedList();
    public final AtomicReference A0E = new AtomicReference();

    public C05070Ne(AnonymousClass035 anonymousClass035, String str, String str2, InterfaceC05060Nd interfaceC05060Nd, boolean z, boolean z2) {
        this.A07 = anonymousClass035;
        this.A08 = str;
        this.A09 = str2;
        this.A06 = interfaceC05060Nd;
        this.A04 = z;
        this.A05 = z2;
    }

    public static String A00(URL url) {
        if (url != null && url.getHost() != null) {
            try {
                return InetAddress.getByName(url.getHost()).getHostAddress();
            } catch (UnknownHostException unused) {
            }
        }
        return null;
    }

    public int A01(C05080Nf c05080Nf) {
        if (c05080Nf != null) {
            this.A0D.add(new Pair("auth", c05080Nf.A01));
        }
        try {
            return A02(c05080Nf, UUID.randomUUID().toString());
        } finally {
            for (C61822wm c61822wm : this.A0A) {
                AnonymousClass024.A0R(c61822wm.A01);
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public final int A02(C05080Nf c05080Nf, String str) {
        C0XK c0xk;
        long uptimeMillis;
        Uri.Builder buildUpon = Uri.parse(this.A08).buildUpon();
        for (Pair pair : this.A0D) {
            buildUpon.appendQueryParameter((String) pair.first, (String) pair.second);
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(buildUpon.toString()).openConnection();
        try {
            try {
                if (this.A04) {
                    c0xk = this.A07.A03(true);
                } else {
                    c0xk = this.A07.A04();
                }
                if (this.A05 && c05080Nf != null) {
                    httpsURLConnection.setHostnameVerifier(new C0XL(c05080Nf.A05, HttpsURLConnection.getDefaultHostnameVerifier()));
                }
                int A92 = c0xk.A92();
                httpsURLConnection.setSSLSocketFactory(c0xk);
                httpsURLConnection.setConnectTimeout(15000);
                httpsURLConnection.setReadTimeout(60000);
                httpsURLConnection.setRequestProperty("User-Agent", this.A09);
                httpsURLConnection.setRequestProperty("Accept-Encoding", "identity");
                if (c05080Nf == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("multipart/form-data; boundary=");
                    sb.append(str);
                    httpsURLConnection.setRequestProperty("Content-Type", sb.toString());
                } else {
                    httpsURLConnection.setRequestProperty("Host", c05080Nf.A05);
                    List list = this.A0A;
                    if (!list.isEmpty() && ((C61822wm) list.get(0)).A00 > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("bytes ");
                        sb2.append(((C61822wm) list.get(0)).A00);
                        sb2.append("-*/*");
                        httpsURLConnection.setRequestProperty("Content-Range", sb2.toString());
                    }
                }
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setChunkedStreamingMode(0);
                long uptimeMillis2 = SystemClock.uptimeMillis();
                try {
                    httpsURLConnection.connect();
                    this.A00 = SystemClock.uptimeMillis() - uptimeMillis2;
                    this.A03 = A00(httpsURLConnection.getURL());
                    this.A02 = Boolean.valueOf(c0xk.A92() == A92);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpsURLConnection.getOutputStream());
                    try {
                        A06(str, bufferedOutputStream, c05080Nf);
                        bufferedOutputStream.close();
                        uptimeMillis = SystemClock.uptimeMillis();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            try {
                                bufferedOutputStream.close();
                            } catch (Throwable unused) {
                            }
                            throw th2;
                        }
                    }
                    try {
                        int responseCode = httpsURLConnection.getResponseCode();
                        this.A01 = SystemClock.uptimeMillis() - uptimeMillis;
                        Map<String, List<String>> headerFields = httpsURLConnection.getHeaderFields();
                        if (responseCode >= 400) {
                            if (httpsURLConnection.getErrorStream() != null) {
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(httpsURLConnection.getErrorStream());
                                try {
                                    String A0D = AnonymousClass024.A0D(bufferedInputStream);
                                    InterfaceC05060Nd interfaceC05060Nd = this.A06;
                                    if (interfaceC05060Nd != null) {
                                        interfaceC05060Nd.AJz(headerFields, A0D);
                                    }
                                    bufferedInputStream.close();
                                } finally {
                                }
                            }
                            return responseCode;
                        }
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(httpsURLConnection.getInputStream());
                        try {
                            String A0D2 = AnonymousClass024.A0D(bufferedInputStream2);
                            InterfaceC05060Nd interfaceC05060Nd2 = this.A06;
                            if (interfaceC05060Nd2 != null) {
                                interfaceC05060Nd2.AO0(headerFields, A0D2);
                            }
                            bufferedInputStream2.close();
                            return responseCode;
                        } finally {
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                try {
                                    bufferedInputStream2.close();
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        this.A01 = SystemClock.uptimeMillis() - uptimeMillis;
                        throw th4;
                    }
                } catch (Throwable th5) {
                    this.A00 = SystemClock.uptimeMillis() - uptimeMillis2;
                    this.A03 = A00(httpsURLConnection.getURL());
                    throw th5;
                }
            } catch (IllegalArgumentException e) {
                throw new IOException(e);
            }
        } finally {
            httpsURLConnection.disconnect();
        }
    }

    public final Pair A03() {
        boolean z;
        Socket socket = (Socket) this.A0E.get();
        int i = 0;
        if (socket != null) {
            try {
                i = NativeUtils.getFileDescriptorForSocket(socket);
                z = true;
            } catch (UnsatisfiedLinkError e) {
                Log.w("httpsformpost/getSocketInfo", e);
            } catch (UnsupportedOperationException e2) {
                Log.w("httpsformpost/getSocketInfo", e2);
            }
            return new Pair(Integer.valueOf(i), Boolean.valueOf(z));
        }
        z = false;
        return new Pair(Integer.valueOf(i), Boolean.valueOf(z));
    }

    public final void A04(C61822wm c61822wm, OutputStream outputStream, AtomicLong atomicLong, Pair pair) {
        int intValue = ((Number) pair.first).intValue();
        boolean booleanValue = ((Boolean) pair.second).booleanValue();
        long j = c61822wm.A00;
        long j2 = j;
        while (j > 0) {
            j -= c61822wm.A01.skip(j);
        }
        byte[] bArr = new byte[16384];
        do {
            int read = c61822wm.A01.read(bArr);
            if (read != -1) {
                int i = 0;
                outputStream.write(bArr, 0, read);
                j2 += read;
                InterfaceC05060Nd interfaceC05060Nd = this.A06;
                if (interfaceC05060Nd != null) {
                    if (booleanValue) {
                        try {
                            i = NativeUtils.getBytesInSocketOutputQueue(intValue);
                        } catch (UnsupportedOperationException unused) {
                        }
                    }
                    interfaceC05060Nd.AJD(j2 - i);
                }
            } else {
                atomicLong.set(j2);
                return;
            }
        } while (!Thread.currentThread().isInterrupted());
        throw new InterruptedIOException();
    }

    public void A05(InputStream inputStream, String str, String str2, long j, long j2) {
        this.A0A.add(new C61822wm(inputStream, str, str2, j, false));
    }

    public final void A06(String str, OutputStream outputStream, C05080Nf c05080Nf) {
        boolean z = false;
        if (c05080Nf != null) {
            List list = this.A0A;
            if (list.size() != 0) {
                boolean z2 = list.size() == 1;
                StringBuilder A0P = C000200d.A0P("MMS4 upload only supports a single file; we have been given ");
                A0P.append(list.size());
                C000700j.A08(z2, A0P.toString());
                A04((C61822wm) list.get(0), outputStream, new AtomicLong(), A03());
                return;
            }
            return;
        }
        Pair A03 = A03();
        byte[] bArr = {13, 10};
        for (C61822wm c61822wm : this.A0A) {
            if (z) {
                outputStream.write(bArr);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("--");
            sb.append(str);
            sb.append("\r\n");
            outputStream.write(sb.toString().getBytes());
            String replace = c61822wm.A03.replace("\\", "\\\\").replace("\"", "\\\"");
            String str2 = c61822wm.A02;
            if (!TextUtils.isEmpty(str2)) {
                String replace2 = str2.replace("\\", "\\\\").replace("\"", "\\\"");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Content-Disposition: form-data; name=\"");
                sb2.append(replace);
                sb2.append("\"; filename=\"");
                sb2.append(replace2);
                sb2.append("\"\r\n");
                outputStream.write(sb2.toString().getBytes());
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Content-Disposition: form-data; name=\"");
                sb3.append(replace);
                sb3.append("\"\r\n");
                outputStream.write(sb3.toString().getBytes());
            }
            if (c61822wm.A04) {
                outputStream.write("Content-Type: application/x-gzip\r\n".getBytes());
                outputStream.write("Content-Encoding: gzip\r\n".getBytes());
            } else {
                outputStream.write("Content-Type: application/octet-stream\r\n".getBytes());
            }
            long j = c61822wm.A00;
            if (j > 0) {
                StringBuilder A0P2 = C000200d.A0P("Content-Range: bytes ");
                A0P2.append(j);
                A0P2.append("-*/*\r\n");
                outputStream.write(A0P2.toString().getBytes());
            }
            outputStream.write(bArr);
            A04(c61822wm, outputStream, new AtomicLong(), A03);
            z = true;
        }
        for (Pair pair : this.A0C) {
            String replace3 = ((String) pair.first).replace("\\", "\\\\").replace("\"", "\\\"");
            if (z) {
                outputStream.write(bArr);
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("--");
            sb4.append(str);
            sb4.append("\r\n");
            outputStream.write(sb4.toString().getBytes());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Content-Disposition: form-data; name=\"");
            sb5.append(replace3);
            sb5.append("\"\r\n\r\n");
            outputStream.write(sb5.toString().getBytes());
            outputStream.write(((String) pair.second).getBytes());
            z = true;
        }
        for (Pair pair2 : this.A0B) {
            String replace4 = ((String) pair2.first).replace("\\", "\\\\").replace("\"", "\\\"");
            if (z) {
                outputStream.write(bArr);
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append("--");
            sb6.append(str);
            sb6.append("\r\n");
            outputStream.write(sb6.toString().getBytes());
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Content-Disposition: form-data; name=\"");
            sb7.append(replace4);
            sb7.append("\"\r\n\r\n");
            outputStream.write(sb7.toString().getBytes());
            try {
                outputStream.write(((String) ((Callable) pair2.second).call()).getBytes());
                z = true;
            } catch (Exception e) {
                StringBuilder A0P3 = C000200d.A0P("failure during latePostParam call; name=");
                A0P3.append((String) pair2.first);
                throw new IOException(A0P3.toString(), e);
            }
        }
        if (z) {
            outputStream.write(bArr);
        }
        StringBuilder sb8 = new StringBuilder();
        sb8.append("--");
        sb8.append(str);
        sb8.append("--\r\n");
        outputStream.write(sb8.toString().getBytes());
    }
}
