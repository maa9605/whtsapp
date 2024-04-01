package X;

import android.database.Cursor;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Pw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C05700Pw extends AbstractC05100Nh implements InterfaceC05660Pp {
    public final C05C A00;
    public final C06S A01;

    @Override // X.AbstractC05100Nh
    public String A0B() {
        return "new_vcards_ready";
    }

    @Override // X.AbstractC05100Nh
    public int A0R() {
        return 256;
    }

    @Override // X.AbstractC05100Nh
    public String A0U() {
        return "SELECT _id, media_wa_type, data, raw_data FROM messages WHERE _id > ?  AND media_wa_type IN (4, 14) ORDER BY _id ASC LIMIT ?";
    }

    @Override // X.AbstractC05100Nh
    public String A0V() {
        return "migration_vcard_retry";
    }

    @Override // X.AbstractC05100Nh
    public String A0W() {
        return "migration_vcard_index";
    }

    public C05700Pw(C05C c05c, C06S c06s, C05670Pr c05670Pr) {
        super("message_vcard", 1, c05670Pr);
        this.A00 = c05c;
        this.A01 = c06s;
    }

    @Override // X.AbstractC05100Nh
    public long A05() {
        return this.A09.A03();
    }

    @Override // X.AbstractC05100Nh
    public Pair A0T(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("media_wa_type");
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            j = cursor.getLong(columnIndexOrThrow);
            int i2 = cursor.getInt(columnIndexOrThrow2);
            if (i2 == 4) {
                this.A01.A08(Collections.singletonList(cursor.getString(cursor.getColumnIndexOrThrow("data"))), j);
            } else if (i2 == 14) {
                this.A01.A08(AnonymousClass029.A0z(cursor.getBlob(cursor.getColumnIndexOrThrow("raw_data"))), j);
            }
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
        return this.A01.A0A();
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.InterfaceC05660Pp
    public void onRollback() {
        C0CD A04 = this.A05.A04();
        try {
            C03790Hb A00 = A04.A00();
            C0CE c0ce = A04.A02;
            c0ce.A01("message_vcard", null, null);
            c0ce.A01("message_vcard_jid", null, null);
            C05C c05c = this.A00;
            c05c.A03("new_vcards_ready");
            c05c.A03("migration_vcard_index");
            c05c.A03("migration_vcard_retry");
            A00.A00();
            A00.close();
            A04.close();
            Log.i("VCardMessageStore/VCardMessageStoreDatabaseMigration/resetMigration/done");
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
