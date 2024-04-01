package X;

/* renamed from: X.1Ue  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC28861Ue extends AbstractC15570oy {
    public abstract void A03(C38621oi c38621oi, Object obj);

    public AbstractC28861Ue(AbstractC15540ov abstractC15540ov) {
        super(abstractC15540ov);
    }

    public final void A04(Object obj) {
        C38621oi A00 = A00();
        try {
            A03(A00, obj);
            A00.A00.executeInsert();
            if (A00 == this.A02) {
                this.A01.set(false);
            }
        } catch (Throwable th) {
            A02(A00);
            throw th;
        }
    }
}
