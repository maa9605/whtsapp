package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.45e  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C889745e {
    public final C1FH A00;
    public final ViewTreeObserver$OnGlobalLayoutListenerC889645d A01;
    public final AtomicBoolean A02;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1FH] */
    public C889745e() {
        new Iterable() { // from class: X.1gy
            public final List A00 = new ArrayList();

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return this.A00.iterator();
            }
        };
        this.A00 = new Object() { // from class: X.1FH
        };
        this.A02 = new AtomicBoolean(false);
        this.A01 = new ViewTreeObserver$OnGlobalLayoutListenerC889645d();
    }
}
