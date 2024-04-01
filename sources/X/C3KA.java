package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3KA  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3KA extends C0ZS {
    public final List A00;
    public final List A01;

    public C3KA(AbstractC02800Cx abstractC02800Cx) {
        super(abstractC02800Cx);
        this.A01 = new ArrayList();
        this.A00 = new ArrayList();
    }

    @Override // X.C0ZT
    public CharSequence A03(int i) {
        return (CharSequence) this.A00.get(i);
    }

    @Override // X.C0ZT
    public int A0B() {
        return this.A01.size();
    }

    @Override // X.C0ZS
    public C0BA A0G(int i) {
        return (C0BA) this.A01.get(i);
    }
}
