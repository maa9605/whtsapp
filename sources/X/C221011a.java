package X;

import java.util.regex.Pattern;

/* renamed from: X.11a  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C221011a {
    static {
        Pattern.compile("^NOTE(( |\t).*)?$");
    }

    public static float A00(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long A01(String str) {
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str2 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            j2 += Long.parseLong(split[1]);
        }
        return j2 * 1000;
    }
}
