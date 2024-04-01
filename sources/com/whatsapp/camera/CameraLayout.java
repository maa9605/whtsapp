package com.whatsapp.camera;

import X.AnonymousClass357;
import X.C57032oW;
import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.WindowManager;
import com.google.android.search.verification.client.R;
import com.whatsapp.camera.CameraLayout;

/* loaded from: classes2.dex */
public class CameraLayout extends AnonymousClass357 {
    public Display A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public C57032oW A06;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.2oW] */
    public CameraLayout(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A00 = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        this.A06 = new OrientationEventListener(context) { // from class: X.2oW
            public int A00;

            {
                this.A00 = CameraLayout.this.A00.getRotation();
            }

            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int i) {
                int i2;
                CameraLayout cameraLayout = CameraLayout.this;
                int rotation = cameraLayout.A00.getRotation();
                if (rotation != -1 && (((i2 = this.A00) == 1 && rotation == 3) || (i2 == 3 && rotation == 1))) {
                    Point point = new Point();
                    cameraLayout.A00.getSize(point);
                    cameraLayout.A00(rotation, 0, 0, point.x, point.y);
                }
                this.A00 = rotation;
            }
        };
    }

    public final void A00(int i, int i2, int i3, int i4, int i5) {
        if (this.A04 == null) {
            this.A04 = findViewById(R.id.shutter);
            this.A01 = findViewById(R.id.flash_btn);
            this.A05 = findViewById(R.id.switch_camera_btn);
            this.A02 = findViewById(R.id.recording_hint);
            this.A03 = findViewById(R.id.select_multiple);
        }
        int measuredWidth = this.A04.getMeasuredWidth();
        int measuredHeight = this.A04.getMeasuredHeight();
        this.A04.getPaddingTop();
        int paddingBottom = this.A04.getPaddingBottom();
        int measuredWidth2 = this.A01.getMeasuredWidth();
        int measuredHeight2 = this.A01.getMeasuredHeight();
        int measuredWidth3 = this.A05.getMeasuredWidth();
        int measuredHeight3 = this.A05.getMeasuredHeight();
        int measuredWidth4 = this.A02.getMeasuredWidth();
        int measuredHeight4 = this.A02.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i4 - i2) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom2 = (i5 - i3) - getPaddingBottom();
        int i6 = paddingRight - paddingLeft;
        if (paddingBottom2 - paddingTop > i6) {
            int i7 = paddingLeft + paddingRight;
            int i8 = paddingBottom2 - measuredHeight4;
            int i9 = paddingBottom >> 1;
            this.A02.layout((i7 - measuredWidth4) >> 1, i8 - i9, (measuredWidth4 + i7) >> 1, paddingBottom2 - i9);
            this.A04.layout((i7 - measuredWidth) >> 1, (paddingBottom2 - measuredHeight) - measuredHeight4, (i7 + measuredWidth) >> 1, i8);
            int i10 = (i6 - measuredWidth) >> 2;
            int i11 = paddingRight - i10;
            int i12 = measuredWidth3 >> 1;
            int i13 = paddingBottom2 - (measuredHeight >> 1);
            int i14 = measuredHeight3 >> 1;
            this.A05.layout(i11 - i12, (i13 - i14) - measuredHeight4, i11 + i12, (i14 + i13) - measuredHeight4);
            int i15 = paddingLeft + i10;
            int i16 = measuredWidth2 >> 1;
            int i17 = measuredHeight2 >> 1;
            this.A01.layout(i15 - i16, (i13 - i17) - measuredHeight4, i15 + i16, (i13 + i17) - measuredHeight4);
            return;
        }
        if (this.A03.getVisibility() != 8) {
            paddingBottom2 -= this.A03.getMeasuredHeight();
        }
        if (i != 0 && i != 1) {
            int i18 = paddingTop + paddingBottom2;
            this.A04.layout(paddingLeft, (i18 - measuredHeight) >> 1, paddingLeft + measuredWidth, (i18 + measuredHeight) >> 1);
            int i19 = ((paddingBottom2 - paddingTop) - measuredHeight) >> 2;
            int i20 = (measuredWidth >> 1) + paddingLeft;
            int i21 = measuredWidth3 >> 1;
            int i22 = paddingTop + i19;
            int i23 = measuredHeight3 >> 1;
            this.A05.layout(i20 - i21, i22 - i23, i21 + i20, i22 + i23);
            int i24 = measuredWidth2 >> 1;
            int i25 = paddingBottom2 - i19;
            int i26 = measuredHeight2 >> 1;
            this.A01.layout(i20 - i24, i25 - i26, i24 + i20, i25 + i26);
            if (this.A03.getVisibility() != 8) {
                int measuredWidth5 = this.A03.getMeasuredWidth();
                View view = this.A03;
                int i27 = measuredWidth5 >> 1;
                view.layout(i20 - i27, paddingBottom2, i20 + i27, view.getMeasuredHeight() + paddingBottom2);
            }
        } else {
            int i28 = paddingTop + paddingBottom2;
            this.A04.layout(paddingRight - measuredWidth, (i28 - measuredHeight) >> 1, paddingRight, (i28 + measuredHeight) >> 1);
            int i29 = ((paddingBottom2 - paddingTop) - measuredHeight) >> 2;
            int i30 = paddingRight - (measuredWidth >> 1);
            int i31 = measuredWidth3 >> 1;
            int i32 = paddingTop + i29;
            int i33 = measuredHeight3 >> 1;
            this.A05.layout(i30 - i31, i32 - i33, i31 + i30, i32 + i33);
            int i34 = measuredWidth2 >> 1;
            int i35 = paddingBottom2 - i29;
            int i36 = measuredHeight2 >> 1;
            this.A01.layout(i30 - i34, i35 - i36, i34 + i30, i35 + i36);
            if (this.A03.getVisibility() == 0) {
                int measuredWidth6 = this.A03.getMeasuredWidth();
                View view2 = this.A03;
                int i37 = measuredWidth6 >> 1;
                view2.layout(i30 - i37, paddingBottom2, i30 + i37, view2.getMeasuredHeight() + paddingBottom2);
            }
        }
        int i38 = paddingLeft + paddingRight;
        this.A02.layout((i38 - measuredWidth4) >> 1, paddingBottom2, (i38 + measuredWidth4) >> 1, paddingBottom2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        enable();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        disable();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00(this.A00.getRotation(), i, i2, i3, i4);
    }
}
