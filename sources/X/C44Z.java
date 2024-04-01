package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.44Z  reason: invalid class name */
/* loaded from: classes3.dex */
public class C44Z {
    public static int[] A00(List list) {
        int i;
        Iterator it = list.iterator();
        int[] iArr = null;
        int i2 = Integer.MAX_VALUE;
        while (it.hasNext()) {
            int[] iArr2 = (int[]) it.next();
            if (iArr2[1] >= 30000 && (i = iArr2[0]) < i2) {
                i2 = i;
                iArr = iArr2;
            }
        }
        return iArr == null ? (int[]) list.get(list.size() - 1) : iArr;
    }
}
