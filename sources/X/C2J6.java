package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.2J6  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2J6 extends C0MU {
    public boolean A00;
    public boolean A01;
    public final C018508q A04;
    public final C451120l A05;
    public final C0E7 A06;
    public final C0EE A07;
    public final InterfaceC002901k A0A;
    public final C0HK A03 = new C0HK();
    public final C461825l A08 = new C461825l();
    public final C461825l A09 = new C461825l();
    public final C0HK A02 = new C0HK();

    public C2J6(C018508q c018508q, InterfaceC002901k interfaceC002901k, C0EE c0ee, C0E7 c0e7, C000500h c000500h, C451120l c451120l, boolean z, boolean z2) {
        this.A04 = c018508q;
        this.A0A = interfaceC002901k;
        this.A07 = c0ee;
        this.A06 = c0e7;
        this.A05 = c451120l;
        this.A00 = z;
        this.A01 = z2;
        this.A03.A0B(Boolean.valueOf(c000500h.A0k()));
    }

    public final void A02(int i) {
        int i2;
        boolean z = i == 0;
        if (this.A00) {
            C461825l c461825l = this.A08;
            if (!z) {
                i2 = R.string.md_opt_out_confirmation;
            } else {
                boolean z2 = this.A01;
                i2 = R.string.md_opt_in_confirmation;
                if (z2) {
                    i2 = R.string.md_opt_in_confirmation_with_portal;
                }
            }
            c461825l.A0B(new C57512pW(i, i2));
            return;
        }
        A03(z);
    }

    public final void A03(boolean z) {
        if (!this.A06.A05()) {
            this.A09.A0B(new C2pX(0, R.string.connectivity_check_connection));
            return;
        }
        C0HK c0hk = this.A02;
        int i = R.string.md_opt_out_in_progress;
        if (z) {
            i = R.string.md_opt_in_in_progress;
        }
        c0hk.A0B(Integer.valueOf(i));
        if (!z && this.A00) {
            this.A0A.AS1(new RunnableEBaseShape1S0100000_I0_1(this, 31));
            return;
        }
        this.A0A.AS1(new RunnableEBaseShape0S0110000_I0(this, z, 2));
        this.A00 = false;
        this.A01 = false;
        C018508q c018508q = this.A04;
        c018508q.A02.postDelayed(new RunnableEBaseShape0S0110000_I0(this, z, 3), 1000L);
    }
}
