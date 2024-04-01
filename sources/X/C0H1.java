package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDiskIOException;

/* renamed from: X.0H1  reason: invalid class name */
/* loaded from: classes.dex */
public class C0H1 {
    public static volatile C0H1 A03;
    public final C05F A00;
    public final C05E A01;
    public final C05L A02;

    public C0H1(C05L c05l, C05F c05f, C05E c05e) {
        this.A02 = c05l;
        this.A00 = c05f;
        this.A01 = c05e;
    }

    public static C0H1 A00() {
        if (A03 == null) {
            synchronized (C0H1.class) {
                if (A03 == null) {
                    A03 = new C0H1(C05L.A00(), C05F.A01, C05E.A00());
                }
            }
        }
        return A03;
    }

    public int A01(String str) {
        try {
            C0CD A032 = this.A01.A03();
            Cursor A07 = A032.A02.A07("SELECT ref_count FROM media_refs WHERE path = ?", new String[]{str});
            if (A07 != null) {
                r2 = A07.moveToNext() ? A07.getInt(A07.getColumnIndexOrThrow("ref_count")) : 0;
                A07.close();
            }
            A032.close();
            return r2;
        } catch (SQLiteDiskIOException e) {
            this.A00.A00(1);
            throw e;
        }
    }
}
