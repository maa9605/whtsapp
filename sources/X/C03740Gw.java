package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Gw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03740Gw implements C0EQ {
    public static volatile C03740Gw A0D;
    public final C02L A00;
    public final C05W A01;
    public final C018708s A02;
    public final AnonymousClass012 A03;
    public final C001200o A04;
    public final C03180Eq A05;
    public final C05E A06;
    public final C0DW A07;
    public final C0DV A08;
    public final C014406v A09 = C014406v.A00("PaymentStatusNotifier", "notification", "COMMON");
    public final C03750Gx A0A;
    public final C07A A0B;
    public final C00J A0C;

    public C03740Gw(C001200o c001200o, AnonymousClass012 anonymousClass012, C02L c02l, C03750Gx c03750Gx, C05W c05w, C018708s c018708s, C0DV c0dv, C03180Eq c03180Eq, C05E c05e, C07A c07a, C0DW c0dw, C00J c00j) {
        this.A04 = c001200o;
        this.A03 = anonymousClass012;
        this.A00 = c02l;
        this.A0A = c03750Gx;
        this.A01 = c05w;
        this.A02 = c018708s;
        this.A08 = c0dv;
        this.A05 = c03180Eq;
        this.A06 = c05e;
        this.A0B = c07a;
        this.A07 = c0dw;
        this.A0C = c00j;
    }

    public static C03740Gw A00() {
        if (A0D == null) {
            synchronized (C03740Gw.class) {
                if (A0D == null) {
                    C001200o c001200o = C001200o.A01;
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C02L A002 = C02L.A00();
                    C03750Gx A02 = C03750Gx.A02();
                    C05W A003 = C05W.A00();
                    C018708s A004 = C018708s.A00();
                    C0DV A005 = C0DV.A00();
                    C03180Eq A006 = C03180Eq.A00();
                    C0EU.A00();
                    C05E A007 = C05E.A00();
                    C0GZ.A00();
                    A0D = new C03740Gw(c001200o, A00, A002, A02, A003, A004, A005, A006, A007, C07A.A01(), C0DW.A00(), C007203d.A00(new InterfaceC007103c() { // from class: X.0Gy
                        @Override // X.InterfaceC007103c
                        public final Object get() {
                            return C0C9.A00();
                        }
                    }));
                }
            }
        }
        return A0D;
    }

    /* JADX WARN: Finally extract failed */
    public synchronized void A01() {
        ArrayList arrayList;
        String join;
        C0C9 c0c9 = (C0C9) this.A0C.get();
        C0DV c0dv = this.A08;
        c0dv.A04();
        C013306k c013306k = c0dv.A07;
        synchronized (c013306k) {
            long A05 = c013306k.A02.A05();
            List<AnonymousClass093> A0S = c013306k.A0S();
            arrayList = new ArrayList();
            try {
                C0CD A04 = c013306k.A04.A04();
                try {
                    C03790Hb A00 = A04.A00();
                    for (AnonymousClass093 anonymousClass093 : A0S) {
                        C0K8 c0k8 = anonymousClass093.A09;
                        if (c0k8 == null || c0k8.A07() < A05) {
                            ContentValues contentValues = new ContentValues();
                            Pair A042 = C013306k.A04(anonymousClass093.A0J, anonymousClass093.A0I);
                            contentValues.put("status", (Integer) 16);
                            contentValues.put("timestamp", Integer.valueOf((int) (A05 / 1000)));
                            C014406v c014406v = c013306k.A08;
                            StringBuilder sb = new StringBuilder();
                            sb.append("expireOldPendingRequests key id:");
                            sb.append(anonymousClass093.A0J);
                            c014406v.A07(null, sb.toString(), null);
                            if (c013306k.A0g()) {
                                C013306k.A08(anonymousClass093, contentValues, A04);
                            }
                            A04.A02.A00("pay_transactions", contentValues, (String) A042.first, (String[]) A042.second);
                            arrayList.add(anonymousClass093);
                        }
                    }
                    A00.A00();
                    A00.close();
                    A04.close();
                } finally {
                }
            } catch (SQLiteDatabaseCorruptException unused) {
                c013306k.A08.A04("expireOldPendingRequests failed.");
            }
        }
        C0DV c0dv2 = this.A08;
        c0dv2.A04();
        ArrayList arrayList2 = arrayList;
        arrayList2.addAll(c0dv2.A07.A0T());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            AnonymousClass093 anonymousClass0932 = (AnonymousClass093) it.next();
            C04590La A0C = this.A0B.A0C(anonymousClass0932.A0A, this.A03.A05(), 44);
            A0C.A01 = anonymousClass0932.A0B;
            A0C.A00 = anonymousClass0932.A0C;
            C03750Gx c03750Gx = this.A0A;
            String str = anonymousClass0932.A0G;
            C014006r c014006r = anonymousClass0932.A07;
            if (c03750Gx != null) {
                if (c014006r != null) {
                    join = TextUtils.join(";", Arrays.asList(str, Long.toString(c014006r.A00.scaleByPowerOfTen(3).longValue())));
                } else {
                    join = "";
                }
                A0C.A03 = join;
                A0C.A02 = new AnonymousClass094(anonymousClass0932.A0A, anonymousClass0932.A0O, anonymousClass0932.A0J);
                c0c9.A0k(A0C, 16);
                synchronized (c0c9) {
                    AnonymousClass092 A0E = c0c9.A0E(anonymousClass0932);
                    if (A0E != null) {
                        anonymousClass0932.A01 = 16;
                        A0E.A0F = anonymousClass0932;
                        c0c9.A0Z.A01(A0E, 16);
                        c0c9.A0V.A0N(A0E, null);
                    }
                }
            } else {
                throw null;
            }
        }
    }

    @Override // X.C0EQ
    public void AKy() {
        C02L c02l = this.A00;
        c02l.A05();
        if (c02l.A00 == null || !this.A07.A02()) {
            return;
        }
        C05E c05e = this.A06;
        c05e.A05();
        if (c05e.A01) {
            A01();
            C0DV c0dv = this.A08;
            c0dv.A04();
            c0dv.A07.A0c();
        }
    }
}
