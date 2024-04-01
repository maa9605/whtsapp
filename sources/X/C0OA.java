package X;

import com.whatsapp.Conversation;
import com.whatsapp.dialogs.CreateOrAddToContactsDialog;

/* renamed from: X.0OA  reason: invalid class name */
/* loaded from: classes.dex */
public class C0OA {
    public final /* synthetic */ Conversation A00;

    public C0OA(Conversation conversation) {
        this.A00 = conversation;
    }

    public void A00() {
        Conversation conversation = this.A00;
        if (conversation != null) {
            CreateOrAddToContactsDialog createOrAddToContactsDialog = new CreateOrAddToContactsDialog();
            createOrAddToContactsDialog.A00 = new C35071iY(conversation);
            createOrAddToContactsDialog.A14(conversation.A0N(), null);
            return;
        }
        throw null;
    }
}
