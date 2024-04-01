package X;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import com.google.android.search.verification.client.R;

/* renamed from: X.3ss  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C83903ss extends AbstractC13450lH {
    public final /* synthetic */ ScaleGestureDetector$OnScaleGestureListenerC54382ie A00;

    @Override // X.AbstractC13450lH
    public int A02(View view, int i, int i2) {
        return i;
    }

    @Override // X.AbstractC13450lH
    public int A03(View view, int i, int i2) {
        return i;
    }

    public C83903ss(ScaleGestureDetector$OnScaleGestureListenerC54382ie scaleGestureDetector$OnScaleGestureListenerC54382ie) {
        this.A00 = scaleGestureDetector$OnScaleGestureListenerC54382ie;
    }

    @Override // X.AbstractC13450lH
    public int A00(View view) {
        return view.getWidth();
    }

    @Override // X.AbstractC13450lH
    public int A01(View view) {
        return view.getHeight();
    }

    @Override // X.AbstractC13450lH
    public void A05(View view, float f, float f2) {
        int A00;
        boolean z;
        int A05;
        int width;
        int height;
        C2Zb c2Zb;
        AbstractC48662Ge abstractC48662Ge;
        ScaleGestureDetector$OnScaleGestureListenerC54382ie scaleGestureDetector$OnScaleGestureListenerC54382ie = this.A00;
        View view2 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A0C;
        if (view2 == null || view2 != view) {
            return;
        }
        if (Math.abs(f) > Math.abs(f2)) {
            if (Math.abs(f / f2) >= 3.0f) {
                f2 = 0.0f;
            }
        } else if (Math.abs(f2 / f) >= 3.0f) {
            f = 0.0f;
        }
        if (f == 0.0f) {
            A00 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A02(view.getWidth());
            z = false;
        } else {
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            int width2 = view.getWidth();
            A00 = i > 0 ? ScaleGestureDetector$OnScaleGestureListenerC54382ie.A00(scaleGestureDetector$OnScaleGestureListenerC54382ie, width2) : ScaleGestureDetector$OnScaleGestureListenerC54382ie.A01(scaleGestureDetector$OnScaleGestureListenerC54382ie, width2);
            z = true;
        }
        if (f2 == 0.0f) {
            A05 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A03(view.getHeight());
        } else {
            int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            int height2 = view.getHeight();
            if (i2 > 0) {
                A05 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A04(height2);
            } else {
                A05 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A05(height2);
            }
            z = true;
        }
        DisplayMetrics displayMetrics = scaleGestureDetector$OnScaleGestureListenerC54382ie.getResources().getDisplayMetrics();
        float f3 = displayMetrics.density;
        boolean z2 = ((float) Math.abs(A00 - scaleGestureDetector$OnScaleGestureListenerC54382ie.A07)) <= f3;
        boolean z3 = ((float) Math.abs(A05 - scaleGestureDetector$OnScaleGestureListenerC54382ie.A08)) <= f3;
        if (z || view.getTop() > displayMetrics.heightPixels / 3) {
            if (scaleGestureDetector$OnScaleGestureListenerC54382ie.A0K) {
                scaleGestureDetector$OnScaleGestureListenerC54382ie.A0J = true;
                InterfaceC72913an interfaceC72913an = scaleGestureDetector$OnScaleGestureListenerC54382ie.A0F;
                if (interfaceC72913an != null) {
                    interfaceC72913an.AJU(true);
                }
            } else if (z && ((z2 && z3) || ((z2 && Math.abs(f) >= 6000.0f) || (z3 && Math.abs(f2) >= 6000.0f)))) {
                scaleGestureDetector$OnScaleGestureListenerC54382ie.A0E = view;
                scaleGestureDetector$OnScaleGestureListenerC54382ie.A0L = true;
                if (f == 0.0f) {
                    width = (int) view.getX();
                } else {
                    width = f > 0.0f ? view.getWidth() + scaleGestureDetector$OnScaleGestureListenerC54382ie.getWidth() : view.getHeight() * (-2);
                }
                if (f2 == 0.0f) {
                    height = (int) view.getY();
                } else {
                    height = f2 > 0.0f ? view.getHeight() + scaleGestureDetector$OnScaleGestureListenerC54382ie.getHeight() : view.getHeight() * (-2);
                }
                scaleGestureDetector$OnScaleGestureListenerC54382ie.A0Q.A0J(view, width, height);
                scaleGestureDetector$OnScaleGestureListenerC54382ie.postOnAnimation(new RunnableEBaseShape9S0100000_I1_1(this, 21));
            }
            c2Zb = scaleGestureDetector$OnScaleGestureListenerC54382ie.A0G;
            if (c2Zb != null || c2Zb.A05 == null) {
            }
            c2Zb.A0C(0, scaleGestureDetector$OnScaleGestureListenerC54382ie.getResources().getColor(R.color.black));
            scaleGestureDetector$OnScaleGestureListenerC54382ie.A0G.setPlayerElevation(6);
            scaleGestureDetector$OnScaleGestureListenerC54382ie.A0G.setVisibility(0);
            return;
        }
        boolean z4 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A0K;
        C13460lI c13460lI = scaleGestureDetector$OnScaleGestureListenerC54382ie.A0Q;
        if (!z4) {
            c13460lI.A0E(A00, A05);
            scaleGestureDetector$OnScaleGestureListenerC54382ie.A04 = A00;
            scaleGestureDetector$OnScaleGestureListenerC54382ie.A05 = A05;
            scaleGestureDetector$OnScaleGestureListenerC54382ie.invalidate();
        } else {
            c13460lI.A0E(0, 0);
            C2Zb c2Zb2 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A0G;
            if (c2Zb2 != null && (abstractC48662Ge = c2Zb2.A05) != null && abstractC48662Ge.A0C()) {
                scaleGestureDetector$OnScaleGestureListenerC54382ie.A0G.A0B(100);
            }
            scaleGestureDetector$OnScaleGestureListenerC54382ie.A04 = 0;
            scaleGestureDetector$OnScaleGestureListenerC54382ie.A05 = 0;
            scaleGestureDetector$OnScaleGestureListenerC54382ie.invalidate();
        }
        c2Zb = scaleGestureDetector$OnScaleGestureListenerC54382ie.A0G;
        if (c2Zb != null) {
        }
    }

    @Override // X.AbstractC13450lH
    public void A06(View view, int i) {
        C2Zb c2Zb;
        ViewParent parent = view.getParent();
        ScaleGestureDetector$OnScaleGestureListenerC54382ie scaleGestureDetector$OnScaleGestureListenerC54382ie = this.A00;
        scaleGestureDetector$OnScaleGestureListenerC54382ie.A07 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A04;
        scaleGestureDetector$OnScaleGestureListenerC54382ie.A08 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A05;
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        if (!scaleGestureDetector$OnScaleGestureListenerC54382ie.A0K || (c2Zb = scaleGestureDetector$OnScaleGestureListenerC54382ie.A0G) == null || c2Zb.A05 == null) {
            return;
        }
        c2Zb.A0C(scaleGestureDetector$OnScaleGestureListenerC54382ie.getResources().getColor(R.color.black), 0);
        scaleGestureDetector$OnScaleGestureListenerC54382ie.A0G.setPlayerElevation(0);
        scaleGestureDetector$OnScaleGestureListenerC54382ie.A0G.setVisibility(8);
        if (scaleGestureDetector$OnScaleGestureListenerC54382ie.A0G.A05.A0C()) {
            scaleGestureDetector$OnScaleGestureListenerC54382ie.A0G.A05();
        }
    }

    @Override // X.AbstractC13450lH
    public void A07(View view, int i, int i2, int i3, int i4) {
        ScaleGestureDetector$OnScaleGestureListenerC54382ie scaleGestureDetector$OnScaleGestureListenerC54382ie = this.A00;
        if (scaleGestureDetector$OnScaleGestureListenerC54382ie.A0Q.A03 != 1 || scaleGestureDetector$OnScaleGestureListenerC54382ie.A0L) {
            return;
        }
        scaleGestureDetector$OnScaleGestureListenerC54382ie.A05 = view.getTop();
        scaleGestureDetector$OnScaleGestureListenerC54382ie.A04 = view.getLeft();
    }

    @Override // X.AbstractC13450lH
    public boolean A08(View view, int i) {
        ScaleGestureDetector$OnScaleGestureListenerC54382ie scaleGestureDetector$OnScaleGestureListenerC54382ie = this.A00;
        View view2 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A0C;
        return (view2 == null || view != view2 || scaleGestureDetector$OnScaleGestureListenerC54382ie.A0M) ? false : true;
    }

    public /* synthetic */ void A09() {
        InterfaceC72913an interfaceC72913an;
        ScaleGestureDetector$OnScaleGestureListenerC54382ie scaleGestureDetector$OnScaleGestureListenerC54382ie = this.A00;
        View view = scaleGestureDetector$OnScaleGestureListenerC54382ie.A0E;
        if (view == null || scaleGestureDetector$OnScaleGestureListenerC54382ie.A0C != view || (interfaceC72913an = scaleGestureDetector$OnScaleGestureListenerC54382ie.A0F) == null) {
            return;
        }
        scaleGestureDetector$OnScaleGestureListenerC54382ie.A0E = null;
        interfaceC72913an.AJU(false);
    }
}
