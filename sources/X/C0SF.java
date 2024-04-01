package X;

/* renamed from: X.0SF  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0SF {
    public void A00(int i) {
    }

    public abstract void A03(C02590Ca c02590Ca);

    public void A04(Exception exc) {
    }

    public void A01(int i, String str) {
        A00(i);
    }

    public void A02(C02590Ca c02590Ca) {
        String str;
        for (C02590Ca c02590Ca2 : c02590Ca.A0H("error")) {
            if (c02590Ca2 != null) {
                C04P A0A = c02590Ca2.A0A("code");
                if (A0A != null) {
                    str = A0A.A03;
                } else {
                    str = null;
                }
                C04P A0A2 = c02590Ca2.A0A("text");
                String str2 = A0A2 != null ? A0A2.A03 : null;
                if (str != null) {
                    A01(Integer.parseInt(str), str2);
                }
            }
        }
    }
}
