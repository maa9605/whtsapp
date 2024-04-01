package X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.1xx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43781xx implements Closeable {
    public final InputStream[] A00;
    public final /* synthetic */ C43751xu A01;

    public C43781xx(C43751xu c43751xu, InputStream[] inputStreamArr) {
        this.A01 = c43751xu;
        this.A00 = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        for (InputStream inputStream : this.A00) {
            C43751xu.A03(inputStream);
        }
    }
}
