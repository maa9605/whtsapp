package X;

import java.util.List;

/* renamed from: X.3RU  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3RU extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C4F8 A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;

    public /* synthetic */ C3RU(C4F8 c4f8, List list, List list2) {
        this.A00 = c4f8;
        this.A01 = list;
        this.A02 = list2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A05(this.A01, this.A02);
    }
}
