package X;

import java.io.PrintStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.16x */
/* loaded from: classes.dex */
public final class C234916x {
    public static final AbstractC234816w A00;

    static {
        AbstractC234816w abstractC234816w;
        Integer num;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e) {
                PrintStream printStream = System.err;
                printStream.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e.printStackTrace(printStream);
            }
        } catch (Throwable th) {
            PrintStream printStream2 = System.err;
            String name = C31481cL.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream2.println(sb.toString());
            th.printStackTrace(printStream2);
            abstractC234816w = new AbstractC234816w() { // from class: X.1cL
                @Override // X.AbstractC234816w
                public final void A00(Throwable th2, Throwable th3) {
                }
            };
        }
        if (num != null && num.intValue() >= 19) {
            abstractC234816w = new AbstractC234816w() { // from class: X.1cN
                @Override // X.AbstractC234816w
                public final void A00(Throwable th2, Throwable th3) {
                }
            };
            A00 = abstractC234816w;
        }
        if (!Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
            abstractC234816w = new AbstractC234816w() { // from class: X.1cM
                public final C16z A00 = new C16z();

                @Override // X.AbstractC234816w
                public final void A00(Throwable th2, Throwable th3) {
                    if (th3 == th2) {
                        throw new IllegalArgumentException("Self suppression is not allowed.", th3);
                    }
                    if (th3 != null) {
                        C16z c16z = this.A00;
                        ReferenceQueue referenceQueue = c16z.A00;
                        for (Reference poll = referenceQueue.poll(); poll != null; poll = referenceQueue.poll()) {
                            c16z.A01.remove(poll);
                        }
                        WeakReference weakReference = new WeakReference(th2, null) { // from class: X.16y
                            public final int A00;

                            {
                                super(th2, r4);
                                if (th2 == null) {
                                    throw new NullPointerException("The referent cannot be null");
                                }
                                this.A00 = System.identityHashCode(th2);
                            }

                            public final boolean equals(Object obj) {
                                if (obj != null && obj.getClass() == C235016y.class) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    C235016y c235016y = (C235016y) obj;
                                    if (this.A00 == c235016y.A00 && get() == c235016y.get()) {
                                        return true;
                                    }
                                }
                                return false;
                            }

                            public final int hashCode() {
                                return this.A00;
                            }
                        };
                        ConcurrentHashMap concurrentHashMap = c16z.A01;
                        List list = (List) concurrentHashMap.get(weakReference);
                        if (list == null) {
                            list = new Vector(2);
                            List list2 = (List) concurrentHashMap.putIfAbsent(new WeakReference(th2, referenceQueue) { // from class: X.16y
                                public final int A00;

                                {
                                    super(th2, referenceQueue);
                                    if (th2 == null) {
                                        throw new NullPointerException("The referent cannot be null");
                                    }
                                    this.A00 = System.identityHashCode(th2);
                                }

                                public final boolean equals(Object obj) {
                                    if (obj != null && obj.getClass() == C235016y.class) {
                                        if (this == obj) {
                                            return true;
                                        }
                                        C235016y c235016y = (C235016y) obj;
                                        if (this.A00 == c235016y.A00 && get() == c235016y.get()) {
                                            return true;
                                        }
                                    }
                                    return false;
                                }

                                public final int hashCode() {
                                    return this.A00;
                                }
                            }, list);
                            if (list2 != null) {
                                list = list2;
                            }
                        }
                        list.add(th3);
                        return;
                    }
                    throw new NullPointerException("The suppressed exception cannot be null.");
                }
            };
        } else {
            abstractC234816w = new AbstractC234816w() { // from class: X.1cL
                @Override // X.AbstractC234816w
                public final void A00(Throwable th2, Throwable th3) {
                }
            };
        }
        A00 = abstractC234816w;
    }
}
