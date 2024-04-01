package com.whatsapp.voipcalling;

import X.AbstractC005302j;
import X.AbstractC51992Zi;
import X.AnonymousClass029;
import X.C002301c;
import X.C018708s;
import X.C01B;
import X.C05W;
import X.C06030Rg;
import X.C06C;
import X.C0C8;
import X.C2AR;
import X.C2Zf;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.voipcalling.Voip;
import java.util.List;

/* loaded from: classes2.dex */
public class CallDetailsLayout extends AbstractC51992Zi {
    public int A00;
    public int A01;
    public Typeface A02;
    public Typeface A03;
    public FrameLayout A04;
    public TextView A05;
    public TextView A06;
    public C01B A07;
    public C06030Rg A08;
    public C05W A09;
    public C018708s A0A;
    public C002301c A0B;
    public C0C8 A0C;
    public C2AR A0D;
    public PeerAvatarLayout A0E;

    public CallDetailsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.call_details_layout, (ViewGroup) this, true);
        this.A06 = (TextView) findViewById(R.id.name);
        this.A08 = new C06030Rg(this, (int) R.id.name, this.A0A, this.A0D);
        this.A05 = (TextView) findViewById(R.id.call_status);
        this.A0E = (PeerAvatarLayout) findViewById(R.id.peer_avatar_layout);
        this.A04 = (FrameLayout) findViewById(R.id.peer_avatar_container);
        this.A01 = getResources().getColor(R.color.primary_voip);
        this.A03 = Typeface.create("sans-serif", 0);
        this.A02 = Typeface.create("sans-serif-light", 0);
    }

    public static final ObjectAnimator A00(View view, String str, float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, f);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(125L);
        return ofFloat;
    }

    public final String A01(List list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            C06C A0A = this.A09.A0A((AbstractC005302j) list.get(i));
            if (i2 >= 1) {
                sb.append(", ");
            }
            sb.append(this.A0A.A04(A0A));
            i++;
            i2++;
        }
        return sb.toString();
    }

    public final void A02(Voip.CallState callState, boolean z, boolean z2) {
        int i;
        boolean z3 = true;
        boolean z4 = z2 || Voip.A0B(callState) || this.A00 == 1 || (callState == Voip.CallState.CALLING && z);
        boolean A1O = AnonymousClass029.A1O(this.A07);
        if (A1O) {
            if (((!Voip.A0B(callState) && callState != Voip.CallState.CALLING && callState != Voip.CallState.PRE_ACCEPT_RECEIVED) || z) && this.A00 != 1) {
                z3 = false;
            }
            z4 = z3;
        }
        this.A04.setVisibility(z4 ? 0 : 8);
        Resources resources = getResources();
        if (A1O && z) {
            i = R.dimen.joinable_call_top_bar_height;
        } else {
            i = R.dimen.call_voice_top_bar_height;
            if (z2) {
                i = R.dimen.call_video_top_bar_height;
            }
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        if (z4) {
            dimensionPixelSize = (getResources().getDimensionPixelSize(R.dimen.call_avatar_top_bar_margin) + dimensionPixelSize) - getResources().getDimensionPixelSize(R.dimen.call_avatar_view_elevation);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        if (layoutParams.topMargin != dimensionPixelSize) {
            layoutParams.topMargin = dimensionPixelSize;
            setLayoutParams(layoutParams);
        }
    }

    public void A03(String str) {
        this.A05.setVisibility(str == null ? 8 : 0);
        this.A05.setText(str);
    }

    @Override // android.view.View
    public void clearAnimation() {
        this.A0E.clearAnimation();
        this.A0E.setTranslationY(0.0f);
        this.A05.clearAnimation();
        this.A05.setTranslationY(0.0f);
        this.A06.clearAnimation();
        this.A06.setTranslationY(0.0f);
        for (int i = 0; i < this.A0E.getChildCount(); i++) {
            C2Zf c2Zf = (C2Zf) this.A0E.getChildAt(i);
            c2Zf.A03.clearAnimation();
            c2Zf.A03.setScaleX(1.0f);
            c2Zf.A03.setScaleY(1.0f);
        }
    }

    public String getNameViewContentDescription() {
        if (this.A06.getContentDescription() != null) {
            return this.A06.getContentDescription().toString();
        }
        return null;
    }
}
