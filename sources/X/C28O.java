package X;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.28O */
/* loaded from: classes2.dex */
public class C28O {
    public static volatile C28O A0B;
    public final C018508q A00;
    public final C0E7 A01;
    public final C001200o A02;
    public final C0C9 A03;
    public final C013606n A04;
    public final C28S A05;
    public final C0EU A06;
    public final C0EX A07;
    public final C463026g A08;
    public final C0DV A09;
    public final C0KR A0A;

    public C28O(C018508q c018508q, C001200o c001200o, C0DV c0dv, C0C9 c0c9, C0EU c0eu, C0KR c0kr, C0E7 c0e7, C463026g c463026g, C013606n c013606n, C28S c28s, C0EX c0ex) {
        this.A00 = c018508q;
        this.A02 = c001200o;
        this.A09 = c0dv;
        this.A03 = c0c9;
        this.A06 = c0eu;
        this.A0A = c0kr;
        this.A01 = c0e7;
        this.A08 = c463026g;
        this.A04 = c013606n;
        this.A05 = c28s;
        this.A07 = c0ex;
    }

    public static C28O A00() {
        if (A0B == null) {
            synchronized (C28O.class) {
                if (A0B == null) {
                    A0B = new C28O(C018508q.A00(), C001200o.A01, C0DV.A00(), C0C9.A00(), C0EU.A00(), C0KR.A00(), C0E7.A00(), C463026g.A00(), C013606n.A03(), C28S.A00(), C0EX.A00);
                }
            }
        }
        return A0B;
    }

    public void A01(String str, InterfaceC03640Gm interfaceC03640Gm) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C04P("action", "get-transactions", null, (byte) 0));
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new C04P("after", str, null, (byte) 0));
        }
        C02590Ca c02590Ca = new C02590Ca("account", (C04P[]) arrayList.toArray(new C04P[0]), null, null);
        C28T AA9 = this.A09.A03().AA9();
        if (AA9 != null) {
            AA9.AV3();
        }
        this.A08.A0F("get", c02590Ca, new C28U(this, this.A02.A00, this.A00, this.A01, this.A05, true, interfaceC03640Gm), 0L);
    }

    public void A02(String str, boolean z, InterfaceC03640Gm interfaceC03640Gm) {
        C04P[] c04pArr = new C04P[3];
        c04pArr[0] = new C04P("action", "get-transaction", null, (byte) 0);
        c04pArr[1] = new C04P("id", str, null, (byte) 0);
        c04pArr[2] = new C04P("version", z ? 1 : 2);
        this.A08.A0F("get", new C02590Ca("account", c04pArr, null, null), new C28U(this, this.A02.A00, this.A00, this.A01, this.A05, false, interfaceC03640Gm), 0L);
    }
}
