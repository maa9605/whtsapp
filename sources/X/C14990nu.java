package X;

import android.view.View;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.0nu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C14990nu {
    public int A00;
    public int A01;
    public C0Y1 A02;
    public boolean A03;
    public boolean A04;

    public C14990nu() {
        A01();
    }

    public void A00() {
        int A06;
        if (this.A03) {
            A06 = this.A02.A02();
        } else {
            A06 = this.A02.A06();
        }
        this.A00 = A06;
    }

    public void A01() {
        this.A01 = -1;
        this.A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A03 = false;
        this.A04 = false;
    }

    public void A02(View view, int i) {
        if (this.A03) {
            int A08 = this.A02.A08(view);
            C0Y1 c0y1 = this.A02;
            this.A00 = (Integer.MIN_VALUE == c0y1.A00 ? 0 : c0y1.A07() - c0y1.A00) + A08;
        } else {
            this.A00 = this.A02.A0B(view);
        }
        this.A01 = i;
    }

    public void A03(View view, int i) {
        C0Y1 c0y1 = this.A02;
        int A07 = Integer.MIN_VALUE == c0y1.A00 ? 0 : c0y1.A07() - c0y1.A00;
        if (A07 >= 0) {
            A02(view, i);
            return;
        }
        this.A01 = i;
        if (this.A03) {
            int A02 = (this.A02.A02() - A07) - this.A02.A08(view);
            this.A00 = this.A02.A02() - A02;
            if (A02 > 0) {
                int A09 = this.A00 - this.A02.A09(view);
                int A06 = this.A02.A06();
                int min = A09 - (Math.min(this.A02.A0B(view) - A06, 0) + A06);
                if (min < 0) {
                    this.A00 = Math.min(A02, -min) + this.A00;
                    return;
                }
                return;
            }
            return;
        }
        int A0B = this.A02.A0B(view);
        int A062 = A0B - this.A02.A06();
        this.A00 = A0B;
        if (A062 <= 0) {
            return;
        }
        int A022 = (this.A02.A02() - Math.min(0, (this.A02.A02() - A07) - this.A02.A08(view))) - (this.A02.A09(view) + A0B);
        if (A022 >= 0) {
            return;
        }
        this.A00 -= Math.min(A062, -A022);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("AnchorInfo{mPosition=");
        A0P.append(this.A01);
        A0P.append(", mCoordinate=");
        A0P.append(this.A00);
        A0P.append(", mLayoutFromEnd=");
        A0P.append(this.A03);
        A0P.append(", mValid=");
        A0P.append(this.A04);
        A0P.append('}');
        return A0P.toString();
    }
}
