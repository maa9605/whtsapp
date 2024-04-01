package com.whatsapp.biz;

import X.AbstractC40211rm;
import X.C002301c;
import X.C002701i;
import X.C02160Ac;
import X.C08540bf;
import X.C40081rY;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.biz.catalog.EllipsizedTextEmojiLabel;

/* loaded from: classes2.dex */
public class BusinessProfileFieldView extends AbstractC40211rm {
    public int A00;
    public ColorStateList A01;
    public ColorStateList A02;
    public Drawable A03;
    public ImageView A04;
    public TextView A05;
    public TextView A06;
    public C002301c A07;
    public C40081rY A08;
    public String A09;
    public boolean A0A;

    public BusinessProfileFieldView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextUtils.TruncateAt truncateAt;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C08540bf.A0S, 0, 0);
            try {
                this.A03 = obtainStyledAttributes.getDrawable(2);
                this.A00 = obtainStyledAttributes.getInteger(0, 0);
                this.A0A = obtainStyledAttributes.getBoolean(3, false);
                ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(4);
                this.A01 = colorStateList;
                if (colorStateList == null) {
                    this.A01 = new ColorStateList(new int[][]{new int[0]}, new int[]{C02160Ac.A00(getContext(), R.color.primary_text)});
                }
                ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(5);
                this.A02 = colorStateList2;
                if (colorStateList2 == null) {
                    this.A02 = this.A01;
                }
                this.A09 = this.A07.A0B(1, obtainStyledAttributes);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.business_profile_field_layout, (ViewGroup) this, true);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.field_icon);
        this.A04 = imageView;
        if (this.A03 != null) {
            imageView.setVisibility(0);
            this.A04.setImageDrawable(this.A03);
        }
        this.A06 = (TextView) inflate.findViewById(R.id.field_textview);
        this.A05 = (TextView) inflate.findViewById(R.id.sub_field_textview);
        this.A06.setSingleLine(this.A0A);
        this.A05.setSingleLine(this.A0A);
        int i = this.A00;
        if (i == 1) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        } else if (i != 3) {
            truncateAt = i != 4 ? null : TextUtils.TruncateAt.MARQUEE;
        } else {
            truncateAt = TextUtils.TruncateAt.END;
        }
        this.A06.setEllipsize(truncateAt);
        this.A05.setEllipsize(truncateAt);
        TextView textView = this.A06;
        EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel = (EllipsizedTextEmojiLabel) textView;
        ellipsizedTextEmojiLabel.A00 = 180;
        ellipsizedTextEmojiLabel.A02 = R.color.primary_light;
        EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel2 = (EllipsizedTextEmojiLabel) this.A05;
        ellipsizedTextEmojiLabel2.A00 = 180;
        ellipsizedTextEmojiLabel2.A02 = R.color.primary_light;
        textView.setTextColor(this.A01);
    }

    public int getLayoutRes() {
        return R.layout.business_profile_field_layout;
    }

    public TextView getSubTextView() {
        return this.A05;
    }

    public String getText() {
        TextView textView = this.A06;
        if (textView != null) {
            return textView.getText().toString();
        }
        return null;
    }

    public TextView getTextView() {
        return this.A06;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A06.setEnabled(z);
        this.A05.setEnabled(z);
    }

    public void setIcon(int i) {
        this.A04.setVisibility(0);
        this.A04.setImageDrawable(C02160Ac.A03(getContext(), i));
    }

    public void setInputType(int i) {
        TextView textView = this.A06;
        if (textView != null) {
            textView.setInputType(i);
        }
    }

    public void setSubText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.A05.setText("");
            this.A05.setVisibility(8);
            return;
        }
        ((TextEmojiLabel) this.A05).A03(C002701i.A0d(charSequence, getContext(), this.A06.getPaint(), this.A08));
        this.A05.setVisibility(0);
    }

    public void setText(CharSequence charSequence, View.OnClickListener onClickListener) {
        if (TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(this.A09)) {
            this.A06.setText("");
            setVisibility(8);
            return;
        }
        this.A06.setTextColor(this.A01);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.A09;
            this.A06.setTextColor(this.A02);
        }
        TextView textView = this.A06;
        ((EllipsizedTextEmojiLabel) textView).A03 = onClickListener;
        ((TextEmojiLabel) textView).A03(C002701i.A0d(charSequence, getContext(), this.A06.getPaint(), this.A08));
        setVisibility(0);
    }

    public void setTextColor(int i) {
        this.A06.setTextColor(i);
        this.A01 = new ColorStateList(new int[][]{new int[0]}, new int[]{i});
    }
}
