package X;

/* renamed from: X.0Nm  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C05140Nm extends AbstractC05150Nn {
    public String A00;
    public final String A01;

    @Override // X.AbstractC05150Nn
    public String A03() {
        return "NotificationStanza";
    }

    public C05140Nm(AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, AnonymousClass011 anonymousClass011, C0EJ c0ej, String str, long j, long j2, Integer num, String str2) {
        super(anonymousClass012, abstractC000600i, anonymousClass011, c0ej, str, j, 2, j2, num);
        this.A01 = str2;
    }

    @Override // X.AbstractC05150Nn
    public AnonymousClass014 A02(int i, long j) {
        C37291mB c37291mB = new C37291mB();
        c37291mB.A01 = Long.valueOf(j);
        Integer num = this.A0A;
        if (num != null) {
            c37291mB.A02 = Long.valueOf(num.intValue());
        }
        c37291mB.A00 = Integer.valueOf(i);
        c37291mB.A04 = this.A01;
        c37291mB.A03 = this.A00;
        return c37291mB;
    }

    @Override // X.AbstractC05150Nn
    public void A04(C36471kr c36471kr) {
        c36471kr.A03 = 4;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append("/");
        sb.append(this.A00);
        c36471kr.A0A = sb.toString();
    }

    @Override // X.AbstractC05150Nn
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; type = ");
        sb.append(this.A01);
        sb.append("; subType = ");
        sb.append(this.A00);
        return sb.toString();
    }
}
