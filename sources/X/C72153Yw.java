package X;

import android.content.Context;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;

/* renamed from: X.3Yw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C72153Yw {
    public final int A00;
    public final View A01;
    public final View A02;

    public C72153Yw(View view, View view2, int i) {
        this.A02 = view;
        this.A01 = view2;
        this.A00 = i;
        if (Build.VERSION.SDK_INT >= 21) {
            view.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: X.3Yt
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    C72153Yw.this.A01();
                }
            });
        }
    }

    public void A00() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.A02.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.3Yu
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    C72153Yw c72153Yw = C72153Yw.this;
                    View view = c72153Yw.A02;
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (view.canScrollVertically(1)) {
                        c72153Yw.A01.setElevation(c72153Yw.A00);
                        return false;
                    }
                    c72153Yw.A01.setElevation(0.0f);
                    return false;
                }
            });
        }
    }

    public final void A01() {
        if (this.A02.canScrollVertically(1)) {
            this.A01.setElevation(this.A00);
        } else {
            this.A01.setElevation(0.0f);
        }
    }

    public void A02(Context context, TextView textView, String str, ClickableSpan clickableSpan, int i) {
        SpannableString spannableString = new SpannableString(str);
        int length = str.length();
        spannableString.setSpan(clickableSpan, 0, length, 0);
        spannableString.setSpan(new TextAppearanceSpan(context, i), 0, length, 0);
        spannableString.setSpan(new UnderlineSpan() { // from class: X.3Yv
            @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }
        }, 0, length, 0);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }
}
