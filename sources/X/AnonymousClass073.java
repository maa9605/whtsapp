package X;

import android.database.Cursor;

/* renamed from: X.073  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass073 {
    public static volatile AnonymousClass073 A01;
    public final C05E A00;

    public AnonymousClass073(C05E c05e) {
        this.A00 = c05e;
    }

    public static AnonymousClass073 A00() {
        if (A01 == null) {
            synchronized (AnonymousClass073.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass073(C05E.A00());
                }
            }
        }
        return A01;
    }

    public void A01(AnonymousClass092 anonymousClass092) {
        C0CD A03 = this.A00.A03();
        try {
            int i = 1;
            Cursor A07 = A03.A02.A07("SELECT forward_score FROM message_forwarded WHERE message_row_id = ?", new String[]{Long.toString(anonymousClass092.A0p)});
            if (A07 != null && A07.moveToNext()) {
                i = A07.getInt(A07.getColumnIndexOrThrow("forward_score"));
            }
            anonymousClass092.A03 = i;
            if (A07 != null) {
                A07.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A03.close();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
