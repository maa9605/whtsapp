package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1wf */
/* loaded from: classes2.dex */
public class C42991wf extends SQLiteOpenHelper implements C04k {
    public C0CE A00;
    public C0CE A01;
    public final Context A02;
    public final AbstractC000600i A03;
    public final C04l A04;
    public final C04Z A05;

    public C42991wf(Context context, AbstractC000600i abstractC000600i, C04Z c04z) {
        super(context, "web_sessions.db", (SQLiteDatabase.CursorFactory) null, 7);
        this.A02 = context;
        this.A03 = abstractC000600i;
        this.A05 = c04z;
        this.A04 = new C04l();
    }

    public static final void A00(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        String str3;
        str3 = "";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("select sql from sqlite_master where type='table' and name='");
            sb.append("sessions");
            sb.append("';");
            Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
            if (rawQuery != null) {
                str3 = rawQuery.moveToNext() ? rawQuery.getString(0) : "";
                rawQuery.close();
            }
        } catch (Exception e) {
            Log.e("websessionstore/schema sessions", e);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" ");
        sb2.append(str2);
        if (str3.contains(sb2.toString())) {
            return;
        }
        try {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ALTER TABLE sessions ADD ");
            sb3.append(str);
            sb3.append(" ");
            sb3.append(str2);
            sQLiteDatabase.execSQL(sb3.toString());
        } catch (SQLiteException e2) {
            StringBuilder sb4 = new StringBuilder("WebSessionsStore/addColumnIfNotExists/alter_table ");
            sb4.append(str);
            Log.w(sb4.toString(), e2);
        }
    }

    public synchronized void A01() {
        close();
        Log.i("websessionstore/delete-database");
        File databasePath = this.A02.getDatabasePath("web_sessions.db");
        boolean delete = databasePath.delete();
        C002501g.A0O(databasePath, "websessionstore");
        StringBuilder sb = new StringBuilder();
        sb.append("websessionstore/delete-database/result=");
        sb.append(delete);
        Log.i(sb.toString());
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
                Log.w("websessionstore/corrupt/removing", e);
                A01();
                C0CE A052 = C002501g.A05(super.getReadableDatabase(), this.A05);
                this.A00 = A052;
                return A052;
            } catch (SQLiteException e2) {
                String obj = e2.toString();
                if (obj.contains("file is encrypted")) {
                    Log.w("websessionstore/encrypted/removing");
                    A01();
                    C0CE A053 = C002501g.A05(super.getReadableDatabase(), this.A05);
                    this.A00 = A053;
                    return A053;
                } else if (obj.contains("upgrade read-only database")) {
                    Log.w("websessionstore/switching-to-writable");
                    C0CE AE6 = AE6();
                    this.A00 = AE6;
                    return AE6;
                } else {
                    throw e2;
                }
            }
        } catch (StackOverflowError e3) {
            Log.w("websessionstore/stackoverflowerror");
            for (StackTraceElement stackTraceElement : e3.getStackTrace()) {
                if (stackTraceElement.getMethodName().equals("onCorruption")) {
                    Log.w("websessionstore/stackoverflowerror/corrupt/removing");
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
                    Log.w("websessionstore/stackoverflowerror");
                    for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                        if (stackTraceElement.getMethodName().equals("onCorruption")) {
                            Log.w("websessionstore/stackoverflowerror/corrupt/removing");
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
                    Log.w("websessionstore/encrypted/removing", e2);
                    A01();
                    C0CE A053 = C002501g.A05(super.getWritableDatabase(), this.A05);
                    this.A01 = A053;
                    return A053;
                }
                throw e2;
            }
        } catch (SQLiteDatabaseCorruptException e3) {
            Log.w("websessionstore/corrupt/removing", e3);
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
        C000200d.A0Z(sQLiteDatabase, "DROP TABLE IF EXISTS sessions", "CREATE TABLE sessions (_id INTEGER PRIMARY KEY AUTOINCREMENT,browser_id TEXT,secret TEXT,token TEXT,os TEXT,browser_type TEXT,login_time INTEGER,lat REAL,lon REAL,accuracy REAL,place_name TEXT,last_active INTEGER,timeout BOOLEAN,expiration INTEGER,last_push_sent INTEGER,syncd_release INTEGER);", "CREATE UNIQUE INDEX IF NOT EXISTS browser_id_index ON sessions(browser_id);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C000200d.A0t("websessionstore/downgrade from ", i, " to ", i2);
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase.getVersion() == 3) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("select sql from sqlite_master where type='table' and name='sessions'", null);
            try {
                if (rawQuery.moveToNext() && rawQuery.getString(0).contains("fserviceBOOLEAN")) {
                    sQLiteDatabase.beginTransaction();
                    sQLiteDatabase.execSQL("DROP INDEX IF EXISTS browser_id_index");
                    sQLiteDatabase.execSQL("ALTER TABLE sessions RENAME TO sessions_old");
                    onCreate(sQLiteDatabase);
                    sQLiteDatabase.execSQL("INSERT INTO sessions (_id, browser_id, secret, token, os, browser_type, lat, lon, accuracy, place_name, last_active, timeout, expiration) SELECT _id, browser_id, secret, token, os, browser_type, lat, lon, accuracy, place_name, last_active, timeout, expiration FROM sessions_old");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sessions_old");
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                }
                rawQuery.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (rawQuery != null) {
                        try {
                            rawQuery.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th2;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C000200d.A0t("websessionstore/upgrade from ", i, " to ", i2);
        switch (i) {
            case 1:
                sQLiteDatabase.execSQL("ALTER TABLE sessions ADD timeout BOOLEAN");
                sQLiteDatabase.execSQL("ALTER TABLE sessions ADD expiration INTEGER");
            case 2:
                sQLiteDatabase.execSQL("ALTER TABLE sessions ADD fservice BOOLEAN");
            case 3:
                sQLiteDatabase.execSQL("ALTER TABLE sessions ADD last_push_sent INTEGER");
            case 4:
            case 5:
                A00(sQLiteDatabase, "login_time", "INTEGER");
                break;
            case 6:
                break;
            default:
                Log.e("websessionstore/upgrade unknown old version");
                onCreate(sQLiteDatabase);
                return;
        }
        A00(sQLiteDatabase, "syncd_release", "INTEGER DEFAULT 0");
    }
}
