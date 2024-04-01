package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0nY */
/* loaded from: classes.dex */
public class C14770nY {
    public final int A00;
    public final int A01;
    public final AbstractC14760nX A02;
    public final List A03;
    public final boolean A04;
    public final int[] A05;
    public final int[] A06;

    public C14770nY(AbstractC14760nX abstractC14760nX, List list, int[] iArr, int[] iArr2) {
        C14810nc c14810nc;
        this.A03 = list;
        this.A06 = iArr;
        this.A05 = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(this.A05, 0);
        this.A02 = abstractC14760nX;
        this.A01 = abstractC14760nX.A01();
        this.A00 = abstractC14760nX.A00();
        this.A04 = true;
        if (this.A03.isEmpty() || (c14810nc = (C14810nc) this.A03.get(0)) == null || c14810nc.A01 != 0 || c14810nc.A02 != 0) {
            C14810nc c14810nc2 = new C14810nc();
            c14810nc2.A01 = 0;
            c14810nc2.A02 = 0;
            c14810nc2.A03 = false;
            c14810nc2.A00 = 0;
            c14810nc2.A04 = false;
            this.A03.add(0, c14810nc2);
        }
        int i = this.A01;
        int i2 = this.A00;
        for (int size = this.A03.size() - 1; size >= 0; size--) {
            C14810nc c14810nc3 = (C14810nc) this.A03.get(size);
            int i3 = c14810nc3.A01;
            int i4 = c14810nc3.A00;
            int i5 = i3 + i4;
            int i6 = c14810nc3.A02 + i4;
            if (this.A04) {
                while (i > i5) {
                    int i7 = i - 1;
                    if (this.A06[i7] == 0) {
                        A01(i, i2, size, false);
                    }
                    i = i7;
                }
                while (i2 > i6) {
                    int i8 = i2 - 1;
                    if (this.A05[i8] == 0) {
                        A01(i, i2, size, true);
                    }
                    i2 = i8;
                }
            }
            for (int i9 = 0; i9 < c14810nc3.A00; i9++) {
                int i10 = c14810nc3.A01 + i9;
                int i11 = c14810nc3.A02 + i9;
                int i12 = 2;
                if (this.A02.A03(i10, i11)) {
                    i12 = 1;
                }
                this.A06[i10] = (i11 << 5) | i12;
                this.A05[i11] = (i10 << 5) | i12;
            }
            i = c14810nc3.A01;
            i2 = c14810nc3.A02;
        }
    }

    public static C14790na A00(List list, int i, boolean z) {
        int size = list.size() - 1;
        while (size >= 0) {
            C14790na c14790na = (C14790na) list.get(size);
            if (c14790na.A01 == i && c14790na.A02 == z) {
                list.remove(size);
                while (size < list.size()) {
                    C14790na c14790na2 = (C14790na) list.get(size);
                    int i2 = c14790na2.A00;
                    int i3 = -1;
                    if (z) {
                        i3 = 1;
                    }
                    c14790na2.A00 = i2 + i3;
                    size++;
                }
                return c14790na;
            }
            size--;
        }
        return null;
    }

    public final void A01(int i, int i2, int i3, boolean z) {
        int i4;
        int i5 = i - 1;
        int i6 = i5;
        if (z) {
            i2--;
            i6 = i;
            i5 = i2;
        }
        while (i3 >= 0) {
            C14810nc c14810nc = (C14810nc) this.A03.get(i3);
            int i7 = c14810nc.A01;
            int i8 = c14810nc.A00;
            int i9 = i7 + i8;
            int i10 = c14810nc.A02 + i8;
            if (z) {
                for (int i11 = i6 - 1; i11 >= i9; i11--) {
                    AbstractC14760nX abstractC14760nX = this.A02;
                    if (abstractC14760nX.A04(i11, i5)) {
                        i4 = abstractC14760nX.A03(i11, i5) ? 8 : 4;
                        this.A05[i5] = (i11 << 5) | 16;
                        this.A06[i11] = (i5 << 5) | i4;
                        return;
                    }
                }
                continue;
            } else {
                for (int i12 = i2 - 1; i12 >= i10; i12--) {
                    AbstractC14760nX abstractC14760nX2 = this.A02;
                    if (abstractC14760nX2.A04(i5, i12)) {
                        i4 = abstractC14760nX2.A03(i5, i12) ? 8 : 4;
                        int i13 = i - 1;
                        this.A06[i13] = (i12 << 5) | 16;
                        this.A05[i12] = (i13 << 5) | i4;
                        return;
                    }
                }
                continue;
            }
            i6 = c14810nc.A01;
            i2 = c14810nc.A02;
            i3--;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A02(InterfaceC15040nz interfaceC15040nz) {
        C1UB c1ub;
        if (interfaceC15040nz instanceof C1UB) {
            c1ub = (C1UB) interfaceC15040nz;
        } else {
            c1ub = new InterfaceC15040nz(interfaceC15040nz) { // from class: X.1UB
                public final InterfaceC15040nz A04;
                public int A02 = 0;
                public int A01 = -1;
                public int A00 = -1;
                public Object A03 = null;

                {
                    this.A04 = interfaceC15040nz;
                }

                public void A00() {
                    int i = this.A02;
                    if (i == 0) {
                        return;
                    }
                    if (i == 1) {
                        this.A04.AL5(this.A01, this.A00);
                    } else if (i == 2) {
                        this.A04.ANn(this.A01, this.A00);
                    } else if (i == 3) {
                        this.A04.AIJ(this.A01, this.A00, this.A03);
                    }
                    this.A03 = null;
                    this.A02 = 0;
                }

                @Override // X.InterfaceC15040nz
                public void AIJ(int i, int i2, Object obj) {
                    int i3;
                    int i4;
                    int i5;
                    if (this.A02 == 3 && i <= (i4 = (i3 = this.A01) + this.A00) && (i5 = i + i2) >= i3 && this.A03 == obj) {
                        int min = Math.min(i, i3);
                        this.A01 = min;
                        this.A00 = Math.max(i4, i5) - min;
                        return;
                    }
                    A00();
                    this.A01 = i;
                    this.A00 = i2;
                    this.A03 = obj;
                    this.A02 = 3;
                }

                @Override // X.InterfaceC15040nz
                public void AL5(int i, int i2) {
                    int i3;
                    if (this.A02 == 1 && i >= (i3 = this.A01)) {
                        int i4 = this.A00;
                        if (i <= i3 + i4) {
                            this.A00 = i4 + i2;
                            this.A01 = Math.min(i, i3);
                            return;
                        }
                    }
                    A00();
                    this.A01 = i;
                    this.A00 = i2;
                    this.A02 = 1;
                }

                @Override // X.InterfaceC15040nz
                public void AMG(int i, int i2) {
                    A00();
                    this.A04.AMG(i, i2);
                }

                @Override // X.InterfaceC15040nz
                public void ANn(int i, int i2) {
                    int i3;
                    if (this.A02 == 2 && (i3 = this.A01) >= i && i3 <= i + i2) {
                        this.A00 += i2;
                        this.A01 = i;
                        return;
                    }
                    A00();
                    this.A01 = i;
                    this.A00 = i2;
                    this.A02 = 2;
                }
            };
        }
        ArrayList arrayList = new ArrayList();
        int i = this.A01;
        int i2 = this.A00;
        List list = this.A03;
        for (int size = list.size() - 1; size >= 0; size--) {
            C14810nc c14810nc = (C14810nc) list.get(size);
            int i3 = c14810nc.A00;
            int i4 = c14810nc.A01 + i3;
            int i5 = c14810nc.A02 + i3;
            int i6 = 8;
            int i7 = 4;
            if (i4 < i) {
                int i8 = i - i4;
                if (this.A04) {
                    int i9 = i8 - 1;
                    while (i9 >= 0) {
                        int[] iArr = this.A06;
                        int i10 = i4 + i9;
                        int i11 = iArr[i10] & 31;
                        if (i11 == 0) {
                            c1ub.ANn(i10, 1);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C14790na) it.next()).A00--;
                            }
                        } else if (i11 == i7 || i11 == i6) {
                            int i12 = iArr[i10] >> 5;
                            C14790na A00 = A00(arrayList, i12, false);
                            c1ub.AMG(i10, A00.A00 - 1);
                            if (i11 == 4) {
                                c1ub.AIJ(A00.A00 - 1, 1, this.A02.A02(i10, i12));
                            }
                        } else if (i11 == 16) {
                            arrayList.add(new C14790na(i10, i10, true));
                        } else {
                            StringBuilder A0Q = C000200d.A0Q("unknown flag for pos ", i10, " ");
                            A0Q.append(Long.toBinaryString(i11));
                            throw new IllegalStateException(A0Q.toString());
                        }
                        i9--;
                        i6 = 8;
                        i7 = 4;
                    }
                } else {
                    c1ub.ANn(i4, i8);
                }
            }
            if (i5 < i2) {
                int i13 = i2 - i5;
                if (this.A04) {
                    while (true) {
                        i13--;
                        if (i13 < 0) {
                            break;
                        }
                        int[] iArr2 = this.A05;
                        int i14 = i5 + i13;
                        int i15 = iArr2[i14] & 31;
                        if (i15 == 0) {
                            c1ub.AL5(i4, 1);
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                ((C14790na) it2.next()).A00++;
                            }
                        } else if (i15 == i7 || i15 == 8) {
                            int i16 = iArr2[i14] >> 5;
                            c1ub.AMG(A00(arrayList, i16, true).A00, i4);
                            if (i15 == i7) {
                                c1ub.AIJ(i4, 1, this.A02.A02(i16, i14));
                            }
                        } else if (i15 == 16) {
                            arrayList.add(new C14790na(i14, i4, false));
                        } else {
                            StringBuilder A0Q2 = C000200d.A0Q("unknown flag for pos ", i14, " ");
                            A0Q2.append(Long.toBinaryString(i15));
                            throw new IllegalStateException(A0Q2.toString());
                        }
                    }
                } else {
                    c1ub.AL5(i4, i13);
                }
            }
            for (int i17 = i3 - 1; i17 >= 0; i17--) {
                int[] iArr3 = this.A06;
                int i18 = c14810nc.A01;
                if ((iArr3[i18 + i17] & 31) == 2) {
                    int i19 = i18 + i17;
                    c1ub.AIJ(i19, 1, this.A02.A02(i19, c14810nc.A02 + i17));
                }
            }
            i = c14810nc.A01;
            i2 = c14810nc.A02;
        }
        c1ub.A00();
    }
}
