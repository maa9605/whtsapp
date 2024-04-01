package X;

import java.util.Arrays;

/* renamed from: X.11l  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C222111l {
    public int A00;
    public final int A01;
    public final InterfaceC222011k[] A02;

    public C222111l(InterfaceC222011k... interfaceC222011kArr) {
        this.A02 = interfaceC222011kArr;
        this.A01 = interfaceC222011kArr.length;
    }

    public InterfaceC222011k[] A00() {
        return (InterfaceC222011k[]) this.A02.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C222111l.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A02, ((C222111l) obj).A02);
    }

    public int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int hashCode = 527 + Arrays.hashCode(this.A02);
            this.A00 = hashCode;
            return hashCode;
        }
        return i;
    }
}
