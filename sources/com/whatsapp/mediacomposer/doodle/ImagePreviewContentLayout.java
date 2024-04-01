package com.whatsapp.mediacomposer.doodle;

import X.AbstractC51782Xz;
import X.C3H5;
import X.C48742Gm;
import X.C63512zu;
import X.GestureDetector$OnGestureListenerC61252vq;
import X.InterfaceC63522zv;
import X.RunnableC61232vo;
import X.RunnableC61242vp;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class ImagePreviewContentLayout extends AbstractC51782Xz {
    public Rect A00;
    public RectF A01;
    public GestureDetector$OnGestureListenerC61252vq A02;
    public C48742Gm A03;
    public InterfaceC63522zv A04;

    public ImagePreviewContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = new RectF();
        this.A00 = new Rect();
        LayoutInflater.from(context).inflate(R.layout.image_preview_content, (ViewGroup) this, true);
        setWillNotDraw(false);
        GestureDetector$OnGestureListenerC61252vq gestureDetector$OnGestureListenerC61252vq = new GestureDetector$OnGestureListenerC61252vq(getContext(), this, new C3H5(this));
        this.A02 = gestureDetector$OnGestureListenerC61252vq;
        gestureDetector$OnGestureListenerC61252vq.A0U = true;
    }

    public void A00() {
        GestureDetector$OnGestureListenerC61252vq gestureDetector$OnGestureListenerC61252vq = this.A02;
        gestureDetector$OnGestureListenerC61252vq.A0I = null;
        gestureDetector$OnGestureListenerC61252vq.A0F = null;
        RunnableC61232vo runnableC61232vo = gestureDetector$OnGestureListenerC61252vq.A0J;
        if (runnableC61232vo != null) {
            runnableC61232vo.A06 = false;
            runnableC61232vo.A07 = true;
        }
        gestureDetector$OnGestureListenerC61252vq.A0J = null;
        RunnableEBaseShape0S0220102_I0 runnableEBaseShape0S0220102_I0 = gestureDetector$OnGestureListenerC61252vq.A0N;
        if (runnableEBaseShape0S0220102_I0 != null) {
            runnableEBaseShape0S0220102_I0.A05 = false;
            runnableEBaseShape0S0220102_I0.A06 = true;
        }
        gestureDetector$OnGestureListenerC61252vq.A0N = null;
        RunnableEBaseShape0S0220102_I0 runnableEBaseShape0S0220102_I02 = gestureDetector$OnGestureListenerC61252vq.A0M;
        if (runnableEBaseShape0S0220102_I02 != null) {
            runnableEBaseShape0S0220102_I02.A05 = false;
            runnableEBaseShape0S0220102_I02.A06 = true;
        }
        gestureDetector$OnGestureListenerC61252vq.A0M = null;
        RunnableC61242vp runnableC61242vp = gestureDetector$OnGestureListenerC61252vq.A0K;
        if (runnableC61242vp != null) {
            runnableC61242vp.A01 = true;
        }
        gestureDetector$OnGestureListenerC61252vq.A0K = null;
        gestureDetector$OnGestureListenerC61252vq.A0G = null;
        gestureDetector$OnGestureListenerC61252vq.A0G = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0021, code lost:
        if (r0.A05 != false) goto L15;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            X.2vq r2 = r6.A02
            boolean r0 = r2.A0T
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L2e
            boolean r0 = r2.A0S
            if (r0 != 0) goto L2e
            X.2vp r0 = r2.A0K
            r1 = 0
            X.2vo r0 = r2.A0J
            if (r0 == 0) goto L18
            boolean r0 = r0.A06
            if (r0 == 0) goto L18
            r1 = 1
        L18:
            java.lang.RunnableEBaseShape0S0220102_I0 r0 = r2.A0N
            if (r0 == 0) goto L24
            if (r1 != 0) goto L23
            boolean r0 = r0.A05
            r1 = 0
            if (r0 == 0) goto L24
        L23:
            r1 = 1
        L24:
            java.lang.RunnableEBaseShape0S0220102_I0 r0 = r2.A0M
            if (r0 == 0) goto L6a
            if (r1 != 0) goto L2e
            boolean r0 = r0.A05
            if (r0 == 0) goto L6d
        L2e:
            X.2vq r0 = r6.A02
            X.0ka r0 = r0.A0I
            if (r0 == 0) goto L68
            X.0kY r0 = r0.A00
            boolean r5 = r0.APj(r7)
            r5 = r5 | r3
        L3b:
            X.2vq r0 = r6.A02
            android.view.ScaleGestureDetector r0 = r0.A0F
            if (r0 == 0) goto L46
            boolean r0 = r0.onTouchEvent(r7)
            r5 = r5 | r0
        L46:
            X.2vq r2 = r6.A02
            if (r2 == 0) goto L7e
            int r1 = r7.getActionMasked()
            r7.getPointerCount()
            if (r1 == r4) goto L5a
            r0 = 3
            if (r1 == r0) goto L5a
            if (r5 != 0) goto L59
            r4 = 0
        L59:
            return r4
        L5a:
            r2.A0S = r3
            java.lang.RunnableEBaseShape0S0220102_I0 r0 = r2.A0N
            if (r0 == 0) goto L59
            boolean r0 = r0.A05
            if (r0 != 0) goto L59
            r2.A02(r3)
            return r4
        L68:
            r5 = 0
            goto L3b
        L6a:
            if (r1 == 0) goto L6d
            goto L2e
        L6d:
            X.2Gm r1 = r6.A03
            boolean r0 = r1.A0C(r7)
            if (r0 == 0) goto L2e
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r1.A0G
            boolean r0 = r0.onTouchEvent(r7)
            if (r0 == 0) goto L2e
            return r4
        L7e:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.setMatrix(this.A02.A09);
        canvas.getClipBounds(this.A00);
        C48742Gm c48742Gm = this.A03;
        Rect rect = this.A00;
        float f = this.A02.A00;
        C63512zu c63512zu = c48742Gm.A0H;
        c63512zu.A05 = rect;
        c63512zu.A01 = f;
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.A01.set(0.0f, 0.0f, (getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
            GestureDetector$OnGestureListenerC61252vq gestureDetector$OnGestureListenerC61252vq = this.A02;
            gestureDetector$OnGestureListenerC61252vq.A0C.set(this.A01);
            gestureDetector$OnGestureListenerC61252vq.A00();
            GestureDetector$OnGestureListenerC61252vq gestureDetector$OnGestureListenerC61252vq2 = this.A02;
            gestureDetector$OnGestureListenerC61252vq2.A0Q = true;
            Matrix matrix = gestureDetector$OnGestureListenerC61252vq2.A08;
            if (matrix == null || matrix.equals(gestureDetector$OnGestureListenerC61252vq2.A09)) {
                gestureDetector$OnGestureListenerC61252vq2.A00();
            }
        }
    }

    public void setDoodleController(C48742Gm c48742Gm) {
        this.A03 = c48742Gm;
    }

    public void setImagePreviewContentLayoutListener(InterfaceC63522zv interfaceC63522zv) {
        this.A04 = interfaceC63522zv;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A02.A0G = onClickListener;
    }

    public void setZoomableViewController(GestureDetector$OnGestureListenerC61252vq gestureDetector$OnGestureListenerC61252vq) {
        this.A02 = gestureDetector$OnGestureListenerC61252vq;
    }
}
