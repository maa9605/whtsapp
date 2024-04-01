package X;

import android.content.Context;
import android.icu.text.DateTimePatternGenerator;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.text.format.Time;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.0Cd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C02620Cd {
    public static final AbstractC54682jB A01 = new AbstractC54682jB() { // from class: X.2jA
    };
    public static final AbstractC54682jB A04 = new AbstractC54682jB() { // from class: X.2jC
    };
    public static final AbstractC54682jB A03 = new AbstractC54682jB() { // from class: X.2jD
    };
    public static final AbstractC54682jB A00 = new AbstractC54682jB() { // from class: X.2jE
    };
    public static final AbstractC54682jB A02 = new AbstractC54682jB() { // from class: X.2jF
    };

    public static int A00(long j, long j2) {
        Time time = new Time();
        time.set(j);
        time.set(j2);
        return ((int) (((time.gmtoff * 1000) + j) / 86400000)) - ((int) (((time.gmtoff * 1000) + j2) / 86400000));
    }

    public static long A01(long j) {
        long j2;
        long j3;
        long currentTimeMillis = System.currentTimeMillis() - j;
        long j4 = 3600000;
        if (currentTimeMillis < 3600000) {
            j4 = 60000;
            j3 = currentTimeMillis / 60000;
        } else if (currentTimeMillis >= 86400000) {
            j2 = 0;
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.add(5, 1);
            gregorianCalendar.set(11, 0);
            gregorianCalendar.set(12, 0);
            gregorianCalendar.set(13, 0);
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            return (j2 != 0 || j2 > timeInMillis) ? timeInMillis : j2;
        } else {
            j3 = currentTimeMillis / 3600000;
        }
        j2 = (j3 * j4) + j + j4;
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.add(5, 1);
        gregorianCalendar2.set(11, 0);
        gregorianCalendar2.set(12, 0);
        gregorianCalendar2.set(13, 0);
        long timeInMillis2 = gregorianCalendar2.getTimeInMillis();
        if (j2 != 0) {
        }
    }

    public static String A02(long j) {
        return ((DateFormat) A01.A01()).format(new Date(j));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e4, code lost:
        if (r11.equals("yyyyMMMMdEEEE") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ef, code lost:
        if (r11.equals("MMMMdEEEE") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fa, code lost:
        if (r11.equals("MMMMd") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0105, code lost:
        if (r11.equals("yyyyMMMMd") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010f, code lost:
        if (r11.equals("yyyy") != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0118, code lost:
        if (r11.equals("MMMM") != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011f, code lost:
        if (r11.equals("EEEE") != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A03(android.content.Context r10, java.lang.String r11, boolean r12, java.util.Date r13, java.util.Locale r14) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02620Cd.A03(android.content.Context, java.lang.String, boolean, java.util.Date, java.util.Locale):java.lang.String");
    }

    public static String A04(Context context, Date date, Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return new SimpleDateFormat(DateTimePatternGenerator.getInstance(locale).getBestPattern("yyyyMMMMdEEEEjjmmz"), locale).format(date);
        }
        if (i >= 18) {
            return new java.text.SimpleDateFormat(android.text.format.DateFormat.getBestDateTimePattern(locale, "yyyyMMMMdEEEEjjmmz"), locale).format(date);
        }
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(1, 3, locale);
        TimeZone timeZone = dateTimeInstance.getTimeZone();
        return MessageFormat.format(C0DG.A01(context, locale, 0), dateTimeInstance.format(date), timeZone.getDisplayName(timeZone.inDaylightTime(date), 0, locale));
    }

    public static String A05(C002301c c002301c, String str, String str2) {
        return MessageFormat.format(c002301c.A05(179), str2, str);
    }

    public static boolean A06(long j, long j2) {
        Calendar calendar = (Calendar) A04.A01();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = (Calendar) A03.A01();
        calendar2.setTimeInMillis(j2);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    public static boolean A07(long j, long j2) {
        Calendar calendar = (Calendar) A04.A01();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = (Calendar) A03.A01();
        calendar2.setTimeInMillis(j2);
        return calendar.get(1) == calendar2.get(1);
    }
}
