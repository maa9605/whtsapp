package com.whatsapp.payments.ui;

import X.AnonymousClass011;
import X.C014406v;
import X.C02770Cu;
import X.C02780Cv;
import X.C02E;
import X.C03650Gn;
import X.C0AT;
import X.C0GR;
import X.C2Lw;
import X.C37311mD;
import X.C37651ml;
import X.C3O5;
import X.C90854Cr;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* loaded from: classes3.dex */
public class AddPaymentMethodBottomSheet extends Hilt_AddPaymentMethodBottomSheet {
    public C02E A00;
    public AnonymousClass011 A01;
    public C0GR A02;
    public C2Lw A03;
    public C90854Cr A04;
    public Runnable A05;
    public final C014406v A06 = C014406v.A00("AddPaymentMethodBottomSheet", "payment-settings", "COMMON");

    @Override // X.C0BA
    public void A0h(int i, int i2, Intent intent) {
        if (i == 10) {
            if (i2 == -1) {
                Runnable runnable = this.A05;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            A16(false, false);
        }
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TextView textView;
        TextEmojiLabel textEmojiLabel;
        TextView textView2;
        View inflate = layoutInflater.inflate(R.layout.add_payment_method_bottom_sheet, viewGroup, false);
        C90854Cr c90854Cr = this.A04;
        if (c90854Cr != null) {
            String str = c90854Cr.A03;
            if (!TextUtils.isEmpty(str) && (textView2 = (TextView) inflate.findViewById(R.id.add_payment_method_bottom_sheet_title)) != null) {
                textView2.setText(str);
            }
            String str2 = this.A04.A02;
            if (!TextUtils.isEmpty(str2) && (textEmojiLabel = (TextEmojiLabel) inflate.findViewById(R.id.add_payment_method_bottom_sheet_desc)) != null) {
                textEmojiLabel.setAccessibilityHelper(new C02780Cv(this.A00, textEmojiLabel));
                textEmojiLabel.A07 = new C02770Cu();
                textEmojiLabel.setText(str2);
            }
            String str3 = this.A04.A01;
            if (!TextUtils.isEmpty(str3) && (textView = (TextView) inflate.findViewById(R.id.add_payment_method)) != null) {
                textView.setText(str3);
            }
            if (!TextUtils.isEmpty(null)) {
                View A0D = C0AT.A0D(inflate, R.id.extra_info_education_divider);
                View A0D2 = C0AT.A0D(inflate, R.id.extra_info_education_container);
                A0D.setVisibility(0);
                A0D2.setVisibility(0);
                ((TextView) C0AT.A0D(inflate, R.id.extra_info_education_text)).setText((CharSequence) null);
            }
        }
        C37651ml A1C = A1C(true);
        if (A1C != null) {
            this.A01.A0B(A1C, null, false);
        }
        C37311mD A1B = A1B(true);
        if (A1B != null) {
            A1B.A05 = 0;
            this.A01.A0B(A1B, null, false);
        }
        inflate.findViewById(R.id.add_payment_method).setOnClickListener(new C3O5(this));
        return inflate;
    }

    public final C37311mD A1B(boolean z) {
        String str;
        C03650Gn A02 = this.A02.A02();
        if (A02 == null) {
            this.A06.A04("createUserActionEvent/null country");
            return null;
        }
        C37311mD c37311mD = new C37311mD();
        if (z) {
            str = this.A03.A02();
        } else {
            C2Lw c2Lw = this.A03;
            str = c2Lw.A02;
            if (str == null) {
                str = c2Lw.A02();
            }
        }
        c37311mD.A0O = str;
        c37311mD.A0L = A02.A02;
        c37311mD.A0P = "get_started";
        return c37311mD;
    }

    public C37651ml A1C(boolean z) {
        String str;
        C03650Gn A02 = this.A02.A02();
        if (A02 == null) {
            this.A06.A04("createEvent/null country");
            return null;
        }
        C37651ml c37651ml = new C37651ml();
        if (z) {
            str = this.A03.A02();
        } else {
            C2Lw c2Lw = this.A03;
            str = c2Lw.A02;
            if (str == null) {
                str = c2Lw.A02();
            }
        }
        c37651ml.A02 = str;
        c37651ml.A01 = A02.A02;
        return c37651ml;
    }

    public void A1D() {
        C90854Cr c90854Cr = this.A04;
        if (c90854Cr != null) {
            startActivityForResult(c90854Cr.A00, 10);
            C37651ml A1C = A1C(false);
            if (A1C != null) {
                A1C.A00 = Boolean.TRUE;
                this.A01.A0B(A1C, null, false);
            }
            C37311mD A1B = A1B(false);
            if (A1B != null) {
                A1B.A05 = 1;
                A1B.A04 = 5;
                this.A01.A0B(A1B, null, false);
                return;
            }
            return;
        }
        throw null;
    }
}
