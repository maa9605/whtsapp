package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0HY */
/* loaded from: classes.dex */
public class C0HY {
    public static volatile C0HY A0K;
    public final AbstractC000600i A01;
    public final C02L A02;
    public final C000400f A03;
    public final AnonymousClass012 A04;
    public final C06T A05;
    public final C05Q A06;
    public final C05R A07;
    public final C05A A08;
    public final C05M A09;
    public final C0C9 A0A;
    public final C0EO A0B;
    public final C012406b A0C;
    public final C00A A0D;
    public final C05F A0E;
    public final C05E A0F;
    public final C05C A0G;
    public final AnonymousClass011 A0H;
    public final C0MC A0I;
    public final C06F A00 = new C06F(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
    public final ReentrantReadWriteLock A0J = new ReentrantReadWriteLock();

    public C0HY(AnonymousClass012 anonymousClass012, C02L c02l, C05A c05a, AbstractC000600i abstractC000600i, C05M c05m, AnonymousClass011 anonymousClass011, C05R c05r, C0EO c0eo, C0MC c0mc, C0C9 c0c9, C00A c00a, C000400f c000400f, C05C c05c, C06T c06t, C05Q c05q, C05F c05f, C012406b c012406b, C05E c05e) {
        this.A04 = anonymousClass012;
        this.A02 = c02l;
        this.A08 = c05a;
        this.A01 = abstractC000600i;
        this.A09 = c05m;
        this.A0H = anonymousClass011;
        this.A07 = c05r;
        this.A0B = c0eo;
        this.A0I = c0mc;
        this.A0A = c0c9;
        this.A0D = c00a;
        this.A03 = c000400f;
        this.A0G = c05c;
        this.A05 = c06t;
        this.A06 = c05q;
        this.A0E = c05f;
        this.A0C = c012406b;
        this.A0F = c05e;
    }

    public static C0HY A00() {
        if (A0K == null) {
            synchronized (C0HY.class) {
                if (A0K == null) {
                    A0K = new C0HY(AnonymousClass012.A00(), C02L.A00(), C05A.A00(), AbstractC000600i.A00(), C05M.A00(), AnonymousClass011.A00(), C05R.A00(), C0EO.A00(), C0MC.A00, C0C9.A00(), C00A.A00, C000400f.A00(), C05C.A00(), C06T.A02, C05Q.A00(), C05F.A01, C012406b.A00(), C05E.A00());
                }
            }
        }
        return A0K;
    }

    public static C0D3 A01(C0D3 c0d3) {
        C000700j.A09(c0d3.A06 != null, "not a legacy/v1 call log");
        ArrayList arrayList = new ArrayList(((AbstractCollection) c0d3.A04()).size());
        Iterator it = ((AbstractCollection) c0d3.A04()).iterator();
        while (it.hasNext()) {
            C0D4 c0d4 = (C0D4) it.next();
            arrayList.add(new C0D4(-1L, c0d4.A02, c0d4.A00));
        }
        return new C0D3(c0d3.A09, null, -1L, c0d3.A08, c0d3.A0E, c0d3.A01, c0d3.A00, c0d3.A02, false, false, c0d3.A05, c0d3.A0D, arrayList, c0d3.A04, c0d3.A07);
    }

    public C0D3 A02(long j) {
        C05R c05r = this.A07;
        C0CD A03 = c05r.A01.A03();
        try {
            C0CE c0ce = A03.A02;
            String l = Long.toString(j);
            Cursor A07 = c0ce.A07("SELECT _id, call_id, jid_row_id, from_me, transaction_id, timestamp, video_call, duration, call_result, bytes_transferred, group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id FROM call_log WHERE _id = ?", new String[]{l});
            if (A07.moveToLast()) {
                Cursor A072 = c0ce.A07("SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id", new String[]{l});
                try {
                    C0D3 A02 = c05r.A02(A07, A072);
                    if (A072 != null) {
                        A072.close();
                    }
                    A07.close();
                    A03.close();
                    return A02;
                } finally {
                }
            } else {
                A07.close();
                A03.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A03.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public final C0D3 A03(UserJid userJid, boolean z, String str, int i, long j, boolean z2, boolean z3) {
        C07950aM c07950aM = new C07950aM(userJid, z, str, i);
        if (A04(c07950aM) == null) {
            final C0D3 c0d3 = new C0D3(c07950aM, null, -1L, j, z2, 0, 0, 0L, false, false, null, false, Collections.emptyList(), null, null);
            this.A00.A08(c07950aM, c0d3);
            if (this.A07.A08()) {
                if (z3) {
                    this.A05.A01(new Runnable() { // from class: X.1Nr
                        {
                            C0HY.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C0HY.this.A09(c0d3);
                        }
                    }, 15);
                } else {
                    A09(c0d3);
                    return c0d3;
                }
            }
            return c0d3;
        }
        StringBuilder sb = new StringBuilder("CallsMessageStore/addCallLogInternal already exists for this key=");
        sb.append(c07950aM);
        throw new IllegalArgumentException(sb.toString());
    }

    public final C0D3 A04(C07950aM c07950aM) {
        C0D3 c0d3 = (C0D3) this.A00.A04(c07950aM);
        return c0d3 != null ? c0d3 : this.A07.A03(c07950aM);
    }

    /* JADX WARN: Finally extract failed */
    public ArrayList A05(int i, int i2, C0HB c0hb) {
        ArrayList arrayList = new ArrayList();
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0J;
        reentrantReadWriteLock.readLock().lock();
        try {
            try {
                C05R c05r = this.A07;
                if (c05r.A08()) {
                    ArrayList arrayList2 = new ArrayList();
                    String[] strArr = {Integer.toString(i), Integer.toString(i2)};
                    C0CD A03 = c05r.A01.A03();
                    try {
                        C0CE c0ce = A03.A02;
                        Cursor A07 = c0ce.A07("SELECT _id, call_id, jid_row_id, from_me, transaction_id, timestamp, video_call, duration, call_result, bytes_transferred, group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id FROM call_log ORDER BY _id DESC LIMIT ?,?", strArr);
                        int columnIndex = A07.getColumnIndex("_id");
                        while (A07.moveToNext() && !c0hb.AUW()) {
                            Cursor A072 = c0ce.A07("SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id", new String[]{Long.toString(A07.getLong(columnIndex))});
                            C0D3 A02 = c05r.A02(A07, A072);
                            if (A02 != null) {
                                arrayList2.add(A02);
                            }
                            if (A072 != null) {
                                A072.close();
                            }
                        }
                        A07.close();
                        A03.close();
                        C000200d.A1W(arrayList2, new StringBuilder("CallLogStore/getCalls/size="));
                        arrayList.addAll(arrayList2);
                    } finally {
                    }
                } else {
                    C06F c06f = this.A00;
                    if (i < c06f.A01()) {
                        ArrayList arrayList3 = new ArrayList(((AbstractMap) c06f.A06()).values());
                        Collections.sort(arrayList3, new Comparator() { // from class: X.1Nt
                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                return (((C0D3) obj).A08 > ((C0D3) obj2).A08 ? 1 : (((C0D3) obj).A08 == ((C0D3) obj2).A08 ? 0 : -1));
                            }
                        });
                        int size = arrayList3.size() - i;
                        while (true) {
                            size--;
                            if (size < Math.max(0, (arrayList3.size() - i) - i2)) {
                                break;
                            }
                            arrayList.add(arrayList3.get(size));
                        }
                    }
                    if (arrayList.size() < i2) {
                        arrayList.addAll(A06(arrayList.isEmpty() ? i - c06f.A01() : 0, i2 - arrayList.size(), c0hb));
                    }
                }
                reentrantReadWriteLock.readLock().unlock();
                C000200d.A1W(arrayList, new StringBuilder("CallsMessageStore/calls/size:"));
                return arrayList;
            } catch (SQLiteException e) {
                Log.e("CallsMessageStore/getCalls/db/unavailable", e);
                reentrantReadWriteLock.readLock().unlock();
                return arrayList;
            }
        } catch (Throwable th) {
            reentrantReadWriteLock.readLock().unlock();
            throw th;
        }
    }

    public final ArrayList A06(int i, int i2, C0HB c0hb) {
        int i3;
        int i4;
        C0D3 c0d3;
        ArrayList arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr = {Integer.toString(i), Integer.toString(i2)};
            try {
                C05E c05e = this.A0F;
                C0CD A03 = c05e.A03();
                try {
                    Cursor A07 = A03.A02.A07(C0HD.A09, strArr);
                    if (A07 != null) {
                        int columnIndexOrThrow = A07.getColumnIndexOrThrow("transaction_id");
                        while (A07.moveToNext() && (c0hb == null || !c0hb.AUW())) {
                            AbstractC005302j A09 = this.A08.A09(A07);
                            if (UserJid.of(A09) == null) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("CallsMessageStore/getLegacyCallsFromMessageTable/Userjid is null! Got: ");
                                sb.append(A09);
                                Log.w(sb.toString());
                            } else {
                                int i5 = A07.getInt(columnIndexOrThrow);
                                C10050fD c10050fD = (C10050fD) this.A06.A03(A07, A09);
                                if (c10050fD != null) {
                                    Iterator it = ((AbstractC04290Jp) c10050fD).A02.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            c0d3 = null;
                                            break;
                                        }
                                        c0d3 = (C0D3) it.next();
                                        if (c0d3.A09.A00 == i5) {
                                            break;
                                        }
                                    }
                                    if (c0d3 != null) {
                                        arrayList2.add(c0d3);
                                    }
                                }
                            }
                        }
                    } else {
                        Log.e("CallsMessageStore/getLegacyCallsFromCallLogsDeprecatedTable/db/cursor is null");
                    }
                    if (A07 != null) {
                        A07.close();
                    }
                    C000200d.A1W(arrayList2, C000200d.A0P("CallsMessageStore/getLegacyCallsFromCallLogsDeprecatedTable/size:"));
                    arrayList.addAll(arrayList2);
                    if (arrayList.size() < i2) {
                        int size = i2 - arrayList.size();
                        if (arrayList.isEmpty()) {
                            C0CD A032 = this.A07.A01.A03();
                            Cursor A072 = A032.A02.A07("SELECT COUNT(1) as count, MIN(message_row_id) as first_id FROM call_logs", null);
                            try {
                                if (A072.moveToLast()) {
                                    i4 = A072.getInt(A072.getColumnIndex("count"));
                                    A072.close();
                                    A032.close();
                                } else {
                                    A072.close();
                                    A032.close();
                                    i4 = 0;
                                }
                                i3 = i - i4;
                            } finally {
                            }
                        } else {
                            i3 = 0;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        String str = C0HD.A08;
                        try {
                            A03 = c05e.A03();
                            try {
                                Cursor A073 = A03.A02.A07(str, new String[]{Long.toString(i3), Integer.toString(size)});
                                while (A073.moveToNext() && (c0hb == null || !c0hb.AUW())) {
                                    AbstractC005302j A092 = this.A08.A09(A073);
                                    if (UserJid.of(A092) == null) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("CallsMessageStore/getLegacyCallsFromMessageTable/Userjid is null! Got: ");
                                        sb2.append(A092);
                                        Log.w(sb2.toString());
                                    } else {
                                        C10050fD c10050fD2 = (C10050fD) this.A06.A03(A073, A092);
                                        if (c10050fD2 != null) {
                                            arrayList3.addAll(c10050fD2.A19());
                                        }
                                    }
                                }
                                A073.close();
                                A03.close();
                                arrayList.addAll(arrayList3);
                                return arrayList;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } finally {
                                    try {
                                        A03.close();
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        } catch (SQLiteDiskIOException e) {
                            this.A0E.A00(1);
                            throw e;
                        }
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } finally {
                        try {
                            A03.close();
                        } catch (Throwable unused2) {
                        }
                    }
                }
            } catch (SQLiteDiskIOException e2) {
                this.A0E.A00(1);
                throw e2;
            }
        } catch (SQLiteException e3) {
            Log.e("CallsMessageStore/getLegacyCalls/db/unavailable", e3);
            return arrayList;
        }
    }

    public void A07() {
        Integer num;
        C05E c05e = this.A0F;
        c05e.A05();
        if (!c05e.A01) {
            Log.i("CallsMessageStore/convertCallLogToV2/database is not ready");
            return;
        }
        C05R c05r = this.A07;
        if (c05r.A08()) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0J;
        reentrantReadWriteLock.writeLock().lock();
        long A02 = c05e.A02();
        try {
            C0CD A04 = c05e.A04();
            if (c05r.A08()) {
                A04.close();
                return;
            }
            C0HC c0hc = new C0HC();
            C03790Hb A00 = A04.A00();
            c0hc.A02 = "CallsMessageStore/convertCallLogToV2";
            c0hc.A03 = true;
            c0hc.A03();
            ArrayList A06 = A06(0, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, null);
            Collections.reverse(A06);
            Iterator it = A06.iterator();
            int i = 0;
            while (it.hasNext()) {
                C0D3 A01 = A01((C0D3) it.next());
                c05r.A07(A01);
                i++;
                A01.A02();
            }
            ArrayList arrayList = new ArrayList(((AbstractMap) this.A00.A06()).values());
            Collections.sort(arrayList, new Comparator() { // from class: X.1Nu
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return (((C0D3) obj).A08 > ((C0D3) obj2).A08 ? 1 : (((C0D3) obj).A08 == ((C0D3) obj2).A08 ? 0 : -1));
                }
            });
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0D3 c0d3 = (C0D3) it2.next();
                c05r.A07(c0d3);
                i++;
                c0d3.A02();
            }
            boolean A0B = A0B();
            A00.A00();
            A00.close();
            c0hc.A01();
            long A022 = c05e.A02();
            boolean z = A0B ? false : true;
            double d = A02;
            double d2 = A022;
            long A002 = c0hc.A00();
            C0O5 c0o5 = new C0O5();
            c0o5.A01 = Double.valueOf(d);
            c0o5.A00 = Double.valueOf(d2);
            c0o5.A09 = "call_log";
            c0o5.A02 = Double.valueOf(this.A03.A03());
            c0o5.A05 = Long.valueOf(A002);
            c0o5.A07 = Long.valueOf(i);
            c0o5.A08 = 0L;
            c0o5.A06 = 0L;
            if (z) {
                num = 2;
                c0o5.A04 = num;
            } else {
                num = 0;
                c0o5.A04 = num;
            }
            if (num.intValue() == 2) {
                this.A0H.A09(c0o5, 1);
                AnonymousClass011.A01(c0o5, "");
            } else {
                this.A0H.A0B(c0o5, null, false);
            }
            A04.close();
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public void A08(final C0D3 c0d3) {
        StringBuilder A0P = C000200d.A0P("CallsMessageStore/updateCallLog; callLog.key=");
        A0P.append(c0d3.A09);
        A0P.append("; callLog.row_id=");
        A0P.append(c0d3.A02());
        Log.i(A0P.toString());
        this.A05.A01(new Runnable() { // from class: X.1Nq
            {
                C0HY.this = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:58:0x001a, code lost:
                if (r7.A0B != false) goto L37;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r13 = this;
                    X.0HY r8 = X.C0HY.this
                    X.0D3 r7 = r2
                    long r1 = r7.A02()
                    r9 = -1
                    int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
                    if (r0 == 0) goto L93
                    X.05R r6 = r8.A07
                    monitor-enter(r6)
                    boolean r0 = r7.A0C     // Catch: java.lang.Throwable -> L90
                    r12 = 0
                    r2 = 1
                    if (r0 != 0) goto L1c
                    boolean r0 = r7.A0B     // Catch: java.lang.Throwable -> L90
                    r1 = 1
                    if (r0 == 0) goto L1d
                L1c:
                    r1 = 0
                L1d:
                    java.lang.String r0 = "Only regular call log is stored here"
                    X.C000700j.A09(r1, r0)     // Catch: java.lang.Throwable -> L90
                    long r3 = r7.A02()     // Catch: java.lang.Throwable -> L90
                    int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
                    r1 = 0
                    if (r0 == 0) goto L2c
                    r1 = 1
                L2c:
                    java.lang.String r0 = "CallLog row_id is not set"
                    X.C000700j.A09(r1, r0)     // Catch: java.lang.Throwable -> L90
                    boolean r0 = r7.A0G()     // Catch: java.lang.Throwable -> L90
                    if (r0 != 0) goto L39
                    monitor-exit(r6)
                    goto L6e
                L39:
                    X.05E r0 = r6.A01     // Catch: java.lang.Throwable -> L90
                    X.0CD r9 = r0.A04()     // Catch: java.lang.Throwable -> L90
                    X.0Hb r11 = r9.A00()     // Catch: java.lang.Throwable -> L89
                    X.0aM r0 = r7.A09     // Catch: java.lang.Throwable -> L82
                    android.content.ContentValues r10 = r6.A01(r7, r0)     // Catch: java.lang.Throwable -> L82
                    X.0CE r5 = r9.A02     // Catch: java.lang.Throwable -> L82
                    java.lang.String r4 = "call_log"
                    java.lang.String r3 = "_id = ?"
                    java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L82
                    long r0 = r7.A02()     // Catch: java.lang.Throwable -> L82
                    java.lang.String r0 = java.lang.Long.toString(r0)     // Catch: java.lang.Throwable -> L82
                    r2[r12] = r0     // Catch: java.lang.Throwable -> L82
                    r5.A00(r4, r10, r3, r2)     // Catch: java.lang.Throwable -> L82
                    r7.A05()     // Catch: java.lang.Throwable -> L82
                    r6.A05(r7)     // Catch: java.lang.Throwable -> L82
                    r11.A00()     // Catch: java.lang.Throwable -> L82
                    r11.close()     // Catch: java.lang.Throwable -> L89
                    r9.close()     // Catch: java.lang.Throwable -> L90
                    monitor-exit(r6)
                L6e:
                    X.06F r1 = r8.A00
                    X.0aM r0 = r7.A09
                    r1.A08(r0, r7)
                    X.0EO r0 = r8.A0B
                    android.os.Handler r1 = r0.A02
                    X.1No r0 = new X.1No
                    r0.<init>()
                    r1.post(r0)
                    return
                L82:
                    r0 = move-exception
                    throw r0     // Catch: java.lang.Throwable -> L84
                L84:
                    r0 = move-exception
                    r11.close()     // Catch: java.lang.Throwable -> L88
                L88:
                    throw r0     // Catch: java.lang.Throwable -> L89
                L89:
                    r0 = move-exception
                    throw r0     // Catch: java.lang.Throwable -> L8b
                L8b:
                    r0 = move-exception
                    r9.close()     // Catch: java.lang.Throwable -> L8f
                L8f:
                    throw r0     // Catch: java.lang.Throwable -> L90
                L90:
                    r0 = move-exception
                    monitor-exit(r6)
                    throw r0
                L93:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC27501Nq.run():void");
            }
        }, 16);
    }

    public final void A09(C0D3 c0d3) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0J;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.A07.A07(c0d3);
            StringBuilder sb = new StringBuilder();
            sb.append("CallsMessageStore/insertCallLog; callLog.key=");
            sb.append(c0d3.A09);
            sb.append("; callLog.getRowId()=");
            sb.append(c0d3.A02());
            Log.i(sb.toString());
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public void A0A(final Collection collection) {
        StringBuilder A0P = C000200d.A0P("CallsMessageStore/deleteCallLogs ");
        A0P.append(collection.size());
        Log.i(A0P.toString());
        this.A05.A01(new Runnable() { // from class: X.1Nv
            {
                C0HY.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final C0HY c0hy = C0HY.this;
                Collection<C0D3> collection2 = collection;
                final HashMap hashMap = new HashMap();
                final ArrayList arrayList = new ArrayList();
                ReentrantReadWriteLock reentrantReadWriteLock = c0hy.A0J;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    for (C0D3 c0d3 : collection2) {
                        if (!c0d3.A0B) {
                            if (c0d3.A06 instanceof C10050fD) {
                                C05R c05r = c0hy.A07;
                                if (c05r.A08()) {
                                    c05r.A06(C0HY.A01(c0d3));
                                } else {
                                    C10050fD c10050fD = (C10050fD) c0d3.A06;
                                    boolean z = c0d3.A0C;
                                    if (!z) {
                                        List list = ((AbstractC04290Jp) c10050fD).A02;
                                        Iterator it = list.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            C0D3 c0d32 = (C0D3) it.next();
                                            if (c0d32.A09.A00 == c0d3.A09.A00) {
                                                list.remove(c0d32);
                                                break;
                                            }
                                        }
                                    }
                                    C0CD A04 = c05r.A01.A04();
                                    if (c0d3.A02() != -1) {
                                        A04.A02.A01("call_logs", "_id=?", new String[]{Long.toString(c0d3.A02())});
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("CallLogStore/deleteCallLog/callLog.key=");
                                    sb.append(c0d3.A09);
                                    Log.i(sb.toString());
                                    A04.close();
                                    if (z || c10050fD.A19().isEmpty()) {
                                        hashMap.put(c10050fD.A0n.A00, Integer.valueOf(c0hy.A0A.A06(c10050fD, 0, false)));
                                        arrayList.add(c10050fD);
                                    }
                                }
                            } else {
                                c0hy.A07.A06(c0d3);
                            }
                        }
                        c0hy.A00.A05(c0d3.A09);
                    }
                    c0hy.A0B.A01.post(new Runnable() { // from class: X.1Nm
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0HY c0hy2 = c0hy;
                            c0hy2.A0D.A08(arrayList, hashMap, null);
                            c0hy2.A0I.A02();
                        }
                    });
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
        }, 17);
    }

    public final boolean A0B() {
        if (this.A07.A08()) {
            return true;
        }
        C012506c c012506c = this.A0C.A01;
        synchronized (c012506c) {
            Iterator it = new HashSet(((LinkedHashMap) c012506c.A01.A06()).values()).iterator();
            while (it.hasNext()) {
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
                if (C10050fD.class.isAssignableFrom(anonymousClass092.getClass())) {
                    c012506c.A01.A05(anonymousClass092.A0n);
                }
            }
            ArrayList arrayList = new ArrayList();
            for (WeakReference weakReference : c012506c.A02.values()) {
                AnonymousClass092 anonymousClass0922 = (AnonymousClass092) weakReference.get();
                if (C10050fD.class.isAssignableFrom(anonymousClass0922.getClass())) {
                    arrayList.add(anonymousClass0922.A0n);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c012506c.A02.remove((AnonymousClass094) it2.next());
            }
        }
        try {
            C0CD A04 = this.A0F.A04();
            C03790Hb A00 = A04.A00();
            try {
                C0CE c0ce = A04.A02;
                c0ce.A0C("DELETE FROM messages WHERE media_wa_type = 8");
                c0ce.A0C(C000200d.A0H("DROP TABLE IF EXISTS ", "call_logs"));
                c0ce.A0C(C000200d.A0H("DROP TABLE IF EXISTS ", "call_log_participant"));
                this.A0G.A04("call_log_ready", 1);
                A00.A00();
                A04.close();
                return true;
            } finally {
            }
        } catch (SQLiteException e) {
            Log.e("CallsMessageStore/clearLegacyCallLog", e);
            this.A01.A09("db-migration-call-log-failure", e.toString(), false);
            Log.i("CallsMessageStore/clearLegacyCallLog");
            return false;
        }
    }
}
