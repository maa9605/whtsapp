package X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.2Tp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50882Tp {
    public final int A00;
    public final int A01;
    public final C50902Tr A02;
    public final List A03;
    public final boolean A04;
    public final int[] A05;

    public C50882Tp(int i, boolean z, int i2, int[] iArr, C50902Tr c50902Tr, List list) {
        this.A00 = i;
        this.A04 = z;
        this.A01 = i2;
        this.A05 = iArr;
        this.A02 = c50902Tr;
        this.A03 = list;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("json version: 1, api version: ");
        A0P.append(this.A00);
        A0P.append(", front camera: ");
        A0P.append(this.A04);
        A0P.append(", orientation: ");
        A0P.append(this.A01);
        A0P.append(", formats: ");
        A0P.append(Arrays.toString(this.A05));
        A0P.append(", preferred size: ");
        A0P.append(this.A02);
        A0P.append(", sizes: ");
        List list = this.A03;
        A0P.append(list != null ? TextUtils.join(", ", list) : "null");
        return A0P.toString();
    }
}
