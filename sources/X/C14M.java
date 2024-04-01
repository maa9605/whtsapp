package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.14M  reason: invalid class name */
/* loaded from: classes.dex */
public final class C14M {
    public static final ExecutorService A00 = Executors.newFixedThreadPool(2, new ThreadFactory() { // from class: X.15z
        public final String A00;
        public final AtomicInteger A02 = new AtomicInteger();
        public final ThreadFactory A01 = Executors.defaultThreadFactory();

        {
            C07K.A1Q("GAC_Executor", "Name must not be null");
            this.A00 = "GAC_Executor";
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.A01.newThread(new AnonymousClass160(runnable));
            String str = this.A00;
            int andIncrement = this.A02.getAndIncrement();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
            sb.append(str);
            sb.append("[");
            sb.append(andIncrement);
            sb.append("]");
            newThread.setName(sb.toString());
            return newThread;
        }
    });
}
