package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: X.2I6  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2I6 {
    public static final String A04 = String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY, %s TEXT NOT NULL, %s INTEGER DEFAULT 0);", "queue", "_id", "item", "encrypted");
    public final Context A00;
    public final C2I5 A01;
    public final C05460Ov A02;
    public final C2IE A03;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2IE] */
    public C2I6(final Context context, C05460Ov c05460Ov, C2I5 c2i5) {
        final String A0H = C000200d.A0H("_jobqueue-", "WhatsAppJobManager");
        this.A03 = new SQLiteOpenHelper(context, A0H) { // from class: X.2IE
            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onCreate(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL(C2I6.A04);
            }
        };
        this.A00 = context;
        this.A02 = c05460Ov;
        this.A01 = c2i5;
    }
}
