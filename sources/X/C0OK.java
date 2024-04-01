package X;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0OK  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0OK {
    public C0OL A00;
    public UUID A02;
    public boolean A03 = false;
    public Set A01 = new HashSet();

    public abstract C0OM A01();

    public C0OK(Class workerClass) {
        UUID randomUUID = UUID.randomUUID();
        this.A02 = randomUUID;
        String obj = randomUUID.toString();
        String name = workerClass.getName();
        this.A00 = new C0OL(obj, name);
        this.A01.add(name);
    }

    public final C0OM A00() {
        C0OM A01 = A01();
        this.A02 = UUID.randomUUID();
        C0OL c0ol = new C0OL(this.A00);
        this.A00 = c0ol;
        c0ol.A0D = this.A02.toString();
        return A01;
    }

    public void A02(long duration, TimeUnit timeUnit) {
        this.A00.A03 = timeUnit.toMillis(duration);
        if (Long.MAX_VALUE - System.currentTimeMillis() > this.A00.A03) {
            return;
        }
        throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
    }

    public final void A03(EnumC015507g backoffPolicy, long backoffDelay, TimeUnit timeUnit) {
        this.A03 = true;
        C0OL c0ol = this.A00;
        c0ol.A08 = backoffPolicy;
        long millis = timeUnit.toMillis(backoffDelay);
        if (millis > 18000000) {
            AbstractC16430qO.A00().A05(C0OL.A0I, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            millis = 18000000;
        } else if (millis < 10000) {
            AbstractC16430qO.A00().A05(C0OL.A0I, "Backoff delay duration less than minimum value", new Throwable[0]);
            millis = 10000;
        }
        c0ol.A01 = millis;
    }
}
