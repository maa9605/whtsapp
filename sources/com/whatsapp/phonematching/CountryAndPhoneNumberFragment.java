package com.whatsapp.phonematching;

import X.ActivityC02270An;
import X.AnonymousClass031;
import X.C000200d;
import X.C002301c;
import X.C006602x;
import X.C018308n;
import X.C02160Ac;
import X.C02L;
import X.C0LX;
import X.C0We;
import X.C26L;
import X.C28E;
import X.C78643kH;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I0_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.PhoneNumberEntry;
import com.whatsapp.util.Log;
import java.io.IOException;

/* loaded from: classes2.dex */
public class CountryAndPhoneNumberFragment extends Hilt_CountryAndPhoneNumberFragment {
    public int A00;
    public int A01;
    public EditText A02;
    public EditText A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public AnonymousClass031 A07;
    public ActivityC02270An A08;
    public PhoneNumberEntry A09;
    public C002301c A0A;
    public MatchPhoneNumberFragment A0B;
    public C006602x A0C;
    public String A0D = null;
    public String A0E;

    public static void A01(CountryAndPhoneNumberFragment countryAndPhoneNumberFragment, boolean z) {
        TextView textView = countryAndPhoneNumberFragment.A05;
        ActivityC02270An activityC02270An = countryAndPhoneNumberFragment.A08;
        int i = R.color.settings_item_subtitle_text;
        if (z) {
            i = R.color.red_error;
        }
        textView.setTextColor(C02160Ac.A00(activityC02270An, i));
        int i2 = R.color.settings_delete_account_spinner_tint;
        if (z) {
            i2 = R.color.red_error;
        }
        countryAndPhoneNumberFragment.A06.getBackground().setColorFilter(C02160Ac.A00(countryAndPhoneNumberFragment.A08, i2), PorterDuff.Mode.SRC_IN);
        countryAndPhoneNumberFragment.A04.setVisibility(z ? 0 : 4);
    }

    @Override // X.C0BA
    public void A0f() {
        this.A0U = true;
        this.A01 = C28E.A00(this.A03);
        this.A00 = C28E.A00(this.A02);
    }

    @Override // X.C0BA
    public void A0h(int i, int i2, Intent intent) {
        if (i == 0 && i2 == -1 && intent != null) {
            this.A0D = intent.getStringExtra("cc");
            this.A0E = intent.getStringExtra("iso");
            String stringExtra = intent.getStringExtra("country_name");
            this.A02.setText(this.A0D);
            this.A06.setText(stringExtra);
            this.A09.A00(this.A0E);
            if (this.A01 == -1) {
                this.A01 = Integer.MAX_VALUE;
            }
        }
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.country_and_phone_number, viewGroup, false);
        this.A09 = (PhoneNumberEntry) inflate.findViewById(R.id.phone_number_entry);
        this.A06 = (TextView) inflate.findViewById(R.id.registration_country);
        this.A04 = (TextView) inflate.findViewById(R.id.registration_country_error_view);
        this.A05 = (TextView) inflate.findViewById(R.id.registration_country_label);
        PhoneNumberEntry phoneNumberEntry = this.A09;
        this.A02 = phoneNumberEntry.A02;
        this.A03 = phoneNumberEntry.A03;
        phoneNumberEntry.A04 = new C78643kH(this);
        TelephonyManager telephonyManager = (TelephonyManager) this.A08.getSystemService("phone");
        if (telephonyManager == null) {
            Log.w("CountryAndPhoneNumberFragment tm=null");
        } else {
            String simCountryIso = telephonyManager.getSimCountryIso();
            if (simCountryIso != null) {
                try {
                    this.A0D = this.A07.A05(simCountryIso);
                } catch (IOException e) {
                    Log.e("CountryAndPhoneNumberFragment/iso/code failed to get code from CountryPhoneInfo", e);
                }
            }
        }
        Drawable A03 = C02160Ac.A03(this.A08, R.drawable.abc_spinner_textfield_background_material);
        if (C0LX.A01) {
            this.A06.setBackground(A03);
        } else {
            this.A06.setBackground(new C0We(this.A0A, A03));
        }
        C0LX.A03(this.A03);
        if (Build.VERSION.SDK_INT < 21) {
            this.A06.getBackground().setColorFilter(C02160Ac.A00(this.A08, R.color.settings_delete_account_spinner_tint), PorterDuff.Mode.SRC_IN);
        }
        this.A06.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 16));
        this.A03.requestFocus();
        this.A01 = C28E.A00(this.A03);
        this.A00 = C28E.A00(this.A02);
        String str = this.A0D;
        if (str != null) {
            this.A02.setText(str);
        }
        if (!TextUtils.isEmpty(this.A0E)) {
            C000200d.A1N(C000200d.A0P("CountryAndPhoneNumberFragment/country: "), this.A0E);
            this.A09.A00(this.A0E);
        }
        return inflate;
    }

    @Override // X.C0BA
    public void A0s() {
        this.A0U = true;
        String str = this.A0D;
        if (str != null) {
            this.A02.setText(str);
        }
        String str2 = this.A0E;
        if (str2 != null) {
            this.A06.setText(this.A0C.A03(this.A0A, str2));
        }
        C28E.A0G(this.A02, this.A00);
        C28E.A0G(this.A03, this.A01);
        this.A03.clearFocus();
    }

    @Override // com.whatsapp.phonematching.Hilt_CountryAndPhoneNumberFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        this.A08 = (ActivityC02270An) C018308n.A01(context, ActivityC02270An.class);
    }

    public void A0y() {
        String A0A = C000200d.A0A(this.A02);
        String obj = this.A03.getText().toString();
        switch (C26L.A02(this.A07, A0A, obj)) {
            case 2:
                ActivityC02270An activityC02270An = this.A08;
                activityC02270An.AUm(C26L.A03(activityC02270An));
                this.A02.requestFocus();
                return;
            case 3:
                this.A08.AUj(R.string.register_bad_cc_valid);
                this.A02.setText("");
                this.A02.requestFocus();
                return;
            case 4:
                this.A08.AUj(R.string.register_empty_phone);
                this.A03.requestFocus();
                return;
            case 5:
                this.A08.AUm(A0G(R.string.register_bad_phone_too_short, this.A06.getText()));
                this.A03.requestFocus();
                return;
            case 6:
                this.A08.AUm(A0G(R.string.register_bad_phone_too_long, this.A06.getText()));
                this.A03.requestFocus();
                return;
            case 7:
                this.A08.AUm(A0G(R.string.register_bad_phone, this.A06.getText()));
                this.A03.requestFocus();
                return;
            default:
                int parseInt = Integer.parseInt(A0A);
                String replaceAll = obj.replaceAll("\\D", "");
                try {
                    replaceAll = this.A07.A02(parseInt, replaceAll);
                } catch (IOException e) {
                    Log.e("CountryAndPhoneNumberFragment/phone failed trimLeadingZero from CountryPhoneInfo", e);
                }
                StringBuilder sb = new StringBuilder("CountryAndPhoneNumberFragment/phone/cc=");
                sb.append(A0A);
                sb.append("/number=");
                sb.append(replaceAll);
                Log.i(sb.toString());
                this.A0D = A0A;
                MatchPhoneNumberFragment matchPhoneNumberFragment = this.A0B;
                if (matchPhoneNumberFragment != null) {
                    StringBuilder A0X = C000200d.A0X("MatchPhoneNumberFragment/submit/cc ", A0A, " ph=", replaceAll, " jid=");
                    C02L c02l = matchPhoneNumberFragment.A00;
                    c02l.A05();
                    A0X.append(c02l.A03);
                    Log.w(A0X.toString());
                    ActivityC02270An activityC02270An2 = matchPhoneNumberFragment.A01;
                    Bundle bundle = new Bundle();
                    ConnectionProgressDialogFragment connectionProgressDialogFragment = new ConnectionProgressDialogFragment();
                    connectionProgressDialogFragment.A0P(bundle);
                    connectionProgressDialogFragment.A14(activityC02270An2.A0N(), "PROGRESS");
                    matchPhoneNumberFragment.A03.sendEmptyMessageDelayed(4, 30000L);
                    if (!matchPhoneNumberFragment.A02.A0V(A0A, replaceAll)) {
                        matchPhoneNumberFragment.A03.removeMessages(4);
                        DialogFragment dialogFragment = (DialogFragment) matchPhoneNumberFragment.A01.A0N().A0Q.A01("PROGRESS");
                        if (dialogFragment != null) {
                            dialogFragment.A11();
                        }
                        ActivityC02270An activityC02270An3 = matchPhoneNumberFragment.A01;
                        activityC02270An3.AUm(activityC02270An3.getString(R.string.register_check_connectivity, activityC02270An3.getString(R.string.connectivity_self_help_instructions)));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
