package X;

import android.os.ConditionVariable;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.2DA  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2DA {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ConditionVariable A02;
    public final /* synthetic */ ConditionVariable A03;
    public final /* synthetic */ C25w A04;

    public C2DA(C25w c25w, ConditionVariable conditionVariable, ConditionVariable conditionVariable2, int i, int i2) {
        this.A04 = c25w;
        this.A02 = conditionVariable;
        this.A03 = conditionVariable2;
        this.A00 = i;
        this.A01 = i2;
    }

    public void A00() {
        ConditionVariable conditionVariable = this.A03;
        if (conditionVariable != null && this.A00 == 0) {
            conditionVariable.open();
        }
        if (3 == this.A00) {
            C25w c25w = this.A04;
            c25w.A06.getAndIncrement();
            ReentrantLock reentrantLock = c25w.A08;
            if (reentrantLock.isHeldByCurrentThread()) {
                c25w.A07.signalAll();
                reentrantLock.unlock();
            }
        }
    }
}
