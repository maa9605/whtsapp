package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.21j  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C453321j extends SQLiteOpenHelper implements C04k {
    public C0CE A00;
    public C0CE A01;
    public final Context A02;
    public final AbstractC000600i A03;
    public final C04l A04;
    public final C04Z A05;

    public C453321j(Context context, AbstractC000600i abstractC000600i, C04Z c04z) {
        super(context, "location.db", (SQLiteDatabase.CursorFactory) null, 2);
        setWriteAheadLoggingEnabled(true);
        this.A02 = context;
        this.A03 = abstractC000600i;
        this.A05 = c04z;
        this.A04 = new C04l();
    }

    public C0CD A00() {
        return new C0CD(null, this, true);
    }

    public void A01() {
        synchronized (this) {
            close();
            Log.i("LocationSharingStore/DatabaseHelper/deleteDatabaseFiles");
            File databasePath = this.A02.getDatabasePath("location.db");
            boolean delete = databasePath.delete();
            StringBuilder sb = new StringBuilder();
            sb.append("LocationSharingStore/DatabaseHelper/deleteDatabaseFiles/deleted location database; databaseDeleted=");
            sb.append(delete);
            Log.i(sb.toString());
            C002501g.A0O(databasePath, "LocationSharingStore/DatabaseHelper");
        }
    }

    @Override // X.C04k
    public C04l ABg() {
        return this.A04;
    }

    @Override // X.C04k
    public synchronized C0CE ACk() {
        C0CE c0ce = this.A00;
        if (c0ce != null && c0ce.A00.isOpen()) {
            return this.A00;
        }
        try {
            try {
                C0CE A05 = C002501g.A05(super.getReadableDatabase(), this.A05);
                this.A00 = A05;
                return A05;
            } catch (SQLiteDatabaseCorruptException e) {
                Log.w("LocationSharingStore/DatabaseHelper/getReadableDatabase/Locations database is corrupt. Removing...", e);
                A01();
                C0CE A052 = C002501g.A05(super.getReadableDatabase(), this.A05);
                this.A00 = A052;
                return A052;
            } catch (SQLiteException e2) {
                String obj = e2.toString();
                if (obj.contains("file is encrypted")) {
                    Log.w("LocationSharingStore/DatabaseHelper/getReadableDatabase/Locations database is encrypted. Removing...", e2);
                    A01();
                    C0CE A053 = C002501g.A05(super.getReadableDatabase(), this.A05);
                    this.A00 = A053;
                    return A053;
                } else if (obj.contains("upgrade read-only database")) {
                    Log.w("LocationSharingStore/DatabaseHelper/getReadableDatabase/Client actually opened database as read-only and can't upgrade. Switching to writable...", e2);
                    C0CE AE6 = AE6();
                    this.A00 = AE6;
                    return AE6;
                } else {
                    throw e2;
                }
            }
        } catch (StackOverflowError e3) {
            Log.w("LocationSharingStore/DatabaseHelper/getReadableDatabase/StackOverflowError during db init check");
            for (StackTraceElement stackTraceElement : e3.getStackTrace()) {
                if (stackTraceElement.getMethodName().equals("onCorruption")) {
                    Log.w("LocationSharingStore/DatabaseHelper/getReadableDatabase/Locations database is corrupt. Found via StackOverflowError. Removing...");
                    A01();
                    C0CE A054 = C002501g.A05(super.getReadableDatabase(), this.A05);
                    this.A00 = A054;
                    return A054;
                }
            }
            throw e3;
        }
    }

    @Override // X.C04k
    public synchronized C0CE AE6() {
        C0CE c0ce = this.A01;
        if (c0ce != null && c0ce.A00.isOpen()) {
            return this.A01;
        }
        try {
            try {
                try {
                    C0CE A05 = C002501g.A05(super.getWritableDatabase(), this.A05);
                    this.A01 = A05;
                    return A05;
                } catch (StackOverflowError e) {
                    Log.w("LocationSharingStore/DatabaseHelper/getWritableDatabase/StackOverflowError during db init check");
                    for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                        if (stackTraceElement.getMethodName().equals("onCorruption")) {
                            Log.w("LocationSharingStore/DatabaseHelper/getWritableDatabase/Locations database is corrupt. Found via StackOverflowError. Removing...");
                            A01();
                            C0CE A052 = C002501g.A05(super.getWritableDatabase(), this.A05);
                            this.A01 = A052;
                            return A052;
                        }
                    }
                    throw e;
                }
            } catch (SQLiteException e2) {
                if (e2.toString().contains("file is encrypted")) {
                    Log.w("LocationSharingStore/DatabaseHelper/getWritableDatabase/Locations database is encrypted. Removing...", e2);
                    A01();
                    C0CE A053 = C002501g.A05(super.getWritableDatabase(), this.A05);
                    this.A01 = A053;
                    return A053;
                }
                throw e2;
            }
        } catch (SQLiteDatabaseCorruptException e3) {
            Log.w("LocationSharingStore/DatabaseHelper/getWritableDatabase/Locations database is corrupt. Removing...", e3);
            A01();
            C0CE A054 = C002501g.A05(super.getWritableDatabase(), this.A05);
            this.A01 = A054;
            return A054;
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
        Log.i("LocationSharingStore/DatabaseHelper/onCreate; version=2");
        Log.i("LocationSharingStore/DatabaseHelper/createLocationSharerTable/creating location_sharer table; version=2");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS location_sharer");
        sQLiteDatabase.execSQL("CREATE TABLE location_sharer (_id INTEGER PRIMARY KEY AUTOINCREMENT, remote_jid TEXT NOT NULL, from_me BOOLEAN NOT NULL, remote_resource TEXT NOT NULL, expires INTEGER NOT NULL, message_id TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS location_sharer_index ON location_sharer(remote_jid, from_me, remote_resource, message_id)");
        Log.i("LocationSharingStore/DatabaseHelper/createLocationKeyDistributionTable/creating location_key_distribution table; version=2");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS location_key_distribution");
        sQLiteDatabase.execSQL("CREATE TABLE location_key_distribution (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, sent_to_server BOOLEAN NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS location_key_distribution_index ON location_key_distribution(jid)");
        Log.i("LocationSharingStore/DatabaseHelper/createUserLocationsTable/creating location_cache table; version=2");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS location_cache");
        sQLiteDatabase.execSQL("CREATE TABLE location_cache (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, latitude REAL NOT NULL, longitude REAL NOT NULL, accuracy INTEGER NOT NULL, speed REAL NOT NULL, bearing INTEGER NOT NULL, location_ts INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS user_location_index ON location_cache(jid)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder("LocationSharingStore/DatabaseHelper/onDowngrade; oldVersion=");
        sb.append(i);
        sb.append("; newVersion=");
        sb.append(i2);
        Log.w(sb.toString());
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C000200d.A0t("LocationSharingStore/DatabaseHelper/onUpgrade; oldVersion=", i, "; newVersion=", i2);
        if (i2 != 2) {
            throw new SQLiteException(C000200d.A0F("LocationSharingStore/DatabaseHelper/Unknown upgrade destination version: ", i, " -> ", i2));
        }
        if (i != 1) {
            Log.i("LocationSharingStore/DatabaseHelper/onUpgrade/unknown old version");
            onCreate(sQLiteDatabase);
            return;
        }
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS location_sharer_index");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS location_sharer_index ON location_sharer(remote_jid, from_me, remote_resource, message_id)");
    }
}
