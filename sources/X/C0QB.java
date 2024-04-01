package X;

import android.database.Cursor;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.0QB  reason: invalid class name */
/* loaded from: classes.dex */
public class C0QB extends AbstractC05100Nh {
    public final C05A A00;
    public final C06J A01;
    public final C05C A02;
    public final C05L A03;

    @Override // X.AbstractC05100Nh
    public int A0Q() {
        return 3;
    }

    @Override // X.AbstractC05100Nh
    public int A0R() {
        return 2048;
    }

    @Override // X.AbstractC05100Nh
    public long A0S() {
        return 1L;
    }

    @Override // X.AbstractC05100Nh
    public String A0U() {
        return "SELECT _id, thumb_image, media_wa_type, key_remote_jid, multicast_id, media_url, media_mime_type, media_size, media_name, media_hash, media_duration, media_enc_hash, timestamp  FROM messages WHERE _id > ?  AND +media_wa_type in ('2' , '1' , '25' , '3' , '28' , '13' , '29' , '20' , '9' , '26' , '23' , '37' )  ORDER BY _id ASC LIMIT ?";
    }

    @Override // X.AbstractC05100Nh
    public String A0V() {
        return "migration_message_media_retry";
    }

    @Override // X.AbstractC05100Nh
    public String A0W() {
        return "migration_message_media_index";
    }

    public boolean A0c(Cursor cursor) {
        return true;
    }

    public C0QB(C05A c05a, C05C c05c, C05L c05l, C06J c06j, C05670Pr c05670Pr) {
        super("message_media", EditorInfoCompat.IME_FLAG_FORCE_ASCII, c05670Pr);
        this.A00 = c05a;
        this.A02 = c05c;
        this.A03 = c05l;
        this.A01 = c06j;
    }

    public C0QB(C05A c05a, C05C c05c, C05L c05l, C06J c06j, String str, int i, C05670Pr c05670Pr) {
        super("media_migration_fixer", 3, c05670Pr);
        this.A00 = c05a;
        this.A02 = c05c;
        this.A03 = c05l;
        this.A01 = c06j;
    }

    public static String A02(Long l) {
        return l == null ? "null" : new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date(l.longValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8 A[SYNTHETIC] */
    @Override // X.AbstractC05100Nh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair A0T(android.database.Cursor r47) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QB.A0T(android.database.Cursor):android.util.Pair");
    }

    @Override // X.AbstractC05100Nh
    public Set A0X() {
        HashSet hashSet = new HashSet();
        hashSet.add("migration_jid_store");
        hashSet.add("migration_chat_store");
        return hashSet;
    }

    @Override // X.AbstractC05100Nh
    public void A0Y() {
        super.A0Y();
        this.A02.A04("media_message_ready", 2);
    }

    @Override // X.AbstractC05100Nh
    public boolean A0b() {
        return this.A01.A0E();
    }
}
