package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.0Q3  reason: invalid class name */
/* loaded from: classes.dex */
public class C0Q3 extends AbstractC05100Nh implements InterfaceC05660Pp {
    public final C05B A00;
    public final C012306a A01;
    public final C05C A02;

    @Override // X.AbstractC05100Nh
    public String A0B() {
        return "mention_message_ready";
    }

    @Override // X.AbstractC05100Nh
    public int A0R() {
        return 2048;
    }

    @Override // X.AbstractC05100Nh
    public String A0U() {
        return "SELECT _id, mentioned_jids FROM messages WHERE _id > ?  AND mentioned_jids IS NOT NULL  AND mentioned_jids != \"\" ORDER BY _id ASC LIMIT ?";
    }

    @Override // X.AbstractC05100Nh
    public String A0V() {
        return "migration_message_mention_retry";
    }

    @Override // X.AbstractC05100Nh
    public String A0W() {
        return "migration_message_mention_index";
    }

    public C0Q3(C05C c05c, C012306a c012306a, C05B c05b, C05670Pr c05670Pr) {
        super("message_mention", 1, c05670Pr);
        this.A00 = c05b;
        this.A02 = c05c;
        this.A01 = c012306a;
    }

    @Override // X.AbstractC05100Nh
    public long A05() {
        return this.A09.A03();
    }

    @Override // X.AbstractC05100Nh
    public Pair A0T(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("mentioned_jids");
        C0CD A04 = this.A05.A04();
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            try {
                List<UserJid> A0y = AnonymousClass029.A0y(cursor.getString(columnIndexOrThrow2));
                if (A0y != null) {
                    for (UserJid userJid : A0y) {
                        if (userJid != null) {
                            j = cursor.getLong(columnIndexOrThrow);
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("message_row_id", Long.valueOf(j));
                            contentValues.put("jid_row_id", Long.valueOf(this.A00.A02(userJid)));
                            A04.A02.A06("message_mentions", contentValues, 4);
                        }
                    }
                    i++;
                }
            } finally {
            }
        }
        A04.close();
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
        return this.A01.A03();
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.InterfaceC05660Pp
    public void onRollback() {
        C0CD A04 = this.A05.A04();
        try {
            C03790Hb A00 = A04.A00();
            A04.A02.A01("message_mentions", null, null);
            C05C c05c = this.A02;
            c05c.A03("mention_message_ready");
            c05c.A03("migration_message_mention_index");
            c05c.A03("migration_message_mention_retry");
            A00.A00();
            A00.close();
            A04.close();
            Log.i("MentionMessageStore/resetDatabaseMigration/done");
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
