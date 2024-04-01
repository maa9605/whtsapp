package X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.0tu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18540tu implements Closeable {
    public final InputStream[] A00;
    public final /* synthetic */ C18570tx A01;

    public C18540tu(C18570tx c18570tx, InputStream[] inputStreamArr) {
        this.A01 = c18570tx;
        this.A00 = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        for (InputStream inputStream : this.A00) {
            C18570tx.A01(inputStream);
        }
    }
}
