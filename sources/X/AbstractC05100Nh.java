package X;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Nh */
/* loaded from: classes.dex */
public abstract class AbstractC05100Nh {
    public final int A00;
    public final AbstractC000600i A01;
    public final C01B A02;
    public final C000400f A03;
    public final C42431vj A04;
    public final C05E A05;
    public final C05C A06;
    public final C47962Dg A07;
    public final C28L A08;
    public final C48072Dr A09;
    public final AnonymousClass011 A0A;
    public final String A0B;

    public int A03() {
        return -1;
    }

    public long A05() {
        return 0L;
    }

    public void A0D(C0CD c0cd, long j, int i) {
    }

    public boolean A0L() {
        return true;
    }

    public abstract int A0R();

    public long A0S() {
        return 0L;
    }

    public abstract Pair A0T(Cursor cursor);

    public abstract String A0U();

    public abstract String A0V();

    public abstract String A0W();

    public void A0Z() {
    }

    public void A0a() {
    }

    public abstract boolean A0b();

    public AbstractC05100Nh(String str, int i, C05670Pr c05670Pr) {
        this.A0B = str;
        this.A00 = i;
        this.A01 = c05670Pr.A00;
        this.A0A = c05670Pr.A0t;
        this.A02 = c05670Pr.A02;
        this.A03 = c05670Pr.A04;
        this.A08 = c05670Pr.A0p;
        this.A06 = c05670Pr.A0Y;
        this.A09 = c05670Pr.A0q;
        this.A05 = c05670Pr.A0O;
        this.A07 = c05670Pr.A0n;
        this.A04 = c05670Pr.A0N;
    }

    public static final int A00(C47982Di c47982Di) {
        for (InterfaceC47992Dj interfaceC47992Dj : c47982Di.A00) {
            if (!interfaceC47992Dj.isValid()) {
                Integer A7B = interfaceC47992Dj.A7B();
                if (A7B != null) {
                    return A7B.intValue();
                }
                return 0;
            }
        }
        return 0;
    }

    public static void A01(AbstractC000600i abstractC000600i, String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder("migration-failed-");
        sb.append(str2);
        sb.append("-");
        sb.append(str);
        String obj = sb.toString();
        Log.e(obj, th);
        abstractC000600i.A09(obj, th.toString(), true);
    }

    public int A02() {
        if (!A0G() && !A0H()) {
            return A0Q();
        }
        return 3;
    }

    public final int A04() {
        if (A0I()) {
            return !A0K() ? 13 : 11;
        } else if (A02() == 2) {
            if (A0b()) {
                return 1;
            }
            return !A0F() ? 4 : 0;
        } else if (A02() == 3) {
            if (A0b()) {
                return 1;
            }
            if (A0J()) {
                return 2;
            }
            if (A0K()) {
                if (A0M() && A0N() && A0L()) {
                    return A0F() ? 3 : 5;
                }
                return 10;
            }
            return 12;
        } else if (A02() == 1) {
            return (A0b() || A0F()) ? 7 : 4;
        } else {
            return 9;
        }
    }

    public long A06() {
        C48072Dr c48072Dr = this.A09;
        String str = this.A0B;
        String trim = c48072Dr.A00.A05(402).toLowerCase(Locale.US).trim();
        long j = 0;
        if (!TextUtils.isEmpty(trim)) {
            for (String str2 : trim.split(";")) {
                String trim2 = str2.trim();
                if (trim2.startsWith(str)) {
                    String[] split = trim2.split(":");
                    if (split.length == 2) {
                        String str3 = split[0];
                        long A03 = AnonymousClass024.A03(split[1], -1L);
                        if (str.equals(str3) && A03 >= 0) {
                            j = A03;
                            if (A03 == -1) {
                                return 10485760L;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            return 10485760L;
        }
        return j;
    }

    public long A07() {
        long A0S = A0S();
        C05C c05c = this.A06;
        if (A0S == c05c.A01(C000200d.A0L(new StringBuilder(), this.A0B, "_retry_revision"), 0L)) {
            return c05c.A01(A0V(), 0L);
        }
        return 0L;
    }

    public long A08() {
        return this.A06.A01(A0W(), -1L);
    }

    public Cursor A09(long j, int i, C0CD c0cd) {
        C0CE c0ce = c0cd.A02;
        String A0U = A0U();
        String[] strArr = {String.valueOf(j), String.valueOf(i)};
        StringBuilder A0P = C000200d.A0P("MIGRATION_GET_QUERY_FOR_");
        A0P.append(this.A0B);
        A0P.toString();
        return c0ce.A07(A0U, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0052, code lost:
        return new android.util.Pair(java.lang.Integer.valueOf(r21), java.lang.Integer.valueOf(r20));
     */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0178 A[Catch: all -> 0x0220, TryCatch #24 {all -> 0x0220, blocks: (B:177:0x00a6, B:178:0x00dc, B:185:0x011d, B:216:0x0170, B:218:0x0178, B:219:0x0181, B:221:0x0187, B:223:0x0195, B:224:0x01a9, B:227:0x01b9, B:231:0x01d4, B:237:0x01e0, B:239:0x0211, B:238:0x01e1, B:245:0x021f, B:212:0x016c, B:195:0x014f, B:244:0x021e), top: B:293:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0187 A[Catch: all -> 0x0220, TryCatch #24 {all -> 0x0220, blocks: (B:177:0x00a6, B:178:0x00dc, B:185:0x011d, B:216:0x0170, B:218:0x0178, B:219:0x0181, B:221:0x0187, B:223:0x0195, B:224:0x01a9, B:227:0x01b9, B:231:0x01d4, B:237:0x01e0, B:239:0x0211, B:238:0x01e1, B:245:0x021f, B:212:0x016c, B:195:0x014f, B:244:0x021e), top: B:293:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x021f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair A0A(X.C47982Di r29) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC05100Nh.A0A(X.2Di):android.util.Pair");
    }

    public String A0B() {
        return C000200d.A0L(new StringBuilder(), this.A0B, "_complete");
    }

    public final void A0C() {
        ReentrantReadWriteLock.WriteLock writeLock;
        if (!(this instanceof InterfaceC05660Pp)) {
            this.A01.A09("db-rollbacks-not-supported", this.A0B, false);
            return;
        }
        InterfaceC05660Pp interfaceC05660Pp = (InterfaceC05660Pp) this;
        C0HC c0hc = new C0HC();
        c0hc.A03();
        try {
            String str = this.A0B;
            if ("message_main".equals(str)) {
                C05E c05e = this.A05;
                C000700j.A07(c05e.A09.getReadHoldCount() == 0);
                c05e.A05();
                writeLock = c05e.A08;
                try {
                    writeLock.lock();
                } finally {
                }
            } else {
                writeLock = null;
            }
            C0CD A04 = this.A05.A04();
            C03790Hb A00 = A04.A00();
            try {
                try {
                    if (this.A00 != Integer.MIN_VALUE) {
                        C05C c05c = this.A06;
                        c05c.A03(C000200d.A0L(new StringBuilder(), str, "_in_progress"));
                        int A03 = A03();
                        if (A03 != -1) {
                            c05c.A04(A0B(), A03);
                        } else {
                            c05c.A03(A0B());
                        }
                    }
                    C05C c05c2 = this.A06;
                    c05c2.A03(A0V());
                    c05c2.A03(C000200d.A0L(new StringBuilder(), str, "_retry_revision"));
                    c05c2.A03(A0W());
                    StringBuilder A0P = C000200d.A0P("migration_stats_");
                    A0P.append(str);
                    c05c2.A03(A0P.toString());
                    try {
                        interfaceC05660Pp.onRollback();
                        A00.A00();
                        A00.close();
                        A04.close();
                        if (writeLock != null && writeLock.isHeldByCurrentThread()) {
                            writeLock.unlock();
                        }
                        long A01 = c0hc.A01();
                        C36501ku c36501ku = new C36501ku();
                        c36501ku.A01 = str;
                        c36501ku.A00 = Long.valueOf(A01);
                        this.A0A.A0B(c36501ku, null, false);
                    } catch (Exception e) {
                        A01(this.A01, str, "rollback", e);
                        throw e;
                    }
                } catch (Exception e2) {
                    A01(this.A01, str, "before-rollback", e2);
                    throw e2;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        A00.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void A0E(C60202u5 c60202u5) {
        String str;
        C05C c05c = this.A06;
        StringBuilder A0P = C000200d.A0P("migration_stats_");
        A0P.append(this.A0B);
        String obj = A0P.toString();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("row_processed", c60202u5.A03);
            jSONObject.put("row_skipped", c60202u5.A04);
            jSONObject.put("db_size_change", c60202u5.A00);
            jSONObject.put("migration_time_spent", c60202u5.A01);
            jSONObject.put("retry_count", c60202u5.A02);
            str = jSONObject.toString();
        } catch (JSONException e) {
            Log.e("Failed to save migration statistics to JSON object.", e);
            str = null;
        }
        c05c.A06(obj, str);
    }

    public boolean A0F() {
        return A08() >= 0;
    }

    public boolean A0G() {
        C48072Dr c48072Dr = this.A09;
        String str = this.A0B;
        if (c48072Dr.A01.contains(str)) {
            return true;
        }
        return C48072Dr.A01(c48072Dr.A00.A05(242), str);
    }

    public boolean A0H() {
        C47962Dg c47962Dg = this.A07;
        String str = this.A0B;
        return c47962Dg.A01.contains(str) || C48072Dr.A01(c47962Dg.A00.A00.A05(404), str);
    }

    public boolean A0I() {
        int parseInt;
        if ((A0b() || A0F()) && !A0K()) {
            return true;
        }
        int i = this.A00;
        if (Integer.MIN_VALUE != i) {
            C05C c05c = this.A06;
            String A02 = c05c.A02(C000200d.A0L(new StringBuilder(), this.A0B, "_in_progress"));
            int parseInt2 = A02 == null ? -1 : Integer.parseInt(A02);
            if (A0F() && parseInt2 == -1) {
                return true;
            }
            if (parseInt2 != -1 && parseInt2 != i) {
                return true;
            }
            String A022 = c05c.A02(A0B());
            if (A022 == null || (parseInt = Integer.parseInt(A022)) == -1) {
                return false;
            }
            int A03 = A03();
            if ((A03 == -1 || A03 < parseInt) && parseInt != i) {
                return true;
            }
        }
        return false;
    }

    public boolean A0J() {
        return A07() > 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0K() {
        /*
            r7 = this;
            java.util.Set r0 = r7.A0X()
            java.util.Iterator r2 = r0.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r6 = r2.next()
            java.lang.String r6 = (java.lang.String) r6
            X.28L r0 = r7.A08
            X.0Nh r1 = r0.A03(r6)
            r5 = 0
            if (r1 != 0) goto L34
            X.00i r4 = r7.A01
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r7.A0B
            java.lang.String r1 = " depends on "
            java.lang.String r0 = " (missing)"
            java.lang.String r1 = X.C000200d.A0N(r3, r2, r1, r6, r0)
            java.lang.String r0 = "db-migration-missing-dep"
            r4.A09(r0, r1, r5)
            return r5
        L34:
            boolean r0 = r1.A0b()
            if (r0 == 0) goto L40
            boolean r0 = r1.A0I()
            if (r0 == 0) goto L8
        L40:
            return r5
        L41:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC05100Nh.A0K():boolean");
    }

    public final boolean A0M() {
        long A03 = this.A03.A03();
        long A06 = A06();
        if (A03 <= A06) {
            StringBuilder A0P = C000200d.A0P("DatabaseMigration/hasEnoughStorageForMigration/insufficient storage for migration; name=");
            A0P.append(this.A0B);
            A0P.append("; availableInternalPhoneStorage=");
            A0P.append(A03);
            A0P.append("; minInternalStorageRequired=");
            A0P.append(A06);
            Log.w(A0P.toString());
            return false;
        }
        return true;
    }

    public final boolean A0N() {
        Long A01;
        if (A0F()) {
            return true;
        }
        long A05 = A05();
        return A05 <= 0 || (A01 = this.A04.A01()) == null || A01.longValue() <= A05;
    }

    public boolean A0O(SQLException sQLException, int i) {
        if (sQLException instanceof SQLiteDatabaseCorruptException) {
            return false;
        }
        if (i != 1) {
            return (sQLException instanceof SQLiteBlobTooBigException) || (sQLException instanceof SQLiteOutOfMemoryException);
        } else if (sQLException instanceof SQLiteBlobTooBigException) {
            StringBuilder A0P = C000200d.A0P("DatabaseMigration/shouldRetryWithSmallerBatch/error; name=");
            A0P.append(this.A0B);
            A0P.append("; BlobTooBigException - skipping row");
            Log.e(A0P.toString());
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:218:0x01e2, code lost:
        if (((java.lang.Integer) r13.second).intValue() > 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:202:0x017b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0184 A[Catch: Exception -> 0x01ee, TryCatch #2 {Exception -> 0x01ee, blocks: (B:203:0x017d, B:206:0x0184, B:208:0x018a, B:214:0x01ac), top: B:277:0x017d }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0225 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0183 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0P(X.C47982Di r23) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC05100Nh.A0P(X.2Di):boolean");
    }

    public int A0Q() {
        return this.A09.A02(this.A0B);
    }

    public Set A0X() {
        return new HashSet();
    }

    public void A0Y() {
        C05C c05c = this.A06;
        c05c.A03(A0W());
        c05c.A03(A0V());
        StringBuilder sb = new StringBuilder();
        String str = this.A0B;
        c05c.A03(C000200d.A0L(sb, str, "_retry_revision"));
        int i = this.A00;
        if (Integer.MIN_VALUE != i) {
            c05c.A03(C000200d.A0L(new StringBuilder(), str, "_in_progress"));
            c05c.A04(A0B(), i);
        }
    }
}
