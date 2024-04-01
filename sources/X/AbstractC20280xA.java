package X;

/* renamed from: X.0xA */
/* loaded from: classes.dex */
public abstract class AbstractC20280xA extends AbstractC25261Er {
    @Override // X.AbstractC25261Er, X.InterfaceC18040t5
    public void A58(C18050t6 c18050t6) {
        if (c18050t6 instanceof InterfaceC18070t8) {
            ((AbstractC25261Er) this).A01.add(c18050t6);
            return;
        }
        StringBuilder sb = new StringBuilder("Text content elements cannot contain ");
        sb.append(c18050t6);
        sb.append(" elements.");
        throw new C18140tF(sb.toString());
    }
}
