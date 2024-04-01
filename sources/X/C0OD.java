package X;

import java.util.Collections;

/* renamed from: X.0OD  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0OD {
    public abstract C0OE A01(String tag);

    public abstract C0OE A02(String uniqueWorkName);

    public abstract C0OE A03(String uniqueWorkName, EnumC16390qK existingPeriodicWorkPolicy, C1VM periodicWork);

    public void A00(String uniqueWorkName, C0OO existingWorkPolicy, C0ON work) {
        new C0OR((C0OP) this, uniqueWorkName, existingWorkPolicy, Collections.singletonList(work), null).A02();
    }
}
