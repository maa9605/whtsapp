package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.070 */
/* loaded from: classes.dex */
public class AnonymousClass070 {
    public static volatile AnonymousClass070 A07;
    public final C01B A00;
    public final C05W A01;
    public final AnonymousClass071 A02;
    public final C05A A03;
    public final C05M A04;
    public final C05E A05;
    public final C05P A06;

    public AnonymousClass070(C05A c05a, C05M c05m, C01B c01b, C05W c05w, AnonymousClass071 anonymousClass071, C05E c05e, C05P c05p) {
        this.A03 = c05a;
        this.A04 = c05m;
        this.A00 = c01b;
        this.A01 = c05w;
        this.A02 = anonymousClass071;
        this.A05 = c05e;
        this.A06 = c05p;
    }

    public static final int A00(C0CD c0cd, AnonymousClass092 anonymousClass092) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("duration", Integer.valueOf(anonymousClass092.A02));
        Long l = anonymousClass092.A0R;
        if (l != null) {
            contentValues.put("expire_timestamp", l);
            return c0cd.A02.A00("message_ephemeral", contentValues, "message_row_id = ?", new String[]{String.valueOf(anonymousClass092.A0p)});
        }
        throw null;
    }

    public static AnonymousClass070 A01() {
        if (A07 == null) {
            synchronized (AnonymousClass070.class) {
                if (A07 == null) {
                    A07 = new AnonymousClass070(C05A.A00(), C05M.A00(), C01B.A00(), C05W.A00(), AnonymousClass071.A00(), C05E.A00(), C05P.A00());
                }
            }
        }
        return A07;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C0CM A02(X.AnonymousClass092 r9, long r10) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass070.A02(X.092, long):X.0CM");
    }

    public void A03(AnonymousClass092 anonymousClass092) {
        if (this.A00.A0E(C01C.A0n)) {
            C0CD A03 = this.A05.A03();
            try {
                Cursor A072 = A03.A02.A07("SELECT duration, expire_timestamp FROM message_ephemeral WHERE message_row_id=?", new String[]{Long.toString(anonymousClass092.A0p)});
                if (A072 != null) {
                    if (A072.moveToNext()) {
                        int columnIndexOrThrow = A072.getColumnIndexOrThrow("duration");
                        int columnIndexOrThrow2 = A072.getColumnIndexOrThrow("expire_timestamp");
                        anonymousClass092.A0V(A072.getInt(columnIndexOrThrow));
                        anonymousClass092.A0R = Long.valueOf(A072.getLong(columnIndexOrThrow2));
                    }
                    A072.close();
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

    public void A04(AnonymousClass092 anonymousClass092) {
        C0CD A04 = this.A05.A04();
        try {
            C0CE c0ce = A04.A02;
            String str = C1P2.A05;
            Object[] objArr = new Object[3];
            objArr[0] = Long.valueOf(anonymousClass092.A0p);
            objArr[1] = Integer.valueOf(anonymousClass092.A02);
            Long l = anonymousClass092.A0R;
            if (l != null) {
                objArr[2] = l;
                c0ce.A0D(str, objArr);
                A04.close();
                return;
            }
            throw null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }
}
