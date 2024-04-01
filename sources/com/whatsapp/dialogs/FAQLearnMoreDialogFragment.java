package com.whatsapp.dialogs;

import X.C002301c;
import X.C002701i;
import X.C018308n;
import X.C019208x;
import X.C019308y;
import X.C0BA;
import X.C40071rX;
import X.C40081rY;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class FAQLearnMoreDialogFragment extends Hilt_FAQLearnMoreDialogFragment {
    public C018308n A00;
    public C002301c A01;
    public C40081rY A02;
    public C40071rX A03;

    public static Dialog A00(final Context context, C40081rY c40081rY, final C018308n c018308n, final C40071rX c40071rX, final String str, CharSequence charSequence, String str2, final String str3) {
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.2ub
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                c018308n.A06(context, new Intent("android.intent.action.VIEW", C40071rX.this.A03("general", str, str3)));
            }
        };
        C019208x c019208x = new C019208x(context);
        CharSequence A0g = C002701i.A0g(charSequence, context, c40081rY);
        C019308y c019308y = c019208x.A01;
        c019308y.A0E = A0g;
        c019308y.A0J = true;
        c019208x.A05(R.string.learn_more, onClickListener);
        c019208x.A04(R.string.ok, null);
        if (str2 != null) {
            c019308y.A0I = C002701i.A0g(str2, context, c40081rY);
        }
        return c019208x.A00();
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        String string;
        String str;
        A02();
        String string2 = A02().getString("faq_id");
        if (string2 != null) {
            if (((C0BA) this).A06.containsKey("message_string_res_id")) {
                string = A0F(((C0BA) this).A06.getInt("message_string_res_id"));
            } else {
                string = A02().getString("message_text");
                if (string == null) {
                    throw null;
                }
            }
            if (((C0BA) this).A06.containsKey("title_string_res_id")) {
                str = A0F(((C0BA) this).A06.getInt("title_string_res_id"));
            } else {
                str = null;
            }
            return A00(A00(), this.A02, this.A00, this.A03, string2, string, str, ((C0BA) this).A06.containsKey("faq_section_name") ? ((C0BA) this).A06.getString("faq_section_name") : null);
        }
        throw null;
    }
}
