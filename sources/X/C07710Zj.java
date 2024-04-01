package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: X.0Zj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07710Zj {
    public ImageView A00;
    public ImageView A01;
    public boolean A02;

    public C07710Zj(ImageView imageView, ImageView imageView2) {
        if (imageView != null) {
            this.A00 = imageView;
            if (imageView2 != null) {
                this.A01 = imageView2;
                return;
            }
            throw null;
        }
        throw null;
    }

    public static Drawable A00(Drawable drawable, Drawable drawable2) {
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() > 0) {
                drawable = layerDrawable.getDrawable(layerDrawable.getNumberOfLayers() - 1);
            }
        }
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, drawable2});
                transitionDrawable.setCrossFadeEnabled(true);
                transitionDrawable.startTransition(50);
                int intrinsicHeight = drawable.getIntrinsicHeight();
                transitionDrawable.setLayerWidth(0, drawable.getIntrinsicWidth());
                transitionDrawable.setLayerHeight(0, intrinsicHeight);
                transitionDrawable.setLayerGravity(0, 17);
                int intrinsicHeight2 = drawable2.getIntrinsicHeight();
                transitionDrawable.setLayerWidth(1, drawable2.getIntrinsicWidth());
                transitionDrawable.setLayerHeight(1, intrinsicHeight2);
                transitionDrawable.setLayerGravity(1, 17);
                return transitionDrawable;
            }
            return drawable2;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (r2 == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A01(final X.C0MJ r15) {
        /*
            r14 = this;
            android.graphics.drawable.Drawable r2 = r15.AB2()
            java.lang.String r3 = r15.AB1()
            android.graphics.drawable.Drawable r6 = r15.A8R()
            java.lang.String r4 = r15.A8Q()
            android.widget.ImageView r1 = r14.A00
            X.0cE r0 = new X.0cE
            r0.<init>()
            r1.setOnClickListener(r0)
            android.widget.ImageView r1 = r14.A01
            X.0cF r0 = new X.0cF
            r0.<init>()
            r1.setOnClickListener(r0)
            if (r3 == 0) goto L2b
            android.widget.ImageView r0 = r14.A00
            r0.setContentDescription(r3)
        L2b:
            if (r2 == 0) goto L3e
            android.widget.ImageView r0 = r14.A00
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            android.graphics.drawable.Drawable r1 = A00(r0, r2)
            if (r1 == 0) goto Ldb
            android.widget.ImageView r0 = r14.A00
            r0.setImageDrawable(r1)
        L3e:
            boolean r0 = r14.A02
            r5 = 0
            if (r0 != 0) goto L46
            r3 = 0
            if (r2 != 0) goto L48
        L46:
            r3 = 8
        L48:
            android.widget.ImageView r0 = r14.A00
            int r2 = r0.getVisibility()
            r0 = 100
            if (r3 == r2) goto L69
            android.widget.ImageView r2 = r14.A00
            r2.setVisibility(r3)
            r8 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r3 != 0) goto Lcd
            android.widget.ImageView r3 = r14.A00
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r8, r7)
            r2.setDuration(r0)
            r3.startAnimation(r2)
        L69:
            if (r6 == 0) goto L7c
            android.widget.ImageView r2 = r14.A01
            android.graphics.drawable.Drawable r2 = r2.getDrawable()
            android.graphics.drawable.Drawable r3 = A00(r2, r6)
            if (r3 == 0) goto Lc7
            android.widget.ImageView r2 = r14.A01
            r2.setImageDrawable(r3)
        L7c:
            boolean r2 = r14.A02
            if (r2 != 0) goto L82
            if (r6 != 0) goto L84
        L82:
            r5 = 8
        L84:
            android.widget.ImageView r2 = r14.A01
            int r2 = r2.getVisibility()
            if (r5 == r2) goto Laa
            android.widget.ImageView r2 = r14.A01
            r2.setVisibility(r5)
            android.widget.ImageView r2 = r14.A01
            r6 = 1
            if (r5 != 0) goto Lb2
            r7 = 0
            r11 = 1061997773(0x3f4ccccd, float:0.8)
            r8 = r6
            r9 = r7
            r10 = r6
            r12 = r6
            r13 = r7
            android.view.animation.TranslateAnimation r5 = new android.view.animation.TranslateAnimation
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r5.setDuration(r0)
            r2.startAnimation(r5)
        Laa:
            if (r4 == 0) goto Lb1
            android.widget.ImageView r0 = r14.A01
            r0.setContentDescription(r4)
        Lb1:
            return
        Lb2:
            r7 = 0
            r13 = 1061997773(0x3f4ccccd, float:0.8)
            r8 = r6
            r9 = r7
            r10 = r6
            r11 = r7
            r12 = r6
            android.view.animation.TranslateAnimation r5 = new android.view.animation.TranslateAnimation
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r5.setDuration(r0)
            r2.startAnimation(r5)
            goto Laa
        Lc7:
            android.widget.ImageView r2 = r14.A01
            r2.setImageDrawable(r6)
            goto L7c
        Lcd:
            android.widget.ImageView r3 = r14.A00
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r7, r8)
            r2.setDuration(r0)
            r3.startAnimation(r2)
            goto L69
        Ldb:
            android.widget.ImageView r0 = r14.A00
            r0.setImageDrawable(r2)
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07710Zj.A01(X.0MJ):void");
    }
}
