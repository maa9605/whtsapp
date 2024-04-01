package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.205  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass205 {
    public static final String[] A00 = new String[0];

    public static Boolean A00(String str) {
        if ("1".equals(str)) {
            return Boolean.TRUE;
        }
        if ("0".equals(str)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static String[] A01(Collection collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(AbstractC44611zM.A00(((AbstractC44611zM) it.next()).A06()));
        }
        return (String[]) linkedHashSet.toArray(A00);
    }

    public static String[] A02(String[] strArr, AnonymousClass094 anonymousClass094, AbstractC005302j abstractC005302j) {
        int length = strArr.length;
        String[] strArr2 = new String[length + 4];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            strArr2[i2] = strArr[i];
            i++;
            i2++;
        }
        int i3 = i2 + 1;
        AbstractC005302j abstractC005302j2 = anonymousClass094.A00;
        if (abstractC005302j2 != null) {
            strArr2[i2] = abstractC005302j2.getRawString();
            int i4 = i3 + 1;
            strArr2[i3] = anonymousClass094.A01;
            int i5 = i4 + 1;
            strArr2[i4] = anonymousClass094.A02 ? "1" : "0";
            strArr2[i5] = abstractC005302j != null ? abstractC005302j.getRawString() : "0";
            return strArr2;
        }
        throw null;
    }
}
