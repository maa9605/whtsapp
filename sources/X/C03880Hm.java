package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Random;

/* renamed from: X.0Hm */
/* loaded from: classes.dex */
public class C03880Hm {
    public static volatile C03880Hm A08;
    public final C05Q A00;
    public final C05A A01;
    public final C05M A02;
    public final C03180Eq A03;
    public final C03690Gr A04;
    public final C05E A05;
    public final C05O A06;
    public final C43081wp A07;

    public C03880Hm(C05A c05a, C05M c05m, C05O c05o, C03180Eq c03180Eq, C03690Gr c03690Gr, C05Q c05q, C05E c05e, C43081wp c43081wp) {
        this.A01 = c05a;
        this.A02 = c05m;
        this.A06 = c05o;
        this.A03 = c03180Eq;
        this.A04 = c03690Gr;
        this.A00 = c05q;
        this.A05 = c05e;
        this.A07 = c43081wp;
    }

    public static C03880Hm A00() {
        if (A08 == null) {
            synchronized (C03880Hm.class) {
                if (A08 == null) {
                    C05A A00 = C05A.A00();
                    C05M A002 = C05M.A00();
                    C05O A003 = C05O.A00();
                    C03180Eq A004 = C03180Eq.A00();
                    C03690Gr A005 = C03690Gr.A00();
                    C05Q A006 = C05Q.A00();
                    C05E A007 = C05E.A00();
                    C43081wp A008 = C43081wp.A00();
                    C05P.A00();
                    A08 = new C03880Hm(A00, A002, A003, A004, A005, A006, A007, A008);
                }
            }
        }
        return A08;
    }

    public int A01(AbstractC005302j abstractC005302j) {
        C0IT A07 = this.A02.A07(abstractC005302j);
        if (A07 == null) {
            return -1;
        }
        int nextInt = new Random().nextInt(999999) + 1;
        C0CD A04 = this.A05.A04();
        try {
            C03790Hb A00 = A04.A00();
            A07.A08 = nextInt;
            boolean A0H = this.A01.A0H(A07);
            A00.A00();
            A00.close();
            if (!A0H) {
                StringBuilder sb = new StringBuilder("msgStore/updateWebModTag/none/");
                sb.append(abstractC005302j);
                Log.e(sb.toString());
            }
            return nextInt;
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

    public Cursor A02(AbstractC005302j abstractC005302j, String str) {
        if (abstractC005302j != null) {
            if ("gif".equals(str)) {
                C43081wp c43081wp = this.A07;
                try {
                    return c43081wp.A0C.A03().A02.A08(C0HD.A02, new String[]{String.valueOf(c43081wp.A02.A05(abstractC005302j))}, null);
                } finally {
                }
            } else {
                return this.A07.A02(abstractC005302j, null, null);
            }
        } else if ("gif".equals(str)) {
            C43081wp c43081wp2 = this.A07;
            AnonymousClass012 anonymousClass012 = c43081wp2.A00;
            long A04 = anonymousClass012.A04();
            try {
                C0CD A03 = c43081wp2.A0C.A03();
                Cursor A082 = A03.A02.A08(C0HD.A03, null, null);
                A03.close();
                return A082;
            } finally {
                C000200d.A0e(anonymousClass012, A04, c43081wp2.A04, "StarredMessageStore/getStarredGifMessages");
            }
        } else {
            return this.A07.A03(null, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x000d, code lost:
        if (X.C003101m.A0U(r8) != false) goto L53;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List A03(X.AbstractC005302j r8, long r9, java.lang.Integer r11, java.lang.String r12) {
        /*
            r7 = this;
            boolean r0 = X.C003101m.A0P(r8)
            r6 = 1
            r5 = 0
            if (r0 != 0) goto Lf
            boolean r0 = X.C003101m.A0U(r8)
            r2 = 1
            if (r0 == 0) goto L10
        Lf:
            r2 = 0
        L10:
            X.05E r0 = r7.A05
            X.0CD r3 = r0.A03()
            r0.A05()     // Catch: java.lang.Throwable -> L89
            X.05J r0 = r0.A06     // Catch: java.lang.Throwable -> L89
            boolean r0 = r0.A0P(r3)     // Catch: java.lang.Throwable -> L89
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L89
            r1.<init>()     // Catch: java.lang.Throwable -> L89
            X.C05P.A02(r12, r2, r1, r0)     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = " "
            r1.append(r0)     // Catch: java.lang.Throwable -> L89
            X.C05P.A04(r5, r1)     // Catch: java.lang.Throwable -> L89
            if (r11 == 0) goto L39
            java.lang.String r0 = " LIMIT "
            r1.append(r0)     // Catch: java.lang.Throwable -> L89
            r1.append(r11)     // Catch: java.lang.Throwable -> L89
        L39:
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L89
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L89
            X.05A r0 = r7.A01     // Catch: java.lang.Throwable -> L89
            long r0 = r0.A05(r8)     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L89
            r2[r5] = r0     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L89
            r2[r6] = r0     // Catch: java.lang.Throwable -> L89
            X.0CE r0 = r3.A02     // Catch: java.lang.Throwable -> L89
            android.database.Cursor r2 = r0.A07(r4, r2)     // Catch: java.lang.Throwable -> L89
            r3.close()
            r1 = 0
            if (r2 != 0) goto L64
            java.lang.String r0 = "msgstore/get/newer no newer messages for "
            X.C000200d.A0u(r0, r9)
            r2 = r1
        L64:
            if (r2 != 0) goto L67
            return r1
        L67:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L82
            r1.<init>()     // Catch: java.lang.Throwable -> L82
        L6c:
            boolean r0 = r2.moveToNext()     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L7e
            X.05Q r0 = r7.A00     // Catch: java.lang.Throwable -> L82
            X.092 r0 = r0.A03(r2, r8)     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L6c
            r1.add(r0)     // Catch: java.lang.Throwable -> L82
            goto L6c
        L7e:
            r2.close()
            return r1
        L82:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L84
        L84:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L88
        L88:
            throw r0
        L89:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L8b
        L8b:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L8f
        L8f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03880Hm.A03(X.02j, long, java.lang.Integer, java.lang.String):java.util.List");
    }

    public List A04(AbstractC005302j abstractC005302j, AnonymousClass094 anonymousClass094, Integer num, String str) {
        long A02;
        if (anonymousClass094 == null) {
            A02 = this.A06.A06(abstractC005302j);
        } else {
            A02 = C0DB.A02(this.A00.A05(anonymousClass094));
        }
        if (A02 == 1) {
            C000200d.A0z("msgstore/get/newer no id for ", anonymousClass094);
            return null;
        }
        return A03(abstractC005302j, A02, num, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0026, code lost:
        if (X.C003101m.A0U(r5) != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List A05(X.AnonymousClass094 r13, int r14, java.lang.String r15) {
        /*
            r12 = this;
            X.05Q r6 = r12.A00
            X.092 r0 = r6.A05(r13)
            long r10 = X.C0DB.A02(r0)
            r4 = 0
            r1 = 1
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L17
            java.lang.String r0 = "msgstore/get/previous no id for "
            X.C000200d.A0z(r0, r13)
            return r4
        L17:
            X.02j r5 = r13.A00
            boolean r0 = X.C003101m.A0P(r5)
            r9 = 1
            r8 = 0
            if (r0 != 0) goto L28
            boolean r0 = X.C003101m.A0U(r5)
            r2 = 1
            if (r0 == 0) goto L29
        L28:
            r2 = 0
        L29:
            X.05E r0 = r12.A05
            X.0CD r3 = r0.A03()
            r0.A05()     // Catch: java.lang.Throwable -> Lb3
            X.05J r0 = r0.A06     // Catch: java.lang.Throwable -> Lb3
            boolean r0 = r0.A0P(r3)     // Catch: java.lang.Throwable -> Lb3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb3
            r1.<init>()     // Catch: java.lang.Throwable -> Lb3
            X.C05P.A02(r15, r2, r1, r0)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r0 = " "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r0 = " AND _id < ? "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r0 = " ORDER BY _id DESC"
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r0 = " LIMIT "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb3
            r1.append(r14)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> Lb3
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> Lb3
            X.05A r0 = r12.A01     // Catch: java.lang.Throwable -> Lb3
            long r0 = r0.A05(r5)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lb3
            r2[r8] = r0     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> Lb3
            r2[r9] = r0     // Catch: java.lang.Throwable -> Lb3
            X.0CE r0 = r3.A02     // Catch: java.lang.Throwable -> Lb3
            android.database.Cursor r2 = r0.A07(r7, r2)     // Catch: java.lang.Throwable -> Lb3
            if (r2 == 0) goto L8d
            java.util.LinkedList r4 = new java.util.LinkedList     // Catch: java.lang.Throwable -> Laa
            r4.<init>()     // Catch: java.lang.Throwable -> Laa
        L7d:
            boolean r0 = r2.moveToNext()     // Catch: java.lang.Throwable -> Laa
            if (r0 == 0) goto La1
            X.092 r0 = r6.A03(r2, r5)     // Catch: java.lang.Throwable -> Laa
            if (r0 == 0) goto L7d
            r4.addFirst(r0)     // Catch: java.lang.Throwable -> Laa
            goto L7d
        L8d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laa
            r1.<init>()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = "msgstore/get/previous cursor null "
            r1.append(r0)     // Catch: java.lang.Throwable -> Laa
            r1.append(r13)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> Laa
            com.whatsapp.util.Log.i(r0)     // Catch: java.lang.Throwable -> Laa
        La1:
            if (r2 == 0) goto La6
            r2.close()     // Catch: java.lang.Throwable -> Lb3
        La6:
            r3.close()
            return r4
        Laa:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lac
        Lac:
            r0 = move-exception
            if (r2 == 0) goto Lb2
            r2.close()     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            throw r0     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> Lb9
        Lb9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03880Hm.A05(X.094, int, java.lang.String):java.util.List");
    }
}
