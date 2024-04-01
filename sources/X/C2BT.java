package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.2BT */
/* loaded from: classes2.dex */
public class C2BT extends SQLiteOpenHelper implements C04k {
    public C0CE A00;
    public C0CE A01;
    public final AbstractC000600i A02;
    public final C012005w A03;
    public final C04l A04;
    public final C04Z A05;

    public C2BT(AbstractC000600i abstractC000600i, C001200o c001200o, C04Z c04z, C012005w c012005w) {
        super(c001200o.A00, "gifs.db", (SQLiteDatabase.CursorFactory) null, 4);
        this.A02 = abstractC000600i;
        this.A05 = c04z;
        new ReentrantReadWriteLock();
        this.A03 = c012005w;
        this.A04 = new C04l();
    }

    @Override // X.C04k
    public C04l ABg() {
        return this.A04;
    }

    @Override // X.C04k
    public synchronized C0CE ACk() {
        C0CE c0ce = this.A00;
        if (c0ce == null || !c0ce.A00.isOpen()) {
            this.A00 = C002501g.A05(super.getReadableDatabase(), this.A05);
        }
        return this.A00;
    }

    @Override // X.C04k
    public synchronized C0CE AE6() {
        C0CE c0ce = this.A01;
        if (c0ce == null || !c0ce.A00.isOpen()) {
            this.A01 = C002501g.A05(super.getWritableDatabase(), this.A05);
        }
        return this.A01;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getReadableDatabase() {
        C000700j.A08(false, "Use getReadableLoggableDatabase instead");
        return super.getReadableDatabase();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getWritableDatabase() {
        C000700j.A08(false, "Use getWritableLoggableDatabase instead");
        return super.getWritableDatabase();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE gifs (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, plain_file_hash TEXT NOT NULL, file_path TEXT NOT NULL, height INTEGER NOT NULL, width INTEGER NOT NULL, gif_attribution INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS gifs_hash_index ON gifs(plain_file_hash);");
        sQLiteDatabase.execSQL("CREATE TABLE recent_gifs (plaintext_hash TEXT PRIMARY KEY, entry_weight FLOAT)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS recents_weight_index ON recent_gifs(entry_weight);");
        sQLiteDatabase.execSQL("CREATE TABLE starred_gifs (plaintext_hash TEXT PRIMARY KEY, timestamp INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE downloadable_gifs (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, timestamp INTEGER NOT NULL, gif_id TEXT NOT NULL, static_url TEXT NOT NULL, static_width INTEGER NOT NULL, static_height INTEGER NOT NULL, preview_url TEXT NOT NULL, preview_width INTEGER NOT NULL, preview_height INTEGER NOT NULL, content_url TEXT NOT NULL, content_width INTEGER NOT NULL, content_height INTEGER NOT NULL, gif_attribution INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS media_url_index ON downloadable_gifs(content_url);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C000200d.A0t("GifDBHelper/onDowngrade/oldVersion:", i, ", newVersion:", i2);
        C000200d.A0a(sQLiteDatabase, "DROP TABLE IF EXISTS gifs", "DROP TABLE IF EXISTS recent_gifs", "DROP TABLE IF EXISTS starred_gifs", "DROP TABLE IF EXISTS downloadable_gifs");
        AnonymousClass024.A0S(this.A03.A0C());
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C000200d.A0t("GifDBHelper/onUpgrade/old version:", i, ", new version: ", i2);
        if (i == 1) {
            sQLiteDatabase.execSQL("CREATE TABLE starred_gifs (plaintext_hash TEXT PRIMARY KEY, timestamp INTEGER NOT NULL)");
        } else if (i != 2) {
            if (i != 3) {
                return;
            }
            C000200d.A0a(sQLiteDatabase, "DROP TABLE IF EXISTS gifs", "DROP TABLE IF EXISTS recent_gifs", "DROP TABLE IF EXISTS starred_gifs", "DROP TABLE IF EXISTS downloadable_gifs");
            AnonymousClass024.A0S(this.A03.A0C());
            onCreate(sQLiteDatabase);
        }
        sQLiteDatabase.execSQL("CREATE TABLE downloadable_gifs (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, timestamp INTEGER NOT NULL, gif_id TEXT NOT NULL, static_url TEXT NOT NULL, static_width INTEGER NOT NULL, static_height INTEGER NOT NULL, preview_url TEXT NOT NULL, preview_width INTEGER NOT NULL, preview_height INTEGER NOT NULL, content_url TEXT NOT NULL, content_width INTEGER NOT NULL, content_height INTEGER NOT NULL, gif_attribution INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS media_url_index ON downloadable_gifs(content_url);");
        C000200d.A0a(sQLiteDatabase, "DROP TABLE IF EXISTS gifs", "DROP TABLE IF EXISTS recent_gifs", "DROP TABLE IF EXISTS starred_gifs", "DROP TABLE IF EXISTS downloadable_gifs");
        AnonymousClass024.A0S(this.A03.A0C());
        onCreate(sQLiteDatabase);
    }
}
