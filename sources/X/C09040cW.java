package X;

/* renamed from: X.0cW  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09040cW extends C0HK {
    public C07750Zs A00;
    public String A01;

    public C09040cW(C07750Zs c07750Zs, String str) {
        this.A01 = str;
        this.A00 = c07750Zs;
    }

    public C09040cW(C07750Zs c07750Zs, String str, Object obj) {
        super(obj);
        this.A01 = str;
        this.A00 = c07750Zs;
    }

    @Override // X.C0HL
    public void A0B(Object obj) {
        C07750Zs c07750Zs = this.A00;
        if (c07750Zs != null) {
            c07750Zs.A02.put(this.A01, obj);
        }
        super.A0B(obj);
    }
}
