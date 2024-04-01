package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0FA  reason: invalid class name */
/* loaded from: classes.dex */
public class C0FA extends AnonymousClass038 {
    public static final C0FA A00 = new C0FA();

    public void A02(UserJid userJid, Set set, Set set2) {
        if (set.isEmpty() && set2.isEmpty()) {
            return;
        }
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((InterfaceC04220Ji) c0g5.next()).AQD(userJid, set, set2);
                }
            }
        }
    }
}
