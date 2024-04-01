package com.facebook.redex;

import X.AbstractActivityC40691si;
import X.AbstractC005302j;
import X.AbstractC48182Ef;
import X.ActivityC02290Ap;
import X.AnonymousClass092;
import X.AnonymousClass093;
import X.AnonymousClass094;
import X.C000200d;
import X.C013306k;
import X.C018308n;
import X.C04570Ky;
import X.C06C;
import X.C0B5;
import X.C0DV;
import X.C0DX;
import X.C0LD;
import X.C0PZ;
import X.C2Ly;
import X.C470729k;
import X.C471029p;
import X.C49262Ji;
import X.C51532Wv;
import X.C58002qQ;
import X.C62132xO;
import X.C656237x;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.Conversation;
import com.whatsapp.SuspiciousLinkWarningDialogFragment;
import com.whatsapp.conversation.conversationrow.TemplateRowContentLayout;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.invites.RevokeInviteDialogFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class ViewOnClickEBaseShape0S0300000_I0 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public ViewOnClickEBaseShape0S0300000_I0(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AnonymousClass094 anonymousClass094;
        switch (this.A03) {
            case 0:
                AbstractActivityC40691si abstractActivityC40691si = (AbstractActivityC40691si) this.A00;
                C06C c06c = (C06C) this.A01;
                C58002qQ c58002qQ = (C58002qQ) this.A02;
                if (abstractActivityC40691si.A0G.A0H((UserJid) c06c.A03(UserJid.class)) && !c06c.A0V) {
                    abstractActivityC40691si.A1l(c06c);
                    return;
                }
                if (abstractActivityC40691si.A0G.A0H((UserJid) c06c.A03(UserJid.class)) && c06c.A0V) {
                    c58002qQ.A00();
                }
                abstractActivityC40691si.A1k(c06c);
                return;
            case 1:
                C51532Wv c51532Wv = (C51532Wv) this.A00;
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) this.A01;
                C0DX c0dx = (C0DX) this.A02;
                if (!((AbstractC48182Ef) c51532Wv).A0I.A0A(anonymousClass092.A0F.A0B) && !((AbstractC48182Ef) c51532Wv).A0I.A0A(anonymousClass092.A0F.A0C)) {
                    if (c51532Wv.A08.A08(anonymousClass092.A0F.A0I)) {
                        C2Ly c2Ly = c51532Wv.A08;
                        if (c2Ly != null) {
                            AnonymousClass093 anonymousClass093 = anonymousClass092.A0F;
                            if (anonymousClass093 != null && anonymousClass093.A0I != null && anonymousClass093.A02 == 1000 && !c2Ly.A04.A0A(anonymousClass093.A0B) && !c2Ly.A04.A0A(anonymousClass092.A0F.A0C)) {
                                c2Ly.A00.remove(anonymousClass092.A0F.A0I);
                                c2Ly.A05(anonymousClass092.A0F.A0I, anonymousClass092.A0n);
                            }
                            c51532Wv.A0B.setVisibility(0);
                            c51532Wv.A0C.setVisibility(8);
                            return;
                        }
                        throw null;
                    }
                    return;
                }
                Intent intent = new Intent(c51532Wv.getContext(), c0dx.ACL());
                C0LD.A00(intent, anonymousClass092.A0n);
                c51532Wv.getContext().startActivity(intent);
                return;
            case 2:
                View view2 = (View) this.A00;
                ((C0DX) this.A01).AGt(view2.getContext(), (C0B5) C018308n.A01(view2.getContext(), Conversation.class), (AnonymousClass092) this.A02);
                return;
            case 3:
                C51532Wv c51532Wv2 = (C51532Wv) this.A00;
                AnonymousClass092 anonymousClass0922 = (AnonymousClass092) this.A01;
                C0DX c0dx2 = (C0DX) this.A02;
                if (anonymousClass0922.A0F.A0O() && anonymousClass0922.A0F.A0J()) {
                    C0DV c0dv = c51532Wv2.A07;
                    c0dv.A04();
                    C013306k c013306k = c0dv.A07;
                    anonymousClass094 = anonymousClass0922.A0n;
                    AnonymousClass093 A0N = c013306k.A0N(anonymousClass094.A01);
                    if (A0N != null && anonymousClass0922.A0F.A01 != 18) {
                        anonymousClass094 = new AnonymousClass094(A0N.A0A, A0N.A0O, A0N.A0J);
                    }
                } else {
                    anonymousClass094 = anonymousClass0922.A0n;
                }
                Intent intent2 = new Intent(c51532Wv2.getContext(), c0dx2.ACL());
                C0LD.A00(intent2, anonymousClass094);
                c51532Wv2.getContext().startActivity(intent2);
                return;
            case 4:
                View view3 = (View) this.A00;
                view3.getContext();
                C018308n.A01(view3.getContext(), Conversation.class);
                return;
            case 5:
                TemplateRowContentLayout templateRowContentLayout = (TemplateRowContentLayout) this.A00;
                C0PZ c0pz = (C0PZ) this.A01;
                C656237x c656237x = (C656237x) this.A02;
                int i = c0pz.A03;
                if (i == 1) {
                    Log.e("TemplateRowContentLayout/fillButton/the button is in wrong type.");
                    return;
                } else if (i != 2) {
                    if (i == 3) {
                        StringBuilder A0P = C000200d.A0P("tel:");
                        A0P.append(c0pz.A05);
                        templateRowContentLayout.A01.A06(templateRowContentLayout.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(A0P.toString())));
                        return;
                    }
                    return;
                } else {
                    String str = c0pz.A05;
                    AbstractC48182Ef abstractC48182Ef = c656237x.A00;
                    Conversation A0E = abstractC48182Ef.A0E();
                    if (A0E != null) {
                        Set A02 = abstractC48182Ef.A0f.A02(str, abstractC48182Ef.getFMessage().A0B());
                        if (A02 != null) {
                            A0E.AUh(SuspiciousLinkWarningDialogFragment.A00(str, A02));
                            return;
                        }
                    } else {
                        Log.e("ConversationRow/needHandleSuspiciousUrl/error: not click in Conversation");
                    }
                    templateRowContentLayout.A04.A01(templateRowContentLayout.getContext(), Uri.parse(str));
                    return;
                }
            case 6:
                C471029p c471029p = (C471029p) this.A00;
                AbstractCollection abstractCollection = (AbstractCollection) this.A01;
                Object obj = this.A02;
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
                    ConversationsFragment conversationsFragment = c471029p.A0F;
                    conversationsFragment.A10.A05(abstractC005302j, false);
                    conversationsFragment.A1T.A01(4, abstractC005302j, 0L, 0);
                }
                c471029p.A0F.A1o.AS1(new RunnableEBaseShape0S0300000_I0_0(c471029p, abstractCollection, obj, 9));
                return;
            case 7:
                C470729k c470729k = (C470729k) this.A00;
                AbstractC005302j abstractC005302j2 = (AbstractC005302j) this.A01;
                Object obj2 = this.A02;
                c470729k.A06.A05(abstractC005302j2, false);
                c470729k.A0A.A01(4, abstractC005302j2, 0L, 0);
                if (obj2 != null) {
                    c470729k.A0D.AS1(new RunnableEBaseShape0S0300000_I0_0(c470729k, abstractC005302j2, obj2, 10));
                    return;
                }
                return;
            case 8:
                C62132xO c62132xO = (C62132xO) this.A02;
                ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) C018308n.A00(((C49262Ji) this.A00).A03);
                Jid A03 = ((C06C) this.A01).A03(UserJid.class);
                if (A03 != null) {
                    C04570Ky c04570Ky = c62132xO.A01;
                    RevokeInviteDialogFragment revokeInviteDialogFragment = new RevokeInviteDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("jid", A03.getRawString());
                    bundle.putLong("invite_row_id", c04570Ky.A0p);
                    revokeInviteDialogFragment.A0P(bundle);
                    activityC02290Ap.AUh(revokeInviteDialogFragment);
                    return;
                }
                throw null;
            case 9:
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A00;
                List<AbstractC005302j> list = (List) this.A01;
                CallInfo callInfo = (CallInfo) this.A02;
                View view4 = voipActivityV2.A0K;
                if (view4 != null) {
                    view4.setVisibility(8);
                    Log.i("VoipActivityV2 vm call back onclick");
                    ArrayList arrayList = new ArrayList();
                    for (AbstractC005302j abstractC005302j3 : list) {
                        C06C A09 = voipActivityV2.A0o.A09(abstractC005302j3);
                        if (A09 != null) {
                            arrayList.add(A09);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    voipActivityV2.A16.A01(arrayList, voipActivityV2, 4, callInfo.videoEnabled);
                    return;
                }
                throw null;
            default:
                return;
        }
    }
}
