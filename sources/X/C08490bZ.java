package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.0bZ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C08490bZ {
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    public int A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    public int A01 = 0;
    public int A02 = 0;
    public boolean A07 = false;
    public boolean A06 = false;

    public void A00(int i, int i2) {
        this.A05 = i;
        this.A00 = i2;
        this.A06 = true;
        if (this.A07) {
            if (i2 != Integer.MIN_VALUE) {
                this.A03 = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.A04 = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.A03 = i;
        }
        if (i2 == Integer.MIN_VALUE) {
            return;
        }
        this.A04 = i2;
    }
}
