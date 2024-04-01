package com.whatsapp.backup.google;

import X.C002301c;
import X.C02160Ac;
import X.C02180Ae;
import X.C08540bf;
import X.C2V8;
import X.C55762m9;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class GoogleDriveRestoreAnimationView extends C2V8 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Resources A05;
    public Paint A06;
    public Drawable A07;
    public Drawable A08;
    public Drawable A09;
    public C55762m9 A0A;
    public C002301c A0B;
    public boolean A0C;
    public boolean A0D;
    public final DecelerateInterpolator A0E;

    public GoogleDriveRestoreAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0E = new DecelerateInterpolator();
        this.A01 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C08540bf.A18, 0, 0);
            try {
                this.A09 = obtainStyledAttributes.getDrawable(this.A0B.A0N() ? 3 : 0);
                this.A07 = obtainStyledAttributes.getDrawable(this.A0B.A0N() ? 0 : 3);
                this.A0D = obtainStyledAttributes.getBoolean(2, false);
                this.A03 = obtainStyledAttributes.getColor(this.A0B.A0N() ? 4 : 1, 0);
                this.A02 = obtainStyledAttributes.getColor(this.A0B.A0N() ? 1 : 4, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        Resources resources = context.getResources();
        this.A05 = resources;
        Drawable drawable = this.A09;
        if (drawable == null) {
            drawable = resources.getDrawable(this.A0B.A0N() ? R.drawable.ill_backup_phone : R.drawable.ill_backup_restore);
            this.A09 = drawable;
        }
        this.A04 = drawable != null ? drawable.getIntrinsicWidth() : 0;
        if (this.A07 == null) {
            this.A07 = this.A05.getDrawable(this.A0B.A0N() ? R.drawable.ill_backup_restore : R.drawable.ill_backup_phone);
        }
        this.A09 = C02180Ae.A0Q(this.A09, this.A03);
        this.A07 = C02180Ae.A0Q(this.A07, this.A02);
        this.A06 = new Paint();
    }

    public void A00() {
        if (this.A0A == null) {
            A01();
        }
        this.A01 = 1;
        startAnimation(this.A0A);
    }

    public final void A01() {
        C55762m9 c55762m9 = new C55762m9(this);
        this.A0A = c55762m9;
        c55762m9.setDuration(2000L);
        this.A0A.setRepeatCount(-1);
        this.A0A.setInterpolator(new LinearInterpolator());
        this.A0A.setFillAfter(true);
    }

    public void A02(boolean z) {
        if (this.A0A == null) {
            A01();
        }
        clearAnimation();
        if (z) {
            this.A08 = C02180Ae.A0Q(this.A05.getDrawable(R.drawable.ic_restore_error), C02160Ac.A00(getContext(), R.color.googleDriveRestoreAnimationErrorIconTint));
            this.A01 = 3;
        } else {
            this.A09 = C02180Ae.A0Q(this.A05.getDrawable(R.drawable.ill_restore_anim), this.A03);
            this.A08 = C02180Ae.A0Q(this.A05.getDrawable(R.drawable.ill_restore_success_checkmark), C02160Ac.A00(getContext(), R.color.googleDriveRestoreAnimationSuccessIconTint));
            this.A01 = 2;
        }
        C55762m9 c55762m9 = this.A0A;
        if (c55762m9 != null) {
            c55762m9.setDuration(800L);
            startAnimation(this.A0A);
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C55762m9 c55762m9 = new C55762m9(this);
        this.A0A = c55762m9;
        c55762m9.setDuration(2000L);
        this.A0A.setRepeatCount(-1);
        this.A0A.setInterpolator(new LinearInterpolator());
        this.A0A.setFillAfter(true);
        startAnimation(this.A0A);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x01d5, code lost:
        if (r4 < (r2 - 0.5d)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0034, code lost:
        if (r0 == 3) goto L5;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDraw(android.graphics.Canvas r25) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.GoogleDriveRestoreAnimationView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        C55762m9 c55762m9;
        if (getVisibility() != 0) {
            clearAnimation();
        } else if (getAnimation() == null && (c55762m9 = this.A0A) != null) {
            startAnimation(c55762m9);
        }
    }
}
