package X;

import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.06h  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C013006h {
    public static volatile C013006h A02;
    public final C05E A00;
    public final C05L A01;

    public C013006h(C05L c05l, C05E c05e) {
        this.A01 = c05l;
        this.A00 = c05e;
    }

    public static C013006h A00() {
        if (A02 == null) {
            synchronized (C013006h.class) {
                if (A02 == null) {
                    A02 = new C013006h(C05L.A00(), C05E.A00());
                }
            }
        }
        return A02;
    }

    public final int A01(long j, String str) {
        C0CD A03 = this.A00.A03();
        try {
            Cursor A07 = A03.A02.A07(str, new String[]{Long.toString(j)});
            int columnIndexOrThrow = A07.getColumnIndexOrThrow("state");
            if (A07.moveToNext()) {
                int i = A07.getInt(columnIndexOrThrow);
                A07.close();
                A03.close();
                return i;
            }
            A07.close();
            A03.close();
            return 2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A03.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public final void A02(long j, int i, C0CF c0cf) {
        try {
            C0CD A04 = this.A00.A04();
            c0cf.A04(1, j);
            c0cf.A04(2, i);
            c0cf.A01();
            A04.close();
        } catch (Exception e) {
            Log.e("ViewOnceMessageStore/updateInsert failed", e);
        }
    }

    public void A03(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 instanceof C09C) {
            int i = anonymousClass092.A08;
            if (i == 9 || i == 10 || i == 8) {
                ((C09C) anonymousClass092).AU7(1);
                A02(anonymousClass092.A0p, 1, this.A01.A01("INSERT OR REPLACE INTO message_view_once_media (message_row_id, state) VALUES (?, ?)"));
            }
        }
    }
}
