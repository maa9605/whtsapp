package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: X.1sH */
/* loaded from: classes2.dex */
public class C40451sH extends SQLiteOpenHelper implements C04k {
    public static volatile C40451sH A06;
    public C0CE A00;
    public boolean A01;
    public final AbstractC000600i A02;
    public final C001200o A03;
    public final C04l A04;
    public final C04Z A05;

    public C40451sH(AbstractC000600i abstractC000600i, C001200o c001200o, C04Z c04z) {
        super(c001200o.A00, "media.db", (SQLiteDatabase.CursorFactory) null, 22);
        this.A02 = abstractC000600i;
        this.A03 = c001200o;
        this.A05 = c04z;
        this.A04 = new C04l();
        setWriteAheadLoggingEnabled(true);
    }

    public static C40451sH A00() {
        if (A06 == null) {
            synchronized (C40451sH.class) {
                if (A06 == null) {
                    A06 = new C40451sH(AbstractC000600i.A00(), C001200o.A01, C04Z.A00());
                }
            }
        }
        return A06;
    }

    public C0CD A01() {
        return new C0CD(null, this, true);
    }

    @Override // X.C04k
    public C04l ABg() {
        return this.A04;
    }

    @Override // X.C04k
    public synchronized C0CE ACk() {
        return AE6();
    }

    @Override // X.C04k
    public synchronized C0CE AE6() {
        this.A01 = true;
        C0CE c0ce = this.A00;
        if (c0ce == null || !c0ce.A00.isOpen()) {
            this.A00 = C002501g.A05(super.getWritableDatabase(), this.A05);
        }
        return this.A00;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized SQLiteDatabase getReadableDatabase() {
        C000700j.A08(false, "Use getReadableLoggableDatabase instead");
        return AE6().A00;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized SQLiteDatabase getWritableDatabase() {
        C000700j.A08(false, "Use getWritableLoggableDatabase instead");
        return AE6().A00;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_job");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_experiments");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS web_upload_media_data_store");
        sQLiteDatabase.execSQL("CREATE TABLE media_job (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,uuid TEXT NOT NULL, job_type INTEGER, create_time TIMESTAMP, transfer_start_time TIMESTAMP, last_update_time TIMESTAMP, user_initiated_attempt_count INTEGER, overall_cumulative_time TIMESTAMP, overall_cumulative_user_visible_time TIMESTAMP, streaming_playback_count INTEGER, media_key_reuse_type INTEGER, doodle_id TEXT, transferred_bytes INTEGER,reupload_attempt_count INTEGER,last_reupload_attempt_timestamp TIMESTAMP,last_reupload_success_timestamp TIMESTAMP)");
        sQLiteDatabase.execSQL("CREATE TABLE web_upload_media_data_store (media_id TEXT PRIMARY KEY NOT NULL, file_hash TEXT, media_key BLOB, mime_type TEXT, upload_url TEXT, direct_path TEXT, enc_file_hash TEXT, file_size INTEGER, width INTEGER, height INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE shared_media_ids (item_uuid TEXT PRIMARY KEY NOT NULL, file_name TEXT NOT NULL, mime_type TEXT NOT NULL, display_name TEXT, expiration_timestamp INTEGER NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_job");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_experiments");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_files");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS web_upload_media_key_store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS web_upload_media_data_store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS shared_media_ids");
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        sQLiteDatabase.execSQL("PRAGMA synchronous=NORMAL;");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_job");
        sQLiteDatabase.execSQL("CREATE TABLE media_job (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,uuid TEXT NOT NULL, job_type INTEGER, create_time TIMESTAMP, transfer_start_time TIMESTAMP, last_update_time TIMESTAMP, user_initiated_attempt_count INTEGER, overall_cumulative_time TIMESTAMP, overall_cumulative_user_visible_time TIMESTAMP, streaming_playback_count INTEGER, media_key_reuse_type INTEGER, doodle_id TEXT, transferred_bytes INTEGER,reupload_attempt_count INTEGER,last_reupload_attempt_timestamp TIMESTAMP,last_reupload_success_timestamp TIMESTAMP)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_experiments");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_files");
        if (i < 16) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS web_upload_media_key_store");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS web_upload_media_data_store");
            sQLiteDatabase.execSQL("CREATE TABLE web_upload_media_data_store (media_id TEXT PRIMARY KEY NOT NULL, file_hash TEXT, media_key BLOB, mime_type TEXT, upload_url TEXT, direct_path TEXT, enc_file_hash TEXT, file_size INTEGER, width INTEGER, height INTEGER)");
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS shared_media_ids");
        sQLiteDatabase.execSQL("CREATE TABLE shared_media_ids (item_uuid TEXT PRIMARY KEY NOT NULL, file_name TEXT NOT NULL, mime_type TEXT NOT NULL, display_name TEXT, expiration_timestamp INTEGER NOT NULL)");
    }
}
