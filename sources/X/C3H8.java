package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.os.Vibrator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.3H8 */
/* loaded from: classes2.dex */
public class C3H8 implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public final C13090ka A00;
    public final DoodleView A01;
    public final C63562zz A02;
    public final AnonymousClass303 A03;
    public final AnonymousClass304 A04;
    public final AnonymousClass305 A05;
    public final AnonymousClass306 A06;
    public final C2HF A07;

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

    public C3H8(DoodleView doodleView, C2HF c2hf, C63562zz c63562zz, AnonymousClass306 anonymousClass306) {
        this.A01 = doodleView;
        this.A02 = c63562zz;
        this.A06 = anonymousClass306;
        this.A07 = c2hf;
        this.A00 = new C13090ka(doodleView.getContext(), this);
        AnonymousClass305 anonymousClass305 = new AnonymousClass305(doodleView.getContext(), this);
        this.A05 = anonymousClass305;
        if (Build.VERSION.SDK_INT >= 19) {
            anonymousClass305.setQuickScaleEnabled(false);
        }
        this.A04 = new AnonymousClass304(this);
        this.A03 = new AnonymousClass303(this, doodleView.getContext());
    }

    public void A00(PointF pointF, PointF pointF2) {
        PointF pointF3;
        int i;
        C63562zz c63562zz = this.A02;
        C2HG c2hg = c63562zz.A01;
        if (c2hg == null || (c2hg instanceof C67833Ha)) {
            return;
        }
        if (pointF.x == 0.0f && pointF.y == 0.0f) {
            return;
        }
        c63562zz.A00();
        C63552zy c63552zy = c63562zz.A04;
        C2HG c2hg2 = c63562zz.A01;
        if (c2hg2 != null) {
            PointF A01 = c63552zy.A01(new PointF(c2hg2.A03.centerX(), c2hg2.A03.centerY()));
            if (c63562zz.A03.A01 == 1.0f) {
                AnonymousClass309 anonymousClass309 = c63562zz.A05;
                C2HG c2hg3 = c63562zz.A01;
                if (anonymousClass309.A04 != c2hg3) {
                    anonymousClass309.A04 = c2hg3;
                    anonymousClass309.A01();
                }
                float f = pointF.x;
                float f2 = pointF.y;
                PointF pointF4 = new PointF(anonymousClass309.A02.centerX(), anonymousClass309.A02.centerY());
                PointF pointF5 = new PointF((anonymousClass309.A06 ? anonymousClass309.A00 : A01.x) + f, (anonymousClass309.A07 ? anonymousClass309.A01 : A01.y) + f2);
                if (anonymousClass309.A07) {
                    float centerY = anonymousClass309.A02.centerY();
                    float f3 = anonymousClass309.A08;
                    if (centerY + f3 >= pointF5.y && anonymousClass309.A02.centerY() - f3 <= pointF5.y) {
                        anonymousClass309.A01 += f2;
                        f2 = 0.0f;
                    } else {
                        anonymousClass309.A07 = false;
                        f2 += anonymousClass309.A01 - A01.y;
                        anonymousClass309.A01 = 0.0f;
                    }
                } else {
                    float f4 = A01.y;
                    float f5 = pointF4.y;
                    if ((f4 <= f5 && pointF.y + f4 >= f5) || (f4 >= f5 && pointF.y + f4 <= f5)) {
                        anonymousClass309.A07 = true;
                        anonymousClass309.A01 = pointF5.y;
                        f2 = f5 - f4;
                    }
                }
                if (anonymousClass309.A06) {
                    float centerX = anonymousClass309.A02.centerX();
                    float f6 = anonymousClass309.A08;
                    if (centerX + f6 >= pointF5.x && anonymousClass309.A02.centerX() - f6 <= pointF5.x) {
                        anonymousClass309.A00 += f;
                        f = 0.0f;
                    } else {
                        anonymousClass309.A06 = false;
                        f += anonymousClass309.A00 - A01.x;
                        anonymousClass309.A00 = 0.0f;
                    }
                } else {
                    float f7 = A01.x;
                    float f8 = pointF4.x;
                    if ((f7 <= f8 && pointF.x + f7 >= f8) || (f7 >= f8 && pointF.x + f7 <= f8)) {
                        anonymousClass309.A06 = true;
                        anonymousClass309.A00 = pointF5.x;
                        f = f8 - f7;
                    }
                }
                pointF3 = new PointF(f, f2);
                PointF pointF6 = new PointF(A01.x + pointF3.x, A01.y + pointF3.y);
                C3HA c3ha = (C3HA) anonymousClass309.A05.get(3);
                if (c3ha.A03) {
                    anonymousClass309.A00(pointF6, 0.0f, c2hg3);
                }
                float f9 = pointF.x;
                float f10 = pointF.y;
                boolean z = Math.sqrt((double) ((f10 * f10) + (f9 * f9))) > 200.0d;
                for (AnonymousClass308 anonymousClass308 : anonymousClass309.A05.values()) {
                    if (!(anonymousClass308 instanceof C3HA)) {
                        i = ((C3H9) anonymousClass308).A00;
                    } else {
                        i = 3;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            if (anonymousClass309.A06 && !z && (!c3ha.A03 || c3ha.A01 != 2)) {
                                anonymousClass308.A01();
                            } else {
                                anonymousClass308.A00();
                            }
                        }
                    } else if (anonymousClass309.A07 && !z && (!c3ha.A03 || c3ha.A01 != 0)) {
                        anonymousClass308.A01();
                    } else {
                        anonymousClass308.A00();
                    }
                }
            } else {
                pointF3 = pointF;
            }
            C637130o c637130o = c63562zz.A06;
            boolean A012 = c637130o.A01(pointF2.x, pointF2.y);
            boolean z2 = c637130o.A00;
            if (A012) {
                if (!z2) {
                    C637030n c637030n = c637130o.A04;
                    c637030n.A00 = c637130o.A03.getContext().getResources().getColor(R.color.trashHoverBackground);
                    c637030n.invalidateSelf();
                    Vibrator vibrator = c637130o.A02;
                    if (vibrator != null) {
                        try {
                            vibrator.vibrate(3L);
                        } catch (NullPointerException e) {
                            Log.e("Vibrator is broken on this device.", e);
                        }
                    }
                }
            } else if (z2) {
                c637130o.A00();
            }
            c637130o.A00 = A012;
            float f11 = pointF3.x;
            float f12 = pointF3.y;
            float[] fArr = c63552zy.A02;
            fArr[0] = f11;
            fArr[1] = f12;
            Matrix matrix = c63552zy.A00;
            matrix.reset();
            C63512zu c63512zu = c63552zy.A01;
            matrix.setRotate(-c63512zu.A02);
            matrix.mapPoints(fArr);
            float f13 = fArr[0];
            float f14 = c63512zu.A00 * c63512zu.A01;
            PointF pointF7 = new PointF(f13 / f14, fArr[1] / f14);
            c63562zz.A01.A03.offset(pointF7.x, pointF7.y);
            return;
        }
        throw null;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        DoodleView doodleView = this.A01;
        C2HF c2hf = doodleView.A0I;
        c2hf.A02 = null;
        c2hf.A00 = null;
        if (c2hf.A01 != null) {
            List list = c2hf.A04;
            if (!list.isEmpty()) {
                C2HG c2hg = c2hf.A01;
                if ((c2hg == null ? -1 : list.indexOf(c2hg)) != list.size() - 1) {
                    C2HG c2hg2 = c2hf.A01;
                    c2hf.A03.A00.add(new C67913Hi(c2hg2, c2hg2 == null ? -1 : list.indexOf(c2hg2)));
                    list.remove(c2hf.A01);
                    list.add(c2hf.A01);
                    doodleView.A0F.A0D = false;
                    doodleView.invalidate();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float f = ((AnonymousClass305) scaleGestureDetector).A00;
        C2HG c2hg = this.A06.A00;
        if (c2hg != null) {
            if (c2hg instanceof C67863Hd) {
                c2hg.A07(scaleFactor, (Math.abs(f) < 1.0f ? 1 : 0) ^ 1);
                return true;
            } else if (c2hg instanceof C67843Hb) {
                c2hg.A07(scaleFactor, 1 ^ (Math.abs(Math.tan(Math.atan((double) f) - Math.toRadians((double) c2hg.A00))) < 1.0d ? 1 : 0));
                return true;
            } else if (!(c2hg instanceof C3HZ)) {
                c2hg.A05(scaleFactor);
                return true;
            } else {
                c2hg.A07(scaleFactor, 1 ^ (Math.abs(Math.tan(Math.atan((double) f) - Math.toRadians((double) c2hg.A00))) < 1.0d ? 1 : 0));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        AnonymousClass306 anonymousClass306 = this.A06;
        C2HG c2hg = this.A07.A01;
        anonymousClass306.A00 = c2hg;
        return c2hg != null;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.A06.A00 = null;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        DoodleView doodleView = this.A01;
        C2HF c2hf = doodleView.A0I;
        List list = c2hf.A04;
        if (list.size() != 1) {
            C2HG c2hg = c2hf.A01;
            if ((c2hg == null ? -1 : list.indexOf(c2hg)) != list.size() - 1) {
                doodleView.A03(motionEvent.getX(), motionEvent.getY());
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        DoodleView doodleView = this.A01;
        C2HF c2hf = doodleView.A0I;
        c2hf.A01 = doodleView.A00(motionEvent);
        List list = c2hf.A04;
        if (list.size() != 1) {
            C2HG c2hg = c2hf.A01;
            if ((c2hg == null ? -1 : list.indexOf(c2hg)) != list.size() - 1) {
                return false;
            }
        }
        doodleView.A03(motionEvent.getX(), motionEvent.getY());
        return false;
    }
}
