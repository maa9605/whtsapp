package X;

import java.util.List;

/* renamed from: X.3Rk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC70213Rk extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C0N1 A00;
    public final /* synthetic */ C4FC A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;

    public /* synthetic */ RunnableC70213Rk(C4FC c4fc, C0N1 c0n1, List list, List list2) {
        this.A01 = c4fc;
        this.A00 = c0n1;
        this.A02 = list;
        this.A03 = list2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A03(this.A00, this.A02, this.A03);
    }
}
