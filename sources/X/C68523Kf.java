package X;

import com.whatsapp.group.GroupChatInfo;
import java.lang.ref.WeakReference;

/* renamed from: X.3Kf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C68523Kf extends AbstractC66843Cq {
    public final WeakReference A00;

    public C68523Kf(AnonymousClass012 anonymousClass012, C018508q c018508q, C02L c02l, C0EG c0eg, C03340Fh c03340Fh, GroupChatInfo groupChatInfo, C06C c06c, String str) {
        super(anonymousClass012, c018508q, c02l, c0eg, c03340Fh, c06c, str);
        this.A00 = new WeakReference(groupChatInfo);
    }

    @Override // X.C0HS
    public void A06() {
        GroupChatInfo groupChatInfo = (GroupChatInfo) this.A00.get();
        if (groupChatInfo == null) {
            return;
        }
        groupChatInfo.A00.setVisibility(0);
        groupChatInfo.A1G.setVisibility(8);
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        GroupChatInfo groupChatInfo = (GroupChatInfo) this.A00.get();
        if (groupChatInfo != null) {
            groupChatInfo.A00.setVisibility(8);
            groupChatInfo.A1G.setVisibility(0);
        }
    }
}
