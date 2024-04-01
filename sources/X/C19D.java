package X;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.19D  reason: invalid class name */
/* loaded from: classes.dex */
public final class C19D {
    public Queue A00;
    public boolean A01;
    public final Object A02 = new Object();

    public final void A00(C0AC c0ac) {
        C19C c19c;
        Object obj = this.A02;
        synchronized (obj) {
            if (this.A00 == null || this.A01) {
                return;
            }
            this.A01 = true;
            while (true) {
                synchronized (obj) {
                    c19c = (C19C) this.A00.poll();
                    if (c19c == null) {
                        this.A01 = false;
                        return;
                    }
                }
                c19c.AIm(c0ac);
            }
        }
    }

    public final void A01(C19C c19c) {
        synchronized (this.A02) {
            Queue queue = this.A00;
            if (queue == null) {
                queue = new ArrayDeque();
                this.A00 = queue;
            }
            queue.add(c19c);
        }
    }
}
