package X;

/* renamed from: X.0TL */
/* loaded from: classes.dex */
public class C0TL extends AnonymousClass059 {
    public final C006802z A00;

    public C0TL(C0TI c0ti) {
        C006802z c006802z = new C006802z();
        this.A00 = c006802z;
        c006802z.A08(c0ti.A00);
    }

    @Override // X.AnonymousClass059
    public /* bridge */ /* synthetic */ boolean A02(C0PJ c0pj) {
        boolean z;
        C0PK c0pk = (C0PK) c0pj;
        C07K.A1O(c0pk);
        C006802z c006802z = c0pk.mMetricsMap;
        int i = c006802z.A00;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            Class cls = (Class) c006802z.A02[i2 << 1];
            AnonymousClass059 anonymousClass059 = (AnonymousClass059) this.A00.get(cls);
            if (anonymousClass059 != null) {
                z = anonymousClass059.A02(c0pk.A02(cls));
            } else {
                z = false;
            }
            c0pk.A04(cls, z);
            z2 |= z;
        }
        return z2;
    }

    @Override // X.AnonymousClass059
    /* renamed from: A03 */
    public C0PK A01() {
        C0PK c0pk = new C0PK();
        C006802z c006802z = this.A00;
        int i = c006802z.A00;
        for (int i2 = 0; i2 < i; i2++) {
            Object[] objArr = c006802z.A02;
            int i3 = i2 << 1;
            Object obj = objArr[i3];
            c0pk.mMetricsMap.put(obj, ((AnonymousClass059) objArr[i3 + 1]).A01());
            c0pk.mMetricsValid.put(obj, Boolean.FALSE);
        }
        return c0pk;
    }
}
