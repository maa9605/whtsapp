package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2he  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C53872he extends C0ZS {
    public final List A00;

    public C53872he(AbstractC02800Cx abstractC02800Cx) {
        super(abstractC02800Cx, 1);
        this.A00 = new ArrayList();
    }

    @Override // X.C0ZT
    public int A0B() {
        return this.A00.size();
    }

    @Override // X.C0ZS
    public C0BA A0G(int i) {
        return (C0BA) this.A00.get(i);
    }
}
