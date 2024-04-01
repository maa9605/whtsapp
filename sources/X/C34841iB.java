package X;

import android.os.Build;
import com.whatsapp.Conversation;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1iB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C34841iB {
    public final /* synthetic */ Conversation A00;

    public C34841iB(Conversation conversation) {
        this.A00 = conversation;
    }

    public void A00() {
        C73053b1 c73053b1;
        UserJid of;
        Conversation conversation = this.A00;
        InterfaceC002901k interfaceC002901k = conversation.A3e;
        AbstractC005302j abstractC005302j = conversation.A2a;
        if (conversation.A0x.A0E(C01C.A0k) && (of = UserJid.of(abstractC005302j)) != null) {
            interfaceC002901k.AS1(new C1G6(conversation, of));
        }
        if (Build.VERSION.SDK_INT < 19 || (c73053b1 = conversation.A3h) == null || !c73053b1.A0D) {
            return;
        }
        c73053b1.A00();
    }
}
