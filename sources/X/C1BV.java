package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1BV  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1BV {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Animator A06;
    public Typeface A07;
    public FrameLayout A08;
    public LinearLayout A09;
    public TextView A0A;
    public TextView A0B;
    public CharSequence A0C;
    public CharSequence A0D;
    public boolean A0E;
    public boolean A0F;
    public final float A0G;
    public final Context A0H;
    public final TextInputLayout A0I;

    public C1BV(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.A0H = context;
        this.A0I = textInputLayout;
        this.A0G = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public final TextView A00(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.A0B;
        }
        return this.A0A;
    }

    public void A01() {
        TextInputLayout textInputLayout;
        EditText editText;
        LinearLayout linearLayout = this.A09;
        if (linearLayout == null || (editText = (textInputLayout = this.A0I).A0L) == null) {
            return;
        }
        C0AT.A0Y(linearLayout, C0AT.A07(editText), 0, C0AT.A06(textInputLayout.A0L), 0);
    }

    public void A02() {
        this.A0C = null;
        Animator animator = this.A06;
        if (animator != null) {
            animator.cancel();
        }
        if (this.A00 == 1) {
            if (this.A0F && !TextUtils.isEmpty(this.A0D)) {
                this.A01 = 2;
            } else {
                this.A01 = 0;
            }
        }
        A03(this.A00, this.A01, A08(this.A0A, null));
    }

    public final void A03(final int i, final int i2, boolean z) {
        TextView A00;
        TextView A002;
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.A06 = animatorSet;
            ArrayList arrayList = new ArrayList();
            A06(arrayList, this.A0F, this.A0B, 2, i, i2);
            A06(arrayList, this.A0E, this.A0A, 1, i, i2);
            AnonymousClass088.A1B(animatorSet, arrayList);
            final TextView A003 = A00(i);
            final TextView A004 = A00(i2);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.1BU
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    TextView textView;
                    C1BV c1bv = C1BV.this;
                    c1bv.A00 = i2;
                    c1bv.A06 = null;
                    TextView textView2 = A003;
                    if (textView2 != null) {
                        textView2.setVisibility(4);
                        if (i != 1 || (textView = c1bv.A0A) == null) {
                            return;
                        }
                        textView.setText((CharSequence) null);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    TextView textView = A004;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                }
            });
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (A002 = A00(i2)) != null) {
                A002.setVisibility(0);
                A002.setAlpha(1.0f);
            }
            if (i != 0 && (A00 = A00(i)) != null) {
                A00.setVisibility(4);
                if (i == 1) {
                    A00.setText((CharSequence) null);
                }
            }
            this.A00 = i2;
        }
        TextInputLayout textInputLayout = this.A0I;
        textInputLayout.A02();
        textInputLayout.A0F(z, false);
        textInputLayout.A03();
    }

    public void A04(TextView textView, int i) {
        if (this.A09 == null && this.A08 == null) {
            final Context context = this.A0H;
            LinearLayout linearLayout = new LinearLayout(context);
            this.A09 = linearLayout;
            linearLayout.setOrientation(0);
            TextInputLayout textInputLayout = this.A0I;
            textInputLayout.addView(this.A09, -1, -2);
            FrameLayout frameLayout = new FrameLayout(context);
            this.A08 = frameLayout;
            this.A09.addView(frameLayout, -1, new FrameLayout.LayoutParams(-2, -2));
            this.A09.addView(new View(context) { // from class: X.0ly
                @Override // android.view.View
                public void draw(Canvas canvas) {
                }

                {
                    if (getVisibility() == 0) {
                        setVisibility(4);
                    }
                }

                @Override // android.view.View
                public void onMeasure(int i2, int i3) {
                    int suggestedMinimumWidth = getSuggestedMinimumWidth();
                    int mode = View.MeasureSpec.getMode(i2);
                    int size = View.MeasureSpec.getSize(i2);
                    if (mode == Integer.MIN_VALUE) {
                        suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
                    } else if (mode == 1073741824) {
                        suggestedMinimumWidth = size;
                    }
                    int suggestedMinimumHeight = getSuggestedMinimumHeight();
                    int mode2 = View.MeasureSpec.getMode(i3);
                    int size2 = View.MeasureSpec.getSize(i3);
                    if (mode2 == Integer.MIN_VALUE) {
                        suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
                    } else if (mode2 == 1073741824) {
                        suggestedMinimumHeight = size2;
                    }
                    setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
                }
            }, new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (textInputLayout.A0L != null) {
                A01();
            }
        }
        if (i != 0 && i != 1) {
            this.A09.addView(textView, i);
        } else {
            this.A08.setVisibility(0);
            this.A08.addView(textView);
            this.A02++;
        }
        this.A09.setVisibility(0);
        this.A05++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0009, code lost:
        if (r7 == 1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(android.widget.TextView r6, int r7) {
        /*
            r5 = this;
            android.widget.LinearLayout r4 = r5.A09
            if (r4 != 0) goto L5
            return
        L5:
            r3 = 1
            if (r7 == 0) goto Lb
            r0 = 0
            if (r7 != r3) goto Lc
        Lb:
            r0 = 1
        Lc:
            r2 = 8
            if (r0 == 0) goto L30
            android.widget.FrameLayout r1 = r5.A08
            if (r1 == 0) goto L30
            int r0 = r5.A02
            int r0 = r0 - r3
            r5.A02 = r0
            if (r0 != 0) goto L1e
            r1.setVisibility(r2)
        L1e:
            android.widget.FrameLayout r0 = r5.A08
            r0.removeView(r6)
        L23:
            int r1 = r5.A05
            int r1 = r1 - r3
            r5.A05 = r1
            android.widget.LinearLayout r0 = r5.A09
            if (r1 != 0) goto L2f
            r0.setVisibility(r2)
        L2f:
            return
        L30:
            r4.removeView(r6)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BV.A05(android.widget.TextView, int):void");
    }

    public final void A06(List list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, i3 == i ? 1.0f : 0.0f);
            ofFloat.setDuration(167L);
            ofFloat.setInterpolator(C08580bj.A03);
            list.add(ofFloat);
            if (i3 == i) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.A0G, 0.0f);
                ofFloat2.setDuration(217L);
                ofFloat2.setInterpolator(C08580bj.A04);
                list.add(ofFloat2);
            }
        }
    }

    public boolean A07() {
        return (this.A01 != 1 || this.A0A == null || TextUtils.isEmpty(this.A0C)) ? false : true;
    }

    public final boolean A08(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.A0I;
        if (C0AT.A0h(textInputLayout) && textInputLayout.isEnabled()) {
            return (this.A01 == this.A00 && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }
}
