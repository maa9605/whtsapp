package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseIntArray;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.0DG  reason: invalid class name */
/* loaded from: classes.dex */
public class C0DG {
    public static final SparseIntArray A03;
    public static volatile boolean A06;
    public final C0Ob A00;
    public final C2Ae A01;
    public final Locale A02;
    public static final Object A05 = new Object();
    public static final C006802z A04 = new C006802z(1);

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(45);
        A03 = sparseIntArray;
        sparseIntArray.put(2, 5);
        sparseIntArray.put(3, 5);
        sparseIntArray.put(4, 5);
        sparseIntArray.put(242, 240);
        sparseIntArray.put(237, 239);
        sparseIntArray.put(243, 241);
        sparseIntArray.put(238, 241);
        sparseIntArray.put(240, 235);
        sparseIntArray.put(239, 233);
        sparseIntArray.put(241, 236);
        sparseIntArray.put(197, 183);
        sparseIntArray.put(195, 181);
        sparseIntArray.put(199, 185);
        sparseIntArray.put(200, 186);
        sparseIntArray.put(198, 184);
        sparseIntArray.put(194, 180);
        sparseIntArray.put(196, 182);
        sparseIntArray.put(204, 190);
        sparseIntArray.put(202, 188);
        sparseIntArray.put(206, 192);
        sparseIntArray.put(207, 193);
        sparseIntArray.put(205, 191);
        sparseIntArray.put(201, 187);
        sparseIntArray.put(203, 189);
        sparseIntArray.put(260, 248);
        sparseIntArray.put(259, 247);
        sparseIntArray.put(263, 251);
        sparseIntArray.put(256, 244);
        sparseIntArray.put(264, 252);
        sparseIntArray.put(262, 250);
        sparseIntArray.put(261, 249);
        sparseIntArray.put(257, 245);
        sparseIntArray.put(267, 255);
        sparseIntArray.put(266, 254);
        sparseIntArray.put(265, 253);
        sparseIntArray.put(258, 246);
        sparseIntArray.put(292, 293);
        sparseIntArray.put(284, 285);
        sparseIntArray.put(290, 291);
        sparseIntArray.put(273, 274);
        sparseIntArray.put(276, 278);
        sparseIntArray.put(281, 283);
        sparseIntArray.put(287, 288);
        sparseIntArray.put(277, 278);
        sparseIntArray.put(282, 283);
    }

    public C0DG(Context context, Resources resources, Locale locale) {
        C0Ob A00;
        C50232Qu c50232Qu;
        C2Qv c2Qv;
        int[] iArr;
        if (AbstractC003201n.A06(locale) == null || (A00 = A00(context, resources, locale)) == null || ((c50232Qu = A00.A01) == null ? (c2Qv = A00.A00) == null || (iArr = c2Qv.A03) == null || iArr.length == 0 : c50232Qu.A02.size() == 0)) {
            locale = Locale.US;
            A00 = A00(context, resources, locale);
        }
        this.A00 = A00;
        this.A01 = C2Ae.A00(locale);
        this.A02 = locale;
    }

    public static C0Ob A00(Context context, Resources resources, Locale locale) {
        String A052 = AbstractC003201n.A05(locale);
        Object obj = A05;
        synchronized (obj) {
            C006802z c006802z = A04;
            int A02 = c006802z.A02(A052);
            if (A02 >= 0) {
                return (C0Ob) c006802z.A02[(A02 << 1) + 1];
            }
            C003801u.A07 = A06;
            C0Ob A00 = C003801u.A00(context, resources, "cldr_strings", locale, true);
            synchronized (obj) {
                c006802z.put(A052, A00);
            }
            return A00;
        }
    }

    public static String A01(Context context, Locale locale, int i) {
        Resources resources = context.getResources();
        C0Ob A00 = A00(context, resources, locale);
        if (A00 == null && (A00 = A00(context, resources, Locale.US)) == null) {
            Log.e("CldrResources/getString: CLDR data not loaded");
            return "";
        }
        return A02(A00, i);
    }

    public static String A02(C0Ob c0Ob, int i) {
        String A01 = c0Ob.A01(i, A06);
        if (A01 == null) {
            int i2 = A03.get(i, -1);
            if (i2 == -1) {
                Log.e(String.format(Locale.US, "CldrResources/getString error: could not find CLDR string for id=%d", Integer.valueOf(i)));
                return "";
            }
            return A02(c0Ob, i2);
        }
        return A01;
    }

    public String A03(int i, Object obj) {
        C0Ob c0Ob = this.A00;
        if (c0Ob == null) {
            Log.e("translations/getQuantityString: CLDR data not loaded");
            return "";
        }
        String A00 = c0Ob.A00(i, obj, this.A01, A06);
        if (A00 == null) {
            int i2 = A03.get(i, -1);
            if (i2 == -1) {
                Log.e(String.format(Locale.US, "CldrResources/getQuantityString error: could not find CLDR string for id=%d", Integer.valueOf(i)));
                return "";
            }
            return A03(i2, obj);
        }
        return A00;
    }
}
