package com.whatsapp.status;

import X.C002301c;
import X.C019208x;
import X.C019308y;
import X.C0E6;
import X.C0EB;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jobqueue.job.SendStatusPrivacyListJob;
import com.whatsapp.status.FirstStatusConfirmationDialogFragment;
import com.whatsapp.status.Hilt_FirstStatusConfirmationDialogFragment;
import com.whatsapp.status.StatusPrivacyActivity;
import java.util.AbstractCollection;

/* loaded from: classes2.dex */
public class FirstStatusConfirmationDialogFragment extends Hilt_FirstStatusConfirmationDialogFragment {
    public TextView A00;
    public C0E6 A01;
    public C002301c A02;
    public C0EB A03;

    @Override // X.C0BA
    public void A0h(int i, int i2, Intent intent) {
        if (i == 0) {
            this.A00.setText(A18());
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        View inflate = A09().getLayoutInflater().inflate(R.layout.first_status_confirmation, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.text);
        this.A00 = textView;
        textView.setText(A18());
        this.A00.setMovementMethod(LinkMovementMethod.getInstance());
        C019208x c019208x = new C019208x(A09());
        C019308y c019308y = c019208x.A01;
        c019308y.A0C = inflate;
        c019308y.A01 = 0;
        c019308y.A0J = true;
        c019208x.A06(R.string.send, new DialogInterface.OnClickListener() { // from class: X.3Wn
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                FirstStatusConfirmationDialogFragment firstStatusConfirmationDialogFragment = FirstStatusConfirmationDialogFragment.this;
                if (!firstStatusConfirmationDialogFragment.A03.A0H()) {
                    firstStatusConfirmationDialogFragment.A03.A0D(0, null);
                    C0E6 c0e6 = firstStatusConfirmationDialogFragment.A01;
                    c0e6.A00.A01(new SendStatusPrivacyListJob(0, null, null));
                }
                ActivityC02330At A09 = firstStatusConfirmationDialogFragment.A09();
                if (A09 instanceof C2EO) {
                    ((C2EO) A09).AP2();
                }
                firstStatusConfirmationDialogFragment.A10();
            }
        });
        c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3Wo
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                FirstStatusConfirmationDialogFragment.this.A10();
            }
        });
        return c019208x.A00();
    }

    public final Spanned A18() {
        String A0F;
        int A04 = this.A03.A04();
        if (A04 == 0) {
            A0F = A0F(R.string.first_status_all_contacts);
        } else if (A04 == 1) {
            int size = ((AbstractCollection) this.A03.A0A()).size();
            A0F = this.A02.A0A(R.plurals.first_status_selected_contacts, size, Integer.valueOf(size));
        } else if (A04 == 2) {
            int size2 = ((AbstractCollection) this.A03.A09()).size();
            if (size2 == 0) {
                A0F = A0F(R.string.first_status_all_contacts);
            } else {
                A0F = this.A02.A0A(R.plurals.first_status_excluded_contacts, size2, Integer.valueOf(size2));
            }
        } else {
            throw new IllegalStateException("unknown status distribution mode");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0F);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(A0F(R.string.change_privacy_settings));
        spannableStringBuilder2.setSpan(new ClickableSpan() { // from class: X.3X0
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                FirstStatusConfirmationDialogFragment.this.A0O(new Intent(view.getContext(), StatusPrivacyActivity.class), 0, null);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                textPaint.setColor(C02160Ac.A00(((Hilt_FirstStatusConfirmationDialogFragment) FirstStatusConfirmationDialogFragment.this).A00, R.color.accent_light));
            }
        }, 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        return spannableStringBuilder;
    }
}
