package androidx.work;

import X.AbstractC16500qV;
import X.C0OF;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class WorkerParameters {
    public int A00;
    public C0OF A01;
    public AbstractC16500qV A02;
    public UUID A03;
    public Executor A04;

    public WorkerParameters(UUID uuid, C0OF c0of, Collection collection, int i, Executor executor, AbstractC16500qV abstractC16500qV) {
        this.A03 = uuid;
        this.A01 = c0of;
        new HashSet(collection);
        this.A00 = i;
        this.A04 = executor;
        this.A02 = abstractC16500qV;
    }
}
