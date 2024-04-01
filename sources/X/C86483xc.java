package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.3xc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86483xc extends C2C0 implements C25Z {
    public final C000500h A00;
    public final C461225a A01;
    public final boolean A02;
    public volatile int A03;
    public volatile int A04;
    public volatile List A05;
    public volatile List A06;

    public C86483xc(C461225a c461225a, C2AS c2as, C000500h c000500h, boolean z) {
        super(c2as);
        this.A05 = new ArrayList(0);
        this.A06 = new ArrayList(0);
        this.A01 = c461225a;
        this.A00 = c000500h;
        ((C2C0) this).A00 = this;
        this.A02 = z;
    }

    @Override // X.C2C0
    public Void A0A(Void... voidArr) {
        C461225a c461225a = this.A01;
        List A0E = c461225a.A0B.A0E();
        this.A04 = ((AbstractCollection) A0E).size();
        C2AM c2am = c461225a.A08;
        this.A03 = c2am.A02().size();
        if (this.A02) {
            this.A05 = c2am.A0C();
            this.A06 = A0E;
        }
        super.A0A(voidArr);
        return null;
    }

    @Override // X.C25Z
    public void AMb(C42531vt c42531vt) {
        C461225a c461225a = this.A01;
        HashSet hashSet = c461225a.A0F;
        String str = c42531vt.A0D;
        hashSet.remove(str);
        if (c461225a.A04 != null) {
            for (int i = 0; i < c461225a.A04.size(); i++) {
                if (((C42531vt) c461225a.A04.get(i)).A0D.equals(str)) {
                    c461225a.A04.set(i, c42531vt);
                    c461225a.A04(c461225a.A04, null);
                    return;
                }
            }
        }
    }

    @Override // X.C25Z
    public void AMc(List list) {
        boolean z = true;
        boolean z2 = this.A03 > 0;
        boolean z3 = this.A04 > 0;
        C461225a c461225a = this.A01;
        c461225a.A05 = z2;
        c461225a.A06 = z3;
        C000500h c000500h = this.A00;
        int i = this.A04;
        int size = list.size();
        if (i < 50 && size < 3) {
            z = false;
        }
        C000200d.A0j(c000500h, "sticker_contextual_suggestion_eligibility", z);
        if (z2) {
            C461225a.A00(c461225a, list, "recents");
        } else if (z3) {
            C461225a.A00(c461225a, list, "starred");
        } else if (list.size() > 0) {
            C461225a.A00(c461225a, list, ((C42531vt) list.get(0)).A0D);
        } else {
            C461225a.A00(c461225a, list, null);
        }
        if (this.A02) {
            List list2 = this.A05;
            List list3 = this.A06;
            InterfaceC70513So interfaceC70513So = c461225a.A01;
            if (interfaceC70513So != null) {
                interfaceC70513So.AOR(c461225a.A01(list2, list3));
            }
            InterfaceC70513So interfaceC70513So2 = c461225a.A00;
            if (interfaceC70513So2 != null) {
                interfaceC70513So2.AOR(c461225a.A01(list2, list3));
            }
        }
    }

    @Override // X.C25Z
    public void AMd() {
        this.A01.A02 = null;
    }

    @Override // X.C25Z
    public void AMe(String str) {
        C461225a c461225a = this.A01;
        c461225a.A0F.remove(str);
        if (c461225a.A04 != null) {
            for (int i = 0; i < c461225a.A04.size(); i++) {
                if (((C42531vt) c461225a.A04.get(i)).A0D.equals(str)) {
                    c461225a.A04.remove(i);
                    c461225a.A04(c461225a.A04, null);
                    return;
                }
            }
        }
    }
}
