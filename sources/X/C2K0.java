package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2K0  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2K0 extends C2AN {
    public static volatile C2K0 A07;
    public Set A00;
    public final C0F2 A01;
    public final C43811y1 A02;
    public final C3HF A03;
    public final C2AS A04;
    public final InterfaceC002901k A05;
    public final Object A06;

    public C2K0(InterfaceC002901k interfaceC002901k, C43811y1 c43811y1, C2AS c2as, C3HF c3hf, C0F2 c0f2) {
        super(c3hf, 30);
        this.A06 = new Object();
        this.A05 = interfaceC002901k;
        this.A02 = c43811y1;
        this.A04 = c2as;
        this.A03 = c3hf;
        this.A01 = c0f2;
    }

    public static C2K0 A00() {
        if (A07 == null) {
            synchronized (C2K0.class) {
                if (A07 == null) {
                    InterfaceC002901k A00 = C002801j.A00();
                    C43811y1 A002 = C43811y1.A00();
                    C2AS A003 = C2AS.A00();
                    if (C3HF.A07 == null) {
                        synchronized (C3HF.class) {
                            if (C3HF.A07 == null) {
                                C3HF.A07 = new C3HF(C001200o.A01, C40081rY.A00(), C43811y1.A00(), C43791xz.A00(), C0F2.A00());
                            }
                        }
                    }
                    A07 = new C2K0(A00, A002, A003, C3HF.A07, C0F2.A00());
                }
            }
        }
        return A07;
    }

    @Override // X.C2AN
    public List A06(int i) {
        ArrayList<Object> arrayList;
        if (this.A02.A01) {
            arrayList = null;
        } else {
            synchronized (this.A06) {
                arrayList = new ArrayList(this.A00);
            }
        }
        if (arrayList != null) {
            for (Object obj : arrayList) {
                A05(obj);
            }
        }
        return super.A06(i);
    }

    @Override // X.C2AN
    public void A07() {
        super.A07();
        synchronized (this.A06) {
            if (this.A00 == null) {
                HashSet hashSet = new HashSet();
                this.A00 = hashSet;
                hashSet.addAll(this.A03.A06.values());
            }
        }
    }

    @Override // X.C2AN
    public void A08(int i) {
        Object A01 = A01(i);
        if (A01 instanceof C2K2) {
            this.A05.AS1(new RunnableEBaseShape3S0200000_I0_3(this, A01, 4));
            synchronized (this.A06) {
                this.A00.remove(A01);
            }
        }
        super.A08(i);
    }

    @Override // X.C2AN
    public void A09(C2BY c2by) {
        C3HE c3he = (C3HE) c2by;
        super.A09(c3he);
        C2K1 c2k1 = c3he.A01;
        if (c2k1 instanceof C2K2) {
            this.A05.AS1(new RunnableEBaseShape3S0200000_I0_3(this, c2k1, 3));
            synchronized (this.A06) {
                this.A00.add(c2k1);
            }
        }
    }

    @Override // X.C2AN
    public boolean A0A(Object obj) {
        C2K1 c2k1 = (C2K1) obj;
        if (c2k1.A5u(this.A02)) {
            return super.A0A(c2k1);
        }
        return false;
    }

    public void A0B(C2K1 c2k1) {
        if (c2k1.A5u(this.A02)) {
            super.A0A(c2k1);
        }
    }
}
