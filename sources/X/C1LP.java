package X;

import android.graphics.Color;
import java.util.Set;

/* renamed from: X.1LP  reason: invalid class name */
/* loaded from: classes.dex */
public class C1LP {
    public static final float[] A06 = {0.25f, 0.25f, 0.25f, 0.25f, 0.75f, 0.75f, 0.75f, 0.75f};
    public static final float[] A07 = {0.25f, 0.3f, 0.75f, 0.8f, 0.25f, 0.3f, 0.75f, 0.8f};
    public static final int[] A08 = {14557250, 14687296, 3292341, 3292341, 1423676, 1423676, 15990016, 15990016};
    public static final int[] A09 = {4408575, 4408575, 10296875, 10296875, 4696576, 4696576, 3014647, 3014647};
    public final AbstractC000600i A00;
    public final C01B A01;
    public final C000400f A02;
    public final C001200o A03;
    public final C000500h A04;
    public final C003701t A05;

    public C1LP(C001200o c001200o, C003701t c003701t, AbstractC000600i abstractC000600i, C01B c01b, C000400f c000400f, C000500h c000500h) {
        this.A03 = c001200o;
        this.A05 = c003701t;
        this.A00 = abstractC000600i;
        this.A01 = c01b;
        this.A02 = c000400f;
        this.A04 = c000500h;
    }

    public static int A00(int i, int i2) {
        return Math.max(Math.max(Math.abs(Color.red(i) - Color.red(i2)), Math.abs(Color.green(i) - Color.green(i2))), Color.blue(i) - Color.blue(i2));
    }

    public static int A01(int i, int[] iArr) {
        return Math.max(Math.max(Math.abs(Color.red(i) - iArr[0]), Math.abs(Color.green(i) - iArr[1])), Color.blue(i) - iArr[2]);
    }

    public static Integer A02(int i, Set set) {
        Integer valueOf = Integer.valueOf(i);
        do {
            int intValue = valueOf.intValue();
            if (intValue == 1) {
                valueOf = 2;
            } else if (intValue == 2) {
                valueOf = 3;
            } else if (intValue == 3) {
                valueOf = 4;
            } else if (intValue != 4) {
                return null;
            } else {
                valueOf = 1;
            }
            if (valueOf == null || valueOf.intValue() == i) {
                return null;
            }
        } while (set.contains(valueOf));
        return valueOf;
    }

    public static final void A03(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(i));
        sb.append(" (");
        sb.append(Color.red(i));
        sb.append(",");
        sb.append(Color.green(i));
        sb.append(",");
        sb.append(Color.blue(i));
        sb.append(")");
        sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x039d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C1LO A04(X.C1LQ r35) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1LP.A04(X.1LQ):X.1LO");
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01cc A[EDGE_INSN: B:127:0x01cc->B:94:0x01cc ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b4 A[Catch: UnsupportedEncodingException | JSONException -> 0x0217, JSONException -> 0x0219, all -> 0x022a, TryCatch #2 {all -> 0x022a, blocks: (B:8:0x0050, B:10:0x0058, B:12:0x005c, B:14:0x0060, B:16:0x0064, B:18:0x0068, B:20:0x006c, B:28:0x0090, B:32:0x00bd, B:31:0x009b, B:77:0x0197, B:79:0x019d, B:89:0x01b4, B:90:0x01ba, B:94:0x01cc, B:96:0x01d0, B:98:0x01d4, B:100:0x01d8, B:34:0x00c6, B:50:0x010b, B:37:0x00cd, B:46:0x00de, B:48:0x00e8, B:51:0x0112, B:55:0x013f, B:54:0x011d, B:57:0x0147, B:74:0x018d, B:60:0x014e, B:70:0x0160, B:72:0x016a, B:93:0x01c7, B:104:0x021a), top: B:125:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ba A[Catch: UnsupportedEncodingException | JSONException -> 0x0217, JSONException -> 0x0219, all -> 0x022a, TryCatch #2 {all -> 0x022a, blocks: (B:8:0x0050, B:10:0x0058, B:12:0x005c, B:14:0x0060, B:16:0x0064, B:18:0x0068, B:20:0x006c, B:28:0x0090, B:32:0x00bd, B:31:0x009b, B:77:0x0197, B:79:0x019d, B:89:0x01b4, B:90:0x01ba, B:94:0x01cc, B:96:0x01d0, B:98:0x01d4, B:100:0x01d8, B:34:0x00c6, B:50:0x010b, B:37:0x00cd, B:46:0x00de, B:48:0x00e8, B:51:0x0112, B:55:0x013f, B:54:0x011d, B:57:0x0147, B:74:0x018d, B:60:0x014e, B:70:0x0160, B:72:0x016a, B:93:0x01c7, B:104:0x021a), top: B:125:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c4 A[LOOP:0: B:125:0x0050->B:92:0x01c4, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05() {
        /*
            Method dump skipped, instructions count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1LP.A05():void");
    }
}
