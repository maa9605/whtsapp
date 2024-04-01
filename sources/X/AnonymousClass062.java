package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.062 */
/* loaded from: classes.dex */
public class AnonymousClass062 extends SQLiteOpenHelper implements C04k {
    public static volatile AnonymousClass062 A07;
    public C0CE A00;
    public C0CE A01;
    public final AbstractC000600i A02;
    public final C001200o A03;
    public final C04l A04;
    public final C04Z A05;
    public final AnonymousClass063 A06;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.063] */
    public AnonymousClass062(C001200o c001200o, AbstractC000600i abstractC000600i, C04Z c04z) {
        super(c001200o.A00, "wa.db", (SQLiteDatabase.CursorFactory) null, 44);
        this.A06 = new AnonymousClass064() { // from class: X.063
        };
        this.A02 = abstractC000600i;
        this.A05 = c04z;
        this.A04 = new C04l();
        setWriteAheadLoggingEnabled(true);
        this.A03 = c001200o;
    }

    public static AnonymousClass062 A00() {
        if (A07 == null) {
            synchronized (AnonymousClass062.class) {
                if (A07 == null) {
                    A07 = new AnonymousClass062(C001200o.A01, AbstractC000600i.A00(), C04Z.A00());
                }
            }
        }
        return A07;
    }

    public static String A01(SQLiteDatabase sQLiteDatabase) {
        String str;
        str = "";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("select sql from sqlite_master where type='table' and name='");
            sb.append("wa_contacts");
            sb.append("';");
            Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
            if (rawQuery == null) {
                return "";
            }
            str = rawQuery.moveToNext() ? rawQuery.getString(0) : "";
            rawQuery.close();
            return str;
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("cannot get schema for ");
            sb2.append("wa_contacts");
            Log.e(sb2.toString(), e);
            return str;
        }
    }

    public static void A02(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" ");
        sb.append(str3);
        if (str.contains(sb.toString())) {
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ALTER TABLE ");
            sb2.append("wa_contacts");
            sb2.append(" ADD ");
            sb2.append(str2);
            sb2.append(" ");
            sb2.append(str3);
            sQLiteDatabase.execSQL(sb2.toString());
        } catch (SQLiteException e) {
            StringBuilder A0X = C000200d.A0X("cannot add column ", str2, " ", str3, " to ");
            A0X.append("wa_contacts");
            Log.e(A0X.toString(), e);
        }
    }

    public C0CD A03() {
        return new C0CD(null, this, true);
    }

    public void A04() {
        synchronized (this) {
            close();
            Log.i("deleting contact database...");
            C001200o c001200o = this.A03;
            boolean delete = c001200o.A00.getDatabasePath("wa.db").delete();
            File databasePath = c001200o.A00.getDatabasePath("wa.db");
            String path = databasePath.getPath();
            StringBuilder sb = new StringBuilder();
            sb.append(databasePath.getName());
            sb.append("-journal");
            boolean delete2 = new File(path, sb.toString()).delete();
            File databasePath2 = c001200o.A00.getDatabasePath("wa.db");
            String path2 = databasePath2.getPath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(databasePath2.getName());
            sb2.append("-wal");
            boolean delete3 = new File(path2, sb2.toString()).delete();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("deleted contact database; databaseDeleted=");
            sb3.append(delete);
            sb3.append("; journalDeleted=");
            sb3.append(delete2);
            sb3.append("; writeAheadLogDeleted=");
            sb3.append(delete3);
            Log.i(sb3.toString());
        }
        for (AnonymousClass066 anonymousClass066 : this.A06.A00) {
            anonymousClass066.A00.A0C();
        }
    }

    @Override // X.C04k
    public C04l ABg() {
        return this.A04;
    }

    @Override // X.C04k
    public synchronized C0CE ACk() {
        C0CE A05;
        C0CE c0ce = this.A00;
        if (c0ce != null && c0ce.A00.isOpen()) {
            return this.A00;
        }
        try {
            try {
                try {
                    A05 = C002501g.A05(super.getReadableDatabase(), this.A05);
                    this.A00 = A05;
                } catch (StackOverflowError e) {
                    Log.w("StackOverflowError during db init check");
                    for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                        if (stackTraceElement.getMethodName().equals("onCorruption")) {
                            Log.w("Contacts database is corrupt. Found via StackOverflowError. Removing...");
                            A04();
                            this.A00 = C002501g.A05(super.getReadableDatabase(), this.A05);
                        }
                    }
                    throw e;
                }
            } catch (SQLiteDatabaseCorruptException e2) {
                Log.w("Contacts database is corrupt. Removing...", e2);
                A04();
                A05 = C002501g.A05(super.getReadableDatabase(), this.A05);
                this.A00 = A05;
            }
            return A05;
        } catch (SQLiteException e3) {
            String obj = e3.toString();
            if (!obj.contains("file is encrypted")) {
                if (obj.contains("upgrade read-only database")) {
                    Log.w("Client actually opened database as read-only and can't upgrade. Switching to writable...", e3);
                    this.A00 = AE6();
                }
            } else {
                Log.w("Contacts database is encrypted. Removing...", e3);
                A04();
                this.A00 = C002501g.A05(super.getReadableDatabase(), this.A05);
            }
            throw e3;
        }
    }

    @Override // X.C04k
    public synchronized C0CE AE6() {
        C0CE A05;
        C0CE c0ce = this.A01;
        if (c0ce != null && c0ce.A00.isOpen()) {
            return this.A01;
        }
        try {
            try {
                A05 = C002501g.A05(super.getWritableDatabase(), this.A05);
                this.A01 = A05;
            } catch (SQLiteDatabaseCorruptException e) {
                Log.w("Contacts database is corrupt. Removing...", e);
                A04();
                A05 = C002501g.A05(super.getWritableDatabase(), this.A05);
                this.A01 = A05;
            } catch (SQLiteException e2) {
                if (e2.toString().contains("file is encrypted")) {
                    Log.w("Contacts database is encrypted. Removing...", e2);
                    A04();
                    this.A01 = C002501g.A05(super.getWritableDatabase(), this.A05);
                }
                throw e2;
            }
            return A05;
        } catch (StackOverflowError e3) {
            Log.w("StackOverflowError during db init check");
            for (StackTraceElement stackTraceElement : e3.getStackTrace()) {
                if (stackTraceElement.getMethodName().equals("onCorruption")) {
                    Log.w("Contacts database is corrupt. Found via StackOverflowError. Removing...");
                    A04();
                    this.A01 = C002501g.A05(super.getWritableDatabase(), this.A05);
                }
            }
            throw e3;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized SQLiteDatabase getReadableDatabase() {
        C000700j.A08(false, "Use getReadableLoggableDatabase instead");
        return ACk().A00;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized SQLiteDatabase getWritableDatabase() {
        C000700j.A08(false, "Use getWritableLoggableDatabase instead");
        return AE6().A00;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i("creating contacts database version 44");
        Log.i("creating contacts table for contacts database version 44");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_contacts");
        sQLiteDatabase.execSQL("CREATE TABLE wa_contacts (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, is_whatsapp_user BOOLEAN NOT NULL, status TEXT, status_timestamp INTEGER, number TEXT, raw_contact_id INTEGER, display_name TEXT, phone_type INTEGER, phone_label TEXT, unseen_msg_count INTEGER, photo_ts INTEGER, thumb_ts INTEGER, photo_id_timestamp INTEGER, given_name TEXT, family_name TEXT, wa_name TEXT, sort_name TEXT, nickname TEXT, company TEXT, title TEXT, status_autodownload_disabled INTEGER, keep_timestamp INTEGER, is_spam_reported INTEGER, is_sidelist_synced BOOLEAN DEFAULT 0, is_business_synced BOOLEAN DEFAULT 0)");
        sQLiteDatabase.execSQL(" CREATE INDEX IF NOT EXISTS is_wa_index ON wa_contacts (is_whatsapp_user);");
        sQLiteDatabase.execSQL(" CREATE INDEX IF NOT EXISTS jid_index ON wa_contacts (jid);");
        Log.i("creating system contacts version table for contacts database version 44");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS system_contacts_version_table");
        sQLiteDatabase.execSQL("CREATE TABLE system_contacts_version_table (id INTEGER PRIMARY KEY, version INTEGER)");
        Log.i("creating wa_vnames table for contacts database version 44");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_vnames");
        sQLiteDatabase.execSQL("CREATE TABLE wa_vnames (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, serial INTEGER NOT NULL, issuer TEXT NOT NULL, expires INTEGER, verified_name TEXT NOT NULL, industry TEXT, city TEXT, country TEXT, verified_level INTEGER, identity_unconfirmed_since INTEGER, cert_blob BLOB, host_storage INTEGER DEFAULT 0, actual_actors INTEGER DEFAULT 0, privacy_mode_ts INTEGER DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS vname_jid_index ON wa_vnames (jid);");
        Log.i("creating wa_vnames_localized table for contacts database version 44");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_vnames_localized");
        sQLiteDatabase.execSQL("CREATE TABLE wa_vnames_localized (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, lg TEXT NOT NULL, lc TEXT NOT NULL, verified_name TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS vname_localized_index ON wa_vnames_localized (jid, lg, lc);");
        Log.i("creating storage usage table for contacts database version 44");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_contact_storage_usage");
        sQLiteDatabase.execSQL("CREATE TABLE wa_contact_storage_usage (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, conversation_size INTEGER NOT NULL, conversation_message_count INTEGER NOT NULL)");
        sQLiteDatabase.execSQL(" CREATE INDEX IF NOT EXISTS wa_contact_storage_usage_index ON wa_contact_storage_usage (jid, conversation_size DESC)");
        Log.i("creating wa_biz_profiles table for contacts database version 44");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS contact_bu_for_business_profiles");
        C000200d.A0a(sQLiteDatabase, "DROP TRIGGER IF EXISTS contact_bd_for_business_profiles", "DROP TABLE IF EXISTS wa_biz_profiles", "CREATE TABLE wa_biz_profiles (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, email TEXT, address TEXT, business_description TEXT, latitude REAL, longitude REAL, tag TEXT, vertical TEXT,time_zone TEXT,hours_note TEXT,has_catalog BOOLEAN DEFAULT 0, address_postal_code TEXT, address_city_id TEXT, address_city_name TEXT, commerce_experience TEXT, shop_url TEXT, cart_enabled BOOLEAN DEFAULT 0 )", "CREATE UNIQUE INDEX IF NOT EXISTS biz_profile_jid_index ON wa_biz_profiles (jid);");
        sQLiteDatabase.execSQL("CREATE TRIGGER contact_bd_for_business_profiles BEFORE DELETE ON wa_contacts BEGIN DELETE FROM wa_biz_profiles WHERE jid = old.jid; END");
        sQLiteDatabase.execSQL("CREATE TRIGGER contact_bu_for_business_profiles BEFORE UPDATE ON wa_contacts BEGIN UPDATE wa_biz_profiles SET jid = new.jid WHERE jid = old.jid; END");
        Log.i("creating wa_biz_profiles_websites table for contacts database version 44");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_websites_trigger");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_biz_profiles_websites");
        sQLiteDatabase.execSQL("CREATE TABLE wa_biz_profiles_websites (_id INTEGER PRIMARY KEY AUTOINCREMENT, wa_biz_profile_id INTEGER NOT NULL, websites TEXT)");
        sQLiteDatabase.execSQL(" CREATE INDEX IF NOT EXISTS biz_profile_id_website_index ON wa_biz_profiles_websites(wa_biz_profile_id, websites);");
        sQLiteDatabase.execSQL("CREATE TRIGGER business_profiles_bd_for_websites_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_websites WHERE wa_biz_profile_id = old._id; END");
        Log.i("creating wa_biz_profiles_hours table for contacts database version 44");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_hours_trigger");
        C000200d.A0a(sQLiteDatabase, "DROP TABLE IF EXISTS wa_biz_profiles_hours", "CREATE TABLE wa_biz_profiles_hours (_id INTEGER PRIMARY KEY AUTOINCREMENT, wa_biz_profile_id INTEGER NOT NULL, day_of_week TEXT,mode TEXT,open_time INTEGER,close_time INTEGER)", " CREATE INDEX IF NOT EXISTS biz_profile_id_hours_index ON wa_biz_profiles_hours(wa_biz_profile_id);", "CREATE TRIGGER business_profiles_bd_for_hours_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_hours WHERE wa_biz_profile_id = old._id; END");
        C000200d.A0a(sQLiteDatabase, "DROP TRIGGER IF EXISTS business_profiles_bd_for_categories_trigger", "DROP TABLE IF EXISTS wa_biz_profiles_categories", "CREATE TABLE wa_biz_profiles_categories (_id INTEGER PRIMARY KEY AUTOINCREMENT, wa_biz_profile_id INTEGER NOT NULL, category_id TEXT NOT NULL,category_name TEXT NOT NULL)", " CREATE INDEX IF NOT EXISTS biz_profile_id_category_index ON wa_biz_profiles_categories(wa_biz_profile_id, category_id);");
        sQLiteDatabase.execSQL("CREATE TRIGGER business_profiles_bd_for_categories_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_categories WHERE wa_biz_profile_id = old._id; END");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_group_descriptions");
        sQLiteDatabase.execSQL("CREATE TABLE wa_group_descriptions (jid TEXT NOT NULL, description TEXT NOT NULL, description_id INTEGER, description_time INTEGER, description_setter_jid TEXT NOT NULL, description_id_string TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS wa_group_descriptions_jid_index ON wa_group_descriptions(jid)");
        C000200d.A0a(sQLiteDatabase, "DROP TRIGGER IF EXISTS group_admin_settings_deletion_trigger", "DROP TABLE IF EXISTS wa_group_admin_settings", "CREATE TABLE wa_group_admin_settings (jid TEXT NOT NULL, restrict_mode BOOLEAN NOT NULL, announcement_group BOOLEAN NOT NULL, no_frequently_forwarded BOOLEAN NOT NULL, ephemeral_duration INTEGER DEFAULT NULL, creator_jid TEXT, in_app_support BOOLEAN NOT NULL )", "CREATE UNIQUE INDEX IF NOT EXISTS group_admin_settings_jid_index ON wa_group_admin_settings (jid)");
        C000200d.A0a(sQLiteDatabase, "CREATE TRIGGER group_admin_settings_deletion_trigger BEFORE DELETE ON wa_contacts BEGIN DELETE FROM wa_group_admin_settings WHERE jid = old.jid; END", "DROP TABLE IF EXISTS wa_block_list", "CREATE TABLE wa_block_list (jid TEXT NOT NULL)", "CREATE UNIQUE INDEX IF NOT EXISTS block_list_jid_index ON wa_block_list (jid)");
        C000200d.A0a(sQLiteDatabase, "DROP TABLE IF EXISTS wa_group_add_black_list", "CREATE TABLE wa_group_add_black_list (jid TEXT NOT NULL)", "CREATE UNIQUE INDEX IF NOT EXISTS group_add_black_list_jid_index ON wa_group_add_black_list (jid)", "DROP TABLE IF EXISTS wa_props");
        C000200d.A0a(sQLiteDatabase, "CREATE TABLE wa_props (_id INTEGER PRIMARY KEY AUTOINCREMENT, prop_name TEXT UNIQUE, prop_value TEXT)", "DROP TABLE IF EXISTS wa_last_entry_point", "CREATE TABLE wa_last_entry_point (jid TEXT NOT NULL, entry_point_type TEXT NOT NULL, entry_point_id TEXT, entry_point_time INTEGER)", "CREATE UNIQUE INDEX IF NOT EXISTS entry_point_jid_index ON wa_last_entry_point (jid)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder("Downgrading contacts database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        Log.w(sb.toString());
        onCreate(sQLiteDatabase);
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0185, code lost:
        if (r31 == 12) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x009b A[Catch: all -> 0x02e8, LOOP:0: B:122:0x0095->B:124:0x009b, LOOP_END, TRY_LEAVE, TryCatch #4 {all -> 0x02e8, blocks: (B:121:0x007e, B:122:0x0095, B:124:0x009b), top: B:203:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass062.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
