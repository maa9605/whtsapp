package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1wE */
/* loaded from: classes2.dex */
public class RunnableC42731wE extends RunnableEmptyBase implements Runnable {
    public long A00 = 0;
    public final int A01;
    public final AbstractC000600i A02;
    public final AnonymousClass012 A03;
    public final C3A1 A04;
    public final C05A A05;
    public final C0C9 A06;
    public final AnonymousClass070 A07;
    public final C0GV A08;
    public final C26T A09;
    public final C0E9 A0A;
    public final C013006h A0B;

    public RunnableC42731wE(AnonymousClass012 anonymousClass012, C05A c05a, AbstractC000600i abstractC000600i, C0C9 c0c9, C0E9 c0e9, C013006h c013006h, AnonymousClass070 anonymousClass070, C0GV c0gv, C26T c26t, C3A1 c3a1, int i) {
        this.A03 = anonymousClass012;
        this.A05 = c05a;
        this.A02 = abstractC000600i;
        this.A06 = c0c9;
        this.A0A = c0e9;
        this.A0B = c013006h;
        this.A07 = anonymousClass070;
        this.A08 = c0gv;
        this.A09 = c26t;
        this.A04 = c3a1;
        this.A01 = i;
    }

    public int A00(long j, int i) {
        Cursor A07;
        int i2 = this.A01;
        if (i == 0) {
            C0CD A03 = this.A07.A05.A03();
            try {
                C0CE c0ce = A03.A02;
                StringBuilder sb = new StringBuilder();
                sb.append(C0HD.A1A);
                if (i2 > 0) {
                    sb.append(" LIMIT ");
                    sb.append(i2);
                }
                A07 = c0ce.A07(sb.toString(), new String[]{Long.toString(j)});
                A03.close();
            } finally {
                try {
                    throw th;
                } finally {
                    try {
                        A03.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        } else if (i == 1) {
            C013006h c013006h = this.A0B;
            if (i2 == 0) {
                i2 = -1;
            }
            try {
                A07 = c013006h.A00.A03().A02.A07(C0HD.A1E, new String[]{String.valueOf(i2)});
            } finally {
            }
        } else {
            throw new IllegalArgumentException("Invalid job type");
        }
        try {
            ArrayList<AnonymousClass092> arrayList = new ArrayList();
            int i3 = 0;
            int i4 = 0;
            if (A07 != null) {
                while (A07.moveToNext()) {
                    AbstractC005302j A08 = this.A05.A08(A07.getLong(A07.getColumnIndexOrThrow("chat_row_id")));
                    if (A08 == null) {
                        i3++;
                    } else {
                        Map map = this.A08.A03;
                        if (map.get(A08) == null && map.get(null) == null) {
                            AnonymousClass092 A032 = this.A06.A0H.A03(A07, A08);
                            if (A032 != null) {
                                arrayList.add(A032);
                            } else {
                                Log.e("EphemeralDeletionRunnable/failed to get message");
                            }
                        } else {
                            i4 = 2;
                        }
                    }
                }
                if (i3 > 0) {
                    AbstractC000600i abstractC000600i = this.A02;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("count: ");
                    sb2.append(i3);
                    abstractC000600i.A09("EphemeralDeletionRunnable/deleteExpiredMessages/null_jid", sb2.toString(), false);
                }
            }
            if (!arrayList.isEmpty()) {
                C000200d.A0q("EphemeralDeletionRunnable/performDeleteForJob: ", i);
                if (i == 0) {
                    this.A06.A0d(arrayList, 15);
                } else if (i == 1) {
                    C0C9 c0c9 = this.A06;
                    if (c0c9 != null) {
                        for (AnonymousClass092 anonymousClass092 : arrayList) {
                            if (anonymousClass092 instanceof AnonymousClass097) {
                                AnonymousClass097 anonymousClass097 = (AnonymousClass097) anonymousClass092;
                                C000700j.A00();
                                if (anonymousClass097.A02 != null) {
                                    c0c9.A0a(anonymousClass097, true);
                                    C06J c06j = c0c9.A0f;
                                    C09H c09h = anonymousClass097.A02;
                                    if (c09h != null && c09h.A0F != null) {
                                        c09h.A0A = 0L;
                                        c09h.A0F = null;
                                        c09h.A0G = null;
                                        c09h.A0U = null;
                                        c06j.A0A(anonymousClass097);
                                    }
                                }
                            }
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw new IllegalArgumentException("Invalid job type");
                }
            }
            int i5 = arrayList.size() != i2 ? i4 : 1;
            if (A07 != null) {
                A07.close();
            }
            return i5;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (A07 != null) {
                    try {
                        A07.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int A01;
        AnonymousClass012 anonymousClass012 = this.A03;
        long A05 = anonymousClass012.A05();
        int A00 = A00(A05, 0);
        int A002 = A00(A05, 1);
        Long l = null;
        if (A00 == 1 || A002 == 1) {
            l = 0L;
        } else if (A00 == 0) {
            long j = this.A00;
            if (j == 0 || TimeUnit.NANOSECONDS.toDays(System.nanoTime() - j) > 0) {
                C0HC c0hc = new C0HC("EphemeralDeletionRunnable/deleteSharedSecrets");
                do {
                    HashSet hashSet = new HashSet();
                    C26T c26t = this.A09;
                    if (c26t != null) {
                        HashSet hashSet2 = new HashSet();
                        try {
                            C0CD A03 = c26t.A00.A03();
                            Cursor A07 = A03.A02.A07("SELECT message_row_id FROM message_broadcast_ephemeral ORDER BY message_row_id LIMIT ?", new String[]{Integer.toString(100)});
                            if (A07 != null) {
                                while (A07.moveToNext()) {
                                    hashSet2.add(Long.valueOf(A07.getLong(0)));
                                }
                                A07.close();
                            }
                            A03.close();
                        } catch (Exception e) {
                            StringBuilder sb = new StringBuilder("Unable to get message_row_id from message_broadcast_ephemeral batchSize=");
                            sb.append(100);
                            Log.e(sb.toString(), e);
                        }
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            Number number = (Number) it.next();
                            C0E9 c0e9 = this.A0A;
                            Iterator it2 = c0e9.A02(number.longValue(), null).A00.entrySet().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it2.next();
                                    DeviceJid deviceJid = (DeviceJid) entry.getKey();
                                    C05280Oa c05280Oa = (C05280Oa) entry.getValue();
                                    if (!c0e9.A03.A0A(deviceJid) || !(!deviceJid.isPrimary()) || c05280Oa.A00 > 0) {
                                    }
                                } else {
                                    hashSet.add(String.valueOf(number));
                                    break;
                                }
                            }
                        }
                        if (c26t != null) {
                            if (hashSet.isEmpty()) {
                                break;
                            }
                            try {
                                C0CD A04 = c26t.A00.A04();
                                C0CE c0ce = A04.A02;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("message_row_id IN ");
                                sb2.append(C05P.A01(hashSet.size()));
                                A01 = c0ce.A01("message_broadcast_ephemeral", sb2.toString(), (String[]) hashSet.toArray(new String[0]));
                                A04.close();
                            } catch (Exception e2) {
                                Log.e("Unable to delete shared secrets", e2);
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } while (A01 == 100);
                c0hc.A01();
                this.A00 = System.nanoTime();
            }
            C0CD A032 = this.A07.A05.A03();
            try {
                Cursor A072 = A032.A02.A07("SELECT expire_timestamp FROM message_ephemeral WHERE expire_timestamp>=? ORDER BY expire_timestamp LIMIT 1", new String[]{Long.toString(A05)});
                if (A072 != null) {
                    if (A072.moveToNext()) {
                        Long valueOf = Long.valueOf(A072.getLong(0));
                        A072.close();
                        A032.close();
                        if (valueOf != null) {
                            long longValue = valueOf.longValue() - anonymousClass012.A05();
                            if (longValue <= 0) {
                                l = 0L;
                            } else {
                                l = Long.valueOf(longValue);
                            }
                        }
                    } else {
                        A072.close();
                    }
                }
                A032.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        A032.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
        }
        C3A1 c3a1 = this.A04;
        if (c3a1 != null) {
            C42711wC c42711wC = c3a1.A00;
            if (l != null) {
                c42711wC.A07.execute(new RunnableEBaseShape1S0200000_I0_1(c42711wC, l, 43));
            }
        }
    }
}
