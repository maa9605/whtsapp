package com.whatsapp.search.views.itemviews;

import X.AbstractC51932Yx;
import X.C000200d;
import X.C002301c;
import X.C02160Ac;
import X.C02180Ae;
import X.C08540bf;
import X.C0AT;
import X.C0LX;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaButton;

/* loaded from: classes2.dex */
public class VoiceNoteProfileAvatarView extends AbstractC51932Yx {
    public int A00;
    public ColorStateList A01;
    public ColorStateList A02;
    public ImageView A03;
    public ImageView A04;
    public ImageView A05;
    public WaButton A06;
    public C002301c A07;

    public VoiceNoteProfileAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0;
        FrameLayout.inflate(context, R.layout.voice_note_profile_avatar, this);
        this.A05 = (ImageView) C0AT.A0D(this, R.id.picture);
        this.A03 = (ImageView) C0AT.A0D(this, R.id.picture_in_group);
        this.A04 = (ImageView) C0AT.A0D(this, R.id.mic_overlay);
        this.A06 = (WaButton) C0AT.A0D(this, R.id.fast_playback_overlay);
        this.A02 = C02160Ac.A02(context, R.color.voiceNoteOutgoingPlaybackTint);
        this.A01 = C02160Ac.A02(context, R.color.voiceNoteIncomingPlaybackTint);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08540bf.A2o);
            View A0D = C0AT.A0D(this, R.id.picture_frame);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(7, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
            int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            int dimensionPixelSize7 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            obtainStyledAttributes.recycle();
            C0LX.A08(this.A07, A0D, dimensionPixelSize, dimensionPixelSize2, A0D.getPaddingRight(), dimensionPixelSize3);
            C0LX.A08(this.A07, this.A05, dimensionPixelSize4, dimensionPixelSize4, dimensionPixelSize4, dimensionPixelSize4);
            if (dimensionPixelSize5 != Integer.MIN_VALUE) {
                ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
                layoutParams.height = dimensionPixelSize5;
                layoutParams.width = dimensionPixelSize5;
                this.A05.setLayoutParams(layoutParams);
            }
            this.A04.setBackground(drawable);
            C0AT.A0Z(this.A04, colorStateList);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A04.getLayoutParams();
            C0LX.A07(this.A07, this.A04, dimensionPixelSize6, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, dimensionPixelSize7);
        }
    }

    public static final void A00(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(250L);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        view.startAnimation(animationSet);
    }

    public static final void A01(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(250L);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        view.startAnimation(animationSet);
    }

    public void A02(int i, boolean z, boolean z2, boolean z3) {
        ImageView imageView;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int i2;
        int i3;
        boolean z4 = i != this.A00;
        this.A00 = i;
        if (!z2 && z3) {
            imageView = this.A03;
        } else {
            imageView = this.A05;
        }
        if (i != 0) {
            if (i == 1) {
                this.A06.setText(getContext().getString(R.string.fast_playback_int_x_ptt, 1));
                A03(z2);
            } else if (i == 2) {
                this.A06.setText(getContext().getString(R.string.fast_playback_x_ptt, Float.valueOf(1.5f)));
                A03(z2);
            } else if (i == 3) {
                this.A06.setText(getContext().getString(R.string.fast_playback_int_x_ptt, 2));
                A03(z2);
            } else {
                throw new IllegalStateException(C000200d.A0D("setFastPlaybackViewState: Did not handle FastPlaybackViewState: ", i));
            }
        }
        this.A05.setVisibility(8);
        this.A03.setVisibility(8);
        if (i == 0) {
            this.A06.setVisibility(8);
            this.A04.setVisibility(0);
            imageView.setVisibility(0);
            setClickable(false);
        } else {
            this.A06.setVisibility(0);
            this.A04.setVisibility(4);
            imageView.setVisibility(4);
            setClickable(true);
            if (!z3) {
                if (!z2) {
                    dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.voice_note_fast_playback_from_you_no_group_right_margin);
                    dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.voice_note_fast_playback_bottom_margin);
                    i2 = 0;
                    i3 = 0;
                    C0LX.A07(this.A07, this.A06, i2, i3, dimensionPixelSize, dimensionPixelSize2);
                }
                i2 = getResources().getDimensionPixelSize(R.dimen.voice_note_fast_playback_left_margin);
                dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.voice_note_fast_playback_bottom_margin);
                i3 = 0;
                dimensionPixelSize = 0;
                C0LX.A07(this.A07, this.A06, i2, i3, dimensionPixelSize, dimensionPixelSize2);
            } else {
                if (!z2) {
                    i3 = getResources().getDimensionPixelSize(R.dimen.voice_note_fast_playback_top_margin);
                    dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.voice_note_fast_playback_from_you_group_right_margin);
                    i2 = 0;
                    dimensionPixelSize2 = 0;
                    C0LX.A07(this.A07, this.A06, i2, i3, dimensionPixelSize, dimensionPixelSize2);
                }
                i2 = getResources().getDimensionPixelSize(R.dimen.voice_note_fast_playback_left_margin);
                dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.voice_note_fast_playback_bottom_margin);
                i3 = 0;
                dimensionPixelSize = 0;
                C0LX.A07(this.A07, this.A06, i2, i3, dimensionPixelSize, dimensionPixelSize2);
            }
        }
        if (z && z4) {
            if (i == 0) {
                A01(this.A06);
                A00(this.A04);
                A00(imageView);
                return;
            }
            A00(this.A06);
            A01(this.A04);
            A01(imageView);
        }
    }

    public final void A03(boolean z) {
        if (z) {
            C0AT.A0Z(this.A06, this.A02);
        } else {
            C0AT.A0Z(this.A06, this.A01);
        }
    }

    public int getFastPlaybackViewState() {
        return this.A00;
    }

    public ImageView getGroupProfileImageView() {
        return this.A03;
    }

    public ImageView getProfileImageView() {
        return this.A05;
    }

    public void setMicColorTint(int i) {
        this.A04.setImageDrawable(C02180Ae.A0O(getContext(), R.drawable.mic_played, i));
    }

    public void setOnFastPlaybackButtonClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
        this.A06.setOnClickListener(onClickListener);
        if (this.A06.getVisibility() == 8 || this.A06.getVisibility() == 4) {
            setClickable(false);
        }
    }

    public void setupMicBackgroudnColor(int i) {
        Context context = getContext();
        Drawable A03 = C02160Ac.A03(context, R.drawable.mic_background_incoming);
        if (A03 != null) {
            Drawable mutate = A03.mutate();
            ColorStateList A02 = C02160Ac.A02(context, i);
            this.A04.setBackground(mutate);
            C0AT.A0Z(this.A04, A02);
            return;
        }
        throw null;
    }
}
