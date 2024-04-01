package com.whatsapp.voipcalling;

import X.AbstractC52032Zq;
import X.C002301c;
import X.C02160Ac;
import X.C0AT;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.jid.UserJid;

/* loaded from: classes2.dex */
public class VideoCallParticipantView extends AbstractC52032Zq {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public GradientDrawable A07;
    public GradientDrawable A08;
    public GradientDrawable A09;
    public GradientDrawable A0A;
    public GradientDrawable A0B;
    public SurfaceView A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public FrameLayout A0I;
    public ImageView A0J;
    public ImageView A0K;
    public TextView A0L;
    public WaImageButton A0M;
    public C002301c A0N;
    public UserJid A0O;
    public static final int[] A0Q = {EditorInfoCompat.IME_FLAG_FORCE_ASCII, 0, 0};
    public static final int[] A0R = {EditorInfoCompat.IME_FLAG_FORCE_ASCII, 0};
    public static final int A0P = ViewConfiguration.getLongPressTimeout();

    public VideoCallParticipantView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setFocusable(false);
        if (Build.VERSION.SDK_INT > 19) {
            setImportantForAccessibility(4);
        }
        if (this.A0N != null) {
            LayoutInflater.from(context).inflate(R.layout.video_call_participant_view, this);
        }
        this.A0C = (SurfaceView) findViewById(R.id.surface_view);
        this.A0G = findViewById(R.id.status_layout);
        this.A0L = (TextView) findViewById(R.id.status);
        this.A0M = (WaImageButton) findViewById(R.id.video_call_status_button);
        this.A0F = findViewById(R.id.mute_image);
        this.A0J = (ImageView) findViewById(R.id.frame_overlay);
        this.A0K = (ImageView) findViewById(R.id.video_call_participant_photo);
        this.A0I = (FrameLayout) findViewById(R.id.mute_layout);
        this.A0D = findViewById(R.id.camera_off_image);
        this.A0H = findViewById(R.id.video_status_container);
        this.A0E = C0AT.A0D(this, R.id.dark_overlay);
        this.A06 = C02160Ac.A00(getContext(), R.color.call_video_overlay);
        this.A05 = C02160Ac.A00(getContext(), 17170445);
        this.A01 = getResources().getDimensionPixelSize(R.dimen.call_grid_mode_mute_icon_margin);
        this.A02 = getResources().getDimensionPixelSize(R.dimen.call_mute_icon_layout_size);
        this.A04 = getResources().getDimensionPixelSize(R.dimen.call_pip_mode_icon_margin);
        this.A03 = 0;
    }

    public final GradientDrawable A00(GradientDrawable.Orientation orientation) {
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, this.A03 == 1 ? A0R : A0Q);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setShape(0);
        return gradientDrawable;
    }

    public void A01() {
        this.A0H.setVisibility(8);
    }

    public void A02() {
        switch (this.A03) {
            case 1:
                A05(81, 0, 0, 0, this.A04);
                A04(81, -1, -2);
                return;
            case 2:
                int i = this.A01;
                A05(83, i, 0, 0, i);
                int i2 = this.A02;
                A04(83, i2, i2);
                return;
            case 3:
                int i3 = this.A01;
                A05(85, 0, 0, i3, i3);
                int i4 = this.A02;
                A04(85, i4, i4);
                return;
            case 4:
                int i5 = this.A01;
                A05(53, 0, i5, i5, 0);
                int i6 = this.A02;
                A04(53, i6, i6);
                return;
            case 5:
                int i7 = this.A01;
                A05(51, i7, i7, 0, 0);
                int i8 = this.A02;
                A04(51, i8, i8);
                return;
            case 6:
                A05(49, 0, this.A01, 0, 0);
                int i9 = this.A02;
                A04(49, i9, i9);
                return;
            case 7:
                A05(81, 0, 0, 0, this.A01);
                A04(81, -1, -1);
                return;
            default:
                return;
        }
    }

    public void A03(final int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(true);
            setOutlineProvider(new ViewOutlineProvider() { // from class: X.3dG
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i);
                }
            });
        }
    }

    public final void A04(int i, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A0I.getLayoutParams();
        layoutParams.gravity = i;
        layoutParams.width = i2;
        layoutParams.height = i3;
        this.A0I.setLayoutParams(layoutParams);
        this.A0I.setBackground(getMuteIconGradient());
    }

    public final void A05(int i, int i2, int i3, int i4, int i5) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A0F.getLayoutParams();
        layoutParams.gravity = i;
        layoutParams.leftMargin = i2;
        layoutParams.topMargin = i3;
        layoutParams.rightMargin = i4;
        layoutParams.bottomMargin = i5;
        this.A0F.setLayoutParams(layoutParams);
    }

    public void A06(CharSequence charSequence, boolean z) {
        this.A0H.setVisibility(0);
        this.A0L.setText(charSequence);
        this.A0L.setVisibility(0);
        this.A0M.setVisibility(z ? 0 : 8);
        int dimensionPixelSize = z ? 0 : getResources().getDimensionPixelSize(R.dimen.call_cancel_button_touch_padding);
        boolean A0N = this.A0N.A0N();
        TextView textView = this.A0L;
        int paddingLeft = A0N ? dimensionPixelSize : textView.getPaddingLeft();
        int paddingTop = this.A0L.getPaddingTop();
        if (A0N) {
            dimensionPixelSize = this.A0L.getPaddingRight();
        }
        textView.setPadding(paddingLeft, paddingTop, dimensionPixelSize, this.A0L.getPaddingBottom());
    }

    public void A07(boolean z) {
        this.A0G.setBackgroundColor(z ? this.A06 : this.A05);
    }

    public void A08(boolean z, boolean z2) {
        this.A0D.setVisibility(z2 ? 0 : 8);
        this.A0I.setVisibility(z ? 0 : 8);
    }

    public boolean A09() {
        int i = this.A03;
        return i == 5 || i == 4 || i == 2 || i == 3 || i == 6;
    }

    public boolean A0A() {
        int i = this.A03;
        return i == 2 || i == 3;
    }

    public WaImageButton getCancelButton() {
        return this.A0M;
    }

    public ImageView getFrameOverlay() {
        return this.A0J;
    }

    public UserJid getJid() {
        return this.A0O;
    }

    @Override // android.view.ViewGroup
    public int getLayoutMode() {
        return this.A03;
    }

    private Drawable getMuteIconGradient() {
        int i = this.A03;
        if (i == 1) {
            GradientDrawable gradientDrawable = this.A09;
            if (gradientDrawable == null) {
                GradientDrawable A00 = A00(GradientDrawable.Orientation.BOTTOM_TOP);
                this.A09 = A00;
                return A00;
            }
            return gradientDrawable;
        } else if (i == 2) {
            GradientDrawable gradientDrawable2 = this.A07;
            if (gradientDrawable2 == null) {
                GradientDrawable A002 = A00(GradientDrawable.Orientation.BL_TR);
                this.A07 = A002;
                return A002;
            }
            return gradientDrawable2;
        } else if (i == 3) {
            if (this.A07 == null) {
                this.A08 = A00(GradientDrawable.Orientation.BR_TL);
            }
            return this.A08;
        } else if (i == 4) {
            GradientDrawable gradientDrawable3 = this.A0B;
            if (gradientDrawable3 == null) {
                GradientDrawable A003 = A00(GradientDrawable.Orientation.TR_BL);
                this.A0B = A003;
                return A003;
            }
            return gradientDrawable3;
        } else if (i != 5) {
            return null;
        } else {
            GradientDrawable gradientDrawable4 = this.A0A;
            if (gradientDrawable4 == null) {
                GradientDrawable A004 = A00(GradientDrawable.Orientation.TL_BR);
                this.A0A = A004;
                return A004;
            }
            return gradientDrawable4;
        }
    }

    public ImageView getPhotoImageView() {
        return this.A0K;
    }

    public SurfaceView getSurfaceView() {
        return this.A0C;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = this.A00;
        if (f > 0.0f && (i3 = (int) (size * f)) <= size2) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.addRule(13, -1);
                setLayoutParams(layoutParams2);
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return true;
    }

    public void setAspectRatio(float f) {
        this.A00 = f;
    }

    public void setJid(UserJid userJid) {
        this.A0O = userJid;
    }

    @Override // android.view.ViewGroup
    public void setLayoutMode(int i) {
        this.A03 = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.A0C.setVisibility(i);
    }
}
