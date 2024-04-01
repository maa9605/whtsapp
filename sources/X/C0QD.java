package X;

import android.database.Cursor;
import android.util.Pair;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0QD  reason: invalid class name */
/* loaded from: classes.dex */
public class C0QD extends AbstractC05100Nh implements InterfaceC05660Pp {
    public final C05C A00;
    public final C0H0 A01;
    public final C05L A02;

    @Override // X.AbstractC05100Nh
    public String A0B() {
        return "send_count_ready";
    }

    @Override // X.AbstractC05100Nh
    public int A0R() {
        return 1024;
    }

    @Override // X.AbstractC05100Nh
    public String A0U() {
        return "SELECT _id, send_count FROM messages WHERE _id > ? ORDER BY _id ASC LIMIT ?";
    }

    @Override // X.AbstractC05100Nh
    public String A0V() {
        return "migration_message_send_count_retry";
    }

    @Override // X.AbstractC05100Nh
    public String A0W() {
        return "migration_message_send_count_index";
    }

    public C0QD(C05C c05c, C05L c05l, C0H0 c0h0, C05670Pr c05670Pr) {
        super("message_send_count", 1, c05670Pr);
        this.A01 = c0h0;
        this.A00 = c05c;
        this.A02 = c05l;
    }

    @Override // X.AbstractC05100Nh
    public long A05() {
        return this.A09.A03();
    }

    @Override // X.AbstractC05100Nh
    public Pair A0T(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("send_count");
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            C0CF A01 = this.A02.A01("INSERT OR REPLACE INTO message_send_count (    message_row_id,    send_count) VALUES (?, ?)");
            j = cursor.getLong(columnIndexOrThrow);
            int i2 = cursor.getInt(columnIndexOrThrow2);
            if (i2 != 0) {
                A01.A04(1, j);
                A01.A04(2, i2);
                A01.A01();
                i++;
            }
        }
        return Pair.create(Long.valueOf(j), Integer.valueOf(i));
    }

    @Override // X.AbstractC05100Nh
    public Set A0X() {
        HashSet hashSet = new HashSet();
        hashSet.add("migration_jid_store");
        hashSet.add("migration_chat_store");
        return hashSet;
    }

    @Override // X.AbstractC05100Nh
    public boolean A0b() {
        return this.A01.A02();
    }

    @Override // X.InterfaceC05660Pp
    public void onRollback() {
        C0CD A04 = this.A05.A04();
        try {
            C03790Hb A00 = A04.A00();
            A04.A02.A01("message_send_count", null, null);
            C05C c05c = this.A00;
            c05c.A03("send_count_ready");
            c05c.A03("migration_message_send_count_index");
            c05c.A03("migration_message_send_count_retry");
            A00.A00();
            A00.close();
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
