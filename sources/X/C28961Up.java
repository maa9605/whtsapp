package X;

import android.database.sqlite.SQLiteProgram;

/* renamed from: X.1Up  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28961Up implements InterfaceC15870pT {
    public final SQLiteProgram A00;

    public C28961Up(SQLiteProgram sQLiteProgram) {
        this.A00 = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A00.close();
    }
}
