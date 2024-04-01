package X;

import java.util.List;

/* renamed from: X.1WS  reason: invalid class name */
/* loaded from: classes.dex */
public class C1WS implements InterfaceC17710sY {
    public List A00;

    public C1WS(List list) {
        this.A00 = list;
    }

    @Override // X.InterfaceC17710sY
    public boolean AGM(C17740sb c17740sb, AbstractC29261Wb abstractC29261Wb) {
        for (C17760sd c17760sd : this.A00) {
            if (C17790sg.A04(c17740sb, c17760sd, abstractC29261Wb)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("not(");
        A0P.append(this.A00);
        A0P.append(")");
        return A0P.toString();
    }
}
