package X;

import android.app.Activity;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.45A */
/* loaded from: classes3.dex */
public class C45A implements InterfaceC03670Gp {
    public static volatile C45A A0C;
    public long A00;
    public final C0M8 A01;
    public final C018508q A02;
    public final C0E7 A03;
    public final AnonymousClass012 A04;
    public final C001200o A05;
    public final C002301c A06;
    public final C894947f A07;
    public final C90564Bm A08;
    public final C28S A09;
    public final C0EU A0A;
    public final Set A0B = new HashSet();

    public C45A(C001200o c001200o, AnonymousClass012 anonymousClass012, C0M8 c0m8, C018508q c018508q, C002301c c002301c, C0EU c0eu, C0E7 c0e7, C894947f c894947f, C28S c28s, C90564Bm c90564Bm) {
        this.A00 = -1L;
        this.A05 = c001200o;
        this.A04 = anonymousClass012;
        this.A01 = c0m8;
        this.A02 = c018508q;
        this.A06 = c002301c;
        this.A0A = c0eu;
        this.A03 = c0e7;
        this.A07 = c894947f;
        this.A09 = c28s;
        this.A08 = c90564Bm;
        this.A00 = c0eu.A04().getLong("payments_block_list_last_sync_time", -1L);
        String string = this.A0A.A04().getString("payments_block_list", "");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.A0B.addAll(Arrays.asList(string.split(";")));
    }

    public static C45A A00() {
        if (A0C == null) {
            synchronized (C45A.class) {
                if (A0C == null) {
                    A0C = new C45A(C001200o.A01, AnonymousClass012.A00(), C0M8.A00(), C018508q.A00(), C002301c.A00(), C0EU.A00(), C0E7.A00(), C894947f.A00(), C28S.A00(), C90564Bm.A00());
                }
            }
        }
        return A0C;
    }

    public synchronized void A01() {
        Log.i("PAY: IndiaUpiBlockListManager clear");
        this.A0B.clear();
        C000200d.A0k(this.A0A, "payments_block_list", "");
    }

    public synchronized void A02() {
        Log.i("PAY: IndiaUpiBlockListManager setShouldFetch called");
        this.A00 = -1L;
        this.A0A.A04().edit().putLong("payments_block_list_last_sync_time", -1L).apply();
    }

    public void A03(final Activity activity, final C463026g c463026g, final String str, final boolean z, final C3NR c3nr) {
        this.A01.A01(activity, z, new C0M9() { // from class: X.3hS
            {
                C45A.this = this;
            }

            @Override // X.C0M9
            public final void A5l() {
                C45A.this.A04(c463026g, str, z, activity, c3nr);
            }
        });
    }

    public void A04(C463026g c463026g, final String str, final boolean z, Activity activity, C3NR c3nr) {
        final C4C1 c4c1 = new C4C1(this.A05.A00, this.A02, this.A03, this.A07, c463026g, this, this.A09);
        final C90524Bi c90524Bi = new C90524Bi(this, activity, c3nr);
        StringBuilder A0P = C000200d.A0P("PAY: blockNonWaVpa called vpa: ");
        A0P.append(C40841sx.A0Q(str));
        A0P.append(" block: ");
        A0P.append(z);
        Log.i(A0P.toString());
        String str2 = z ? "upi-block-vpa" : "upi-unblock-vpa";
        C02590Ca c02590Ca = new C02590Ca("account", new C04P[]{new C04P("action", str2, null, (byte) 0), new C04P("vpa", str, null, (byte) 0)}, null, null);
        C3NV c3nv = ((C48B) c4c1).A00;
        if (c3nv != null) {
            c3nv.A04(str2);
        }
        ((C48B) c4c1).A01.A0F("set", c02590Ca, new C91754Gd(c4c1.A00, c4c1.A01, c4c1.A02, c4c1.A04, c3nv, str2) { // from class: X.4IF
            @Override // X.C91754Gd, X.C28V
            public void A02(C28Q c28q) {
                super.A02(c28q);
                C90524Bi c90524Bi2 = c90524Bi;
                if (c90524Bi2 != null) {
                    c90524Bi2.A00(z, c28q);
                }
            }

            @Override // X.C91754Gd, X.C28V
            public void A03(C28Q c28q) {
                super.A03(c28q);
                C90524Bi c90524Bi2 = c90524Bi;
                if (c90524Bi2 != null) {
                    c90524Bi2.A00(z, c28q);
                }
            }

            @Override // X.C91754Gd, X.C28V
            public void A04(C02590Ca c02590Ca2) {
                super.A04(c02590Ca2);
                C45A c45a = c4c1.A03;
                String str3 = str;
                boolean z2 = z;
                c45a.A05(str3, z2);
                C90524Bi c90524Bi2 = c90524Bi;
                if (c90524Bi2 != null) {
                    C000200d.A1C("PAY: IndiaUpiBlockListManager/on-success blocked: ", z2);
                    c90524Bi2.A01.A02.A09((C0B5) c90524Bi2.A00);
                    C3NR c3nr2 = c90524Bi2.A02;
                    if (c3nr2 != null) {
                        c3nr2.AO5(null);
                    }
                }
            }
        }, 0L);
    }

    public synchronized void A05(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("PAY: IndiaUpiBlockListManager before block vpa: ");
        sb.append(C40841sx.A0Q(str));
        sb.append(" blocked: ");
        sb.append(z);
        Log.i(sb.toString());
        if (z) {
            Set set = this.A0B;
            if (!set.contains(str)) {
                set.add(str);
                StringBuilder sb2 = new StringBuilder("PAY: IndiaUpiBlockListManager add vpa: ");
                sb2.append(C40841sx.A0Q(str));
                Log.i(sb2.toString());
                C000200d.A0k(this.A0A, "payments_block_list", TextUtils.join(";", set));
            }
        } else {
            Set set2 = this.A0B;
            if (set2.contains(str)) {
                set2.remove(str);
                StringBuilder sb3 = new StringBuilder("PAY: IndiaUpiBlockListManager remove vpa: ");
                sb3.append(C40841sx.A0Q(str));
                Log.i(sb3.toString());
                C000200d.A0k(this.A0A, "payments_block_list", TextUtils.join(";", set2));
            }
        }
    }

    public synchronized boolean A06() {
        return this.A00 != -1;
    }

    public synchronized boolean A07(String str) {
        return this.A0B.contains(str);
    }
}
