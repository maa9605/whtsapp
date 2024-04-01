package X;

import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import java.util.Locale;

/* renamed from: X.2Qf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C50152Qf {
    public static final boolean A02;
    public final DecimalFormat A00;
    public final C59772tI A01;

    static {
        A02 = Build.VERSION.SDK_INT >= 24;
    }

    public C50152Qf(Locale locale, String str) {
        if (A02) {
            this.A00 = new DecimalFormat(str, DecimalFormatSymbols.getInstance(locale));
        } else {
            this.A01 = new C59772tI(locale, str);
        }
    }

    public String A00(double d) {
        if (A02) {
            DecimalFormat decimalFormat = this.A00;
            if (decimalFormat != null) {
                return decimalFormat.format(d);
            }
            throw null;
        }
        C59772tI c59772tI = this.A01;
        if (c59772tI != null) {
            return c59772tI.A00(c59772tI.A04.format(d));
        }
        throw null;
    }
}
