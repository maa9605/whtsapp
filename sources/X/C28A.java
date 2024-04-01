package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.28A  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C28A {
    public static final Pattern A02 = Pattern.compile("(\\d{3})(\\d{2,3})");
    public final String A00;
    public final String A01;

    public C28A(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public static C28A A00(String str) {
        String str2 = "000";
        if (str == null) {
            return new C28A("000", "000");
        }
        Matcher matcher = A02.matcher(str);
        if (!matcher.matches()) {
            return new C28A("000", "000");
        }
        String group = matcher.group(1);
        try {
            str2 = String.format(Locale.US, "%03d", Integer.valueOf(Integer.valueOf(matcher.group(2)).intValue()));
        } catch (NumberFormatException e) {
            StringBuilder A0P = C000200d.A0P("mccmnc/parse mnc not parseable as integer: ");
            A0P.append(matcher.group(2));
            Log.e(A0P.toString(), e);
        }
        return new C28A(group, str2);
    }

    public static String A01(String str, String str2) {
        if (str == null) {
            return str2;
        }
        Matcher matcher = A02.matcher(str);
        return !matcher.matches() ? str2 : C000200d.A0I(matcher.group(1), "-", matcher.group(2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C28A.class != obj.getClass()) {
            return false;
        }
        C28A c28a = (C28A) obj;
        return TextUtils.equals(this.A00, c28a.A00) && TextUtils.equals(this.A01, c28a.A01);
    }

    public int hashCode() {
        String str = this.A00;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.A01;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("MccMnc<");
        A0P.append(this.A00);
        A0P.append(",");
        return C000200d.A0L(A0P, this.A01, ">");
    }
}
