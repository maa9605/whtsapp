package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;

/* renamed from: X.0u2  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C18620u2 {
    public static int A00 = Integer.MAX_VALUE;
    public static volatile C29491Wz A03;
    public static final Handler A02 = new Handler(Looper.getMainLooper());
    public static final int A01 = Math.max((int) (Runtime.getRuntime().availableProcessors() * 1.5f), 3);

    public static C29491Wz A00() {
        if (A03 == null) {
            synchronized (C18620u2.class) {
                if (A03 == null) {
                    A03 = new C29491Wz(A01);
                }
            }
        }
        return A03;
    }

    public static void A01(AbstractRunnableC18610u1 abstractRunnableC18610u1) {
        int i = A00;
        A00 = i - 1;
        abstractRunnableC18610u1.A00 = i << 32;
        abstractRunnableC18610u1.A02 = null;
        abstractRunnableC18610u1.A01 = 0L;
        A00().A00.add(abstractRunnableC18610u1);
    }

    public static void A02(AbstractRunnableC18610u1 abstractRunnableC18610u1, String str) {
        int i = A00;
        A00 = i - 1;
        abstractRunnableC18610u1.A00 = i << 32;
        abstractRunnableC18610u1.A02 = str;
        abstractRunnableC18610u1.A01 = 0L;
        A00().A00.add(abstractRunnableC18610u1);
    }

    public static void A03(String str) {
        BlockingQueue<AbstractRunnableC18610u1> blockingQueue = A00().A00;
        for (AbstractRunnableC18610u1 abstractRunnableC18610u1 : blockingQueue) {
            if (str.equals(abstractRunnableC18610u1.A02)) {
                blockingQueue.remove(abstractRunnableC18610u1);
                abstractRunnableC18610u1.A00();
            }
        }
    }
}
