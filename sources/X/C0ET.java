package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0ET */
/* loaded from: classes.dex */
public class C0ET {
    public static volatile C0ET A0L;
    public final AbstractC000600i A00;
    public final C02L A01;
    public final C0E3 A02;
    public final AnonymousClass012 A03;
    public final C06T A04;
    public final C05Q A05;
    public final C41181tV A06;
    public final C05M A07;
    public final C0C9 A08;
    public final C0EO A09;
    public final C05E A0A;
    public final C41661uJ A0B;
    public final C0E9 A0C;
    public final C42761wH A0D;
    public final C013006h A0E;
    public final C0EE A0F;
    public final C0EF A0G;
    public final C0EN A0H;
    public final C0EG A0I;
    public final C40301ry A0J;
    public final Map A0K;

    public C0ET(AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, C02L c02l, C05M c05m, C41181tV c41181tV, C0EG c0eg, C0EN c0en, C0EO c0eo, C0E3 c0e3, C42761wH c42761wH, C0C9 c0c9, C0EF c0ef, C0EE c0ee, C06T c06t, C05Q c05q, C0E9 c0e9, C012406b c012406b, C40301ry c40301ry, C05E c05e, C41661uJ c41661uJ, C013006h c013006h) {
        this.A03 = anonymousClass012;
        this.A00 = abstractC000600i;
        this.A01 = c02l;
        this.A07 = c05m;
        this.A06 = c41181tV;
        this.A0I = c0eg;
        this.A0H = c0en;
        this.A09 = c0eo;
        this.A02 = c0e3;
        this.A0D = c42761wH;
        this.A08 = c0c9;
        this.A0G = c0ef;
        this.A0F = c0ee;
        this.A04 = c06t;
        this.A05 = c05q;
        this.A0C = c0e9;
        this.A0A = c05e;
        this.A0J = c40301ry;
        this.A0B = c41661uJ;
        this.A0E = c013006h;
        this.A0K = c012406b.A02;
        c0c9.A00 = this;
    }

    public static C0ET A00() {
        if (A0L == null) {
            synchronized (C0ET.class) {
                if (A0L == null) {
                    A0L = new C0ET(AnonymousClass012.A00(), AbstractC000600i.A00(), C02L.A00(), C05M.A00(), C41181tV.A00(), C0EG.A00(), C0EN.A00(), C0EO.A00(), C0E3.A06(), C42761wH.A00(), C0C9.A00(), C0EF.A00(), C0EE.A00(), C06T.A02, C05Q.A00(), C0E9.A00(), C012406b.A00(), C40301ry.A00(), C05E.A00(), C41661uJ.A00(), C013006h.A00());
                }
            }
        }
        return A0L;
    }

    public static boolean A01(UserJid userJid, AnonymousClass092 anonymousClass092) {
        if (userJid == null || !C003101m.A0U(anonymousClass092.A0n.A00)) {
            return true;
        }
        return userJid.equals(anonymousClass092.A0A());
    }

    public static boolean A02(AnonymousClass094 anonymousClass094, int i) {
        if (anonymousClass094.A02) {
            return false;
        }
        return i == 13 || i == 16 || i == 17;
    }

    public void A03(AnonymousClass094 anonymousClass094, int i, InterfaceC44251yl interfaceC44251yl) {
        this.A04.A01(new RunnableEBaseShape0S0301000_I0(this, i, anonymousClass094, interfaceC44251yl, 1), 36);
    }

    public void A04(AnonymousClass092 anonymousClass092) {
        C000700j.A02(this.A04.A00);
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        C0CD A04 = this.A0A.A04();
        try {
            C03790Hb A00 = A04.A00();
            C41661uJ c41661uJ = this.A0B;
            Iterator it = ((AbstractCollection) c41661uJ.A01(anonymousClass094)).iterator();
            boolean z = false;
            while (it.hasNext()) {
                C44261ym c44261ym = (C44261ym) it.next();
                if (A01(c44261ym.A03, anonymousClass092)) {
                    int i = c44261ym.A00;
                    if (i == 17) {
                        if (this.A0G.A03(anonymousClass092)) {
                            this.A0H.A04(anonymousClass092, true);
                        }
                    } else if (i == 18) {
                        this.A0I.A0S(Collections.singleton(anonymousClass092), true);
                        i = 8;
                    }
                    A08(anonymousClass092, c44261ym.A02, i, c44261ym.A01, null);
                    if (A02(anonymousClass094, i)) {
                        z = true;
                    }
                }
            }
            c41661uJ.A03(anonymousClass094);
            A00.A00();
            A00.close();
            if (z) {
                A06(Collections.singletonList(anonymousClass094));
            }
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void A05(AnonymousClass092 anonymousClass092, UserJid userJid, int i) {
        C42801wL A02 = this.A0D.A02(anonymousClass092);
        ArrayList arrayList = new ArrayList(A02.A00());
        for (C42811wM c42811wM : A02.A00.values()) {
            arrayList.add(Integer.valueOf(c42811wM.A00()));
        }
        StringBuilder A0P = C000200d.A0P("MessageStatusStore/statusDowngrade: ");
        A0P.append(anonymousClass092.A0n);
        A0P.append(" fMessage:");
        A0P.append(System.identityHashCode(anonymousClass092));
        A0P.append(" remoteUser:");
        A0P.append(userJid);
        A0P.append(" current:");
        C000200d.A1H(A0P, anonymousClass092.A08, " new:", i, " recipientCount:");
        A0P.append(anonymousClass092.A06);
        A0P.append(" statuses:");
        A0P.append(TextUtils.join(",", arrayList));
        String obj = A0P.toString();
        Log.e(obj);
        this.A00.A09("MessageStatusStore/statusDowngrade", obj, true);
    }

    public void A06(List list) {
        this.A04.A00();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass094 anonymousClass094 = (AnonymousClass094) it.next();
            AbstractC005302j abstractC005302j = anonymousClass094.A00;
            if (abstractC005302j != null) {
                AnonymousClass092 A05 = this.A05.A05(anonymousClass094);
                List list2 = (List) hashMap.get(abstractC005302j);
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(abstractC005302j, list2);
                }
                list2.add(A05);
            } else {
                throw null;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC005302j abstractC005302j2 = (AbstractC005302j) entry.getKey();
            List list3 = (List) entry.getValue();
            Collections.sort(list3, new Comparator() { // from class: X.2tc
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return (int) (((AnonymousClass092) obj).A0p - ((AnonymousClass092) obj2).A0p);
                }
            });
            AnonymousClass092 anonymousClass092 = (AnonymousClass092) list3.get(list3.size() - 1);
            this.A0J.A07(abstractC005302j2, anonymousClass092);
            C41181tV c41181tV = this.A06;
            long j = anonymousClass092.A0p;
            c41181tV.A05.A00();
            C0IT A07 = c41181tV.A07.A07(abstractC005302j2);
            if (A07 == null) {
                C000200d.A0v("msgstore/setchatseenonasynccommitthread/nochat/", abstractC005302j2);
            } else {
                StringBuilder A0T = C000200d.A0T("msgstore/setchatseenonasynccommitthread/", abstractC005302j2, "/");
                A0T.append(A07.A0H());
                Log.i(A0T.toString());
                C05O c05o = c41181tV.A0D;
                int A01 = c05o.A01(abstractC005302j2, j);
                int A02 = c05o.A02(abstractC005302j2, j);
                int A012 = c41181tV.A0A.A01(abstractC005302j2, j);
                int i = A01 - A02;
                if (i != A07.A04) {
                    A07.A0J(i, A02, A01, A012);
                    c41181tV.A06.A0D(A07);
                    c41181tV.A09.A02.post(new RunnableEBaseShape1S0200000_I0_1(c41181tV, abstractC005302j2, 33));
                }
            }
        }
        if (list.isEmpty()) {
            return;
        }
        this.A0J.A04();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x004b, code lost:
        if (r7 == 8) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A07(X.AnonymousClass094 r6, int r7, X.InterfaceC44251yl r8) {
        /*
            r5 = this;
            X.06T r0 = r5.A04
            r0.A00()
            X.05Q r0 = r5.A05
            X.092 r4 = r0.A05(r6)
            r2 = 0
            if (r4 != 0) goto L14
            java.lang.String r0 = "msgstore/update/nosuchmessage: "
            X.C000200d.A10(r0, r6)
            return r2
        L14:
            int r0 = r4.A08
            int r0 = X.C0D6.A00(r0, r7)
            if (r0 < 0) goto L40
            java.lang.String r0 = "msgstore/update/statusdowngrade: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r6)
            java.lang.String r0 = " current:"
            r1.append(r0)
            int r0 = r4.A08
            r1.append(r0)
            java.lang.String r0 = " new:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w(r0)
            return r2
        L40:
            r0 = 9
            if (r7 == r0) goto L4d
            r0 = 10
            if (r7 == r0) goto L4d
            r0 = 8
            r1 = 0
            if (r7 != r0) goto L4e
        L4d:
            r1 = 1
        L4e:
            if (r1 == 0) goto L76
            boolean r0 = X.C0DB.A0R(r4)
            if (r0 != 0) goto L76
            java.lang.String r0 = "msgstore/update/status-played-non-ptt or view-once: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r6)
            java.lang.String r0 = " type="
            r1.append(r0)
            byte r0 = r4.A0m
            java.lang.String r0 = X.C0DB.A06(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w(r0)
            return r2
        L76:
            r4.A0Y(r7)
            if (r1 == 0) goto L80
            X.06h r0 = r5.A0E
            r0.A03(r4)
        L80:
            r0 = 4
            if (r7 != r0) goto L8f
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.A0E
            long r0 = r0 - r2
            java.lang.String r2 = "msgstore/update/receipt/server/delay "
            X.C000200d.A0u(r2, r0)
        L8f:
            r0 = 11
            r3 = -1
            if (r7 == r0) goto Lac
            r0 = 12
            if (r7 == r0) goto Lac
            r0 = 16
            if (r7 == r0) goto Lac
            r0 = 17
            if (r7 == r0) goto Lac
            X.0EO r2 = r5.A09
            android.os.Handler r1 = r2.A02
            X.1OI r0 = new X.1OI
            r0.<init>(r2, r4, r3)
            r1.post(r0)
        Lac:
            X.0C9 r0 = r5.A08
            boolean r0 = r0.A0m(r4, r3)
            if (r0 == 0) goto Lb9
            if (r8 == 0) goto Lb9
            r8.AS0(r4)
        Lb9:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ET.A07(X.094, int, X.1yl):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x0052, code lost:
        if (r7 != 17) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0054, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x006b, code lost:
        if (r1.A04(r0) < r28.A0p) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x00d7, code lost:
        if (r18 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x01ce, code lost:
        if (r7 == 13) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0214 A[Catch: all -> 0x02de, TryCatch #2 {all -> 0x02e5, blocks: (B:222:0x020c, B:244:0x02a0, B:255:0x02d6, B:223:0x0210, B:225:0x0214, B:227:0x021e, B:230:0x0260, B:242:0x0289, B:243:0x029d, B:234:0x0271, B:236:0x0279, B:238:0x027f, B:239:0x0282, B:254:0x02d3), top: B:272:0x020c }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x02c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A08(X.AnonymousClass092 r28, com.whatsapp.jid.DeviceJid r29, int r30, long r31, X.InterfaceC44251yl r33) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ET.A08(X.092, com.whatsapp.jid.DeviceJid, int, long, X.1yl):boolean");
    }
}
