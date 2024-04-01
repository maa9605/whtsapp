package X;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: X.1SD */
/* loaded from: classes.dex */
public class C1SD extends C11020h3 {
    public ColorStateList A00;
    public PorterDuff.Mode A01;
    public Drawable A02;
    public boolean A03;
    public boolean A04;
    public final SeekBar A05;

    public C1SD(SeekBar seekBar) {
        super(seekBar);
        this.A00 = null;
        this.A01 = null;
        this.A03 = false;
        this.A04 = false;
        this.A05 = seekBar;
    }

    @Override // X.C11020h3
    public void A01(AttributeSet attributeSet, int i) {
        super.A01(attributeSet, i);
        SeekBar seekBar = this.A05;
        C0V9 A00 = C0V9.A00(seekBar.getContext(), attributeSet, C0UY.A0B, i);
        Drawable A03 = A00.A03(0);
        if (A03 != null) {
            seekBar.setThumb(A03);
        }
        Drawable A02 = A00.A02(1);
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.A02 = A02;
        if (A02 != null) {
            A02.setCallback(seekBar);
            C07O.A0W(A02, C0AT.A05(seekBar));
            if (A02.isStateful()) {
                A02.setState(seekBar.getDrawableState());
            }
            A02();
        }
        seekBar.invalidate();
        TypedArray typedArray = A00.A02;
        if (typedArray.hasValue(3)) {
            this.A01 = C0YO.A00(typedArray.getInt(3, -1), this.A01);
            this.A04 = true;
        }
        if (typedArray.hasValue(2)) {
            this.A00 = A00.A01(2);
            this.A03 = true;
        }
        typedArray.recycle();
        A02();
    }

    public final void A02() {
        Drawable drawable = this.A02;
        if (drawable != null) {
            if (this.A03 || this.A04) {
                Drawable A0I = C07O.A0I(drawable.mutate());
                this.A02 = A0I;
                if (this.A03) {
                    C07O.A0Z(A0I, this.A00);
                }
                if (this.A04) {
                    C07O.A0a(this.A02, this.A01);
                }
                if (this.A02.isStateful()) {
                    this.A02.setState(this.A05.getDrawableState());
                }
            }
        }
    }
}
