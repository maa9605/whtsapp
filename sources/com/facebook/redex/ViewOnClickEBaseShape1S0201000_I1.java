package com.facebook.redex;

import X.AbstractC005302j;
import X.AbstractC48182Ef;
import X.AnonymousClass092;
import X.C002701i;
import X.C018608r;
import X.C05U;
import X.C05V;
import X.C0PX;
import X.C0PZ;
import X.C2D3;
import X.C2Z4;
import X.C3B0;
import X.C3B5;
import X.C59192sM;
import X.C59202sN;
import X.C655937u;
import X.C656037v;
import X.C86353xI;
import android.view.View;
import com.whatsapp.Conversation;
import com.whatsapp.conversation.conversationrow.DynamicButtonsLayout;
import com.whatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class ViewOnClickEBaseShape1S0201000_I1 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public ViewOnClickEBaseShape1S0201000_I1(Object obj, int i, Object obj2, int i2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C59202sN c59202sN;
        switch (this.A03) {
            case 0:
                int i = this.A00;
                C655937u c655937u = (C655937u) this.A02;
                List list = ((DynamicButtonsLayout) this.A01).A00;
                if (((C2D3) list.get(i)).A00) {
                    return;
                }
                c655937u.A00((C2D3) list.get(i));
                return;
            case 1:
                C0PZ c0pz = (C0PZ) ((TemplateQuickReplyButtonsLayout) this.A01).A00.get(this.A00);
                AbstractC48182Ef abstractC48182Ef = ((C656037v) this.A02).A00;
                Conversation A0E = abstractC48182Ef.A0E();
                if (A0E != null) {
                    AnonymousClass092 fMessage = abstractC48182Ef.getFMessage();
                    C018608r c018608r = A0E.A10;
                    Jid A03 = A0E.A2D.A03(AbstractC005302j.class);
                    if (A03 != null) {
                        String A0t = C002701i.A0t(c0pz.A04);
                        String str = c0pz.A05;
                        int i2 = c0pz.A02;
                        C05U c05u = c018608r.A12;
                        long A05 = c018608r.A0J.A05();
                        C05V c05v = c05u.A07;
                        C0PX c0px = new C0PX(C05V.A00(c05v.A01, c05v.A00, (AbstractC005302j) A03, true), A05, A0t, str, i2);
                        c05u.A05(c0px, fMessage);
                        c018608r.A0R(c0px);
                        c018608r.A0U.A0Q(c0px);
                        return;
                    }
                    throw null;
                }
                Log.e("ConversationRow/onQuickReplyButtonClicked/error: not click in Conversation");
                return;
            case 2:
                C59192sM c59192sM = (C59192sM) this.A01;
                View view2 = (View) this.A02;
                int i3 = this.A00;
                UserJid userJid = (UserJid) view2.getTag();
                UserJid userJid2 = c59192sM.A00;
                if (userJid.equals(userJid2)) {
                    c59192sM.A00 = null;
                } else {
                    c59192sM.A00 = userJid;
                    if (((C59202sN) c59192sM.A02.A0b.get(i3)).A00() != 5) {
                        c59192sM.A01(i3, view2, true);
                    } else {
                        c59192sM.A00 = null;
                    }
                }
                if (userJid2 != null) {
                    MessageDetailsActivity messageDetailsActivity = c59192sM.A02;
                    View findViewWithTag = messageDetailsActivity.A02.findViewWithTag(userJid2);
                    ArrayList arrayList = messageDetailsActivity.A0b;
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            c59202sN = (C59202sN) it.next();
                            if (userJid2.equals(c59202sN.A01)) {
                            }
                        } else {
                            c59202sN = null;
                        }
                    }
                    if (findViewWithTag == null || c59202sN == null) {
                        return;
                    }
                    c59192sM.A01(arrayList.indexOf(c59202sN), findViewWithTag, false);
                    return;
                }
                return;
            case 3:
                C3B5 c3b5 = (C3B5) this.A01;
                int i4 = this.A00;
                c3b5.A0G((StorageUsageMediaGalleryFragment) c3b5.A04, (C3B0) this.A02, i4);
                return;
            case 4:
                C86353xI c86353xI = (C86353xI) this.A01;
                int i5 = this.A00;
                c86353xI.A02.A00 = false;
                c86353xI.A0F((C2Z4) this.A02, i5);
                return;
            default:
                return;
        }
    }
}
