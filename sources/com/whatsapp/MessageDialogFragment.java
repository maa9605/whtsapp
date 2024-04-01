package com.whatsapp;

import X.AbstractC02800Cx;
import X.ActivityC02290Ap;
import X.ActivityC02330At;
import X.C002301c;
import X.C002701i;
import X.C019208x;
import X.C019308y;
import X.C02820Cz;
import X.C0BA;
import X.C0S6;
import X.C40081rY;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.MessageDialogFragment;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class MessageDialogFragment extends Hilt_MessageDialogFragment {
    public DialogInterface.OnClickListener A00;
    public C002301c A01;
    public C40081rY A02;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        String A18 = A18("title", "title_id", "title_params_values", "title_params_types");
        int i = A02().getInt("message_view_id");
        CharSequence A0d = C002701i.A0d(A18("message", "message_id", "message_params_values", "message_params_types"), ((Hilt_MessageDialogFragment) this).A00, null, this.A02);
        C019208x c019208x = new C019208x(A0A());
        C019308y c019308y = c019208x.A01;
        c019308y.A0I = A18;
        c019308y.A0J = true;
        if (i != 0) {
            c019308y.A0C = null;
            c019308y.A01 = i;
        } else {
            c019308y.A0E = A0d;
        }
        int i2 = A02().getInt("primary_action_text_id");
        if (i2 != 0 && this.A00 != null) {
            c019208x.A06(i2, new DialogInterface.OnClickListener() { // from class: X.1Ho
                {
                    MessageDialogFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    MessageDialogFragment.this.A00.onClick(dialogInterface, i3);
                }
            });
            int i3 = A02().getInt("secondary_action_text_id");
            if (i3 != 0) {
                c019208x.A04(i3, new DialogInterface.OnClickListener() { // from class: X.1Hp
                    {
                        MessageDialogFragment.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        MessageDialogFragment.this.A11();
                    }
                });
            }
        } else {
            c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.1Hn
                {
                    MessageDialogFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    MessageDialogFragment.this.A11();
                }
            });
        }
        return c019208x.A00();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void A14(AbstractC02800Cx abstractC02800Cx, String str) {
        if (abstractC02800Cx != null) {
            C02820Cz c02820Cz = new C02820Cz(abstractC02800Cx);
            c02820Cz.A09(0, this, str, 1);
            c02820Cz.A05();
            return;
        }
        throw null;
    }

    public final String A18(String str, String str2, String str3, String str4) {
        String string = A02().getString(str);
        if (string != null) {
            return string;
        }
        int i = ((C0BA) this).A06.getInt(str2);
        if (i == 0) {
            return null;
        }
        ArrayList<String> stringArrayList = ((C0BA) this).A06.getStringArrayList(str3);
        if (stringArrayList == null) {
            return this.A01.A06(i);
        }
        ArrayList<Integer> integerArrayList = ((C0BA) this).A06.getIntegerArrayList(str4);
        if (integerArrayList != null && integerArrayList.size() == stringArrayList.size()) {
            Object[] objArr = new Object[stringArrayList.size()];
            for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                if (integerArrayList.get(i2).intValue() == 1) {
                    objArr[i2] = Long.valueOf(Long.parseLong(stringArrayList.get(i2)));
                } else {
                    objArr[i2] = stringArrayList.get(i2);
                }
            }
            return this.A01.A0D(i, objArr);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A16(true, true);
        }
        C0BA c0ba = this.A0D;
        if (c0ba != null && (c0ba instanceof C0S6) && ((C0S6) c0ba).APf(A02().getInt("id"))) {
            return;
        }
        ActivityC02330At A09 = A09();
        if (A09 instanceof ActivityC02290Ap) {
            ((ActivityC02290Ap) A09).A10(A02().getInt("id"));
        }
    }
}
