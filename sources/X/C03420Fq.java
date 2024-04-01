package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0Fq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03420Fq extends AbstractC03430Fr {
    public final Context A00;
    public final C04Z A01;
    public final C03390Fn A02;
    public final String A03;
    public final ReentrantReadWriteLock A04;

    public C03420Fq(Context context, String str, AbstractC000600i abstractC000600i, C04Z c04z, C03390Fn c03390Fn) {
        super(context, abstractC000600i, str);
        this.A03 = str;
        this.A00 = context;
        this.A01 = c04z;
        this.A02 = c03390Fn;
        this.A04 = new ReentrantReadWriteLock();
    }

    public static void A00(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
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
            sb2.append("settings");
            sb2.append(" ADD ");
            sb2.append(str2);
            sb2.append(" ");
            sb2.append(str3);
            sQLiteDatabase.execSQL(sb2.toString());
        } catch (SQLiteException e) {
            StringBuilder sb3 = new StringBuilder("chat-settings-store/add-column ");
            sb3.append(str2);
            Log.e(sb3.toString(), e);
        }
    }

    @Override // X.AbstractC03430Fr
    public synchronized C0CE A03() {
        try {
            try {
                try {
                } catch (SQLiteDatabaseCorruptException e) {
                    Log.w("chat-settings-store/corrupt/removing", e);
                    A04();
                    return C002501g.A05(super.A00(), this.A01);
                }
            } catch (StackOverflowError e2) {
                Log.w("chat-settings-store/stackoverflowerror", e2);
                for (StackTraceElement stackTraceElement : e2.getStackTrace()) {
                    if (stackTraceElement.getMethodName().equals("onCorruption")) {
                        Log.w("chat-settings-store/stackoverflowerror/corrupt/removing");
                        A04();
                        return C002501g.A05(super.A00(), this.A01);
                    }
                }
                throw e2;
            }
        } catch (SQLiteException e3) {
            if (e3.toString().contains("file is encrypted")) {
                Log.w("chat-settings-store/encrypted/removing", e3);
                A04();
                return C002501g.A05(super.A00(), this.A01);
            }
            throw e3;
        }
        return C002501g.A05(A00(), this.A01);
    }

    public boolean A04() {
        boolean delete;
        synchronized (this) {
            close();
            Log.i("chat-settings-store/delete-database");
            Context context = this.A00;
            File databasePath = context.getDatabasePath(this.A03);
            delete = databasePath.delete();
            C002501g.A0O(databasePath, "chat-settings-store");
            StringBuilder sb = new StringBuilder();
            sb.append("chat-settings-store/delete-database/result=");
            sb.append(delete);
            Log.i(sb.toString());
            if (delete && Build.VERSION.SDK_INT >= 26 && getDatabaseName().equals("chatsettings.db")) {
                Log.i("chat-settings-store/deleteDatabaseFiles success");
                C03390Fn.A03(context);
            }
        }
        return delete;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i("chat-settings-store/create");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS settings");
        sQLiteDatabase.execSQL("CREATE TABLE settings (_id INTEGER PRIMARY KEY AUTOINCREMENT,jid TEXT,deleted INTEGER,mute_end INTEGER,muted_notifications BOOLEAN,use_custom_notifications BOOLEAN,message_tone TEXT,message_vibrate INTEGER,message_popup INTEGER,message_light INTEGER,call_tone TEXT,call_vibrate INTEGER,status_muted INTEGER,pinned BOOLEAN,pinned_time INTEGER,low_pri_notifications BOOLEAN,media_visibility INTEGER);");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS jid_index ON settings(jid);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C000200d.A0t("chat-settings-store/downgrade from ", i, " to ", i2);
        onCreate(sQLiteDatabase);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r3 == null) goto L10;
     */
    @Override // X.AbstractC03430Fr, android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onOpen(android.database.sqlite.SQLiteDatabase r5) {
        /*
            r4 = this;
            java.lang.String r2 = "settings"
            super.onOpen(r5)
            java.lang.String r3 = ""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3a
            r1.<init>()     // Catch: java.lang.Exception -> L3a
            java.lang.String r0 = "select sql from sqlite_master where type='table' and name='"
            r1.append(r0)     // Catch: java.lang.Exception -> L3a
            r1.append(r2)     // Catch: java.lang.Exception -> L3a
            java.lang.String r0 = "';"
            r1.append(r0)     // Catch: java.lang.Exception -> L3a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L3a
            r0 = 0
            android.database.Cursor r1 = r5.rawQuery(r1, r0)     // Catch: java.lang.Exception -> L3a
            if (r1 == 0) goto L42
            boolean r0 = r1.moveToNext()     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L2f
            r0 = 0
            java.lang.String r3 = r1.getString(r0)     // Catch: java.lang.Throwable -> L33
        L2f:
            r1.close()     // Catch: java.lang.Exception -> L3a
            goto L40
        L33:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L35
        L35:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L39
        L39:
            throw r0     // Catch: java.lang.Exception -> L3a
        L3a:
            r1 = move-exception
            java.lang.String r0 = "chat-settings-store/schema settings"
            com.whatsapp.util.Log.e(r0, r1)
        L40:
            if (r3 == 0) goto L7a
        L42:
            java.lang.String r0 = "status_muted"
            java.lang.String r2 = "INTEGER"
            A00(r5, r3, r0, r2)
            java.lang.String r0 = "pinned"
            java.lang.String r1 = "BOOLEAN"
            A00(r5, r3, r0, r1)
            java.lang.String r0 = "pinned_time"
            A00(r5, r3, r0, r2)
            java.lang.String r0 = "low_pri_notifications"
            A00(r5, r3, r0, r1)
            java.lang.String r0 = "media_visibility"
            A00(r5, r3, r0, r2)
            java.lang.String r1 = "TEXT"
            java.lang.String r0 = "wallpaper_light_type"
            A00(r5, r3, r0, r1)
            java.lang.String r0 = "wallpaper_light_value"
            A00(r5, r3, r0, r1)
            java.lang.String r0 = "wallpaper_dark_type"
            A00(r5, r3, r0, r1)
            java.lang.String r0 = "wallpaper_dark_value"
            A00(r5, r3, r0, r1)
            java.lang.String r0 = "wallpaper_dark_opacity"
            A00(r5, r3, r0, r2)
        L7a:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L96
            java.lang.String r1 = r4.getDatabaseName()
            java.lang.String r0 = "chatsettings.db"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L96
            java.lang.String r0 = "chat-settings-store/onOpen targeting api 26"
            com.whatsapp.util.Log.i(r0)
            X.0Fn r0 = r4.A02
            r0.A0D(r5)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03420Fq.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C000200d.A0t("chat-settings-store/upgrade from ", i, " to ", i2);
        onCreate(sQLiteDatabase);
    }
}
