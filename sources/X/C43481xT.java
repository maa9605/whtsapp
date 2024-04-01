package X;

import com.facebook.msys.mci.network.common.DataTask;
import com.facebook.msys.mci.network.common.DataTaskListener;
import com.facebook.msys.mci.network.common.NetworkUtils;
import com.facebook.msys.mci.network.common.UrlRequest;
import com.facebook.msys.mci.network.common.UrlResponse;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.1xT  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43481xT implements C0J0 {
    public int A00;
    public final DataTaskListener A01 = new DataTaskListener() { // from class: X.3ux
        @Override // com.facebook.msys.mci.network.common.DataTaskListener
        public final void onNewTask(DataTask dataTask, AnonymousClass044 anonymousClass044) {
            C43481xT c43481xT = C43481xT.this;
            try {
                c43481xT.A04.AS1(new RunnableEBaseShape1S0300000_I0_1(c43481xT, dataTask, anonymousClass044, 4));
            } catch (RejectedExecutionException e) {
                Log.e("wa-msys/NetworkSession: DataTask rejected for execution", e);
                throw e;
            }
        }
    };
    public final AnonymousClass035 A02;
    public final C004902f A03;
    public final InterfaceC002901k A04;
    public final File A05;

    public C43481xT(C004902f c004902f, InterfaceC002901k interfaceC002901k, AnonymousClass035 anonymousClass035, File file) {
        this.A03 = c004902f;
        this.A04 = interfaceC002901k;
        this.A02 = anonymousClass035;
        this.A05 = file;
    }

    public final UrlResponse A00(final String str, UrlRequest urlRequest, final AnonymousClass044 anonymousClass044, OutputStream outputStream, boolean z, boolean z2) {
        urlRequest.getUrl();
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(urlRequest.getUrl()).openConnection();
        httpsURLConnection.setDoInput(true);
        int i = this.A00;
        if (i > 0) {
            httpsURLConnection.setConnectTimeout(i);
            httpsURLConnection.setReadTimeout(this.A00);
        }
        try {
            final byte[] httpBody = urlRequest.getHttpBody();
            Map httpHeaders = urlRequest.getHttpHeaders();
            if (httpBody != null) {
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setFixedLengthStreamingMode(httpBody.length);
            }
            if (httpHeaders.containsKey("X-Forwarded-Host")) {
                httpsURLConnection.setSSLSocketFactory((SSLSocketFactory) SSLSocketFactory.getDefault());
            } else {
                if (httpHeaders.containsKey("Host")) {
                    httpsURLConnection.setHostnameVerifier(new C0XL((String) httpHeaders.get("Host"), HttpsURLConnection.getDefaultHostnameVerifier()));
                }
                httpsURLConnection.setSSLSocketFactory(this.A02.A04());
            }
            httpsURLConnection.setRequestMethod(urlRequest.getHttpMethod());
            for (Map.Entry entry : httpHeaders.entrySet()) {
                httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpsURLConnection.setRequestProperty("User-Agent", this.A03.A02());
            httpsURLConnection.setRequestProperty("WaMsysRequest", "1");
            if (httpBody != null && httpsURLConnection.getDoOutput()) {
                OutputStream outputStream2 = httpsURLConnection.getOutputStream();
                int length = httpBody.length;
                final int i2 = 0;
                while (i2 < length) {
                    final int min = Math.min(10240, length);
                    outputStream2.write(httpBody, i2, min);
                    length -= min;
                    i2 += min;
                    if (z) {
                        anonymousClass044.executeInNetworkContext(new AbstractRunnableC19880wM() { // from class: X.3uz
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super("updateDataTaskUploadProgressCallback");
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                AnonymousClass044.this.updateDataTaskUploadProgressCallback(str, min, i2, httpBody.length);
                            }
                        });
                    }
                }
                if (outputStream2 != null) {
                    outputStream2.close();
                }
            }
            try {
                InputStream inputStream = httpsURLConnection.getInputStream();
                try {
                    final int contentLength = httpsURLConnection.getContentLength();
                    byte[] bArr = new byte[10240];
                    final int i3 = 0;
                    while (true) {
                        final int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        outputStream.write(bArr, 0, read);
                        i3 += read;
                        if (z2) {
                            anonymousClass044.executeInNetworkContext(new AbstractRunnableC19880wM() { // from class: X.3v0
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super("updateDataTaskDownloadProgressCallback");
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    AnonymousClass044.this.updateDataTaskDownloadProgressCallback(str, read, i3, contentLength);
                                }
                            });
                        }
                    }
                    inputStream.close();
                } finally {
                }
            } catch (IOException unused) {
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode >= 400 && responseCode <= 500) {
                    String format = String.format(null, "[HTTP status=%d] Error Content = ", Integer.valueOf(responseCode));
                    try {
                        InputStream errorStream = httpsURLConnection.getErrorStream();
                        if (errorStream != null) {
                            try {
                                StringBuilder sb = new StringBuilder();
                                sb.append(format);
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int read2 = errorStream.read(bArr2);
                                    if (read2 == -1) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr2, 0, read2);
                                }
                                sb.append(byteArrayOutputStream.toString());
                                format = sb.toString();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } finally {
                                    try {
                                        errorStream.close();
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                        }
                        if (errorStream != null) {
                        }
                    } catch (IOException unused3) {
                    }
                    throw new IOException(format);
                }
            }
            UrlResponse urlResponse = new UrlResponse(urlRequest, httpsURLConnection.getResponseCode(), NetworkUtils.flattenHeaders(httpsURLConnection.getHeaderFields()));
            httpsURLConnection.getResponseCode();
            return urlResponse;
        } finally {
            httpsURLConnection.disconnect();
        }
    }
}
