package com.whatsapp;

import X.AnonymousClass024;
import X.C000200d;
import X.C002301c;
import X.C018508q;
import X.C019208x;
import X.C019308y;
import X.C02160Ac;
import X.C02740Cr;
import X.C02770Cu;
import X.C02E;
import X.C03230Ew;
import X.C0SI;
import X.C40071rX;
import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.Hilt_SuspiciousLinkWarningDialogFragment;
import com.whatsapp.SuspiciousLinkWarningDialogFragment;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class SuspiciousLinkWarningDialogFragment extends Hilt_SuspiciousLinkWarningDialogFragment {
    public C018508q A00;
    public C03230Ew A01;
    public C02E A02;
    public C002301c A03;
    public C40071rX A04;

    public static SuspiciousLinkWarningDialogFragment A00(String str, Set set) {
        SuspiciousLinkWarningDialogFragment suspiciousLinkWarningDialogFragment = new SuspiciousLinkWarningDialogFragment();
        Bundle A02 = C000200d.A02("url", str);
        A02.putSerializable("phishingChars", new HashSet(set));
        suspiciousLinkWarningDialogFragment.A0P(A02);
        return suspiciousLinkWarningDialogFragment;
    }

    @Override // com.whatsapp.base.WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0g() {
        super.A0g();
        TextView textView = (TextView) ((DialogFragment) this).A03.findViewById(16908299);
        if (textView != null) {
            textView.setMovementMethod(new C02770Cu());
            textView.setTextColor(C02160Ac.A00(A09(), R.color.suspicious_link_dialog_message_color));
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        SpannableString spannableString;
        String[] split;
        int length;
        final String string = A02().getString("url");
        AbstractCollection abstractCollection = (AbstractCollection) A02().getSerializable("phishingChars");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(A0G(R.string.suspicious_link_dialog_description, this.A04.A03("general", "26000162", null).toString())));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                spannableStringBuilder.setSpan(new C02740Cr(((Hilt_SuspiciousLinkWarningDialogFragment) this).A00, this.A00, this.A02, this.A01, uRLSpan.getURL()), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
            }
            for (URLSpan uRLSpan2 : uRLSpanArr) {
                spannableStringBuilder.removeSpan(uRLSpan2);
            }
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        if (!TextUtils.isEmpty(string) && abstractCollection != null) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C02160Ac.A00(((Hilt_SuspiciousLinkWarningDialogFragment) this).A00, R.color.suspicious_link_text_background_color));
            if (string.codePointCount(0, string.length()) > 96) {
                StringBuilder sb = new StringBuilder();
                sb.append(AnonymousClass024.A0K(string, 96));
                sb.append("…");
                spannableString = new SpannableString(sb.toString());
            } else {
                spannableString = new SpannableString(string);
            }
            int i = -1;
            for (String str : Uri.parse(string).getHost().split("\\.")) {
                boolean z = false;
                int i2 = 0;
                int i3 = -1;
                while (true) {
                    length = str.length();
                    if (i2 >= length) {
                        break;
                    }
                    int codePointAt = str.codePointAt(i2);
                    int charCount = Character.charCount(codePointAt);
                    if (abstractCollection.contains(Integer.valueOf(codePointAt))) {
                        i3 = string.indexOf(codePointAt, i3 + 1);
                        spannableString.setSpan(new StyleSpan(1), i3, i3 + charCount, 33);
                        z = true;
                    }
                    i2 += charCount;
                }
                if (z) {
                    i = string.indexOf(str, i + 1);
                    spannableString.setSpan(foregroundColorSpan, i, length + i, 33);
                }
            }
            C0SI c0si = this.A03.A02().A01;
            spannableStringBuilder.append(c0si.A03(spannableString, c0si.A01));
        }
        C019208x c019208x = new C019208x(A09());
        c019208x.A03(R.string.suspicious_link_dialog_title);
        C019308y c019308y = c019208x.A01;
        c019308y.A0E = spannableStringBuilder;
        c019308y.A0J = true;
        c019208x.A04(R.string.suspicious_link_warning_negative_button_text, new DialogInterface.OnClickListener() { // from class: X.1If
            {
                SuspiciousLinkWarningDialogFragment.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                SuspiciousLinkWarningDialogFragment suspiciousLinkWarningDialogFragment = SuspiciousLinkWarningDialogFragment.this;
                suspiciousLinkWarningDialogFragment.A01.AS7(((Hilt_SuspiciousLinkWarningDialogFragment) suspiciousLinkWarningDialogFragment).A00, Uri.parse(string));
            }
        });
        c019208x.A06(R.string.suspicious_link_warning_positive_button_text, new DialogInterface.OnClickListener() { // from class: X.1Ig
            {
                SuspiciousLinkWarningDialogFragment.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                SuspiciousLinkWarningDialogFragment.this.A10();
            }
        });
        return c019208x.A00();
    }
}
