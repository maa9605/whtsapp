package X;

import android.content.Context;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1qE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39501qE extends AbstractC28721Ti implements C14E {
    public Set A00;
    public Semaphore A01;

    public C39501qE(Context context, Set set) {
        super(context);
        this.A01 = new Semaphore(0);
        this.A00 = set;
    }

    @Override // X.C13930m5
    public final void A02() {
        this.A01.drainPermits();
        A00();
    }

    @Override // X.AbstractC28721Ti
    public final Object A07() {
        int i = 0;
        for (C0NE c0ne : this.A00) {
            if (c0ne.A0C(this)) {
                i++;
            }
        }
        try {
            this.A01.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // X.C14E
    public final void AIk() {
        this.A01.release();
    }
}
