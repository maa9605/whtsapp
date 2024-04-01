package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.Locale;

/* renamed from: X.061 */
/* loaded from: classes.dex */
public abstract class AnonymousClass061 {
    public final AnonymousClass062 A00;

    public void A0C() {
    }

    public AnonymousClass061(AnonymousClass062 anonymousClass062) {
        this.A00 = anonymousClass062;
        anonymousClass062.A06.A00(new AnonymousClass066(this));
    }

    public static long A03(C0CD c0cd, String str, ContentValues contentValues) {
        C0CE c0ce = c0cd.A02;
        A07("ContactProvider/insertOrReplace/INSERT_", str);
        return c0ce.A03(str, contentValues);
    }

    public static long A04(C0CD c0cd, String str, ContentValues contentValues, String str2, String[] strArr) {
        C0CE c0ce = c0cd.A02;
        A07("ContactProvider/delete/UPDATE_", str);
        return c0ce.A00(str, contentValues, str2, strArr);
    }

    public static Cursor A05(C0CD c0cd, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4) {
        return c0cd.A02.A09(str, strArr, str2, strArr2, str3, C000200d.A0H("ContactProvider/query/QUERY_", str4));
    }

    public static C0HC A06() {
        C0HC c0hc = new C0HC(true);
        c0hc.A03();
        return c0hc;
    }

    public static String A07(String str, String str2) {
        StringBuilder A0P = C000200d.A0P(str);
        A0P.append(str2.toUpperCase(Locale.ROOT));
        return A0P.toString();
    }

    public static void A08(C0CD c0cd, String str, ContentValues contentValues) {
        C0CE c0ce = c0cd.A02;
        A07("ContactProvider/insertOrReplace/REPLACE_", str);
        c0ce.A05(str, contentValues);
    }

    public static void A09(C0CD c0cd, String str, String str2, String[] strArr) {
        C0CE c0ce = c0cd.A02;
        A07("ContactProvider/delete/DELETE_", str);
        c0ce.A01(str, str2, strArr);
    }

    public C0CD A0A() {
        return new C0CD(null, this.A00, false);
    }

    public C0CD A0B() {
        return this.A00.A03();
    }
}
