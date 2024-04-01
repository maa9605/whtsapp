package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.google.android.search.verification.client.R;

/* renamed from: X.2L4  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2L4 implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public float A00 = 1.0f;
    public final ScaleGestureDetector A01;
    public final C13090ka A02;
    public final C52232aH A03;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public C2L4(Context context, C52232aH c52232aH) {
        this.A02 = new C13090ka(context, this);
        this.A01 = new ScaleGestureDetector(context, this);
        this.A03 = c52232aH;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        C52232aH c52232aH = this.A03;
        motionEvent.getX();
        motionEvent.getY();
        c52232aH.A00.A0N.AGk();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float f = this.A00 * scaleFactor * scaleFactor;
        this.A00 = f;
        if (f < 1.0f) {
            this.A00 = 1.0f;
            f = 1.0f;
        }
        C29X c29x = this.A03.A00;
        float maxScale = c29x.A0S.getMaxScale();
        if (maxScale >= 1.0f) {
            if (f > maxScale) {
                f = maxScale;
            }
            int AUG = c29x.A0N.AUG(Math.round(((f - 1.0f) * c29x.A0N.getMaxZoom()) / (maxScale - 1.0f)));
            if (!c29x.A0N.AFg()) {
                C2VU c2vu = c29x.A0S;
                c2vu.A00 = f;
                c2vu.A02 = c2vu.A01.A0D(R.string.camera_zoom_value, Float.valueOf(AUG / 100.0f));
                c2vu.invalidate();
            }
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        float f = this.A00;
        C29X c29x = this.A03.A00;
        if (!c29x.A0N.AFg()) {
            C2VU c2vu = c29x.A0S;
            c2vu.setVisibility(0);
            c2vu.A00 = f;
            c2vu.invalidate();
            c2vu.removeCallbacks(c2vu.A06);
        } else {
            c29x.A0S.setVisibility(4);
        }
        if (c29x.A1P.isEmpty()) {
            c29x.A0P(false);
            return true;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        C2VU c2vu = this.A03.A00.A0S;
        c2vu.invalidate();
        c2vu.postDelayed(c2vu.A06, 300L);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C52232aH c52232aH = this.A03;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        C29X c29x = c52232aH.A00;
        c29x.A0N.A7u(x, y);
        c29x.A0N.A6C();
        if (c29x.A1P.isEmpty()) {
            c29x.A0P(false);
            return true;
        }
        return true;
    }
}
