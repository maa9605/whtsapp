package androidx.appcompat.widget;

import X.C06650Uk;
import X.C0CN;
import X.C0TT;
import X.C0V2;
import X.C0V3;
import X.InterfaceC06760Uw;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue A00;
    public TypedValue A01;
    public TypedValue A02;
    public TypedValue A03;
    public TypedValue A04;
    public TypedValue A05;
    public C0V3 A06;
    public final Rect A07;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A07 = new Rect();
    }

    public void A00(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        TypedValue typedValue = this.A00;
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            this.A00 = typedValue2;
            return typedValue2;
        }
        return typedValue;
    }

    public TypedValue getFixedHeightMinor() {
        TypedValue typedValue = this.A01;
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            this.A01 = typedValue2;
            return typedValue2;
        }
        return typedValue;
    }

    public TypedValue getFixedWidthMajor() {
        TypedValue typedValue = this.A02;
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            this.A02 = typedValue2;
            return typedValue2;
        }
        return typedValue;
    }

    public TypedValue getFixedWidthMinor() {
        TypedValue typedValue = this.A03;
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            this.A03 = typedValue2;
            return typedValue2;
        }
        return typedValue;
    }

    public TypedValue getMinWidthMajor() {
        TypedValue typedValue = this.A04;
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            this.A04 = typedValue2;
            return typedValue2;
        }
        return typedValue;
    }

    public TypedValue getMinWidthMinor() {
        TypedValue typedValue = this.A05;
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            this.A05 = typedValue2;
            return typedValue2;
        }
        return typedValue;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0V3 c0v3 = this.A06;
        if (c0v3 != null) {
            C0CN c0cn = ((C0V2) c0v3).A00;
            InterfaceC06760Uw interfaceC06760Uw = c0cn.A0L;
            if (interfaceC06760Uw != null) {
                interfaceC06760Uw.A7M();
            }
            if (c0cn.A09 != null) {
                c0cn.A08.getDecorView().removeCallbacks(c0cn.A0O);
                if (c0cn.A09.isShowing()) {
                    try {
                        c0cn.A09.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                c0cn.A09 = null;
            }
            C0TT c0tt = c0cn.A0M;
            if (c0tt != null) {
                c0tt.A00();
            }
            C06650Uk c06650Uk = c0cn.A0U(0).A0A;
            if (c06650Uk != null) {
                c06650Uk.A0F(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            android.content.Context r0 = r11.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r6 = r0.getDisplayMetrics()
            int r1 = r6.widthPixels
            int r0 = r6.heightPixels
            r10 = 0
            if (r1 >= r0) goto L14
            r10 = 1
        L14:
            int r7 = android.view.View.MeasureSpec.getMode(r12)
            int r4 = android.view.View.MeasureSpec.getMode(r13)
            r5 = 6
            r2 = 5
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r7 != r1) goto Ld3
            if (r10 == 0) goto Lcf
            android.util.TypedValue r8 = r11.A03
        L28:
            if (r8 == 0) goto Ld3
            int r0 = r8.type
            if (r0 == 0) goto Ld3
            if (r0 != r2) goto Lc4
            float r0 = r8.getDimension(r6)
        L34:
            int r9 = (int) r0
            if (r9 <= 0) goto Ld3
            android.graphics.Rect r0 = r11.A07
            int r8 = r0.left
            int r0 = r0.right
            int r8 = r8 + r0
            int r9 = r9 - r8
            int r0 = android.view.View.MeasureSpec.getSize(r12)
            int r0 = java.lang.Math.min(r9, r0)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r9 = 1
        L4c:
            if (r4 != r1) goto L75
            if (r10 == 0) goto Lc1
            android.util.TypedValue r4 = r11.A00
        L52:
            if (r4 == 0) goto L75
            int r0 = r4.type
            if (r0 == 0) goto L75
            if (r0 != r2) goto Lb7
            float r0 = r4.getDimension(r6)
        L5e:
            int r8 = (int) r0
            if (r8 <= 0) goto L75
            android.graphics.Rect r0 = r11.A07
            int r4 = r0.top
            int r0 = r0.bottom
            int r4 = r4 + r0
            int r8 = r8 - r4
            int r0 = android.view.View.MeasureSpec.getSize(r13)
            int r0 = java.lang.Math.min(r8, r0)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
        L75:
            super.onMeasure(r12, r13)
            int r4 = r11.getMeasuredWidth()
            android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            if (r9 != 0) goto La7
            if (r7 != r1) goto La7
            if (r10 == 0) goto Lb4
            android.util.TypedValue r1 = r11.A05
        L87:
            if (r1 == 0) goto La7
            int r0 = r1.type
            if (r0 == 0) goto La7
            if (r0 != r2) goto La8
            float r0 = r1.getDimension(r6)
        L93:
            int r2 = (int) r0
            if (r2 <= 0) goto L9e
            android.graphics.Rect r0 = r11.A07
            int r1 = r0.left
            int r0 = r0.right
            int r1 = r1 + r0
            int r2 = r2 - r1
        L9e:
            if (r4 >= r2) goto La7
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            super.onMeasure(r0, r13)
        La7:
            return
        La8:
            if (r0 != r5) goto Lb2
            int r0 = r6.widthPixels
            float r0 = (float) r0
            float r0 = r1.getFraction(r0, r0)
            goto L93
        Lb2:
            r2 = 0
            goto L9e
        Lb4:
            android.util.TypedValue r1 = r11.A04
            goto L87
        Lb7:
            if (r0 != r5) goto L75
            int r0 = r6.heightPixels
            float r0 = (float) r0
            float r0 = r4.getFraction(r0, r0)
            goto L5e
        Lc1:
            android.util.TypedValue r4 = r11.A01
            goto L52
        Lc4:
            if (r0 != r5) goto Ld3
            int r0 = r6.widthPixels
            float r0 = (float) r0
            float r0 = r8.getFraction(r0, r0)
            goto L34
        Lcf:
            android.util.TypedValue r8 = r11.A02
            goto L28
        Ld3:
            r9 = 0
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(C0V3 c0v3) {
        this.A06 = c0v3;
    }
}
