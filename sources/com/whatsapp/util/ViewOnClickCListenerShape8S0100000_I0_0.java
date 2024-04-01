package com.whatsapp.util;

import X.AbstractView$OnClickListenerC49532Ky;
import X.C018308n;
import X.C06810Vc;
import X.C09250cv;
import X.C0W5;
import X.C29X;
import X.C2W6;
import X.C2W8;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class ViewOnClickCListenerShape8S0100000_I0_0 extends AbstractView$OnClickListenerC49532Ky {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape8S0100000_I0_0(C09250cv c09250cv) {
        this.A01 = 14;
        this.A00 = c09250cv;
    }

    public ViewOnClickCListenerShape8S0100000_I0_0(C2W6 c2w6, int i) {
        this.A01 = i;
        this.A00 = c2w6;
    }

    public ViewOnClickCListenerShape8S0100000_I0_0(C2W8 c2w8) {
        this.A01 = 47;
        this.A00 = c2w8;
    }

    public ViewOnClickCListenerShape8S0100000_I0_0(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:631:0x035d, code lost:
        if (r3.A06.A0A(r9.A0F.A0C) == false) goto L263;
     */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:922:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractView$OnClickListenerC49532Ky
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A00(android.view.View r23) {
        /*
            Method dump skipped, instructions count: 2802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ViewOnClickCListenerShape8S0100000_I0_0.A00(android.view.View):void");
    }

    public final void A01(String str) {
        C2W6 c2w6 = (C2W6) this.A00;
        C06810Vc c06810Vc = c2w6.A01;
        Intent putExtra = new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.EMAIL", new String[]{str}).putExtra("android.intent.extra.SUBJECT", c2w6.getContext().getString(R.string.tell_a_friend_email_subject));
        StringBuilder sb = new StringBuilder();
        sb.append(c2w6.getContext().getString(R.string.tell_a_friend_email_body, "https://www.whatsapp.com/download/"));
        sb.append("\n\n");
        c06810Vc.A01(putExtra.putExtra("android.intent.extra.TEXT", sb.toString()), c2w6.getContext(), null, c2w6.getContext().getString(R.string.invite_via_email_title), true);
    }

    public final void A02(String str) {
        C2W6 c2w6 = (C2W6) this.A00;
        C0W5 c0w5 = c2w6.A03;
        Activity A00 = C018308n.A00(c2w6.getContext());
        StringBuilder sb = new StringBuilder("sms:");
        sb.append(str);
        c0w5.A00(A00, Uri.parse(sb.toString()), c2w6.getContext().getString(R.string.tell_a_friend_sms, "https://whatsapp.com/dl/"), 18);
    }

    @Override // X.AbstractView$OnClickListenerC49532Ky, android.view.View.OnClickListener
    public void onClick(View view) {
        if (16 - this.A01 != 0) {
            super.onClick(view);
        } else if (((C29X) this.A00).A1P.isEmpty()) {
            super.onClick(view);
        } else {
            A00(view);
        }
    }
}
