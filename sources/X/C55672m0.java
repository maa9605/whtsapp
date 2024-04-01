package X;

import com.whatsapp.util.Log;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.protocol.HttpContext;

/* renamed from: X.2m0  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C55672m0 implements HttpResponseInterceptor {
    public final int A00 = 3;
    public final C0EL A01;

    public C55672m0(C0EL c0el) {
        this.A01 = c0el;
    }

    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        if (httpResponse.getEntity() == null) {
            RequestWrapper requestWrapper = (RequestWrapper) httpContext.getAttribute("http.request");
            if (requestWrapper != null) {
                requestWrapper.getURI();
                return;
            } else {
                Log.e("gdrive-response-interceptor/process/response-without-entity-and-request-is-null");
                return;
            }
        }
        long contentLength = httpResponse.getEntity().getContentLength();
        if (contentLength <= 0) {
            RequestWrapper requestWrapper2 = (RequestWrapper) httpContext.getAttribute("http.request");
            if (requestWrapper2 != null) {
                requestWrapper2.getURI();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("gdrive-response-interceptor/process/length/");
            sb.append(contentLength);
            sb.append("/request-is-null");
            Log.e(sb.toString());
            return;
        }
        final HttpEntity entity = httpResponse.getEntity();
        httpResponse.setEntity(new HttpEntity() { // from class: X.2lz
            public void consumeContent() {
                entity.consumeContent();
            }

            public InputStream getContent() {
                InputStream content = entity.getContent();
                C55672m0 c55672m0 = C55672m0.this;
                return new C43991yL(content, c55672m0.A01, c55672m0.A00);
            }

            public Header getContentEncoding() {
                return entity.getContentEncoding();
            }

            public long getContentLength() {
                return entity.getContentLength();
            }

            public Header getContentType() {
                return entity.getContentType();
            }

            public boolean isChunked() {
                return entity.isChunked();
            }

            public boolean isRepeatable() {
                return entity.isRepeatable();
            }

            public boolean isStreaming() {
                return entity.isStreaming();
            }

            public void writeTo(OutputStream outputStream) {
                InputStream content = getContent();
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = content.read(bArr);
                        if (read >= 0) {
                            outputStream.write(bArr, 0, read);
                        } else {
                            ((C43991yL) content).A02.close();
                            return;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            ((C43991yL) content).A02.close();
                        } catch (Throwable unused) {
                        }
                        throw th2;
                    }
                }
            }
        });
    }
}
