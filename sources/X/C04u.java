package X;

import android.database.Cursor;

/* renamed from: X.04u  reason: invalid class name */
/* loaded from: classes.dex */
public class C04u {
    public final C04j A00;
    public final AnonymousClass012 A01;

    public C04u(AnonymousClass012 anonymousClass012, C04j c04j) {
        this.A01 = anonymousClass012;
        this.A00 = c04j;
    }

    public C27291Mu A00(C0QS c0qs) {
        C0CD A01 = this.A00.A01();
        try {
            C0IO c0io = c0qs.A00;
            Cursor A09 = A01.A02.A09("fast_ratchet_sender_keys", new String[]{"record"}, "group_id = ? AND sender_id = ? AND device_id = ?", new String[]{c0qs.A01, c0io.A01, String.valueOf(c0io.A00)}, null, "SignalFastRatchetSenderKeyStore/getFastRatchetSenderKey");
            if (!A09.moveToNext()) {
                A09.close();
                A01.close();
                return null;
            }
            C27291Mu c27291Mu = new C27291Mu(A09.getBlob(0), this.A01.A05() / 1000);
            A09.close();
            A01.close();
            return c27291Mu;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A01.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }
}
