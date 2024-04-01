package X;

/* renamed from: X.1cO  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC31511cO extends AnonymousClass174 {
    public boolean A00;

    public AbstractC31511cO(AnonymousClass176 anonymousClass176) {
        super(anonymousClass176);
    }

    public abstract void A0D();

    public final void A0B() {
        A0D();
        this.A00 = true;
    }

    public final void A0C() {
        if (this.A00) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }
}
