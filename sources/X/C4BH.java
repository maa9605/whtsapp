package X;

/* renamed from: X.4BH  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4BH {
    public String A00;
    public String A01;

    public String toString() {
        StringBuilder A0P = C000200d.A0P("OtpSms{, sms='");
        C000200d.A1P(A0P, this.A01, '\'', ", otp='");
        A0P.append(this.A00);
        A0P.append('\'');
        A0P.append('}');
        return A0P.toString();
    }
}
