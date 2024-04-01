package X;

import android.view.View;
import java.util.List;

/* renamed from: X.0nw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C15010nw {
    public int A00;
    public int A01;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public boolean A09;
    public boolean A0A;
    public boolean A0B = true;
    public int A02 = 0;
    public List A08 = null;

    public View A00(C15230oI c15230oI) {
        List list = this.A08;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((C0TS) this.A08.get(i)).A0H;
                C0TS c0ts = ((C15170oC) view.getLayoutParams()).A00;
                if (!c0ts.A09() && this.A01 == c0ts.A01()) {
                    A01(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = c15230oI.A01(this.A01, Long.MAX_VALUE).A0H;
        this.A01 += this.A03;
        return view2;
    }

    public void A01(View view) {
        int A01;
        int size = this.A08.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                View view3 = ((C0TS) this.A08.get(i2)).A0H;
                C15170oC c15170oC = (C15170oC) view3.getLayoutParams();
                if (view3 != view) {
                    C0TS c0ts = c15170oC.A00;
                    if (!c0ts.A09() && (A01 = (c0ts.A01() - this.A01) * this.A03) >= 0 && A01 < i) {
                        view2 = view3;
                        if (A01 == 0) {
                            break;
                        }
                        i = A01;
                    }
                }
                i2++;
            } else if (view2 == null) {
                this.A01 = -1;
                return;
            }
        }
        this.A01 = ((C15170oC) view2.getLayoutParams()).A00.A01();
    }
}
