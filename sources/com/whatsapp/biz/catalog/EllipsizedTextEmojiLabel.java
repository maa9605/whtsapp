package com.whatsapp.biz.catalog;

import X.AbstractC02750Cs;
import X.C02770Cu;
import X.C2VO;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.biz.catalog.EllipsizedTextEmojiLabel;
import java.util.List;

/* loaded from: classes2.dex */
public class EllipsizedTextEmojiLabel extends C2VO {
    public int A00;
    public int A01;
    public int A02;
    public View.OnClickListener A03;
    public CharSequence A04;
    public List A05;

    public EllipsizedTextEmojiLabel(final Context context, final AttributeSet attributeSet) {
        new TextEmojiLabel(context, attributeSet) { // from class: X.2VO
            public boolean A00;

            {
                A00();
            }

            @Override // X.AbstractC02680Ck, X.AbstractC02690Cm
            public void A00() {
                if (this.A00) {
                    return;
                }
                this.A00 = true;
                ((AbstractC07960aN) generatedComponent()).A0S((EllipsizedTextEmojiLabel) this);
            }
        };
        this.A07 = new C02770Cu();
        this.A02 = R.color.link_color;
    }

    @Override // com.whatsapp.TextEmojiLabel
    public void A06(CharSequence charSequence, List list, boolean z, int i) {
        this.A04 = charSequence;
        this.A05 = list;
        this.A01 = i;
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (codePointCount > this.A00) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(getContext().getString(R.string.read_more));
            final Context context = getContext();
            final int i2 = this.A02;
            spannableStringBuilder2.setSpan(new AbstractC02750Cs(context, i2) { // from class: X.3Ip
                @Override // X.InterfaceC02760Ct
                public void onClick(View view) {
                    EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel = EllipsizedTextEmojiLabel.this;
                    View.OnClickListener onClickListener = ellipsizedTextEmojiLabel.A03;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    ellipsizedTextEmojiLabel.A00 = Integer.MAX_VALUE;
                    ellipsizedTextEmojiLabel.A06(ellipsizedTextEmojiLabel.A04, ellipsizedTextEmojiLabel.A05, true, ellipsizedTextEmojiLabel.A01);
                }
            }, 0, spannableStringBuilder2.length(), 18);
            int i3 = 0;
            for (int i4 = 0; i4 < this.A00; i4++) {
                i3 += Character.charCount(Character.codePointAt(charSequence, i3));
            }
            spannableStringBuilder = spannableStringBuilder.delete(i3, spannableStringBuilder.length()).append((CharSequence) "... ").append((CharSequence) spannableStringBuilder2);
        }
        super.A06(spannableStringBuilder, list, true, i);
    }

    public void setEllipsizeLength(int i) {
        this.A00 = i;
    }

    public void setOnTextExpandClickListener(View.OnClickListener onClickListener) {
        this.A03 = onClickListener;
    }

    public void setReadMoreColor(int i) {
        this.A02 = i;
    }
}
