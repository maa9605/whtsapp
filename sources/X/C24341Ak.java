package X;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;

/* renamed from: X.1Ak  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C24341Ak {
    public static final boolean A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ColorStateList A06;
    public ColorStateList A07;
    public ColorStateList A08;
    public PorterDuff.Mode A09;
    public Drawable A0A;
    public Drawable A0B;
    public GradientDrawable A0C;
    public GradientDrawable A0D;
    public GradientDrawable A0E;
    public GradientDrawable A0F;
    public GradientDrawable A0G;
    public final C31751cs A0L;
    public final Paint A0I = new Paint(1);
    public final Rect A0J = new Rect();
    public final RectF A0K = new RectF();
    public boolean A0H = false;

    static {
        A0M = Build.VERSION.SDK_INT >= 21;
    }

    public C24341Ak(C31751cs c31751cs) {
        this.A0L = c31751cs;
    }

    public final Drawable A00() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.A0C = gradientDrawable;
        gradientDrawable.setCornerRadius(this.A00 + 1.0E-5f);
        this.A0C.setColor(-1);
        A01();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.A0G = gradientDrawable2;
        gradientDrawable2.setCornerRadius(this.A00 + 1.0E-5f);
        this.A0G.setColor(0);
        this.A0G.setStroke(this.A05, this.A08);
        final InsetDrawable insetDrawable = new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{this.A0C, this.A0G}), this.A02, this.A04, this.A03, this.A01);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        this.A0E = gradientDrawable3;
        gradientDrawable3.setCornerRadius(this.A00 + 1.0E-5f);
        this.A0E.setColor(-1);
        final ColorStateList A01 = C08740bz.A01(this.A07);
        final GradientDrawable gradientDrawable4 = this.A0E;
        return new RippleDrawable(A01, insetDrawable, gradientDrawable4) { // from class: X.1Aj
            @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
            public void setColorFilter(ColorFilter colorFilter) {
                if (getDrawable(0) != null) {
                    ((LayerDrawable) ((InsetDrawable) getDrawable(0)).getDrawable()).getDrawable(0).setColorFilter(colorFilter);
                }
            }
        };
    }

    public final void A01() {
        GradientDrawable gradientDrawable = this.A0C;
        if (gradientDrawable != null) {
            C07O.A0Z(gradientDrawable, this.A06);
            PorterDuff.Mode mode = this.A09;
            if (mode != null) {
                C07O.A0a(this.A0C, mode);
            }
        }
    }
}
