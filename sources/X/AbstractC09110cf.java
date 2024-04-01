package X;

import android.util.SparseArray;

/* renamed from: X.0cf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09110cf {
    public static final C006802z A00 = new C006802z(1);

    static {
        SparseArray sparseArray = new SparseArray(2);
        sparseArray.append(1, new String[]{"januarja", "februarja", "marca", "aprila", "maja", "junija", "julija", "avgusta", "septembra", "oktobra", "novembra", "decembra"});
        sparseArray.append(2, new String[]{"januarjem", "februarjem", "marcem", "aprilom", "majem", "junijem", "julijem", "avgustom", "septembrom", "oktobrom", "novembrom", "decembrom"});
        A00.put("sl", sparseArray);
    }

    public static String[] A00(C002301c c002301c) {
        return new String[]{c002301c.A05(260), c002301c.A05(259), c002301c.A05(263), c002301c.A05(256), c002301c.A05(264), c002301c.A05(262), c002301c.A05(261), c002301c.A05(257), c002301c.A05(267), c002301c.A05(266), c002301c.A05(265), c002301c.A05(258)};
    }

    public static String[] A01(C002301c c002301c, int i) {
        String[] strArr;
        SparseArray sparseArray = (SparseArray) A00.get(c002301c.A04());
        return (sparseArray == null || (strArr = (String[]) sparseArray.get(i)) == null) ? new String[]{c002301c.A05(248), c002301c.A05(247), c002301c.A05(251), c002301c.A05(244), c002301c.A05(252), c002301c.A05(250), c002301c.A05(249), c002301c.A05(245), c002301c.A05(255), c002301c.A05(254), c002301c.A05(253), c002301c.A05(246)} : strArr;
    }
}
