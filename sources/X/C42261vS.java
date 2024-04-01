package X;

import android.database.Cursor;

/* renamed from: X.1vS  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42261vS {
    public final C42251vR A00;

    public C42261vS(C42251vR c42251vR) {
        this.A00 = c42251vR;
    }

    public int A00() {
        C0CD A00 = this.A00.A00();
        try {
            Cursor A07 = A00.A02.A07("SELECT COUNT(*) FROM prefetched_files", null);
            if (A07 != null) {
                r1 = A07.moveToNext() ? A07.getInt(0) : 0;
                A07.close();
            }
            return r1;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A00.close();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
