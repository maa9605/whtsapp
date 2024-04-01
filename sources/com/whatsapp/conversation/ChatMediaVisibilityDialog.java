package com.whatsapp.conversation;

import X.AbstractC005302j;
import X.ActivityC02330At;
import X.C000200d;
import X.C000700j;
import X.C019208x;
import X.C019308y;
import X.C0CB;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.ChatMediaVisibilityDialog;

/* loaded from: classes2.dex */
public class ChatMediaVisibilityDialog extends Hilt_ChatMediaVisibilityDialog {
    public int A00;
    public int A01;
    public AbstractC005302j A02;
    public C0CB A03;
    public boolean A04;

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        AbstractC005302j A02 = AbstractC005302j.A02(A02().getString("chatJid"));
        StringBuilder A0P = C000200d.A0P("Chat jid must be passed to ");
        A0P.append("ChatMediaVisibilityDialog");
        C000700j.A04(A02, A0P.toString());
        this.A02 = A02;
        this.A04 = this.A03.A0O();
        int i = this.A03.A07(this.A02).A00;
        this.A00 = i;
        this.A01 = i;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        CharSequence[] charSequenceArr = new CharSequence[3];
        boolean z = this.A04;
        int i = R.string.default_media_visibility_off;
        if (z) {
            i = R.string.default_media_visibility_on;
        }
        int i2 = 0;
        charSequenceArr[0] = A0F(i);
        charSequenceArr[1] = A0F(R.string.yes);
        charSequenceArr[2] = A0F(R.string.no);
        int i3 = this.A00;
        if (i3 == 1) {
            i2 = 2;
        } else if (i3 == 2) {
            i2 = 1;
        }
        ActivityC02330At A0A = A0A();
        TextView textView = (TextView) A0A.getLayoutInflater().inflate(R.layout.custom_dialog_title, (ViewGroup) null);
        textView.setText(R.string.chat_media_visibility_inquiry);
        C019208x c019208x = new C019208x(A0A);
        C019308y c019308y = c019208x.A01;
        c019308y.A0B = textView;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.2qk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                ChatMediaVisibilityDialog chatMediaVisibilityDialog = ChatMediaVisibilityDialog.this;
                if (i4 == 1) {
                    chatMediaVisibilityDialog.A01 = 2;
                } else if (i4 != 2) {
                    chatMediaVisibilityDialog.A01 = 0;
                } else {
                    chatMediaVisibilityDialog.A01 = 1;
                }
            }
        };
        c019308y.A0M = charSequenceArr;
        c019308y.A05 = onClickListener;
        c019308y.A00 = i2;
        c019308y.A0L = true;
        c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.2ql
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                ChatMediaVisibilityDialog chatMediaVisibilityDialog = ChatMediaVisibilityDialog.this;
                int i5 = chatMediaVisibilityDialog.A01;
                if (i5 != chatMediaVisibilityDialog.A00) {
                    C0CB c0cb = chatMediaVisibilityDialog.A03;
                    C03370Fl A08 = c0cb.A08(chatMediaVisibilityDialog.A02.getRawString());
                    if (i5 != A08.A00) {
                        A08.A00 = i5;
                        c0cb.A0J(A08);
                    }
                }
                ((DialogFragment) chatMediaVisibilityDialog).A03.dismiss();
            }
        });
        c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.2qj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                ((DialogFragment) ChatMediaVisibilityDialog.this).A03.dismiss();
            }
        });
        return c019208x.A00();
    }
}
