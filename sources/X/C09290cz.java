package X;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import java.util.List;

/* renamed from: X.0cz */
/* loaded from: classes.dex */
public class C09290cz extends FrameLayout {
    public C1BC A00;
    public C1BD A01;
    public final AccessibilityManager A02;
    public final InterfaceC13210km A03;

    public C09290cz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08550bg.A0r);
        if (obtainStyledAttributes.hasValue(1)) {
            C0AT.A0P(this, obtainStyledAttributes.getDimensionPixelSize(1, 0));
        }
        obtainStyledAttributes.recycle();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        this.A02 = accessibilityManager;
        C32781eh c32781eh = new C32781eh(this);
        this.A03 = c32781eh;
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityManager.addTouchExplorationStateChangeListener(new accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC13220kn(c32781eh));
        }
        setClickableOrFocusableBasedOnAccessibility(this, this.A02.isTouchExplorationEnabled());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0AT.A0L(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x002d, code lost:
        if (r1 != false) goto L23;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDetachedFromWindow() {
        /*
            r5 = this;
            super.onDetachedFromWindow()
            X.1BC r4 = r5.A00
            if (r4 == 0) goto L43
            X.1ef r4 = (X.C32761ef) r4
            X.0cw r0 = r4.A00
            if (r0 == 0) goto L35
            X.1BJ r1 = X.C1BJ.A00()
            X.1BH r3 = r0.A07
            java.lang.Object r2 = r1.A03
            monitor-enter(r2)
            boolean r0 = r1.A05(r3)     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L2f
            X.1BI r0 = r1.A01     // Catch: java.lang.Throwable -> L32
            r1 = 0
            if (r0 == 0) goto L2c
            if (r3 == 0) goto L2c
            java.lang.ref.WeakReference r0 = r0.A02     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L32
            if (r0 != r3) goto L2c
            r1 = 1
        L2c:
            r0 = 0
            if (r1 == 0) goto L30
        L2f:
            r0 = 1
        L30:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
            goto L37
        L32:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
            throw r0
        L35:
            r0 = 0
            throw r0
        L37:
            if (r0 == 0) goto L43
            android.os.Handler r1 = X.AbstractC09260cw.A08
            X.1B8 r0 = new X.1B8
            r0.<init>()
            r1.post(r0)
        L43:
            android.view.accessibility.AccessibilityManager r3 = r5.A02
            X.0km r2 = r5.A03
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 19
            if (r1 < r0) goto L57
            if (r2 == 0) goto L57
            X.0kn r0 = new X.0kn
            r0.<init>(r2)
            r3.removeTouchExplorationStateChangeListener(r0)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09290cz.onDetachedFromWindow():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C1BD c1bd = this.A01;
        if (c1bd != null) {
            C32771eg c32771eg = (C32771eg) c1bd;
            c32771eg.A00.A05.A01 = null;
            AbstractC09260cw abstractC09260cw = c32771eg.A00;
            boolean z2 = true;
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = abstractC09260cw.A04.getEnabledAccessibilityServiceList(1);
            if ((enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) ? false : false) {
                abstractC09260cw.A00();
            } else {
                abstractC09260cw.A01();
            }
        }
    }

    public static void setClickableOrFocusableBasedOnAccessibility(C09290cz c09290cz, boolean z) {
        c09290cz.setClickable(!z);
        c09290cz.setFocusable(z);
    }

    public void setOnAttachStateChangeListener(C1BC c1bc) {
        this.A00 = c1bc;
    }

    public void setOnLayoutChangeListener(C1BD c1bd) {
        this.A01 = c1bd;
    }
}
