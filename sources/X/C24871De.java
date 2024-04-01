package X;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X.1De  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24871De implements Serializable, Comparator {
    public final float average;

    public C24871De(float f) {
        this.average = f;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        C33291ff c33291ff = (C33291ff) obj;
        C33291ff c33291ff2 = (C33291ff) obj2;
        int i = c33291ff2.A01;
        int i2 = c33291ff.A01;
        if (i == i2) {
            float f = c33291ff2.A00;
            float f2 = this.average;
            float abs = Math.abs(f - f2);
            float abs2 = Math.abs(c33291ff.A00 - f2);
            if (abs < abs2) {
                return 1;
            }
            return abs == abs2 ? 0 : -1;
        }
        return i - i2;
    }
}
