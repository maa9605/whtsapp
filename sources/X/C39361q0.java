package X;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: X.1q0  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39361q0 implements InterfaceC222011k {
    public int A00;
    public final int A01;
    public final C220710x A02;
    public final int[] A03;
    public final C21030yg[] A04;

    public C39361q0(C220710x c220710x, int... iArr) {
        int i;
        int length = iArr.length;
        C002701i.A1K(length > 0);
        if (c220710x != null) {
            this.A02 = c220710x;
            this.A01 = length;
            C21030yg[] c21030ygArr = new C21030yg[length];
            this.A04 = c21030ygArr;
            for (int i2 = 0; i2 < length; i2++) {
                c21030ygArr[i2] = c220710x.A02[iArr[i2]];
            }
            Arrays.sort(c21030ygArr, new Comparator() { // from class: X.11b
                @Override // java.util.Comparator
                public int compare(Object obj, Object obj2) {
                    return ((C21030yg) obj2).A04 - ((C21030yg) obj).A04;
                }
            });
            int i3 = this.A01;
            int[] iArr2 = new int[i3];
            this.A03 = iArr2;
            for (int i4 = 0; i4 < i3; i4++) {
                C21030yg c21030yg = this.A04[i4];
                while (true) {
                    C21030yg[] c21030ygArr2 = c220710x.A02;
                    if (i >= c21030ygArr2.length) {
                        i = -1;
                        break;
                    }
                    i = c21030yg != c21030ygArr2[i] ? i + 1 : 0;
                }
                iArr2[i4] = i;
            }
            return;
        }
        throw null;
    }

    @Override // X.InterfaceC222011k
    public final C21030yg AAG(int i) {
        return this.A04[i];
    }

    @Override // X.InterfaceC222011k
    public final int AAZ(int i) {
        return this.A03[i];
    }

    @Override // X.InterfaceC222011k
    public final C220710x ADY() {
        return this.A02;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C39361q0 c39361q0 = (C39361q0) obj;
        return this.A02 == c39361q0.A02 && Arrays.equals(this.A03, c39361q0.A03);
    }

    public int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.A03) + (System.identityHashCode(this.A02) * 31);
            this.A00 = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // X.InterfaceC222011k
    public final int length() {
        return this.A03.length;
    }
}
