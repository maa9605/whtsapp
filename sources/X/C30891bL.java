package X;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.1bL  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C30891bL extends C1UM {
    public int A00;

    public C30891bL(Context context) {
        super(context);
        this.A00 = 0;
    }

    @Override // X.C1UM
    public int A05() {
        return this.A00;
    }

    @Override // X.C1UM
    public int A06() {
        return this.A00;
    }

    @Override // X.C1UM
    public int A08(int i, int i2, int i3, int i4, int i5) {
        if (this.A00 == Integer.MIN_VALUE) {
            return (((i4 - i3) / 2) + i3) - (((i2 - i) >> 1) + i);
        }
        return super.A08(i, i2, i3, i4, i5);
    }

    public void A09(String str) {
        if (str == null) {
            this.A00 = 0;
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode == -1364013995) {
            if (str.equals("center")) {
                this.A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            }
        } else if (hashCode == 100571) {
            if (str.equals("end")) {
                this.A00 = 1;
            }
        } else if (hashCode == 109757538 && str.equals("start")) {
            this.A00 = -1;
        }
    }
}
