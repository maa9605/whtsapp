package X;

import android.database.Cursor;
import android.database.CursorWrapper;

/* renamed from: X.2NE  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2NE {
    public static volatile C2NE A03;
    public final C05A A00;
    public final C0D5 A01;
    public final C05E A02;

    public C2NE(C05A c05a, C0D5 c0d5, C05E c05e) {
        this.A00 = c05a;
        this.A01 = c0d5;
        this.A02 = c05e;
    }

    public int A00(AbstractC005302j abstractC005302j, C0HE c0he) {
        C0CD A032 = this.A02.A03();
        try {
            Cursor A08 = A032.A02.A08("SELECT COUNT(*) as count FROM available_message_view WHERE message_type in ('9' , '26' ) AND origin != 7 AND chat_row_id = ? ", new String[]{String.valueOf(this.A00.A05(abstractC005302j))}, c0he);
            if (!((CursorWrapper) A08).moveToFirst()) {
                ((CursorWrapper) A08).close();
                A032.close();
                return 0;
            }
            CursorWrapper cursorWrapper = (CursorWrapper) A08;
            int i = cursorWrapper.getInt(cursorWrapper.getColumnIndexOrThrow("count"));
            cursorWrapper.close();
            A032.close();
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A032.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }
}
