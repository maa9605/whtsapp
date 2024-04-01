package X;

/* renamed from: X.0aE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07870aE extends AbstractC05150Nn {
    public long A00;
    public long A01;
    public boolean A02;
    public final int A03;
    public final String A04;
    public final String A05;

    @Override // X.AbstractC05150Nn
    public String A03() {
        return "ReceiptStanza";
    }

    public C07870aE(AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, AnonymousClass011 anonymousClass011, C0EJ c0ej, String str, long j, long j2, Integer num, String str2, int i, String str3) {
        super(anonymousClass012, abstractC000600i, anonymousClass011, c0ej, str, j, 1, j2, num);
        this.A05 = str2;
        this.A03 = i;
        this.A04 = str3;
    }

    @Override // X.AbstractC05150Nn
    public AnonymousClass014 A02(int i, long j) {
        C37431mP c37431mP = new C37431mP();
        c37431mP.A03 = Long.valueOf(j);
        c37431mP.A00 = Boolean.valueOf(this.A02);
        Integer num = this.A0A;
        if (num != null) {
            c37431mP.A04 = Long.valueOf(num.intValue());
        }
        c37431mP.A05 = Long.valueOf(this.A00);
        c37431mP.A06 = Long.valueOf(AnonymousClass024.A03(this.A04, 0L));
        c37431mP.A02 = Integer.valueOf(i);
        c37431mP.A07 = Long.valueOf(this.A01);
        c37431mP.A08 = this.A05;
        c37431mP.A01 = Integer.valueOf(this.A03);
        return c37431mP;
    }

    @Override // X.AbstractC05150Nn
    public void A04(C36471kr c36471kr) {
        c36471kr.A03 = 2;
        c36471kr.A02 = Integer.valueOf(this.A03);
        c36471kr.A0B = this.A05;
    }

    @Override // X.AbstractC05150Nn
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; type = ");
        sb.append(this.A05);
        sb.append("; messageType = ");
        sb.append(this.A03);
        sb.append("; retryVersion = ");
        sb.append(this.A04);
        sb.append("; hasOrphaned = ");
        sb.append(this.A02);
        sb.append("; totalCount = ");
        sb.append(this.A01);
        sb.append("; processedCount = ");
        sb.append(this.A00);
        return sb.toString();
    }
}
