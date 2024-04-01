package X;

import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.3rE */
/* loaded from: classes2.dex */
public class C82883rE extends C0MU implements C2IR {
    public List A01;
    public final C2MI A03;
    public final C0HK A02 = new C0HK();
    public String A00 = "";

    public C82883rE(C461225a c461225a, C2MI c2mi) {
        this.A03 = c2mi;
        c461225a.A00 = new InterfaceC70513So() { // from class: X.3rD
            {
                C82883rE.this = this;
            }

            @Override // X.InterfaceC70513So
            public final void AOR(List list) {
                C82883rE.this.A01 = list;
            }
        };
        c461225a.A02();
    }

    @Override // X.C2IR
    public void AOG(C61512wH c61512wH) {
        List list = c61512wH.A01;
        HashSet hashSet = new HashSet(list.size());
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(list.get(i));
        }
        List A0X = C40731sm.A0X(hashSet, this.A01);
        C0HK c0hk = this.A02;
        if ((c0hk.A01() == null || ((List) c0hk.A01()).isEmpty()) && ((AbstractCollection) A0X).isEmpty()) {
            return;
        }
        c0hk.A0B(A0X);
    }
}
