package com.whatsapp.voipcalling;

import X.AbstractC52042Zs;
import X.C000200d;
import X.C000700j;
import X.C002301c;
import X.C0LX;
import X.C74463dJ;
import X.C74733dl;
import X.C84663u7;
import X.C84783uL;
import X.InterfaceC52052Zt;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoCallParticipantView;
import com.whatsapp.voipcalling.VideoCallParticipantViewLayout;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class VideoCallParticipantViewLayout extends AbstractC52042Zs implements InterfaceC52052Zt {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ValueAnimator A07;
    public Bitmap A08;
    public View.OnClickListener A09;
    public View.OnClickListener A0A;
    public View.OnClickListener A0B;
    public View.OnLongClickListener A0C;
    public View.OnTouchListener A0D;
    public View.OnTouchListener A0E;
    public C002301c A0F;
    public C84783uL A0G;
    public Boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final VideoCallParticipantView A0M;
    public final VideoCallParticipantView A0N;
    public final Map A0O;

    public VideoCallParticipantViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A0O = new HashMap();
        this.A0L = false;
        this.A03 = getResources().getDimensionPixelSize(R.dimen.call_pip_min_margin);
        this.A00 = 0.225f;
        this.A0J = true;
        this.A0K = true;
        VideoCallParticipantView videoCallParticipantView = new VideoCallParticipantView(context, null);
        this.A0M = videoCallParticipantView;
        videoCallParticipantView.setVisibility(8);
        addView(this.A0M, new ViewGroup.MarginLayoutParams(-1, -1));
        VideoCallParticipantView videoCallParticipantView2 = new VideoCallParticipantView(context, null);
        this.A0N = videoCallParticipantView2;
        videoCallParticipantView2.setVisibility(8);
        this.A0N.A0C.setZOrderMediaOverlay(true);
        addView(this.A0N, new ViewGroup.MarginLayoutParams(-1, -1));
        this.A01 = 0;
        this.A0I = !C74733dl.A00;
    }

    public ViewGroup.MarginLayoutParams A00(Point point) {
        Point point2;
        int i;
        int i2;
        if (getWidth() != 0 && getHeight() != 0 && point != null && point.x != 0 && point.y != 0) {
            int width = getWidth();
            int height = getHeight();
            int i3 = point.x;
            int i4 = point.y;
            int min = Math.min(i3, i4);
            int max = Math.max(i3, i4);
            int min2 = Math.min(width, height);
            if (i3 < i4) {
                width = height;
            }
            float f = min;
            int min3 = (int) (min2 * Math.min(this.A00, ((width * 0.5f) * f) / (max * min2)));
            int i5 = (int) (min3 / (f / max));
            if (i3 < i4) {
                point2 = new Point(min3, i5);
            } else {
                point2 = new Point(i5, min3);
            }
            C74463dJ A02 = A02(point2.x, point2.y);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(point2.x, point2.y);
            boolean z = this.A0K;
            if (z) {
                i = A02.A00;
            } else {
                i = A02.A02;
            }
            marginLayoutParams.leftMargin = i;
            if (z) {
                i2 = A02.A02;
            } else {
                i2 = A02.A00;
            }
            marginLayoutParams.rightMargin = i2;
            marginLayoutParams.topMargin = this.A0J ? A02.A01 : A02.A03;
            marginLayoutParams.bottomMargin = 0;
            return marginLayoutParams;
        }
        Log.i("voip/VideoCallParticipantViewLayout/calculatePipLayoutParamsForVideo cancelled");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000c, code lost:
        if (r4 >= r6) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.whatsapp.voipcalling.VideoCallParticipantView A01(int r8) {
        /*
            r7 = this;
            int r6 = r7.getChildCount()
            int r5 = r7.A01
            int r4 = r6 - r5
            int r4 = r4 + r8
            if (r4 < 0) goto Le
            r3 = 1
            if (r4 < r6) goto Lf
        Le:
            r3 = 0
        Lf:
            java.lang.String r2 = "VideoCallParticipantView, wrong index = "
            java.lang.String r1 = ", total count = "
            java.lang.String r0 = ", active count = "
            java.lang.StringBuilder r0 = X.C000200d.A0R(r2, r8, r1, r6, r0)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            X.C000700j.A08(r3, r0)
            android.view.View r0 = r7.getChildAt(r4)
            com.whatsapp.voipcalling.VideoCallParticipantView r0 = (com.whatsapp.voipcalling.VideoCallParticipantView) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VideoCallParticipantViewLayout.A01(int):com.whatsapp.voipcalling.VideoCallParticipantView");
    }

    public C74463dJ A02(int i, int i2) {
        int i3 = this.A03;
        return new C74463dJ(i3, (getWidth() - i) - this.A03, this.A04 + i3, ((getHeight() - i2) - this.A03) - this.A02);
    }

    public void A03() {
        Boolean A00 = Voip.A00("options.android_pip_lock_surfaceview");
        this.A0H = A00;
        if (A00 == null || !A00.booleanValue()) {
            return;
        }
        for (Map.Entry entry : this.A0O.entrySet()) {
            View view = (View) entry.getKey();
            ((C84663u7) entry.getValue()).getSurfaceHolder().setFixedSize(view.getWidth(), view.getHeight());
        }
    }

    public void A04() {
        Boolean bool = this.A0H;
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        for (C84663u7 c84663u7 : this.A0O.values()) {
            c84663u7.getSurfaceHolder().setSizeFromLayout();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0038, code lost:
        if ((r11 % 2) != 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A05(int r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            com.whatsapp.voipcalling.VideoCallParticipantView r5 = r10.A01(r11)
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.width = r12
            r0.height = r13
            r5.setLayoutParams(r0)
            X.01c r4 = r10.A0F
            if (r4 == 0) goto L2d
            int r8 = r10.getWidth()
            r6 = r14
            int r8 = r8 - r14
            int r8 = r8 - r12
            r9 = 0
            r7 = r15
            X.C0LX.A07(r4, r5, r6, r7, r8, r9)
            int r1 = r10.A01
            r4 = 3
            r0 = 2
            if (r1 != r4) goto L31
            if (r11 != r0) goto L31
            r0 = 6
            r5.setLayoutMode(r0)
        L2d:
            r5.A02()
            return
        L31:
            r0 = 1
            int r1 = r1 - r0
            if (r11 == r1) goto L3a
            int r0 = r11 % 2
            r3 = 1
            if (r0 == 0) goto L3b
        L3a:
            r3 = 0
        L3b:
            X.01c r0 = r10.A0F
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L5d
            r2 = 0
            if (r3 != 0) goto L47
            r2 = 1
        L47:
            int r1 = r10.A01
            int r0 = r1 + (-1)
            if (r11 == r0) goto L55
            if (r3 == 0) goto L5f
            int r0 = r1 + (-3)
            if (r11 < r0) goto L5f
            if (r1 <= r4) goto L5f
        L55:
            r0 = 4
            if (r2 == 0) goto L59
            r0 = 5
        L59:
            r5.setLayoutMode(r0)
            goto L2d
        L5d:
            r2 = r3
            goto L47
        L5f:
            if (r2 == 0) goto L62
            r4 = 2
        L62:
            r5.setLayoutMode(r4)
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VideoCallParticipantViewLayout.A05(int, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0085, code lost:
        if ((r9 % 2) != 0) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A06(int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VideoCallParticipantViewLayout.A06(int, boolean):void");
    }

    public void A07(final long j, final int i, final int i2) {
        StringBuilder sb = new StringBuilder("VideoCallParticipantViewLayout/animatePiPView with duration: ");
        sb.append(j);
        sb.append(", xOffset: ");
        sb.append(i);
        sb.append(", yOffset: ");
        sb.append(i2);
        sb.append(", final size: ");
        sb.append(0);
        sb.append("x");
        sb.append(0);
        Log.i(sb.toString());
        if (j > 0 && this.A0I) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.A07 = ofFloat;
            ofFloat.setDuration(j);
            this.A07.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3dH
                public int A00;
                public int A01;
                public int A02;
                public int A03;

                {
                    VideoCallParticipantViewLayout.this = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    VideoCallParticipantViewLayout videoCallParticipantViewLayout = VideoCallParticipantViewLayout.this;
                    VideoCallParticipantView videoCallParticipantView = videoCallParticipantViewLayout.A0N;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) videoCallParticipantView.getLayoutParams();
                    C002301c c002301c = videoCallParticipantViewLayout.A0F;
                    if (c002301c != null) {
                        if (animatedFraction == 0.0f) {
                            this.A02 = marginLayoutParams.topMargin;
                            this.A01 = c002301c.A0M() ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
                            this.A03 = videoCallParticipantView.getWidth();
                            this.A00 = videoCallParticipantView.getHeight();
                        }
                        C002301c c002301c2 = videoCallParticipantViewLayout.A0F;
                        C0LX.A07(c002301c2, videoCallParticipantView, ((int) (i * animatedFraction)) + this.A01, marginLayoutParams.topMargin, c002301c2.A0M() ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin, marginLayoutParams.bottomMargin);
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) videoCallParticipantView.getLayoutParams();
                        marginLayoutParams2.topMargin = this.A02 + ((int) (i2 * animatedFraction));
                        videoCallParticipantView.setLayoutParams(marginLayoutParams2);
                        return;
                    }
                    throw null;
                }
            });
            this.A07.addListener(new AnimatorListenerAdapter() { // from class: X.3dI
                {
                    VideoCallParticipantViewLayout.this = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    Log.i("VideoCallParticipantViewLayout/animatePiPView onAnimationCancel");
                    C84783uL c84783uL = VideoCallParticipantViewLayout.this.A0G;
                    if (c84783uL != null) {
                        VoipActivityV2 voipActivityV2 = c84783uL.A00;
                        voipActivityV2.A1g = false;
                        voipActivityV2.A1v();
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    Log.i("VideoCallParticipantViewLayout/animatePiPView onAnimationEnd");
                    C84783uL c84783uL = VideoCallParticipantViewLayout.this.A0G;
                    if (c84783uL != null) {
                        VoipActivityV2 voipActivityV2 = c84783uL.A00;
                        voipActivityV2.A1g = false;
                        voipActivityV2.A1v();
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    Log.i("VideoCallParticipantViewLayout/animatePiPView onAnimationRepeat");
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    Log.i("VideoCallParticipantViewLayout/animatePiPView onAnimationStart");
                    C84783uL c84783uL = VideoCallParticipantViewLayout.this.A0G;
                    if (c84783uL != null) {
                        VoipActivityV2 voipActivityV2 = c84783uL.A00;
                        voipActivityV2.A1g = true;
                        if (voipActivityV2.A1I != null) {
                            voipActivityV2.A1m();
                        }
                    }
                }
            });
            this.A07.start();
            return;
        }
        C84783uL c84783uL = this.A0G;
        if (c84783uL == null) {
            return;
        }
        VoipActivityV2 voipActivityV2 = c84783uL.A00;
        voipActivityV2.A1g = false;
        voipActivityV2.A1v();
    }

    public final void A08(VideoCallParticipantView videoCallParticipantView) {
        videoCallParticipantView.setLayoutMode(0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) videoCallParticipantView.getLayoutParams();
        if (marginLayoutParams.width != -1 || marginLayoutParams.height != -1 || marginLayoutParams.topMargin != 0 || marginLayoutParams.leftMargin != 0 || marginLayoutParams.bottomMargin != 0 || marginLayoutParams.rightMargin != 0) {
            C002301c c002301c = this.A0F;
            if (c002301c != null) {
                C0LX.A07(c002301c, videoCallParticipantView, 0, 0, 0, 0);
            }
            marginLayoutParams.height = -1;
            marginLayoutParams.width = -1;
            videoCallParticipantView.setLayoutParams(marginLayoutParams);
        }
        videoCallParticipantView.A02();
    }

    public final void A09(VideoCallParticipantView videoCallParticipantView) {
        if (videoCallParticipantView.getLayoutMode() == 1) {
            videoCallParticipantView.setOnTouchListener(this.A0E);
            videoCallParticipantView.setOnClickListener(this.A0B);
        } else {
            videoCallParticipantView.setOnClickListener(this.A0A);
            videoCallParticipantView.setOnTouchListener(this.A0D);
            videoCallParticipantView.setOnLongClickListener(this.A0C);
        }
        videoCallParticipantView.A0M.setOnClickListener(this.A09);
    }

    public boolean A0A(boolean z, boolean z2) {
        if (z == this.A0K && z2 == this.A0J) {
            return false;
        }
        this.A0K = z;
        this.A0J = z2;
        return true;
    }

    @Override // X.InterfaceC52052Zt
    public VideoPort ADq(VideoCallParticipantView videoCallParticipantView) {
        Map map = this.A0O;
        C84663u7 c84663u7 = (C84663u7) map.get(videoCallParticipantView);
        if (c84663u7 == null) {
            C84663u7 c84663u72 = new C84663u7(videoCallParticipantView.A0C);
            map.put(videoCallParticipantView, c84663u72);
            return c84663u72;
        }
        return c84663u7;
    }

    @Override // X.InterfaceC52052Zt
    public void AVv(VideoCallParticipantView videoCallParticipantView, Point point) {
        if (videoCallParticipantView.getLayoutMode() == 1) {
            VideoCallParticipantView videoCallParticipantView2 = this.A0N;
            C000700j.A08(videoCallParticipantView == videoCallParticipantView2, "only pipView can be in Pip mode");
            if (videoCallParticipantView == videoCallParticipantView2) {
                C000700j.A08(videoCallParticipantView2.getLayoutMode() == 1, "pipView is not in Pip mode");
                ViewGroup.MarginLayoutParams A00 = A00(point);
                if (A00 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) videoCallParticipantView2.getLayoutParams();
                    marginLayoutParams.height = A00.height;
                    marginLayoutParams.width = A00.width;
                    C002301c c002301c = this.A0F;
                    if (c002301c != null && c002301c.A0M()) {
                        marginLayoutParams.setMargins(A00.leftMargin, A00.topMargin, A00.rightMargin, A00.bottomMargin);
                    } else {
                        marginLayoutParams.setMargins(A00.rightMargin, A00.topMargin, A00.leftMargin, A00.bottomMargin);
                    }
                    StringBuilder A0P = C000200d.A0P("voip/VideoCallParticipantViewLayout/updatePipLayoutParams leftMargin: ");
                    A0P.append(marginLayoutParams.leftMargin);
                    A0P.append(", topMargin: ");
                    A0P.append(marginLayoutParams.topMargin);
                    A0P.append(", Pip size: ");
                    A0P.append(marginLayoutParams.width);
                    A0P.append("x");
                    A0P.append(marginLayoutParams.height);
                    A0P.append(", container size: ");
                    A0P.append(getWidth());
                    A0P.append("x");
                    A0P.append(getHeight());
                    Log.i(A0P.toString());
                    videoCallParticipantView2.setLayoutParams(marginLayoutParams);
                    videoCallParticipantView2.A02();
                }
            }
        }
    }

    public int getActiveChildCount() {
        return this.A01;
    }

    public List getActiveChildUserJids() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.A01; i++) {
            VideoCallParticipantView A01 = A01(i);
            if (A01 != null && A01.A0O != null) {
                arrayList.add(A01.A0O);
            }
        }
        return arrayList;
    }

    public Bitmap getCachedViewBitmap() {
        if (this.A08 == null || getWidth() != this.A08.getWidth() || getHeight() != this.A08.getHeight()) {
            this.A08 = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        }
        draw(new Canvas(this.A08));
        return this.A08;
    }

    public VideoCallParticipantView getPiPView() {
        return this.A0N;
    }

    public void setCommonViewListeners(View.OnTouchListener onTouchListener, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnLongClickListener onLongClickListener) {
        this.A0D = onTouchListener;
        this.A0A = onClickListener;
        this.A0C = onLongClickListener;
        this.A09 = onClickListener2;
        for (int i = 0; i < this.A01; i++) {
            A09(A01(i));
        }
    }

    public void setPipBottomOffset(int i) {
        this.A02 = i;
    }

    public void setPipMaxRatio(float f) {
        this.A00 = f;
    }

    public void setPipTopOffset(int i) {
        this.A04 = i;
    }
}
