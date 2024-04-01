package X;

import com.facebook.profilo.core.TraceEvents;
import com.facebook.soloader.SoLoader;

/* renamed from: X.0wj */
/* loaded from: classes.dex */
public abstract class AbstractC20060wj {
    public int A00;
    public C20180wy A01;
    public String A02;
    public boolean A03;

    public abstract void disable();

    public abstract void enable();

    public abstract int getSupportedProviders();

    public abstract int getTracingProviders();

    public void onTraceEnded(C20180wy c20180wy, C1YO c1yo) {
    }

    public void onTraceStarted(C20180wy c20180wy, C1YO c1yo) {
    }

    public AbstractC20060wj(String str) {
        this.A02 = str;
        this.A03 = str == null;
    }

    public final void A00() {
        if (this.A03) {
            return;
        }
        synchronized (this) {
            if (!this.A03) {
                SoLoader.A03(this.A02);
                this.A03 = true;
            }
        }
    }

    public final void A01(C20180wy c20180wy) {
        int supportedProviders = getSupportedProviders() & TraceEvents.sProviders;
        int i = this.A00;
        if (i != 0 && (i & TraceEvents.sProviders) != 0) {
            return;
        }
        if (this.A00 != 0) {
            disable();
            this.A01 = null;
        }
        if (supportedProviders != 0) {
            this.A01 = c20180wy;
            enable();
        }
        this.A00 = supportedProviders;
    }
}
