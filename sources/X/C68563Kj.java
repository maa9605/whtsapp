package X;

/* renamed from: X.3Kj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C68563Kj extends C0TD {
    public final /* synthetic */ C61752wf A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68563Kj(C61752wf c61752wf, C41991uq c41991uq, C0ES c0es, C03340Fh c03340Fh, C011005l c011005l, String str) {
        super(c41991uq, c0es, c03340Fh, c011005l, str, null, 17, null);
        this.A00 = c61752wf;
    }

    @Override // X.C0TD
    public void A01() {
        C61752wf c61752wf = this.A00;
        if (c61752wf.A02.isFinishing()) {
            return;
        }
        c61752wf.A00.postDelayed(new RunnableEBaseShape8S0100000_I1_0(this, 36), 300L);
    }

    @Override // X.C0TD, X.C0I3
    public void ARv(int i) {
        C018508q c018508q = this.A00.A03;
        c018508q.A02.post(new RunnableEBaseShape1S0101000_I1(this, i, 0));
        A01();
    }
}
