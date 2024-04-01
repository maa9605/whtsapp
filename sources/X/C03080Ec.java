package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDiskIOException;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0Ec */
/* loaded from: classes.dex */
public class C03080Ec {
    public static volatile C03080Ec A0M;
    public List A00;
    public final C018508q A01;
    public final C03160Eo A02;
    public final C05W A03;
    public final C018708s A04;
    public final C0L5 A05;
    public final C02E A06;
    public final C001200o A07;
    public final C005102h A08;
    public final C000500h A09;
    public final C002301c A0A;
    public final C0HY A0B;
    public final C03340Fh A0C;
    public final C0C8 A0D;
    public final C05E A0E;
    public final C0L9 A0F;
    public final C0CB A0G;
    public final C03070Ea A0H;
    public final C0H9 A0I;
    public final InterfaceC002901k A0J;
    public final C05480Ox A0K;
    public final C0L6 A0L;

    public C03080Ec(C001200o c001200o, C018508q c018508q, C03070Ea c03070Ea, InterfaceC002901k interfaceC002901k, C05480Ox c05480Ox, C0L5 c0l5, C0L6 c0l6, C03160Eo c03160Eo, C05W c05w, C02E c02e, C018708s c018708s, C002301c c002301c, C0H9 c0h9, C0HY c0hy, C0CB c0cb, C0L9 c0l9, C05E c05e, C000500h c000500h, C03340Fh c03340Fh, C005102h c005102h, C0C8 c0c8) {
        this.A07 = c001200o;
        this.A01 = c018508q;
        this.A0H = c03070Ea;
        this.A0J = interfaceC002901k;
        this.A0K = c05480Ox;
        this.A05 = c0l5;
        this.A0L = c0l6;
        this.A02 = c03160Eo;
        this.A03 = c05w;
        this.A06 = c02e;
        this.A04 = c018708s;
        this.A0A = c002301c;
        this.A0I = c0h9;
        this.A0B = c0hy;
        this.A0G = c0cb;
        this.A0F = c0l9;
        this.A0E = c05e;
        this.A09 = c000500h;
        this.A0C = c03340Fh;
        this.A08 = c005102h;
        this.A0D = c0c8;
    }

    public static C03080Ec A00() {
        if (A0M == null) {
            synchronized (C03080Ec.class) {
                if (A0M == null) {
                    A0M = new C03080Ec(C001200o.A01, C018508q.A00(), C03070Ea.A00(), C002801j.A00(), C05480Ox.A00, C0L5.A01(), C0L6.A00(), C03160Eo.A00(), C05W.A00(), C02E.A00(), C018708s.A00(), C002301c.A00(), C0H9.A00(), C0HY.A00(), C0CB.A00(), C0L9.A00(), C05E.A00(), C000500h.A00(), C03340Fh.A00, C005102h.A00(), C0C8.A00());
                }
            }
        }
        return A0M;
    }

    public final String A01(C0D3 c0d3) {
        ArrayList arrayList = new ArrayList();
        if (c0d3.A05 != null) {
            Iterator it = ((AbstractCollection) c0d3.A04()).iterator();
            while (it.hasNext()) {
                arrayList.add(((C0D4) it.next()).A02);
            }
            return AnonymousClass029.A0q(c0d3.A05, arrayList, this.A03, this.A0D, this.A04);
        }
        return null;
    }

    public void A02() {
        A04();
        if (this.A00.isEmpty()) {
            return;
        }
        StringBuilder A0P = C000200d.A0P("missedcallnotification/clear ");
        A0P.append(this.A00.size());
        Log.i(A0P.toString());
        C000200d.A0f(this.A09, "first_missed_call");
        this.A00.clear();
        A03();
        C018508q c018508q = this.A01;
        final C03340Fh c03340Fh = this.A0C;
        c018508q.A02.post(new Runnable() { // from class: X.1Ph
            @Override // java.lang.Runnable
            public final void run() {
                c03340Fh.A02();
            }
        });
        this.A02.A02();
    }

    public void A03() {
        C000200d.A1C("missedcallnotification/clearNotification updateHash=", true);
        this.A08.A05(null, 4);
        C000500h c000500h = this.A09;
        C000200d.A0i(c000500h, "dismissed_call_notification_hash", c000500h.A00.getString("last_call_notification_hash", null));
    }

    public final synchronized void A04() {
        ArrayList arrayList;
        C0CD A03;
        if (this.A00 == null) {
            long j = this.A09.A00.getLong("first_missed_call", 0L);
            if (j > 0) {
                C0HY c0hy = this.A0B;
                arrayList = new ArrayList();
                ReentrantReadWriteLock reentrantReadWriteLock = c0hy.A0J;
                reentrantReadWriteLock.readLock().lock();
                C05R c05r = c0hy.A07;
                if (c05r.A08()) {
                    ArrayList arrayList2 = new ArrayList();
                    A03 = c05r.A01.A03();
                    try {
                        C0CE c0ce = A03.A02;
                        Cursor A07 = c0ce.A07("SELECT _id, call_id, jid_row_id, from_me, transaction_id, timestamp, video_call, duration, call_result, bytes_transferred, group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id FROM call_log WHERE call_result = 2 AND from_me = 0 AND timestamp >= ? ORDER BY _id DESC LIMIT 100", new String[]{Long.toString(j)});
                        if (A07 != null) {
                            int columnIndex = A07.getColumnIndex("_id");
                            if (A07.moveToLast()) {
                                do {
                                    Cursor A072 = c0ce.A07("SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id", new String[]{Long.toString(A07.getLong(columnIndex))});
                                    try {
                                        C0D3 A02 = c05r.A02(A07, A072);
                                        if (A02 != null) {
                                            arrayList2.add(A02);
                                        }
                                        if (A072 != null) {
                                            A072.close();
                                        }
                                    } finally {
                                    }
                                } while (A07.moveToPrevious());
                            }
                            A07.close();
                        }
                        A03.close();
                        C000200d.A1W(arrayList2, new StringBuilder("CallLogStore/getMissedCalls/size:"));
                        arrayList.addAll(arrayList2);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    try {
                        C05E c05e = c0hy.A0F;
                        A03 = c05e.A03();
                        try {
                            C0CE c0ce2 = A03.A02;
                            String str = C0HD.A0l;
                            String l = Long.toString(j);
                            Cursor A073 = c0ce2.A07(str, new String[]{l});
                            if (A073 != null) {
                                if (A073.moveToLast()) {
                                    do {
                                        AbstractC005302j A09 = c0hy.A08.A09(A073);
                                        if (UserJid.of(A09) == null) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("CallsMessageStore/getLegacyCallsFromMessageTable/Userjid is null! Got: ");
                                            sb.append(A09);
                                            Log.w(sb.toString());
                                        } else {
                                            C10050fD c10050fD = (C10050fD) c0hy.A06.A03(A073, A09);
                                            if (c10050fD != null) {
                                                arrayList4.add(c10050fD.A18());
                                            }
                                        }
                                    } while (A073.moveToPrevious());
                                }
                                A073.close();
                            }
                            A03.close();
                            C000200d.A1W(arrayList4, C000200d.A0P("CallsMessageStore/getLegacyMissedCallsFromMessageTable/size:"));
                            arrayList3.addAll(arrayList4);
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                A03 = c05e.A03();
                                try {
                                    Cursor A074 = A03.A02.A07(C0HD.A0m, new String[]{l});
                                    if (A074 != null) {
                                        int columnIndexOrThrow = A074.getColumnIndexOrThrow("transaction_id");
                                        if (A074.moveToLast()) {
                                            do {
                                                AbstractC005302j A092 = c0hy.A08.A09(A074);
                                                if (UserJid.of(A092) == null) {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append("CallsMessageStore/getLegacyCallsFromMessageTable/Userjid is null! Got: ");
                                                    sb2.append(A092);
                                                    Log.w(sb2.toString());
                                                } else {
                                                    int i = A074.getInt(columnIndexOrThrow);
                                                    C10050fD c10050fD2 = (C10050fD) c0hy.A06.A03(A074, A092);
                                                    if (c10050fD2 != null) {
                                                        Iterator it = ((AbstractC04290Jp) c10050fD2).A02.iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                break;
                                                            }
                                                            C0D3 c0d3 = (C0D3) it.next();
                                                            if (c0d3.A09.A00 == i) {
                                                                arrayList5.add(c0d3);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            } while (A074.moveToPrevious());
                                        }
                                        A074.close();
                                    }
                                    C000200d.A1W(arrayList5, C000200d.A0P("CallsMessageStore/getMissedCallsFromCallLogTable/size:"));
                                    arrayList3.addAll(arrayList5);
                                    arrayList.addAll(arrayList3);
                                    for (C0D3 c0d32 : ((LinkedHashMap) c0hy.A00.A06()).values()) {
                                        if (c0d32.A0F() && c0d32.A08 >= j) {
                                            arrayList.add(c0d32);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } finally {
                                        try {
                                            A03.close();
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }
                            } catch (SQLiteDiskIOException e) {
                                c0hy.A0E.A00(1);
                                throw e;
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } finally {
                                try {
                                    A03.close();
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                    } catch (SQLiteDiskIOException e2) {
                        c0hy.A0E.A00(1);
                        throw e2;
                    }
                }
                reentrantReadWriteLock.readLock().unlock();
                C000200d.A1W(arrayList, new StringBuilder("CallsMessageStore/getMissedCalls/size:"));
                Collections.sort(arrayList, new Comparator() { // from class: X.1Nn
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return (((C0D3) obj).A08 > ((C0D3) obj2).A08 ? 1 : (((C0D3) obj).A08 == ((C0D3) obj2).A08 ? 0 : -1));
                    }
                });
                this.A00 = arrayList;
            } else {
                arrayList = new ArrayList();
                this.A00 = arrayList;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("missedcallnotification/init count:");
            sb3.append(arrayList.size());
            sb3.append(" timestamp:");
            sb3.append(j);
            Log.i(sb3.toString());
        }
    }

    public void A05(final boolean z) {
        C05E c05e = this.A0E;
        c05e.A05();
        if (c05e.A01) {
            this.A0J.AS1(new Runnable() { // from class: X.1Pg
                {
                    C03080Ec.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C03080Ec.this.A06(z);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x0072, code lost:
        if (r1.A0E == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x007b, code lost:
        if (r1.A0E != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0086, code lost:
        if (r1.A0E() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x00d8, code lost:
        if (r10 != false) goto L209;
     */
    /* JADX WARN: Removed duplicated region for block: B:376:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x048b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void A06(boolean r29) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03080Ec.A06(boolean):void");
    }
}
