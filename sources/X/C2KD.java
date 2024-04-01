package X;

import com.whatsapp.group.GroupChatInfo;
import java.util.List;

/* renamed from: X.2KD  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2KD extends C0TC {
    public final /* synthetic */ GroupChatInfo A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2KD(GroupChatInfo groupChatInfo, C41991uq c41991uq, C0ES c0es, C03340Fh c03340Fh, C011005l c011005l, List list) {
        super(c41991uq, c0es, c03340Fh, c011005l, list);
        this.A00 = groupChatInfo;
    }

    @Override // X.C0TD
    public void A01() {
        this.A00.A0y();
    }

    @Override // X.C0TC, X.C0TA
    public void ARx(C2KE c2ke) {
        GroupChatInfo groupChatInfo = this.A00;
        if (!groupChatInfo.A0L.A0E(C01C.A12) || c2ke.A02.size() <= 0) {
            return;
        }
        C018508q c018508q = groupChatInfo.A0I;
        c018508q.A02.post(new RunnableEBaseShape2S0200000_I0_2(this, c2ke, 20));
    }
}
