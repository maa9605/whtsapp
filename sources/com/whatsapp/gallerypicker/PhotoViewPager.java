package com.whatsapp.gallerypicker;

import X.C3LO;
import X.InterfaceC16360qH;
import X.InterfaceC61192vk;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes2.dex */
public class PhotoViewPager extends C3LO {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public InterfaceC61192vk A04;

    public PhotoViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0H(true, new InterfaceC16360qH() { // from class: X.3BD
            @Override // X.InterfaceC16360qH
            public final void AVg(View view, float f) {
                if (f >= 0.0f && f < 1.0f) {
                    view.setTranslationX((-f) * view.getWidth());
                    view.setAlpha(Math.max(0.0f, 1.0f - f));
                    float max = Math.max(0.0f, 1.0f - (f * 0.3f));
                    view.setScaleX(max);
                    view.setScaleY(max);
                    return;
                }
                view.setTranslationX(0.0f);
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
        if (r0 > 1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r0 > 1) goto L52;
     */
    @Override // com.whatsapp.collections.MarginCorrectedViewPager, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            X.2vk r3 = r9.A04
            r2 = 0
            if (r3 == 0) goto L9e
            float r1 = r9.A00
            float r0 = r9.A01
            int r1 = r3.APk(r1, r0)
        Ld:
            int r0 = r10.getPointerCount()
            r8 = 3
            r7 = 1
            if (r1 == r8) goto L1a
            if (r1 == r7) goto L1a
            r6 = 0
            if (r0 <= r7) goto L1b
        L1a:
            r6 = 1
        L1b:
            r5 = 2
            if (r1 == r8) goto L23
            if (r1 == r5) goto L23
            r4 = 0
            if (r0 <= r7) goto L24
        L23:
            r4 = 1
        L24:
            int r0 = r10.getAction()
            r3 = r0 & 255(0xff, float:3.57E-43)
            r1 = -1
            if (r3 == r8) goto L4e
            if (r3 == r7) goto L4e
            if (r3 != 0) goto L50
            float r0 = r10.getX()
            r9.A02 = r0
            float r0 = r10.getRawX()
            r9.A00 = r0
            float r0 = r10.getRawY()
            r9.A01 = r0
            int r0 = r10.getPointerId(r2)
            r9.A03 = r0
        L49:
            boolean r0 = super.onInterceptTouchEvent(r10)
            return r0
        L4e:
            r9.A03 = r1
        L50:
            if (r3 == r5) goto L71
            r0 = 6
            if (r3 != r0) goto L49
            int r3 = r10.getActionIndex()
            int r1 = r10.getPointerId(r3)
            int r0 = r9.A03
            if (r1 != r0) goto L49
            if (r3 != 0) goto L64
            r2 = 1
        L64:
            float r0 = r10.getX(r2)
            r9.A02 = r0
            int r0 = r10.getPointerId(r2)
            r9.A03 = r0
            goto L49
        L71:
            if (r6 != 0) goto L75
            if (r4 == 0) goto L49
        L75:
            int r0 = r9.A03
            if (r0 == r1) goto L49
            int r0 = r10.findPointerIndex(r0)
            if (r0 == r1) goto L49
            float r1 = r10.getX(r0)
            if (r6 == 0) goto L93
            if (r4 == 0) goto L8a
            r9.A02 = r1
            return r2
        L8a:
            float r0 = r9.A02
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L49
            r9.A02 = r1
            return r2
        L93:
            if (r4 == 0) goto L49
            float r0 = r9.A02
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L49
            r9.A02 = r1
            return r2
        L9e:
            r1 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.PhotoViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnInterceptTouchListener(InterfaceC61192vk interfaceC61192vk) {
        this.A04 = interfaceC61192vk;
    }
}
