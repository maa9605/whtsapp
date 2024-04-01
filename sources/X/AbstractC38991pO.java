package X;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1pO */
/* loaded from: classes.dex */
public abstract class AbstractC38991pO extends AbstractC29261Wb implements InterfaceC18040t5 {
    public Matrix A00;
    public EnumC17880sp A01;
    public Boolean A02;
    public String A03;
    public List A04 = new ArrayList();

    @Override // X.InterfaceC18040t5
    public void A58(C18050t6 c18050t6) {
        if (c18050t6 instanceof C39011pQ) {
            this.A04.add(c18050t6);
            return;
        }
        StringBuilder sb = new StringBuilder("Gradient elements cannot contain ");
        sb.append(c18050t6);
        sb.append(" elements.");
        throw new C18140tF(sb.toString());
    }

    @Override // X.InterfaceC18040t5
    public List A8t() {
        return this.A04;
    }
}
