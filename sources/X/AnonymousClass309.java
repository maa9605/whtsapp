package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.309  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass309 {
    public Vibrator A03;
    public C2HG A04;
    public final float A08;
    public final Handler A09;
    public final ViewGroup A0A;
    public Map A05 = new HashMap();
    public RectF A02 = new RectF();
    public boolean A06 = false;
    public boolean A07 = false;
    public float A01 = 0.0f;
    public float A00 = 0.0f;

    public AnonymousClass309(ViewGroup viewGroup, Handler handler) {
        this.A0A = viewGroup;
        this.A09 = handler;
        this.A08 = viewGroup.getResources().getDimensionPixelSize(R.dimen.media_guideline_snapping_distance);
        this.A03 = (Vibrator) viewGroup.getContext().getSystemService("vibrator");
    }

    public float A00(PointF pointF, float f, C2HG c2hg) {
        if (this.A04 != c2hg) {
            this.A04 = c2hg;
            A01();
        }
        C3HA c3ha = (C3HA) this.A05.get(3);
        float f2 = c2hg.A00;
        boolean z = c3ha.A03;
        if (z) {
            float f3 = c3ha.A00 + f;
            if (C3HA.A00(f3) != -1) {
                c3ha.A00 = f3;
                f = 0.0f;
            } else {
                f = f3 - f2;
                c3ha.A00 = 0.0f;
                c3ha.A03 = false;
                z = false;
            }
        } else {
            float f4 = f;
            if (Math.abs(f) > 180.0f) {
                f4 = f < 0.0f ? 360.0f + f : 360.0f - f;
            }
            float f5 = f2 % 45.0f;
            if (f5 != 0.0f) {
                int i = (f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1));
                float f6 = f5 + f4;
                if (i <= 0 ? f6 >= 0.0f || f6 <= -45.0f : f6 <= 0.0f || f6 >= 45.0f) {
                    float f7 = f2 + f;
                    if (C3HA.A00(f7) != -1) {
                        c3ha.A03 = true;
                        z = true;
                        c3ha.A00 = f7;
                        boolean z2 = f7 < 0.0f;
                        float abs = Math.abs(f7 % 45.0f);
                        if (abs >= 38.0f) {
                            abs = 45.0f - abs;
                            z2 = !z2;
                        } else if (abs > 7.0f) {
                            throw new IllegalArgumentException(Float.toString(f7));
                        }
                        if (!z2) {
                            abs = -abs;
                        }
                        f = (f7 + abs) - f2;
                    }
                }
            }
        }
        int A00 = C3HA.A00(f2 + f);
        if (A00 != -1) {
            c3ha.A01 = A00;
        }
        c3ha.A02 = pointF;
        if (z) {
            if (this.A06 && A00 == 2) {
                ((AnonymousClass308) this.A05.get(2)).A00();
            } else if (this.A07 && A00 == 0) {
                ((AnonymousClass308) this.A05.get(1)).A00();
            }
            c3ha.A01();
            return f;
        }
        c3ha.A00();
        return f;
    }

    public final void A01() {
        C3HA c3ha = (C3HA) this.A05.get(3);
        if (c3ha != null) {
            c3ha.A00 = 0.0f;
            c3ha.A03 = false;
        }
        this.A06 = false;
        this.A07 = false;
        this.A01 = 0.0f;
        this.A00 = 0.0f;
    }
}
