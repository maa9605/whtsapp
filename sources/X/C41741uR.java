package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.whatsapp.jid.DeviceJid;
import java.util.concurrent.Executor;

/* renamed from: X.1uR  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41741uR {
    public static volatile C41741uR A03;
    public final C0CK A00 = new C0CK();
    public final C44291yp A01;
    public final Executor A02;

    public C41741uR(C44291yp c44291yp, InterfaceC002901k interfaceC002901k) {
        this.A01 = c44291yp;
        this.A02 = interfaceC002901k.AGj();
    }

    public static C41741uR A00() {
        if (A03 == null) {
            synchronized (C41741uR.class) {
                if (A03 == null) {
                    A03 = new C41741uR(C44291yp.A00(), C002801j.A00());
                }
            }
        }
        return A03;
    }

    public C24F A01() {
        C000700j.A00();
        C0CD A01 = this.A01.A01();
        try {
            Cursor A07 = A01.A02.A07("SELECT _id, device_id, sync_type, last_processed_msg_row_id, oldest_msg_row_id, oldest_message_to_sync_row_id, sent_msgs_count, chunk_order, sent_bytes, last_chunk_timestamp, status, peer_msg_row_id FROM msg_history_sync WHERE status=1 ORDER BY sync_type ASC, last_chunk_timestamp ASC LIMIT 1", null);
            try {
                if (A07 != null) {
                    try {
                        if (A07.moveToNext()) {
                            DeviceJid nullable = DeviceJid.getNullable(A07.getString(A07.getColumnIndex("device_id")));
                            if (nullable == null) {
                                A07.close();
                                return null;
                            }
                            try {
                                C24F c24f = new C24F(A07.getLong(A07.getColumnIndex("_id")), nullable, A07.getInt(A07.getColumnIndex("sync_type")), A07.getLong(A07.getColumnIndex("last_processed_msg_row_id")), A07.getLong(A07.getColumnIndex("oldest_msg_row_id")), A07.getLong(A07.getColumnIndex("oldest_message_to_sync_row_id")), A07.getLong(A07.getColumnIndex("sent_msgs_count")), A07.getInt(A07.getColumnIndex("chunk_order")), A07.getInt(A07.getColumnIndex("sent_bytes")), A07.getInt(A07.getColumnIndex("last_chunk_timestamp")), A07.getInt(A07.getColumnIndex("status")), A07.getLong(A07.getColumnIndex("peer_msg_row_id")));
                                A07.close();
                                A01.close();
                                return c24f;
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (A07 != null) {
                    A07.close();
                }
                A01.close();
                return null;
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } finally {
                    try {
                        A01.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public void A02(C24F c24f) {
        C000700j.A00();
        C0CD A02 = this.A01.A02();
        try {
            C0CF A0B = A02.A02.A0B("INSERT INTO msg_history_sync (device_id, sync_type, last_processed_msg_row_id, oldest_msg_row_id, sent_msgs_count, chunk_order, sent_bytes, last_chunk_timestamp, status, peer_msg_row_id, oldest_message_to_sync_row_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            SQLiteStatement sQLiteStatement = A0B.A00;
            sQLiteStatement.clearBindings();
            DeviceJid deviceJid = c24f.A0B;
            sQLiteStatement.bindString(1, deviceJid.getRawString());
            sQLiteStatement.bindLong(2, c24f.A02);
            sQLiteStatement.bindLong(3, c24f.A04);
            sQLiteStatement.bindLong(4, c24f.A09);
            sQLiteStatement.bindLong(5, c24f.A08);
            sQLiteStatement.bindLong(6, c24f.A00);
            sQLiteStatement.bindLong(7, c24f.A07);
            sQLiteStatement.bindLong(8, c24f.A03);
            sQLiteStatement.bindLong(9, c24f.A01);
            sQLiteStatement.bindLong(10, c24f.A05);
            sQLiteStatement.bindLong(11, c24f.A0A);
            A0B.A01();
            this.A02.execute(new RunnableEBaseShape2S0200000_I0_2(this, deviceJid, 4));
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

    /* JADX WARN: Finally extract failed */
    public void A03(DeviceJid deviceJid, int i) {
        C000700j.A00();
        C0CD A02 = this.A01.A02();
        try {
            A02.A02.A0D("DELETE FROM msg_history_sync WHERE device_id=? AND sync_type=?", new String[]{deviceJid.getRawString(), String.valueOf(i)});
            A02.close();
            this.A02.execute(new RunnableEBaseShape2S0200000_I0_2(this, deviceJid, 4));
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
}
