package X;

import android.content.Context;
import android.icu.text.DecimalFormat;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.2RW  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2RW {
    public static final String A0A = C000200d.A0L(C000200d.A0P("¤"), C02M.A01, "#,##0.00");
    public static final Pattern A0B = Pattern.compile("[#0,.-]+");
    public String A00;
    public String A01;
    public final C59672t8 A02;
    public final C59722tD A03;
    public final C59722tD A04;
    public final C59722tD A05;
    public final C59722tD A06;
    public final C50152Qf A07;
    public final String A08;
    public final String A09;

    public C2RW(C002301c c002301c, C59672t8 c59672t8, C50152Qf c50152Qf) {
        this.A02 = c59672t8;
        this.A07 = c50152Qf;
        if (c59672t8.A02) {
            this.A05 = new C59722tD(c002301c.A05(9));
            this.A06 = new C59722tD(c002301c.A05(11));
            this.A09 = c002301c.A05(10);
            this.A03 = new C59722tD(c002301c.A05(6));
            this.A04 = new C59722tD(c002301c.A05(8));
            this.A08 = c002301c.A05(7);
            return;
        }
        C59722tD c59722tD = C59722tD.A02;
        this.A04 = c59722tD;
        this.A03 = c59722tD;
        this.A06 = c59722tD;
        this.A05 = c59722tD;
        this.A08 = "";
        this.A09 = "";
    }

    public C2RW(Context context, Locale locale, C59672t8 c59672t8, C50152Qf c50152Qf) {
        this.A02 = c59672t8;
        this.A07 = c50152Qf;
        this.A05 = new C59722tD(C0DG.A01(context, locale, 9));
        this.A06 = new C59722tD(C0DG.A01(context, locale, 11));
        this.A09 = C0DG.A01(context, locale, 10);
        this.A03 = new C59722tD(C0DG.A01(context, locale, 6));
        this.A04 = new C59722tD(C0DG.A01(context, locale, 8));
        this.A08 = C0DG.A01(context, locale, 7);
    }

    public static int A00(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 48) {
            return hashCode != 1632 ? hashCode != 1776 ? hashCode != 2406 ? (hashCode == 2534 && str.equals("০")) ? 3 : 5 : str.equals("०") ? 4 : 5 : str.equals("۰") ? 2 : 5 : str.equals("٠") ? 1 : 5;
        }
        return 5;
    }

    public static C2RW A01(C002301c c002301c, boolean z) {
        String A05 = c002301c.A05(A00(AbstractC003201n.A03(c002301c.A0I())));
        if (A05.isEmpty()) {
            A05 = A0A;
        }
        C59672t8 c59672t8 = new C59672t8(A05, z);
        return new C2RW(c002301c, c59672t8, new C50152Qf(c002301c.A0I(), c59672t8.A00()));
    }

    public Number A02(String str) {
        String trim = str.replace(this.A01, "").replace(this.A00, "").replace(C02M.A01, "").trim();
        C50152Qf c50152Qf = this.A07;
        if (C50152Qf.A02) {
            DecimalFormat decimalFormat = c50152Qf.A00;
            if (decimalFormat != null) {
                return decimalFormat.parse(trim);
            }
            throw null;
        }
        C59772tI c59772tI = c50152Qf.A01;
        if (c59772tI != null) {
            return c59772tI.A04.parse(trim.replace(String.valueOf(c59772tI.A01), ""));
        }
        throw null;
    }

    public String A03(double d) {
        String A00 = this.A07.A00(d);
        C59672t8 c59672t8 = this.A02;
        if (c59672t8.A02) {
            if (d < 0.0d) {
                return A04(A00, c59672t8.A00);
            }
            return A04(A00, c59672t8.A01);
        }
        return A00;
    }

    public final String A04(String str, C59682t9 c59682t9) {
        String replaceFirst;
        String str2;
        if (c59682t9.A03) {
            replaceFirst = c59682t9.A01;
            str2 = A0B.matcher(c59682t9.A02).replaceFirst(str);
        } else {
            replaceFirst = A0B.matcher(c59682t9.A01).replaceFirst(str);
            str2 = c59682t9.A02;
        }
        if (!replaceFirst.isEmpty() && this.A06.A00(replaceFirst.codePointBefore(replaceFirst.length())) && this.A05.A00(this.A01.codePointAt(0))) {
            StringBuilder A0P = C000200d.A0P(replaceFirst);
            A0P.append(this.A09);
            replaceFirst = A0P.toString();
        }
        if (!str2.isEmpty() && this.A04.A00(str2.codePointAt(0))) {
            C59722tD c59722tD = this.A03;
            String str3 = this.A01;
            if (c59722tD.A00(str3.codePointBefore(str3.length()))) {
                str2 = C000200d.A0L(new StringBuilder(), this.A08, str2);
            }
        }
        return C000200d.A0L(C000200d.A0P(replaceFirst), this.A01, str2);
    }

    public String A05(BigDecimal bigDecimal) {
        String A00;
        C50152Qf c50152Qf = this.A07;
        if (C50152Qf.A02) {
            DecimalFormat decimalFormat = c50152Qf.A00;
            if (decimalFormat != null) {
                A00 = decimalFormat.format(bigDecimal);
            } else {
                throw null;
            }
        } else {
            C59772tI c59772tI = c50152Qf.A01;
            if (c59772tI != null) {
                A00 = c59772tI.A00(c59772tI.A04.format(bigDecimal));
            } else {
                throw null;
            }
        }
        C59672t8 c59672t8 = this.A02;
        if (c59672t8.A02) {
            if (bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
                return A04(A00, c59672t8.A00);
            }
            return A04(A00, c59672t8.A01);
        }
        return A00;
    }

    public void A06(int i) {
        C50152Qf c50152Qf = this.A07;
        if (C50152Qf.A02) {
            DecimalFormat decimalFormat = c50152Qf.A00;
            if (decimalFormat != null) {
                decimalFormat.setMinimumFractionDigits(i);
                decimalFormat.setMaximumFractionDigits(i);
                return;
            }
            throw null;
        }
        C59772tI c59772tI = c50152Qf.A01;
        if (c59772tI != null) {
            java.text.DecimalFormat decimalFormat2 = c59772tI.A04;
            decimalFormat2.setMinimumFractionDigits(i);
            decimalFormat2.setMaximumFractionDigits(i);
            return;
        }
        throw null;
    }
}
