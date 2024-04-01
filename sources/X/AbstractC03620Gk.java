package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;

/* renamed from: X.0Gk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC03620Gk extends SQLiteOpenHelper implements C04k {
    public C0CE A00;
    public C0CE A01;
    public final AbstractC000600i A02;
    public final C04l A03;
    public final AbstractC013506m A04;
    public final C04Z A05;
    public static final String[] A07 = {"credential_id", "country", "readable_name", "issuer_name", "type", "subtype", "creation_ts", "updated_ts", "debit_mode", "credit_mode", "balance_1000", "balance_ts", "country_data", "icon"};
    public static final String[] A08 = {"tmp_id", "tmp_metadata", "tmp_ts"};
    public static final String[] A06 = {"jid", "merchant", "consumer_status", "default_payment_type", "country_data"};

    public AbstractC03620Gk(Context context, AbstractC000600i abstractC000600i, C04Z c04z, AbstractC013506m abstractC013506m, C04l c04l) {
        super(context, "payments.db", (SQLiteDatabase.CursorFactory) null, 2);
        this.A02 = abstractC000600i;
        this.A05 = c04z;
        this.A04 = abstractC013506m;
        this.A03 = c04l;
        setWriteAheadLoggingEnabled(true);
    }

    public static String A00(SQLiteDatabase sQLiteDatabase, String str) {
        String str2 = "";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("select sql from sqlite_master where type='table' and name='");
            sb.append(str);
            sb.append("';");
            Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
            if (rawQuery != null && rawQuery.moveToNext()) {
                str2 = rawQuery.getString(0);
            }
            if (rawQuery != null) {
                rawQuery.close();
                return str2;
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("payments-store/schema ");
            sb2.append(str);
            Log.e(sb2.toString(), e);
        }
        return str2;
    }

    public static void A01(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append(" ");
        sb.append(str4);
        if (str.contains(sb.toString())) {
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ALTER TABLE ");
            sb2.append(str2);
            sb2.append(" ADD ");
            sb2.append(str3);
            sb2.append(" ");
            sb2.append(str4);
            sQLiteDatabase.execSQL(sb2.toString());
        } catch (SQLiteException e) {
            StringBuilder sb3 = new StringBuilder("payments-store/add-column ");
            sb3.append(str3);
            Log.e(sb3.toString(), e);
        }
    }

    public C0CD A02() {
        return new C0CD(null, this, false);
    }

    public C0CD A03() {
        return new C0CD(null, this, true);
    }

    @Override // X.C04k
    public C04l ABg() {
        return this.A03;
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
            Log.e("failed to open payment store", e);
            this.A04.A0D();
            A05 = C002501g.A05(super.getReadableDatabase(), this.A05);
            this.A00 = A05;
        }
        return A05;
    }

    @Override // X.C04k
    public synchronized C0CE AE6() {
        C0CE A05;
        C000700j.A00();
        C0CE c0ce = this.A01;
        if (c0ce != null && c0ce.A00.isOpen()) {
            return this.A01;
        }
        try {
            A05 = C002501g.A05(super.getWritableDatabase(), this.A05);
            this.A01 = A05;
        } catch (SQLiteException e) {
            Log.e("failed to open payment store", e);
            this.A04.A0D();
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
        Log.i("PAY: creating payments database version 2");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS methods");
        sQLiteDatabase.execSQL("CREATE TABLE methods (credential_id TEXT NOT NULL PRIMARY KEY, country TEXT, readable_name TEXT, issuer_name TEXT, type INTEGER NOT NULL, subtype INTEGER, creation_ts INTEGER, updated_ts INTEGER, debit_mode INTEGER NOT NULL, credit_mode INTEGER NOT NULL, balance_1000 INTEGER, balance_ts INTEGER, country_data TEXT, icon BLOB)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS payment_methods_index ON methods (credential_id)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS tmp_transactions");
        C000200d.A0a(sQLiteDatabase, "CREATE TABLE tmp_transactions (tmp_id TEXT NOT NULL, tmp_metadata TEXT, tmp_ts INTEGER)", "CREATE UNIQUE INDEX IF NOT EXISTS message_payment_transactions_index ON tmp_transactions (tmp_id)", "DROP TABLE IF EXISTS contacts", "CREATE TABLE contacts (jid NOT NULL, country_data TEXT, merchant INTEGER, consumer_status INTEGER, default_payment_type INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS payment_constacts_index ON contacts (jid)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        String A00 = A00(sQLiteDatabase, "methods");
        if (A00 != null) {
            A01(sQLiteDatabase, A00, "methods", "icon", "BLOB");
        }
        String A002 = A00(sQLiteDatabase, "contacts");
        if (A002 != null) {
            A01(sQLiteDatabase, A002, "contacts", "merchant", "INTEGER");
            A01(sQLiteDatabase, A002, "contacts", "default_payment_type", "INTEGER");
            A01(sQLiteDatabase, A002, "contacts", "consumer_status", "INTEGER");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C000200d.A0t("PaymentDbHelper/onUpgrade/old version: ", i, ", new version: ", i2);
        if (i != 1) {
            Log.w("PaymentDbHelper/onUpgrade/unknown old version");
            onCreate(sQLiteDatabase);
        }
    }
}
