package com.whatsapp.util;

import X.AbstractC005302j;
import X.AbstractC48182Ef;
import X.AbstractView$OnClickListenerC49532Ky;
import X.AnonymousClass092;
import X.AnonymousClass094;
import X.C003101m;
import X.C018308n;
import X.C01C;
import X.C04040Ie;
import X.C04160Iu;
import X.C04580Kz;
import X.C05W;
import X.C0C9;
import X.C0CV;
import X.C0LD;
import X.C1KL;
import X.C2X9;
import X.C41471ty;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import java.util.Stack;

/* loaded from: classes2.dex */
public class ViewOnClickCListenerShape0S0400000_I0 extends AbstractView$OnClickListenerC49532Ky {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public ViewOnClickCListenerShape0S0400000_I0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
        this.A02 = obj4;
    }

    @Override // X.AbstractView$OnClickListenerC49532Ky
    public void A00(View view) {
        switch (this.A04) {
            case 0:
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) this.A03;
                if (anonymousClass092 instanceof C0CV) {
                    AbstractC48182Ef abstractC48182Ef = (AbstractC48182Ef) this.A00;
                    C05W c05w = abstractC48182Ef.A0R;
                    AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
                    if (c05w.A08(abstractC005302j) != null) {
                        C018308n c018308n = abstractC48182Ef.A0E;
                        Context context = (Context) this.A01;
                        c018308n.A08(context, Conversation.A02(context, abstractC005302j), "ConversationRow");
                        return;
                    }
                    return;
                }
                AbstractC48182Ef abstractC48182Ef2 = (AbstractC48182Ef) this.A00;
                C0C9 c0c9 = abstractC48182Ef2.A0a;
                AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                AnonymousClass092 A0F = c0c9.A0F(anonymousClass094);
                if (A0F == null && anonymousClass094.A02) {
                    C0C9 c0c92 = abstractC48182Ef2.A0a;
                    A0F = c0c92.A0H.A05(new AnonymousClass094(C04580Kz.A00, true, anonymousClass094.A01));
                }
                if (anonymousClass092 instanceof C04160Iu) {
                    C04160Iu c04160Iu = (C04160Iu) anonymousClass092;
                    if (c04160Iu.A0n.A01.startsWith("product_inquiry")) {
                        abstractC48182Ef2.A0Z(c04160Iu, abstractC48182Ef2.A06.findViewById(R.id.quoted_thumb), true);
                        return;
                    }
                }
                if (A0F != null) {
                    AnonymousClass094 anonymousClass0942 = A0F.A0n;
                    AbstractC005302j abstractC005302j2 = anonymousClass0942.A00;
                    if (C003101m.A0Z(abstractC005302j2)) {
                        if (abstractC48182Ef2.A0i.A0J(A0F)) {
                            return;
                        }
                        Context context2 = (Context) this.A01;
                        Intent intent = new Intent(context2, StatusPlaybackActivity.class);
                        intent.putExtra("jid", C003101m.A07(A0F.A0A()));
                        C0LD.A00(intent, anonymousClass0942);
                        context2.startActivity(intent);
                        return;
                    } else if (abstractC005302j2 != null) {
                        if (!abstractC005302j2.equals(((AnonymousClass092) this.A02).A0n.A00)) {
                            Context context3 = (Context) this.A01;
                            Intent A02 = Conversation.A02(context3, abstractC005302j2);
                            A02.putExtra("row_id", A0F.A0p);
                            A02.putExtra("start_t", SystemClock.uptimeMillis());
                            abstractC48182Ef2.A0w.A00();
                            C0LD.A00(A02, anonymousClass0942);
                            abstractC48182Ef2.A0E.A08(context3, A02, "ConversationRow");
                            return;
                        }
                        Conversation conversation = (Conversation) this.A01;
                        Stack stack = conversation.A4z;
                        if (!stack.isEmpty() && ((C1KL) stack.peek()).A01.A0p != abstractC48182Ef2.getFMessage().A0p) {
                            stack.clear();
                        }
                        stack.push(new C1KL(A0F, abstractC48182Ef2.getFMessage(), abstractC48182Ef2.getTop()));
                        conversation.A2M(A0F, conversation.getResources().getDimensionPixelSize(R.dimen.conversation_row_min_height));
                        if ((A0F instanceof C04040Ie) && conversation.A0x.A0E(C01C.A1g)) {
                            AbstractC48182Ef A1d = conversation.A1d(anonymousClass0942);
                            if (A1d instanceof C2X9) {
                                ((C2X9) A1d).AUy();
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        throw null;
                    }
                }
                return;
            case 1:
                C41471ty c41471ty = (C41471ty) this.A01;
                Context context4 = (Context) this.A00;
                AbstractC005302j abstractC005302j3 = ((AnonymousClass092) this.A02).A0n.A00;
                if (abstractC005302j3 != null) {
                    c41471ty.A0A(context4, abstractC005302j3, (UserJid) this.A03);
                    return;
                }
                throw null;
            default:
                super.A00(view);
                return;
        }
    }
}
