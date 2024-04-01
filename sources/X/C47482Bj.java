package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2Bj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47482Bj extends SQLiteOpenHelper implements C04k {
    public C0CE A00;
    public C0CE A01;
    public final Context A02;
    public final AbstractC000600i A03;
    public final C04l A04;
    public final C04Z A05;

    public C47482Bj(Context context, AbstractC000600i abstractC000600i, C04Z c04z) {
        super(context, "hsmpacks.db", (SQLiteDatabase.CursorFactory) null, 2);
        this.A02 = context;
        this.A03 = abstractC000600i;
        this.A05 = c04z;
        this.A04 = new C04l();
    }

    public synchronized void A00() {
        close();
        Log.i("deleting HSM pack database...");
        File databasePath = this.A02.getDatabasePath("hsmpacks.db");
        boolean delete = databasePath.delete();
        StringBuilder sb = new StringBuilder();
        sb.append("language-pack-store/deleted HSM pack database; databaseDeleted=");
        sb.append(delete);
        Log.i(sb.toString());
        C002501g.A0O(databasePath, "language-pack-store");
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
            A05 = C002501g.A05(super.getReadableDatabase(), this.A05);
            this.A00 = A05;
        } catch (SQLiteException e) {
            Log.e("failed to open pack store", e);
            A00();
            A05 = C002501g.A05(super.getReadableDatabase(), this.A05);
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
            A05 = C002501g.A05(super.getWritableDatabase(), this.A05);
            this.A01 = A05;
        } catch (SQLiteException e) {
            Log.e("failed to open pack store", e);
            A00();
            A05 = C002501g.A05(super.getWritableDatabase(), this.A05);
            this.A01 = A05;
        }
        return A05;
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
        C000200d.A0Z(sQLiteDatabase, "DROP TABLE IF EXISTS packs", "CREATE TABLE packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, lg TEXT NOT NULL, lc TEXT NOT NULL, hash TEXT NOT NULL, namespace TEXT NOT NULL, timestamp INTEGER NOT NULL, data BLOB NOT NULL)", "CREATE UNIQUE INDEX IF NOT EXISTS pack_index ON packs (lg, lc, namespace)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C000200d.A0t("language-pack-store/downgrade from ", i, " to ", i2);
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C000200d.A0t("language-pack-store/upgrade from ", i, " to ", i2);
        if (i == 1) {
            onCreate(sQLiteDatabase);
            return;
        }
        Log.e("language-pack-store/upgrade unknown old version");
        onCreate(sQLiteDatabase);
    }
}
