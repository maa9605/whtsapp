package X;

import android.database.sqlite.SQLiteStatement;

/* renamed from: X.0CF  reason: invalid class name */
/* loaded from: classes.dex */
public class C0CF {
    public final SQLiteStatement A00;

    public C0CF(SQLiteStatement sQLiteStatement) {
        this.A00 = sQLiteStatement;
    }

    public int A00() {
        return this.A00.executeUpdateDelete();
    }

    public long A01() {
        return this.A00.executeInsert();
    }

    public void A02(int i) {
        this.A00.bindNull(i);
    }

    public void A03(int i, double d) {
        this.A00.bindDouble(i, d);
    }

    public void A04(int i, long j) {
        this.A00.bindLong(i, j);
    }

    public void A05(int i, String str) {
        this.A00.bindString(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C0CF) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
