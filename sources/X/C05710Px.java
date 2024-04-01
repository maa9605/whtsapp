package X;

import android.database.Cursor;
import android.util.Pair;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Px  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C05710Px extends AbstractC05100Nh implements InterfaceC05660Pp {
    public final C06W A00;
    public final C05C A01;
    public final C05L A02;

    @Override // X.AbstractC05100Nh
    public String A0B() {
        return "future_ready";
    }

    @Override // X.AbstractC05100Nh
    public int A0R() {
        return 128;
    }

    @Override // X.AbstractC05100Nh
    public String A0U() {
        return "SELECT _id, media_duration, raw_data  FROM messages WHERE _id > ?   AND media_wa_type IN (12) ORDER BY _id ASC LIMIT ?";
    }

    @Override // X.AbstractC05100Nh
    public String A0V() {
        return "migration_message_future_retry";
    }

    @Override // X.AbstractC05100Nh
    public String A0W() {
        return "migration_message_future_index";
    }

    public C05710Px(C05C c05c, C05L c05l, C06W c06w, C05670Pr c05670Pr) {
        super("message_future", 1, c05670Pr);
        this.A00 = c06w;
        this.A01 = c05c;
        this.A02 = c05l;
    }

    @Override // X.AbstractC05100Nh
    public long A05() {
        return this.A09.A03();
    }

    @Override // X.AbstractC05100Nh
    public Pair A0T(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("media_duration");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("raw_data");
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            C0CF A01 = this.A02.A01("INSERT INTO message_future(    message_row_id,    version,    data) VALUES (?, ?, ?)");
            j = cursor.getLong(columnIndexOrThrow);
            int i2 = cursor.getInt(columnIndexOrThrow2);
            byte[] blob = cursor.getBlob(columnIndexOrThrow3);
            A01.A04(1, j);
            A01.A04(2, i2);
            if (blob == null) {
                A01.A02(3);
            } else {
                A01.A00.bindBlob(3, blob);
            }
            A01.A01();
            i++;
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
        return this.A00.A03();
    }

    @Override // X.InterfaceC05660Pp
    public void onRollback() {
        C0CD A04 = this.A05.A04();
        try {
            C03790Hb A00 = A04.A00();
            A04.A02.A01("message_future", null, null);
            C05C c05c = this.A01;
            c05c.A03("future_ready");
            c05c.A03("migration_message_future_index");
            c05c.A03("migration_message_future_retry");
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
