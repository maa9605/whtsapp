package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.1qi  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39781qi extends AbstractC31511cO implements Closeable {
    public static final String A03 = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id");
    public static final String A04 = String.format("SELECT MAX(%s) FROM %s WHERE 1;", "hit_time", "hits2");
    public final C17C A00;
    public final C17Z A01;
    public final C17Z A02;

    @Override // X.AbstractC31511cO
    public final void A0D() {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.17C] */
    public C39781qi(AnonymousClass176 anonymousClass176) {
        super(anonymousClass176);
        InterfaceC232215r interfaceC232215r = ((AnonymousClass174) this).A00.A03;
        this.A01 = new C17Z(interfaceC232215r);
        this.A02 = new C17Z(interfaceC232215r);
        final Context context = anonymousClass176.A00;
        this.A00 = new SQLiteOpenHelper(context) { // from class: X.17C
            @Override // android.database.sqlite.SQLiteOpenHelper
            public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            }

            public static Set A00(SQLiteDatabase sQLiteDatabase, String str) {
                HashSet hashSet = new HashSet();
                StringBuilder sb = new StringBuilder(str.length() + 22);
                sb.append("SELECT * FROM ");
                sb.append(str);
                sb.append(" LIMIT 0");
                Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
                try {
                    for (String str2 : rawQuery.getColumnNames()) {
                        hashSet.add(str2);
                    }
                    return hashSet;
                } finally {
                    rawQuery.close();
                }
            }

            public final boolean A01(SQLiteDatabase sQLiteDatabase, String str) {
                Cursor cursor = null;
                try {
                    try {
                        cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                        boolean moveToFirst = cursor.moveToFirst();
                        cursor.close();
                        return moveToFirst;
                    } catch (SQLiteException e) {
                        C39781qi.this.A0A("Error querying for table", str, e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    }
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public final SQLiteDatabase getWritableDatabase() {
                C39781qi c39781qi = C39781qi.this;
                C17Z c17z = c39781qi.A02;
                if (c17z.A01(3600000L)) {
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException unused) {
                        c17z.A00();
                        c39781qi.A05("Opening the database failed, dropping the table and recreating it");
                        ((AnonymousClass174) c39781qi).A00.A00.getDatabasePath("google_analytics_v4.db").delete();
                        try {
                            SQLiteDatabase writableDatabase = super.getWritableDatabase();
                            c17z.A00 = 0L;
                            return writableDatabase;
                        } catch (SQLiteException e) {
                            c39781qi.A09("Failed to open freshly created database", e);
                            throw e;
                        }
                    }
                }
                throw new SQLiteException("Database open failed");
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public final void onCreate(SQLiteDatabase sQLiteDatabase) {
                String path = sQLiteDatabase.getPath();
                try {
                    if (Integer.parseInt(Build.VERSION.SDK) >= 9) {
                        File file = new File(path);
                        file.setReadable(false, false);
                        file.setWritable(false, false);
                        file.setReadable(true, true);
                        file.setWritable(true, true);
                    }
                } catch (NumberFormatException unused) {
                    String str = "Invalid version number";
                    String str2 = Build.VERSION.SDK;
                    C39851qp c39851qp = C39851qp.A00;
                    if (c39851qp != null) {
                        c39851qp.A09("Invalid version number", str2);
                        return;
                    }
                    if (str2 != null) {
                        StringBuilder sb = new StringBuilder(str2.length() + 23);
                        sb.append("Invalid version number");
                        sb.append(":");
                        sb.append(str2);
                        str = sb.toString();
                    }
                    Log.e((String) C17L.A0C.A00, str);
                }
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public final void onOpen(SQLiteDatabase sQLiteDatabase) {
                AbstractCollection abstractCollection;
                AbstractCollection abstractCollection2;
                int i = 0;
                if (!A01(sQLiteDatabase, "hits2")) {
                    sQLiteDatabase.execSQL(C39781qi.A03);
                } else {
                    Set A00 = A00(sQLiteDatabase, "hits2");
                    String[] strArr = {"hit_id", "hit_string", "hit_time", "hit_url"};
                    int i2 = 0;
                    do {
                        String str = strArr[i2];
                        abstractCollection = (AbstractCollection) A00;
                        if (!abstractCollection.remove(str)) {
                            String valueOf = String.valueOf(str);
                            throw new SQLiteException(valueOf.length() != 0 ? "Database hits2 is missing required column: ".concat(valueOf) : new String("Database hits2 is missing required column: "));
                        }
                        i2++;
                    } while (i2 < 4);
                    boolean z = !abstractCollection.remove("hit_app_id");
                    if (!abstractCollection.isEmpty()) {
                        throw new SQLiteException("Database hits2 has extra columns");
                    }
                    if (z) {
                        sQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
                    }
                }
                if (!A01(sQLiteDatabase, "properties")) {
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
                    return;
                }
                Set A002 = A00(sQLiteDatabase, "properties");
                String[] strArr2 = {"app_uid", "cid", "tid", "params", "adid", "hits_count"};
                do {
                    String str2 = strArr2[i];
                    abstractCollection2 = (AbstractCollection) A002;
                    if (!abstractCollection2.remove(str2)) {
                        String valueOf2 = String.valueOf(str2);
                        throw new SQLiteException(valueOf2.length() != 0 ? "Database properties is missing required column: ".concat(valueOf2) : new String("Database properties is missing required column: "));
                    }
                    i++;
                } while (i < 6);
                if (!abstractCollection2.isEmpty()) {
                    throw new SQLiteException("Database properties table has extra columns");
                }
            }
        };
    }

    public final SQLiteDatabase A0E() {
        try {
            return getWritableDatabase();
        } catch (SQLiteException e) {
            A08("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
        if (r12.startsWith("http:") == false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [X.174, X.1cO, X.1qi] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List A0F(long r24) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39781qi.A0F(long):java.util.List");
    }

    public final void A0G() {
        A0C();
        A0E().endTransaction();
    }

    public final void A0H() {
        A0C();
        A0E().setTransactionSuccessful();
    }

    public final void A0I(List list) {
        C07K.A1P(list);
        C13H.A00();
        A0C();
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder("hit_id");
        sb.append(" in (");
        for (int i = 0; i < list.size(); i++) {
            Number number = (Number) list.get(i);
            if (number != null && number.longValue() != 0) {
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(number);
            } else {
                throw new SQLiteException("Invalid hit id");
            }
        }
        sb.append(")");
        String obj = sb.toString();
        try {
            SQLiteDatabase A0E = A0E();
            A06("Deleting dispatched hits. count", Integer.valueOf(list.size()));
            int delete = A0E.delete("hits2", obj, null);
            if (delete != list.size()) {
                A02(5, "Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), obj);
            }
        } catch (SQLiteException e) {
            A09("Error deleting hits", e);
            throw e;
        }
    }

    public final boolean A0J() {
        C13H.A00();
        A0C();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = A0E().rawQuery("SELECT COUNT(*) FROM hits2", null);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    rawQuery.close();
                    return j == 0;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                A02(6, "Database error", "SELECT COUNT(*) FROM hits2", e, null);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            close();
        } catch (SQLiteException e) {
            A09("Sql error closing database", e);
        } catch (IllegalStateException e2) {
            A09("Error closing database", e2);
        }
    }
}
