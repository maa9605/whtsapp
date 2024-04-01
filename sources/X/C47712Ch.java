package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: X.2Ch  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47712Ch extends SQLiteOpenHelper implements C04k {
    public C0CE A00;
    public C0CE A01;
    public final Context A02;
    public final AbstractC000600i A03;
    public final C04l A04;
    public final C04Z A05;

    public C47712Ch(Context context, AbstractC000600i abstractC000600i, C04Z c04z) {
        super(context, "emojidictionary.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.A02 = context;
        this.A03 = abstractC000600i;
        this.A05 = c04z;
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
        sQLiteDatabase.execSQL("CREATE TABLE emoji_search_tag (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, type INTEGER NOT NULL, symbol TEXT NOT NULL, tag TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS emoji_search_pack_index ON emoji_search_tag (type, symbol, tag)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS emoji_search_tag");
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS emoji_search_tag");
        onCreate(sQLiteDatabase);
    }
}
