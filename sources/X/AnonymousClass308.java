package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.308 */
/* loaded from: classes2.dex */
public abstract class AnonymousClass308 {
    public boolean A00 = false;
    public final Resources A01;
    public final Paint A02;
    public final RectF A03;
    public final Handler A04;
    public final Vibrator A05;
    public final View A06;
    public final ViewGroup A07;
    public final Runnable A08;
    public final Runnable A09;

    public AnonymousClass308(Handler handler, ViewGroup viewGroup, RectF rectF, Vibrator vibrator) {
        int i;
        this.A04 = handler;
        this.A07 = viewGroup;
        this.A03 = rectF;
        this.A05 = vibrator;
        this.A01 = viewGroup.getResources();
        Paint paint = new Paint();
        Resources resources = this.A01;
        if (!(this instanceof C3HA)) {
            i = R.color.status_grid_center;
        } else {
            i = R.color.status_grid_rotation;
        }
        paint.setColor(resources.getColor(i));
        paint.setStrokeWidth(this.A01.getDimensionPixelSize(R.dimen.media_guideline_stroke_width));
        paint.setStyle(Paint.Style.STROKE);
        this.A02 = paint;
        View view = new View(viewGroup.getContext()) { // from class: X.307
            {
                AnonymousClass308.this = this;
            }

            @Override // android.view.View
            public void onDraw(Canvas canvas) {
                Path path;
                int i2;
                float f;
                float f2;
                float f3;
                float f4;
                super.onDraw(canvas);
                AnonymousClass308 anonymousClass308 = AnonymousClass308.this;
                if (!(anonymousClass308 instanceof C3HA)) {
                    path = ((C3H9) anonymousClass308).A01;
                } else {
                    C3HA c3ha = (C3HA) anonymousClass308;
                    PointF pointF = c3ha.A02;
                    path = null;
                    if (pointF != null && (i2 = c3ha.A01) != -1) {
                        if (i2 == 0) {
                            RectF rectF2 = ((AnonymousClass308) c3ha).A03;
                            f = rectF2.left;
                            f2 = pointF.y;
                            f3 = rectF2.right;
                            f4 = f2;
                        } else if (i2 == 1) {
                            float f5 = pointF.y - pointF.x;
                            RectF rectF3 = ((AnonymousClass308) c3ha).A03;
                            f = rectF3.left;
                            float f6 = f5 + f;
                            f2 = rectF3.top;
                            if (f6 >= f2) {
                                f2 = f6;
                            } else {
                                f = f2 - f5;
                            }
                            f3 = rectF3.right;
                            float f7 = f5 + f3;
                            f4 = rectF3.bottom;
                            if (f7 <= f4) {
                                f4 = f7;
                            } else {
                                f3 = f4 - f5;
                            }
                        } else if (i2 == 2) {
                            f = pointF.x;
                            RectF rectF4 = ((AnonymousClass308) c3ha).A03;
                            f2 = rectF4.top;
                            f4 = rectF4.bottom;
                            f3 = f;
                        } else if (i2 == 3) {
                            float f8 = pointF.y + pointF.x;
                            RectF rectF5 = ((AnonymousClass308) c3ha).A03;
                            f = rectF5.left;
                            float f9 = f8 - f;
                            f2 = rectF5.bottom;
                            if (f9 <= f2) {
                                f2 = f9;
                            } else {
                                f = f8 - f2;
                            }
                            f3 = rectF5.right;
                            float f10 = f8 - f3;
                            f4 = rectF5.top;
                            if (f10 >= f4) {
                                f4 = f10;
                            } else {
                                f3 = f8 - f4;
                            }
                        }
                        path = new Path();
                        path.rewind();
                        path.moveTo(f, f2);
                        path.lineTo(f3, f4);
                    }
                }
                if (path != null) {
                    canvas.drawPath(path, anonymousClass308.A02);
                }
            }
        };
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        view.setVisibility(4);
        this.A06 = view;
        viewGroup.addView(view, 0);
        View view2 = this.A06;
        this.A09 = new RunnableC62012xC(view2, 0, 0.0f, 1.0f);
        this.A08 = new RunnableC62012xC(view2, 4, 1.0f, 0.0f);
    }

    public void A00() {
        Handler handler = this.A04;
        handler.removeCallbacks(this.A09);
        handler.post(this.A08);
        this.A00 = false;
    }

    public void A01() {
        Vibrator vibrator;
        Handler handler = this.A04;
        handler.removeCallbacks(this.A08);
        handler.post(this.A09);
        if (!this.A00 && (vibrator = this.A05) != null) {
            try {
                vibrator.vibrate(3L);
            } catch (NullPointerException e) {
                Log.e("Vibrator is broken on this device.", e);
            }
        }
        this.A00 = true;
    }
}
