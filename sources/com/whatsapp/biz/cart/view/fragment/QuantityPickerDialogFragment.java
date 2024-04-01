package com.whatsapp.biz.cart.view.fragment;

import X.AbstractC02800Cx;
import X.ActivityC02330At;
import X.C000700j;
import X.C018308n;
import X.C019208x;
import X.C0AT;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.biz.cart.view.fragment.QuantityPickerDialogFragment;
import com.whatsapp.jid.UserJid;

/* loaded from: classes2.dex */
public class QuantityPickerDialogFragment extends Hilt_QuantityPickerDialogFragment {
    public CartFragment A00;

    @Override // com.whatsapp.biz.cart.view.fragment.Hilt_QuantityPickerDialogFragment, com.whatsapp.base.Hilt_WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        AbstractC02800Cx A0N = ((ActivityC02330At) C018308n.A00(context)).A0N();
        CartFragment cartFragment = (CartFragment) A0N.A0Q.A01(CartFragment.class.getName());
        StringBuilder sb = new StringBuilder();
        sb.append(QuantityPickerDialogFragment.class.getName());
        sb.append(" must be invoked from a Fragment that implements the Listener");
        C000700j.A04(cartFragment, sb.toString());
        this.A00 = cartFragment;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        Bundle A02 = A02();
        int i = A02.getInt("extra_initial_quantity");
        final String string = A02.getString("extra_product_id", "");
        C019208x c019208x = new C019208x(A0A());
        View inflate = A0A().getLayoutInflater().inflate(R.layout.fragment_dialog_quantity_picker, (ViewGroup) null);
        final NumberPicker numberPicker = (NumberPicker) C0AT.A0D(inflate, R.id.cart_quantity_picker);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(99);
        numberPicker.setValue(i);
        String[] strArr = new String[100];
        strArr[0] = A0F(R.string.remove);
        int i2 = 1;
        do {
            strArr[i2] = String.valueOf(i2);
            i2++;
        } while (i2 <= 99);
        numberPicker.setDisplayedValues(strArr);
        c019208x.A03(R.string.quantity_picker_title);
        c019208x.A07(inflate);
        c019208x.A06(R.string.done, new DialogInterface.OnClickListener() { // from class: X.2mc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                QuantityPickerDialogFragment quantityPickerDialogFragment = QuantityPickerDialogFragment.this;
                NumberPicker numberPicker2 = numberPicker;
                String str = string;
                CartFragment cartFragment = quantityPickerDialogFragment.A00;
                int value = numberPicker2.getValue();
                C49492Kt c49492Kt = cartFragment.A0P;
                if (value == 0) {
                    C2KZ c2kz = c49492Kt.A0E;
                    UserJid userJid = c49492Kt.A0L;
                    c2kz.A0D.A02(30, 54, str, userJid);
                    c2kz.A0J.AS1(new RunnableEBaseShape0S1200000_I0(c2kz, str, userJid, 2));
                    return;
                }
                C2KZ c2kz2 = c49492Kt.A0E;
                UserJid userJid2 = c49492Kt.A0L;
                c2kz2.A0D.A03(29, 53, str, userJid2, Long.valueOf(value), null, null, null, null);
                c2kz2.A0J.AS1(new RunnableEBaseShape0S1201000_I0(c2kz2, userJid2, str, value, 0));
            }
        });
        c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.2mb
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
            }
        });
        return c019208x.A00();
    }
}
