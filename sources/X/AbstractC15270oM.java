package X;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.0oM */
/* loaded from: classes.dex */
public abstract class AbstractC15270oM {
    public View A01;
    public C0SV A02;
    public RecyclerView A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public int A00 = -1;
    public final C15260oL A07 = new C15260oL();

    public abstract void A03(View view, C0Y0 c0y0, C15260oL c15260oL);

    public PointF A00(int i) {
        C0SV c0sv = this.A02;
        if (c0sv instanceof C0SX) {
            return ((C0SX) c0sv).A6O(i);
        }
        StringBuilder A0P = C000200d.A0P("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
        A0P.append(C0SX.class.getCanonicalName());
        Log.w("RecyclerView", A0P.toString());
        return null;
    }

    public final void A01() {
        if (this.A05) {
            this.A05 = false;
            C1UM c1um = (C1UM) this;
            c1um.A01 = 0;
            c1um.A00 = 0;
            c1um.A02 = null;
            this.A03.A0z.A07 = -1;
            this.A01 = null;
            this.A00 = -1;
            this.A04 = false;
            C0SV c0sv = this.A02;
            if (c0sv.A06 == this) {
                c0sv.A06 = null;
            }
            this.A02 = null;
            this.A03 = null;
        }
    }

    public void A02(int i, int i2) {
        int i3;
        PointF A00;
        RecyclerView recyclerView = this.A03;
        if (!this.A05 || this.A00 == -1 || recyclerView == null) {
            A01();
        }
        if (this.A04 && this.A01 == null && this.A02 != null && (A00 = A00(this.A00)) != null) {
            float f = A00.x;
            if (f != 0.0f || A00.y != 0.0f) {
                recyclerView.A0f((int) Math.signum(f), (int) Math.signum(A00.y), null);
            }
        }
        this.A04 = false;
        View view = this.A01;
        if (view != null) {
            if (this.A03 != null) {
                C0TS A01 = RecyclerView.A01(view);
                if (A01 != null) {
                    i3 = A01.A01();
                } else {
                    i3 = -1;
                }
                if (i3 == this.A00) {
                    View view2 = this.A01;
                    C0Y0 c0y0 = recyclerView.A0z;
                    C15260oL c15260oL = this.A07;
                    A03(view2, c0y0, c15260oL);
                    c15260oL.A00(recyclerView);
                    A01();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.A01 = null;
                }
            } else {
                throw null;
            }
        }
        if (this.A05) {
            C15260oL c15260oL2 = this.A07;
            C1UM c1um = (C1UM) this;
            if (((AbstractC15270oM) c1um).A03.A0S.A0A() == 0) {
                c1um.A01();
            } else {
                int i4 = c1um.A00;
                int i5 = i4 - i;
                if (i4 * i5 <= 0) {
                    i5 = 0;
                }
                c1um.A00 = i5;
                int i6 = c1um.A01;
                int i7 = i6 - i2;
                if (i6 * i7 <= 0) {
                    i7 = 0;
                }
                c1um.A01 = i7;
                if (i5 == 0 && i7 == 0) {
                    PointF A002 = c1um.A00(((AbstractC15270oM) c1um).A00);
                    if (A002 != null) {
                        float f2 = A002.x;
                        if (f2 != 0.0f || A002.y != 0.0f) {
                            float f3 = A002.y;
                            float sqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
                            float f4 = f2 / sqrt;
                            A002.x = f4;
                            float f5 = f3 / sqrt;
                            A002.y = f5;
                            c1um.A02 = A002;
                            c1um.A00 = (int) (f4 * 10000.0f);
                            c1um.A01 = (int) (f5 * 10000.0f);
                            int A07 = c1um.A07(SearchActionVerificationClientService.NOTIFICATION_ID);
                            int i8 = (int) (c1um.A00 * 1.2f);
                            int i9 = (int) (c1um.A01 * 1.2f);
                            LinearInterpolator linearInterpolator = c1um.A05;
                            c15260oL2.A02 = i8;
                            c15260oL2.A03 = i9;
                            c15260oL2.A01 = (int) (A07 * 1.2f);
                            c15260oL2.A05 = linearInterpolator;
                            c15260oL2.A06 = true;
                        }
                    }
                    c15260oL2.A04 = ((AbstractC15270oM) c1um).A00;
                    c1um.A01();
                }
            }
            boolean z = c15260oL2.A04 >= 0;
            c15260oL2.A00(recyclerView);
            if (z) {
                if (this.A05) {
                    this.A04 = true;
                    recyclerView.A10.A01();
                    return;
                }
                A01();
            }
        }
    }
}
