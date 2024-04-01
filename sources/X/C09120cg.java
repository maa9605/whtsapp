package X;

import android.content.Intent;
import com.whatsapp.AcceptInviteLinkActivity;
import com.whatsapp.Conversation;
import com.whatsapp.util.Log;

/* renamed from: X.0cg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09120cg extends C0GG {
    public final /* synthetic */ AcceptInviteLinkActivity A00;

    public C09120cg(AcceptInviteLinkActivity acceptInviteLinkActivity) {
        this.A00 = acceptInviteLinkActivity;
    }

    @Override // X.C0GG
    public void A00() {
        Log.i("acceptlink/onConversationsListChanged");
        AcceptInviteLinkActivity acceptInviteLinkActivity = this.A00;
        if (acceptInviteLinkActivity.A0B != null) {
            C018508q c018508q = ((ActivityC02290Ap) acceptInviteLinkActivity).A0A;
            c018508q.A02.post(new Runnable() { // from class: X.1FL
                @Override // java.lang.Runnable
                public final void run() {
                    AcceptInviteLinkActivity acceptInviteLinkActivity2 = C09120cg.this.A00;
                    if (!acceptInviteLinkActivity2.AFE() && acceptInviteLinkActivity2.A07.A0E(acceptInviteLinkActivity2.A0B)) {
                        StringBuilder A0P = C000200d.A0P("acceptlink/onConversationsListChanged/ok/");
                        A0P.append(acceptInviteLinkActivity2.A0B);
                        Log.i(A0P.toString());
                        Intent A02 = Conversation.A02(acceptInviteLinkActivity2, acceptInviteLinkActivity2.A0B);
                        C002701i.A1C(A02, "AcceptInviteLinkActivity", acceptInviteLinkActivity2.A05);
                        acceptInviteLinkActivity2.A16(A02, true);
                    }
                }
            });
        }
    }

    @Override // X.C0GG
    public void A03(AbstractC005302j abstractC005302j) {
        C000200d.A0v("acceptlink/onConversationChanged/", abstractC005302j);
        AcceptInviteLinkActivity acceptInviteLinkActivity = this.A00;
        C011005l c011005l = acceptInviteLinkActivity.A0B;
        if (c011005l == null || !c011005l.equals(abstractC005302j)) {
            return;
        }
        C018508q c018508q = ((ActivityC02290Ap) acceptInviteLinkActivity).A0A;
        c018508q.A02.post(new Runnable() { // from class: X.1FM
            @Override // java.lang.Runnable
            public final void run() {
                AcceptInviteLinkActivity acceptInviteLinkActivity2 = C09120cg.this.A00;
                if (!acceptInviteLinkActivity2.AFE()) {
                    StringBuilder A0P = C000200d.A0P("acceptlink/onConversationChanged/ok/");
                    A0P.append(acceptInviteLinkActivity2.A0B);
                    Log.i(A0P.toString());
                    Intent A02 = Conversation.A02(acceptInviteLinkActivity2, acceptInviteLinkActivity2.A0B);
                    C002701i.A1C(A02, "AcceptInviteLinkActivity", acceptInviteLinkActivity2.A05);
                    acceptInviteLinkActivity2.A16(A02, true);
                }
            }
        });
    }
}
