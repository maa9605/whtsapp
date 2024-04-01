package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0oy  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15570oy {
    public final AbstractC15540ov A00;
    public final AtomicBoolean A01 = new AtomicBoolean(false);
    public volatile C38621oi A02;

    public abstract String A01();

    public AbstractC15570oy(AbstractC15540ov abstractC15540ov) {
        this.A00 = abstractC15540ov;
    }

    public C38621oi A00() {
        AbstractC15540ov abstractC15540ov = this.A00;
        abstractC15540ov.A01();
        if (this.A01.compareAndSet(false, true)) {
            if (this.A02 == null) {
                this.A02 = abstractC15540ov.A00(A01());
            }
            return this.A02;
        }
        return abstractC15540ov.A00(A01());
    }

    public void A02(C38621oi c38621oi) {
        if (c38621oi == this.A02) {
            this.A01.set(false);
        }
    }
}
