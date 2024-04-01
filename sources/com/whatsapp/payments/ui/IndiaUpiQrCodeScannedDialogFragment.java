package com.whatsapp.payments.ui;

import X.C000200d;
import X.C002301c;
import X.C014406v;
import X.C01B;
import X.C07O;
import X.C0GR;
import X.C0GZ;
import X.C0MU;
import X.C0VW;
import X.C3Q3;
import X.C49E;
import X.C4AY;
import X.C4HB;
import X.C90564Bm;
import X.C91514Ff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class IndiaUpiQrCodeScannedDialogFragment extends Hilt_IndiaUpiQrCodeScannedDialogFragment {
    public View A00;
    public View A01;
    public Button A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public ProgressBar A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public C01B A0A;
    public C002301c A0B;
    public C90564Bm A0C;
    public C0GZ A0D;
    public C0GR A0E;
    public C91514Ff A0F;
    public final C014406v A0G = C014406v.A00("IndiaUpiQrCodeScannedDialogFragment", "payment-settings", "IN");

    @Override // X.C0BA
    public void A0j(Bundle bundle) {
        this.A0U = true;
        Bundle A02 = A02();
        C4HB c4hb = new C4HB(this, A02.getString("ARG_URL"), A02.getString("external_payment_source"));
        C0VW ADv = ADv();
        String canonicalName = C91514Ff.class.getCanonicalName();
        if (canonicalName != null) {
            String A0H = C000200d.A0H("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            HashMap hashMap = ADv.A00;
            C0MU c0mu = (C0MU) hashMap.get(A0H);
            if (!C91514Ff.class.isInstance(c0mu)) {
                c0mu = c4hb.A6e(C91514Ff.class);
                C0MU c0mu2 = (C0MU) hashMap.put(A0H, c0mu);
                if (c0mu2 != null) {
                    c0mu2.A01();
                }
            }
            this.A0F = (C91514Ff) c0mu;
            this.A02.setOnClickListener(new C3Q3(this));
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Drawable[] compoundDrawables;
        this.A0G.A07(null, "scanned payment QR code deep link", null);
        View inflate = A0A().getLayoutInflater().inflate(R.layout.india_upi_qr_code_detail_dialog, (ViewGroup) null);
        this.A01 = inflate;
        this.A06 = (ProgressBar) inflate.findViewById(R.id.progress);
        this.A03 = (LinearLayout) this.A01.findViewById(R.id.details_row);
        this.A08 = (TextView) this.A01.findViewById(R.id.contact_info_title);
        this.A07 = (TextView) this.A01.findViewById(R.id.contact_info_subtitle);
        this.A09 = (TextView) this.A01.findViewById(R.id.error_desc);
        this.A02 = (Button) this.A01.findViewById(R.id.positive_button);
        this.A04 = (LinearLayout) this.A01.findViewById(R.id.prefill_amount);
        this.A05 = (LinearLayout) this.A01.findViewById(R.id.qr_code_secure_info_container);
        this.A00 = this.A01.findViewById(R.id.qr_code_secure_info_container_divider);
        for (Drawable drawable : ((TextView) this.A01.findViewById(R.id.warning_text)).getCompoundDrawables()) {
            if (drawable != null) {
                C07O.A0X(drawable, A01().getColor(R.color.secondary_text));
            }
        }
        return this.A01;
    }

    public void A0y() {
        C91514Ff c91514Ff = this.A0F;
        if (c91514Ff != null) {
            if (c91514Ff.A0F.A08()) {
                C4AY c4ay = new C4AY(1);
                Object A01 = c91514Ff.A06.A01();
                if (A01 != null) {
                    c4ay.A01 = ((C49E) A01).A02;
                    c4ay.A02 = c91514Ff.A0B;
                    c91514Ff.A0A.A0B(c4ay);
                    return;
                }
                throw null;
            }
            c91514Ff.A0A.A0B(new C4AY(0));
            return;
        }
        throw null;
    }
}
