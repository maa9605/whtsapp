package X;

import com.whatsapp.util.Log;

/* renamed from: X.2UX  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2UX extends AbstractC05910Qs implements InterfaceC07560Ys {
    public final C018508q A00;
    public final C01B A01;
    public final C002301c A02;
    public final C03340Fh A03;
    public final C011005l A04;
    public final C0EG A05;
    public final C41521u3 A06;
    public final C41991uq A07;
    public final String A08;

    public C2UX(C018508q c018508q, C41991uq c41991uq, C0EG c0eg, C01B c01b, C41521u3 c41521u3, C002301c c002301c, C03340Fh c03340Fh, C011005l c011005l, String str) {
        this.A00 = c018508q;
        this.A07 = c41991uq;
        this.A05 = c0eg;
        this.A01 = c01b;
        this.A06 = c41521u3;
        this.A02 = c002301c;
        this.A03 = c03340Fh;
        this.A04 = c011005l;
        this.A08 = str;
    }

    @Override // X.AbstractC05910Qs
    public void A00() {
        if (super.A00) {
            return;
        }
        super.A01 = true;
        Log.w("web/web-action/setgroupdescription/timeout");
        AJp(0);
    }

    @Override // X.InterfaceC07560Ys
    public boolean AFq() {
        return super.A01;
    }

    @Override // X.InterfaceC07560Ys
    public void AJp(int i) {
        cancel();
        C018508q c018508q = this.A00;
        c018508q.A02.post(new RunnableEBaseShape0S0101000_I0(this, i, 5));
        C41991uq c41991uq = this.A07;
        String str = this.A08;
        c41991uq.A0E(str, i);
        this.A06.A0F(str, i);
        this.A03.A07(this.A04, false);
    }

    @Override // X.InterfaceC07560Ys
    public void APE() {
        cancel();
        C41991uq c41991uq = this.A07;
        String str = this.A08;
        c41991uq.A0E(str, 200);
        this.A06.A0F(str, 200);
        this.A03.A07(this.A04, false);
    }
}
