package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;

/* renamed from: X.0vI  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19350vI {
    public final Paint A00;
    public final C29571Xk A01;
    public final C0vG A02;

    public C19350vI(C29571Xk c29571Xk, C0vG c0vG) {
        this.A01 = c29571Xk;
        this.A02 = c0vG;
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setColor(0);
        this.A00.setStyle(Paint.Style.FILL);
        this.A00.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public void A00(int i, Bitmap bitmap) {
        EnumC19280vA enumC19280vA = EnumC19280vA.NO_BLEND;
        EnumC19290vB enumC19290vB = EnumC19290vB.DISPOSE_TO_PREVIOUS;
        EnumC19290vB enumC19290vB2 = EnumC19290vB.DISPOSE_TO_BACKGROUND;
        Canvas canvas = new Canvas(bitmap);
        int i2 = 0;
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        if (A02(i)) {
            i2 = i;
        } else {
            int i3 = i - 1;
            while (true) {
                if (i3 < 0) {
                    break;
                }
                EnumC19340vH enumC19340vH = EnumC19340vH.REQUIRED;
                C19300vC[] c19300vCArr = this.A01.A09;
                C19300vC c19300vC = c19300vCArr[i3];
                EnumC19290vB enumC19290vB3 = c19300vC.A05;
                if (enumC19290vB3 != EnumC19290vB.DISPOSE_DO_NOT) {
                    if (enumC19290vB3 == enumC19290vB2) {
                        if (A03(c19300vC)) {
                            enumC19340vH = EnumC19340vH.NOT_REQUIRED;
                        }
                    } else {
                        enumC19340vH = enumC19290vB3 == enumC19290vB ? EnumC19340vH.SKIP : EnumC19340vH.ABORT;
                    }
                }
                int ordinal = enumC19340vH.ordinal();
                if (ordinal == 0) {
                    C19300vC c19300vC2 = c19300vCArr[i3];
                    AbstractC19030uj A8f = this.A02.A8f(i3);
                    if (A8f == null) {
                        if (A02(i3)) {
                            break;
                        }
                        i3--;
                    } else {
                        try {
                            canvas.drawBitmap((Bitmap) A8f.A04(), 0.0f, 0.0f, (Paint) null);
                            if (c19300vC2.A05 == enumC19290vB2) {
                                A01(canvas, c19300vC2);
                            }
                            i2 = i3 + 1;
                        } finally {
                            A8f.close();
                        }
                    }
                } else if (ordinal == 1) {
                    i2 = i3 + 1;
                    break;
                } else if (ordinal == 3) {
                    break;
                } else {
                    i3--;
                }
            }
            i2 = i3;
        }
        while (i2 < i) {
            C29571Xk c29571Xk = this.A01;
            C19300vC c19300vC3 = c29571Xk.A09[i2];
            EnumC19290vB enumC19290vB4 = c19300vC3.A05;
            if (enumC19290vB4 != enumC19290vB) {
                if (c19300vC3.A04 == enumC19280vA) {
                    A01(canvas, c19300vC3);
                }
                c29571Xk.A02(i2, canvas);
                if (enumC19290vB4 == enumC19290vB2) {
                    A01(canvas, c19300vC3);
                }
            }
            i2++;
        }
        C29571Xk c29571Xk2 = this.A01;
        C19300vC c19300vC4 = c29571Xk2.A09[i];
        if (c19300vC4.A04 == enumC19280vA) {
            A01(canvas, c19300vC4);
        }
        c29571Xk2.A02(i, canvas);
    }

    public final void A01(Canvas canvas, C19300vC c19300vC) {
        int i = c19300vC.A02;
        int i2 = c19300vC.A03;
        canvas.drawRect(i, i2, i + c19300vC.A01, i2 + c19300vC.A00, this.A00);
    }

    public final boolean A02(int i) {
        if (i == 0) {
            return true;
        }
        C19300vC[] c19300vCArr = this.A01.A09;
        C19300vC c19300vC = c19300vCArr[i];
        C19300vC c19300vC2 = c19300vCArr[i - 1];
        if (c19300vC.A04 == EnumC19280vA.NO_BLEND && A03(c19300vC)) {
            return true;
        }
        return c19300vC2.A05 == EnumC19290vB.DISPOSE_TO_BACKGROUND && A03(c19300vC2);
    }

    public final boolean A03(C19300vC c19300vC) {
        if (c19300vC.A02 == 0 && c19300vC.A03 == 0) {
            int i = c19300vC.A01;
            Rect rect = this.A01.A03;
            if (i == rect.width() && c19300vC.A00 == rect.height()) {
                return true;
            }
        }
        return false;
    }
}
