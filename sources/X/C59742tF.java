package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.2tF  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59742tF {
    public final Collection A00;
    public final Collection A01;

    public C59742tF(String... strArr) {
        Collection emptySet;
        int length = strArr.length;
        if (length == 0) {
            emptySet = Collections.emptySet();
        } else if (length == 1) {
            emptySet = Collections.singleton(strArr[0]);
        } else if (length != 2 && length != 3 && length != 4 && length != 5) {
            emptySet = new HashSet(Arrays.asList(strArr));
        } else {
            emptySet = Arrays.asList(strArr);
        }
        this.A00 = emptySet;
        this.A01 = new HashSet();
        for (String str : strArr) {
            Collection collection = this.A01;
            Object[] objArr = (Object[]) C59752tG.A02.A00.get(str);
            if (objArr != null) {
                Collections.addAll(collection, objArr);
            } else {
                throw null;
            }
        }
    }
}
