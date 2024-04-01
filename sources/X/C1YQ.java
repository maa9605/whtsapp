package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.provider.atrace.Atrace;

/* renamed from: X.1YQ */
/* loaded from: classes.dex */
public final class C1YQ extends AbstractC20060wj {
    public static final int A00 = ProvidersRegistry.A00.A02("atrace");

    public C1YQ() {
        super("profilo_atrace");
    }

    @Override // X.AbstractC20060wj
    public void disable() {
        Atrace.restoreSystrace();
    }

    @Override // X.AbstractC20060wj
    public void enable() {
        Atrace.enableSystrace();
    }

    @Override // X.AbstractC20060wj
    public int getSupportedProviders() {
        return A00;
    }

    @Override // X.AbstractC20060wj
    public int getTracingProviders() {
        if (Atrace.isEnabled()) {
            return A00;
        }
        return 0;
    }
}
