package X;

import com.whatsapp.group.NewGroup;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.2K8  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2K8 extends C2K9 {
    public final /* synthetic */ NewGroup A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2K8(NewGroup newGroup, AnonymousClass012 anonymousClass012, C41991uq c41991uq, C0C9 c0c9, C0ES c0es, C07A c07a, C03340Fh c03340Fh, C05160No c05160No, String str, List list) {
        super(anonymousClass012, c41991uq, c0c9, c0es, c07a, c03340Fh, c05160No, str, list, null);
        this.A00 = newGroup;
    }

    @Override // X.C2K9, X.AbstractC05910Qs
    public void A00() {
        Log.i("newgroup/CreateGroupResponseHandler/onTimeout");
        super.A00();
        C018508q c018508q = ((ActivityC02290Ap) this.A00).A0A;
        c018508q.A02.post(new RunnableEBaseShape3S0100000_I0_3(this, 8));
    }

    @Override // X.C0T9
    public void ARw(Jid jid) {
        C011005l c011005l = (C011005l) jid;
        NewGroup newGroup = this.A00;
        newGroup.A0c.set(c011005l);
        if (newGroup.A0C.A03(newGroup.A0b).exists()) {
            C018508q c018508q = ((ActivityC02290Ap) newGroup).A0A;
            c018508q.A02.post(new RunnableEBaseShape2S0200000_I0_2(this, c011005l, 28));
        }
        super.A01(c011005l);
    }
}
