package X;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

/* renamed from: X.0pP */
/* loaded from: classes.dex */
public abstract class AbstractC15830pP {
    public final int A00;

    public abstract void A01(InterfaceC15820pO interfaceC15820pO, int i, int i2);

    public AbstractC15830pP(int i) {
        this.A00 = i;
    }

    public static final void A00(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        C000200d.A17("deleting the database file: ", str, "SupportSQLite");
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }
}
