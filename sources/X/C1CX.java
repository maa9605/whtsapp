package X;

import java.io.Closeable;
import java.io.InputStream;
import java.net.URL;

/* renamed from: X.1CX  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CX implements Closeable {
    public C0AC A00;
    public final URL A01;
    public volatile InputStream A02;

    public C1CX(URL url) {
        this.A01 = url;
    }

    public static void A00(Throwable th, InputStream inputStream) {
        if (th == null) {
            inputStream.close();
            return;
        }
        try {
            inputStream.close();
        } catch (Throwable th2) {
            C234916x.A00.A00(th, th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C16u.A00(this.A02);
    }
}
