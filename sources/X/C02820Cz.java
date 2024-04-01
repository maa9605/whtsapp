package X;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: X.0Cz */
/* loaded from: classes.dex */
public final class C02820Cz extends C0D0 implements C0D1, C0D2 {
    public int A00;
    public boolean A01;
    public final AbstractC02800Cx A02;

    public C02820Cz(AbstractC02800Cx abstractC02800Cx) {
        C0UG c0ug = abstractC02800Cx.A06;
        if (c0ug != null) {
            c0ug.A01.getClassLoader();
        }
        this.A00 = -1;
        this.A02 = abstractC02800Cx;
    }

    public static boolean A00(C09320d3 c09320d3) {
        C0XM c0xm;
        C0BA c0ba = c09320d3.A05;
        return (c0ba == null || !c0ba.A0T || c0ba.A0A == null || c0ba.A0W || c0ba.A0Z || (c0xm = c0ba.A0C) == null || !c0xm.A0C) ? false : true;
    }

    @Override // X.C0D0
    public int A04() {
        return A0A(false);
    }

    @Override // X.C0D0
    public int A05() {
        return A0A(true);
    }

    @Override // X.C0D0
    public C0D0 A06(C0BA c0ba) {
        AbstractC02800Cx abstractC02800Cx = c0ba.A0H;
        if (abstractC02800Cx != null && abstractC02800Cx != this.A02) {
            StringBuilder A0P = C000200d.A0P("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            A0P.append(c0ba.toString());
            A0P.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(A0P.toString());
        }
        A02(new C09320d3(3, c0ba));
        return this;
    }

    @Override // X.C0D0
    public C0D0 A07(C0BA c0ba, EnumC02560Bx enumC02560Bx) {
        EnumC02560Bx enumC02560Bx2 = EnumC02560Bx.CREATED;
        AbstractC02800Cx abstractC02800Cx = c0ba.A0H;
        AbstractC02800Cx abstractC02800Cx2 = this.A02;
        if (abstractC02800Cx == abstractC02800Cx2) {
            if (enumC02560Bx.compareTo(enumC02560Bx2) >= 0) {
                super.A07(c0ba, enumC02560Bx);
                return this;
            }
            StringBuilder sb = new StringBuilder("Cannot set maximum Lifecycle below ");
            sb.append(enumC02560Bx2);
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder A0P = C000200d.A0P("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
        A0P.append(abstractC02800Cx2);
        throw new IllegalArgumentException(A0P.toString());
    }

    @Override // X.C0D0
    public void A08() {
        if (!this.A0D) {
            this.A0E = false;
            this.A02.A0h(this, true);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    @Override // X.C0D0
    public void A09(int i, C0BA c0ba, String str, int i2) {
        super.A09(i, c0ba, str, i2);
        c0ba.A0H = this.A02;
    }

    public int A0A(boolean z) {
        if (!this.A01) {
            if (AbstractC02800Cx.A01(2)) {
                StringBuilder sb = new StringBuilder("Commit: ");
                sb.append(this);
                Log.v("FragmentManager", sb.toString());
                PrintWriter printWriter = new PrintWriter(new C13030kU());
                A0D("  ", printWriter, true);
                printWriter.close();
            }
            this.A01 = true;
            if (this.A0D) {
                this.A00 = this.A02.A0T.getAndIncrement();
            } else {
                this.A00 = -1;
            }
            this.A02.A0g(this, z);
            return this.A00;
        }
        throw new IllegalStateException("commit already called");
    }

    public void A0B() {
        AbstractC02800Cx abstractC02800Cx;
        int size = this.A0A.size();
        for (int i = 0; i < size; i++) {
            C09320d3 c09320d3 = (C09320d3) this.A0A.get(i);
            C0BA c0ba = c09320d3.A05;
            if (c0ba != null) {
                int i2 = this.A06;
                if (c0ba.A0C != null || i2 != 0) {
                    c0ba.A06();
                    c0ba.A0C.A01 = i2;
                }
            }
            int i3 = c09320d3.A00;
            switch (i3) {
                case 1:
                    c0ba.A0M(c09320d3.A01);
                    abstractC02800Cx = this.A02;
                    abstractC02800Cx.A0e(c0ba, false);
                    abstractC02800Cx.A0Q(c0ba);
                    break;
                case 2:
                default:
                    StringBuilder A0P = C000200d.A0P("Unknown cmd: ");
                    A0P.append(i3);
                    throw new IllegalArgumentException(A0P.toString());
                case 3:
                    c0ba.A0M(c09320d3.A02);
                    abstractC02800Cx = this.A02;
                    abstractC02800Cx.A0W(c0ba);
                    break;
                case 4:
                    c0ba.A0M(c09320d3.A02);
                    abstractC02800Cx = this.A02;
                    abstractC02800Cx.A0T(c0ba);
                    break;
                case 5:
                    c0ba.A0M(c09320d3.A01);
                    abstractC02800Cx = this.A02;
                    abstractC02800Cx.A0e(c0ba, false);
                    AbstractC02800Cx.A00(c0ba);
                    break;
                case 6:
                    c0ba.A0M(c09320d3.A02);
                    abstractC02800Cx = this.A02;
                    abstractC02800Cx.A0S(c0ba);
                    break;
                case 7:
                    c0ba.A0M(c09320d3.A01);
                    abstractC02800Cx = this.A02;
                    abstractC02800Cx.A0e(c0ba, false);
                    abstractC02800Cx.A0R(c0ba);
                    break;
                case 8:
                    abstractC02800Cx = this.A02;
                    abstractC02800Cx.A0X(c0ba);
                    break;
                case 9:
                    abstractC02800Cx = this.A02;
                    abstractC02800Cx.A0X(null);
                    break;
                case 10:
                    abstractC02800Cx = this.A02;
                    abstractC02800Cx.A0d(c0ba, c09320d3.A06);
                    break;
            }
            if (!this.A0F && c09320d3.A00 != 1 && c0ba != null) {
                abstractC02800Cx.A0V(c0ba);
            }
        }
        if (this.A0F) {
            return;
        }
        AbstractC02800Cx abstractC02800Cx2 = this.A02;
        abstractC02800Cx2.A0K(abstractC02800Cx2.A00, true);
    }

    public void A0C(int i) {
        if (this.A0D) {
            if (AbstractC02800Cx.A01(2)) {
                StringBuilder sb = new StringBuilder("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
                Log.v("FragmentManager", sb.toString());
            }
            int size = this.A0A.size();
            for (int i2 = 0; i2 < size; i2++) {
                C09320d3 c09320d3 = (C09320d3) this.A0A.get(i2);
                C0BA c0ba = c09320d3.A05;
                if (c0ba != null) {
                    c0ba.A01 += i;
                    if (AbstractC02800Cx.A01(2)) {
                        StringBuilder A0P = C000200d.A0P("Bump nesting of ");
                        A0P.append(c09320d3.A05);
                        A0P.append(" to ");
                        A0P.append(c09320d3.A05.A01);
                        Log.v("FragmentManager", A0P.toString());
                    }
                }
            }
        }
    }

    public void A0D(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.A09);
            printWriter.print(" mIndex=");
            printWriter.print(this.A00);
            printWriter.print(" mCommitted=");
            printWriter.println(this.A01);
            if (this.A06 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.A06));
            }
            if (super.A02 != 0 || this.A03 != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(super.A02));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.A03));
            }
            if (this.A04 != 0 || this.A05 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.A04));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.A05));
            }
            if (super.A01 != 0 || this.A08 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(super.A01));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.A08);
            }
            if (super.A00 != 0 || this.A07 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(super.A00));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.A07);
            }
        }
        if (!this.A0A.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.A0A.size();
            for (int i = 0; i < size; i++) {
                C09320d3 c09320d3 = (C09320d3) this.A0A.get(i);
                int i2 = c09320d3.A00;
                switch (i2) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder A0P = C000200d.A0P("cmd=");
                        A0P.append(i2);
                        str2 = A0P.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(c09320d3.A05);
                if (z) {
                    if (c09320d3.A01 != 0 || c09320d3.A02 != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c09320d3.A01));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c09320d3.A02));
                    }
                    if (c09320d3.A03 != 0 || c09320d3.A04 != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c09320d3.A03));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c09320d3.A04));
                    }
                }
            }
        }
    }

    public void A0E(boolean z) {
        for (int size = this.A0A.size() - 1; size >= 0; size--) {
            C09320d3 c09320d3 = (C09320d3) this.A0A.get(size);
            C0BA c0ba = c09320d3.A05;
            if (c0ba != null) {
                int i = this.A06;
                int i2 = 8194;
                if (i != 4097) {
                    if (i != 4099) {
                        i2 = 4097;
                        if (i != 8194) {
                            i2 = 0;
                        }
                    } else {
                        i2 = 4099;
                    }
                }
                if (c0ba.A0C != null || i2 != 0) {
                    c0ba.A06();
                    c0ba.A0C.A01 = i2;
                }
            }
            int i3 = c09320d3.A00;
            switch (i3) {
                case 1:
                    c0ba.A0M(c09320d3.A04);
                    AbstractC02800Cx abstractC02800Cx = this.A02;
                    abstractC02800Cx.A0e(c0ba, true);
                    abstractC02800Cx.A0W(c0ba);
                    break;
                case 2:
                default:
                    StringBuilder A0P = C000200d.A0P("Unknown cmd: ");
                    A0P.append(i3);
                    throw new IllegalArgumentException(A0P.toString());
                case 3:
                    c0ba.A0M(c09320d3.A03);
                    this.A02.A0Q(c0ba);
                    break;
                case 4:
                    c0ba.A0M(c09320d3.A03);
                    AbstractC02800Cx.A00(c0ba);
                    break;
                case 5:
                    c0ba.A0M(c09320d3.A04);
                    AbstractC02800Cx abstractC02800Cx2 = this.A02;
                    abstractC02800Cx2.A0e(c0ba, true);
                    abstractC02800Cx2.A0T(c0ba);
                    break;
                case 6:
                    c0ba.A0M(c09320d3.A03);
                    this.A02.A0R(c0ba);
                    break;
                case 7:
                    c0ba.A0M(c09320d3.A04);
                    AbstractC02800Cx abstractC02800Cx3 = this.A02;
                    abstractC02800Cx3.A0e(c0ba, true);
                    abstractC02800Cx3.A0S(c0ba);
                    break;
                case 8:
                    this.A02.A0X(null);
                    break;
                case 9:
                    this.A02.A0X(c0ba);
                    break;
                case 10:
                    this.A02.A0d(c0ba, c09320d3.A07);
                    break;
            }
            if (!this.A0F && c09320d3.A00 != 3 && c0ba != null) {
                this.A02.A0V(c0ba);
            }
        }
        if (this.A0F || !z) {
            return;
        }
        AbstractC02800Cx abstractC02800Cx4 = this.A02;
        abstractC02800Cx4.A0K(abstractC02800Cx4.A00, true);
    }

    public boolean A0F(int i) {
        int i2;
        ArrayList arrayList = this.A0A;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0BA c0ba = ((C09320d3) arrayList.get(i3)).A05;
            if (c0ba != null && (i2 = c0ba.A02) != 0 && i2 == i) {
                return true;
            }
        }
        return false;
    }

    public boolean A0G(ArrayList arrayList, int i, int i2) {
        int i3;
        if (i2 == i) {
            return false;
        }
        ArrayList arrayList2 = this.A0A;
        int size = arrayList2.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            C0BA c0ba = ((C09320d3) arrayList2.get(i5)).A05;
            if (c0ba != null && (i3 = c0ba.A02) != 0 && i3 != i4) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0D0 c0d0 = (C0D0) arrayList.get(i6);
                    int size2 = c0d0.A0A.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        C0BA c0ba2 = ((C09320d3) c0d0.A0A.get(i7)).A05;
                        if (c0ba2 != null && c0ba2.A02 == i3) {
                            return true;
                        }
                    }
                }
                i4 = i3;
            }
        }
        return false;
    }

    @Override // X.C0D1
    public boolean A89(ArrayList arrayList, ArrayList arrayList2) {
        if (AbstractC02800Cx.A01(2)) {
            StringBuilder sb = new StringBuilder("Run: ");
            sb.append(this);
            Log.v("FragmentManager", sb.toString());
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.A0D) {
            AbstractC02800Cx abstractC02800Cx = this.A02;
            ArrayList arrayList3 = abstractC02800Cx.A09;
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                abstractC02800Cx.A09 = arrayList3;
            }
            arrayList3.add(this);
            return true;
        }
        return true;
    }

    @Override // X.C0D2
    public String getName() {
        return this.A09;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        int i = this.A00;
        if (i >= 0) {
            sb.append(" #");
            sb.append(i);
        }
        String str = this.A09;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("}");
        return sb.toString();
    }
}
