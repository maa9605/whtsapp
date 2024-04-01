package X;

import android.graphics.Color;
import android.widget.ImageView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/* renamed from: X.08i */
/* loaded from: classes.dex */
public final class C08i {
    public static final ThreadLocal A01 = new ThreadLocal() { // from class: X.1ED
        @Override // java.lang.ThreadLocal
        public Object initialValue() {
            return new DecimalFormat(r1, DecimalFormatSymbols.getInstance(Locale.US));
        }
    };
    public static final ThreadLocal A02 = new ThreadLocal() { // from class: X.1ED
        @Override // java.lang.ThreadLocal
        public Object initialValue() {
            return new DecimalFormat(r1, DecimalFormatSymbols.getInstance(Locale.US));
        }
    };
    public static final ThreadLocal A00 = new ThreadLocal() { // from class: X.1ED
        @Override // java.lang.ThreadLocal
        public Object initialValue() {
            return new DecimalFormat(r1, DecimalFormatSymbols.getInstance(Locale.US));
        }
    };
    public static final ThreadLocal A03 = new ThreadLocal() { // from class: X.1ED
        @Override // java.lang.ThreadLocal
        public Object initialValue() {
            return new DecimalFormat(r1, DecimalFormatSymbols.getInstance(Locale.US));
        }
    };

    public static float A00(String str) {
        try {
            return ((NumberFormat) A01.get()).parse(str).floatValue() * 100.0f;
        } catch (ParseException e) {
            throw new C018208m(C000200d.A0H("can't parse pixel value: ", str), e);
        }
    }

    public static float A01(String str) {
        try {
            if (str.endsWith("px")) {
                return ((NumberFormat) A02.get()).parse(str).floatValue();
            }
            if (str.endsWith("sp")) {
                return Math.round(((NumberFormat) A03.get()).parse(str).floatValue() * C09M.A00().A01.getResources().getDisplayMetrics().scaledDensity);
            }
            return Math.round((C09M.A00().A01.getResources().getDisplayMetrics().densityDpi / 160.0f) * ((NumberFormat) A00.get()).parse(str).floatValue());
        } catch (ParseException e) {
            throw new C018208m(C000200d.A0H("can't parse pixel value: ", str), e);
        }
    }

    public static float A02(String str) {
        try {
            return ((NumberFormat) A03.get()).parse(str).floatValue();
        } catch (ParseException e) {
            throw new C018208m(C000200d.A0H("can't parse scaled pixel value: ", str), e);
        }
    }

    public static float A03(String str, float f) {
        return str == null ? f : A01(str);
    }

    public static int A04(String str) {
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException e) {
            throw new C018208m(C000200d.A0H("can't parse color value: ", str), e);
        }
    }

    public static int A05(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1364013995) {
            if (hashCode != 100571) {
                if (hashCode == 109757538 && str.equals("start")) {
                    return 8388611;
                }
            } else if (str.equals("end")) {
                return 8388613;
            }
        } else if (str.equals("center")) {
            return 1;
        }
        throw new C018208m(C000200d.A0H("can't parse unknown textAlign: ", str));
    }

    public static int A06(String str) {
        switch (str.hashCode()) {
            case -2141169668:
                if (str.equals("cap_words")) {
                    return 139265;
                }
                break;
            case -1831299680:
                if (str.equals("cap_letters")) {
                    return 135169;
                }
                break;
            case -1413853096:
                if (str.equals("amount")) {
                    return 12290;
                }
                break;
            case -1034364087:
                if (str.equals("number")) {
                    return 2;
                }
                break;
            case 3076014:
                if (str.equals("date")) {
                    return 20;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    return 131073;
                }
                break;
            case 96619420:
                if (str.equals("email")) {
                    return 33;
                }
                break;
            case 260133443:
                if (str.equals("cap_sentences")) {
                    return 180225;
                }
                break;
            case 1216389502:
                if (str.equals("passcode")) {
                    return 18;
                }
                break;
            case 1216985755:
                if (str.equals("password")) {
                    return 129;
                }
                break;
        }
        throw new C018208m(C000200d.A0H("can't parse unknown inputType: ", str));
    }

    public static int A07(String str) {
        switch (str.hashCode()) {
            case -1178781136:
                if (str.equals("italic")) {
                    return 2;
                }
                break;
            case -1039745817:
                if (str.equals("normal")) {
                    return 0;
                }
                break;
            case 3029637:
                if (str.equals("bold")) {
                    return 1;
                }
                break;
            case 1734741290:
                if (str.equals("bold_italic")) {
                    return 3;
                }
                break;
        }
        throw new C018208m(C000200d.A0H("can't parse unknown typeface: ", str));
    }

    public static ImageView.ScaleType A08(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1881872635) {
            if (hashCode != 94852023) {
                if (hashCode == 951526612 && str.equals("contain")) {
                    return ImageView.ScaleType.FIT_CENTER;
                }
            } else if (str.equals("cover")) {
                return ImageView.ScaleType.CENTER_CROP;
            }
        } else if (str.equals("stretch")) {
            return ImageView.ScaleType.FIT_XY;
        }
        throw new C018208m(C000200d.A0H("can't parse unknown scaleType: ", str));
    }

    public static C1EH A09(String str) {
        if ("auto".equalsIgnoreCase(str)) {
            return C1EH.A02;
        }
        if (str.endsWith("%")) {
            return new C1EH(Float.parseFloat(str.substring(0, str.length() - 1)), C1EG.PERCENT);
        }
        return new C1EH(A01(str), C1EG.PIXEL);
    }

    public static AnonymousClass080 A0A(C0AL c0al, C25311Ew c25311Ew) {
        return (AnonymousClass080) ((InterfaceC25301Ev) c25311Ew.A00.get(AnonymousClass080.class)).AQZ(c0al, c25311Ew);
    }

    public static String A0B(C0AL c0al) {
        InterfaceC020309j AQi = c0al.AQi();
        C0AM AQh = c0al.AQh();
        int ordinal = AQh.ordinal();
        if (ordinal != 5) {
            if (ordinal == 7) {
                return String.valueOf(AQi.AG8());
            }
            StringBuilder sb = new StringBuilder("Bloks id only supports long and String types but got: ");
            sb.append(AQh);
            throw new C018208m(sb.toString());
        }
        return AQi.AVG();
    }
}
