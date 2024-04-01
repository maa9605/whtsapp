package X;

import java.util.List;

/* renamed from: X.3RF  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3RF extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C4EW A00;
    public final /* synthetic */ List A01;

    public /* synthetic */ C3RF(C4EW c4ew, List list) {
        this.A00 = c4ew;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A0B(this.A01);
    }
}
