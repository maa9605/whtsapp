package X;

import java.lang.ref.ReferenceQueue;

/* renamed from: X.0wD  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19850wD {
    public static final Thread A02;
    public static final C19840wC A01 = new C19840wC();
    public static final ReferenceQueue A03 = new ReferenceQueue();
    public static final C19830wB A00 = new C19830wB();

    static {
        Thread thread = new Thread() { // from class: X.0w9
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (true) {
                    try {
                        AbstractC19820wA abstractC19820wA = (AbstractC19820wA) C19850wD.A03.remove();
                        abstractC19820wA.destruct();
                        if (abstractC19820wA.A01 == null) {
                            AbstractC19820wA abstractC19820wA2 = (AbstractC19820wA) C19850wD.A01.A00.getAndSet(null);
                            while (abstractC19820wA2 != null) {
                                AbstractC19820wA abstractC19820wA3 = abstractC19820wA2.A00;
                                AbstractC19820wA abstractC19820wA4 = C19850wD.A00.A00;
                                abstractC19820wA2.A00 = abstractC19820wA4.A00;
                                abstractC19820wA4.A00 = abstractC19820wA2;
                                abstractC19820wA2.A00.A01 = abstractC19820wA2;
                                abstractC19820wA2.A01 = abstractC19820wA4;
                                abstractC19820wA2 = abstractC19820wA3;
                            }
                        }
                        AbstractC19820wA abstractC19820wA5 = abstractC19820wA.A00;
                        abstractC19820wA5.A01 = abstractC19820wA.A01;
                        abstractC19820wA.A01.A00 = abstractC19820wA5;
                    } catch (InterruptedException unused) {
                    }
                }
            }
        };
        A02 = thread;
        thread.start();
    }
}
