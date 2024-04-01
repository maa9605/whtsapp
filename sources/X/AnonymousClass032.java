package X;

import android.util.SparseArray;

/* renamed from: X.032  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass032 {
    public final SparseArray A00;

    public AnonymousClass032(int i) {
        this.A00 = new SparseArray(i);
    }

    public static final int A00(String str) {
        char charAt;
        char charAt2;
        if (str == null || str.length() != 2 || 'A' > (charAt = str.charAt(0)) || charAt > 'Z' || 'A' > (charAt2 = str.charAt(1)) || charAt2 > 'Z') {
            return -1;
        }
        return (charAt2 - 'A') + ((charAt - 'A') * 26);
    }

    public Object A01(String str) {
        int A00 = A00(str);
        if (A00 != -1) {
            return this.A00.get(A00);
        }
        throw new IllegalArgumentException(C000200d.A0I("Invalid country code \"", str, "\"."));
    }

    public void A02(String str, Object obj) {
        int A00 = A00(str);
        if (A00 != -1) {
            this.A00.append(A00, obj);
            return;
        }
        throw new IllegalArgumentException(C000200d.A0I("Invalid country code \"", str, "\"."));
    }

    public void A03(String str, Object obj) {
        int A00 = A00(str);
        if (A00 != -1) {
            this.A00.put(A00, obj);
            return;
        }
        throw new IllegalArgumentException(C000200d.A0I("Invalid country code \"", str, "\"."));
    }
}
