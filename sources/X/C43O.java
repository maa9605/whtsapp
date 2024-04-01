package X;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.43O  reason: invalid class name */
/* loaded from: classes3.dex */
public class C43O implements Callable {
    public final /* synthetic */ C43T A00;

    public C43O(C43T c43t) {
        this.A00 = c43t;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C43S c43s;
        C43T c43t = this.A00;
        if (c43t.A0P) {
            List list = c43t.A0O;
            if (list.isEmpty() || (c43s = (C43S) list.remove(0)) == null) {
                return null;
            }
            c43t.A0N.A06(new C43P(c43t, c43s.A00, c43s.A01), "restart_preview_on_background_thread");
            return null;
        }
        return null;
    }
}
