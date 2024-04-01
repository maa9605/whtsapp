package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.0D5 */
/* loaded from: classes.dex */
public class C0D5 {
    public static volatile C0D5 A0H;
    public final C0E6 A00;
    public final C05W A01;
    public final C018708s A02;
    public final C002301c A03;
    public final C05Q A04;
    public final C05A A05;
    public final C0DK A06;
    public final C0GV A07;
    public final C05B A08;
    public final C0GU A09;
    public final C05N A0A;
    public final C05E A0B;
    public final C05C A0C;
    public final C05L A0D;
    public final Map A0E = new HashMap();
    public static final int[] A0G = {105, 118, 103, 97, 100, C0M6.A03};
    public static final Pattern A0F = Pattern.compile("((?<= )|(?= ))");

    public C0D5(C05B c05b, C05A c05a, C0E6 c0e6, C0GU c0gu, C05W c05w, C018708s c018708s, C002301c c002301c, C05C c05c, C05L c05l, C05Q c05q, C05E c05e, C0GV c0gv, C0DK c0dk, C05N c05n) {
        this.A08 = c05b;
        this.A05 = c05a;
        this.A00 = c0e6;
        this.A09 = c0gu;
        this.A01 = c05w;
        this.A02 = c018708s;
        this.A03 = c002301c;
        this.A0C = c05c;
        this.A0D = c05l;
        this.A04 = c05q;
        this.A0B = c05e;
        this.A07 = c0gv;
        this.A06 = c0dk;
        this.A0A = c05n;
        A0K(new C0GX() { // from class: X.0GW
            @Override // X.C0GX
            public String ABV() {
                return "f";
            }

            /* JADX WARN: Code restructure failed: missing block: B:71:0x002e, code lost:
                if (r3 != 29) goto L22;
             */
            /* JADX WARN: Removed duplicated region for block: B:74:0x0034  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x006b  */
            @Override // X.C0GX
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.util.Set ABF(X.AnonymousClass092 r7) {
                /*
                    r6 = this;
                    java.util.HashSet r4 = new java.util.HashSet
                    r4.<init>()
                    byte r3 = r7.A0m
                    r2 = 23
                    r1 = 1
                    if (r3 == r1) goto La5
                    r0 = 2
                    if (r3 == r0) goto L9b
                    r0 = 3
                    if (r3 == r0) goto L91
                    r0 = 9
                    if (r3 == r0) goto L87
                    r0 = 13
                    if (r3 == r0) goto L7d
                    if (r3 == r2) goto La5
                    r0 = 37
                    if (r3 == r0) goto La5
                    r0 = 25
                    if (r3 == r0) goto La5
                    r0 = 26
                    if (r3 == r0) goto L87
                    r0 = 28
                    if (r3 == r0) goto L91
                    r0 = 29
                    if (r3 == r0) goto L7d
                L30:
                    boolean r0 = r7 instanceof X.C0JJ
                    if (r0 == 0) goto L6b
                    java.lang.String r0 = r7.A0G()
                L38:
                    java.util.ArrayList r0 = X.C04310Jr.A05(r0, r1)
                    if (r0 == 0) goto L47
                    r0 = 108(0x6c, float:1.51E-43)
                    java.lang.String r0 = java.lang.Character.toString(r0)
                    r4.add(r0)
                L47:
                    X.092 r5 = r7.A0C()
                    boolean r0 = r5 instanceof X.C04160Iu
                    if (r0 == 0) goto L69
                    X.094 r0 = r5.A0n
                    java.lang.String r5 = r0.A01
                    java.lang.String r0 = "product_inquiry"
                    boolean r0 = r5.startsWith(r0)
                    if (r0 == 0) goto L69
                L5b:
                    if (r3 == r2) goto L5f
                    if (r1 == 0) goto L68
                L5f:
                    r0 = 112(0x70, float:1.57E-43)
                    java.lang.String r0 = java.lang.Character.toString(r0)
                    r4.add(r0)
                L68:
                    return r4
                L69:
                    r1 = 0
                    goto L5b
                L6b:
                    boolean r0 = r7 instanceof X.AnonymousClass095
                    if (r0 != 0) goto L75
                    boolean r0 = r7 instanceof X.C09F
                    if (r0 != 0) goto L75
                    r0 = 0
                    goto L38
                L75:
                    r0 = r7
                    X.097 r0 = (X.AnonymousClass097) r0
                    java.lang.String r0 = r0.A1A()
                    goto L38
                L7d:
                    r0 = 103(0x67, float:1.44E-43)
                    java.lang.String r0 = java.lang.Character.toString(r0)
                    r4.add(r0)
                    goto L30
                L87:
                    r0 = 100
                    java.lang.String r0 = java.lang.Character.toString(r0)
                    r4.add(r0)
                    goto L30
                L91:
                    r0 = 118(0x76, float:1.65E-43)
                    java.lang.String r0 = java.lang.Character.toString(r0)
                    r4.add(r0)
                    goto L30
                L9b:
                    r0 = 97
                    java.lang.String r0 = java.lang.Character.toString(r0)
                    r4.add(r0)
                    goto L30
                La5:
                    r0 = 105(0x69, float:1.47E-43)
                    java.lang.String r0 = java.lang.Character.toString(r0)
                    r4.add(r0)
                    goto L30
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0GW.ABF(X.092):java.util.Set");
            }

            @Override // X.C0GX
            public C27751Op ABW(C0IU c0iu) {
                if (c0iu.A02 != 0) {
                    C27751Op c27751Op = new C27751Op();
                    c27751Op.A00 = Collections.singleton(Character.toString((char) c0iu.A02));
                    return c27751Op;
                }
                return null;
            }
        });
        A0K(new C0GX() { // from class: X.0GY
            @Override // X.C0GX
            public String ABV() {
                return "p";
            }

            @Override // X.C0GX
            public Set ABF(AnonymousClass092 anonymousClass092) {
                if (anonymousClass092.A0b == null) {
                    return null;
                }
                HashSet hashSet = new HashSet();
                hashSet.add("");
                AnonymousClass093 anonymousClass093 = anonymousClass092.A0F;
                if (anonymousClass093 != null) {
                    hashSet.add(C03750Gx.A04(anonymousClass093) ? "c" : "i");
                    if (anonymousClass093.A0O()) {
                        int i = anonymousClass093.A01;
                        if (i == 12) {
                            hashSet.add("n");
                        } else if (i == 17) {
                            hashSet.add("q");
                        }
                    }
                    if (anonymousClass093.A0O) {
                        hashSet.add("s");
                    } else {
                        hashSet.add("r");
                        return hashSet;
                    }
                }
                return hashSet;
            }

            /* JADX WARN: Code restructure failed: missing block: B:42:0x0009, code lost:
                if (r1 == false) goto L35;
             */
            @Override // X.C0GX
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public X.C27751Op ABW(X.C0IU r6) {
                /*
                    r5 = this;
                    java.lang.Boolean r0 = r6.A06
                    if (r0 == 0) goto Lb
                    boolean r1 = r0.booleanValue()
                    r0 = 1
                    if (r1 != 0) goto Lc
                Lb:
                    r0 = 0
                Lc:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L18
                    r0 = 0
                    return r0
                L18:
                    java.util.HashSet r3 = new java.util.HashSet
                    r3.<init>()
                    java.util.HashSet r2 = new java.util.HashSet
                    r2.<init>()
                    X.1Ps r4 = r6.A05
                    if (r4 == 0) goto L60
                    boolean r0 = r4.A03
                    java.lang.String r1 = "n"
                    if (r0 == 0) goto L75
                    java.lang.String r0 = "q"
                    r2.add(r0)
                    r2.add(r1)
                L34:
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    boolean r0 = r4.A06
                    if (r0 == 0) goto L42
                    java.lang.String r0 = "s"
                    r1.add(r0)
                L42:
                    boolean r0 = r4.A05
                    if (r0 == 0) goto L4b
                    java.lang.String r0 = "r"
                    r1.add(r0)
                L4b:
                    boolean r0 = r4.A01
                    if (r0 == 0) goto L54
                    java.lang.String r0 = "c"
                    r1.add(r0)
                L54:
                    boolean r0 = r4.A02
                    if (r0 == 0) goto L5d
                    java.lang.String r0 = "i"
                    r1.add(r0)
                L5d:
                    r3.addAll(r1)
                L60:
                    boolean r0 = r3.isEmpty()
                    if (r0 == 0) goto L6b
                    java.lang.String r0 = ""
                    r3.add(r0)
                L6b:
                    X.1Op r0 = new X.1Op
                    r0.<init>()
                    r0.A00 = r3
                    r0.A01 = r2
                    return r0
                L75:
                    boolean r0 = r4.A04
                    if (r0 == 0) goto L34
                    r3.add(r1)
                    goto L34
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0GY.ABW(X.0IU):X.1Op");
            }
        });
    }

    public static C0D5 A00() {
        if (A0H == null) {
            synchronized (C0D5.class) {
                if (A0H == null) {
                    AnonymousClass012.A00();
                    C05B A00 = C05B.A00();
                    C05A A002 = C05A.A00();
                    C01B.A00();
                    C0E6 A003 = C0E6.A00();
                    C0GU A004 = C0GU.A00();
                    C05W A005 = C05W.A00();
                    C018708s A006 = C018708s.A00();
                    C002301c A007 = C002301c.A00();
                    C05C A008 = C05C.A00();
                    C05L A009 = C05L.A00();
                    C05Q A0010 = C05Q.A00();
                    C05E A0011 = C05E.A00();
                    C05P.A00();
                    A0H = new C0D5(A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, C0GV.A00(), C0DK.A00(), C05N.A00());
                }
            }
        }
        return A0H;
    }

    public static final String A01(String str, C05530Pc c05530Pc) {
        String str2;
        String str3 = "";
        if (c05530Pc == null) {
            str2 = "";
        } else {
            str2 = c05530Pc.A00;
            str3 = c05530Pc.A01;
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = C000200d.A0I(str, " ", str2);
        }
        return !TextUtils.isEmpty(str3) ? C000200d.A0I(str2, " ", str3) : str2;
    }

    public static boolean A02(C0HE c0he) {
        return c0he != null && c0he.A03();
    }

    public static final boolean A03(AnonymousClass092 anonymousClass092) {
        AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
        return abstractC005302j == null || C003101m.A0Z(abstractC005302j) || (anonymousClass092 instanceof C04200Je) || (anonymousClass092 instanceof AbstractC04290Jp) || (anonymousClass092 instanceof C0KU) || (anonymousClass092 instanceof C04040Ie) || (anonymousClass092 instanceof C04300Jq) || (anonymousClass092 instanceof C09D) || (anonymousClass092 instanceof C09A);
    }

    public long A04() {
        String A02 = this.A0C.A02("fts_ready");
        long parseLong = A02 == null ? 0L : Long.parseLong(A02);
        if (parseLong == 0 || parseLong == 1 || parseLong == 3) {
            return 1L;
        }
        if (parseLong == 2 || parseLong == 5) {
            return 5L;
        }
        C000700j.A08(false, "Unknown Fts version, falling back to V1");
        return 1L;
    }

    public final long A05(long j, String str) {
        C0CD A04 = this.A0B.A04();
        try {
            try {
                C0CF A01 = this.A0D.A01("INSERT INTO messages_fts (docid, content) VALUES(? , ?)");
                A01.A04(1, j);
                A01.A05(2, str);
                return A01.A01();
            } catch (SQLiteConstraintException unused) {
                C0CF A012 = this.A0D.A01("UPDATE messages_fts SET content=? WHERE docid=?");
                A012.A05(1, str);
                A012.A04(2, j);
                A012.A00();
                A04.close();
                return j;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A04.close();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public long A06(AnonymousClass092 anonymousClass092, boolean z, long j, Map map) {
        String A0D;
        long j2;
        if (z || A0O()) {
            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
            AbstractC005302j abstractC005302j = anonymousClass094.A00;
            if (A03(anonymousClass092)) {
                return -2L;
            }
            String A0E = A0E(anonymousClass092);
            String str = (String) map.get(Long.valueOf(anonymousClass092.A0p));
            if (str != null) {
                A0E = str;
            } else if (A0E.length() < 4096 && (!C28171Qm.A00.matcher(A0E).find())) {
                A0E = C09940f2.A01(5L, A0E, this.A03);
            } else {
                this.A00.A01(new AsyncMessageTokenizationJob(anonymousClass092.A0p));
            }
            UserJid of = UserJid.of(anonymousClass092.A0A());
            String A0F2 = A0F(anonymousClass092);
            long j3 = anonymousClass092.A0p;
            boolean z2 = anonymousClass094.A02;
            if (of == null) {
                A0D = z2 ? "1" : "0";
            } else {
                A0D = A0D(of);
            }
            String A0D2 = A0D(abstractC005302j);
            C0CD A04 = this.A0B.A04();
            try {
                try {
                    C0CF A01 = this.A0D.A01("INSERT INTO message_ftsv2(content, fts_jid, fts_namespace, docid) VALUES(?, ?, ?, ?)");
                    A01.A05(1, A0E);
                    StringBuilder sb = new StringBuilder();
                    sb.append(A0D);
                    sb.append(" ");
                    sb.append(A0D2);
                    A01.A05(2, sb.toString());
                    A01.A05(3, A0F2);
                    A01.A04(4, j3);
                    j2 = A01.A01();
                } catch (SQLiteConstraintException unused) {
                    C0CF A012 = this.A0D.A01("UPDATE message_ftsv2 SET content=?, fts_jid=?, fts_namespace=? WHERE docid=?");
                    A012.A05(1, A0E);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(A0D);
                    sb2.append(" ");
                    sb2.append(A0D2);
                    A012.A05(2, sb2.toString());
                    A012.A05(3, A0F2);
                    A012.A04(4, j3);
                    A012.A00();
                    A04.close();
                    j2 = j3;
                }
                return (TextUtils.isEmpty(A0E) || j != 1) ? j2 : A05(j3, A0E);
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        A04.close();
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:285:0x0069, code lost:
        if (r0.isEmpty() != false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0193, code lost:
        if (java.lang.Long.parseLong(r0) != 1) goto L241;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair A07(X.C0IU r21, X.C0HE r22) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D5.A07(X.0IU, X.0HE):android.util.Pair");
    }

    public final Pair A08(C0IU c0iu, C0HE c0he) {
        return new Pair(C000200d.A0L(new StringBuilder(), C0HD.A14, " ORDER BY docid DESC"), new String[]{A0B(c0iu, c0he)});
    }

    public C0IU A09(AbstractC005302j abstractC005302j) {
        C0IU c0iu = new C0IU(this.A03);
        c0iu.A04 = abstractC005302j;
        if (C003101m.A0U(abstractC005302j)) {
            List singletonList = Collections.singletonList(new InterfaceC09100ce() { // from class: X.1ko
                @Override // X.InterfaceC09100ce
                public boolean A7m(AbstractC005302j abstractC005302j2) {
                    return C003101m.A0b(abstractC005302j2);
                }
            });
            if (c0iu.A0A != null) {
                Log.e("FtsQuery/cannot re-set contactPreFilter");
                return c0iu;
            }
            c0iu.A0A = singletonList;
            return c0iu;
        }
        c0iu.A0B = Collections.emptyList();
        return c0iu;
    }

    public AnonymousClass092 A0A(int i, int i2, Cursor cursor) {
        try {
            long j = cursor.getLong(i2);
            AbstractC005302j A08 = this.A05.A08(cursor.getLong(i));
            if (!C003101m.A0Z(A08) && A08 != null) {
                try {
                    AnonymousClass092 A04 = this.A04.A04(cursor, A08, false, true);
                    if (A04 == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/null message; rowId=");
                        sb.append(j);
                        Log.e(sb.toString());
                        return null;
                    }
                    return A04;
                } catch (AssertionError | ClassCastException e) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/bad message; rowId=");
                    sb2.append(j);
                    Log.e(sb2.toString(), e);
                    return null;
                }
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/missing cursor chatjid; rowId=");
            sb3.append(j);
            Log.e(sb3.toString());
            return null;
        } catch (Exception e2) {
            Log.e("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/failed on cursor", e2);
            return null;
        }
    }

    public String A0B(C0IU c0iu, C0HE c0he) {
        String str = "";
        if (c0iu.A06()) {
            if (c0iu.A0E && AnonymousClass029.A1S(this)) {
                StringBuilder A0P = C000200d.A0P("");
                if (!c0iu.A04().isEmpty()) {
                    List A0I = A0I(c0iu, c0he);
                    StringBuilder sb = new StringBuilder();
                    int size = A0I.size();
                    int i = 0;
                    while (i < size && !A02(c0he)) {
                        boolean z = i == size + (-1);
                        sb.append(" ");
                        Pair pair = (Pair) A0I.get(i);
                        StringBuilder A0P2 = C000200d.A0P("content:");
                        A0P2.append((String) pair.first);
                        if (z) {
                            A0P2.append('*');
                        }
                        for (int i2 = 0; i2 < ((List) pair.second).size(); i2++) {
                            AbstractC005302j abstractC005302j = (AbstractC005302j) ((List) pair.second).get(i2);
                            if (C003101m.A0b(abstractC005302j)) {
                                A0P2.append(" OR ");
                                A0P2.append("fts_jid:");
                                A0P2.append(A0D(abstractC005302j));
                            } else if (C003101m.A0U(abstractC005302j)) {
                                A0P2.append(" OR ");
                                A0P2.append("fts_jid:");
                                A0P2.append(A0D(abstractC005302j));
                            }
                        }
                        sb.append(A0P2.toString());
                        i++;
                    }
                    str = sb.toString().trim();
                }
                A0P.append(str);
                str = A0P.toString();
            } else {
                StringBuilder A0P3 = C000200d.A0P("");
                List<String> A04 = c0iu.A04();
                ArrayList arrayList = new ArrayList(A04.size());
                for (String str2 : A04) {
                    StringBuilder sb2 = new StringBuilder("content:");
                    sb2.append(str2);
                    arrayList.add(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(TextUtils.join(" ", arrayList));
                sb3.append("*");
                A0P3.append(sb3.toString());
                str = A0P3.toString();
            }
        }
        AbstractC005302j abstractC005302j2 = c0iu.A04;
        if (abstractC005302j2 != null) {
            if (abstractC005302j2 != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" ");
                boolean z2 = c0iu.A0F;
                StringBuilder A0P4 = C000200d.A0P("fts_jid:");
                A0P4.append(A0D(abstractC005302j2));
                String obj = A0P4.toString();
                if (z2 && !C003101m.A0U(abstractC005302j2)) {
                    obj = C000200d.A0H(obj, " fts_jid:0 OR fts_jid:1");
                }
                sb4.append(obj);
                str = sb4.toString();
            } else {
                throw null;
            }
        }
        return A0C(c0iu, str, c0he);
    }

    public final String A0C(C0IU c0iu, String str, C0HE c0he) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        for (Map.Entry entry : this.A0E.entrySet()) {
            if (A02(c0he)) {
                break;
            }
            String str2 = (String) entry.getKey();
            C27751Op ABW = ((C0GX) entry.getValue()).ABW(c0iu);
            if (ABW != null) {
                for (String str3 : ABW.A00) {
                    if (A02(c0he)) {
                        break;
                    }
                    StringBuilder sb = new StringBuilder("fts_namespace:");
                    sb.append(str2);
                    sb.append(str3);
                    arrayList.add(sb.toString());
                    z2 = true;
                }
                for (String str4 : ABW.A01) {
                    if (!A02(c0he)) {
                        StringBuilder sb2 = new StringBuilder("fts_namespace:-");
                        sb2.append(str2);
                        sb2.append(str4);
                        arrayList.add(sb2.toString());
                        z = true;
                    }
                }
            }
        }
        if (!A02(c0he) && z && !z2 && TextUtils.isEmpty(str)) {
            throw new IllegalStateException("Compiled FTS query comprised entirely of NOTs");
        }
        String join = TextUtils.join(" ", arrayList);
        return !TextUtils.isEmpty(join) ? C000200d.A0I(str, " ", join) : str;
    }

    public String A0D(AbstractC005302j abstractC005302j) {
        return Long.toString(this.A08.A02(abstractC005302j) + 10, 36);
    }

    public String A0E(AnonymousClass092 anonymousClass092) {
        String A1A;
        C0LU c0lu;
        C0XT c0xt;
        AbstractC005302j abstractC005302j;
        C06C A0A;
        int i;
        UserJid userJid;
        C014006r c014006r;
        if (anonymousClass092 == null) {
            return "";
        }
        if (anonymousClass092 instanceof InterfaceC03910Hq) {
            A1A = ((InterfaceC03910Hq) anonymousClass092).AAJ();
        } else if (anonymousClass092 instanceof C0JJ) {
            C0JJ c0jj = (C0JJ) anonymousClass092;
            if (c0jj.A11()) {
                A1A = A01(c0jj.A0G(), c0jj.A0D().A00);
            } else {
                A1A = c0jj.A0G();
                if (!TextUtils.isEmpty(c0jj.A04)) {
                    StringBuilder A0V = C000200d.A0V(A1A, " ");
                    A0V.append(c0jj.A04);
                    A1A = A0V.toString();
                }
                if (!TextUtils.isEmpty(c0jj.A02)) {
                    StringBuilder A0V2 = C000200d.A0V(A1A, " ");
                    A0V2.append(c0jj.A02);
                    A1A = A0V2.toString();
                }
                if (!TextUtils.isEmpty(c0jj.A05)) {
                    StringBuilder A0V3 = C000200d.A0V(A1A, " ");
                    A0V3.append(c0jj.A05);
                    A1A = A0V3.toString();
                }
                AnonymousClass093 anonymousClass093 = c0jj.A0F;
                if (anonymousClass093 != null && (c014006r = anonymousClass093.A07) != null) {
                    String A0H2 = A0H(c014006r.A00, anonymousClass093.A0G);
                    if (!TextUtils.isEmpty(A0H2)) {
                        A1A = C000200d.A0I(A1A, " ", A0H2);
                    }
                }
            }
        } else if (anonymousClass092 instanceof C04300Jq) {
            C04300Jq c04300Jq = (C04300Jq) anonymousClass092;
            A1A = TextUtils.isEmpty(c04300Jq.A0G()) ? "" : c04300Jq.A0G();
            if ((c04300Jq instanceof C04370Jx) && (userJid = ((C04370Jx) c04300Jq).A01) != null) {
                StringBuilder A0V4 = C000200d.A0V(A1A, " ");
                A0V4.append(userJid.getRawString());
                A1A = A0V4.toString();
            }
            if (c04300Jq instanceof C0LZ) {
                C0LZ c0lz = (C0LZ) c04300Jq;
                if (!TextUtils.isEmpty(c0lz.A00) && (abstractC005302j = c04300Jq.A0n.A00) != null && (A0A = this.A01.A0A(abstractC005302j)) != null && (!A0A.A0B() || ((i = A0A.A03) != 2 && i != 1))) {
                    StringBuilder A0V5 = C000200d.A0V(A1A, " ");
                    A0V5.append(c0lz.A00);
                    A1A = A0V5.toString();
                }
            }
        } else if (!(anonymousClass092 instanceof AnonymousClass095) && !(anonymousClass092 instanceof C09F)) {
            if (anonymousClass092 instanceof C0KC) {
                A1A = ((C0KC) anonymousClass092).A03;
            } else if (anonymousClass092 instanceof C09E) {
                if (anonymousClass092.A11()) {
                    A1A = A01(anonymousClass092.A0G(), anonymousClass092.A0D().A00);
                } else {
                    A1A = ((AnonymousClass097) anonymousClass092).A1B();
                }
            } else if (anonymousClass092 instanceof C0LP) {
                if (anonymousClass092.A11()) {
                    A1A = A01(anonymousClass092.A0G(), anonymousClass092.A0D().A00);
                } else {
                    A1A = ((C0LP) anonymousClass092).A1D();
                }
            } else if (anonymousClass092 instanceof C0D8) {
                A1A = ((C0D8) anonymousClass092).A00;
            } else if (anonymousClass092 instanceof C0DA) {
                List<C04120Iq> list = ((C0DA) anonymousClass092).A02;
                if (list != null) {
                    StringBuilder sb = new StringBuilder();
                    for (C04120Iq c04120Iq : list) {
                        sb.append(c04120Iq.A01.A08());
                        sb.append(" ");
                    }
                    A1A = sb.toString();
                }
            } else if (anonymousClass092 instanceof C04570Ky) {
                A1A = anonymousClass092.A0J();
            } else if (anonymousClass092 instanceof C0LN) {
                C0LN c0ln = (C0LN) anonymousClass092;
                if (!TextUtils.isEmpty(c0ln.A07)) {
                    A1A = c0ln.A07;
                } else {
                    A1A = "";
                }
                if (!TextUtils.isEmpty(c0ln.A05)) {
                    StringBuilder A0V6 = C000200d.A0V(A1A, " ");
                    A0V6.append(c0ln.A05);
                    A1A = A0V6.toString();
                }
            } else if ((anonymousClass092 instanceof C0LU) && (c0xt = (c0lu = (C0LU) anonymousClass092).A00) != null) {
                A1A = "";
                if (!TextUtils.isEmpty(c0xt.A05)) {
                    StringBuilder A0P = C000200d.A0P("");
                    A0P.append(c0xt.A05);
                    A1A = A0P.toString();
                }
                if (!TextUtils.isEmpty(c0xt.A03)) {
                    StringBuilder A0V7 = C000200d.A0V(A1A, " ");
                    A0V7.append(c0xt.A03);
                    A1A = A0V7.toString();
                }
                if (!TextUtils.isEmpty(c0lu.A19())) {
                    StringBuilder A0V8 = C000200d.A0V(A1A, " ");
                    A0V8.append(c0lu.A19());
                    A1A = A0V8.toString();
                }
            }
        } else if (anonymousClass092 instanceof C04160Iu) {
            C04160Iu c04160Iu = (C04160Iu) anonymousClass092;
            A1A = c04160Iu.A07;
            if (!TextUtils.isEmpty(c04160Iu.A03)) {
                StringBuilder A0V9 = C000200d.A0V(A1A, " ");
                A0V9.append(c04160Iu.A03);
                A1A = A0V9.toString();
            }
            String A0H3 = A0H(c04160Iu.A08, c04160Iu.A02);
            if (!TextUtils.isEmpty(A0H3)) {
                A1A = C000200d.A0I(A1A, " ", A0H3);
            }
        } else if (anonymousClass092.A11()) {
            A1A = A01(anonymousClass092.A0G(), anonymousClass092.A0D().A00);
        } else {
            A1A = ((AnonymousClass097) anonymousClass092).A1A();
        }
        return A1A != null ? A1A : "";
    }

    public final String A0F(AnonymousClass092 anonymousClass092) {
        Set<String> ABF;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.A0E.entrySet()) {
            if (entry != null && entry.getValue() != null && (ABF = ((C0GX) entry.getValue()).ABF(anonymousClass092)) != null) {
                String str = (String) entry.getKey();
                for (String str2 : ABF) {
                    if (str2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(str2);
                        arrayList.add(sb.toString());
                    }
                }
            }
        }
        return TextUtils.join(" ", arrayList);
    }

    public String A0G(String str) {
        boolean z;
        String A0H2;
        String trim = C09940f2.A01(5L, str, this.A03).trim();
        int length = trim.length();
        if (length == 0) {
            return trim;
        }
        if (trim.startsWith("\"") && trim.endsWith("\"") && length > 2) {
            z = true;
            trim = trim.substring(1, length - 1);
        } else {
            z = false;
        }
        String trim2 = C09940f2.A02.matcher(trim).replaceAll(" ").trim();
        if (trim2.length() == 0) {
            return trim2;
        }
        if (z) {
            A0H2 = C000200d.A0I("\"", trim2, "\"");
        } else {
            A0H2 = C000200d.A0H(trim2, "*");
        }
        if (A0H2.indexOf(105) != -1) {
            if (z) {
                StringBuilder A0V = C000200d.A0V(A0H2, " OR ");
                A0V.append(A0H2.replace('i', (char) 305));
                return A0V.toString();
            }
            String[] split = A0F.split(A0H2);
            StringBuilder sb = new StringBuilder();
            for (String str2 : split) {
                if (str2.indexOf(105) == -1) {
                    sb.append(str2);
                } else {
                    sb.append(str2);
                    sb.append(" OR ");
                    sb.append(str2.replace('i', (char) 305));
                }
            }
            return sb.toString();
        }
        return A0H2;
    }

    public final String A0H(BigDecimal bigDecimal, String str) {
        if (bigDecimal == null || TextUtils.isEmpty(bigDecimal.toPlainString()) || TextUtils.isEmpty(str)) {
            return null;
        }
        String plainString = bigDecimal.toPlainString();
        try {
            C09R c09r = new C09R(str);
            StringBuilder sb = new StringBuilder();
            sb.append(plainString);
            sb.append(" ");
            sb.append(c09r.A03(this.A03, bigDecimal, true));
            return sb.toString();
        } catch (IllegalArgumentException unused) {
            return plainString;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x00ae, code lost:
        r9 = r9;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:174:? -> B:164:0x00ec). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List A0I(X.C0IU r20, X.C0HE r21) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D5.A0I(X.0IU, X.0HE):java.util.List");
    }

    /* JADX WARN: Finally extract failed */
    public void A0J() {
        C0HC c0hc = new C0HC("FtsMessageStore/drop");
        C05E c05e = this.A0B;
        C0CD A04 = c05e.A04();
        try {
            C03790Hb A00 = A04.A00();
            C0CE c0ce = A04.A02;
            c0ce.A0C(C000200d.A0H("DROP TABLE IF EXISTS ", "messages_fts"));
            c0ce.A0C(C000200d.A0H("DROP TABLE IF EXISTS ", "message_ftsv2"));
            c05e.A05();
            c05e.A06.A0K(A04);
            C05C c05c = this.A0C;
            c05c.A04("fts_index_start", 0);
            c05c.A05("fts_ready", 0L);
            A00.A00();
            A00.close();
            A04.close();
            c0hc.A01();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public void A0K(C0GX c0gx) {
        String ABV = c0gx.ABV();
        Map map = this.A0E;
        if (map.containsKey(ABV)) {
            C000700j.A08(false, "Namespace already registered");
        }
        map.put(ABV, c0gx);
    }

    public void A0L(C0IU c0iu) {
        try {
            A0M(c0iu);
        } catch (IllegalStateException e) {
            Log.e("FtsMessageStore/safeWarm/failed to warm contact list", e);
        }
    }

    public void A0M(C0IU c0iu) {
        if (c0iu.A0B != null) {
            return;
        }
        synchronized (c0iu.A0H) {
            if (c0iu.A0B != null) {
                return;
            }
            C0HC c0hc = new C0HC("FtsMessageStore/getSearchableContacts");
            LinkedList linkedList = new LinkedList(this.A06.A05().values());
            c0iu.A0B = linkedList;
            if (c0iu.A0A != null && linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    AbstractC005302j abstractC005302j = (AbstractC005302j) ((C06C) it.next()).A03(AbstractC005302j.class);
                    if (abstractC005302j == null || !C0DK.A01(c0iu.A0A, abstractC005302j)) {
                        it.remove();
                    }
                }
            }
            List list = c0iu.A0B;
            if (list != null) {
                list.size();
                c0hc.A01();
                return;
            }
            throw null;
        }
    }

    public void A0N(AnonymousClass092 anonymousClass092, List list) {
        A06(anonymousClass092, false, A04(), Collections.emptyMap());
    }

    public boolean A0O() {
        return this.A0C.A01("fts_ready", 0L) % 2 != 0;
    }
}
