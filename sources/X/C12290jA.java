package X;

/* renamed from: X.0jA  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C12290jA {
    public float A00;
    public int A01;
    public int A02;
    public EnumC12280j9 A03;
    public String A04;
    public String A05;
    public boolean A06;

    public C12290jA(C12290jA c12290jA, Object obj) {
        this.A04 = c12290jA.A04;
        this.A03 = c12290jA.A03;
        A00(obj);
    }

    public C12290jA(String str, EnumC12280j9 enumC12280j9, Object obj) {
        this.A04 = str;
        this.A03 = enumC12280j9;
        A00(obj);
    }

    public void A00(Object obj) {
        switch (this.A03.ordinal()) {
            case 0:
                this.A02 = ((Number) obj).intValue();
                return;
            case 1:
                this.A00 = ((Number) obj).floatValue();
                return;
            case 2:
            case 3:
                this.A01 = ((Number) obj).intValue();
                return;
            case 4:
                this.A05 = (String) obj;
                return;
            case 5:
                this.A06 = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.A00 = ((Number) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
