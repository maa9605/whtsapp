package X;

import android.database.Cursor;

/* renamed from: X.06x  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C014606x {
    public static volatile C014606x A02;
    public final C05E A00;
    public final C05L A01;

    public C014606x(C05L c05l, C05E c05e) {
        this.A01 = c05l;
        this.A00 = c05e;
    }

    public static C014606x A00() {
        if (A02 == null) {
            synchronized (C014606x.class) {
                if (A02 == null) {
                    A02 = new C014606x(C05L.A00(), C05E.A00());
                }
            }
        }
        return A02;
    }

    public final void A01(long j, int i, long j2, C0CF c0cf) {
        C0CD A04 = this.A00.A04();
        try {
            c0cf.A04(1, j);
            c0cf.A04(2, i);
            c0cf.A04(3, j2);
            c0cf.A01();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void A02(C0LT c0lt, String str) {
        C0CD A03 = this.A00.A03();
        try {
            Cursor A07 = A03.A02.A07(str, new String[]{Long.toString(c0lt.A0p)});
            if (A07.moveToLast()) {
                c0lt.A00 = A07.getInt(A07.getColumnIndex("service"));
                c0lt.A01 = A07.getLong(A07.getColumnIndex("expiration_timestamp"));
            }
            A07.close();
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
