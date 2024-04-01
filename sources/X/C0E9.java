package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0E9 */
/* loaded from: classes.dex */
public class C0E9 {
    public static volatile C0E9 A0A;
    public int A00 = 200;
    public final C06F A01 = new C06F(250);
    public final AbstractC000600i A02;
    public final C02L A03;
    public final C05Q A04;
    public final C05B A05;
    public final C05N A06;
    public final C05E A07;
    public final C05C A08;
    public final C05P A09;

    public C0E9(C05B c05b, AbstractC000600i abstractC000600i, C02L c02l, C05C c05c, C05Q c05q, C05E c05e, C05P c05p, C05N c05n) {
        this.A05 = c05b;
        this.A02 = abstractC000600i;
        this.A03 = c02l;
        this.A08 = c05c;
        this.A04 = c05q;
        this.A07 = c05e;
        this.A09 = c05p;
        this.A06 = c05n;
    }

    public static C0E9 A00() {
        if (A0A == null) {
            synchronized (C0E9.class) {
                if (A0A == null) {
                    A0A = new C0E9(C05B.A00(), AbstractC000600i.A00(), C02L.A00(), C05C.A00(), C05Q.A00(), C05E.A00(), C05P.A00(), C05N.A00());
                }
            }
        }
        return A0A;
    }

    public static boolean A01(C0E9 c0e9, long j, UserJid userJid) {
        if (c0e9 != null) {
            long A02 = c0e9.A05.A02(userJid.getPrimaryDevice());
            try {
                C0CD A04 = c0e9.A07.A04();
                ContentValues contentValues = new ContentValues(2);
                contentValues.put("message_row_id", Long.valueOf(j));
                contentValues.put("receipt_device_jid_row_id", Long.valueOf(A02));
                if (A04.A02.A02("receipt_device", contentValues) != -1) {
                    A04.close();
                    return true;
                }
                A04.close();
                return false;
            } catch (SQLiteDatabaseCorruptException e) {
                Log.e(e);
                c0e9.A06.A03();
                return false;
            }
        }
        throw null;
    }

    public final C0OZ A02(long j, AnonymousClass094 anonymousClass094) {
        C0OZ c0oz = new C0OZ();
        String[] strArr = {String.valueOf(j)};
        try {
            C0CD A03 = this.A07.A03();
            Cursor A07 = A03.A02.A07("SELECT receipt_device_jid_row_id, receipt_device_timestamp FROM receipt_device WHERE message_row_id = ?", strArr);
            while (A07.moveToNext()) {
                try {
                    long j2 = A07.getLong(A07.getColumnIndexOrThrow("receipt_device_jid_row_id"));
                    C05B c05b = this.A05;
                    DeviceJid deviceJid = (DeviceJid) c05b.A07(DeviceJid.class, j2);
                    if (deviceJid != null) {
                        c0oz.A00.put(deviceJid, new C05280Oa(A07.getLong(1)));
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("receiptsmessagestore/getmessagedevicereceipts: got a null deviceJid for key=");
                        sb.append(anonymousClass094);
                        sb.append(", deviceJidRowId=");
                        sb.append(j2);
                        sb.append(", jid=");
                        sb.append(c05b.A04(j2));
                        Log.e(sb.toString());
                    }
                } finally {
                }
            }
            A07.close();
            A03.close();
            return c0oz;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e(e);
            this.A06.A03();
            return c0oz;
        }
    }

    public C0OZ A03(AnonymousClass092 anonymousClass092) {
        C06F c06f = this.A01;
        C0OZ c0oz = (C0OZ) c06f.A04(Long.valueOf(anonymousClass092.A0p));
        if (c0oz != null) {
            return c0oz;
        }
        C0OZ A02 = A02(anonymousClass092.A0p, anonymousClass092.A0n);
        long j = anonymousClass092.A0p;
        synchronized (this) {
            Long valueOf = Long.valueOf(j);
            C0OZ c0oz2 = (C0OZ) c06f.A04(valueOf);
            if (c0oz2 == null) {
                c06f.A08(valueOf, A02);
                return A02;
            }
            return c0oz2;
        }
    }

    public Set A04(AnonymousClass094 anonymousClass094) {
        AnonymousClass092 A05 = this.A04.A05(anonymousClass094);
        if (A05 != null) {
            return new HashSet(A03(A05).A00.keySet());
        }
        return new HashSet();
    }

    public void A05(AnonymousClass092 anonymousClass092, DeviceJid deviceJid, long j) {
        if (anonymousClass092.A0r) {
            return;
        }
        C0OZ A03 = A03(anonymousClass092);
        StringBuilder A0P = C000200d.A0P("receiptDeviceStore/updateDeviceReceiptsForMessage/key.jid=");
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        A0P.append(anonymousClass094.A00);
        A0P.append("; deviceJid=");
        A0P.append(deviceJid);
        A0P.append("; receipt=");
        ConcurrentHashMap concurrentHashMap = A03.A00;
        A0P.append(concurrentHashMap.get(deviceJid));
        A0P.append("; timestamp=");
        A0P.append(j);
        A0P.append("; rowId=");
        C000200d.A1I(A0P, anonymousClass092.A0p);
        if (j > 0) {
            C05280Oa c05280Oa = (C05280Oa) concurrentHashMap.get(deviceJid);
            if (c05280Oa == null) {
                concurrentHashMap.put(deviceJid, new C05280Oa(j));
            } else {
                long j2 = c05280Oa.A00;
                if (j2 > 0 && j2 <= j) {
                    return;
                }
                c05280Oa.A00 = j;
            }
            long A02 = this.A05.A02(deviceJid);
            ContentValues contentValues = new ContentValues(3);
            contentValues.put("message_row_id", Long.valueOf(anonymousClass092.A0p));
            contentValues.put("receipt_device_timestamp", Long.valueOf(j));
            contentValues.put("receipt_device_jid_row_id", Long.valueOf(A02));
            try {
                C0CD A04 = this.A07.A04();
                if (A04.A02.A04("receipt_device", contentValues) == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("msgstore/writedevicereceipt/replace/failed ");
                    sb.append(anonymousClass094);
                    sb.append(" ");
                    sb.append(deviceJid);
                    Log.e(sb.toString());
                    AbstractC000600i abstractC000600i = this.A02;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("key=");
                    sb2.append(anonymousClass094);
                    sb2.append(" device=");
                    sb2.append(deviceJid);
                    abstractC000600i.A09("ReceiptsMessageStore: replace failed", sb2.toString(), true);
                }
                A04.close();
            } catch (SQLiteDatabaseCorruptException e) {
                Log.e(e);
                this.A06.A03();
            }
        }
    }

    public final void A06(final AnonymousClass092 anonymousClass092, Set set, boolean z) {
        if (set.isEmpty()) {
            return;
        }
        try {
            C0CD A04 = this.A07.A04();
            C03790Hb A00 = A04.A00();
            int i = 0;
            if (z) {
                A04.A02.A01("receipt_device", "message_row_id = ?", new String[]{String.valueOf(anonymousClass092.A0p)});
            }
            DeviceJid[] deviceJidArr = (DeviceJid[]) set.toArray(new DeviceJid[0]);
            int length = deviceJidArr.length;
            int min = Math.min(length, this.A00);
            C0CF c0cf = null;
            while (c0cf == null) {
                try {
                    C000700j.A06(min > 0);
                    StringBuilder sb = new StringBuilder("INSERT INTO receipt_device (message_row_id, receipt_device_jid_row_id) SELECT ?, ?");
                    for (int i2 = 1; i2 < min; i2++) {
                        sb.append(" UNION ALL SELECT ?,?");
                    }
                    c0cf = A04.A02.A0B(sb.toString());
                } catch (SQLiteException unused) {
                    this.A00 = Math.max(10, this.A00 - 10);
                    min /= 2;
                }
            }
            while (length > 0) {
                if (min > length) {
                    C000700j.A06(true);
                    StringBuilder sb2 = new StringBuilder("INSERT INTO receipt_device (message_row_id, receipt_device_jid_row_id) SELECT ?, ?");
                    for (int i3 = 1; i3 < length; i3++) {
                        sb2.append(" UNION ALL SELECT ?,?");
                    }
                    c0cf = A04.A02.A0B(sb2.toString());
                    min = length;
                }
                SQLiteStatement sQLiteStatement = c0cf.A00;
                sQLiteStatement.clearBindings();
                int i4 = i;
                int i5 = 1;
                while (i5 <= (min << 1)) {
                    c0cf.A04(i5, anonymousClass092.A0p);
                    c0cf.A04(i5 + 1, this.A05.A02(deviceJidArr[i4]));
                    i5 += 2;
                    i4++;
                }
                sQLiteStatement.execute();
                i += min;
                length -= min;
            }
            A00.A00();
            A04.A02(new Runnable() { // from class: X.1OS
                {
                    C0E9.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0E9.this.A01.A05(Long.valueOf(anonymousClass092.A0p));
                }
            });
            A00.close();
            A04.close();
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e(e);
            this.A06.A03();
        }
    }

    public void A07(Set set) {
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (!deviceJid.isPrimary()) {
                hashSet.add(Long.toString(this.A05.A02(deviceJid)));
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        StringBuilder A0P = C000200d.A0P("receipt_device_jid_row_id IN ");
        A0P.append(C05P.A01(hashSet.size()));
        A0P.append(" AND ");
        A0P.append("receipt_device_timestamp IS NULL");
        String obj = A0P.toString();
        C0CD A04 = this.A07.A04();
        try {
            if (A04.A02.A01("receipt_device", obj, (String[]) hashSet.toArray(new String[0])) > 0) {
                this.A01.A07(-1);
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
}
