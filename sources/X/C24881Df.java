package X;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X.1Df  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24881Df implements Serializable, Comparator {
    public final float average;

    public C24881Df(float f) {
        this.average = f;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        float f = ((C33291ff) obj2).A00;
        float f2 = this.average;
        float abs = Math.abs(f - f2);
        float abs2 = Math.abs(((C33291ff) obj).A00 - f2);
        if (abs < abs2) {
            return -1;
        }
        return abs == abs2 ? 0 : 1;
    }
}
