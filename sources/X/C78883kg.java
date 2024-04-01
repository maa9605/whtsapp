package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.3kg */
/* loaded from: classes2.dex */
public class C78883kg extends C0MU implements C2IR {
    public C0HK A00 = new C0HK();
    public C0HK A01 = new C0HK();
    public HashSet A02;
    public final C2MI A03;

    public C78883kg(C2MI c2mi) {
        this.A03 = c2mi;
        this.A00.A0B(new ArrayList(0));
        this.A01.A0B(new ArrayList(0));
    }

    public void A02() {
        this.A01.A0B(C40731sm.A0X(this.A02, (List) this.A00.A01()));
    }

    @Override // X.C2IR
    public void AOG(C61512wH c61512wH) {
        List list = c61512wH.A01;
        HashSet hashSet = new HashSet(list.size());
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(list.get(i));
        }
        this.A02 = hashSet;
        A02();
    }
}
