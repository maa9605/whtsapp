package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: X.0bl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C08600bl {
    public C08020aT A00;
    public C08020aT A01;
    public final ImageView A02;

    public C08600bl(ImageView imageView) {
        this.A02 = imageView;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A00() {
        /*
            r8 = this;
            android.widget.ImageView r5 = r8.A02
            android.graphics.drawable.Drawable r3 = r5.getDrawable()
            if (r3 == 0) goto L74
            X.C0YO.A02(r3)
            int r7 = android.os.Build.VERSION.SDK_INT
            r6 = 1
            r4 = 21
            r2 = 0
            if (r7 > r4) goto L69
            if (r7 != r4) goto L69
            X.0aT r1 = r8.A01
            if (r1 != 0) goto L20
            X.0aT r1 = new X.0aT
            r1.<init>()
            r8.A01 = r1
        L20:
            r0 = 0
            r1.A00 = r0
            r1.A02 = r2
            r1.A01 = r0
            r1.A03 = r2
            if (r7 < r4) goto L5d
            android.content.res.ColorStateList r0 = r5.getImageTintList()
        L2f:
            if (r0 == 0) goto L35
            r1.A02 = r6
            r1.A00 = r0
        L35:
            if (r7 < r4) goto L51
            android.graphics.PorterDuff$Mode r0 = r5.getImageTintMode()
        L3b:
            if (r0 == 0) goto L41
            r1.A03 = r6
            r1.A01 = r0
        L41:
            boolean r0 = r1.A02
            if (r0 != 0) goto L49
            boolean r0 = r1.A03
            if (r0 == 0) goto L69
        L49:
            int[] r0 = r5.getDrawableState()
            X.C06720Us.A02(r3, r1, r0)
            return
        L51:
            boolean r0 = r5 instanceof X.InterfaceC04870Mf
            if (r0 == 0) goto L41
            r0 = r5
            X.0Mf r0 = (X.InterfaceC04870Mf) r0
            android.graphics.PorterDuff$Mode r0 = r0.getSupportImageTintMode()
            goto L3b
        L5d:
            boolean r0 = r5 instanceof X.InterfaceC04870Mf
            if (r0 == 0) goto L35
            r0 = r5
            X.0Mf r0 = (X.InterfaceC04870Mf) r0
            android.content.res.ColorStateList r0 = r0.getSupportImageTintList()
            goto L2f
        L69:
            X.0aT r1 = r8.A00
            if (r1 == 0) goto L74
            int[] r0 = r5.getDrawableState()
            X.C06720Us.A02(r3, r1, r0)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08600bl.A00():void");
    }

    public void A01(int i) {
        if (i != 0) {
            ImageView imageView = this.A02;
            Drawable A01 = C09L.A01(imageView.getContext(), i);
            if (A01 != null) {
                C0YO.A02(A01);
            }
            imageView.setImageDrawable(A01);
        } else {
            this.A02.setImageDrawable(null);
        }
        A00();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:3:0x000c, B:5:0x0013, B:7:0x001c, B:9:0x0026, B:11:0x002c, B:13:0x0035, B:14:0x003d, B:16:0x0044, B:10:0x0029), top: B:22:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:3:0x000c, B:5:0x0013, B:7:0x001c, B:9:0x0026, B:11:0x002c, B:13:0x0035, B:14:0x003d, B:16:0x0044, B:10:0x0029), top: B:22:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(android.util.AttributeSet r7, int r8) {
        /*
            r6 = this;
            android.widget.ImageView r3 = r6.A02
            android.content.Context r1 = r3.getContext()
            int[] r0 = X.C0UY.A0A
            X.0V9 r4 = X.C0V9.A00(r1, r7, r0, r8)
            android.graphics.drawable.Drawable r0 = r3.getDrawable()     // Catch: java.lang.Throwable -> L55
            r5 = -1
            if (r0 != 0) goto L29
            r1 = 1
            android.content.res.TypedArray r0 = r4.A02     // Catch: java.lang.Throwable -> L55
            int r1 = r0.getResourceId(r1, r5)     // Catch: java.lang.Throwable -> L55
            if (r1 == r5) goto L2c
            android.content.Context r0 = r3.getContext()     // Catch: java.lang.Throwable -> L55
            android.graphics.drawable.Drawable r0 = X.C09L.A01(r0, r1)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L2c
            r3.setImageDrawable(r0)     // Catch: java.lang.Throwable -> L55
        L29:
            X.C0YO.A02(r0)     // Catch: java.lang.Throwable -> L55
        L2c:
            r0 = 2
            android.content.res.TypedArray r2 = r4.A02     // Catch: java.lang.Throwable -> L55
            boolean r0 = r2.hasValue(r0)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L3d
            r0 = 2
            android.content.res.ColorStateList r0 = r4.A01(r0)     // Catch: java.lang.Throwable -> L55
            X.C07O.A0h(r3, r0)     // Catch: java.lang.Throwable -> L55
        L3d:
            r0 = 3
            boolean r0 = r2.hasValue(r0)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L51
            r0 = 3
            int r1 = r2.getInt(r0, r5)     // Catch: java.lang.Throwable -> L55
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.C0YO.A00(r1, r0)     // Catch: java.lang.Throwable -> L55
            X.C07O.A0i(r3, r0)     // Catch: java.lang.Throwable -> L55
        L51:
            r2.recycle()
            return
        L55:
            r1 = move-exception
            android.content.res.TypedArray r0 = r4.A02
            r0.recycle()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08600bl.A02(android.util.AttributeSet, int):void");
    }

    public boolean A03() {
        return Build.VERSION.SDK_INT < 21 || !(this.A02.getBackground() instanceof RippleDrawable);
    }
}
