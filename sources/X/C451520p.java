package X;

import android.location.Location;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.20p */
/* loaded from: classes2.dex */
public class C451520p {
    public static volatile C451520p A0K;
    public final AbstractC000600i A00;
    public final C0IK A01;
    public final C02L A02;
    public final C01B A03;
    public final AnonymousClass034 A04;
    public final AnonymousClass012 A05;
    public final C451820s A06;
    public final C05M A07;
    public final C0DK A08;
    public final C0C8 A09;
    public final C0GU A0A;
    public final C0H4 A0B;
    public final C0EA A0C;
    public final C03880Hm A0D;
    public final C41461tx A0E;
    public final C41471ty A0F;
    public final C451720r A0G;
    public final C03740Gw A0H;
    public final C451620q A0I;
    public final C0CB A0J;

    public C451520p(AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, C02L c02l, C05M c05m, AnonymousClass034 anonymousClass034, C01B c01b, C0EA c0ea, C0GU c0gu, C41471ty c41471ty, C451620q c451620q, C03880Hm c03880Hm, C0CB c0cb, C0H4 c0h4, C451720r c451720r, C0IK c0ik, C03740Gw c03740Gw, C41461tx c41461tx, C451820s c451820s, C0C8 c0c8, C0DK c0dk) {
        this.A05 = anonymousClass012;
        this.A00 = abstractC000600i;
        this.A02 = c02l;
        this.A07 = c05m;
        this.A04 = anonymousClass034;
        this.A03 = c01b;
        this.A0C = c0ea;
        this.A0A = c0gu;
        this.A0F = c41471ty;
        this.A0I = c451620q;
        this.A0D = c03880Hm;
        this.A0J = c0cb;
        this.A0B = c0h4;
        this.A0G = c451720r;
        this.A01 = c0ik;
        this.A0H = c03740Gw;
        this.A0E = c41461tx;
        this.A06 = c451820s;
        this.A09 = c0c8;
        this.A08 = c0dk;
    }

    public static C451520p A00() {
        if (A0K == null) {
            synchronized (C451520p.class) {
                if (A0K == null) {
                    A0K = new C451520p(AnonymousClass012.A00(), AbstractC000600i.A00(), C02L.A00(), C05M.A00(), AnonymousClass034.A00(), C01B.A00(), C0EA.A00(), C0GU.A00(), C41471ty.A00(), C451620q.A00(), C03880Hm.A00(), C0CB.A00(), C0H4.A00(), C451720r.A00(), C0IK.A01(), C03740Gw.A00(), C41461tx.A00(), C451820s.A00(), C0C8.A00(), C0DK.A00());
                }
            }
        }
        return A0K;
    }

    public Pair A01(AbstractC005302j abstractC005302j) {
        List list;
        AnonymousClass094 anonymousClass094;
        AnonymousClass092 A05;
        List A052;
        C03880Hm c03880Hm = this.A0D;
        int A01 = c03880Hm.A02.A01(abstractC005302j);
        if (A01 > 0 && (A05 = c03880Hm.A03.A05(abstractC005302j, A01)) != null) {
            list = c03880Hm.A03(abstractC005302j, A05.A0p - 1, 20, null);
            if (list == null) {
                list = new ArrayList();
            }
            if (!list.isEmpty()) {
                anonymousClass094 = ((AnonymousClass092) list.get(0)).A0n;
                if (anonymousClass094 != null && (A052 = c03880Hm.A05(anonymousClass094, 20, null)) != null) {
                    list.addAll(0, A052);
                }
                return Pair.create(anonymousClass094, list);
            }
        } else {
            list = null;
        }
        anonymousClass094 = null;
        return Pair.create(anonymousClass094, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0043, code lost:
        if (r9 != null) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C20v A02(X.AnonymousClass092 r20, X.AnonymousClass094 r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C451520p.A02(X.092, X.094, boolean, boolean):X.20v");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0082, code lost:
        if (r2 == (-2)) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C451920u A03(X.AbstractC005302j r8) {
        /*
            r7 = this;
            X.00i r1 = r7.A00
            X.01B r0 = r7.A03
            X.20u r4 = new X.20u
            r4.<init>(r1, r0)
            X.05M r6 = r7.A07
            long r0 = r6.A05(r8)
            r4.A08 = r0
            int r0 = r6.A02(r8)
            r4.A03 = r0
            r4.A0A = r8
            X.0CB r2 = r7.A0J
            X.0Fl r0 = r2.A07(r8)
            long r0 = r0.A00()
            r4.A06 = r0
            int r0 = r6.A01(r8)
            r4.A01 = r0
            boolean r0 = r6.A0F(r8)
            r4.A0L = r0
            X.0DK r0 = r7.A08
            X.06C r5 = r0.A02(r8)
            java.lang.String r0 = r5.A0F
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 0
            if (r1 != 0) goto L42
            java.lang.String r0 = r5.A0F
        L42:
            r4.A0G = r0
            boolean r0 = r5.A0C()
            if (r0 == 0) goto L57
            X.0C8 r1 = r7.A09
            r0 = r8
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r0 = r1.A05(r0)
            r0 = r0 ^ 1
            r4.A0P = r0
        L57:
            com.whatsapp.jid.UserJid r3 = com.whatsapp.jid.UserJid.of(r8)
            if (r3 == 0) goto L71
            X.20s r0 = r7.A06
            X.0Jx r1 = r0.A01(r3)
            if (r1 == 0) goto L71
            com.whatsapp.jid.UserJid r0 = r1.A00
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L9d
            com.whatsapp.jid.UserJid r0 = r1.A01
            r4.A0C = r0
        L71:
            long r0 = r2.A02(r8)
            r4.A07 = r0
            X.0EA r0 = r7.A0C
            int r2 = r0.A01(r8)
            r0 = -1
            if (r2 == r0) goto L84
            r1 = -2
            r0 = 0
            if (r2 != r1) goto L85
        L84:
            r0 = 1
        L85:
            r0 = r0 ^ 1
            r4.A0N = r0
            if (r3 == 0) goto Laa
            X.0CM r1 = r6.A09(r3)
            if (r1 == 0) goto L9c
            int r0 = r1.expiration
            r4.A02 = r0
            long r2 = r1.ephemeralSettingTimestamp
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            r4.A05 = r2
        L9c:
            return r4
        L9d:
            com.whatsapp.jid.UserJid r0 = r1.A01
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L71
            com.whatsapp.jid.UserJid r0 = r1.A00
            r4.A0B = r0
            goto L71
        Laa:
            int r0 = r5.A00
            r4.A02 = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C451520p.A03(X.02j):X.20u");
    }

    public boolean A04(String str, AbstractC005302j abstractC005302j, long j, boolean z) {
        HashMap hashMap;
        long j2;
        C21O c21o;
        C0K0 c0k0;
        long j3;
        byte[] bArr = null;
        if (j > 0) {
            hashMap = new HashMap();
            hashMap.put("duration", Long.toString(j));
        } else {
            hashMap = null;
        }
        ArrayList arrayList = new ArrayList();
        C41461tx c41461tx = this.A0E;
        if (c41461tx.A0h(abstractC005302j)) {
            if (!z) {
                return false;
            }
            Location A03 = this.A01.A03("web-live-location-participants");
            if (A03 != null) {
                C41471ty c41471ty = this.A0F;
                c0k0 = c41471ty.A06(A03);
                if (c0k0 != null) {
                    bArr = c41471ty.A05(c0k0, null).A0B();
                }
            } else {
                c0k0 = null;
            }
            AbstractC000600i abstractC000600i = this.A00;
            C01B c01b = this.A03;
            C02L c02l = this.A02;
            c02l.A05();
            C0K1 c0k1 = c02l.A01;
            if (c0k1 != null) {
                AbstractC005302j abstractC005302j2 = (AbstractC005302j) c0k1.A09;
                if (abstractC005302j2 != null) {
                    long A05 = c41461tx.A05(abstractC005302j) / 1000;
                    if (c0k0 != null) {
                        j3 = (this.A05.A05() - c0k0.A05) / 1000;
                    } else {
                        j3 = -1;
                    }
                    arrayList.add(new C21N(abstractC000600i, c01b, abstractC005302j2, A05, j3, bArr));
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        Iterator it = c41461tx.A09(abstractC005302j).iterator();
        while (it.hasNext()) {
            C0K0 c0k02 = (C0K0) it.next();
            AbstractC000600i abstractC000600i2 = this.A00;
            C01B c01b2 = this.A03;
            UserJid userJid = c0k02.A06;
            synchronized (c41461tx.A0S) {
                Map map = (Map) c41461tx.A0C().get(abstractC005302j);
                j2 = (map == null || (c21o = (C21O) map.get(userJid)) == null) ? -1L : c21o.A00;
            }
            arrayList.add(new C21N(abstractC000600i2, c01b2, userJid, j2 / 1000, (this.A05.A05() - c0k02.A05) / 1000, null));
        }
        this.A0G.A04(str, arrayList, 29, false, Collections.emptyMap(), hashMap);
        return true;
    }
}
