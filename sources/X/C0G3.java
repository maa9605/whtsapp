package X;

import android.content.Intent;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.0G3 */
/* loaded from: classes.dex */
public final class C0G3 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public C0G3() {
        this.A00 = 1;
        this.A01 = 0;
        this.A02 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A03 = 0;
    }

    public C0G3(Intent intent) {
        if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
            this.A00 = intent.getIntExtra("health", 1);
            this.A01 = intent.getIntExtra("level", -1);
            this.A02 = intent.getIntExtra("plugged", 0);
            this.A03 = intent.getIntExtra("scale", -1);
            return;
        }
        throw new IllegalArgumentException("Intent must be android.intent.action.BATTERY_CHANGED");
    }

    public double A00() {
        int i;
        int i2 = this.A01;
        if (i2 < 0 || (i = this.A03) <= 0) {
            return Double.NaN;
        }
        return (i2 * 100.0d) / i;
    }

    public boolean A01() {
        int i = this.A02;
        return (i == 0 || i == Integer.MIN_VALUE) ? false : true;
    }

    public boolean A02() {
        double A00 = A00();
        if (!A01()) {
            if (this.A00 != 1 || this.A01 > 0 || this.A03 > 0 || this.A02 != Integer.MIN_VALUE) {
                return A00 != Double.NaN && A00 > 20.0d;
            }
            return true;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0G3.class != obj.getClass()) {
            return false;
        }
        C0G3 c0g3 = (C0G3) obj;
        return this.A00 == c0g3.A00 && this.A01 == c0g3.A01 && this.A02 == c0g3.A02 && this.A03 == c0g3.A03;
    }

    public int hashCode() {
        return (((((this.A00 * 31) + this.A01) * 31) + this.A02) * 31) + this.A03;
    }

    public String toString() {
        String str;
        StringBuilder A0P = C000200d.A0P("BatteryState{health=");
        int i = this.A00;
        switch (i) {
            case 1:
                str = "unknown";
                break;
            case 2:
                str = "good";
                break;
            case 3:
                str = "overheat";
                break;
            case 4:
                str = "dead";
                break;
            case 5:
                str = "over_voltage";
                break;
            case 6:
                str = "unspecified_failure";
                break;
            case 7:
                str = "cold";
                break;
            default:
                StringBuilder A0P2 = C000200d.A0P("other(");
                A0P2.append(i);
                A0P2.append(')');
                str = A0P2.toString();
                break;
        }
        A0P.append(str);
        A0P.append(", level=");
        A0P.append(this.A01);
        A0P.append(", plugged=");
        A0P.append(this.A02);
        A0P.append(", scale=");
        A0P.append(this.A03);
        A0P.append(", percent=");
        A0P.append(A00());
        A0P.append('}');
        return A0P.toString();
    }
}
