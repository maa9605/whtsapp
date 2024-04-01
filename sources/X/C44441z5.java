package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.1z5 */
/* loaded from: classes2.dex */
public final class C44441z5 implements InterfaceC010405f {
    public static volatile C44441z5 A0B;
    public Runnable A00;
    public final C02L A01;
    public final C01B A02;
    public final C44471z8 A03;
    public final C44331yt A04;
    public final C42961wc A05;
    public final AnonymousClass012 A06;
    public final C44501zB A07 = new C20P(this);
    public final C41711uO A08;
    public final C05Y A09;
    public final InterfaceC002901k A0A;

    public C44441z5(AnonymousClass012 anonymousClass012, C02L c02l, InterfaceC002901k interfaceC002901k, C01B c01b, C05Y c05y, C44331yt c44331yt, C41711uO c41711uO, C42961wc c42961wc, C44471z8 c44471z8) {
        this.A06 = anonymousClass012;
        this.A01 = c02l;
        this.A0A = interfaceC002901k;
        this.A02 = c01b;
        this.A09 = c05y;
        this.A04 = c44331yt;
        this.A08 = c41711uO;
        this.A05 = c42961wc;
        this.A03 = c44471z8;
    }

    public static C44441z5 A00() {
        if (A0B == null) {
            synchronized (C44441z5.class) {
                if (A0B == null) {
                    A0B = new C44441z5(AnonymousClass012.A00(), C02L.A00(), C002801j.A00(), C01B.A00(), C05Y.A01(), C44331yt.A00(), C41711uO.A00(), C42961wc.A00(), C44471z8.A00());
                }
            }
        }
        return A0B;
    }

    public void A01() {
        C04P[] c04pArr;
        C02590Ca[] c02590CaArr;
        C02590Ca c02590Ca;
        C04P[] c04pArr2;
        C02590Ca c02590Ca2;
        C02590Ca[] c02590CaArr2;
        synchronized (this) {
            Runnable runnable = this.A00;
            if (runnable != null) {
                this.A0A.ART(runnable);
                this.A00 = null;
                Log.i("SyncdDeleteAllDataHandler/resetSchedule removed scheduled sync");
            }
        }
        if (A05()) {
            C05Y c05y = this.A09;
            C010005b c010005b = c05y.A02;
            if (c010005b.A06 && c010005b.A02) {
                C42961wc c42961wc = this.A05;
                c42961wc.A05(c42961wc.A03().getInt("syncd_dirty", -1) + 1);
                C41711uO c41711uO = this.A08;
                if (c41711uO.A0E()) {
                    Log.i("SyncdDeleteAllDataApiHandler/handleDirtyState: logoutAllCompanionDevices");
                    c41711uO.A0D(false);
                    return;
                }
                Log.i("SyncdDeleteAllDataApiHandler/handleDirtyState: sendDeleteAllDataIq");
                C02L c02l = this.A01;
                c02l.A05();
                if (c02l.A02 != null) {
                    String A02 = c05y.A02();
                    StringBuilder sb = new StringBuilder("SyncdDeleteAllDataApiHandler/sendIqWithCallback ");
                    sb.append(A02);
                    Log.i(sb.toString());
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new C04P("to", C04260Jm.A00));
                    arrayList2.add(new C04P("xmlns", "w:sync:app:state", null, (byte) 0));
                    arrayList2.add(new C04P("type", "set", null, (byte) 0));
                    arrayList2.add(new C04P("id", A02, null, (byte) 0));
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    if (!arrayList4.isEmpty()) {
                        c04pArr = (C04P[]) arrayList4.toArray(new C04P[0]);
                    } else {
                        c04pArr = null;
                    }
                    if (!arrayList3.isEmpty()) {
                        c02590CaArr = (C02590Ca[]) arrayList3.toArray(new C02590Ca[0]);
                    } else {
                        c02590CaArr = null;
                    }
                    if (c02590CaArr == null) {
                        c02590Ca = new C02590Ca("delete_all_data", c04pArr, null, null);
                    } else {
                        c02590Ca = new C02590Ca("delete_all_data", c04pArr, c02590CaArr, null);
                    }
                    arrayList.add(c02590Ca);
                    if (!arrayList2.isEmpty()) {
                        c04pArr2 = (C04P[]) arrayList2.toArray(new C04P[0]);
                    } else {
                        c04pArr2 = null;
                    }
                    if (!arrayList.isEmpty() && (c02590CaArr2 = (C02590Ca[]) arrayList.toArray(new C02590Ca[0])) != null) {
                        c02590Ca2 = new C02590Ca("iq", c04pArr2, c02590CaArr2, null);
                    } else {
                        c02590Ca2 = new C02590Ca("iq", c04pArr2, null, null);
                    }
                    c05y.A0B(250, A02, c02590Ca2, this, 32000L);
                }
            }
        }
    }

    public void A02() {
        Log.i("SyncdDeleteAllDataApiHandler/markSyncdDirty");
        if (A04()) {
            return;
        }
        C42961wc c42961wc = this.A05;
        c42961wc.A05(0);
        c42961wc.A02().remove("syncd_last_companion_dereg_time").apply();
    }

    public synchronized void A03() {
        boolean A05 = A05();
        StringBuilder sb = new StringBuilder();
        sb.append("SyncdDeleteAllDataHandler/schedule isSyncdDirtyAndShouldRetry = ");
        sb.append(A05);
        Log.i(sb.toString());
        if (A05) {
            this.A00 = this.A0A.ASB(new RunnableEBaseShape1S0100000_I0_1(this, 27), 1000L);
        } else {
            this.A0A.AS1(new RunnableEBaseShape1S0100000_I0_1(this.A03, 28));
        }
    }

    public boolean A04() {
        return this.A05.A03().getInt("syncd_dirty", -1) != -1;
    }

    public boolean A05() {
        int i = this.A05.A03().getInt("syncd_dirty", -1);
        return i != -1 && i < 4;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        StringBuilder sb = new StringBuilder("SyncdDeleteAllDataApiHandler/onDeliveryFailure ");
        sb.append(str);
        Log.e(sb.toString());
        A03();
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        Pair A09 = C40731sm.A09(c02590Ca);
        StringBuilder sb = new StringBuilder("SyncdDeleteAllDataApiHandler/onError ");
        sb.append(A09);
        Log.e(sb.toString());
        A03();
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        StringBuilder sb = new StringBuilder("SyncdDeleteAllDataApiHandler/onSuccess ");
        sb.append(str);
        sb.append(" response: ");
        sb.append(c02590Ca);
        Log.i(sb.toString());
        this.A0A.AS1(new RunnableEBaseShape1S0100000_I0_1(this, 30));
    }
}
