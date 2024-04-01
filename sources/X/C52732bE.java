package X;

import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.2bE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52732bE extends C0GG {
    public final /* synthetic */ ConversationsFragment A00;

    public C52732bE(ConversationsFragment conversationsFragment) {
        this.A00 = conversationsFragment;
    }

    @Override // X.C0GG
    public void A00() {
        ConversationsFragment conversationsFragment = this.A00;
        C018508q c018508q = conversationsFragment.A0I;
        c018508q.A02.post(new RunnableEBaseShape2S0100000_I0_2(conversationsFragment, 25));
    }

    @Override // X.C0GG
    public void A01(int i) {
        this.A00.A1C(i);
    }

    @Override // X.C0GG
    public void A03(AbstractC005302j abstractC005302j) {
        ConversationsFragment conversationsFragment = this.A00;
        C018508q c018508q = conversationsFragment.A0I;
        c018508q.A02.post(new RunnableEBaseShape2S0100000_I0_2(conversationsFragment, 24));
    }

    @Override // X.C0GG
    public void A08(AbstractC005302j abstractC005302j, boolean z) {
        C018508q c018508q = this.A00.A0I;
        c018508q.A02.post(new RunnableEBaseShape0S0210000_I0(this, abstractC005302j, z, 1));
    }
}
