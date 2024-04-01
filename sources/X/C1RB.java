package X;

import java.util.List;

/* renamed from: X.1RB  reason: invalid class name */
/* loaded from: classes.dex */
public class C1RB extends Exception {
    public C1RB(String str) {
        super(str);
    }

    public C1RB(Throwable th) {
        super(th);
    }

    public C1RB(List list) {
        super("No valid sessions.", (Throwable) list.get(0));
    }
}
