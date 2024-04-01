package X;

import android.database.Cursor;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Pu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C05690Pu extends AbstractC05100Nh implements InterfaceC05660Pp {
    public final C03690Gr A00;
    public final C05C A01;
    public final C05L A02;

    @Override // X.AbstractC05100Nh
    public int A03() {
        return 1;
    }

    @Override // X.AbstractC05100Nh
    public String A0B() {
        return "links_ready";
    }

    @Override // X.AbstractC05100Nh
    public int A0R() {
        return 2048;
    }

    @Override // X.AbstractC05100Nh
    public String A0U() {
        return "SELECT _id, chat_row_id, data, media_caption, message_type FROM available_message_view WHERE _id > ? ORDER BY _id ASC LIMIT ?";
    }

    @Override // X.AbstractC05100Nh
    public String A0V() {
        return "migration_link_retry";
    }

    @Override // X.AbstractC05100Nh
    public String A0W() {
        return "migration_link_index";
    }

    public C05690Pu(C03690Gr c03690Gr, C05C c05c, C05L c05l, C05670Pr c05670Pr) {
        super("message_link", 2, c05670Pr);
        this.A00 = c03690Gr;
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
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("chat_row_id");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("data");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("media_caption");
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("message_type");
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            int i2 = cursor.getInt(columnIndexOrThrow5);
            String str = null;
            if (i2 == 0) {
                str = cursor.getString(columnIndexOrThrow3);
            } else if (i2 == 1 || i2 == 3 || i2 == 13 || i2 == 23 || i2 == 25 || i2 == 37 || i2 == 28 || i2 == 29) {
                str = cursor.getString(columnIndexOrThrow4);
            }
            j = cursor.getLong(columnIndexOrThrow);
            ArrayList A04 = C04310Jr.A04(str);
            long j2 = cursor.getLong(columnIndexOrThrow2);
            if (j2 >= 0) {
                if (A04 != null) {
                    C0CF A01 = this.A02.A01("INSERT OR IGNORE INTO message_link(chat_row_id, message_row_id, link_index)  VALUES (?, ?, ?)");
                    for (int i3 = 0; i3 < A04.size(); i3++) {
                        A01.A04(1, j2);
                        A01.A04(2, j);
                        A01.A04(3, i3);
                        A01.A01();
                    }
                }
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
        return this.A00.A03();
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.InterfaceC05660Pp
    public void onRollback() {
        C0CD A04 = this.A05.A04();
        try {
            C03790Hb A00 = A04.A00();
            A04.A02.A01("message_link", null, null);
            C05C c05c = this.A01;
            c05c.A03("links_ready");
            c05c.A03("migration_link_index");
            c05c.A03("migration_link_retry");
            A00.A00();
            A00.close();
            A04.close();
            Log.i("LinkMessageStore/LinkMessageDatabaseMigration/resetMigration/done");
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
