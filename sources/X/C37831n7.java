package X;

import com.facebook.profilo.core.ProvidersRegistry;

/* renamed from: X.1n7  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37831n7 extends AbstractC20060wj {
    public static final int A00 = ProvidersRegistry.A00.A02("qpl");

    @Override // X.AbstractC20060wj
    public void disable() {
    }

    @Override // X.AbstractC20060wj
    public void enable() {
    }

    public C37831n7() {
        super(null);
    }

    @Override // X.AbstractC20060wj
    public int getSupportedProviders() {
        return A00;
    }

    @Override // X.AbstractC20060wj
    public int getTracingProviders() {
        C20180wy c20180wy = this.A01;
        if (c20180wy == null) {
            return 0;
        }
        return c20180wy.A02 & A00;
    }
}
