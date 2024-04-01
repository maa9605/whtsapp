package X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Log;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.11W  reason: invalid class name */
/* loaded from: classes.dex */
public class C11W {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public Layout.Alignment A08;
    public SpannableStringBuilder A09;

    public C11W() {
        A01();
    }

    public C30161Zz A00() {
        if (this.A01 != Float.MIN_VALUE && this.A05 == Integer.MIN_VALUE) {
            Layout.Alignment alignment = this.A08;
            if (alignment == null) {
                this.A05 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                int i = C11V.A00[alignment.ordinal()];
                if (i == 1) {
                    this.A05 = 0;
                } else if (i == 2) {
                    this.A05 = 1;
                } else if (i != 3) {
                    StringBuilder A0P = C000200d.A0P("Unrecognized alignment: ");
                    A0P.append(alignment);
                    Log.w("WebvttCueBuilder", A0P.toString());
                    this.A05 = 0;
                } else {
                    this.A05 = 2;
                }
            }
        }
        return new C30161Zz(this.A07, this.A06, this.A09, this.A08, this.A00, this.A04, this.A03, this.A01, this.A05, this.A02);
    }

    public void A01() {
        this.A07 = 0L;
        this.A06 = 0L;
        this.A09 = null;
        this.A08 = null;
        this.A00 = Float.MIN_VALUE;
        this.A04 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A03 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A01 = Float.MIN_VALUE;
        this.A05 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A02 = Float.MIN_VALUE;
    }
}
