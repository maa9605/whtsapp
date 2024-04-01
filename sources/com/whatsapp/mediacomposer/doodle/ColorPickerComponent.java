package com.whatsapp.mediacomposer.doodle;

import X.AbstractC48782Gr;
import X.C002301c;
import X.C003701t;
import X.C07O;
import X.C0AT;
import X.C3H1;
import X.C3L0;
import X.C48792Gs;
import X.InterfaceC48812Gv;
import X.InterfaceC63432zm;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class ColorPickerComponent extends AbstractC48782Gr {
    public C002301c A00;
    public C003701t A01;
    public C48792Gs A02;
    public final View A03;
    public final View A04;
    public final ViewGroup A05;
    public final ColorPickerView A06;
    public final boolean A07;

    public ColorPickerComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        boolean A0C = this.A01.A0C(279);
        this.A07 = A0C;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(A0C ? R.layout.color_picker_wave_one : R.layout.color_picker, (ViewGroup) this, true);
        this.A05 = viewGroup;
        this.A06 = (ColorPickerView) C0AT.A0D(viewGroup, R.id.color_picker);
        this.A03 = C0AT.A0D(this.A05, R.id.color_picker_container);
        this.A04 = this.A07 ? null : C0AT.A0D(this.A05, R.id.extra_view);
        A02(getResources().getConfiguration().orientation);
    }

    public void A00() {
        ColorPickerView colorPickerView = this.A06;
        if (!(colorPickerView.getVisibility() == 0)) {
            colorPickerView.setVisibility(0);
            if (this.A07) {
                A01(R.anim.color_picker_animate_in);
            } else {
                colorPickerView.clearAnimation();
                TranslateAnimation translateAnimation = new TranslateAnimation(1, this.A00.A0M() ? 1.0f : -1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
                translateAnimation.setDuration(180L);
                translateAnimation.setInterpolator(new DecelerateInterpolator());
                colorPickerView.startAnimation(translateAnimation);
            }
            C48792Gs c48792Gs = this.A02;
            if (c48792Gs != null && (c48792Gs instanceof C3L0)) {
                ((C3L0) c48792Gs).A00.A09.A06(true);
            }
        }
    }

    public final void A01(int i) {
        ColorPickerView colorPickerView = this.A06;
        colorPickerView.clearAnimation();
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), i);
        loadAnimation.setInterpolator(C07O.A0L(0.5f, 1.35f, 0.4f, 1.0f));
        colorPickerView.startAnimation(loadAnimation);
    }

    public final void A02(int i) {
        if (i == 2) {
            this.A03.setPadding(getPaddingLeft(), (int) getResources().getDimension(R.dimen.color_picker_top_padding), getPaddingRight(), (int) getResources().getDimension(R.dimen.color_picker_bottom_padding));
        } else {
            this.A03.setPadding(getPaddingLeft(), (int) getResources().getDimension(R.dimen.color_picker_top_padding), getPaddingRight(), 0);
        }
    }

    public void A03(InterfaceC48812Gv interfaceC48812Gv, C48792Gs c48792Gs, InterfaceC63432zm interfaceC63432zm) {
        this.A02 = c48792Gs;
        if (this.A07) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.height = (int) getResources().getDimension(R.dimen.color_picker_container_height);
            setLayoutParams(layoutParams);
        }
        if (interfaceC48812Gv != null) {
            ColorPickerView colorPickerView = this.A06;
            ((DoodleView) interfaceC48812Gv).A04(colorPickerView.A00, colorPickerView.A03);
        }
        this.A06.A0B = new C3H1(interfaceC48812Gv, interfaceC63432zm);
    }

    public void A04(boolean z) {
        ColorPickerView colorPickerView = this.A06;
        if (colorPickerView.getVisibility() == 0) {
            if (z) {
                if (this.A07) {
                    A01(R.anim.color_picker_animate_out);
                } else {
                    colorPickerView.clearAnimation();
                    TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, this.A00.A0M() ? 1.0f : -1.0f, 1, 0.0f, 1, 0.0f);
                    translateAnimation.setDuration(180L);
                    translateAnimation.setInterpolator(new AccelerateInterpolator());
                    colorPickerView.startAnimation(translateAnimation);
                }
            }
            colorPickerView.setVisibility(4);
            C48792Gs c48792Gs = this.A02;
            if (c48792Gs != null) {
                c48792Gs.A00();
            }
        }
    }

    public int getColorPickerHeight() {
        return this.A06.getHeight();
    }

    public float getMinSize() {
        return this.A06.A07;
    }

    public int getSelectedColor() {
        return this.A06.A03;
    }

    public float getSelectedStrokeSize() {
        return this.A06.A00;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A07) {
            A02(configuration.orientation);
        }
    }

    public void setColorAndInvalidate(int i) {
        this.A06.setColorAndInvalidate(i);
    }

    public void setColorPaletteAndInvalidate(int i) {
        this.A06.setColorPaletteAndInvalidate(i);
    }

    public void setMaxHeight(int i) {
        this.A06.A04 = i;
    }

    public void setSizeAndInvalidate(float f) {
        this.A06.setSizeAndInvalidate(f);
    }
}
