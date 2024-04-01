package X;

import com.whatsapp.group.NewGroup;
import com.whatsapp.util.Log;

/* renamed from: X.2Ja  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C49202Ja extends C0GG {
    public final /* synthetic */ NewGroup A00;

    public C49202Ja(NewGroup newGroup) {
        this.A00 = newGroup;
    }

    @Override // X.C0GG
    public void A00() {
        Log.i("newgroup/onConversationsListChanged");
        NewGroup newGroup = this.A00;
        if (newGroup.A0c.get() != null) {
            C018508q c018508q = ((ActivityC02290Ap) newGroup).A0A;
            c018508q.A02.post(new RunnableEBaseShape3S0100000_I0_3(this, 7));
        }
    }

    @Override // X.C0GG
    public void A02(AbstractC005302j abstractC005302j) {
        Log.i("newgroup/onConversationAdded");
        NewGroup newGroup = this.A00;
        C0FK c0fk = newGroup.A05;
        if (c0fk == null || !c0fk.A00.equals(abstractC005302j)) {
            return;
        }
        Log.i("newgroup/onConversationAdded/processing runAfterTempConversationAddedToDb");
        ((Runnable) newGroup.A05.A01).run();
        newGroup.A05 = null;
    }

    @Override // X.C0GG
    public void A03(AbstractC005302j abstractC005302j) {
        C000200d.A0v("newgroup/onConversationChanged/", abstractC005302j);
        NewGroup newGroup = this.A00;
        Object obj = newGroup.A0c.get();
        if (obj == null || !obj.equals(abstractC005302j)) {
            return;
        }
        C018508q c018508q = ((ActivityC02290Ap) newGroup).A0A;
        c018508q.A02.post(new RunnableEBaseShape2S0200000_I0_2(this, obj, 27));
    }
}
