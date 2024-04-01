package X;

import java.io.Closeable;

/* renamed from: X.1xb */
/* loaded from: classes2.dex */
public final class C43561xb implements Closeable {
    public final C43571xc A00;
    public final C43571xc A01;
    public final C43571xc A02;
    public final /* synthetic */ C43381xJ A03;

    public C43561xb(C43381xJ c43381xJ, C43571xc c43571xc, C43571xc c43571xc2) {
        this.A03 = c43381xJ;
        this.A02 = c43571xc;
        this.A00 = c43571xc2;
        this.A01 = null;
    }

    public C43561xb(C43381xJ c43381xJ, C43571xc c43571xc, C43571xc c43571xc2, C43571xc c43571xc3) {
        this.A03 = c43381xJ;
        this.A02 = c43571xc;
        this.A00 = c43571xc2;
        this.A01 = c43571xc3;
    }

    public C63242zT A00() {
        String A00 = this.A02.A00();
        C43571xc c43571xc = this.A00;
        String A002 = c43571xc.A00();
        C43571xc c43571xc2 = this.A01;
        return new C63242zT(A00, A002, c43571xc2 == null ? null : c43571xc2.A00(), c43571xc.A00);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AnonymousClass024.A0R(this.A00);
        AnonymousClass024.A0R(this.A02);
        AnonymousClass024.A0R(this.A01);
    }
}
