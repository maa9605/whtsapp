package X;

import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.util.Log;

/* renamed from: X.2H4  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2H4 extends C0GG {
    public final /* synthetic */ ViewGroupInviteActivity A00;

    public C2H4(ViewGroupInviteActivity viewGroupInviteActivity) {
        this.A00 = viewGroupInviteActivity;
    }

    @Override // X.C0GG
    public void A00() {
        Log.i("ViewGroupInviteActivity/onConversationsListChanged");
        ViewGroupInviteActivity viewGroupInviteActivity = this.A00;
        if (viewGroupInviteActivity.A0K != null) {
            C018508q c018508q = viewGroupInviteActivity.A07;
            c018508q.A02.post(new RunnableEBaseShape3S0100000_I0_3(this, 23));
        }
    }

    @Override // X.C0GG
    public void A03(AbstractC005302j abstractC005302j) {
        C000200d.A0v("ViewGroupInviteActivity/onConversationChanged/", abstractC005302j);
        ViewGroupInviteActivity viewGroupInviteActivity = this.A00;
        C011005l c011005l = viewGroupInviteActivity.A0K;
        if (c011005l == null || !c011005l.equals(abstractC005302j)) {
            return;
        }
        C018508q c018508q = viewGroupInviteActivity.A07;
        c018508q.A02.post(new RunnableEBaseShape3S0100000_I0_3(this, 24));
    }
}
