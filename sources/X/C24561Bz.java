package X;

import android.os.Handler;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Bz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24561Bz extends AbstractC39261pq {
    public final int A00;
    public final InterfaceC219210i A01;
    public final Map A02;
    public final Map A03;

    public C24561Bz(InterfaceC219210i interfaceC219210i, int i) {
        C002701i.A1J(i > 0);
        this.A01 = interfaceC219210i;
        this.A00 = i;
        this.A02 = new HashMap();
        this.A03 = new HashMap();
    }

    @Override // X.AbstractC29941Zc
    public void A02(C12L c12l) {
        ((AbstractC39261pq) this).A01 = c12l;
        ((AbstractC39261pq) this).A00 = new Handler();
        InterfaceC219210i interfaceC219210i = this.A01;
        HashMap hashMap = ((AbstractC39261pq) this).A02;
        C002701i.A1J(!hashMap.containsKey(null));
        InterfaceC219110h interfaceC219110h = new InterfaceC219110h() { // from class: X.1Za
            @Override // X.InterfaceC219110h
            public final void AOn(InterfaceC219210i interfaceC219210i2, AbstractC21230z0 abstractC21230z0, Object obj) {
                AbstractC39261pq.this.A03(null, interfaceC219210i2, abstractC21230z0, obj);
            }
        };
        InterfaceC219710n interfaceC219710n = new InterfaceC219710n() { // from class: X.1Ze
            public C219410k A00;

            {
                this.A00 = new C219410k(AbstractC39261pq.this.A03.A02, 0, null);
            }

            public final C219610m A00(C219610m c219610m) {
                AbstractC39261pq abstractC39261pq = AbstractC39261pq.this;
                long j = c219610m.A04;
                if (abstractC39261pq != null) {
                    long j2 = c219610m.A03;
                    return (j == j && j2 == j2) ? c219610m : new C219610m(c219610m.A00, c219610m.A02, c219610m.A05, c219610m.A01, c219610m.A06, j, j2);
                }
                throw null;
            }

            public final boolean A01(int i, C219010g c219010g) {
                if (c219010g != null) {
                    C24561Bz c24561Bz = (C24561Bz) AbstractC39261pq.this;
                    if (c24561Bz != null) {
                        if (c24561Bz.A00 != Integer.MAX_VALUE && (c219010g = (C219010g) c24561Bz.A02.get(c219010g)) == null) {
                            return false;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    c219010g = null;
                }
                AbstractC39261pq abstractC39261pq = AbstractC39261pq.this;
                if (abstractC39261pq != null) {
                    C219410k c219410k = this.A00;
                    if (c219410k.A00 == i && C08M.A08(c219410k.A01, c219010g)) {
                        return true;
                    }
                    this.A00 = new C219410k(abstractC39261pq.A03.A02, i, c219010g);
                    return true;
                }
                throw null;
            }

            @Override // X.InterfaceC219710n
            public void AJb(int i, C219010g c219010g, C219610m c219610m) {
                if (A01(i, c219010g)) {
                    this.A00.A09(A00(c219610m));
                }
            }

            @Override // X.InterfaceC219710n
            public void ALL(int i, C219010g c219010g, C219510l c219510l, C219610m c219610m) {
                if (A01(i, c219010g)) {
                    this.A00.A05(c219510l, A00(c219610m));
                }
            }

            @Override // X.InterfaceC219710n
            public void ALM(int i, C219010g c219010g, C219510l c219510l, C219610m c219610m) {
                if (A01(i, c219010g)) {
                    this.A00.A06(c219510l, A00(c219610m));
                }
            }

            @Override // X.InterfaceC219710n
            public void ALP(int i, C219010g c219010g, C219510l c219510l, C219610m c219610m, IOException iOException, boolean z) {
                if (A01(i, c219010g)) {
                    this.A00.A08(c219510l, A00(c219610m), iOException, z);
                }
            }

            @Override // X.InterfaceC219710n
            public void ALV(int i, C219010g c219010g, C219510l c219510l, C219610m c219610m) {
                if (A01(i, c219010g)) {
                    this.A00.A07(c219510l, A00(c219610m));
                }
            }

            @Override // X.InterfaceC219710n
            public void ALo(int i, C219010g c219010g) {
                if (A01(i, c219010g)) {
                    this.A00.A02();
                }
            }

            @Override // X.InterfaceC219710n
            public void ALp(int i, C219010g c219010g) {
                if (A01(i, c219010g)) {
                    this.A00.A03();
                }
            }

            @Override // X.InterfaceC219710n
            public void ANb(int i, C219010g c219010g) {
                if (A01(i, c219010g)) {
                    this.A00.A04();
                }
            }
        };
        hashMap.put(null, new C218610b(interfaceC219210i, interfaceC219110h, interfaceC219710n));
        Handler handler = ((AbstractC39261pq) this).A00;
        if (handler != null) {
            interfaceC219210i.A5B(handler, interfaceC219710n);
            interfaceC219210i.AQq(interfaceC219110h, ((AbstractC39261pq) this).A01);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC39261pq
    public void A03(Object obj, InterfaceC219210i interfaceC219210i, final AbstractC21230z0 abstractC21230z0, Object obj2) {
        int i = this.A00;
        A01(i != Integer.MAX_VALUE ? new C39301pu(abstractC21230z0, i) : new AbstractC21230z0(abstractC21230z0) { // from class: X.1pt
            public final AbstractC21230z0 A00;

            {
                this.A00 = abstractC21230z0;
            }

            @Override // X.AbstractC21230z0
            public int A00() {
                return this.A00.A00();
            }

            @Override // X.AbstractC21230z0
            public int A01() {
                return this.A00.A01();
            }

            @Override // X.AbstractC21230z0
            public int A02(int i2, int i3, boolean z) {
                AbstractC21230z0 abstractC21230z02 = this.A00;
                int A02 = abstractC21230z02.A02(i2, i3, z);
                return A02 == -1 ? abstractC21230z02.A05(z) : A02;
            }

            @Override // X.AbstractC21230z0
            public int A04(Object obj3) {
                return this.A00.A04(obj3);
            }

            @Override // X.AbstractC21230z0
            public int A05(boolean z) {
                return this.A00.A05(z);
            }

            @Override // X.AbstractC21230z0
            public int A06(boolean z) {
                return this.A00.A06(z);
            }

            @Override // X.AbstractC21230z0
            public C21210yy A08(int i2, C21210yy c21210yy, boolean z) {
                return this.A00.A08(i2, c21210yy, z);
            }

            @Override // X.AbstractC21230z0
            public C21220yz A0B(int i2, C21220yz c21220yz, boolean z, long j) {
                return this.A00.A0B(i2, c21220yz, z, j);
            }

            @Override // X.AbstractC21230z0
            public Object A0C(int i2) {
                return this.A00.A0C(i2);
            }
        }, obj2);
    }

    @Override // X.InterfaceC219210i
    public InterfaceC30011Zj A6u(C219010g c219010g, AnonymousClass127 anonymousClass127, long j) {
        if (this.A00 == Integer.MAX_VALUE) {
            return this.A01.A6u(c219010g, anonymousClass127, j);
        }
        Object obj = c219010g.A04;
        Object obj2 = ((Pair) obj).second;
        C219010g c219010g2 = obj.equals(obj2) ? c219010g : new C219010g(obj2, c219010g.A00, c219010g.A01, c219010g.A03, c219010g.A02);
        this.A02.put(c219010g2, c219010g);
        InterfaceC30011Zj A6u = this.A01.A6u(c219010g2, anonymousClass127, j);
        this.A03.put(A6u, c219010g2);
        return A6u;
    }

    @Override // X.InterfaceC219210i
    public void ARE(InterfaceC30011Zj interfaceC30011Zj) {
        this.A01.ARE(interfaceC30011Zj);
        Object remove = this.A03.remove(interfaceC30011Zj);
        if (remove != null) {
            this.A02.remove(remove);
        }
    }
}
