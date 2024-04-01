package X;

import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.04q  reason: invalid class name */
/* loaded from: classes.dex */
public class C04q {
    public final C04j A00;
    public final AnonymousClass012 A01;

    public C04q(AnonymousClass012 anonymousClass012, C04j c04j) {
        this.A01 = anonymousClass012;
        this.A00 = c04j;
    }

    public C27311Mw A00(C0QS c0qs) {
        StringBuilder sb = new StringBuilder("SenderKeyStore/getSenderKey/");
        sb.append(c0qs);
        Log.i(sb.toString());
        C0CD A01 = this.A00.A01();
        try {
            C0IO c0io = c0qs.A00;
            Cursor A09 = A01.A02.A09("sender_keys", new String[]{"record", "timestamp"}, "group_id = ? AND sender_id = ? AND device_id = ?", new String[]{c0qs.A01, c0io.A01, String.valueOf(c0io.A00)}, null, "SignalSenderKeyStore/getSenderKey");
            if (!A09.moveToNext()) {
                A09.close();
                A01.close();
                return null;
            }
            C27311Mw c27311Mw = new C27311Mw(A09.getBlob(0), A09.getLong(1));
            A09.close();
            A01.close();
            return c27311Mw;
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
