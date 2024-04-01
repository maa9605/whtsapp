package X;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.List;

/* renamed from: X.0pX */
/* loaded from: classes.dex */
public class C15910pX extends SQLiteOpenHelper {
    public boolean A00;
    public final AbstractC15830pP A01;
    public final C28931Um[] A02;

    public C15910pX(Context context, String str, final C28931Um[] c28931UmArr, final AbstractC15830pP abstractC15830pP) {
        super(context, str, null, abstractC15830pP.A00, new DatabaseErrorHandler() { // from class: X.0pW
            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                AbstractC15830pP abstractC15830pP2 = abstractC15830pP;
                C28931Um A00 = C15910pX.A00(c28931UmArr, sQLiteDatabase);
                List<Pair<String, String>> list = null;
                if (abstractC15830pP2 != null) {
                    StringBuilder A0P = C000200d.A0P("Corruption reported by sqlite on database: ");
                    SQLiteDatabase sQLiteDatabase2 = A00.A00;
                    A0P.append(sQLiteDatabase2.getPath());
                    Log.e("SupportSQLite", A0P.toString());
                    if (!sQLiteDatabase2.isOpen()) {
                        AbstractC15830pP.A00(sQLiteDatabase2.getPath());
                        return;
                    }
                    try {
                        try {
                            list = sQLiteDatabase2.getAttachedDbs();
                        } catch (SQLiteException unused) {
                        }
                        try {
                            A00.close();
                        } catch (IOException unused2) {
                        }
                        if (list != null) {
                            return;
                        }
                        return;
                    } finally {
                        if (list != null) {
                            for (Pair<String, String> next : list) {
                                AbstractC15830pP.A00((String) next.second);
                            }
                        } else {
                            AbstractC15830pP.A00(sQLiteDatabase2.getPath());
                        }
                    }
                }
                throw null;
            }
        });
        this.A01 = abstractC15830pP;
        this.A02 = c28931UmArr;
    }

    public static C28931Um A00(C28931Um[] c28931UmArr, SQLiteDatabase sQLiteDatabase) {
        C28931Um c28931Um = c28931UmArr[0];
        if (c28931Um == null || c28931Um.A00 != sQLiteDatabase) {
            c28931UmArr[0] = new C28931Um(sQLiteDatabase);
        }
        return c28931UmArr[0];
    }

    public synchronized InterfaceC15820pO A01() {
        this.A00 = false;
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        if (this.A00) {
            close();
            return A01();
        }
        return A00(this.A02, writableDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public synchronized void close() {
        super.close();
        this.A02[0] = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        AbstractC15830pP abstractC15830pP = this.A01;
        A00(this.A02, sQLiteDatabase);
        if (abstractC15830pP == null) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0024, code lost:
        if (r2.getInt(0) != 0) goto L29;
     */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.database.sqlite.SQLiteDatabase r8) {
        /*
            r7 = this;
            X.0pP r6 = r7.A01
            X.1Um[] r0 = r7.A02
            X.1Um r5 = A00(r0, r8)
            X.1Ui r6 = (X.C28901Ui) r6
            r4 = 0
            if (r6 == 0) goto L71
            java.lang.String r1 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            X.1Ul r0 = new X.1Ul
            r0.<init>(r1)
            android.database.Cursor r2 = r5.A00(r0)
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L6c
            r3 = 0
            if (r0 == 0) goto L26
            int r1 = r2.getInt(r3)     // Catch: java.lang.Throwable -> L6c
            r0 = 1
            if (r1 == 0) goto L27
        L26:
            r0 = 0
        L27:
            r2.close()
            X.0ow r1 = r6.A01
            r1.A01(r5)
            if (r0 != 0) goto L4e
            X.0ox r2 = r1.A00(r5)
            boolean r0 = r2.A01
            if (r0 != 0) goto L4e
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            java.lang.String r0 = r2.A00
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L4e:
            r6.A02(r5)
            X.1Vb r1 = (X.C29081Vb) r1
            androidx.work.impl.WorkDatabase_Impl r2 = r1.A00
            java.util.List r0 = r2.A01
            if (r0 == 0) goto L6b
            int r1 = r0.size()
        L5d:
            if (r3 >= r1) goto L6b
            java.util.List r0 = r2.A01
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L6a
            int r3 = r3 + 1
            goto L5d
        L6a:
            throw r4
        L6b:
            return
        L6c:
            r0 = move-exception
            r2.close()
            throw r0
        L71:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15910pX.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.A00 = true;
        this.A01.A01(A00(this.A02, sQLiteDatabase), i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0029, code lost:
        if (r4.getInt(0) == 0) goto L70;
     */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onOpen(android.database.sqlite.SQLiteDatabase r12) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15910pX.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.A00 = true;
        this.A01.A01(A00(this.A02, sQLiteDatabase), i, i2);
    }
}
