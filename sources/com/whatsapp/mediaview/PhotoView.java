package com.whatsapp.mediaview;

import X.AnonymousClass088;
import X.C13090ka;
import X.C2GY;
import X.C31F;
import X.C31G;
import X.C31H;
import X.C31I;
import X.C3IJ;
import X.C3IK;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.InteractiveAnnotation;

/* loaded from: classes2.dex */
public class PhotoView extends C2GY implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public int A09;
    public Matrix A0A;
    public Matrix A0B;
    public Matrix A0C;
    public Paint A0D;
    public PointF A0E;
    public Rect A0F;
    public RectF A0G;
    public RectF A0H;
    public RectF A0I;
    public BitmapDrawable A0J;
    public Drawable A0K;
    public ScaleGestureDetector A0L;
    public View.OnClickListener A0M;
    public C13090ka A0N;
    public C31G A0O;
    public C31H A0P;
    public C31I A0Q;
    public RunnableEBaseShape0S0120102_I0 A0R;
    public RunnableEBaseShape0S0120102_I0 A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public final Runnable A0Z;

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

    public PhotoView(Context context) {
        super(context);
        this.A0B = new Matrix();
        this.A0C = new Matrix();
        this.A0T = false;
        this.A0V = true;
        this.A02 = Float.MAX_VALUE;
        this.A0D = new Paint();
        this.A0F = new Rect();
        this.A09 = 0;
        this.A08 = 0.8f;
        this.A0H = new RectF();
        this.A0G = new RectF();
        this.A0I = new RectF();
        this.A0E = new PointF();
        this.A0Z = new RunnableEBaseShape4S0100000_I0_4(this, 14);
        A03();
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0B = new Matrix();
        this.A0C = new Matrix();
        this.A0T = false;
        this.A0V = true;
        this.A02 = Float.MAX_VALUE;
        this.A0D = new Paint();
        this.A0F = new Rect();
        this.A09 = 0;
        this.A08 = 0.8f;
        this.A0H = new RectF();
        this.A0G = new RectF();
        this.A0I = new RectF();
        this.A0E = new PointF();
        this.A0Z = new RunnableEBaseShape4S0100000_I0_4(this, 14);
        A03();
    }

    public static void A00(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                A00(viewGroup.getChildAt(i));
            }
        } else if (view instanceof PhotoView) {
            ((PhotoView) view).A01();
        }
    }

    public void A01() {
        this.A0N = null;
        this.A0L = null;
        this.A0J = null;
        setImageDrawable(null);
        C31H c31h = this.A0P;
        if (c31h != null) {
            c31h.A06 = false;
            c31h.A07 = true;
        }
        this.A0P = null;
        RunnableEBaseShape0S0120102_I0 runnableEBaseShape0S0120102_I0 = this.A0S;
        if (runnableEBaseShape0S0120102_I0 != null) {
            runnableEBaseShape0S0120102_I0.A04 = false;
            runnableEBaseShape0S0120102_I0.A05 = true;
        }
        this.A0S = null;
        RunnableEBaseShape0S0120102_I0 runnableEBaseShape0S0120102_I02 = this.A0R;
        if (runnableEBaseShape0S0120102_I02 != null) {
            runnableEBaseShape0S0120102_I02.A04 = false;
            runnableEBaseShape0S0120102_I02.A05 = true;
        }
        this.A0R = null;
        C31G c31g = this.A0O;
        if (c31g != null) {
            c31g.A02 = true;
            PhotoView photoView = c31g.A03;
            photoView.A07 = Math.round(photoView.A07);
            photoView.A08(true);
            photoView.requestLayout();
            photoView.invalidate();
        }
        this.A0O = null;
        C31I c31i = this.A0Q;
        if (c31i != null) {
            c31i.A01 = true;
        }
        this.A0Q = null;
        setOnClickListener(null);
        this.A0M = null;
    }

    public void A02() {
        this.A0B.set(this.A0C);
        this.A00 = this.A06;
        setImageMatrix(this.A0B);
    }

    public final void A03() {
        Context context = getContext();
        this.A0N = new C13090ka(context, this);
        final int scaledMinScalingSpan = getScaledMinScalingSpan();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this) { // from class: X.31E
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
                    if (((float) Math.hypot((f / f4) * 2.0f, (f7 / f4) * 2.0f)) <= scaledMinScalingSpan) {
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.A0L = scaleGestureDetector;
        if (Build.VERSION.SDK_INT >= 19) {
            scaleGestureDetector.setQuickScaleEnabled(false);
        }
        this.A0P = new C31H(this);
        this.A0S = new RunnableEBaseShape0S0120102_I0(this, 1);
        this.A0R = new RunnableEBaseShape0S0120102_I0(this, 0);
        this.A0O = new C31G(this);
        this.A0Q = new C31I(this);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void A04(float f, float f2) {
        View.OnClickListener onClickListener = this.A0M;
        if (onClickListener != null) {
            if (onClickListener instanceof C31F) {
                C3IJ c3ij = (C3IJ) ((C31F) onClickListener);
                Bitmap photo = c3ij.A00.A01.getPhoto();
                if (photo != null) {
                    Matrix matrix = new Matrix();
                    C3IK c3ik = c3ij.A00;
                    PhotoView photoView = c3ik.A01;
                    photoView.getImageMatrix().invert(matrix);
                    float[] fArr = {f, f2};
                    float[] fArr2 = {photo.getWidth(), photo.getHeight()};
                    matrix.mapPoints(fArr);
                    InteractiveAnnotation A0i = AnonymousClass088.A0i(c3ij.A01, fArr, fArr2);
                    if (A0i != null) {
                        MediaViewFragment.A04(c3ik.A00, A0i, photoView);
                        return;
                    }
                }
                MediaViewFragment mediaViewFragment = c3ij.A00.A00;
                mediaViewFragment.A1A(!((MediaViewBaseFragment) mediaViewFragment).A0G, true);
                return;
            }
            onClickListener.onClick(this);
        }
    }

    public final void A05(float f, float f2, float f3) {
        float min = Math.min(Math.max(f, this.A04 * this.A08), this.A03);
        float f4 = min / this.A00;
        this.A0B.postRotate(-this.A07, getWidth() >> 1, getHeight() >> 1);
        this.A0B.postScale(f4, f4, f2, f3);
        this.A00 = min;
        this.A0B.postRotate(this.A07, getWidth() >> 1, getHeight() >> 1);
        A09(true);
        setImageMatrix(this.A0B);
    }

    public void A06(Bitmap bitmap) {
        A07(bitmap == null ? null : new BitmapDrawable(getResources(), bitmap));
    }

    public void A07(BitmapDrawable bitmapDrawable) {
        BitmapDrawable bitmapDrawable2 = this.A0J;
        if (bitmapDrawable == bitmapDrawable2) {
            return;
        }
        boolean z = false;
        if (bitmapDrawable2 != null) {
            z = (bitmapDrawable != null && bitmapDrawable2.getIntrinsicWidth() == bitmapDrawable.getIntrinsicWidth() && this.A0J.getIntrinsicHeight() == bitmapDrawable.getIntrinsicHeight()) ? true : true;
            this.A04 = 0.0f;
        }
        this.A0J = bitmapDrawable;
        setImageDrawable(bitmapDrawable);
        A08(z);
        invalidate();
    }

    public final void A08(boolean z) {
        float abs;
        float min;
        BitmapDrawable bitmapDrawable = this.A0J;
        if (bitmapDrawable == null || !this.A0W) {
            return;
        }
        this.A0J.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), this.A0J.getIntrinsicHeight());
        if (z || (this.A04 == 0.0f && this.A0J != null && this.A0W)) {
            float intrinsicWidth = this.A0J.getIntrinsicWidth();
            float intrinsicHeight = this.A0J.getIntrinsicHeight();
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            this.A05 = 0.0f;
            this.A0B.reset();
            this.A0H.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            this.A0G.set(0.0f, 0.0f, width, height);
            float f = intrinsicWidth / 2.0f;
            float f2 = intrinsicHeight / 2.0f;
            this.A0B.setTranslate((width / 2.0f) - f, (height / 2.0f) - f2);
            if (this.A0T) {
                abs = Math.abs(this.A07 % 180.0f);
                if (abs == 90.0f) {
                    min = Math.max(width / intrinsicHeight, height / intrinsicWidth);
                } else {
                    min = Math.max(width / intrinsicWidth, height / intrinsicHeight);
                }
                this.A04 = min;
            } else {
                abs = Math.abs(this.A07 % 180.0f);
                if (abs == 90.0f) {
                    min = Math.min(width / intrinsicHeight, height / intrinsicWidth);
                } else {
                    min = Math.min(width / intrinsicWidth, height / intrinsicHeight);
                }
                this.A04 = min;
            }
            float f3 = this.A02;
            float min2 = Math.min(min, f3);
            this.A04 = min2;
            int i = this.A09;
            if (i == 3) {
                if (abs == 90.0f) {
                    min2 = Math.max(width / intrinsicHeight, height / intrinsicWidth);
                } else {
                    min2 = Math.max(width / intrinsicWidth, height / intrinsicHeight);
                }
            } else if (i == 1) {
                min2 = abs == 90.0f ? width / intrinsicHeight : width / intrinsicWidth;
            } else if (i == 2) {
                min2 = abs == 90.0f ? height / intrinsicWidth : height / intrinsicHeight;
            }
            if (abs == 90.0f) {
                float f4 = width / intrinsicHeight;
                float f5 = height / intrinsicWidth;
                if (Math.abs((f4 / f5) - 1.0f) < this.A01) {
                    min2 = Math.max(f4, f5);
                    this.A05 = min2;
                }
            } else {
                float f6 = width / intrinsicWidth;
                float f7 = height / intrinsicHeight;
                if (Math.abs((f6 / f7) - 1.0f) < this.A01) {
                    min2 = Math.max(f6, f7);
                    this.A05 = min2;
                }
            }
            float min3 = Math.min(min2, f3);
            this.A00 = min3;
            this.A05 = Math.min(this.A05, f3);
            this.A0B.preScale(min3, min3, f, f2);
            this.A03 = Math.max(this.A04 * 8.0f, 8.0f);
            this.A0B.postRotate(this.A07, getWidth() / 2, getHeight() / 2);
            this.A06 = this.A00;
            this.A0C.set(this.A0B);
        }
        Matrix matrix = this.A0B;
        this.A0A = matrix;
        setImageMatrix(matrix);
    }

    public final void A09(boolean z) {
        float f;
        this.A0I.set(this.A0H);
        this.A0B.mapRect(this.A0I);
        float width = getWidth();
        RectF rectF = this.A0I;
        float f2 = rectF.left;
        float f3 = rectF.right;
        float f4 = 0.0f;
        float f5 = width - 0.0f;
        if (f3 - f2 < f5) {
            f = ((f5 - (f3 + f2)) / 2.0f) + 0.0f;
        } else {
            f = f2 > 0.0f ? 0.0f - f2 : f3 < width ? width - f3 : 0.0f;
        }
        float height = getHeight();
        RectF rectF2 = this.A0I;
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
            RunnableEBaseShape0S0120102_I0 runnableEBaseShape0S0120102_I0 = this.A0R;
            if (runnableEBaseShape0S0120102_I0 != null && !runnableEBaseShape0S0120102_I0.A04) {
                runnableEBaseShape0S0120102_I0.A02 = -1L;
                runnableEBaseShape0S0120102_I0.A00 = f;
                runnableEBaseShape0S0120102_I0.A01 = f4;
                runnableEBaseShape0S0120102_I0.A05 = false;
                runnableEBaseShape0S0120102_I0.A04 = true;
                ((View) runnableEBaseShape0S0120102_I0.A03).postDelayed(runnableEBaseShape0S0120102_I0, 250L);
                return;
            }
            return;
        }
        this.A0B.postTranslate(f, f4);
        setImageMatrix(this.A0B);
    }

    public boolean A0A() {
        if (this.A0Y) {
            RunnableEBaseShape0S0120102_I0 runnableEBaseShape0S0120102_I0 = this.A0S;
            if (runnableEBaseShape0S0120102_I0 == null || !runnableEBaseShape0S0120102_I0.A04) {
                float f = this.A05;
                int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                float f2 = this.A00;
                return i == 0 ? f2 != this.A04 : f2 > f;
            }
            return true;
        }
        return false;
    }

    public final boolean A0B(float f, float f2) {
        this.A0I.set(this.A0H);
        this.A0B.mapRect(this.A0I);
        float width = getWidth();
        RectF rectF = this.A0I;
        float f3 = rectF.left;
        float f4 = rectF.right;
        float f5 = width - 0.0f;
        float max = f4 - f3 < f5 ? ((f5 - (f4 + f3)) / 2.0f) + 0.0f : Math.max(width - f4, Math.min(0.0f - f3, f));
        float height = getHeight();
        RectF rectF2 = this.A0I;
        float f6 = rectF2.top;
        float f7 = rectF2.bottom;
        float f8 = height - 0.0f;
        float max2 = f7 - f6 < f8 ? ((f8 - (f7 + f6)) / 2.0f) + 0.0f : Math.max(height - f7, Math.min(0.0f - f6, f2));
        this.A0B.postTranslate(max, max2);
        setImageMatrix(this.A0B);
        return max == f && max2 == f2;
    }

    public Bitmap getFullViewCroppedBitmap() {
        if (this.A0T) {
            Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Matrix matrix = new Matrix(this.A0A);
            if (this.A0J != null) {
                canvas.concat(matrix);
                this.A0J.draw(canvas);
            }
            return createBitmap;
        }
        return null;
    }

    public float getMinScale() {
        return this.A04;
    }

    public Bitmap getPhoto() {
        BitmapDrawable bitmapDrawable = this.A0J;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getBitmap();
        }
        return null;
    }

    public float getScale() {
        return this.A00;
    }

    private int getScaledMinScalingSpan() {
        Resources resources = getContext().getResources();
        try {
            return resources.getDimensionPixelSize(resources.getIdentifier("config_minScalingSpan", "dimen", "android"));
        } catch (Resources.NotFoundException unused) {
            return (int) TypedValue.applyDimension(5, 27.0f, resources.getDisplayMetrics());
        }
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.A0V && this.A0Y) {
            if (!this.A0U) {
                float f = this.A00;
                float f2 = this.A04;
                float f3 = f2 * 2.0f;
                if (f != f3) {
                    f2 = f3;
                }
                float min = Math.min(this.A03, Math.max(f2, f2));
                C31H c31h = this.A0P;
                if (c31h != null) {
                    if (min == f2) {
                        c31h.A00(f, min, getWidth() >> 1, getHeight() >> 1, 200L);
                    } else {
                        c31h.A00(f, min, motionEvent.getX(), motionEvent.getY(), 200L);
                    }
                }
            }
            this.A0U = false;
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (this.A0Y) {
            RunnableEBaseShape0S0120102_I0 runnableEBaseShape0S0120102_I0 = this.A0S;
            if (runnableEBaseShape0S0120102_I0 != null) {
                runnableEBaseShape0S0120102_I0.A04 = false;
                runnableEBaseShape0S0120102_I0.A05 = true;
            }
            RunnableEBaseShape0S0120102_I0 runnableEBaseShape0S0120102_I02 = this.A0R;
            if (runnableEBaseShape0S0120102_I02 != null) {
                runnableEBaseShape0S0120102_I02.A04 = false;
                runnableEBaseShape0S0120102_I02.A05 = true;
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A0J == null || this.A0K == null) {
            return;
        }
        int width = (getWidth() - this.A0K.getIntrinsicWidth()) >> 1;
        int height = (getHeight() - this.A0K.getIntrinsicHeight()) >> 1;
        Drawable drawable = this.A0K;
        drawable.setBounds(width, height, drawable.getIntrinsicWidth() + width, this.A0K.getIntrinsicHeight() + height);
        this.A0K.draw(canvas);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        RunnableEBaseShape0S0120102_I0 runnableEBaseShape0S0120102_I0;
        if (this.A0Y && (runnableEBaseShape0S0120102_I0 = this.A0S) != null && !runnableEBaseShape0S0120102_I0.A04) {
            runnableEBaseShape0S0120102_I0.A02 = -1L;
            runnableEBaseShape0S0120102_I0.A00 = f;
            runnableEBaseShape0S0120102_I0.A01 = f2;
            runnableEBaseShape0S0120102_I0.A05 = false;
            runnableEBaseShape0S0120102_I0.A04 = true;
            ((View) runnableEBaseShape0S0120102_I0.A03).post(runnableEBaseShape0S0120102_I0);
        }
        return true;
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A0W = true;
        Matrix matrix = this.A0A;
        if (matrix == null || matrix.equals(getImageMatrix())) {
            A08(z);
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.A0Y) {
            this.A0X = false;
            A05(scaleGestureDetector.getScaleFactor() * this.A00, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (this.A0Y) {
            C31H c31h = this.A0P;
            if (c31h != null) {
                c31h.A06 = false;
                c31h.A07 = true;
            }
            this.A0X = true;
            return true;
        }
        return false;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        C31H c31h;
        if (this.A0Y && this.A0X) {
            this.A0U = true;
            A02();
        }
        float f = this.A00;
        float f2 = this.A04;
        if (f >= f2 || (c31h = this.A0P) == null) {
            return;
        }
        c31h.A00(f, f2, getWidth() >> 1, getHeight() >> 1, 100L);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.A0Y) {
            A0B(-f, -f2);
            return true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.A0M != null && !this.A0X && this.A0V) {
            A04(motionEvent.getX(), motionEvent.getY());
        }
        this.A0X = false;
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.A0L != null && this.A0N != null) {
            if (!isEnabled()) {
                return false;
            }
            this.A0L.onTouchEvent(motionEvent);
            this.A0N.A00.APj(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int pointerCount = motionEvent.getPointerCount();
            if (actionMasked != 1) {
                if (actionMasked != 3) {
                    return true;
                }
            } else if (this.A0M != null && !this.A0X && pointerCount == 1 && !this.A0V) {
                this.A0E.set(motionEvent.getX(), motionEvent.getY());
                post(this.A0Z);
            }
            RunnableEBaseShape0S0120102_I0 runnableEBaseShape0S0120102_I0 = this.A0S;
            if (runnableEBaseShape0S0120102_I0 != null && !runnableEBaseShape0S0120102_I0.A04) {
                A09(false);
            }
        }
        return true;
    }

    public void setAllowFullViewCrop(boolean z) {
        if (z != this.A0T) {
            this.A0T = z;
            requestLayout();
            invalidate();
        }
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.A0V = z;
    }

    public void setInitialFitTolerance(float f) {
        this.A01 = f;
    }

    public void setInitialScaleType(int i) {
        this.A09 = i;
    }

    public void setIsLongpressEnabled(boolean z) {
        this.A0N.A00.ATD(z);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A0M = onClickListener;
    }

    public void setOverlay(Drawable drawable) {
        this.A0K = drawable;
    }

    public void setUnderscaleAmount(float f) {
        this.A08 = f;
    }
}
