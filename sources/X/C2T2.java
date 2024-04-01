package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Stack;

/* renamed from: X.2T2  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2T2 extends Stack<C2T3> {
    public C2T2() {
        push(new C2T3(0, 0, null, ""));
    }

    public void A00(C2T3 c2t3) {
        Integer num;
        if (size() > 0) {
            C2T3 peek = peek();
            if (peek.A00 == 1 && c2t3.A00 == 1) {
                pop();
            }
            if (peek.A00 == 3 && c2t3.A00 == 3 && peek.A01 == c2t3.A01) {
                pop();
            }
        }
        Iterator<C2T3> it = iterator();
        while (it.hasNext()) {
            if (it.next().A00 == c2t3.A00) {
                it.remove();
            }
        }
        int i = c2t3.A00;
        if (i == 3 && c2t3.A01 == null) {
            return;
        }
        if (i == 1 && TextUtils.isEmpty(c2t3.A03)) {
            return;
        }
        if (c2t3.A00 == 2 && ((num = c2t3.A02) == null || num.intValue() == 0)) {
            return;
        }
        push(c2t3);
    }
}
