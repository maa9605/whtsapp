package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendReadReceiptJob;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0EN */
/* loaded from: classes.dex */
public class C0EN {
    public static volatile C0EN A06;
    public final C0E6 A00;
    public final C05S A01;
    public final C0FP A02;
    public final C05Y A03;
    public final C0EF A04;
    public final C0EJ A05;

    public C0EN(C0E6 c0e6, C05Y c05y, C05S c05s, C0EF c0ef, C0EJ c0ej, C0FP c0fp) {
        this.A00 = c0e6;
        this.A03 = c05y;
        this.A01 = c05s;
        this.A04 = c0ef;
        this.A05 = c0ej;
        this.A02 = c0fp;
    }

    public static C0EN A00() {
        if (A06 == null) {
            synchronized (C0EN.class) {
                if (A06 == null) {
                    A06 = new C0EN(C0E6.A00(), C05Y.A01(), C05S.A00(), C0EF.A00(), C0EJ.A00(), C0FP.A00());
                }
            }
        }
        return A06;
    }

    public final void A01(long j) {
        int i;
        C0EJ c0ej = this.A05;
        if (c0ej.A01(0, j) != null) {
            i = 6;
        } else {
            i = -1;
            if (c0ej.A04(j) != null) {
                i = 5;
            }
        }
        AbstractC05150Nn A02 = c0ej.A02(j);
        if (i == -1 || A02 == null) {
            return;
        }
        A02.A00(i);
    }

    public void A02(AnonymousClass092 anonymousClass092) {
        byte b = anonymousClass092.A0m;
        if (b == 31) {
            A03(anonymousClass092, null);
        } else if (!C003101m.A0Y(anonymousClass092.A0A()) && !anonymousClass092.A0i) {
            if (anonymousClass092.A08 == 13) {
                C0EF c0ef = this.A04;
                if (c0ef != null) {
                    if (c0ef.A01(anonymousClass092.A0n.A00) && anonymousClass092.A0E >= 1415214000000L && b != 15 && !anonymousClass092.A0w) {
                        if (anonymousClass092.A0x) {
                            if (!c0ef.A03(anonymousClass092)) {
                                long j = anonymousClass092.A0s;
                                Message obtain = Message.obtain(null, 0, 9, 0, anonymousClass092);
                                A01(j);
                                this.A03.A09(obtain);
                            }
                            anonymousClass092.A0x = false;
                        }
                        A04(anonymousClass092, true);
                        return;
                    }
                } else {
                    throw null;
                }
            }
            long j2 = anonymousClass092.A0s;
            Message obtain2 = Message.obtain(null, 0, 9, 0, anonymousClass092);
            A01(j2);
            this.A03.A09(obtain2);
        }
    }

    public void A03(AnonymousClass092 anonymousClass092, String str) {
        long j = anonymousClass092.A0s;
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (abstractC005302j != null) {
            AbstractC005302j A0A = anonymousClass092.A0A();
            String str2 = anonymousClass094.A01;
            AbstractC005302j abstractC005302j2 = abstractC005302j;
            if (C003101m.A0P(A0A)) {
                abstractC005302j2 = A0A;
                A0A = abstractC005302j;
            }
            Message obtain = Message.obtain(null, 0, 129, 0, new C07570Yt(str2, abstractC005302j2, A0A, str, null, j));
            A01(j);
            this.A03.A09(obtain);
            return;
        }
        throw null;
    }

    public void A04(AnonymousClass092 anonymousClass092, boolean z) {
        byte b;
        DeviceJid deviceJid;
        if (anonymousClass092.A08 != 16 && (b = anonymousClass092.A0m) != 15 && b != 19 && b != 21 && !C0Ho.A0N(anonymousClass092)) {
            AbstractC005302j A0A = anonymousClass092.A0A();
            C0E6 c0e6 = this.A00;
            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
            AbstractC005302j abstractC005302j = anonymousClass094.A00;
            if (abstractC005302j != null) {
                if (z) {
                    deviceJid = anonymousClass092.A0v;
                } else {
                    deviceJid = null;
                }
                c0e6.A01(new SendReadReceiptJob(abstractC005302j, A0A, deviceJid, new String[]{anonymousClass094.A01}, anonymousClass092.A0E, anonymousClass092.A0s));
            } else {
                throw null;
            }
        }
        AbstractC005302j abstractC005302j2 = anonymousClass092.A0n.A00;
        if (C003101m.A0Z(abstractC005302j2) || !this.A04.A03(anonymousClass092)) {
            return;
        }
        if (anonymousClass092.A08 == 17) {
            anonymousClass092.A0Y(16);
            try {
                this.A01.A08(anonymousClass092, false);
                return;
            } catch (IOException e) {
                Log.e("Failed to update msg status back to 16", e);
                return;
            }
        }
        C0FP c0fp = this.A02;
        if (abstractC005302j2 != null) {
            c0fp.A01(abstractC005302j2, anonymousClass092.A0p);
            return;
        }
        throw null;
    }

    public void A05(C05190Nr c05190Nr) {
        if (c05190Nr.A0U) {
            return;
        }
        AnonymousClass092 anonymousClass092 = c05190Nr.A0A;
        if (anonymousClass092 != null) {
            A02(anonymousClass092);
            return;
        }
        long j = c05190Nr.A04;
        Message obtain = Message.obtain(null, 0, 9, 0, c05190Nr.A04((byte) 0));
        A01(j);
        this.A03.A09(obtain);
    }

    public void A06(C05190Nr c05190Nr, String str, String str2) {
        if (c05190Nr != null) {
            long j = c05190Nr.A04;
            AbstractC005302j A02 = c05190Nr.A02();
            AbstractC005302j A04 = C003101m.A04(c05190Nr.A06);
            String str3 = c05190Nr.A0d;
            AbstractC005302j abstractC005302j = A02;
            if (C003101m.A0P(A04)) {
                abstractC005302j = A04;
                A04 = A02;
            }
            Message obtain = Message.obtain(null, 0, 129, 0, new C07570Yt(str3, abstractC005302j, A04, str, str2, j));
            A01(j);
            this.A03.A09(obtain);
        }
    }

    public void A07(C04420Kc c04420Kc) {
        A09(c04420Kc.A07, c04420Kc.A00, c04420Kc.A01, c04420Kc.A00(), c04420Kc.A08);
    }

    public void A08(String str, long j, Jid jid) {
        A09(str, j, jid, null, "web");
    }

    public void A09(String str, long j, Jid jid, Jid jid2, String str2) {
        if (str != null) {
            Message obtain = Message.obtain(null, 0, 28, 0, new C07570Yt(str, jid, jid2, str2, null, j));
            A01(j);
            this.A03.A09(obtain);
        }
    }

    public void A0A(Collection collection) {
        C0Hr A01;
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
            if (anonymousClass092.A08 == 16) {
                StringBuilder A0P = C000200d.A0P("skipping read receipt since its already sent; message.key=");
                A0P.append(anonymousClass092.A0n);
                Log.i(A0P.toString());
            } else {
                byte b = anonymousClass092.A0m;
                if (b == 11) {
                    StringBuilder A0P2 = C000200d.A0P("skipping read receipt due to decryption failure; message.key=");
                    A0P2.append(anonymousClass092.A0n);
                    Log.i(A0P2.toString());
                } else if (b == 31) {
                    StringBuilder A0P3 = C000200d.A0P("skipping read receipt due to multi device placeholder; message.key=");
                    A0P3.append(anonymousClass092.A0n);
                    Log.i(A0P3.toString());
                } else if (b == 15) {
                    Log.i("skip read receipt for revoked message");
                } else if (b == 19) {
                    StringBuilder A0P4 = C000200d.A0P("skip read receipt for hsm rejection message. key=");
                    A0P4.append(anonymousClass092.A0n);
                    Log.i(A0P4.toString());
                } else if (b == 21) {
                    Log.i("skip sending read receipt for request declined message.");
                } else {
                    AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                    C27861Pb c27861Pb = new C27861Pb(anonymousClass094.A00, anonymousClass092.A0A());
                    AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(c27861Pb);
                    if (abstractCollection == null) {
                        abstractCollection = new ArrayList();
                        hashMap.put(c27861Pb, abstractCollection);
                    }
                    abstractCollection.add(anonymousClass094.A01);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            int size = ((AbstractCollection) entry.getValue()).size();
            int i = 0;
            while (i < size) {
                int min = Math.min(i + 256, size);
                this.A00.A01(new SendReadReceiptJob(((C27861Pb) entry.getKey()).A00, ((C27861Pb) entry.getKey()).A01, null, (String[]) ((AbstractList) entry.getValue()).subList(i, min).toArray(new String[0]), -1L, 0L));
                i = min;
            }
        }
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            AnonymousClass092 anonymousClass0922 = (AnonymousClass092) it2.next();
            if (this.A04.A03(anonymousClass0922)) {
                if (anonymousClass0922.A08 == 17) {
                    anonymousClass0922.A0Y(16);
                    try {
                        this.A01.A08(anonymousClass0922, false);
                    } catch (IOException e) {
                        Log.e("Failed to update msg status back to 16", e);
                    }
                } else {
                    AbstractC005302j abstractC005302j = anonymousClass0922.A0n.A00;
                    if (C003101m.A0Z(abstractC005302j)) {
                        AbstractC005302j A0A = anonymousClass0922.A0A();
                        if (C003101m.A0b(A0A)) {
                            Number number = (Number) hashMap3.get(A0A);
                            if (number == null) {
                                hashMap3.put(A0A, Long.valueOf(anonymousClass0922.A0p));
                            } else {
                                hashMap3.put(A0A, Long.valueOf(Math.max(number.longValue(), anonymousClass0922.A0p)));
                            }
                        }
                    } else {
                        Number number2 = (Number) hashMap2.get(abstractC005302j);
                        if (number2 == null) {
                            hashMap2.put(abstractC005302j, Long.valueOf(anonymousClass0922.A0p));
                        } else {
                            hashMap2.put(abstractC005302j, Long.valueOf(Math.max(number2.longValue(), anonymousClass0922.A0p)));
                        }
                    }
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            this.A02.A01((AbstractC005302j) entry2.getKey(), ((Number) entry2.getValue()).longValue());
        }
        for (Map.Entry entry3 : hashMap3.entrySet()) {
            C0FP c0fp = this.A02;
            UserJid userJid = (UserJid) entry3.getKey();
            long longValue = ((Number) entry3.getValue()).longValue();
            StringBuilder sb = new StringBuilder("msgstore/setstatusreadreceiptssent/");
            sb.append(userJid);
            sb.append(" ");
            sb.append(longValue);
            Log.i(sb.toString());
            C0EB c0eb = c0fp.A08;
            C0Hr A07 = c0eb.A07(userJid);
            if (A07 == null) {
                StringBuilder sb2 = new StringBuilder("msgstore/setstatusreadreceiptssent/no status for ");
                sb2.append(userJid);
                Log.w(sb2.toString());
            } else {
                synchronized (A07) {
                    if (longValue > A07.A05) {
                        A07.A05 = longValue;
                    }
                    A01 = A07.A01();
                }
                try {
                    long j = A01.A05;
                    boolean A0I = c0eb.A0I();
                    C0CD A04 = c0eb.A02.A04();
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("last_read_receipt_sent_message_table_id", Long.valueOf(j));
                        C0CE c0ce = A04.A02;
                        String str = A0I ? "status_list" : "status";
                        String str2 = A0I ? "key_remote_jid=?" : "jid_row_id=?";
                        String[] A0L = c0eb.A0L(A0I, userJid);
                        C0EB.A01("updateLastReadReceiptSentMessageRowId/UPDATE", A0I);
                        if (c0ce.A00(str, contentValues, str2, A0L) == 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("StatusStore/updateLastReadReceiptSentMessageTableId/no status saved for ");
                            sb3.append(userJid);
                            sb3.append("; shouldUseDeprecatedTable=");
                            sb3.append(A0I);
                            Log.e(sb3.toString());
                        }
                        A04.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                            break;
                        } catch (Throwable th2) {
                            try {
                                A04.close();
                            } catch (Throwable unused) {
                            }
                            throw th2;
                            break;
                        }
                    }
                } catch (SQLiteDatabaseCorruptException e2) {
                    Log.e(e2);
                    c0fp.A06.A03();
                } catch (Error e3) {
                    e = e3;
                    Log.e(e);
                    throw e;
                } catch (RuntimeException e4) {
                    e = e4;
                    Log.e(e);
                    throw e;
                }
            }
        }
    }
}
