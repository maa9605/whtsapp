package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1uE */
/* loaded from: classes2.dex */
public class C41611uE {
    public static volatile C41611uE A08;
    public final AbstractC000600i A00;
    public final C018508q A01;
    public final C06K A02;
    public final AnonymousClass272 A03;
    public final C50942Ty A04;
    public final C0E7 A05;
    public final C05Y A06;
    public final Map A07 = new HashMap();

    public C41611uE(C003701t c003701t, C018508q c018508q, AbstractC000600i abstractC000600i, C001200o c001200o, C05Y c05y, AnonymousClass272 anonymousClass272, C0E7 c0e7, C06K c06k) {
        this.A01 = c018508q;
        this.A00 = abstractC000600i;
        this.A06 = c05y;
        this.A05 = c0e7;
        this.A03 = anonymousClass272;
        this.A02 = c06k;
        this.A04 = new C50942Ty(c003701t, c001200o);
    }

    public static C41611uE A00() {
        if (A08 == null) {
            synchronized (C41611uE.class) {
                if (A08 == null) {
                    A08 = new C41611uE(C003701t.A00(), C018508q.A00(), AbstractC000600i.A00(), C001200o.A01, C05Y.A01(), AnonymousClass272.A00(), C0E7.A00(), C06K.A00());
                }
            }
        }
        return A08;
    }

    public void A01(C50952Tz c50952Tz) {
        C49392Kd c49392Kd;
        float f;
        float f2;
        Map map = this.A07;
        C49392Kd c49392Kd2 = (C49392Kd) map.get(c50952Tz);
        if (c49392Kd2 == null) {
            c49392Kd2 = new C49392Kd(this.A01, c50952Tz, this.A03, this.A04);
            map.put(c50952Tz, c49392Kd2);
        }
        if (c49392Kd2.A00 < c49392Kd2.A06.A03.size()) {
            C2U1 c2u1 = new C2U1(this.A06, c49392Kd2, this.A05, this.A02, new C2U0(1), this.A00);
            c49392Kd2.A01(new C2U2(0));
            if (c2u1.A04.A05()) {
                C05Y c05y = c2u1.A05;
                String A02 = c05y.A02();
                c49392Kd = c2u1.A02;
                ArrayList arrayList = new ArrayList();
                C50942Ty c50942Ty = c49392Kd.A05;
                C50952Tz c50952Tz2 = c49392Kd.A06;
                List list = c50952Tz2.A03;
                int size = list.size();
                boolean z = c49392Kd.A00 == 0;
                int ceil = c50942Ty.A01.A00.getResources().getDisplayMetrics().heightPixels < c50942Ty.A00 ? 1 : (int) Math.ceil(f / f2);
                if (!z || size >= ceil * 3) {
                    size = ceil << 1;
                }
                int min = Math.min(c50942Ty.A02.A03(464), size);
                List<String> subList = list.subList(c49392Kd.A00, Math.min(list.size(), c49392Kd.A00 + min));
                c49392Kd.A00 += min;
                for (String str : subList) {
                    arrayList.add(new C02590Ca("product", (C04P[]) null, new C02590Ca("id", (C04P[]) null, str)));
                }
                arrayList.add(new C02590Ca("width", (C04P[]) null, c50952Tz2.A02));
                arrayList.add(new C02590Ca("height", (C04P[]) null, c50952Tz2.A01));
                c05y.A07(164, A02, new C02590Ca("iq", new C04P[]{new C04P("id", A02, null, (byte) 0), new C04P("xmlns", "w:biz:catalog", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("smax_id", "21", null, (byte) 0), new C04P("to", C04260Jm.A00)}, new C02590Ca("product_list", new C04P[]{new C04P("jid", c50952Tz2.A00)}, (C02590Ca[]) arrayList.toArray(new C02590Ca[0]), null)), c2u1, 32000L);
            } else {
                c49392Kd = c2u1.A02;
                c49392Kd.A01(new C2U2(6));
            }
            C000200d.A1J(C000200d.A0P("app/sendGetBizProductList jid="), c49392Kd.A06.A00);
            return;
        }
        c49392Kd2.A01(new C2U2(5));
    }

    public void A02(C50952Tz c50952Tz, C0HK c0hk) {
        Map map = this.A07;
        C49392Kd c49392Kd = (C49392Kd) map.get(c50952Tz);
        if (c49392Kd == null) {
            c49392Kd = new C49392Kd(this.A01, c50952Tz, this.A03, this.A04);
            map.put(c50952Tz, c49392Kd);
        }
        c49392Kd.A02 = c0hk;
        C2U2 c2u2 = new C2U2(4);
        c2u2.A01 = c49392Kd.A00();
        c49392Kd.A02.A0B(c2u2);
    }
}
