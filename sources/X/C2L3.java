package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2L3 */
/* loaded from: classes2.dex */
public class C2L3 {
    public static volatile C2L3 A0H;
    public boolean A00;
    public boolean A01;
    public final AbstractC000600i A05;
    public final C018508q A06;
    public final C02L A07;
    public final C06K A08;
    public final C49462Ko A09;
    public final C2MP A0A;
    public final AnonymousClass272 A0B;
    public final C0E7 A0C;
    public final C05Y A0D;
    public final C0HK A03 = new C0HK();
    public final C0HK A02 = new C0HK();
    public final Map A0G = new HashMap();
    public final List A0E = new ArrayList();
    public final List A0F = new ArrayList();
    public final C0HK A04 = new C0HK(Boolean.FALSE);

    public C2L3(C018508q c018508q, AbstractC000600i abstractC000600i, C02L c02l, C05Y c05y, C2MP c2mp, AnonymousClass272 anonymousClass272, C0E7 c0e7, C06K c06k, C49462Ko c49462Ko) {
        this.A06 = c018508q;
        this.A05 = abstractC000600i;
        this.A07 = c02l;
        this.A0D = c05y;
        this.A0A = c2mp;
        this.A0B = anonymousClass272;
        this.A0C = c0e7;
        this.A09 = c49462Ko;
        this.A08 = c06k;
    }

    public final int A00(UserJid userJid) {
        return (this.A07.A0A(userJid) ? 4 : 1) * 6;
    }

    public void A01(C59962th c59962th, int i) {
        C018508q c018508q = this.A06;
        c018508q.A02.post(new RunnableEBaseShape0S0201000_I0(this, i, c59962th, 1));
    }

    public void A02(C60042tp c60042tp, boolean z) {
        C018508q c018508q = this.A06;
        c018508q.A02.post(new RunnableEBaseShape0S0210000_I0(this, c60042tp, z, 0));
    }

    public void A03(UserJid userJid, int i) {
        Map map;
        boolean z;
        int A00 = A00(userJid);
        AnonymousClass272 anonymousClass272 = this.A0B;
        synchronized (anonymousClass272) {
            map = anonymousClass272.A00;
            z = map.get(userJid) != null;
        }
        if (z) {
            synchronized (anonymousClass272) {
                C29y c29y = (C29y) map.get(userJid);
                if (c29y != null) {
                    c29y.A01 = new C2A1(true, null);
                    int i2 = 0;
                    while (true) {
                        ArrayList arrayList = c29y.A03;
                        if (i2 >= arrayList.size() - A00) {
                            break;
                        }
                        int size = arrayList.size() - 1;
                        String str = ((C468628o) arrayList.get(size)).A09;
                        anonymousClass272.A02.remove(str);
                        anonymousClass272.A01.remove(str);
                        arrayList.remove(size);
                        i2++;
                    }
                }
            }
            C2MP c2mp = this.A0A;
            C000700j.A01();
            Iterator it = c2mp.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC04750Lr) c0g5.next()).AKG(userJid);
                } else {
                    A05(userJid, i, A00 << 1);
                    return;
                }
            }
        } else {
            A05(userJid, i, A00);
        }
    }

    public final void A04(UserJid userJid, int i, int i2) {
        AnonymousClass272 anonymousClass272 = this.A0B;
        C2A1 A03 = anonymousClass272.A03(userJid);
        String str = A03 == null ? null : A03.A00;
        C2A1 A032 = anonymousClass272.A03(userJid);
        if ((A032 == null || A032.A01) && !this.A00) {
            this.A00 = true;
            C645833x c645833x = new C645833x(this.A0D, new C56312n4(new C2U0()), this.A0C, new C56292n2(i, i, i2, this.A09.A00, userJid, C04260Jm.A00, str), new C33A(new AnonymousClass339(this, str, userJid)));
            if (!c645833x.A03.A05()) {
                c645833x.A00.A00(-1);
                return;
            }
            C05Y c05y = c645833x.A04;
            String A02 = c05y.A02();
            C56292n2 c56292n2 = c645833x.A01;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C02590Ca("width", (C04P[]) null, Integer.toString(c56292n2.A03)));
            arrayList.add(new C02590Ca("height", (C04P[]) null, Integer.toString(c56292n2.A01)));
            String str2 = c56292n2.A06;
            if (str2 != null) {
                C000200d.A1B("after", str2, arrayList);
            }
            String str3 = c56292n2.A07;
            if (str3 != null) {
                C000200d.A1B("catalog_session_id", str3, arrayList);
            }
            arrayList.add(new C02590Ca("collection_limit", (C04P[]) null, Integer.toString(c56292n2.A00)));
            arrayList.add(new C02590Ca("item_limit", (C04P[]) null, Integer.toString(c56292n2.A02)));
            c05y.A07(271, A02, new C02590Ca("iq", new C04P[]{new C04P("to", c56292n2.A04), new C04P("id", A02, null, (byte) 0), new C04P("smax_id", "35", null, (byte) 0), new C04P("xmlns", "w:biz:catalog", null, (byte) 0), new C04P("type", "get", null, (byte) 0)}, new C02590Ca("collections", new C04P[]{new C04P("biz_jid", c56292n2.A05), new C04P("empty_collection", String.valueOf(false), null, (byte) 0)}, (C02590Ca[]) arrayList.toArray(new C02590Ca[0]), null)), c645833x, 32000L);
        }
    }

    public final void A05(UserJid userJid, int i, int i2) {
        boolean z;
        AnonymousClass272 anonymousClass272 = this.A0B;
        C2A1 A04 = anonymousClass272.A04(userJid);
        String str = A04 == null ? null : A04.A00;
        C2A1 A042 = anonymousClass272.A04(userJid);
        if ((A042 == null || A042.A01) && !this.A01) {
            this.A01 = true;
            C59962th c59962th = new C59962th(userJid, str, i2, i, i, this.A09.A00);
            AnonymousClass338 anonymousClass338 = new AnonymousClass338(this, str, userJid);
            C33L c33l = new C33L(this.A05, this.A0D, new C2U0(), this, c59962th, this.A0C, this.A08);
            if (c33l.A04.A05()) {
                C05Y c05y = c33l.A06;
                String A02 = c05y.A02();
                C59962th c59962th2 = c33l.A05;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C02590Ca("limit", (C04P[]) null, Integer.toString(c59962th2.A00)));
                arrayList.add(new C02590Ca("width", (C04P[]) null, Integer.toString(c59962th2.A02)));
                arrayList.add(new C02590Ca("height", (C04P[]) null, Integer.toString(c59962th2.A01)));
                String str2 = c59962th2.A04;
                if (str2 != null) {
                    C000200d.A1B("after", str2, arrayList);
                }
                String str3 = c59962th2.A05;
                if (str3 != null) {
                    C000200d.A1B("catalog_session_id", str3, arrayList);
                }
                c05y.A07(164, A02, new C02590Ca("iq", new C04P[]{new C04P("id", A02, null, (byte) 0), new C04P("xmlns", "w:biz:catalog", null, (byte) 0), new C04P("type", "get", null, (byte) 0)}, new C02590Ca("product_catalog", new C04P[]{new C04P("jid", c59962th2.A03)}, (C02590Ca[]) arrayList.toArray(new C02590Ca[0]), null)), c33l, 32000L);
                z = true;
            } else {
                z = false;
            }
            StringBuilder A0P = C000200d.A0P("app/sendGetBizProductCatalog jid=");
            A0P.append(c33l.A05.A03);
            A0P.append(" success:");
            A0P.append(z);
            Log.i(A0P.toString());
            if (z) {
                this.A0G.put(c59962th, anonymousClass338);
            } else {
                anonymousClass338.A00(-1);
            }
        }
    }

    public final void A06(UserJid userJid, String str, int i, int i2) {
        AnonymousClass272 anonymousClass272 = this.A0B;
        C2A1 A05 = anonymousClass272.A05(userJid, str);
        String str2 = A05 == null ? null : A05.A00;
        C2A1 A052 = anonymousClass272.A05(userJid, str);
        if (A052 == null || A052.A01) {
            C0HK c0hk = this.A04;
            if (c0hk.A01() == null || !((Boolean) c0hk.A01()).booleanValue()) {
                c0hk.A0B(Boolean.TRUE);
                C645733w c645733w = new C645733w(this.A0D, this.A0C, new C56312n4(new C2U0()), new C56302n3(str, userJid, i2, i, i, this.A09.A00, str2), new C33C(new C33B(this, str2, userJid, str)));
                if (!c645733w.A03.A05()) {
                    c645733w.A00.A00(-1);
                    return;
                }
                C05Y c05y = c645733w.A04;
                String A02 = c05y.A02();
                ArrayList arrayList = new ArrayList();
                C56302n3 c56302n3 = c645733w.A01;
                arrayList.add(new C02590Ca("limit", (C04P[]) null, Integer.toString(c56302n3.A01)));
                arrayList.add(new C02590Ca("width", (C04P[]) null, Integer.toString(c56302n3.A02)));
                arrayList.add(new C02590Ca("height", (C04P[]) null, Integer.toString(c56302n3.A00)));
                String str3 = c56302n3.A06;
                if (str3 != null) {
                    C000200d.A1B("catalog_session_id", str3, arrayList);
                }
                String str4 = c56302n3.A04;
                if (str4 != null) {
                    C000200d.A1B("after", str4, arrayList);
                }
                UserJid userJid2 = c56302n3.A03;
                c05y.A07(270, A02, new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("id", A02, null, (byte) 0), new C04P("smax_id", "30", null, (byte) 0), new C04P("xmlns", "w:biz:catalog", null, (byte) 0), new C04P("type", "get", null, (byte) 0)}, new C02590Ca("collection", new C04P[]{new C04P("id", c56302n3.A05, null, (byte) 0), new C04P("biz_jid", userJid2)}, (C02590Ca[]) arrayList.toArray(new C02590Ca[0]), null)), c645733w, 32000L);
                StringBuilder A0P = C000200d.A0P("app/sendGetCollectionProductList jid=");
                A0P.append(userJid2);
                A0P.append(" success");
                Log.i(A0P.toString());
            }
        }
    }

    public boolean A07(C60052tq c60052tq) {
        C33J c33j = new C33J(this.A0D, this, c60052tq, this.A0B, this.A0C, this.A08, new C2U0());
        boolean z = false;
        if (c33j.A04.A05()) {
            C05Y c05y = c33j.A06;
            String A02 = c05y.A02();
            C60052tq c60052tq2 = c33j.A05;
            String str = c60052tq2.A03;
            C000700j.A09(!TextUtils.isEmpty(str), "catalog productId cannot be null or empty");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C02590Ca("product_id", (C04P[]) null, str));
            Integer num = c60052tq2.A02;
            if (num != null) {
                arrayList.add(new C02590Ca("width", (C04P[]) null, num.toString()));
            }
            Integer num2 = c60052tq2.A01;
            if (num2 != null) {
                arrayList.add(new C02590Ca("height", (C04P[]) null, num2.toString()));
            }
            arrayList.add(new C02590Ca("catalog_session_id", (C04P[]) null, c60052tq2.A04));
            c05y.A07(196, A02, new C02590Ca("iq", new C04P[]{new C04P("id", A02, null, (byte) 0), new C04P("xmlns", "w:biz:catalog", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("to", C04260Jm.A00)}, new C02590Ca("product", new C04P[]{new C04P("jid", c60052tq2.A00)}, (C02590Ca[]) arrayList.toArray(new C02590Ca[0]), null)), c33j, 32000L);
            z = true;
        }
        StringBuilder A0P = C000200d.A0P("app/send-get-biz-product productId=");
        A0P.append(c33j.A05.A03);
        A0P.append(" success:");
        A0P.append(z);
        Log.i(A0P.toString());
        return z;
    }
}
