package X;

import android.os.SystemClock;

/* renamed from: X.2aB */
/* loaded from: classes2.dex */
public abstract class AbstractC52172aB {
    public long A00;
    public C79523ln A01;
    public C40711sk A02;
    public boolean A03;
    public final int A04;
    public final C04480Ki A05;
    public final C018508q A06;
    public final C05W A07;
    public final C2L9 A08;
    public final AnonymousClass011 A09;
    public final C05Y A0A;
    public final C41681uL A0B;
    public final InterfaceC002901k A0C;
    public final String A0D;

    public AbstractC52172aB(C018508q c018508q, InterfaceC002901k interfaceC002901k, AnonymousClass011 anonymousClass011, C05Y c05y, C05W c05w, C04480Ki c04480Ki, C2L9 c2l9, C41681uL c41681uL, String str, int i) {
        this.A06 = c018508q;
        this.A0C = interfaceC002901k;
        this.A09 = anonymousClass011;
        this.A0A = c05y;
        this.A07 = c05w;
        this.A05 = c04480Ki;
        this.A08 = c2l9;
        this.A04 = i;
        this.A0B = c41681uL;
        this.A0D = str;
    }

    public void A00() {
        this.A03 = true;
        C79523ln c79523ln = this.A01;
        if (c79523ln != null) {
            c79523ln.A05(false);
            this.A01 = null;
        }
        AbstractC50702Sv abstractC50702Sv = (AbstractC50702Sv) ((C85933wV) this).A03.get();
        if (abstractC50702Sv != null) {
            abstractC50702Sv.A0D = false;
        }
    }

    public void A01() {
        this.A00 = SystemClock.elapsedRealtime();
        C79573ls c79573ls = new C79573ls(this.A06, this.A0A, this);
        String A0u = AnonymousClass029.A0u(this.A0D, this.A04);
        C05Y c05y = c79573ls.A01;
        String A02 = c05y.A02();
        c05y.A07(216, A02, new C02590Ca("iq", new C04P[]{new C04P("id", A02, null, (byte) 0), new C04P("xmlns", "w:qr", null, (byte) 0), new C04P("type", "get", null, (byte) 0)}, new C02590Ca("qr", new C04P[]{new C04P("code", A0u, null, (byte) 0)}, null, null)), c79573ls, 32000L);
    }

    public void A02(EnumC40721sl enumC40721sl) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
        this.A06.A02.postDelayed(new RunnableEBaseShape4S0200000_I0_4(this, enumC40721sl, 2), elapsedRealtime < 500 ? 500 - elapsedRealtime : 0L);
    }
}
