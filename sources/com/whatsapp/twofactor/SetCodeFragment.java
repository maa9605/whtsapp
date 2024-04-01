package com.whatsapp.twofactor;

import X.C000200d;
import X.C41911ui;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CodeInputField;

/* loaded from: classes2.dex */
public class SetCodeFragment extends Hilt_SetCodeFragment {
    public int A00;
    public Button A01;
    public TextView A02;
    public CodeInputField A03;
    public TwoFactorAuthActivity A04;
    public C41911ui A05;

    public static void A00(SetCodeFragment setCodeFragment) {
        int i = setCodeFragment.A00;
        if (i == 0) {
            TwoFactorAuthActivity twoFactorAuthActivity = setCodeFragment.A04;
            twoFactorAuthActivity.A1S(twoFactorAuthActivity.A1P(), false);
        } else if (i == 1) {
            TwoFactorAuthActivity twoFactorAuthActivity2 = setCodeFragment.A04;
            Bundle A01 = C000200d.A01("type", 2);
            SetCodeFragment setCodeFragment2 = new SetCodeFragment();
            setCodeFragment2.A0P(A01);
            twoFactorAuthActivity2.A1S(setCodeFragment2, true);
        } else if (i == 2) {
            TwoFactorAuthActivity twoFactorAuthActivity3 = setCodeFragment.A04;
            if (twoFactorAuthActivity3.A1T(setCodeFragment)) {
                twoFactorAuthActivity3.A1Q();
                return;
            }
            Bundle A012 = C000200d.A01("type", 1);
            SetEmailFragment setEmailFragment = new SetEmailFragment();
            setEmailFragment.A0P(A012);
            twoFactorAuthActivity3.A1S(setEmailFragment, true);
        }
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_two_factor_auth_code, viewGroup, false);
    }

    @Override // X.C0BA
    public void A0r() {
        this.A0U = true;
        this.A04 = null;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
    }

    @Override // X.C0BA
    public void A0s() {
        String str;
        boolean z = true;
        this.A0U = true;
        z = (this.A00 == 2 && this.A04.A1T(this)) ? false : false;
        Button button = this.A01;
        int i = R.string.next;
        if (z) {
            i = R.string.two_factor_auth_submit;
        }
        button.setText(i);
        if (this.A00 == 2 && (str = this.A04.A03) != null) {
            this.A03.setCode(str);
            A0z(this.A03.getCode());
        }
        A0y();
        this.A03.requestFocus();
    }

    @Override // X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        this.A00 = A02().getInt("type", 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    @Override // X.C0BA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0w(android.view.View r14, android.os.Bundle r15) {
        /*
            r13 = this;
            X.0At r0 = r13.A09()
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = (com.whatsapp.twofactor.TwoFactorAuthActivity) r0
            r13.A04 = r0
            r0 = 2131364778(0x7f0a0baa, float:1.8349403E38)
            android.view.View r2 = r14.findViewById(r0)
            android.widget.Button r2 = (android.widget.Button) r2
            r13.A01 = r2
            r1 = 5
            com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I0_3 r0 = new com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I0_3
            r0.<init>(r13, r1)
            r2.setOnClickListener(r0)
            r0 = 2131362873(0x7f0a0439, float:1.8345539E38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r13.A02 = r0
            r0 = 2131362431(0x7f0a027f, float:1.8344642E38)
            android.view.View r0 = r14.findViewById(r0)
            com.whatsapp.CodeInputField r0 = (com.whatsapp.CodeInputField) r0
            r13.A03 = r0
            X.3sD r11 = new X.3sD
            r11.<init>()
            r5 = 2131886150(0x7f120046, float:1.940687E38)
            r3 = 1
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r2 = 0
            r1[r2] = r4
            java.lang.String r12 = r13.A0G(r5, r1)
            com.whatsapp.CodeInputField r5 = r13.A03
            X.3sE r6 = new X.3sE
            r6.<init>()
            r10 = 0
            r7 = 6
            r8 = 42
            r9 = r8
            r5.A07(r6, r7, r8, r9, r10, r11, r12)
            int r1 = r13.A00
            if (r1 == r3) goto L88
            r0 = 2
            if (r1 == r0) goto L7f
            r0 = 2131890271(0x7f12105f, float:1.941523E38)
            java.lang.String r1 = r13.A0F(r0)
        L66:
            r4 = 0
        L67:
            r0 = 2131362432(0x7f0a0280, float:1.8344644E38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r1)
            com.whatsapp.twofactor.TwoFactorAuthActivity r1 = r13.A04
            int[] r0 = r1.A06
            int r0 = r0.length
            if (r0 != r3) goto L7b
            r2 = r4
        L7b:
            r1.A1R(r14, r2)
            return
        L7f:
            r0 = 2131890242(0x7f121042, float:1.941517E38)
            java.lang.String r1 = r13.A0F(r0)
            r4 = 1
            goto L67
        L88:
            r1 = 2131890237(0x7f12103d, float:1.941516E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r2] = r4
            java.lang.String r1 = r13.A0G(r1, r0)
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.twofactor.SetCodeFragment.A0w(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x002e, code lost:
        if (r1.contentEquals(r3.A03.getCode()) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0y() {
        /*
            r3 = this;
            android.widget.Button r0 = r3.A01
            if (r0 == 0) goto L1c
            int r1 = r3.A00
            r0 = 1
            if (r1 != r0) goto L1d
            com.whatsapp.CodeInputField r1 = r3.A03
            java.lang.String r1 = r1.getCode()
            int r2 = r1.length()
            r1 = 6
            if (r2 == r1) goto L17
            r0 = 0
        L17:
            android.widget.Button r1 = r3.A01
            r1.setEnabled(r0)
        L1c:
            return
        L1d:
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = r3.A04
            java.lang.String r1 = r0.A02
            if (r1 == 0) goto L30
            com.whatsapp.CodeInputField r0 = r3.A03
            java.lang.String r0 = r0.getCode()
            boolean r1 = r1.contentEquals(r0)
            r0 = 1
            if (r1 != 0) goto L17
        L30:
            r0 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.twofactor.SetCodeFragment.A0y():void");
    }

    public final boolean A0z(CharSequence charSequence) {
        this.A02.setText("");
        if (charSequence.length() != 6) {
            return false;
        }
        int i = this.A00;
        if (i == 0) {
            String A02 = this.A05.A02();
            if (A02 != null && A02.contentEquals(this.A03.getCode())) {
                return true;
            }
            this.A02.setText(R.string.two_factor_auth_code_verification_error);
        } else if (i == 1) {
            return true;
        } else {
            if (i == 2) {
                String str = this.A04.A02;
                if (str != null && str.contentEquals(this.A03.getCode())) {
                    return true;
                }
                this.A02.setText(R.string.two_factor_auth_code_mismatch_error);
            }
        }
        this.A03.requestFocus();
        return false;
    }
}
