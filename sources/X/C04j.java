package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* renamed from: X.04j */
/* loaded from: classes.dex */
public class C04j extends SQLiteOpenHelper implements C04k {
    public C009504w A00;
    public C0CE A01;
    public final AbstractC000600i A02;
    public final AnonymousClass012 A03;
    public final C001200o A04;
    public final C04l A05;
    public final C04Z A06;
    public final String A07;
    public final boolean A08;

    public C04j(C001200o c001200o, AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, C04Z c04z) {
        super(c001200o.A00, "axolotl.db", (SQLiteDatabase.CursorFactory) null, 11);
        this.A04 = c001200o;
        this.A03 = anonymousClass012;
        this.A02 = abstractC000600i;
        this.A06 = c04z;
        this.A07 = "axolotl.db";
        this.A08 = true;
        this.A05 = new C04l();
        setWriteAheadLoggingEnabled(true);
    }

    public static final void A00(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
        StringBuilder sb = new StringBuilder("ALTER TABLE ");
        sb.append(str);
        sb.append(" RENAME TO old_");
        sb.append(str);
        sb.append(";");
        sQLiteDatabase.execSQL(sb.toString());
        sQLiteDatabase.execSQL(str2);
        String join = TextUtils.join(", ", strArr);
        sQLiteDatabase.execSQL(C000200d.A0N(C000200d.A0X("INSERT INTO ", str, " (", join, ")"), " SELECT ", join, " FROM old_", str));
        StringBuilder sb2 = new StringBuilder("DROP TABLE old_");
        sb2.append(str);
        sQLiteDatabase.execSQL(sb2.toString());
    }

    public C0CD A01() {
        return new C0CD(null, this, false);
    }

    public C0CD A02() {
        return new C0CD(null, this, true);
    }

    @Override // X.C04k
    public C04l ABg() {
        return this.A05;
    }

    @Override // X.C04k
    public synchronized C0CE ACk() {
        return AE6();
    }

    @Override // X.C04k
    public synchronized C0CE AE6() {
        C0CE A05;
        C0CE c0ce = this.A01;
        if (c0ce != null && c0ce.A00.isOpen()) {
            return this.A01;
        }
        try {
            A05 = C002501g.A05(super.getWritableDatabase(), this.A06);
            this.A01 = A05;
        } catch (SQLiteException e) {
            Log.e("failed to open axolotl store", e);
            C009504w c009504w = this.A00;
            if (c009504w != null) {
                c009504w.A00.A0I();
            }
            A05 = C002501g.A05(super.getWritableDatabase(), this.A06);
            this.A01 = A05;
        }
        return A05;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getReadableDatabase() {
        C000700j.A08(false, "Use getReadableLoggableDatabase instead");
        return ACk().A00;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getWritableDatabase() {
        C000700j.A08(false, "Use getWritableLoggableDatabase instead");
        return AE6().A00;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C009504w c009504w;
        Log.i("creating axolotl database version 11");
        sQLiteDatabase.execSQL("CREATE TABLE identities (_id INTEGER PRIMARY KEY AUTOINCREMENT, recipient_id INTEGER, device_id INTEGER, registration_id INTEGER, public_key BLOB, private_key BLOB, next_prekey_id INTEGER, timestamp INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS identities_idx ON identities(recipient_id, device_id)");
        sQLiteDatabase.execSQL("CREATE TABLE prekeys (_id INTEGER PRIMARY KEY AUTOINCREMENT, prekey_id INTEGER UNIQUE, sent_to_server BOOLEAN, record BLOB, direct_distribution BOOLEAN, upload_timestamp INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE prekey_uploads (_id INTEGER PRIMARY KEY AUTOINCREMENT, upload_timestamp INTEGER)");
        C000200d.A0a(sQLiteDatabase, "CREATE TABLE sessions (_id INTEGER PRIMARY KEY AUTOINCREMENT, recipient_id INTEGER, device_id INTEGER, record BLOB, timestamp INTEGER)", "CREATE UNIQUE INDEX IF NOT EXISTS sessions_idx ON sessions(recipient_id, device_id)", "CREATE TABLE signed_prekeys (_id INTEGER PRIMARY KEY AUTOINCREMENT, prekey_id INTEGER UNIQUE, timestamp INTEGER, record BLOB)", "CREATE TABLE message_base_key (_id INTEGER PRIMARY KEY AUTOINCREMENT, msg_key_remote_jid TEXT NOT NULL, msg_key_from_me BOOLEAN NOT NULL, msg_key_id TEXT NOT NULL, recipient_id INTEGER, device_id INTEGER NOT NULL DEFAULT 0, last_alice_base_key BLOB NOT NULL, timestamp INTEGER)");
        C000200d.A0a(sQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS message_base_key_idx ON message_base_key (msg_key_remote_jid, msg_key_from_me, msg_key_id, recipient_id, device_id)", "CREATE TABLE sender_keys (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_id TEXT NOT NULL, sender_id INTEGER NOT NULL, device_id INTEGER NOT NULL DEFAULT 0, record BLOB NOT NULL, timestamp INTEGER)", "CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id, device_id)", "CREATE TABLE fast_ratchet_sender_keys (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_id TEXT NOT NULL, sender_id INTEGER NOT NULL, device_id INTEGER NOT NULL DEFAULT 0, record BLOB NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS fast_ratchet_sender_keys_idx ON fast_ratchet_sender_keys (group_id, sender_id, device_id)");
        Log.i("created axolotl database version 11");
        if (this.A08 && (c009504w = this.A00) != null) {
            final C01J c01j = c009504w.A00;
            AnonymousClass051 anonymousClass051 = c01j.A00;
            C0XQ A0Q = C002701i.A0Q();
            C0JY c0jy = new C0JY(new C0IP(A0Q.A01), A0Q.A00);
            ContentValues contentValues = new ContentValues();
            AnonymousClass012 anonymousClass012 = anonymousClass051.A01;
            long A05 = anonymousClass012.A05() / 1000;
            contentValues.put("recipient_id", (Integer) (-1));
            contentValues.put("device_id", (Integer) 0);
            try {
                contentValues.put("registration_id", Integer.valueOf(SecureRandom.getInstance("SHA1PRNG").nextInt(2147483646) + 1));
                contentValues.put("public_key", c0jy.A01.A00.A00());
                C0R8 c0r8 = c0jy.A00;
                contentValues.put("private_key", c0r8.A01);
                try {
                    contentValues.put("next_prekey_id", Integer.valueOf(SecureRandom.getInstance("SHA1PRNG").nextInt(16777214) + 1));
                    Long valueOf = Long.valueOf(A05);
                    contentValues.put("timestamp", valueOf);
                    sQLiteDatabase.insertOrThrow("identities", null, contentValues);
                    Log.i("axolotl inserted identity key pair");
                    try {
                        C0XQ A0Q2 = C002701i.A0Q();
                        C0IR c0ir = A0Q2.A01;
                        byte[] A1W = C002701i.A1W(c0r8, c0ir.A00());
                        C12550jf c12550jf = (C12550jf) C0XX.A06.AVX();
                        c12550jf.A04(0);
                        C0AN A00 = C0AN.A00(c0ir.A00());
                        c12550jf.A02();
                        C0XX c0xx = (C0XX) c12550jf.A00;
                        c0xx.A00 |= 2;
                        c0xx.A04 = A00;
                        C0AN A002 = C0AN.A00(A0Q2.A00.A01);
                        c12550jf.A02();
                        C0XX c0xx2 = (C0XX) c12550jf.A00;
                        c0xx2.A00 |= 4;
                        c0xx2.A03 = A002;
                        C0AN A003 = C0AN.A00(A1W);
                        c12550jf.A02();
                        C0XX c0xx3 = (C0XX) c12550jf.A00;
                        c0xx3.A00 |= 8;
                        c0xx3.A05 = A003;
                        c12550jf.A05(anonymousClass012.A05());
                        C0AZ A01 = c12550jf.A01();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("prekey_id", (Integer) 0);
                        contentValues2.put("timestamp", valueOf);
                        contentValues2.put("record", A01.A0B());
                        sQLiteDatabase.insertOrThrow("signed_prekeys", null, contentValues2);
                        Log.i("axolotl inserted signed prekey");
                        c01j.A0H.A00.submit(new Runnable() { // from class: X.1Na
                            @Override // java.lang.Runnable
                            public final void run() {
                                c01j.A0J();
                            }
                        });
                        c01j.A0E.A0h(true);
                        c01j.A0G.A02();
                    } catch (C05240Nw e) {
                        throw new RuntimeException(e);
                    }
                } catch (NoSuchAlgorithmException e2) {
                    throw new AssertionError(e2);
                }
            } catch (NoSuchAlgorithmException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C000200d.A0t("axolotl upgrading db from ", i, " to ", i2);
        if (i2 != 11) {
            throw new SQLiteException(C000200d.A0F("Unknown upgrade destination version: ", i, " -> ", i2));
        }
        long A05 = this.A03.A05() / 1000;
        switch (i) {
            case 1:
                sQLiteDatabase.execSQL("ALTER TABLE sessions ADD COLUMN timestamp INTEGER");
                ContentValues contentValues = new ContentValues();
                contentValues.put("timestamp", Long.valueOf(A05));
                sQLiteDatabase.update("sessions", contentValues, null, null);
            case 2:
                sQLiteDatabase.execSQL("CREATE TABLE message_base_key (_id INTEGER PRIMARY KEY AUTOINCREMENT, msg_key_remote_jid TEXT NOT NULL, msg_key_from_me BOOLEAN NOT NULL, msg_key_id TEXT NOT NULL, last_alice_base_key BLOB NOT NULL, timestamp INTEGER)");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS message_base_key_idx ON message_base_key (msg_key_remote_jid, msg_key_from_me, msg_key_id)");
            case 3:
            case 4:
                C000200d.A0Z(sQLiteDatabase, "DROP TABLE IF EXISTS sender_keys", "CREATE TABLE sender_keys (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_id TEXT NOT NULL, sender_id INTEGER NOT NULL, record BLOB NOT NULL)", "CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id)");
            case 5:
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id)");
            case 6:
                C000200d.A0Z(sQLiteDatabase, "DROP TABLE IF EXISTS fast_ratchet_sender_keys", "CREATE TABLE fast_ratchet_sender_keys (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_id TEXT NOT NULL, sender_id INTEGER NOT NULL, record BLOB NOT NULL)", "CREATE UNIQUE INDEX IF NOT EXISTS fast_ratchet_sender_keys_idx ON fast_ratchet_sender_keys (group_id, sender_id)");
            case 7:
                sQLiteDatabase.execSQL("ALTER TABLE sender_keys ADD COLUMN timestamp INTEGER");
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("timestamp", Long.valueOf(A05));
                sQLiteDatabase.update("sender_keys", contentValues2, null, null);
            case 8:
                sQLiteDatabase.execSQL("ALTER TABLE prekeys ADD COLUMN direct_distribution BOOLEAN");
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("direct_distribution", Boolean.FALSE);
                sQLiteDatabase.update("prekeys", contentValues3, null, null);
            case 9:
                sQLiteDatabase.execSQL("ALTER TABLE prekeys ADD COLUMN upload_timestamp INTEGER");
                ContentValues contentValues4 = new ContentValues();
                Long valueOf = Long.valueOf(A05);
                contentValues4.put("upload_timestamp", valueOf);
                sQLiteDatabase.update("prekeys", contentValues4, "sent_to_server != 0", null);
                sQLiteDatabase.execSQL("CREATE TABLE prekey_uploads (_id INTEGER PRIMARY KEY AUTOINCREMENT, upload_timestamp INTEGER)");
                ContentValues contentValues5 = new ContentValues();
                contentValues5.put("upload_timestamp", valueOf);
                sQLiteDatabase.insert("prekey_uploads", null, contentValues5);
                break;
            case 10:
                break;
            default:
                throw new SQLiteException(C000200d.A0F("Unknown upgrade from ", i, " to ", i2));
        }
        A00(sQLiteDatabase, "identities", "CREATE TABLE identities (_id INTEGER PRIMARY KEY AUTOINCREMENT, recipient_id INTEGER, device_id INTEGER, registration_id INTEGER, public_key BLOB, private_key BLOB, next_prekey_id INTEGER, timestamp INTEGER)", new String[]{"recipient_id", "registration_id", "public_key", "private_key", "next_prekey_id", "timestamp"});
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS identities_idx ON identities(recipient_id, device_id)");
        StringBuilder A0X = C000200d.A0X("UPDATE ", "identities", " SET ", "device_id", " = ");
        A0X.append(0);
        sQLiteDatabase.execSQL(A0X.toString());
        A00(sQLiteDatabase, "sessions", "CREATE TABLE sessions (_id INTEGER PRIMARY KEY AUTOINCREMENT, recipient_id INTEGER, device_id INTEGER, record BLOB, timestamp INTEGER)", new String[]{"recipient_id", "record", "timestamp"});
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS sessions_idx ON sessions(recipient_id, device_id)");
        StringBuilder A0X2 = C000200d.A0X("UPDATE ", "sessions", " SET ", "device_id", " = ");
        A0X2.append(0);
        sQLiteDatabase.execSQL(A0X2.toString());
        sQLiteDatabase.execSQL("ALTER TABLE sender_keys ADD COLUMN device_id INTEGER NOT NULL DEFAULT 0");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS sender_keys_idx");
        C000200d.A0a(sQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id, device_id)", "ALTER TABLE fast_ratchet_sender_keys ADD COLUMN device_id INTEGER NOT NULL DEFAULT 0", "DROP INDEX IF EXISTS fast_ratchet_sender_keys_idx", "CREATE UNIQUE INDEX IF NOT EXISTS fast_ratchet_sender_keys_idx ON fast_ratchet_sender_keys (group_id, sender_id, device_id)");
        C000200d.A0a(sQLiteDatabase, "ALTER TABLE message_base_key ADD COLUMN recipient_id INTEGER ", "ALTER TABLE message_base_key ADD COLUMN device_id INTEGER NOT NULL DEFAULT 0", "DELETE FROM message_base_key WHERE msg_key_remote_jid NOT GLOB '[0-9]*@s.whatsapp.net'", "UPDATE message_base_key SET recipient_id = CAST(REPLACE(msg_key_remote_jid, '@s.whatsapp.net', '') AS INTEGER)");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS message_base_key_idx");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS message_base_key_idx ON message_base_key (msg_key_remote_jid, msg_key_from_me, msg_key_id, recipient_id, device_id)");
        Log.i("axolotl upgraded successfully");
    }
}
