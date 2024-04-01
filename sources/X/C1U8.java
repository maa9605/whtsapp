package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1U8 */
/* loaded from: classes.dex */
public class C1U8 implements InterfaceC15050o0 {
    public final InterfaceC14540nB A02;
    public C13040kV A01 = new C13040kV(30);
    public final ArrayList A04 = new ArrayList();
    public final ArrayList A05 = new ArrayList();
    public int A00 = 0;
    public final C15060o1 A03 = new C15060o1(this);

    public C1U8(InterfaceC14540nB interfaceC14540nB) {
        this.A02 = interfaceC14540nB;
    }

    public int A00(int i, int i2) {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        while (i2 < size) {
            C14550nC c14550nC = (C14550nC) arrayList.get(i2);
            int i3 = c14550nC.A00;
            if (i3 == 8) {
                int i4 = c14550nC.A02;
                if (i4 == i) {
                    i = c14550nC.A01;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c14550nC.A01 <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c14550nC.A02;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c14550nC.A01;
                    int i7 = i;
                    i -= i6;
                    if (i7 < i5 + i6) {
                        return -1;
                    }
                } else if (i3 == 1) {
                    i += c14550nC.A01;
                }
            }
            i2++;
        }
        return i;
    }

    public final int A01(int i, int i2) {
        ArrayList arrayList = this.A05;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C14550nC c14550nC = (C14550nC) arrayList.get(size);
            int i3 = c14550nC.A00;
            if (i3 == 8) {
                int i4 = c14550nC.A02;
                int i5 = c14550nC.A01;
                if (i4 >= i5) {
                    i5 = i4;
                    i4 = i5;
                }
                if (i >= i4 && i <= i5) {
                    int i6 = c14550nC.A02;
                    if (i4 == i6) {
                        if (i2 == 1) {
                            c14550nC.A01++;
                        } else if (i2 == 2) {
                            c14550nC.A01--;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            c14550nC.A02 = i6 + 1;
                        } else if (i2 == 2) {
                            c14550nC.A02 = i6 - 1;
                        }
                        i--;
                    }
                } else {
                    int i7 = c14550nC.A02;
                    if (i < i7) {
                        if (i2 == 1) {
                            c14550nC.A02 = i7 + 1;
                            c14550nC.A01++;
                        } else if (i2 == 2) {
                            c14550nC.A02 = i7 - 1;
                            c14550nC.A01--;
                        }
                    }
                }
            } else {
                int i8 = c14550nC.A02;
                if (i8 <= i) {
                    if (i3 == 1) {
                        i -= c14550nC.A01;
                    } else if (i3 == 2) {
                        i += c14550nC.A01;
                    }
                } else if (i2 == 1) {
                    c14550nC.A02 = i8 + 1;
                } else if (i2 == 2) {
                    c14550nC.A02 = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C14550nC c14550nC2 = (C14550nC) arrayList.get(size2);
            if (c14550nC2.A00 == 8) {
                int i9 = c14550nC2.A01;
                if (i9 == c14550nC2.A02 || i9 < 0) {
                    arrayList.remove(size2);
                    c14550nC2.A03 = null;
                    this.A01.A01(c14550nC2);
                }
            } else if (c14550nC2.A01 <= 0) {
                arrayList.remove(size2);
                c14550nC2.A03 = null;
                this.A01.A01(c14550nC2);
            }
        }
        return i;
    }

    public C14550nC A02(int i, int i2, int i3, Object obj) {
        C14550nC c14550nC = (C14550nC) this.A01.A00();
        if (c14550nC == null) {
            return new C14550nC(i, i2, i3, obj);
        }
        c14550nC.A00 = i;
        c14550nC.A02 = i2;
        c14550nC.A01 = i3;
        c14550nC.A03 = obj;
        return c14550nC;
    }

    public void A03() {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C1US) this.A02).A03((C14550nC) arrayList.get(i));
        }
        A09(arrayList);
        this.A00 = 0;
    }

    public void A04() {
        A03();
        ArrayList arrayList = this.A04;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C14550nC c14550nC = (C14550nC) arrayList.get(i);
            int i2 = c14550nC.A00;
            if (i2 == 1) {
                C1US c1us = (C1US) this.A02;
                c1us.A03(c14550nC);
                c1us.A00(c14550nC.A02, c14550nC.A01);
            } else if (i2 == 2) {
                C1US c1us2 = (C1US) this.A02;
                c1us2.A03(c14550nC);
                int i3 = c14550nC.A02;
                int i4 = c14550nC.A01;
                RecyclerView recyclerView = c1us2.A00;
                recyclerView.A0e(i3, i4, true);
                recyclerView.A0l = true;
                recyclerView.A0z.A00 += i4;
            } else if (i2 == 4) {
                C1US c1us3 = (C1US) this.A02;
                c1us3.A03(c14550nC);
                c1us3.A02(c14550nC.A02, c14550nC.A01, c14550nC.A03);
            } else if (i2 == 8) {
                C1US c1us4 = (C1US) this.A02;
                c1us4.A03(c14550nC);
                c1us4.A01(c14550nC.A02, c14550nC.A01);
            }
        }
        A09(arrayList);
        this.A00 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:260:0x00b3, code lost:
        if (r3.A01 != (r6 - r1)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x011d, code lost:
        if (r3.A01 != (r1 - r6)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0122, code lost:
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x020a, code lost:
        if (r0.A0K.A02.contains(r15.A0H) != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x026e, code lost:
        if (r0.A0K.A02.contains(r15.A0H) != false) goto L191;
     */
    /* JADX WARN: Removed duplicated region for block: B:240:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x000a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05() {
        /*
            Method dump skipped, instructions count: 703
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1U8.A05():void");
    }

    public final void A06(C14550nC c14550nC) {
        int i;
        int i2 = c14550nC.A00;
        if (i2 != 1 && i2 != 8) {
            int A01 = A01(c14550nC.A02, i2);
            int i3 = c14550nC.A02;
            int i4 = c14550nC.A00;
            if (i4 == 2) {
                i = 0;
            } else if (i4 != 4) {
                StringBuilder sb = new StringBuilder("op should be remove or update.");
                sb.append(c14550nC);
                throw new IllegalArgumentException(sb.toString());
            } else {
                i = 1;
            }
            int i5 = 1;
            for (int i6 = 1; i6 < c14550nC.A01; i6++) {
                int A012 = A01((i * i6) + c14550nC.A02, i4);
                i4 = c14550nC.A00;
                if (i4 == 2 ? A012 != A01 : !(i4 == 4 && A012 == A01 + 1)) {
                    C14550nC A02 = A02(i4, A01, i5, c14550nC.A03);
                    A08(A02, i3);
                    A02.A03 = null;
                    this.A01.A01(A02);
                    i4 = c14550nC.A00;
                    if (i4 == 4) {
                        i3 += i5;
                    }
                    A01 = A012;
                    i5 = 1;
                } else {
                    i5++;
                }
            }
            Object obj = c14550nC.A03;
            c14550nC.A03 = null;
            this.A01.A01(c14550nC);
            if (i5 > 0) {
                C14550nC A022 = A02(c14550nC.A00, A01, i5, obj);
                A08(A022, i3);
                A022.A03 = null;
                this.A01.A01(A022);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public final void A07(C14550nC c14550nC) {
        this.A05.add(c14550nC);
        int i = c14550nC.A00;
        if (i == 1) {
            ((C1US) this.A02).A00(c14550nC.A02, c14550nC.A01);
        } else if (i == 2) {
            InterfaceC14540nB interfaceC14540nB = this.A02;
            int i2 = c14550nC.A02;
            int i3 = c14550nC.A01;
            RecyclerView recyclerView = ((C1US) interfaceC14540nB).A00;
            recyclerView.A0e(i2, i3, false);
            recyclerView.A0l = true;
        } else if (i == 4) {
            ((C1US) this.A02).A02(c14550nC.A02, c14550nC.A01, c14550nC.A03);
        } else if (i == 8) {
            ((C1US) this.A02).A01(c14550nC.A02, c14550nC.A01);
        } else {
            StringBuilder sb = new StringBuilder("Unknown update op type for ");
            sb.append(c14550nC);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void A08(C14550nC c14550nC, int i) {
        C1US c1us = (C1US) this.A02;
        c1us.A03(c14550nC);
        int i2 = c14550nC.A00;
        if (i2 != 2) {
            if (i2 == 4) {
                c1us.A02(i, c14550nC.A01, c14550nC.A03);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i3 = c14550nC.A01;
        RecyclerView recyclerView = c1us.A00;
        recyclerView.A0e(i, i3, true);
        recyclerView.A0l = true;
        recyclerView.A0z.A00 += i3;
    }

    public void A09(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C14550nC c14550nC = (C14550nC) list.get(i);
            c14550nC.A03 = null;
            this.A01.A01(c14550nC);
        }
        list.clear();
    }

    public final boolean A0A(int i) {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C14550nC c14550nC = (C14550nC) arrayList.get(i2);
            int i3 = c14550nC.A00;
            if (i3 == 8) {
                if (A00(c14550nC.A01, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c14550nC.A02;
                int i5 = c14550nC.A01 + i4;
                while (i4 < i5) {
                    if (A00(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }
}
