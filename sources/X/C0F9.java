package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;

/* renamed from: X.0F9  reason: invalid class name */
/* loaded from: classes.dex */
public class C0F9 extends SQLiteOpenHelper implements C04k {
    public C0CE A00;
    public final Context A01;
    public final AbstractC000600i A02;
    public final C04l A03;
    public final C04Z A04;

    public C0F9(Context context, AbstractC000600i abstractC000600i, C04Z c04z) {
        super(context, "companion_devices.db", (SQLiteDatabase.CursorFactory) null, 9);
        this.A01 = context;
        this.A02 = abstractC000600i;
        this.A04 = c04z;
        this.A03 = new C04l();
    }

    public C0CD A00() {
        return new C0CD(null, this, true);
    }

    @Override // X.C04k
    public C04l ABg() {
        return this.A03;
    }

    @Override // X.C04k
    public synchronized C0CE ACk() {
        return AE6();
    }

    @Override // X.C04k
    public synchronized C0CE AE6() {
        C0CE c0ce = this.A00;
        if (c0ce == null || !c0ce.A00.isOpen()) {
            this.A00 = C002501g.A05(super.getWritableDatabase(), this.A04);
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
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C000200d.A0a(sQLiteDatabase, "DROP TABLE IF EXISTS devices", "CREATE TABLE devices (_id INTEGER PRIMARY KEY AUTOINCREMENT,device_id TEXT,device_os TEXT,platform_type INTEGER,last_active INTEGER,login_time INTEGER,logout_time INTEGER,adv_key_index INTEGER,full_sync_required INTEGER,place_name TEXT);", "CREATE UNIQUE INDEX IF NOT EXISTS companion_device_jid_index ON devices(device_id);", "DROP TABLE IF EXISTS devices_history");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C000200d.A0t("CompanionDeviceDbHelper/downgrade from ", i, " to ", i2);
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C000200d.A0t("CompanionDeviceDbHelper/upgrade from ", i, " to ", i2);
        switch (i) {
            case 1:
                sQLiteDatabase.execSQL("ALTER TABLE devices ADD platform_type INTEGER");
            case 2:
                sQLiteDatabase.execSQL("ALTER TABLE devices ADD login_time INTEGER");
            case 3:
                sQLiteDatabase.execSQL("ALTER TABLE devices ADD adv_key_index INTEGER NOT NULL DEFAULT 0");
            case 4:
                sQLiteDatabase.execSQL("ALTER TABLE devices ADD full_sync_required INTEGER NOT NULL DEFAULT 0");
            case 5:
                sQLiteDatabase.execSQL("ALTER TABLE devices ADD place_name TEXT");
            case 6:
                sQLiteDatabase.execSQL("ALTER TABLE devices ADD logout_time INTEGER NOT NULL DEFAULT 0");
                break;
            case 7:
            case 8:
                break;
            default:
                Log.e("CompanionDeviceDbHelper/upgrade unknown old version");
                onCreate(sQLiteDatabase);
                return;
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS devices_history");
    }
}
