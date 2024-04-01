package com.whatsapp.conversation.conversationrow;

import X.AbstractC005302j;
import X.AnonymousClass075;
import X.C000200d;
import X.C000700j;
import X.C002301c;
import X.C002701i;
import X.C003101m;
import X.C018308n;
import X.C018708s;
import X.C018808t;
import X.C019208x;
import X.C019308y;
import X.C01B;
import X.C01C;
import X.C05W;
import X.C06C;
import X.C40071rX;
import X.C40081rY;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment;
import com.whatsapp.conversation.conversationrow.Hilt_EncryptionChangeDialogFragment;
import com.whatsapp.jid.UserJid;

/* loaded from: classes2.dex */
public class EncryptionChangeDialogFragment extends Hilt_EncryptionChangeDialogFragment {
    public C018308n A00;
    public C01B A01;
    public C05W A02;
    public AnonymousClass075 A03;
    public C018708s A04;
    public C002301c A05;
    public C40081rY A06;
    public C018808t A07;
    public C40071rX A08;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        boolean z;
        String A0F;
        final Uri parse;
        Bundle A02 = A02();
        String string = A02.getString("jid");
        int i = A02.getInt("provider_category", 0);
        AbstractC005302j A022 = AbstractC005302j.A02(string);
        StringBuilder sb = new StringBuilder("Invalid jid=");
        sb.append(string);
        C000700j.A04(A022, sb.toString());
        C06C A0A = this.A02.A0A(A022);
        if (i != 0) {
            Context A00 = A00();
            String A08 = this.A04.A08(this.A02.A0A(A022), true);
            switch (i) {
                case 1:
                case 4:
                    A0F = A00.getString(R.string.blue_alert_bsp_premise, A08);
                    break;
                case 2:
                case 3:
                case 5:
                case 6:
                    if (C003101m.A0S(A022)) {
                        A0F = A00.getString(R.string.contact_info_security_modal_company_number, A08);
                        break;
                    } else {
                        A0F = A00.getString(R.string.blue_alert_self_fb_or_fb_and_other_verified, A08);
                        break;
                    }
                default:
                    A0F = A00.getString(R.string.encryption_description);
                    break;
            }
            parse = this.A08.A02("security-and-privacy", "end-to-end-encryption-for-business-messages");
        } else if (this.A07.A02(A022)) {
            A0F = A0F(R.string.contact_info_security_modal_in_app_support);
            parse = this.A08.A03("general", "about-safely-communicating-with-whatsapp-support", null);
        } else {
            UserJid of = UserJid.of(A022);
            if (of != null && A0A.A0B()) {
                z = this.A03.A02(of);
            } else {
                z = false;
            }
            if (C003101m.A0S(A022)) {
                A0F = A0F(R.string.wa_enterprise_encryption_state_change_description);
            } else if (z && !this.A01.A0E(C01C.A0X)) {
                A0F = A0G(R.string.enterprise_encryption_state_change_description, this.A04.A08(A0A, false));
                parse = Uri.parse(this.A08.A03("general", "26000103", null).toString());
            } else {
                A0F = A0F(R.string.encryption_description);
            }
            if (!z) {
                StringBuilder A0P = C000200d.A0P("https://www.whatsapp.com/security?lg=");
                A0P.append(this.A05.A04());
                A0P.append("&lc=");
                A0P.append(this.A05.A03());
                parse = Uri.parse(A0P.toString());
            }
            parse = Uri.parse(this.A08.A03("general", "26000103", null).toString());
        }
        C019208x c019208x = new C019208x(A09());
        CharSequence A0g = C002701i.A0g(A0F, A09(), this.A06);
        C019308y c019308y = c019208x.A01;
        c019308y.A0E = A0g;
        c019308y.A0J = true;
        String A0F2 = A0F(R.string.learn_more);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.2rR
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                EncryptionChangeDialogFragment encryptionChangeDialogFragment = EncryptionChangeDialogFragment.this;
                encryptionChangeDialogFragment.A00.A06(((Hilt_EncryptionChangeDialogFragment) encryptionChangeDialogFragment).A00, new Intent("android.intent.action.VIEW", parse));
                encryptionChangeDialogFragment.A10();
            }
        };
        c019308y.A0G = A0F2;
        c019308y.A04 = onClickListener;
        String A0F3 = A0F(R.string.ok);
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: X.2rQ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                EncryptionChangeDialogFragment.this.A10();
            }
        };
        c019308y.A0F = A0F3;
        c019308y.A03 = onClickListener2;
        return c019208x.A00();
    }
}
