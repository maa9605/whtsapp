package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: X.1Um  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28931Um implements InterfaceC15820pO {
    public static final String[] A01 = new String[0];
    public final SQLiteDatabase A00;

    public C28931Um(SQLiteDatabase sQLiteDatabase) {
        this.A00 = sQLiteDatabase;
    }

    public Cursor A00(final InterfaceC15880pU interfaceC15880pU) {
        return this.A00.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: X.0pV
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                InterfaceC15880pU.this.A5i(new C28961Up(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, interfaceC15880pU.ADE(), A01, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A00.close();
    }
}
