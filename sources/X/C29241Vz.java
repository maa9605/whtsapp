package X;

/* renamed from: X.1Vz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29241Vz implements InterfaceC16980rL {
    public final AbstractC15540ov A00;
    public final AbstractC15570oy A01;
    public final AbstractC15570oy A02;

    public C29241Vz(final AbstractC15540ov __db) {
        this.A00 = __db;
        this.A01 = new AbstractC15570oy(__db) { // from class: X.1Vx
            @Override // X.AbstractC15570oy
            public String A01() {
                return "DELETE from WorkProgress where work_spec_id=?";
            }
        };
        this.A02 = new AbstractC15570oy(__db) { // from class: X.1Vy
            @Override // X.AbstractC15570oy
            public String A01() {
                return "DELETE FROM WorkProgress";
            }
        };
    }
}
