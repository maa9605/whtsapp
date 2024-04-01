package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.1US  reason: invalid class name */
/* loaded from: classes.dex */
public class C1US implements InterfaceC14540nB {
    public final /* synthetic */ RecyclerView A00;

    public C1US(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void A00(int i, int i2) {
        RecyclerView recyclerView = this.A00;
        int A01 = recyclerView.A0K.A01();
        for (int i3 = 0; i3 < A01; i3++) {
            C0TS A012 = RecyclerView.A01(recyclerView.A0K.A04(i3));
            if (A012 != null && !A012.A0B() && A012.A05 >= i) {
                A012.A06(i2, false);
                recyclerView.A0z.A0D = true;
            }
        }
        ArrayList arrayList = recyclerView.A0x.A05;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0TS c0ts = (C0TS) arrayList.get(i4);
            if (c0ts != null && c0ts.A05 >= i) {
                c0ts.A06(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.A0l = true;
    }

    public void A01(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.A00;
        int A01 = recyclerView.A0K.A01();
        int i5 = -1;
        int i6 = i;
        int i7 = i2;
        int i8 = 1;
        if (i < i2) {
            i7 = i;
            i6 = i2;
            i8 = -1;
        }
        for (int i9 = 0; i9 < A01; i9++) {
            C0TS A012 = RecyclerView.A01(recyclerView.A0K.A04(i9));
            if (A012 != null && (i4 = A012.A05) >= i7 && i4 <= i6) {
                if (i4 == i) {
                    A012.A06(i2 - i, false);
                } else {
                    A012.A06(i8, false);
                }
                recyclerView.A0z.A0D = true;
            }
        }
        C15230oI c15230oI = recyclerView.A0x;
        int i10 = i;
        int i11 = i2;
        if (i >= i2) {
            i11 = i;
            i10 = i2;
            i5 = 1;
        }
        ArrayList arrayList = c15230oI.A05;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            C0TS c0ts = (C0TS) arrayList.get(i12);
            if (c0ts != null && (i3 = c0ts.A05) >= i10 && i3 <= i11) {
                if (i3 == i) {
                    c0ts.A06(i2 - i, false);
                } else {
                    c0ts.A06(i5, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.A0l = true;
    }

    public void A02(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.A00;
        int A01 = recyclerView.A0K.A01();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < A01; i6++) {
            View A04 = recyclerView.A0K.A04(i6);
            C0TS A012 = RecyclerView.A01(A04);
            if (A012 != null && !A012.A0B() && (i4 = A012.A05) >= i && i4 < i5) {
                A012.A04(2);
                if (obj != null) {
                    if ((1024 & A012.A00) == 0) {
                        if (A012.A0E == null) {
                            ArrayList arrayList = new ArrayList();
                            A012.A0E = arrayList;
                            A012.A0F = Collections.unmodifiableList(arrayList);
                        }
                        A012.A0E.add(obj);
                    }
                } else {
                    A012.A04(1024);
                }
                ((C15170oC) A04.getLayoutParams()).A01 = true;
            }
        }
        C15230oI c15230oI = recyclerView.A0x;
        ArrayList arrayList2 = c15230oI.A05;
        int size = arrayList2.size();
        while (true) {
            size--;
            if (size >= 0) {
                C0TS c0ts = (C0TS) arrayList2.get(size);
                if (c0ts != null && (i3 = c0ts.A05) >= i && i3 < i5) {
                    c0ts.A04(2);
                    c15230oI.A04(size);
                }
            } else {
                recyclerView.A0m = true;
                return;
            }
        }
    }

    public void A03(C14550nC c14550nC) {
        int i = c14550nC.A00;
        if (i == 1) {
            RecyclerView recyclerView = this.A00;
            recyclerView.A0S.A13(recyclerView, c14550nC.A02, c14550nC.A01);
        } else if (i == 2) {
            RecyclerView recyclerView2 = this.A00;
            recyclerView2.A0S.A14(recyclerView2, c14550nC.A02, c14550nC.A01);
        } else if (i == 4) {
            RecyclerView recyclerView3 = this.A00;
            recyclerView3.A0S.A16(recyclerView3, c14550nC.A02, c14550nC.A01, c14550nC.A03);
        } else if (i == 8) {
            RecyclerView recyclerView4 = this.A00;
            recyclerView4.A0S.A15(recyclerView4, c14550nC.A02, c14550nC.A01, 1);
        }
    }
}
