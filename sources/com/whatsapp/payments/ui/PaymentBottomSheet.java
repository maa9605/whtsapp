package com.whatsapp.payments.ui;

import X.AbstractC02800Cx;
import X.AbstractC08940cM;
import X.C000200d;
import X.C014406v;
import X.C02820Cz;
import X.C0BA;
import X.C0D0;
import X.C3QV;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* loaded from: classes3.dex */
public class PaymentBottomSheet extends Hilt_PaymentBottomSheet {
    public DialogInterface.OnDismissListener A00;
    public C0BA A01;
    public C014406v A02 = C014406v.A00("PaymentBottomSheet", "payment", "COMMON");

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.payment_bottom_sheet, viewGroup, false);
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        BottomSheetBehavior A00 = BottomSheetBehavior.A00(view.findViewById(R.id.bottom_sheet));
        A00.A0N(0);
        A00.A0O(3);
        A00.A0E = new AbstractC08940cM() { // from class: X.4E3
            @Override // X.AbstractC08940cM
            public void A00(View view2, float f) {
            }

            {
                PaymentBottomSheet.this = this;
            }

            @Override // X.AbstractC08940cM
            public void A01(View view2, int i) {
                if (i == 5 || i == 4) {
                    PaymentBottomSheet.this.A10();
                }
            }
        };
        view.findViewById(R.id.dismiss_space).setOnClickListener(new C3QV(this));
        view.findViewById(R.id.fragment_container).setOnTouchListener(new View.OnTouchListener() { // from class: X.3QU
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        AbstractC02800Cx A0B = A0B();
        if (A0B != null) {
            C02820Cz c02820Cz = new C02820Cz(A0B);
            c02820Cz.A00(R.id.fragment_container, this.A01);
            c02820Cz.A03(null);
            c02820Cz.A04();
            return;
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        RelativeLayout relativeLayout = new RelativeLayout(A09());
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Dialog dialog = new Dialog(A00());
        dialog.requestWindowFeature(1);
        dialog.setContentView(relativeLayout);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.getAttributes().windowAnimations = R.style.BottomSheetDialogFragmentAnimation;
        }
        return dialog;
    }

    public void A18() {
        AbstractC02800Cx A0B = A0B();
        int A03 = A0B.A03();
        A0B.A0D();
        if (A03 <= 1) {
            A16(false, false);
        }
    }

    public void A19(C0BA c0ba) {
        C014406v c014406v = this.A02;
        StringBuilder A0P = C000200d.A0P("navigate-to fragment=");
        A0P.append(c0ba.getClass().getName());
        c014406v.A03(A0P.toString());
        AbstractC02800Cx A0B = A0B();
        if (A0B != null) {
            C02820Cz c02820Cz = new C02820Cz(A0B);
            ((C0D0) c02820Cz).A02 = 17432576;
            c02820Cz.A03 = 17432577;
            c02820Cz.A04 = 17432576;
            c02820Cz.A05 = 17432577;
            c02820Cz.A06((C0BA) A0B().A0Q.A04().get(0));
            c02820Cz.A01(R.id.fragment_container, c0ba, null);
            c02820Cz.A03(null);
            c02820Cz.A04();
            return;
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A16(true, true);
        }
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
