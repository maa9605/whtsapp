package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallPictureGrid;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3tn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C84473tn extends AbstractC04890Mh {
    public int A00;
    public C0Zn A01;
    public CallInfo A02;
    public C0MR A03;
    public final C05W A04;
    public final C002301c A05;
    public final /* synthetic */ CallPictureGrid A09;
    public final Integer A07 = 0;
    public final Integer A06 = 1;
    public final List A08 = new ArrayList();

    public C84473tn(CallPictureGrid callPictureGrid, C05W c05w, C002301c c002301c, int i) {
        this.A09 = callPictureGrid;
        this.A04 = c05w;
        this.A05 = c002301c;
        this.A00 = i;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A08.size();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        return new C84463tm(LayoutInflater.from(this.A09.getContext()).inflate(R.layout.audio_call_participant_view, viewGroup, false));
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        A08((C84463tm) c0ts, i, Collections.emptyList());
    }

    public final int A0G(int i) {
        int i2;
        if (A0C() == 0 || this.A00 == 0) {
            return 0;
        }
        int A0C = A0C();
        if (A0C >= 3) {
            int i3 = (A0C + 1) >> 1;
            if (A0C != 3 && (i2 = A0C % 2) != 0 && i % 2 >= i2) {
                i3--;
            }
            A0C = i3;
        }
        return (int) (this.A00 / A0C);
    }

    @Override // X.AbstractC04890Mh
    /* renamed from: A0H */
    public void A08(C84463tm c84463tm, int i, List list) {
        CallInfo callInfo;
        ImageView imageView;
        VoipActivityV2 voipActivityV2;
        String A1Z;
        int i2;
        AbstractC005302j abstractC005302j = (AbstractC005302j) this.A08.get(i);
        boolean z = false;
        if (list.isEmpty() || list.contains(this.A07)) {
            if (this.A03 != null && (callInfo = this.A02) != null) {
                C28241Qv c28241Qv = (C28241Qv) callInfo.participants.get(abstractC005302j);
                if (c28241Qv != null) {
                    c84463tm.A03.setVisibility(8);
                    CallInfo callInfo2 = this.A02;
                    if (!callInfo2.isGroupCall || ((A1Z = (voipActivityV2 = (VoipActivityV2) this.A03).A1Z(c28241Qv, callInfo2)) == null && (A1Z = voipActivityV2.A1a(c28241Qv, callInfo2, false)) == null)) {
                        c84463tm.A00.setVisibility(8);
                    } else {
                        c84463tm.A00.setVisibility(0);
                        c84463tm.A02.setText(A1Z);
                        if (this.A02.isGroupCall && c28241Qv.A00() && c28241Qv.A0A) {
                            c84463tm.A03.setVisibility(0);
                        }
                        if (!AnonymousClass029.A1O(this.A09.A00)) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c84463tm.A00.getLayoutParams();
                            if (A0C() <= 3 && i == A0C() - 1) {
                                i2 = A0G(i) / 5;
                            } else {
                                i2 = 0;
                            }
                            if (i2 != layoutParams.bottomMargin) {
                                layoutParams.bottomMargin = i2;
                                c84463tm.A00.setLayoutParams(layoutParams);
                            }
                        }
                    }
                    CallInfo callInfo3 = this.A02;
                    if (callInfo3.isGroupCall && callInfo3.callState == Voip.CallState.ACTIVE && c28241Qv.A00() && !c28241Qv.A0E) {
                        if (c84463tm.A01.getAnimation() == null && (imageView = c84463tm.A01) != null) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.9f, 0.5f);
                            alphaAnimation.setDuration(1500L);
                            alphaAnimation.setRepeatCount(-1);
                            alphaAnimation.setRepeatMode(2);
                            alphaAnimation.setStartOffset(0);
                            imageView.startAnimation(alphaAnimation);
                        }
                    } else {
                        c84463tm.A01.clearAnimation();
                    }
                    int dimensionPixelSize = c84463tm.A03.getVisibility() == 0 ? 0 : this.A09.getResources().getDimensionPixelSize(R.dimen.call_cancel_button_touch_padding);
                    boolean A0N = this.A05.A0N();
                    TextView textView = c84463tm.A02;
                    int paddingLeft = A0N ? dimensionPixelSize : textView.getPaddingLeft();
                    int paddingTop = c84463tm.A02.getPaddingTop();
                    if (A0N) {
                        dimensionPixelSize = c84463tm.A02.getPaddingRight();
                    }
                    textView.setPadding(paddingLeft, paddingTop, dimensionPixelSize, c84463tm.A02.getPaddingBottom());
                }
            } else {
                C000700j.A08(false, "getPeerParticipantStatusString is not set yet");
            }
        }
        if (list.isEmpty() || list.contains(this.A06)) {
            this.A01.A04(this.A04.A0A(abstractC005302j), c84463tm.A01, true, this.A09.A02);
        }
        if (list.isEmpty()) {
            View view = c84463tm.A0H;
            C28851Uc c28851Uc = (C28851Uc) view.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c28851Uc).height = A0G(i);
            int A0C = A0C();
            if (A0C <= 2 || (A0C == 3 && i == 2)) {
                z = true;
            }
            c28851Uc.A01 = z;
            view.setLayoutParams(c28851Uc);
            c84463tm.A03.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1(this, abstractC005302j, 20));
        }
    }
}
