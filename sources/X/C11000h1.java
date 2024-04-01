package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;

/* renamed from: X.0h1  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C11000h1 {
    public ColorStateList A00 = null;
    public PorterDuff.Mode A01 = null;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04;
    public final CompoundButton A05;

    public C11000h1(CompoundButton compoundButton) {
        this.A05 = compoundButton;
    }

    public int A00(int i) {
        Drawable A0J;
        return (Build.VERSION.SDK_INT >= 17 || (A0J = C07O.A0J(this.A05)) == null) ? i : i + A0J.getIntrinsicWidth();
    }

    public void A01() {
        CompoundButton compoundButton = this.A05;
        Drawable A0J = C07O.A0J(compoundButton);
        if (A0J != null) {
            if (this.A02 || this.A03) {
                Drawable mutate = C07O.A0I(A0J).mutate();
                if (this.A02) {
                    C07O.A0Z(mutate, this.A00);
                }
                if (this.A03) {
                    C07O.A0a(mutate, this.A01);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[Catch: all -> 0x0085, TryCatch #1 {all -> 0x0085, blocks: (B:3:0x000d, B:5:0x0014, B:7:0x001b, B:13:0x003e, B:15:0x0047, B:17:0x0050, B:23:0x006d, B:25:0x0071, B:18:0x0053, B:20:0x005a, B:22:0x0069, B:26:0x0078, B:28:0x007c, B:8:0x0027, B:10:0x002d, B:12:0x0033), top: B:37:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[Catch: all -> 0x0085, TryCatch #1 {all -> 0x0085, blocks: (B:3:0x000d, B:5:0x0014, B:7:0x001b, B:13:0x003e, B:15:0x0047, B:17:0x0050, B:23:0x006d, B:25:0x0071, B:18:0x0053, B:20:0x005a, B:22:0x0069, B:26:0x0078, B:28:0x007c, B:8:0x0027, B:10:0x002d, B:12:0x0033), top: B:37:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(android.util.AttributeSet r6, int r7) {
        /*
            r5 = this;
            android.widget.CompoundButton r2 = r5.A05
            android.content.Context r1 = r2.getContext()
            int[] r0 = X.C0UY.A0H
            r4 = 0
            android.content.res.TypedArray r3 = r1.obtainStyledAttributes(r6, r0, r7, r4)
            r0 = 1
            boolean r0 = r3.hasValue(r0)     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L27
            r0 = 1
            int r1 = r3.getResourceId(r0, r4)     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L27
            android.content.Context r0 = r2.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L27 java.lang.Throwable -> L85
            android.graphics.drawable.Drawable r0 = X.C09L.A01(r0, r1)     // Catch: android.content.res.Resources.NotFoundException -> L27 java.lang.Throwable -> L85
            r2.setButtonDrawable(r0)     // Catch: android.content.res.Resources.NotFoundException -> L27 java.lang.Throwable -> L85
            goto L3e
        L27:
            boolean r0 = r3.hasValue(r4)     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L3e
            int r1 = r3.getResourceId(r4, r4)     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L3e
            android.content.Context r0 = r2.getContext()     // Catch: java.lang.Throwable -> L85
            android.graphics.drawable.Drawable r0 = X.C09L.A01(r0, r1)     // Catch: java.lang.Throwable -> L85
            r2.setButtonDrawable(r0)     // Catch: java.lang.Throwable -> L85
        L3e:
            r0 = 2
            boolean r0 = r3.hasValue(r0)     // Catch: java.lang.Throwable -> L85
            r4 = 21
            if (r0 == 0) goto L53
            r0 = 2
            android.content.res.ColorStateList r1 = r3.getColorStateList(r0)     // Catch: java.lang.Throwable -> L85
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L85
            if (r0 < r4) goto L6d
            r2.setButtonTintList(r1)     // Catch: java.lang.Throwable -> L85
        L53:
            r0 = 3
            boolean r0 = r3.hasValue(r0)     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L81
            r1 = 3
            r0 = -1
            int r1 = r3.getInt(r1, r0)     // Catch: java.lang.Throwable -> L85
            r0 = 0
            android.graphics.PorterDuff$Mode r1 = X.C0YO.A00(r1, r0)     // Catch: java.lang.Throwable -> L85
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L85
            if (r0 < r4) goto L78
            r2.setButtonTintMode(r1)     // Catch: java.lang.Throwable -> L85
            goto L81
        L6d:
            boolean r0 = r2 instanceof X.InterfaceC08340bJ     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L53
            r0 = r2
            X.0bJ r0 = (X.InterfaceC08340bJ) r0     // Catch: java.lang.Throwable -> L85
            r0.setSupportButtonTintList(r1)     // Catch: java.lang.Throwable -> L85
            goto L53
        L78:
            boolean r0 = r2 instanceof X.InterfaceC08340bJ     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L81
            X.0bJ r2 = (X.InterfaceC08340bJ) r2     // Catch: java.lang.Throwable -> L85
            r2.setSupportButtonTintMode(r1)     // Catch: java.lang.Throwable -> L85
        L81:
            r3.recycle()
            return
        L85:
            r0 = move-exception
            r3.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11000h1.A02(android.util.AttributeSet, int):void");
    }
}
