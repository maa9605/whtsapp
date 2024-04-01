package X;

/* renamed from: X.1sr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40781sr {
    public final int A00;
    public final int A01;
    public final C40791ss A02;
    public final C40811su A03;
    public final C40811su A04;

    public C40781sr(int i, int i2, C40791ss c40791ss, C40811su c40811su, C40811su c40811su2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = c40791ss;
        this.A04 = c40811su;
        this.A03 = c40811su2;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("UserNoticeContent{policyVersion=");
        A0P.append(this.A01);
        A0P.append(", banner=");
        A0P.append(this.A02);
        A0P.append(", modal=");
        A0P.append(this.A04);
        A0P.append(", blockingModal=");
        A0P.append(this.A03);
        A0P.append('}');
        return A0P.toString();
    }
}
