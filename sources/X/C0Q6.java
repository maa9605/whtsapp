package X;

import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Q6  reason: invalid class name */
/* loaded from: classes.dex */
public class C0Q6 extends AbstractC05100Nh implements InterfaceC05660Pp {
    public final C05A A00;
    public final C012806f A01;
    public final C05C A02;
    public final C05L A03;

    @Override // X.AbstractC05100Nh
    public String A0B() {
        return "location_ready";
    }

    @Override // X.AbstractC05100Nh
    public int A0R() {
        return 2048;
    }

    @Override // X.AbstractC05100Nh
    public String A0U() {
        return "SELECT _id, key_remote_jid, media_wa_type, media_name, media_url, media_duration, media_size, latitude, longitude, thumb_image  FROM messages WHERE _id > ? AND media_wa_type IN (16, 5, 30) ORDER BY _id ASC LIMIT ?";
    }

    @Override // X.AbstractC05100Nh
    public String A0V() {
        return "migration_message_location_retry";
    }

    @Override // X.AbstractC05100Nh
    public String A0W() {
        return "migration_message_location_index";
    }

    public C0Q6(C05A c05a, C05C c05c, C05L c05l, C012806f c012806f, C05670Pr c05670Pr) {
        super("message_location", 2, c05670Pr);
        this.A00 = c05a;
        this.A02 = c05c;
        this.A03 = c05l;
        this.A01 = c012806f;
    }

    @Override // X.AbstractC05100Nh
    public long A05() {
        return this.A09.A03();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ab, code lost:
        if (r7 != 30) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC05100Nh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair A0T(android.database.Cursor r23) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Q6.A0T(android.database.Cursor):android.util.Pair");
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
        return this.A01.A05();
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.InterfaceC05660Pp
    public void onRollback() {
        C0CD A04 = this.A05.A04();
        try {
            C03790Hb A00 = A04.A00();
            A04.A02.A01("message_location", null, null);
            C05C c05c = this.A02;
            c05c.A03("location_ready");
            c05c.A03("migration_message_location_index");
            c05c.A03("migration_message_location_retry");
            A00.A00();
            A00.close();
            A04.close();
            Log.i("LocationMessageStore/LocationMessageDatabaseMigration/resetMigration/done");
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
