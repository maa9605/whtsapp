package X;

import com.whatsapp.jid.Jid;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2ah  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52422ah {
    public C0IU A00;
    public final C018708s A04;
    public final C0DK A05;
    public final C0CA A06;
    public final C04880Mg A02 = new C04880Mg();
    public final C04880Mg A01 = new C04880Mg();
    public final C0HK A03 = new C0HK();

    public C52422ah(C2M6 c2m6, C018708s c018708s, C002301c c002301c, C0CA c0ca, C0DK c0dk, C0HL c0hl, C0HL c0hl2, C0HL c0hl3) {
        this.A04 = c018708s;
        this.A06 = c0ca;
        this.A05 = c0dk;
        this.A00 = new C0IU(c002301c);
        c2m6.A00(this.A01, this.A02, new InterfaceC04240Jk() { // from class: X.2ar
            @Override // X.InterfaceC04240Jk
            public final Object A5S(Object obj) {
                Integer num;
                C52422ah c52422ah = C52422ah.this;
                C2IH c2ih = (C2IH) obj;
                C0HK c0hk = c52422ah.A03;
                c0hk.A0A(Boolean.TRUE);
                C0IU c0iu = (C0IU) c2ih.A01;
                C0HE c0he = c2ih.A00;
                StringBuilder A0P = C000200d.A0P("ContactSearchManager/getForContactsQuery/");
                A0P.append(c0iu.A02().length());
                C0HC c0hc = new C0HC(A0P.toString());
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        c0he.A02();
                        num = 0;
                    } catch (C0S2 unused) {
                        c0hc.A02("cancelled");
                    }
                    if (num.equals(Integer.valueOf(c0iu.A02)) && c0iu.A04 == null && c0iu.A06()) {
                        C0DK c0dk2 = c52422ah.A05;
                        List singletonList = Collections.singletonList(new C52502aq(c0dk2, c52422ah.A04, c0iu.A04()));
                        c0hc.A02("filter");
                        c0he.A02();
                        for (C06C c06c : c0dk2.A03()) {
                            c0he.A02();
                            if (c06c.A08 != null) {
                                if (((AbstractCollection) c52422ah.A06.A0B()).contains(c06c.A03(AbstractC005302j.class))) {
                                    continue;
                                } else {
                                    Jid A03 = c06c.A03(AbstractC005302j.class);
                                    if (A03 != null) {
                                        if (C0DK.A01(singletonList, (AbstractC005302j) A03)) {
                                            arrayList.add(c06c);
                                        }
                                    } else {
                                        throw null;
                                    }
                                }
                            }
                        }
                        c0hc.A02("done");
                        c0hk.A0A(Boolean.FALSE);
                        return arrayList;
                    }
                    c0hc.A02("empty");
                    c0hk.A0A(Boolean.FALSE);
                    return arrayList;
                } finally {
                    c0hc.A01();
                }
            }
        });
        this.A02.A0C(c0hl, new InterfaceC05620Pl() { // from class: X.3n0
            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                C52422ah c52422ah = C52422ah.this;
                C0IU c0iu = c52422ah.A00;
                c0iu.A08 = (String) obj;
                c0iu.A03 = null;
                c52422ah.A02.A0B(c0iu);
            }
        });
        this.A02.A0C(c0hl2, new InterfaceC05620Pl() { // from class: X.3n2
            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                C52422ah c52422ah = C52422ah.this;
                C0IU c0iu = c52422ah.A00;
                c0iu.A02 = ((Number) obj).intValue();
                c52422ah.A02.A0B(c0iu);
            }
        });
        this.A02.A0C(c0hl3, new InterfaceC05620Pl() { // from class: X.3n1
            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                C52422ah c52422ah = C52422ah.this;
                C0IU c0iu = c52422ah.A00;
                c0iu.A04 = (AbstractC005302j) obj;
                c52422ah.A02.A0B(c0iu);
            }
        });
    }
}
