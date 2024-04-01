package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;

/* renamed from: X.3g9  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C76163g9 extends SQLiteOpenHelper implements C04k {
    public C0CE A00;
    public C0CE A01;
    public final C04l A02;
    public final C04Z A03;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public C76163g9(Context context, C04Z c04z) {
        super(context, "migration_prefetcher.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.A03 = c04z;
        this.A02 = new C04l();
        setWriteAheadLoggingEnabled(true);
    }

    @Override // X.C04k
    public C04l ABg() {
        return this.A02;
    }

    @Override // X.C04k
    public synchronized C0CE ACk() {
        C0CE A05;
        C0CE c0ce = this.A00;
        if (c0ce != null && c0ce.A00.isOpen()) {
            return this.A00;
        }
        try {
            A05 = C002501g.A05(super.getReadableDatabase(), this.A03);
            this.A00 = A05;
        } catch (SQLiteException e) {
            Log.e("Failed to open readable file prefetcher db.", e);
            A05 = C002501g.A05(super.getReadableDatabase(), this.A03);
            this.A00 = A05;
        }
        return A05;
    }

    @Override // X.C04k
    public synchronized C0CE AE6() {
        C0CE A05;
        C0CE c0ce = this.A01;
        if (c0ce != null && c0ce.A00.isOpen()) {
            return this.A01;
        }
        try {
            A05 = C002501g.A05(super.getWritableDatabase(), this.A03);
            this.A01 = A05;
        } catch (SQLiteException e) {
            Log.e("Failed to open writable file prefetcher db.", e);
            A05 = C002501g.A05(super.getWritableDatabase(), this.A03);
            this.A01 = A05;
        }
        return A05;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getReadableDatabase() {
        C000700j.A08(false, "Use getReadableLoggableDatabase() instead.");
        return super.getReadableDatabase();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getWritableDatabase() {
        C000700j.A08(false, "Use getWritableLoggableDatabase() instead.");
        return super.getWritableDatabase();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE prefetched_files(_id INTEGER PRIMARY KEY AUTOINCREMENT, remote_file_path TEXT UNIQUE NOT NULL, prefetched_file_path TEXT UNIQUE, file_size INTEGER, prefetched INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS remote_file_path_index ON prefetched_files (remote_file_path)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        sQLiteDatabase.enableWriteAheadLogging();
    }
}
