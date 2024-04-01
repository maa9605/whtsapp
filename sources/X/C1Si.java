package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.CardView;

/* renamed from: X.1Si  reason: invalid class name */
/* loaded from: classes.dex */
public class C1Si implements InterfaceC11960id {
    public final RectF A00 = new RectF();

    @Override // X.InterfaceC11960id
    public void AIj(InterfaceC11950ic interfaceC11950ic) {
    }

    public void A00(InterfaceC11950ic interfaceC11950ic) {
        Rect rect = new Rect();
        C28481Se c28481Se = (C28481Se) interfaceC11950ic;
        ((C11990ig) c28481Se.A00).getPadding(rect);
        int ceil = (int) Math.ceil(ABS(interfaceC11950ic));
        int ceil2 = (int) Math.ceil(ABQ(interfaceC11950ic));
        CardView cardView = c28481Se.A01;
        if (ceil > cardView.A01) {
            super/*android.widget.FrameLayout*/.setMinimumWidth(ceil);
        }
        if (ceil2 > cardView.A00) {
            super/*android.widget.FrameLayout*/.setMinimumHeight(ceil2);
        }
        c28481Se.A00(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // X.InterfaceC11960id
    public ColorStateList A8U(InterfaceC11950ic interfaceC11950ic) {
        return ((C11990ig) ((C28481Se) interfaceC11950ic).A00).A04;
    }

    @Override // X.InterfaceC11960id
    public float A9u(InterfaceC11950ic interfaceC11950ic) {
        return ((C11990ig) ((C28481Se) interfaceC11950ic).A00).A02;
    }

    @Override // X.InterfaceC11960id
    public float AB4(InterfaceC11950ic interfaceC11950ic) {
        return ((C11990ig) ((C28481Se) interfaceC11950ic).A00).A01;
    }

    @Override // X.InterfaceC11960id
    public float ABQ(InterfaceC11950ic interfaceC11950ic) {
        C11990ig c11990ig = (C11990ig) ((C28481Se) interfaceC11950ic).A00;
        float f = c11990ig.A01;
        float f2 = c11990ig.A00;
        float f3 = c11990ig.A0C;
        float f4 = f * 1.5f;
        return ((f4 + f3) * 2.0f) + (Math.max(f, (f4 / 2.0f) + f2 + f3) * 2.0f);
    }

    @Override // X.InterfaceC11960id
    public float ABS(InterfaceC11950ic interfaceC11950ic) {
        C11990ig c11990ig = (C11990ig) ((C28481Se) interfaceC11950ic).A00;
        float f = c11990ig.A01;
        float f2 = c11990ig.A00;
        float f3 = c11990ig.A0C;
        return ((f + f3) * 2.0f) + (Math.max(f, (f / 2.0f) + f2 + f3) * 2.0f);
    }

    @Override // X.InterfaceC11960id
    public float ACh(InterfaceC11950ic interfaceC11950ic) {
        return ((C11990ig) ((C28481Se) interfaceC11950ic).A00).A00;
    }

    @Override // X.InterfaceC11960id
    public void AEw() {
        C11990ig.A0G = new InterfaceC11980if() { // from class: X.1Sh
            @Override // X.InterfaceC11980if
            public void A7U(Canvas canvas, RectF rectF, float f, Paint paint) {
                float f2 = 2.0f * f;
                float width = (rectF.width() - f2) - 1.0f;
                float height = (rectF.height() - f2) - 1.0f;
                if (f >= 1.0f) {
                    float f3 = f + 0.5f;
                    RectF rectF2 = C1Si.this.A00;
                    float f4 = -f3;
                    rectF2.set(f4, f4, f3, f3);
                    int save = canvas.save();
                    canvas.translate(rectF.left + f3, rectF.top + f3);
                    canvas.drawArc(rectF2, 180.0f, 90.0f, true, paint);
                    canvas.translate(width, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(rectF2, 180.0f, 90.0f, true, paint);
                    canvas.translate(height, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(rectF2, 180.0f, 90.0f, true, paint);
                    canvas.translate(width, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(rectF2, 180.0f, 90.0f, true, paint);
                    canvas.restoreToCount(save);
                    float f5 = rectF.top;
                    canvas.drawRect((rectF.left + f3) - 1.0f, f5, (rectF.right - f3) + 1.0f, f5 + f3, paint);
                    float f6 = rectF.bottom;
                    canvas.drawRect((rectF.left + f3) - 1.0f, f6 - f3, (rectF.right - f3) + 1.0f, f6, paint);
                }
                canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
            }
        };
    }

    @Override // X.InterfaceC11960id
    public void AF0(InterfaceC11950ic interfaceC11950ic, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C11990ig c11990ig = new C11990ig(context.getResources(), colorStateList, f, f2, f3);
        C28481Se c28481Se = (C28481Se) interfaceC11950ic;
        CardView cardView = c28481Se.A01;
        c11990ig.A09 = cardView.A03;
        c11990ig.invalidateSelf();
        c28481Se.A00 = c11990ig;
        cardView.setBackgroundDrawable(c11990ig);
        A00(c28481Se);
    }

    @Override // X.InterfaceC11960id
    public void ANI(InterfaceC11950ic interfaceC11950ic) {
        C28481Se c28481Se = (C28481Se) interfaceC11950ic;
        C11990ig c11990ig = (C11990ig) c28481Se.A00;
        c11990ig.A09 = c28481Se.A01.A03;
        c11990ig.invalidateSelf();
        A00(c28481Se);
    }

    @Override // X.InterfaceC11960id
    public void ASj(InterfaceC11950ic interfaceC11950ic, ColorStateList colorStateList) {
        C11990ig c11990ig = (C11990ig) ((C28481Se) interfaceC11950ic).A00;
        c11990ig.A02(colorStateList);
        c11990ig.invalidateSelf();
    }

    @Override // X.InterfaceC11960id
    public void AT0(InterfaceC11950ic interfaceC11950ic, float f) {
        C11990ig c11990ig = (C11990ig) ((C28481Se) interfaceC11950ic).A00;
        c11990ig.A01(f, c11990ig.A01);
    }

    @Override // X.InterfaceC11960id
    public void ATJ(InterfaceC11950ic interfaceC11950ic, float f) {
        C11990ig c11990ig = (C11990ig) ((C28481Se) interfaceC11950ic).A00;
        c11990ig.A01(c11990ig.A02, f);
        A00(interfaceC11950ic);
    }

    @Override // X.InterfaceC11960id
    public void ATk(InterfaceC11950ic interfaceC11950ic, float f) {
        C11990ig c11990ig = (C11990ig) ((C28481Se) interfaceC11950ic).A00;
        if (c11990ig == null) {
            throw null;
        }
        if (f >= 0.0f) {
            float f2 = (int) (f + 0.5f);
            if (c11990ig.A00 != f2) {
                c11990ig.A00 = f2;
                c11990ig.A0A = true;
                c11990ig.invalidateSelf();
            }
            A00(interfaceC11950ic);
            return;
        }
        StringBuilder sb = new StringBuilder("Invalid radius ");
        sb.append(f);
        sb.append(". Must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }
}
