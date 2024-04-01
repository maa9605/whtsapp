package X;

import com.whatsapp.Conversation;
import com.whatsapp.jid.Jid;

/* renamed from: X.1iY  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C35071iY implements InterfaceC52962bf {
    public final /* synthetic */ Conversation A00;

    public C35071iY(Conversation conversation) {
        this.A00 = conversation;
    }

    @Override // X.InterfaceC52962bf
    public void AGz() {
        Conversation conversation = this.A00;
        C06C c06c = conversation.A2D;
        Jid A03 = c06c.A03(AbstractC005302j.class);
        if (A03 != null) {
            conversation.A2F(c06c, (AbstractC005302j) A03, false);
            return;
        }
        throw null;
    }

    @Override // X.InterfaceC52962bf
    public void AJ8() {
        Conversation conversation = this.A00;
        C06C c06c = conversation.A2D;
        Jid A03 = c06c.A03(AbstractC005302j.class);
        if (A03 != null) {
            conversation.A2F(c06c, (AbstractC005302j) A03, true);
            return;
        }
        throw null;
    }
}
