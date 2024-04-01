package com.whatsapp.dialogs;

import X.C01B;
import X.C01C;
import X.C02180Ae;
import X.C50262Ra;
import X.C52902bX;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class HFMLearnMoreDialogFragment extends FAQLearnMoreDialogFragment {
    public ContextWrapper A00;
    public C01B A01;
    public boolean A02 = false;

    @Override // com.whatsapp.dialogs.Hilt_FAQLearnMoreDialogFragment, com.whatsapp.base.Hilt_WaDialogFragment, X.C0BA
    public Context A0a() {
        return this.A00;
    }

    @Override // com.whatsapp.dialogs.Hilt_FAQLearnMoreDialogFragment, com.whatsapp.base.Hilt_WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public LayoutInflater A0b(Bundle bundle) {
        return LayoutInflater.from(new C52902bX(super.A0b(bundle), this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (X.C52912bY.A00(r0) == r4) goto L11;
     */
    @Override // com.whatsapp.dialogs.Hilt_FAQLearnMoreDialogFragment, com.whatsapp.base.Hilt_WaDialogFragment, X.C0BA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0c(android.app.Activity r4) {
        /*
            r3 = this;
            super.A0c(r4)
            android.content.ContextWrapper r0 = r3.A00
            r1 = 0
            if (r0 == 0) goto Lf
            android.content.Context r0 = X.C52912bY.A00(r0)
            r2 = 0
            if (r0 != r4) goto L10
        Lf:
            r2 = 1
        L10:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            X.AnonymousClass029.A1J(r2, r0, r1)
            android.content.ContextWrapper r0 = r3.A00
            if (r0 != 0) goto L27
            android.content.ContextWrapper r1 = r3.A00
            X.2bX r0 = new X.2bX
            r0.<init>(r1, r3)
            r3.A00 = r0
            r3.A17()
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dialogs.HFMLearnMoreDialogFragment.A0c(android.app.Activity):void");
    }

    @Override // com.whatsapp.dialogs.Hilt_FAQLearnMoreDialogFragment, com.whatsapp.base.Hilt_WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        if (this.A00 == null) {
            this.A00 = new C52902bX(((Hilt_FAQLearnMoreDialogFragment) this).A00, this);
            A17();
        }
    }

    @Override // com.whatsapp.dialogs.FAQLearnMoreDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        String str;
        int A07 = this.A01.A07(C01C.A30);
        if (this.A01.A0E(C01C.A18)) {
            str = ((FAQLearnMoreDialogFragment) this).A01.A0A(R.plurals.hfm_multicast_limit_reached_with_faq_updated, A07, Integer.valueOf(A07));
        } else {
            String A0A = ((FAQLearnMoreDialogFragment) this).A01.A0A(R.plurals.hfm_multicast_limit_reached_with_faq, A07, "\"hfm-icon\"", Integer.valueOf(A07));
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(A01().getDimensionPixelSize(R.dimen.subtitle_text_size));
            Drawable A0O = C02180Ae.A0O(this.A00, R.drawable.ic_frequently_forwarded, R.color.forwarded_message_arrow_tint);
            int indexOf = TextUtils.indexOf(A0A, "\"hfm-icon\"");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0A);
            C50262Ra.A02(spannableStringBuilder, A0O, textPaint, -1, indexOf, "\"hfm-icon\"".length() + indexOf);
            str = spannableStringBuilder;
        }
        return FAQLearnMoreDialogFragment.A00(A00(), ((FAQLearnMoreDialogFragment) this).A02, ((FAQLearnMoreDialogFragment) this).A00, ((FAQLearnMoreDialogFragment) this).A03, "26000253", str, null, null);
    }
}
