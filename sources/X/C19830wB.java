package X;

/* renamed from: X.0wB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19830wB {
    public final AbstractC19820wA A00;

    public C19830wB() {
        AbstractC19820wA abstractC19820wA = new AbstractC19820wA() { // from class: X.1YD
            @Override // X.AbstractC19820wA
            public void destruct() {
                throw new IllegalStateException("Cannot destroy Terminus Destructor.");
            }
        };
        this.A00 = abstractC19820wA;
        abstractC19820wA.A00 = new AbstractC19820wA() { // from class: X.1YD
            @Override // X.AbstractC19820wA
            public void destruct() {
                throw new IllegalStateException("Cannot destroy Terminus Destructor.");
            }
        };
        AbstractC19820wA abstractC19820wA2 = this.A00;
        abstractC19820wA2.A00.A01 = abstractC19820wA2;
    }
}
