package X;

import java.util.Vector;

/* renamed from: X.1X7  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1X7 extends AbstractRunnableC18610u1 {
    @Override // X.AbstractRunnableC18610u1, java.lang.Runnable
    public void run() {
        Vector vector = C18640u4.A02;
        synchronized (vector) {
            int size = vector.size();
            for (int i = 0; i < size; i++) {
                ((C18640u4) vector.get(i)).A01();
            }
        }
    }
}
