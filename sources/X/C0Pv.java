package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Pv  reason: invalid class name */
/* loaded from: classes.dex */
public class C0Pv extends AbstractC05100Nh implements InterfaceC05660Pp {
    public final C05A A00;
    public final C05C A01;
    public final C05L A02;
    public final C06Q A03;
    public final C06I A04;

    @Override // X.AbstractC05100Nh
    public String A0B() {
        return "text_ready";
    }

    @Override // X.AbstractC05100Nh
    public int A0R() {
        return 2048;
    }

    @Override // X.AbstractC05100Nh
    public String A0U() {
        return "SELECT _id, key_remote_jid, key_from_me, key_id, media_name, media_caption, media_url, thumb_image, preview_type  FROM messages WHERE _id > ? AND status != 6 AND media_wa_type IN (0, 27) ORDER BY _id ASC LIMIT ?";
    }

    @Override // X.AbstractC05100Nh
    public String A0V() {
        return "migration_message_text_retry";
    }

    @Override // X.AbstractC05100Nh
    public String A0W() {
        return "migration_message_text_index";
    }

    public C0Pv(C05A c05a, C06Q c06q, C05C c05c, C05L c05l, C06I c06i, C05670Pr c05670Pr) {
        super("message_text", 1, c05670Pr);
        this.A00 = c05a;
        this.A03 = c06q;
        this.A01 = c05c;
        this.A02 = c05l;
        this.A04 = c06i;
    }

    @Override // X.AbstractC05100Nh
    public long A05() {
        return this.A09.A03();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
        if (r9 != 0) goto L25;
     */
    @Override // X.AbstractC05100Nh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair A0T(android.database.Cursor r19) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Pv.A0T(android.database.Cursor):android.util.Pair");
    }

    @Override // X.AbstractC05100Nh
    public Set A0X() {
        HashSet hashSet = new HashSet();
        hashSet.add("migration_jid_store");
        hashSet.add("migration_chat_store");
        hashSet.add("message_thumbnail");
        return hashSet;
    }

    @Override // X.AbstractC05100Nh
    public boolean A0b() {
        return this.A03.A05();
    }

    public final AnonymousClass094 A0c(Cursor cursor) {
        return new AnonymousClass094(this.A00.A09(cursor), cursor.getInt(cursor.getColumnIndexOrThrow("key_from_me")) == 1, cursor.getString(cursor.getColumnIndexOrThrow("key_id")));
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.InterfaceC05660Pp
    public void onRollback() {
        C0CD A04 = this.A05.A04();
        try {
            C03790Hb A00 = A04.A00();
            A04.A02.A01("message_text", null, null);
            C05C c05c = this.A01;
            c05c.A03("text_ready");
            c05c.A03("migration_message_text_index");
            c05c.A03("migration_message_text_retry");
            A00.A00();
            A00.close();
            A04.close();
            Log.i("TextMessageStore/TextMessageDatabaseMigration/resetMigration/done");
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
