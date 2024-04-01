package X;

import android.os.SystemClock;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.20k */
/* loaded from: classes2.dex */
public class C451020k {
    public final AnonymousClass012 A00;
    public final C000500h A01;
    public final C01J A02;
    public final C01R A03;
    public final C41711uO A04;
    public final InterfaceC002901k A05;

    public C451020k(AnonymousClass012 anonymousClass012, InterfaceC002901k interfaceC002901k, C01R c01r, C01J c01j, C000500h c000500h, C41711uO c41711uO) {
        this.A00 = anonymousClass012;
        this.A05 = interfaceC002901k;
        this.A03 = c01r;
        this.A02 = c01j;
        this.A01 = c000500h;
        this.A04 = c41711uO;
    }

    public static AnonymousClass298 A00(int i, int i2, long j) {
        C0CT AVX = AnonymousClass298.A04.AVX();
        AVX.A02();
        AnonymousClass298 anonymousClass298 = (AnonymousClass298) AVX.A00;
        anonymousClass298.A00 |= 1;
        anonymousClass298.A02 = i;
        AVX.A02();
        AnonymousClass298 anonymousClass2982 = (AnonymousClass298) AVX.A00;
        anonymousClass2982.A00 |= 4;
        anonymousClass2982.A01 = i2;
        AVX.A02();
        AnonymousClass298 anonymousClass2983 = (AnonymousClass298) AVX.A00;
        anonymousClass2983.A00 |= 2;
        anonymousClass2983.A03 = j;
        return (AnonymousClass298) AVX.A01();
    }

    public long A01() {
        long j = this.A01.A00.getLong("adv_timestamp_sec", -1L);
        long A02 = A02();
        long A022 = this.A00.A02() / 1000;
        long j2 = j + 1;
        if (j2 > A02 + 86400) {
            return -1L;
        }
        if (Math.abs(A022 - A02) <= 86400) {
            A02 = A022;
        }
        return Math.max(A02, j2);
    }

    public final long A02() {
        long j;
        AnonymousClass012 anonymousClass012 = this.A00;
        if (anonymousClass012.A02 != 0) {
            long j2 = anonymousClass012.A02;
            if (anonymousClass012.A00 == null) {
                throw null;
            }
            j = SystemClock.elapsedRealtime() + j2;
        } else {
            j = 0;
        }
        long j3 = j / 1000;
        return j3 == 0 ? anonymousClass012.A01() / 1000 : j3;
    }

    public AnonymousClass296 A03(AnonymousClass298 anonymousClass298) {
        C41711uO c41711uO = this.A04;
        if (c41711uO != null) {
            HashSet hashSet = new HashSet();
            hashSet.add(0);
            Iterator it = ((AbstractCollection) c41711uO.A0F.A01().A03()).iterator();
            while (it.hasNext()) {
                hashSet.add(Integer.valueOf(((C0JV) it.next()).A03));
            }
            hashSet.add(Integer.valueOf(anonymousClass298.A01));
            C0CT AVX = AnonymousClass296.A06.AVX();
            int i = anonymousClass298.A02;
            AVX.A02();
            AnonymousClass296 anonymousClass296 = (AnonymousClass296) AVX.A00;
            anonymousClass296.A00 |= 1;
            anonymousClass296.A02 = i;
            int i2 = anonymousClass298.A01;
            AVX.A02();
            AnonymousClass296 anonymousClass2962 = (AnonymousClass296) AVX.A00;
            anonymousClass2962.A00 |= 4;
            anonymousClass2962.A01 = i2;
            long j = anonymousClass298.A03;
            AVX.A02();
            AnonymousClass296 anonymousClass2963 = (AnonymousClass296) AVX.A00;
            anonymousClass2963.A00 |= 2;
            anonymousClass2963.A04 = j;
            AVX.A02();
            AnonymousClass296 anonymousClass2964 = (AnonymousClass296) AVX.A00;
            C0O0 c0o0 = anonymousClass2964.A05;
            if (!((C0CY) c0o0).A00) {
                anonymousClass2964.A05 = C0AZ.A04(c0o0);
            }
            C0Aa.A08(hashSet, anonymousClass2964.A05);
            return (AnonymousClass296) AVX.A01();
        }
        throw null;
    }

    public AnonymousClass297 A04(AnonymousClass296 anonymousClass296) {
        C0JY c0jy = (C0JY) this.A03.A00.submit(new CallableC57422pI(this)).get();
        if (c0jy != null) {
            C0R8 c0r8 = c0jy.A00;
            byte[] A1h = AnonymousClass029.A1h(C02M.A06, anonymousClass296.A0B());
            C0CT AVX = AnonymousClass297.A03.AVX();
            C0AN A00 = C0AN.A00(C002701i.A1W(c0r8, A1h));
            AVX.A02();
            AnonymousClass297 anonymousClass297 = (AnonymousClass297) AVX.A00;
            anonymousClass297.A00 |= 2;
            anonymousClass297.A01 = A00;
            C0AN A09 = anonymousClass296.A09();
            AVX.A02();
            AnonymousClass297 anonymousClass2972 = (AnonymousClass297) AVX.A00;
            anonymousClass2972.A00 |= 1;
            anonymousClass2972.A02 = A09;
            return (AnonymousClass297) AVX.A01();
        }
        throw null;
    }

    public void A05() {
        C000200d.A0h(this.A01, "adv_timestamp_sec", -1L);
        this.A05.AS1(new RunnableEBaseShape1S0100000_I0_1(this, 15));
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x004c, code lost:
        if (r4 <= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void A06() {
        /*
            r5 = this;
            monitor-enter(r5)
            X.00h r0 = r5.A01     // Catch: java.lang.Throwable -> L6f
            android.content.SharedPreferences r2 = r0.A00     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = "adv_raw_id"
            r1 = -1
            int r4 = r2.getInt(r0, r1)     // Catch: java.lang.Throwable -> L6f
            X.00h r0 = r5.A01     // Catch: java.lang.Throwable -> L6f
            android.content.SharedPreferences r0 = r0.A00     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = "adv_current_key_index"
            int r1 = r0.getInt(r3, r1)     // Catch: java.lang.Throwable -> L6f
            r2 = 1
            if (r4 <= 0) goto L37
            if (r1 <= 0) goto L37
            X.1uO r0 = r5.A04     // Catch: java.lang.Throwable -> L6f
            java.util.List r0 = r0.A04()     // Catch: java.lang.Throwable -> L6f
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L2a
            goto L4a
        L2a:
            int r1 = r1 + r2
            if (r1 > 0) goto L35
            r5.A05()     // Catch: java.lang.Throwable -> L6f
            int r4 = r4 + 1
            if (r4 > 0) goto L4f
            goto L4e
        L35:
            r2 = r1
            goto L4f
        L37:
            r5.A05()     // Catch: java.lang.Throwable -> L6f
            java.util.Random r0 = new java.util.Random     // Catch: java.lang.Throwable -> L6f
            r0.<init>()     // Catch: java.lang.Throwable -> L6f
            int r0 = r0.nextInt()     // Catch: java.lang.Throwable -> L6f
            int r4 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> L6f
            if (r4 != 0) goto L4f
            goto L4e
        L4a:
            int r4 = r4 + 1
            if (r4 > 0) goto L4f
        L4e:
            r4 = 1
        L4f:
            X.00h r0 = r5.A01     // Catch: java.lang.Throwable -> L6f
            android.content.SharedPreferences$Editor r1 = r0.A0D()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = "adv_raw_id"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r4)     // Catch: java.lang.Throwable -> L6f
            r0.apply()     // Catch: java.lang.Throwable -> L6f
            X.00h r0 = r5.A01     // Catch: java.lang.Throwable -> L6f
            android.content.SharedPreferences$Editor r1 = r0.A0D()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = "adv_current_key_index"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r3, r2)     // Catch: java.lang.Throwable -> L6f
            r0.apply()     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r5)
            return
        L6f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C451020k.A06():void");
    }

    public void A07(long j) {
        C000500h c000500h = this.A01;
        C000200d.A0f(c000500h, "adv_key_index_list_update_retry_count");
        C000200d.A0f(c000500h, "adv_key_index_list_last_failure_time");
        C000200d.A0h(c000500h, "adv_key_index_list_last_update_time", this.A00.A05());
        C000200d.A0f(c000500h, "adv_key_index_list_require_update");
        if (j > 0) {
            C000200d.A0h(c000500h, "adv_timestamp_sec", j);
        }
    }
}
