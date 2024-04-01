package X;

import android.database.Cursor;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Q4  reason: invalid class name */
/* loaded from: classes.dex */
public class C0Q4 extends AbstractC05100Nh implements InterfaceC05660Pp {
    public final C05C A00;
    public final C014706y A01;
    public final C05L A02;

    @Override // X.AbstractC05100Nh
    public String A0B() {
        return "revoked_ready";
    }

    @Override // X.AbstractC05100Nh
    public int A0R() {
        return 2048;
    }

    @Override // X.AbstractC05100Nh
    public String A0U() {
        return "SELECT _id, media_name FROM messages WHERE _id > ? AND media_wa_type = 15 ORDER BY _id ASC LIMIT ?";
    }

    @Override // X.AbstractC05100Nh
    public String A0V() {
        return "migration_message_revoked_retry";
    }

    @Override // X.AbstractC05100Nh
    public String A0W() {
        return "migration_message_revoked_index";
    }

    public C0Q4(C05C c05c, C05L c05l, C014706y c014706y, C05670Pr c05670Pr) {
        super("message_revoked", 1, c05670Pr);
        this.A00 = c05c;
        this.A02 = c05l;
        this.A01 = c014706y;
    }

    @Override // X.AbstractC05100Nh
    public long A05() {
        return this.A09.A03();
    }

    @Override // X.AbstractC05100Nh
    public Pair A0T(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("media_name");
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            C0CF A01 = this.A02.A01("INSERT OR REPLACE INTO message_revoked (    message_row_id,    revoked_key_id) VALUES (?, ?)");
            j = cursor.getLong(columnIndexOrThrow);
            A01.A04(1, j);
            String string = cursor.getString(columnIndexOrThrow2);
            if (string == null) {
                A01.A02(2);
            } else {
                A01.A05(2, string);
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
        return this.A01.A01.A01("revoked_ready", 0L) == 1;
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.InterfaceC05660Pp
    public void onRollback() {
        C0CD A04 = this.A05.A04();
        try {
            C03790Hb A00 = A04.A00();
            A04.A02.A01("message_revoked", null, null);
            C05C c05c = this.A00;
            c05c.A03("revoked_ready");
            c05c.A03("migration_message_revoked_index");
            c05c.A03("migration_message_revoked_retry");
            A00.A00();
            A00.close();
            A04.close();
            Log.i("RevokedMessageStore/resetDatabaseMigration/done");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }
}
