package X;

import java.util.List;

/* renamed from: X.2MT  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2MT {
    public static volatile C2MT A0A;
    public int A00;
    public int A01 = Integer.MAX_VALUE;
    public C66923Cy A02;
    public final C018508q A03;
    public final C01B A04;
    public final C0EL A05;
    public final C001200o A06;
    public final AnonymousClass011 A07;
    public final C04000Ia A08;
    public final C0IY A09;

    public C2MT(C001200o c001200o, C018508q c018508q, C0EL c0el, C01B c01b, AnonymousClass011 anonymousClass011, C0IY c0iy, C04000Ia c04000Ia) {
        this.A06 = c001200o;
        this.A03 = c018508q;
        this.A05 = c0el;
        this.A04 = c01b;
        this.A07 = anonymousClass011;
        this.A09 = c0iy;
        this.A08 = c04000Ia;
    }

    public void A00(C40231ro c40231ro) {
        c40231ro.A03 = true;
        C66923Cy c66923Cy = this.A02;
        if (c66923Cy != null) {
            synchronized (c66923Cy.A05) {
                C55932mQ c55932mQ = (C55932mQ) c66923Cy.A08.get(c40231ro.getId());
                if (c55932mQ != null && c40231ro.getId().equals(c55932mQ.A03)) {
                    c55932mQ.A05.remove(c40231ro);
                }
            }
        }
        List list = c40231ro.A02;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (C40231ro c40231ro2 : c40231ro.A02) {
            A00(c40231ro2);
        }
    }
}
