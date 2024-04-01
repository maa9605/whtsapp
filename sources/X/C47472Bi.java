package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;

/* renamed from: X.2Bi */
/* loaded from: classes2.dex */
public class C47472Bi extends SQLiteOpenHelper implements C04k {
    public C0CE A00;
    public C0CE A01;
    public final C04l A02;
    public final C04Z A03;

    public C47472Bi(C001200o c001200o, C04Z c04z, String str) {
        super(c001200o.A00, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.A03 = c04z;
        this.A02 = new C04l();
        setWriteAheadLoggingEnabled(true);
    }

    public static final void A00(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" ");
        sb.append(str3);
        if (str.contains(sb.toString())) {
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ALTER TABLE cart_item ADD ");
            sb2.append(str2);
            sb2.append(" ");
            sb2.append(str3);
            sQLiteDatabase.execSQL(sb2.toString());
        } catch (SQLiteException e) {
            StringBuilder sb3 = new StringBuilder("commerce-db-helper/add-column ");
            sb3.append(str2);
            Log.e(sb3.toString(), e);
        }
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
            Log.e("failed to open readable commerce store", e);
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
            Log.e("failed to open writable commerce store", e);
            A05 = C002501g.A05(super.getWritableDatabase(), this.A03);
            this.A01 = A05;
        }
        return A05;
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
        C000200d.A0Z(sQLiteDatabase, "DROP TABLE IF EXISTS cart_item", "CREATE TABLE cart_item(_id INTEGER PRIMARY KEY AUTOINCREMENT,business_id TEXT NOT NULL, product_id TEXT NOT NULL, product_title TEXT, product_price_1000 INTEGER, product_currency_code TEXT, product_image_id TEXT, product_quantity INTEGER, product_sale_price_1000 INTEGER, product_sale_start_date TIMESTAMP, product_sale_end_date TIMESTAMP)", "CREATE INDEX IF NOT EXISTS business_id_index on cart_item (business_id)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        String str;
        Cursor rawQuery;
        super.onOpen(sQLiteDatabase);
        str = "";
        try {
            rawQuery = sQLiteDatabase.rawQuery("select sql from sqlite_master where type='table' and name='cart_item';", null);
        } catch (Exception e) {
            Log.e("commerce-db-helper/schema cart_item", e);
        }
        if (rawQuery != null) {
            str = rawQuery.moveToNext() ? rawQuery.getString(0) : "";
            rawQuery.close();
            if (str == null) {
                return;
            }
        }
        A00(sQLiteDatabase, str, "product_sale_price_1000", "INTEGER");
        A00(sQLiteDatabase, str, "product_sale_start_date", "TIMESTAMP");
        A00(sQLiteDatabase, str, "product_sale_end_date", "TIMESTAMP");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onCreate(sQLiteDatabase);
    }
}
