package X;

import com.whatsapp.util.Log;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.protocol.HttpContext;

/* renamed from: X.2ly  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C55652ly implements HttpRequestInterceptor {
    public int A00;
    public final int A01 = 3;
    public final C0EL A02;

    public C55652ly(C0EL c0el) {
        this.A02 = c0el;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        this.A00++;
        if (httpRequest instanceof EntityEnclosingRequestWrapper) {
            EntityEnclosingRequestWrapper entityEnclosingRequestWrapper = (EntityEnclosingRequestWrapper) httpRequest;
            final HttpEntity entity = entityEnclosingRequestWrapper.getEntity();
            if (entity == null) {
                httpRequest.getRequestLine();
                return;
            }
            long contentLength = entity.getContentLength();
            if (contentLength <= 0) {
                StringBuilder sb = new StringBuilder("gdrive-api/request-interceptor/process/length/");
                sb.append(contentLength);
                Log.e(sb.toString());
                return;
            }
            entityEnclosingRequestWrapper.setEntity(new HttpEntity() { // from class: X.2lw
                public void consumeContent() {
                    entity.consumeContent();
                }

                public InputStream getContent() {
                    final InputStream content = entity.getContent();
                    C55652ly c55652ly = C55652ly.this;
                    final int i = c55652ly.A01;
                    final C0EL c0el = c55652ly.A02;
                    return new InputStream(content, i, c0el) { // from class: X.2lx
                        public final int A00;
                        public final C0EL A01;
                        public final InputStream A02;

                        {
                            this.A02 = content;
                            this.A00 = i;
                            this.A01 = c0el;
                        }

                        @Override // java.io.InputStream
                        public int available() {
                            return this.A02.available();
                        }

                        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                        public void close() {
                            this.A02.close();
                        }

                        @Override // java.io.InputStream
                        public void mark(int i2) {
                            this.A02.mark(i2);
                        }

                        @Override // java.io.InputStream
                        public boolean markSupported() {
                            return this.A02.markSupported();
                        }

                        @Override // java.io.InputStream
                        public int read() {
                            int read = this.A02.read();
                            if (read >= 0) {
                                this.A01.A04(1, this.A00);
                            }
                            return read;
                        }

                        @Override // java.io.InputStream
                        public int read(byte[] bArr) {
                            int read = this.A02.read(bArr);
                            if (read > 0) {
                                this.A01.A04(read, this.A00);
                            }
                            return read;
                        }

                        @Override // java.io.InputStream
                        public int read(byte[] bArr, int i2, int i3) {
                            int read = this.A02.read(bArr, i2, i3);
                            if (read > 0) {
                                this.A01.A04(read, this.A00);
                            }
                            return read;
                        }

                        @Override // java.io.InputStream
                        public synchronized void reset() {
                            this.A02.reset();
                        }

                        @Override // java.io.InputStream
                        public long skip(long j) {
                            long skip = this.A02.skip(j);
                            this.A01.A06(skip, this.A00);
                            return skip;
                        }
                    };
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
                    HttpEntity httpEntity = entity;
                    C55652ly c55652ly = C55652ly.this;
                    httpEntity.writeTo(new C48142Dy(outputStream, c55652ly.A02, c55652ly.A01));
                }
            });
        } else if (httpRequest instanceof RequestWrapper) {
        } else {
            StringBuilder sb2 = new StringBuilder("gdrive-request-interceptor/process/request-is-not-a-wrapper ");
            sb2.append(httpRequest);
            Log.e(sb2.toString());
        }
    }
}
