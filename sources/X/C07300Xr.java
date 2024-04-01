package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: X.0Xr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07300Xr extends Drawable.ConstantState {
    public int A00;
    public int A01;
    public ColorStateList A02;
    public ColorStateList A03;
    public Bitmap A04;
    public Paint A05;
    public PorterDuff.Mode A06;
    public PorterDuff.Mode A07;
    public C07320Xt A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public C07300Xr() {
        this.A03 = null;
        this.A07 = C07280Xp.A08;
        this.A08 = new C07320Xt();
    }

    public C07300Xr(C07300Xr c07300Xr) {
        this.A03 = null;
        this.A07 = C07280Xp.A08;
        if (c07300Xr != null) {
            this.A01 = c07300Xr.A01;
            C07320Xt c07320Xt = new C07320Xt(c07300Xr.A08);
            this.A08 = c07320Xt;
            Paint paint = c07300Xr.A08.A06;
            if (paint != null) {
                c07320Xt.A06 = new Paint(paint);
            }
            Paint paint2 = c07300Xr.A08.A07;
            if (paint2 != null) {
                this.A08.A07 = new Paint(paint2);
            }
            this.A03 = c07300Xr.A03;
            this.A07 = c07300Xr.A07;
            this.A09 = c07300Xr.A09;
        }
    }

    public void A00(int i, int i2) {
        this.A04.eraseColor(0);
        Canvas canvas = new Canvas(this.A04);
        C07320Xt c07320Xt = this.A08;
        c07320Xt.A00(c07320Xt.A0F, C07320Xt.A0G, canvas, i, i2);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new C07280Xp(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new C07280Xp(this);
    }
}
