package X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.0y8 */
/* loaded from: classes.dex */
public final class C20750y8 implements Closeable {
    public final C20730y6 A00;
    public final InputStream A01;

    public C20750y8(C20730y6 c20730y6, InputStream inputStream) {
        this.A00 = c20730y6;
        this.A01 = inputStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A01.close();
    }
}
