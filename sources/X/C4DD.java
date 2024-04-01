package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.4DD  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4DD extends LinearLayout implements AnonymousClass005 {
    public TextView A00;
    public C01B A01;
    public C002301c A02;
    public C2UB A03;
    public boolean A04;

    public C4DD(Context context) {
        super(context);
        if (!this.A04) {
            this.A04 = true;
            ((AbstractC07960aN) generatedComponent()).A24(this);
        }
        this.A00 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.payment_help_support_information_row, (ViewGroup) this, true).findViewById(R.id.contact_bank_details);
    }

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        C2UB c2ub = this.A03;
        if (c2ub == null) {
            c2ub = new C2UB(this);
            this.A03 = c2ub;
        }
        return c2ub.generatedComponent();
    }

    public void setContactInformation(String str) {
        String A0A = this.A01.A0A(C01C.A4F);
        if (!TextUtils.isEmpty(A0A) && AnonymousClass093.A0A(str)) {
            setWhatsAppContactDetails(A0A, str);
        } else if (!TextUtils.isEmpty(A0A)) {
            setWhatsAppContactDetails(A0A, null);
        } else {
            setVisibility(8);
        }
    }

    public final void setWhatsAppContactDetails(String str, String str2) {
        String A0D;
        if (AnonymousClass093.A0A(str2)) {
            A0D = this.A02.A0D(R.string.contact_support_for_payment, str, str2);
        } else {
            A0D = this.A02.A0D(R.string.contact_support_for_payment_no_transaction, str);
        }
        SpannableString spannableString = new SpannableString(A0D);
        URLSpan uRLSpan = new URLSpan(C000200d.A0H("tel:", str));
        int indexOf = A0D.indexOf(str);
        spannableString.setSpan(uRLSpan, indexOf, str.length() + indexOf, 33);
        this.A00.setText(spannableString);
        this.A00.setVisibility(0);
    }
}
