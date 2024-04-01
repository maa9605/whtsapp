package X;

import com.whatsapp.service.RestoreChatConnectionWorker;
import com.whatsapp.util.Log;

/* renamed from: X.1uh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41901uh {
    public static volatile C41901uh A02;
    public final C001200o A00;
    public final C2A9 A01;

    public C41901uh(C001200o c001200o, C2A9 c2a9) {
        this.A00 = c001200o;
        this.A01 = c2a9;
    }

    public static C41901uh A00() {
        if (A02 == null) {
            synchronized (C41901uh.class) {
                if (A02 == null) {
                    A02 = new C41901uh(C001200o.A01, C2A9.A01());
                }
            }
        }
        return A02;
    }

    public void A01() {
        Log.i("Scheduling job to restore chat connection");
        C0OO c0oo = C0OO.KEEP;
        C0OJ c0oj = new C0OJ(RestoreChatConnectionWorker.class);
        C0OG c0og = new C0OG();
        c0og.A03 = C07j.CONNECTED;
        c0oj.A00.A09 = new C0OH(c0og);
        ((C0OD) this.A01.get()).A00("com.whatsapp.service.restoreChatConnection", c0oo, (C0ON) c0oj.A00());
    }
}
