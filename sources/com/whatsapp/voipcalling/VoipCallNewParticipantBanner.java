package com.whatsapp.voipcalling;

import X.C018708s;
import X.C02160Ac;
import X.C02E;
import X.C05W;
import X.C06030Rg;
import X.C06C;
import X.C0AT;
import X.C0L5;
import X.C0Zn;
import X.C2AR;
import X.C2Zz;
import X.C84963ud;
import X.InterfaceC52362ab;
import X.InterfaceC74693dg;
import X.InterfaceC74703dh;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipCallNewParticipantBanner;

/* loaded from: classes2.dex */
public class VoipCallNewParticipantBanner extends C2Zz {
    public int A00;
    public int A01;
    public int A02;
    public C05W A03;
    public C018708s A04;
    public C0L5 A05;
    public C02E A06;
    public C06C A07;
    public C2AR A08;
    public InterfaceC74703dh A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C;
    public final ImageView A0D;
    public final C06030Rg A0E;
    public final InterfaceC52362ab A0F;
    public final C0Zn A0G;
    public final VoipCallControlRingingDotsIndicator A0H;

    public VoipCallNewParticipantBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0F = new C84963ud();
        this.A0C = new Handler(new Handler.Callback() { // from class: X.3cl
            {
                VoipCallNewParticipantBanner.this = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                VoipCallNewParticipantBanner voipCallNewParticipantBanner = VoipCallNewParticipantBanner.this;
                if (message.what == 0) {
                    voipCallNewParticipantBanner.A00();
                    return true;
                }
                return true;
            }
        });
        LayoutInflater.from(context).inflate(R.layout.voip_call_control_sheet_participant_row, (ViewGroup) this, true);
        setVisibility(8);
        this.A0E = new C06030Rg(this, (int) R.id.name, this.A04, this.A08);
        C0AT.A0D(this, R.id.subtitle).setVisibility(0);
        this.A0D = (ImageView) C0AT.A0D(this, R.id.avatar);
        this.A0H = (VoipCallControlRingingDotsIndicator) C0AT.A0D(this, R.id.ringing_dots);
        this.A0E.A01.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Medium.ttf"), 0);
        C06030Rg c06030Rg = this.A0E;
        c06030Rg.A01.setTextColor(C02160Ac.A00(context, R.color.paletteOnSurface));
        this.A0G = this.A05.A04(context);
        A02();
        C0AT.A0V(this, 4);
    }

    public void A00() {
        this.A0C.removeMessages(0);
        if (getVisibility() != 8) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", 0.0f, getResources().getDimension(R.dimen.call_new_participant_banner_bottom_margin));
            ofFloat.setDuration(600L);
            ofFloat.setInterpolator(new DecelerateInterpolator(2.0f));
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: X.3df
                {
                    VoipCallNewParticipantBanner.this = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    VoipCallNewParticipantBanner voipCallNewParticipantBanner = VoipCallNewParticipantBanner.this;
                    voipCallNewParticipantBanner.setVisibility(8);
                    voipCallNewParticipantBanner.setTranslationY(0.0f);
                    voipCallNewParticipantBanner.A0A = false;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    InterfaceC74703dh interfaceC74703dh = VoipCallNewParticipantBanner.this.A09;
                    if (interfaceC74703dh != null) {
                        interfaceC74703dh.AHE(false);
                    }
                }
            });
            this.A0A = true;
            ofFloat.start();
        }
        this.A0H.clearAnimation();
        this.A07 = null;
    }

    public void A01() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        Log.i("VoipCallNewParticipantBanner/resetBannerYPosition");
        marginLayoutParams.bottomMargin = (int) getResources().getDimension(R.dimen.call_new_participant_banner_bottom_margin);
        setLayoutParams(marginLayoutParams);
    }

    public final void A02() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        Context context = getContext();
        boolean z = this.A0B;
        int i = R.color.primary_voip;
        if (z) {
            i = R.color.paletteSurface_dark;
        }
        gradientDrawable.setColor(C02160Ac.A00(context, i));
        gradientDrawable.setCornerRadius(getResources().getDimension(R.dimen.call_new_participant_banner_corner_radius));
        setBackground(gradientDrawable);
    }

    public int getBannerHeight() {
        if (this.A02 == 0) {
            this.A02 = ((((int) getResources().getDimension(R.dimen.horizontal_padding)) << 1) + ((int) getResources().getDimension(R.dimen.contact_picker_row_height))) - ((int) getResources().getDimension(R.dimen.call_pip_min_margin));
        }
        if (getVisibility() != 0 || this.A0A) {
            return 0;
        }
        return this.A02;
    }

    public UserJid getParticipantJid() {
        C06C c06c = this.A07;
        if (c06c != null) {
            return UserJid.of(c06c.A02());
        }
        return null;
    }

    public void setOnBannerClickListener(InterfaceC74693dg interfaceC74693dg) {
        setOnClickListener(new ViewOnClickEBaseShape1S0200000_I0_1(this, interfaceC74693dg, 7));
    }

    public void setVisibilityChangeAnimationListener(InterfaceC74703dh interfaceC74703dh) {
        this.A09 = interfaceC74703dh;
    }
}
