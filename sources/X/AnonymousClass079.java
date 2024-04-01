package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.079  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass079 {
    public static volatile AnonymousClass079 A05;
    public final AnonymousClass071 A00;
    public final C05A A01;
    public final C05M A02;
    public final C05E A03;
    public final C07A A04;

    public AnonymousClass079(C05A c05a, C05M c05m, AnonymousClass071 anonymousClass071, C05E c05e, C07A c07a) {
        this.A01 = c05a;
        this.A02 = c05m;
        this.A00 = anonymousClass071;
        this.A03 = c05e;
        this.A04 = c07a;
    }

    public static AnonymousClass079 A00() {
        if (A05 == null) {
            synchronized (AnonymousClass079.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass079(C05A.A00(), C05M.A00(), AnonymousClass071.A00(), C05E.A00(), C07A.A01());
                }
            }
        }
        return A05;
    }

    public final int A01(long j) {
        C0CD A03 = this.A03.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT setting_duration FROM message_ephemeral_setting WHERE message_row_id=?", new String[]{Long.toString(j)});
            if (A07 != null) {
                if (A07.moveToNext()) {
                    int i = A07.getInt(A07.getColumnIndexOrThrow("setting_duration"));
                    A07.close();
                    A03.close();
                    return i;
                }
                A07.close();
            }
            A03.close();
            return 0;
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

    public final C0IT A02(C0KU c0ku) {
        UserJid of = UserJid.of(c0ku.A0n.A00);
        if (of == null) {
            Log.e("EphemeralSettingMessageStore/getChatInfo/not a user");
            return null;
        }
        C0IT A07 = this.A02.A07(of);
        if (A07 == null) {
            Log.w("EphemeralSettingMessageStore/getChatInfo/no chat");
            return null;
        }
        return A07;
    }

    public void A03(long j, int i) {
        C0CD A04 = this.A03.A04();
        try {
            A04.A02.A0D(C1P1.A02, new Object[]{Long.valueOf(j), Integer.valueOf(i)});
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

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r0 <= r0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04(X.C0KU r14, X.C0IT r15) {
        /*
            r13 = this;
            if (r15 != 0) goto L9
            X.0IT r15 = r13.A02(r14)
            if (r15 != 0) goto L9
            return
        L9:
            X.0CM r12 = r15.A0N
            X.071 r5 = r13.A00
            X.01B r1 = r5.A01
            X.03B r0 = X.C01C.A0n
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L3a
            int r1 = r14.A00
            int r0 = r12.expiration
            if (r1 != r0) goto L3a
            long r0 = r14.A0E
            long r2 = r12.ephemeralSettingTimestamp
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L3a
            int r2 = (r0 > r0 ? 1 : (r0 == r0 ? 0 : -1))
            if (r2 > 0) goto L3a
        L29:
            int r3 = r14.A00
            long r1 = r14.A0E
            X.0CM r0 = new X.0CM
            r0.<init>(r3, r1)
            r15.A0N = r0
            X.05A r0 = r13.A01
            r0.A0E(r15)
        L39:
            return
        L3a:
            int r1 = r14.A09
            r0 = 1
            if (r1 != r0) goto L39
            X.094 r0 = r14.A0n
            X.02j r6 = r0.A00
            long r7 = r14.A0E
            int r9 = r14.A00
            r10 = r7
            boolean r0 = r5.A03(r6, r7, r9, r10, r12)
            if (r0 == 0) goto L39
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass079.A04(X.0KU, X.0IT):void");
    }
}
