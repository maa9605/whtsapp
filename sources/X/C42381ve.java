package X;

import android.app.Activity;

/* renamed from: X.1ve */
/* loaded from: classes2.dex */
public class C42381ve {
    public static volatile C42381ve A0E;
    public final AbstractC000600i A00;
    public final C018508q A01;
    public final C03130Eh A02;
    public final C01B A03;
    public final C42411vh A04;
    public final C03120Eg A05;
    public final C02E A06;
    public final C02F A07;
    public final C00A A08;
    public final C0HA A09;
    public final C42421vi A0A;
    public final C0H9 A0B;
    public final C42391vf A0C;
    public final C42401vg A0D;

    public C42381ve(C018508q c018508q, AbstractC000600i abstractC000600i, C42391vf c42391vf, C02E c02e, C0H9 c0h9, C00A c00a, C0HA c0ha, C03130Eh c03130Eh, C42401vg c42401vg, C02F c02f, C42411vh c42411vh, C42421vi c42421vi, C03120Eg c03120Eg, C01B c01b) {
        this.A01 = c018508q;
        this.A00 = abstractC000600i;
        this.A0C = c42391vf;
        this.A06 = c02e;
        this.A0B = c0h9;
        this.A08 = c00a;
        this.A09 = c0ha;
        this.A02 = c03130Eh;
        this.A0D = c42401vg;
        this.A07 = c02f;
        this.A04 = c42411vh;
        this.A0A = c42421vi;
        this.A05 = c03120Eg;
        this.A03 = c01b;
    }

    public C09560eJ A00(Activity activity, boolean z, boolean z2) {
        return new C09560eJ(activity, this.A01, this.A00, this.A0C, this.A06, this.A0B, this.A08, this.A09, this.A02, this.A0D, this.A07, this.A04, this.A0A, this.A05, this.A03, z, z2);
    }

    public C09560eJ A01(C09G c09g, Activity activity, boolean z) {
        C03120Eg c03120Eg = this.A05;
        if (c03120Eg.A09(c09g)) {
            C09560eJ A01 = c03120Eg.A01();
            if (A01 != null) {
                return A01;
            }
            throw null;
        }
        boolean z2 = true;
        C09560eJ A00 = A00(activity, true, z);
        A00.A0J = c09g;
        if (!c09g.A0n.A02) {
            int i = ((AnonymousClass092) c09g).A08;
            if (i != 9 && i != 10) {
                z2 = false;
            }
            A00.A0Q = z2;
        }
        return A00;
    }
}
