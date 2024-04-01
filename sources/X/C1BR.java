package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar$Tab;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.material.tabs.TabLayout;
import com.google.android.search.verification.client.R;

/* renamed from: X.1BR */
/* loaded from: classes.dex */
public class C1BR extends LinearLayout {
    public int A00;
    public Drawable A01;
    public ImageView A02;
    public TextView A03;
    public C1BQ A04;
    public final /* synthetic */ TabLayout A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1BR(TabLayout tabLayout, Context context) {
        super(context);
        C13140kf c13140kf;
        this.A05 = tabLayout;
        this.A00 = 2;
        A01(context);
        int i = tabLayout.A0A;
        int i2 = tabLayout.A0B;
        int i3 = tabLayout.A09;
        int i4 = tabLayout.A08;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 17) {
            setPaddingRelative(i, i2, i3, i4);
        } else {
            setPadding(i, i2, i3, i4);
        }
        setGravity(17);
        setOrientation(!tabLayout.A0R ? 1 : 0);
        setClickable(true);
        Context context2 = getContext();
        if (i5 >= 24) {
            c13140kf = new C13140kf(PointerIcon.getSystemIcon(context2, 1002));
        } else {
            c13140kf = new C13140kf(null);
        }
        if (i5 >= 24) {
            setPointerIcon((PointerIcon) c13140kf.A00);
        }
    }

    public final void A00() {
        C1BQ c1bq = this.A04;
        boolean z = false;
        if (this.A02 == null) {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
            addView(imageView, 0);
            this.A02 = imageView;
        }
        if (this.A03 == null) {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
            addView(textView);
            this.A03 = textView;
            this.A00 = textView.getMaxLines();
        }
        TextView textView2 = this.A03;
        TabLayout tabLayout = this.A05;
        C07O.A0o(textView2, tabLayout.A0C);
        ColorStateList colorStateList = tabLayout.A0G;
        if (colorStateList != null) {
            this.A03.setTextColor(colorStateList);
        }
        A02(this.A03, this.A02);
        if (c1bq != null) {
            if (!TextUtils.isEmpty(c1bq.A03)) {
                setContentDescription(c1bq.A03);
            }
            TabLayout tabLayout2 = c1bq.A02;
            if (tabLayout2 != null) {
                if (tabLayout2.getSelectedTabPosition() == c1bq.A00) {
                    z = true;
                }
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }
        setSelected(z);
    }

    public final void A01(Context context) {
        TabLayout tabLayout = this.A05;
        int i = tabLayout.A0Y;
        if (i != 0) {
            Drawable A01 = C09L.A01(context, i);
            this.A01 = A01;
            if (A01 != null && A01.isStateful()) {
                this.A01.setState(getDrawableState());
            }
        } else {
            this.A01 = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        RippleDrawable rippleDrawable = gradientDrawable;
        if (tabLayout.A0F != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList A012 = C08740bz.A01(tabLayout.A0F);
            if (Build.VERSION.SDK_INT >= 21) {
                boolean z = tabLayout.A0U;
                GradientDrawable gradientDrawable3 = gradientDrawable;
                if (z) {
                    gradientDrawable3 = null;
                }
                rippleDrawable = new RippleDrawable(A012, gradientDrawable3, z ? null : gradientDrawable2);
            } else {
                Drawable A0I = C07O.A0I(gradientDrawable2);
                C07O.A0Z(A0I, A012);
                rippleDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, A0I});
            }
        }
        setBackground(rippleDrawable);
        tabLayout.invalidate();
    }

    public final void A02(TextView textView, ImageView imageView) {
        CharSequence charSequence;
        CharSequence charSequence2;
        int i;
        C1BQ c1bq = this.A04;
        if (c1bq != null) {
            charSequence = c1bq.A04;
        } else {
            charSequence = null;
        }
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean z = !TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (z) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                setVisibility(0);
            } else {
                textView.setVisibility(8);
                textView.setText((CharSequence) null);
            }
        }
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            if (z && imageView.getVisibility() == 0) {
                i = this.A05.A01(8);
            } else {
                i = 0;
            }
            if (this.A05.A0R) {
                if (i != C07O.A09(marginLayoutParams)) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        marginLayoutParams.setMarginEnd(i);
                    } else {
                        marginLayoutParams.rightMargin = i;
                    }
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (i != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = i;
                if (Build.VERSION.SDK_INT >= 17) {
                    marginLayoutParams.setMarginEnd(0);
                } else {
                    marginLayoutParams.rightMargin = 0;
                }
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        C1BQ c1bq2 = this.A04;
        if (c1bq2 != null) {
            charSequence2 = c1bq2.A03;
        } else {
            charSequence2 = null;
        }
        C07O.A0c(this, z ? null : charSequence2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A01;
        if (drawable == null || !drawable.isStateful() || (!false && !this.A01.setState(drawableState))) {
            return;
        }
        invalidate();
        this.A05.invalidate();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ActionBar$Tab.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ActionBar$Tab.class.getName());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.A05;
        int i3 = tabLayout.A07;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        super.onMeasure(i, i2);
        if (this.A03 != null) {
            float f = tabLayout.A01;
            int i4 = this.A00;
            ImageView imageView = this.A02;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.A03;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.A00;
                }
            } else {
                i4 = 1;
            }
            float textSize = this.A03.getTextSize();
            int lineCount = this.A03.getLineCount();
            int maxLines = this.A03.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i4 != maxLines)) {
                if (tabLayout.A03 == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.A03.getLayout();
                    if (layout != null) {
                        if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.A03.setTextSize(0, f);
                this.A03.setMaxLines(i4);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean performClick = super.performClick();
        if (this.A04 != null) {
            if (!performClick) {
                playSoundEffect(0);
            }
            this.A04.A00();
            return true;
        }
        return performClick;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.A03;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.A02;
        if (imageView != null) {
            imageView.setSelected(z);
        }
    }
}
