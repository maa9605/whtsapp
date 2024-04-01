package X;

import java.util.HashMap;

/* renamed from: X.0Bv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C02540Bv extends C02550Bw {
    public HashMap A00 = new HashMap();

    @Override // X.C02550Bw
    public C0UC A00(Object obj) {
        return (C0UC) this.A00.get(obj);
    }

    @Override // X.C02550Bw
    public Object A01(Object obj) {
        Object A01 = super.A01(obj);
        this.A00.remove(obj);
        return A01;
    }

    @Override // X.C02550Bw
    public Object A02(Object obj, Object obj2) {
        C0UC c0uc = (C0UC) this.A00.get(obj);
        if (c0uc != null) {
            return c0uc.A03;
        }
        HashMap hashMap = this.A00;
        C0UC c0uc2 = new C0UC(obj, obj2);
        super.A00++;
        C0UC c0uc3 = this.A01;
        if (c0uc3 == null) {
            this.A02 = c0uc2;
            this.A01 = c0uc2;
        } else {
            c0uc3.A00 = c0uc2;
            c0uc2.A01 = c0uc3;
            this.A01 = c0uc2;
        }
        hashMap.put(obj, c0uc2);
        return null;
    }
}
