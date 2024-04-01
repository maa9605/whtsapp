package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0TR */
/* loaded from: classes.dex */
public abstract class C0TR {
    public InterfaceC15130o8 A04 = null;
    public ArrayList A05 = new ArrayList();
    public long A00 = 120;
    public long A03 = 120;
    public long A02 = 250;
    public long A01 = 250;

    public abstract boolean A04(C0TS c0ts, C0TS c0ts2, C15140o9 c15140o9, C15140o9 c15140o92);

    public abstract void A05();

    public abstract void A06();

    public abstract void A07(C0TS c0ts);

    public abstract boolean A08();

    public static C15140o9 A00(C0TS c0ts) {
        C15140o9 c15140o9 = new C15140o9();
        View view = c0ts.A0H;
        c15140o9.A00 = view.getLeft();
        c15140o9.A01 = view.getTop();
        view.getRight();
        view.getBottom();
        return c15140o9;
    }

    public static void A01(C0TS c0ts) {
        int i = c0ts.A00 & 14;
        if (!c0ts.A08() && (i & 4) == 0) {
            c0ts.A00();
        }
    }

    public final void A02() {
        ArrayList arrayList = this.A05;
        if (0 < arrayList.size()) {
            arrayList.get(0);
            throw null;
        } else {
            arrayList.clear();
        }
    }

    public final void A03(C0TS c0ts) {
        InterfaceC15130o8 interfaceC15130o8 = this.A04;
        if (interfaceC15130o8 != null) {
            C1UT c1ut = (C1UT) interfaceC15130o8;
            if (c1ut != null) {
                boolean z = true;
                c0ts.A07(true);
                if (c0ts.A0A != null && c0ts.A0B == null) {
                    c0ts.A0A = null;
                }
                c0ts.A0B = null;
                if ((c0ts.A00 & 16) == 0) {
                    RecyclerView recyclerView = c1ut.A00;
                    View view = c0ts.A0H;
                    recyclerView.A0R();
                    C14640nL c14640nL = recyclerView.A0K;
                    int indexOfChild = ((C1UR) c14640nL.A01).A00.indexOfChild(view);
                    if (indexOfChild == -1) {
                        c14640nL.A07(view);
                    } else {
                        C14620nJ c14620nJ = c14640nL.A00;
                        if (!c14620nJ.A06(indexOfChild)) {
                            z = false;
                            recyclerView.A0v(!z);
                            if (z && c0ts.A0A()) {
                                recyclerView.removeDetachedView(view, false);
                                return;
                            }
                            return;
                        }
                        c14620nJ.A07(indexOfChild);
                        c14640nL.A07(view);
                        ((C1UR) c14640nL.A01).A00(indexOfChild);
                    }
                    C0TS A01 = RecyclerView.A01(view);
                    C15230oI c15230oI = recyclerView.A0x;
                    c15230oI.A09(A01);
                    c15230oI.A08(A01);
                    recyclerView.A0v(!z);
                    if (z) {
                        return;
                    }
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public boolean A09(C0TS c0ts, List list) {
        return !((C0TQ) this).A00 || c0ts.A08();
    }
}
