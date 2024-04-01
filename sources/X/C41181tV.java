package X;

import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1tV */
/* loaded from: classes2.dex */
public class C41181tV {
    public static volatile C41181tV A0J;
    public final C018508q A00;
    public final C01B A01;
    public final C41541u6 A02;
    public final C0FO A03;
    public final C000500h A04;
    public final C06T A05;
    public final C05A A06;
    public final C05M A07;
    public final C0CA A08;
    public final C0EO A09;
    public final C44271yn A0A;
    public final C05N A0B;
    public final C05E A0C;
    public final C05O A0D;
    public final C05L A0E;
    public final C0FP A0F;
    public final C03300Fd A0G;
    public final C41521u3 A0H;
    public final C0CB A0I;

    public C41181tV(C018508q c018508q, C05A c05a, C05M c05m, C05O c05o, C01B c01b, C41541u6 c41541u6, C0FO c0fo, C0EO c0eo, C41521u3 c41521u3, C03300Fd c03300Fd, C0CB c0cb, C05L c05l, C06T c06t, C05E c05e, C000500h c000500h, C0CA c0ca, C44271yn c44271yn, C05N c05n, C0FP c0fp) {
        this.A00 = c018508q;
        this.A06 = c05a;
        this.A07 = c05m;
        this.A0D = c05o;
        this.A01 = c01b;
        this.A02 = c41541u6;
        this.A03 = c0fo;
        this.A09 = c0eo;
        this.A0H = c41521u3;
        this.A0G = c03300Fd;
        this.A0I = c0cb;
        this.A0E = c05l;
        this.A05 = c06t;
        this.A0C = c05e;
        this.A04 = c000500h;
        this.A08 = c0ca;
        this.A0A = c44271yn;
        this.A0B = c05n;
        this.A0F = c0fp;
    }

    public static C41181tV A00() {
        if (A0J == null) {
            synchronized (C41181tV.class) {
                if (A0J == null) {
                    A0J = new C41181tV(C018508q.A00(), C05A.A00(), C05M.A00(), C05O.A00(), C01B.A00(), C41541u6.A00(), C0FO.A00(), C0EO.A00(), C41521u3.A00(), C03300Fd.A00(), C0CB.A00(), C05L.A00(), C06T.A02, C05E.A00(), C000500h.A00(), C0CA.A00(), C44271yn.A00(), C05N.A00(), C0FP.A00());
                }
            }
        }
        return A0J;
    }

    public Long A01(AbstractC005302j abstractC005302j) {
        C41541u6 c41541u6 = this.A02;
        Set A0F = c41541u6.A0F(abstractC005302j, false);
        Long A0B = this.A0I.A0B(abstractC005302j, false, 0L);
        if (A0B == null) {
            c41541u6.A0U(A0F);
            return A0B;
        }
        c41541u6.A0V(A0F);
        this.A0H.A0D(new C03950Hv(abstractC005302j, 12, 0L, 0L, 0L, null), 0);
        return A0B;
    }

    public HashMap A02(List list) {
        Set A0F = this.A0I.A0F();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
            if (!C003101m.A0a(abstractC005302j)) {
                A05(abstractC005302j, true);
                this.A0H.A01(3, abstractC005302j, 0L, 0);
            }
        }
        HashMap hashMap = new HashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC005302j abstractC005302j2 = (AbstractC005302j) it2.next();
            if (!C003101m.A0a(abstractC005302j2) && ((AbstractCollection) A0F).contains(abstractC005302j2)) {
                hashMap.put(abstractC005302j2, A01(abstractC005302j2));
            }
        }
        return hashMap;
    }

    public void A03(AbstractC005302j abstractC005302j) {
        C0IT A07 = this.A07.A07(abstractC005302j);
        if (A07 == null) {
            C000200d.A0w("msgstore/reset-show-group-description/no chat ", abstractC005302j);
        } else if (!A07.A0T) {
            C000200d.A0v("msgstore/reset-show-group-description/nop ", abstractC005302j);
        } else {
            A07.A0T = false;
            this.A05.A01(new RunnableEBaseShape1S0200000_I0_1(this, A07, 36), 5);
        }
    }

    public final void A04(AbstractC005302j abstractC005302j, AnonymousClass092 anonymousClass092, int i, int i2, boolean z) {
        int A01;
        C0IT A07 = this.A07.A07(abstractC005302j);
        if (A07 == null) {
            StringBuilder A0T = C000200d.A0T("msgstore/setchatseen/nochat/", abstractC005302j, "/");
            A0T.append(anonymousClass092 != null ? anonymousClass092.A0n : null);
            Log.i(A0T.toString());
            return;
        }
        StringBuilder A0T2 = C000200d.A0T("msgstore/setchatseen/", abstractC005302j, "/");
        A0T2.append(A07.A0H());
        A0T2.append("/");
        A0T2.append(anonymousClass092 != null ? anonymousClass092.A0n : null);
        A0T2.append("/");
        A0T2.append(i);
        Log.i(A0T2.toString());
        int i3 = 0;
        boolean z2 = A07.A04 == -1;
        if (anonymousClass092 == null) {
            A01 = 0;
        } else {
            C05O c05o = this.A0D;
            AbstractC005302j abstractC005302j2 = anonymousClass092.A0n.A00;
            if (abstractC005302j2 != null) {
                A01 = c05o.A01(abstractC005302j2, anonymousClass092.A0p);
                C44271yn c44271yn = this.A0A;
                if (abstractC005302j2 != null) {
                    i3 = c44271yn.A01(abstractC005302j2, anonymousClass092.A0p);
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        boolean A0J2 = A07.A0J(i, i2, A01, i3);
        long A02 = C0DB.A02(anonymousClass092);
        long j = A07.A0H;
        if (A02 == 1) {
            A02 = Math.max(A07.A0G, A07.A0J);
        }
        if (j < A02 || A0J2 || A07.A0G == 0) {
            if (A07.A0G == 0) {
                A07.A0G = this.A0D.A07(A07.A0U);
                A07.A0O = null;
            }
            if (A07.A0F != 1) {
                A07.A0F = 1L;
            }
            A07.A0H = A02;
            this.A05.A01(new RunnableC59902tb(this, z, z2, abstractC005302j, A07), 2);
        }
    }

    public void A05(AbstractC005302j abstractC005302j, boolean z) {
        if (z) {
            this.A0G.A01(3, abstractC005302j);
        }
        C0IT A07 = this.A07.A07(abstractC005302j);
        if (A07 == null) {
            StringBuilder sb = new StringBuilder("msgstore/archive/no chat ");
            sb.append(abstractC005302j);
            sb.append(" ");
            sb.append(z);
            Log.w(sb.toString());
        } else if (A07.A0S == z) {
            StringBuilder sb2 = new StringBuilder("msgstore/archive/nop ");
            sb2.append(abstractC005302j);
            sb2.append(" ");
            sb2.append(z);
            Log.w(sb2.toString());
        } else {
            A06(z);
            A07.A0S = z;
            this.A03.A01();
            this.A05.A01(new RunnableEBaseShape0S0210000_I0(this, A07, z, 3), 3);
        }
    }

    public final void A06(boolean z) {
        if (z && this.A08.A02() == 0 && this.A01.A0E(C01C.A0j)) {
            C000500h c000500h = this.A04;
            if (c000500h.A00.getBoolean("archive_v2_enabled", false)) {
                return;
            }
            Log.i("chatMAnager/setChatArchived/Enabling archive2.0");
            C000200d.A0j(c000500h, "archive_v2_enabled", true);
        }
    }

    public final void A07(boolean z) {
        boolean z2;
        synchronized (this.A0B) {
            C05M c05m = this.A07;
            synchronized (c05m) {
                z2 = c05m.A00;
            }
            if (z2) {
                return;
            }
            C0JT c0jt = new C0JT(this);
            synchronized (c05m) {
                c05m.A0C();
                C000700j.A07(c05m.A02 == null);
                c05m.A02 = c0jt;
                if (!z) {
                    c05m.A0C();
                }
            }
        }
    }

    public boolean A08(AbstractC005302j abstractC005302j) {
        C0IT A07 = this.A07.A07(abstractC005302j);
        if (A07 != null) {
            return (A07.A04 == 0 && A07.A05 == 0 && A07.A0H == Math.max(A07.A0G, A07.A0J)) ? false : true;
        }
        return false;
    }
}
