package X;

/* renamed from: X.2CX  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2CX extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C470029d A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C2CX(C470029d c470029d, int i, boolean z) {
        this.A01 = c470029d;
        this.A00 = i;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C470029d c470029d = this.A01;
        int i = this.A00;
        boolean z = this.A02;
        if (c470029d.A04) {
            c470029d.A06[i] = z;
            if (z) {
                c470029d.A05[i] = true;
            }
        }
    }
}
