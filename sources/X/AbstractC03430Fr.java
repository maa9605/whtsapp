package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: X.0Fr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC03430Fr extends SQLiteOpenHelper implements C04k {
    public C0CE A00;
    public final AbstractC000600i A01;
    public final C04l A02;

    public abstract C0CE A03();

    public AbstractC03430Fr(Context context, AbstractC000600i abstractC000600i, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.A01 = abstractC000600i;
        this.A02 = new C04l();
    }

    public SQLiteDatabase A00() {
        return super.getWritableDatabase();
    }

    public C0CD A01() {
        return new C0CD(null, this, false);
    }

    public C0CD A02() {
        return new C0CD(null, this, true);
    }

    @Override // X.C04k
    public C04l ABg() {
        return this.A02;
    }

    @Override // X.C04k
    public C0CE ACk() {
        return AE6();
    }

    @Override // X.C04k
    public synchronized C0CE AE6() {
        C0CE c0ce = this.A00;
        if (c0ce == null || !c0ce.A00.isOpen()) {
            this.A00 = A03();
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
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
    }
}
