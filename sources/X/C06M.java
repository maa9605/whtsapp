package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;

/* renamed from: X.06M  reason: invalid class name */
/* loaded from: classes.dex */
public class C06M extends AnonymousClass009 {
    public static final C06M A00 = new C06M();

    public void A02(UserJid userJid) {
        C000700j.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((AbstractC09240cu) c0g5.next()).A01(userJid);
        }
    }
}
