package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1tt */
/* loaded from: classes2.dex */
public class C41421tt {
    public static volatile C41421tt A01;
    public final C44291yp A00;

    public C41421tt(C44291yp c44291yp) {
        this.A00 = c44291yp;
    }

    public static C41421tt A00() {
        if (A01 == null) {
            synchronized (C41421tt.class) {
                if (A01 == null) {
                    A01 = new C41421tt(C44291yp.A00());
                }
            }
        }
        return A01;
    }

    public static final C0JU A01(Cursor cursor) {
        C000700j.A00();
        long j = cursor.getLong(cursor.getColumnIndex("_id"));
        byte b = (byte) cursor.getLong(cursor.getColumnIndex("message_type"));
        String string = cursor.getString(cursor.getColumnIndex("key_remote_jid"));
        AbstractC005302j A02 = AbstractC005302j.A02(string);
        if (A02 == null) {
            StringBuilder sb = new StringBuilder("peer-messages-store/read-peer-message-from-cursor/invalid remote jid ");
            sb.append(string);
            sb.append(" for ");
            sb.append(j);
            sb.append(" of msgType: ");
            sb.append((int) b);
            Log.e(sb.toString());
            return null;
        }
        C0JU A0b = C002701i.A0b(new AnonymousClass094(A02, cursor.getInt(cursor.getColumnIndex("key_from_me")) == 1, cursor.getString(cursor.getColumnIndex("key_id"))), cursor.getLong(cursor.getColumnIndex("timestamp")), b);
        if (A0b != null) {
            A0b.A0p = j;
            DeviceJid nullable = DeviceJid.getNullable(cursor.getString(cursor.getColumnIndex("device_id")));
            if (nullable != null) {
                A0b.A00 = nullable;
            }
            A0b.A1A(cursor.getString(cursor.getColumnIndex("data")));
            A0b.A01 = cursor.getLong(cursor.getColumnIndex("acked")) == 1;
            return A0b;
        }
        throw null;
    }

    public long A02(C0JU c0ju) {
        C000700j.A00();
        C0CD A02 = this.A00.A02();
        try {
            C0CF A0B = A02.A02.A0B("INSERT INTO peer_messages (message_type,key_remote_jid,key_from_me, key_id, timestamp, device_id, data, acked) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            SQLiteStatement sQLiteStatement = A0B.A00;
            sQLiteStatement.clearBindings();
            sQLiteStatement.bindLong(1, c0ju.A0m);
            AnonymousClass094 anonymousClass094 = c0ju.A0n;
            AbstractC005302j abstractC005302j = anonymousClass094.A00;
            if (abstractC005302j != null) {
                sQLiteStatement.bindString(2, abstractC005302j.getRawString());
                sQLiteStatement.bindLong(3, anonymousClass094.A02 ? 1L : 0L);
                sQLiteStatement.bindString(4, anonymousClass094.A01);
                sQLiteStatement.bindLong(5, c0ju.A0E);
                DeviceJid deviceJid = c0ju.A00;
                if (deviceJid != null) {
                    sQLiteStatement.bindString(6, deviceJid.getRawString());
                }
                sQLiteStatement.bindString(7, c0ju.A19());
                sQLiteStatement.bindLong(8, 0L);
                c0ju.A0p = A0B.A01();
                long j = c0ju.A0p;
                A02.close();
                return j;
            }
            throw null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A02.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public C0JU A03(long j) {
        C000700j.A00();
        C0CD A012 = this.A00.A01();
        try {
            Cursor A07 = A012.A02.A07("SELECT _id, message_type, key_remote_jid, key_from_me, key_id, timestamp, device_id, data, acked FROM peer_messages WHERE _id = ?", new String[]{String.valueOf(j)});
            if (A07 == null || !A07.moveToNext()) {
                if (A07 != null) {
                    A07.close();
                }
                A012.close();
                return null;
            }
            C0JU A013 = A01(A07);
            A07.close();
            A012.close();
            return A013;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A012.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public C0JU A04(DeviceJid deviceJid, String str) {
        C000700j.A00();
        C0CD A012 = this.A00.A01();
        try {
            Cursor A07 = A012.A02.A07("SELECT _id, message_type, key_remote_jid, key_from_me, key_id, timestamp, device_id, data, acked FROM peer_messages WHERE device_id = ? AND key_from_me = ? AND key_id = ?", new String[]{deviceJid.getRawString(), String.valueOf(1), str});
            if (A07 == null || !A07.moveToNext()) {
                if (A07 != null) {
                    A07.close();
                }
                A012.close();
                return null;
            }
            C0JU A013 = A01(A07);
            A07.close();
            A012.close();
            return A013;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A012.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public List A05(byte b) {
        C000700j.A00();
        ArrayList arrayList = new ArrayList();
        C0CD A012 = this.A00.A01();
        try {
            Cursor A07 = A012.A02.A07("SELECT _id, message_type, key_remote_jid, key_from_me, key_id, timestamp, device_id, data, acked FROM peer_messages WHERE message_type = ? ", new String[]{String.valueOf((int) b)});
            while (A07.moveToNext()) {
                C0JU A013 = A01(A07);
                if (A013 != null) {
                    arrayList.add(A013);
                }
            }
            A07.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A012.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void A06(DeviceJid deviceJid) {
        C000700j.A00();
        C0CD A02 = this.A00.A02();
        try {
            A02.A02.A01("peer_messages", "device_id = ?", new String[]{deviceJid.getRawString()});
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A02.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void A07(List list) {
        if (list.size() == 0) {
            return;
        }
        C000700j.A00();
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = String.valueOf(list.get(i));
        }
        C0CD A02 = this.A00.A02();
        try {
            C03790Hb A00 = A02.A00();
            C0Jf c0Jf = new C0Jf(strArr, 999);
            while (c0Jf.hasNext()) {
                String[] strArr2 = (String[]) c0Jf.next();
                C0CE c0ce = A02.A02;
                int length = strArr2.length;
                StringBuilder sb = new StringBuilder();
                sb.append("DELETE FROM peer_messages WHERE _id IN ( ");
                sb.append(TextUtils.join(",", Collections.nCopies(length, "?")));
                sb.append(" )");
                c0ce.A0D(sb.toString(), strArr2);
            }
            A00.A00();
            A00.close();
        } finally {
        }
    }
}
