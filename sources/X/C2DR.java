package X;

import android.app.Application;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2DR  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2DR implements Runnable, Future {
    public final C001200o A00;
    public final /* synthetic */ C47262An A01;

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    public C2DR(C47262An c47262An, C001200o c001200o) {
        this.A01 = c47262An;
        this.A00 = c001200o;
    }

    @Override // java.util.concurrent.Future
    public /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        C47262An c47262An = this.A01;
        if (c47262An.A02.await(j, timeUnit)) {
            return c47262An.A03.get();
        }
        throw new TimeoutException();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.A01.A02.getCount() == 0;
    }

    @Override // java.lang.Runnable
    public void run() {
        Set set;
        Application application = this.A00.A00;
        Set A01 = C47262An.A01(application, C47262An.A04, "primary-task-killer");
        Set A012 = C47262An.A01(application, C47262An.A05, "secondary-task-killer");
        C47262An c47262An = this.A01;
        AtomicReference atomicReference = c47262An.A03;
        Set set2 = null;
        if (A01 != null) {
            set = Collections.unmodifiableSet(A01);
        } else {
            set = null;
        }
        if (A012 != null) {
            set2 = Collections.unmodifiableSet(A012);
        }
        atomicReference.set(new C2DQ(set, set2));
        c47262An.A02.countDown();
    }
}
