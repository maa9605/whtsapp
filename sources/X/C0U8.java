package X;

import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: X.0U8 */
/* loaded from: classes.dex */
public final class C0U8 {
    public final Runnable A00;
    public final ArrayDeque A01 = new ArrayDeque();

    public C0U8(Runnable runnable) {
        this.A00 = runnable;
    }

    public void A00() {
        Iterator descendingIterator = this.A01.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0UL c0ul = (C0UL) descendingIterator.next();
            if (c0ul.A01) {
                AbstractC02800Cx abstractC02800Cx = ((C0UK) c0ul).A00;
                abstractC02800Cx.A0p(true);
                if (abstractC02800Cx.A0N.A01) {
                    abstractC02800Cx.A0s();
                    return;
                } else {
                    abstractC02800Cx.A01.A00();
                    return;
                }
            }
        }
        Runnable runnable = this.A00;
        if (runnable != null) {
            runnable.run();
        }
    }
}
