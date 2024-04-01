package X;

import android.app.Application;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Ly  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2Ly implements InterfaceC06800Vb {
    public static volatile C2Ly A07;
    public final C018508q A03;
    public final C02L A04;
    public final C0DV A05;
    public final C28O A06;
    public HashSet A01 = new HashSet();
    public HashSet A00 = new HashSet();
    public List A02 = new ArrayList();

    public C2Ly(C018508q c018508q, C02L c02l, C0DV c0dv, C28O c28o) {
        this.A03 = c018508q;
        this.A04 = c02l;
        this.A05 = c0dv;
        this.A06 = c28o;
    }

    public static C2Ly A00() {
        if (A07 == null) {
            synchronized (C2Ly.class) {
                if (A07 == null) {
                    A07 = new C2Ly(C018508q.A00(), C02L.A00(), C0DV.A00(), C28O.A00());
                }
            }
        }
        return A07;
    }

    public static void A01(C2Ly c2Ly, String str, C2OV c2ov) {
        c2Ly.A00.add(str);
        c2Ly.A01.remove(str);
        if (c2ov != null) {
            c2ov.AJB(str);
        }
        int size = c2Ly.A02.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((Reference) c2Ly.A02.get(size)).get() == null) {
                c2Ly.A02.remove(size);
            }
        }
        for (Reference reference : c2Ly.A02) {
            C2OV c2ov2 = (C2OV) reference.get();
            if (c2ov2 != null) {
                c2ov2.AJB(str);
            }
        }
    }

    public void A02() {
        C0DV c0dv = this.A05;
        c0dv.A04();
        List A0Y = c0dv.A07.A0Y(-1, new Integer[]{0}, new Integer[]{Integer.valueOf((int) SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)});
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((AbstractCollection) A0Y).iterator();
        while (it.hasNext()) {
            AnonymousClass093 anonymousClass093 = (AnonymousClass093) it.next();
            C02L c02l = this.A04;
            if (!c02l.A0A(anonymousClass093.A0B) && !c02l.A0A(anonymousClass093.A0C)) {
                AnonymousClass094 anonymousClass094 = new AnonymousClass094(anonymousClass093.A0A, anonymousClass093.A0O, anonymousClass093.A0J);
                if (anonymousClass094.A00 != null && anonymousClass094.A01 != null) {
                    arrayList2.add(new C0FK(anonymousClass093, anonymousClass094));
                }
            } else {
                arrayList.add(anonymousClass093);
            }
        }
        this.A03.A02.post(new RunnableEBaseShape0S0300000_I0_0(this, arrayList, arrayList2, 35));
    }

    public void A03(C2OV c2ov) {
        this.A02.add(new WeakReference(c2ov));
    }

    public void A04(C2OV c2ov) {
        for (int size = this.A02.size() - 1; size >= 0; size--) {
            Object obj = ((Reference) this.A02.get(size)).get();
            if (obj == null || obj == c2ov) {
                this.A02.remove(size);
            }
        }
    }

    public final void A05(final String str, final AnonymousClass094 anonymousClass094) {
        if (TextUtils.isEmpty(str) || anonymousClass094 == null) {
            return;
        }
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (!C003101m.A0U(abstractC005302j) || this.A01.contains(str) || this.A00.contains(str)) {
            return;
        }
        this.A01.add(str);
        final C28O c28o = this.A06;
        final InterfaceC03640Gm interfaceC03640Gm = new InterfaceC03640Gm() { // from class: X.3iB
            @Override // X.InterfaceC03640Gm
            public void ANw(C28Q c28q) {
                C2Ly.A01(C2Ly.this, str, null);
            }

            @Override // X.InterfaceC03640Gm
            public void AO1(C28Q c28q) {
                C2Ly.A01(C2Ly.this, str, null);
            }

            @Override // X.InterfaceC03640Gm
            public void AO2(C468228k c468228k) {
                C2Ly c2Ly = C2Ly.this;
                String str2 = str;
                c2Ly.A00.remove(str2);
                c2Ly.A01.remove(str2);
            }
        };
        if (c28o != null) {
            C02590Ca c02590Ca = new C02590Ca("account", new C04P[]{new C04P("action", "get-missing-group-transaction-details", null, (byte) 0), new C04P("id", str, null, (byte) 0), new C04P("group", abstractC005302j)}, null, null);
            C463026g c463026g = c28o.A08;
            final Application application = c28o.A02.A00;
            final C018508q c018508q = c28o.A00;
            final C0E7 c0e7 = c28o.A01;
            final C28S c28s = c28o.A05;
            c463026g.A0F("get", c02590Ca, new C28V(application, c018508q, c0e7, c28s) { // from class: X.3w2
                @Override // X.C28V
                public void A02(C28Q c28q) {
                    InterfaceC03640Gm interfaceC03640Gm2 = interfaceC03640Gm;
                    if (interfaceC03640Gm2 != null) {
                        interfaceC03640Gm2.ANw(c28q);
                    }
                }

                @Override // X.C28V
                public void A03(C28Q c28q) {
                    InterfaceC03640Gm interfaceC03640Gm2 = interfaceC03640Gm;
                    if (interfaceC03640Gm2 != null) {
                        interfaceC03640Gm2.AO1(c28q);
                    }
                }

                @Override // X.C28V
                public void A04(C02590Ca c02590Ca2) {
                    C014006r c014006r;
                    AnonymousClass093 anonymousClass093;
                    try {
                        C02590Ca A0E = c02590Ca2.A0E("account").A0E("pay");
                        String A0G = A0E.A0G("currency");
                        String A0G2 = A0E.A0G("amount");
                        InterfaceC013706o A01 = C013606n.A01(A0G);
                        if (!TextUtils.isEmpty(A0G2)) {
                            c014006r = C014006r.A00(A0G2, A01.A9i());
                        } else {
                            c014006r = null;
                        }
                        C0C9 c0c9 = C28O.this.A03;
                        AnonymousClass092 A0F = c0c9.A0F(anonymousClass094);
                        if (A0F != null && (anonymousClass093 = A0F.A0F) != null) {
                            AnonymousClass093 A02 = AnonymousClass093.A02(3, 0, anonymousClass093.A0C, anonymousClass093.A0B, A0G, c014006r, C013606n.A01(A0G), anonymousClass093.A04, null, anonymousClass093.A0E, anonymousClass093.A03, anonymousClass093.A00);
                            A02.A0G(A0F.A0F.A0I);
                            c0c9.A0P(A0F.A0n, A02);
                            InterfaceC03640Gm interfaceC03640Gm2 = interfaceC03640Gm;
                            if (interfaceC03640Gm2 != null) {
                                interfaceC03640Gm2.AO2(new C468228k());
                                return;
                            }
                            return;
                        }
                        C28Q c28q = new C28Q();
                        InterfaceC03640Gm interfaceC03640Gm3 = interfaceC03640Gm;
                        if (interfaceC03640Gm3 != null) {
                            interfaceC03640Gm3.AO1(c28q);
                        }
                    } catch (C0L4 unused) {
                        C28Q c28q2 = new C28Q();
                        InterfaceC03640Gm interfaceC03640Gm4 = interfaceC03640Gm;
                        if (interfaceC03640Gm4 != null) {
                            interfaceC03640Gm4.AO1(c28q2);
                        }
                    }
                }
            }, 0L);
            return;
        }
        throw null;
    }

    public void A06(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass093 anonymousClass093 = (AnonymousClass093) it.next();
            if (anonymousClass093.A02 == 1000 && !TextUtils.isEmpty(anonymousClass093.A0I)) {
                arrayList.add(anonymousClass093.A0I);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        A07(arrayList, null);
    }

    public final void A07(List list, final C2OV c2ov) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final String str = (String) it.next();
            if (!this.A01.contains(str) && !this.A00.contains(str)) {
                this.A01.add(str);
                this.A06.A02(str, true, new InterfaceC03640Gm() { // from class: X.3iA
                    @Override // X.InterfaceC03640Gm
                    public void ANw(C28Q c28q) {
                        C2Ly.A01(C2Ly.this, str, c2ov);
                    }

                    @Override // X.InterfaceC03640Gm
                    public void AO1(C28Q c28q) {
                        C2Ly.A01(C2Ly.this, str, c2ov);
                    }

                    @Override // X.InterfaceC03640Gm
                    public void AO2(C468228k c468228k) {
                        C2Ly c2Ly = C2Ly.this;
                        String str2 = str;
                        c2Ly.A00.remove(str2);
                        c2Ly.A01.remove(str2);
                    }
                });
            }
        }
    }

    public boolean A08(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.A00.contains(str);
    }

    @Override // X.InterfaceC06800Vb
    public void AN9(AnonymousClass092 anonymousClass092) {
        AnonymousClass093 anonymousClass093;
        if (anonymousClass092 == null || (anonymousClass093 = anonymousClass092.A0F) == null || anonymousClass093.A02 != 1000) {
            return;
        }
        C02L c02l = this.A04;
        if (!c02l.A0A(anonymousClass093.A0B) && !c02l.A0A(anonymousClass092.A0F.A0C)) {
            A05(anonymousClass092.A0F.A0I, anonymousClass092.A0n);
            return;
        }
        String str = anonymousClass092.A0F.A0I;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        A07(arrayList, null);
    }
}
