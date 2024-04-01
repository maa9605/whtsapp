package X;

import java.util.Map;

/* renamed from: X.1Sj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28511Sj extends C0TZ {
    public final /* synthetic */ C006702y A00;

    public C28511Sj(C006702y c006702y) {
        this.A00 = c006702y;
    }

    @Override // X.C0TZ
    public int A01() {
        return ((C006802z) this.A00).A00;
    }

    @Override // X.C0TZ
    public int A02(Object obj) {
        return this.A00.A02(obj);
    }

    @Override // X.C0TZ
    public int A03(Object obj) {
        return this.A00.A03(obj);
    }

    @Override // X.C0TZ
    public Object A04(int i, int i2) {
        return this.A00.A02[(i << 1) + i2];
    }

    @Override // X.C0TZ
    public Object A05(int i, Object obj) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.A00.A02;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // X.C0TZ
    public Map A06() {
        return this.A00;
    }

    @Override // X.C0TZ
    public void A07() {
        this.A00.clear();
    }

    @Override // X.C0TZ
    public void A08(int i) {
        this.A00.A05(i);
    }

    @Override // X.C0TZ
    public void A09(Object obj, Object obj2) {
        this.A00.put(obj, obj2);
    }
}
