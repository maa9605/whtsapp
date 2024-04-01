package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: X.2vq */
/* loaded from: classes2.dex */
public class GestureDetector$OnGestureListenerC61252vq implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public float A00;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public Context A07;
    public Matrix A08;
    public ScaleGestureDetector A0F;
    public View.OnClickListener A0G;
    public View A0H;
    public C13090ka A0I;
    public RunnableC61232vo A0J;
    public RunnableC61242vp A0K;
    public C3H5 A0L;
    public RunnableEBaseShape0S0220102_I0 A0M;
    public RunnableEBaseShape0S0220102_I0 A0N;
    public boolean A0O;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public Matrix A09 = new Matrix();
    public Matrix A0A = new Matrix();
    public boolean A0P = true;
    public float A01 = Float.MAX_VALUE;
    public float A06 = 0.8f;
    public RectF A0C = new RectF();
    public RectF A0D = new RectF();
    public RectF A0E = new RectF();
    public PointF A0B = new PointF();
    public final Runnable A0V = new RunnableEBaseShape8S0100000_I1_0(this, 27);

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public GestureDetector$OnGestureListenerC61252vq(Context context, View view, C3H5 c3h5) {
        final int applyDimension;
        this.A07 = context;
        this.A0H = view;
        this.A0L = c3h5;
        this.A0I = new C13090ka(context, this);
        Resources resources = this.A07.getResources();
        try {
            applyDimension = resources.getDimensionPixelSize(resources.getIdentifier("config_minScalingSpan", "dimen", "android"));
        } catch (Resources.NotFoundException unused) {
            applyDimension = (int) TypedValue.applyDimension(5, 27.0f, resources.getDisplayMetrics());
        }
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(this.A07, this) { // from class: X.2vn
            @Override // android.view.ScaleGestureDetector
            public boolean onTouchEvent(MotionEvent motionEvent) {
                int pointerCount = motionEvent.getPointerCount();
                if (motionEvent.getPointerCount() > 1) {
                    float f = 0.0f;
                    float f2 = 0.0f;
                    float f3 = 0.0f;
                    for (int i = 0; i < pointerCount; i++) {
                        f2 += motionEvent.getX(i);
                        f3 += motionEvent.getY(i);
                    }
                    float f4 = pointerCount;
                    float f5 = f2 / f4;
                    float f6 = f3 / f4;
                    float f7 = 0.0f;
                    for (int i2 = 0; i2 < pointerCount; i2++) {
                        f += Math.abs(motionEvent.getX(i2) - f5);
                        f7 += Math.abs(motionEvent.getY(i2) - f6);
                    }
                    if (((float) Math.hypot((f / f4) * 2.0f, (f7 / f4) * 2.0f)) <= applyDimension) {
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.A0F = scaleGestureDetector;
        if (Build.VERSION.SDK_INT >= 19) {
            scaleGestureDetector.setQuickScaleEnabled(false);
        }
        View view2 = this.A0H;
        this.A0J = new RunnableC61232vo(view2, this);
        this.A0N = new RunnableEBaseShape0S0220102_I0(view2, this, 1);
        this.A0M = new RunnableEBaseShape0S0220102_I0(view2, this, 0);
        this.A0K = new RunnableC61242vp(view2, this);
    }

    public final void A00() {
        if (this.A0Q) {
            float width = this.A0C.width();
            float height = this.A0C.height();
            float width2 = (this.A0H.getWidth() - this.A0H.getPaddingLeft()) - this.A0H.getPaddingRight();
            float height2 = (this.A0H.getHeight() - this.A0H.getPaddingTop()) - this.A0H.getPaddingBottom();
            this.A04 = 0.0f;
            this.A09.reset();
            this.A0D.set(0.0f, 0.0f, width2, height2);
            float f = width2 / width;
            float f2 = height2 / height;
            float min = Math.min(f, f2);
            this.A03 = min;
            float min2 = Math.min(min, Float.MAX_VALUE);
            this.A03 = min2;
            if (Math.abs((f / f2) - 1.0f) < 0.0f) {
                min2 = Math.max(f, f2);
                this.A04 = min2;
            }
            this.A00 = Math.min(min2, Float.MAX_VALUE);
            this.A04 = Math.min(this.A04, Float.MAX_VALUE);
            this.A02 = Math.max(min2 * 8.0f, 8.0f);
            float f3 = width / 2.0f;
            float f4 = height / 2.0f;
            this.A09.setTranslate((width2 / 2.0f) - f3, (height2 / 2.0f) - f4);
            Matrix matrix = this.A09;
            float f5 = this.A00;
            matrix.preScale(f5, f5, f3, f4);
            this.A05 = this.A00;
            this.A0A.set(this.A09);
            Matrix matrix2 = this.A09;
            this.A08 = matrix2;
            this.A0L.A00(matrix2);
        }
    }

    public final void A01(float f, float f2, float f3) {
        float min = Math.min(Math.max(f, this.A03 * 0.8f), this.A02);
        float f4 = min / this.A00;
        this.A09.postScale(f4, f4, f2, f3);
        this.A00 = min;
        A02(true);
        this.A0L.A00(this.A09);
    }

    public final void A02(boolean z) {
        float f;
        this.A0E.set(this.A0C);
        this.A09.mapRect(this.A0E);
        float width = this.A0H.getWidth();
        RectF rectF = this.A0E;
        float f2 = rectF.left;
        float f3 = rectF.right;
        float f4 = 0.0f;
        float f5 = width - 0.0f;
        if (f3 - f2 < f5) {
            f = ((f5 - (f3 + f2)) / 2.0f) + 0.0f;
        } else {
            f = f2 > 0.0f ? 0.0f - f2 : f3 < width ? width - f3 : 0.0f;
        }
        float height = this.A0H.getHeight();
        RectF rectF2 = this.A0E;
        float f6 = rectF2.top;
        float f7 = rectF2.bottom;
        float f8 = height - 0.0f;
        if (f7 - f6 < f8) {
            f4 = 0.0f + ((f8 - (f7 + f6)) / 2.0f);
        } else if (f6 > 0.0f) {
            f4 = 0.0f - f6;
        } else if (f7 < height) {
            f4 = height - f7;
        }
        if ((Math.abs(f) > 20.0f || Math.abs(f4) > 20.0f) && !z) {
            RunnableEBaseShape0S0220102_I0 runnableEBaseShape0S0220102_I0 = this.A0M;
            if (runnableEBaseShape0S0220102_I0 != null && !runnableEBaseShape0S0220102_I0.A05) {
                runnableEBaseShape0S0220102_I0.A02 = -1L;
                runnableEBaseShape0S0220102_I0.A00 = f;
                runnableEBaseShape0S0220102_I0.A01 = f4;
                runnableEBaseShape0S0220102_I0.A06 = false;
                runnableEBaseShape0S0220102_I0.A05 = true;
                ((View) runnableEBaseShape0S0220102_I0.A04).postDelayed(runnableEBaseShape0S0220102_I0, 250L);
                return;
            }
            return;
        }
        this.A09.postTranslate(f, f4);
        this.A0L.A00(this.A09);
    }

    public final boolean A03(float f, float f2) {
        this.A0E.set(this.A0C);
        this.A09.mapRect(this.A0E);
        float width = this.A0H.getWidth();
        RectF rectF = this.A0E;
        float f3 = rectF.left;
        float f4 = rectF.right;
        float f5 = width - 0.0f;
        float max = f4 - f3 < f5 ? ((f5 - (f4 + f3)) / 2.0f) + 0.0f : Math.max(width - f4, Math.min(0.0f - f3, f));
        float height = this.A0H.getHeight();
        RectF rectF2 = this.A0E;
        float f6 = rectF2.top;
        float f7 = rectF2.bottom;
        float f8 = height - 0.0f;
        float max2 = f7 - f6 < f8 ? ((f8 - (f7 + f6)) / 2.0f) + 0.0f : Math.max(height - f7, Math.min(0.0f - f6, f2));
        this.A09.postTranslate(max, max2);
        this.A0L.A00(this.A09);
        return max == f && max2 == f2;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (!this.A0U) {
            return false;
        }
        if (!this.A0O) {
            float f = this.A00;
            float f2 = this.A03;
            if (f == f2) {
                f2 *= 2.0f;
            }
            float min = Math.min(this.A02, Math.max(f2, f2));
            RunnableC61232vo runnableC61232vo = this.A0J;
            if (runnableC61232vo != null) {
                if (min == f2) {
                    runnableC61232vo.A00(f, min, this.A0H.getWidth() >> 1, this.A0H.getHeight() >> 1, 200L);
                } else {
                    runnableC61232vo.A00(f, min, motionEvent.getX(), motionEvent.getY(), 200L);
                }
            }
        }
        this.A0O = false;
        this.A0L.A01(this.A00 != this.A03);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (this.A0U) {
            RunnableEBaseShape0S0220102_I0 runnableEBaseShape0S0220102_I0 = this.A0N;
            if (runnableEBaseShape0S0220102_I0 != null) {
                runnableEBaseShape0S0220102_I0.A05 = false;
                runnableEBaseShape0S0220102_I0.A06 = true;
            }
            RunnableEBaseShape0S0220102_I0 runnableEBaseShape0S0220102_I02 = this.A0M;
            if (runnableEBaseShape0S0220102_I02 != null) {
                runnableEBaseShape0S0220102_I02.A05 = false;
                runnableEBaseShape0S0220102_I02.A06 = true;
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        RunnableEBaseShape0S0220102_I0 runnableEBaseShape0S0220102_I0;
        if (this.A0U && (runnableEBaseShape0S0220102_I0 = this.A0N) != null && !runnableEBaseShape0S0220102_I0.A05) {
            runnableEBaseShape0S0220102_I0.A02 = -1L;
            runnableEBaseShape0S0220102_I0.A00 = f;
            runnableEBaseShape0S0220102_I0.A01 = f2;
            runnableEBaseShape0S0220102_I0.A06 = false;
            runnableEBaseShape0S0220102_I0.A05 = true;
            ((View) runnableEBaseShape0S0220102_I0.A04).post(runnableEBaseShape0S0220102_I0);
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.A0U) {
            this.A0R = false;
            this.A0T = true;
            A01(scaleGestureDetector.getScaleFactor() * this.A00, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (this.A0U) {
            RunnableC61232vo runnableC61232vo = this.A0J;
            if (runnableC61232vo != null) {
                runnableC61232vo.A06 = false;
                runnableC61232vo.A07 = true;
            }
            this.A0R = true;
            this.A0L.A01(this.A00 <= this.A03);
            return true;
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        RunnableC61232vo runnableC61232vo;
        if (this.A0U) {
            this.A0T = false;
            if (this.A0R) {
                this.A0O = true;
                this.A09.set(this.A0A);
                this.A00 = this.A05;
                this.A0L.A00(this.A09);
            }
        }
        float f = this.A00;
        float f2 = this.A03;
        if (f < f2 && (runnableC61232vo = this.A0J) != null) {
            runnableC61232vo.A00(f, f2, this.A0H.getWidth() >> 1, this.A0H.getHeight() >> 1, 100L);
        }
        this.A0L.A01(this.A00 <= this.A03);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.A0U) {
            this.A0S = true;
            A03(-f, -f2);
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.A0G != null && !this.A0R) {
            motionEvent.getX();
            motionEvent.getY();
            View.OnClickListener onClickListener = this.A0G;
            if (onClickListener != null) {
                onClickListener.onClick(this.A0H);
            }
        }
        this.A0R = false;
        return true;
    }
}
