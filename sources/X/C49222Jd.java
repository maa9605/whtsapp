package X;

import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.jid.Jid;
import com.whatsapp.ui.media.MediaCard;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Jd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C49222Jd extends C2IJ {
    public final C018508q A00;
    public final C05W A01;
    public final AnonymousClass012 A02;
    public final C456923c A03;
    public final C011005l A04;
    public final WeakReference A05;

    public C49222Jd(AnonymousClass012 anonymousClass012, C018508q c018508q, C05W c05w, C0DV c0dv, C03690Gr c03690Gr, C40411sD c40411sD, C43081wp c43081wp, C2NE c2ne, C0DW c0dw, C456923c c456923c, GroupChatInfo groupChatInfo, C06C c06c) {
        super(c018508q, c0dv, c03690Gr, c40411sD, c43081wp, c2ne, c0dw, groupChatInfo, c06c);
        this.A02 = anonymousClass012;
        this.A00 = c018508q;
        this.A05 = new WeakReference(groupChatInfo);
        this.A01 = c05w;
        Jid A03 = c06c.A03(C011005l.class);
        if (A03 != null) {
            this.A04 = (C011005l) A03;
            this.A03 = c456923c;
            return;
        }
        throw null;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        GroupChatInfo groupChatInfo = (GroupChatInfo) this.A05.get();
        if (groupChatInfo != null) {
            groupChatInfo.A0O.A04(groupChatInfo.A05, groupChatInfo.A02, groupChatInfo.A0C, groupChatInfo.A0u);
            groupChatInfo.A0m(false);
            MediaCard mediaCard = groupChatInfo.A1H;
            if (mediaCard != null) {
                if (mediaCard.getVisibility() == 0) {
                    groupChatInfo.A1U();
                }
                Log.i("group_info/updated");
                return;
            }
            throw null;
        }
    }

    @Override // X.C2IJ
    public Void A0A(Void... voidArr) {
        super.A0A(voidArr);
        if (A04()) {
            return null;
        }
        List A01 = this.A03.A01(this.A04, this.A02.A05() / 1000);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((AbstractCollection) A01).iterator();
        while (it.hasNext()) {
            C04570Ky c04570Ky = (C04570Ky) it.next();
            AbstractC005302j abstractC005302j = c04570Ky.A0n.A00;
            if (abstractC005302j != null && !hashSet.contains(abstractC005302j)) {
                hashSet.add(abstractC005302j);
                C06C A09 = this.A01.A09(abstractC005302j);
                if (A09 != null) {
                    arrayList.add(new C62132xO(A09, c04570Ky));
                }
            }
        }
        C018508q c018508q = this.A00;
        c018508q.A02.post(new RunnableEBaseShape2S0200000_I0_2(this, arrayList, 21));
        return null;
    }
}
