package X;

import com.whatsapp.Conversation;
import java.util.Iterator;

/* renamed from: X.2ER  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2ER extends AnonymousClass009 {
    public static final C2ER A00 = new C2ER();

    public void A02(String str) {
        C000700j.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (c0g5.hasNext()) {
                Conversation conversation = ((C0R6) c0g5.next()).A00;
                if (conversation.A2O.A01()) {
                    conversation.A2O.A00(false);
                }
                C48352Ex c48352Ex = conversation.A2N;
                if (c48352Ex != null) {
                    c48352Ex.A0I(str);
                }
            } else {
                return;
            }
        }
    }
}
