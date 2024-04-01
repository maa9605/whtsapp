package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.02Q  reason: invalid class name */
/* loaded from: classes.dex */
public final class C02Q {
    public final C02S A00;
    public final C02R A01;
    public final List A02;

    /* JADX WARN: Type inference failed for: r3v0, types: [X.02S] */
    public C02Q(final Executor executor) {
        final C02R c02r = new C02R();
        ?? r3 = new Object() { // from class: X.02S
        };
        List singletonList = Collections.singletonList(new C02U(executor, c02r) { // from class: X.02T
            public final AtomicBoolean A00 = new AtomicBoolean();
        });
        this.A02 = new ArrayList(2);
        this.A01 = c02r;
        this.A00 = r3;
        if (singletonList.size() > 0) {
            this.A02.addAll(singletonList);
            for (C02U c02u : this.A02) {
                synchronized (c02u) {
                    c02u.A02.add(this);
                }
            }
        }
    }

    public synchronized void A00(ThreadPoolExecutor threadPoolExecutor, C02Y c02y) {
        C02R c02r = this.A01;
        synchronized (c02r) {
            HashMap hashMap = c02r.A02;
            C02Z c02z = (C02Z) hashMap.get(threadPoolExecutor);
            if (c02z == null) {
                hashMap.put(threadPoolExecutor, new C02Z(c02y));
            } else {
                c02z.A00 = c02y;
            }
        }
    }
}
