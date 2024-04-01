package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.4FX  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4FX extends LinearLayout implements AnonymousClass005 {
    public ImageView A00;
    public TextView A01;
    public C002301c A02;
    public C0EU A03;
    public C2UB A04;
    public boolean A05;

    public C4FX(Context context) {
        super(context);
        if (!this.A05) {
            this.A05 = true;
            ((AbstractC07960aN) generatedComponent()).A28(this);
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.payment_help_support_information_row, (ViewGroup) this, true);
        this.A00 = (ImageView) inflate.findViewById(R.id.bank_logo);
        this.A01 = (TextView) inflate.findViewById(R.id.contact_bank_details);
    }

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        C2UB c2ub = this.A04;
        if (c2ub == null) {
            c2ub = new C2UB(this);
            this.A04 = c2ub;
        }
        return c2ub.generatedComponent();
    }

    public final void setWhatsAppContactDetails(String str, String str2) {
        String A0D;
        if (AnonymousClass093.A0A(str2)) {
            A0D = this.A02.A0D(R.string.upi_contact_support_for_payment, str, str2);
        } else {
            A0D = this.A02.A0D(R.string.upi_contact_support_for_payment_no_transaction, str);
        }
        SpannableString spannableString = new SpannableString(A0D);
        URLSpan uRLSpan = new URLSpan(C000200d.A0H("tel:", str));
        int indexOf = A0D.indexOf(str);
        spannableString.setSpan(uRLSpan, indexOf, str.length() + indexOf, 33);
        this.A01.setText(spannableString);
        this.A01.setVisibility(0);
    }
}
