package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: X.1q4  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C39401q4 extends AbstractC30211a6 implements InterfaceC30281aD {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public AnonymousClass126 A04;
    public InputStream A05;
    public HttpURLConnection A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final C12A A0A;
    public final C12A A0B;
    public final String A0C;
    public static final Pattern A0E = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicReference A0D = new AtomicReference();

    public C39401q4(String str, C12A c12a) {
        super(true);
        if (!TextUtils.isEmpty(str)) {
            this.A0C = str;
            this.A0B = new C12A();
            this.A08 = 8000;
            this.A09 = 8000;
            this.A0A = c12a;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void A04() {
        HttpURLConnection httpURLConnection = this.A06;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.A06 = null;
        }
    }

    @Override // X.AbstractC30211a6, X.InterfaceC06380Sv
    public Map ACr() {
        HttpURLConnection httpURLConnection = this.A06;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // X.InterfaceC06380Sv
    public Uri ADi() {
        HttpURLConnection httpURLConnection = this.A06;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ec  */
    @Override // X.InterfaceC06380Sv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long AQX(final X.AnonymousClass126 r24) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39401q4.AQX(X.126):long");
    }

    @Override // X.InterfaceC06380Sv
    public void close() {
        try {
            if (this.A05 != null) {
                HttpURLConnection httpURLConnection = this.A06;
                long j = this.A02;
                if (j != -1) {
                    j -= this.A00;
                }
                int i = C08M.A00;
                if (i == 19 || i == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j == -1) {
                            if (inputStream.read() == -1) {
                            }
                        } else if (j <= 2048) {
                        }
                        Class<?> cls = inputStream.getClass();
                        String name = cls.getName();
                        if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                            Method declaredMethod = cls.getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, new Object[0]);
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.A05.close();
                } catch (IOException e) {
                    throw new AnonymousClass129(e, this.A04, 3);
                }
            }
        } finally {
            this.A05 = null;
            A04();
            if (this.A07) {
                this.A07 = false;
                A00();
            }
        }
    }

    @Override // X.InterfaceC06380Sv
    public int read(byte[] bArr, int i, int i2) {
        try {
            if (this.A01 != this.A03) {
                AtomicReference atomicReference = A0D;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.A01;
                    long j2 = this.A03;
                    if (j != j2) {
                        int read = this.A05.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                        if (Thread.currentThread().isInterrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.A01 += read;
                            A02(read);
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        atomicReference.set(bArr2);
                        break;
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.A02;
            if (j3 != -1) {
                long j4 = j3 - this.A00;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                } else {
                    return -1;
                }
            }
            int read2 = this.A05.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.A02 != -1) {
                    throw new EOFException();
                }
                return -1;
            }
            this.A00 += read2;
            A02(read2);
            return read2;
        } catch (IOException e) {
            throw new AnonymousClass129(e, this.A04, 2);
        }
    }
}
