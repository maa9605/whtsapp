package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.0Hv */
/* loaded from: classes.dex */
public class C03950Hv {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public AbstractC005302j A06;
    public UserJid A07;
    public UserJid A08;
    public AnonymousClass094 A09;
    public boolean A0A;
    public AnonymousClass094[] A0B;

    public C03950Hv(AbstractC005302j abstractC005302j, int i) {
        this.A06 = abstractC005302j;
        this.A01 = i;
    }

    public C03950Hv(AbstractC005302j abstractC005302j, int i, long j, long j2) {
        this(abstractC005302j, i, j, j2, 0L, null);
    }

    public C03950Hv(AbstractC005302j abstractC005302j, int i, long j, long j2, long j3, AnonymousClass094 anonymousClass094) {
        this.A06 = abstractC005302j;
        this.A01 = i;
        this.A02 = j;
        this.A00 = 0;
        this.A09 = anonymousClass094;
        this.A04 = j2;
        this.A03 = j3;
    }

    public C03950Hv(AbstractC005302j abstractC005302j, int i, AnonymousClass094 anonymousClass094) {
        this(abstractC005302j, i, 0L, 0L, 0L, anonymousClass094);
    }

    public C03950Hv A00() {
        C03950Hv c03950Hv = new C03950Hv(this.A06, this.A01);
        c03950Hv.A05 = this.A05;
        c03950Hv.A02 = this.A02;
        c03950Hv.A00 = this.A00;
        c03950Hv.A09 = this.A09;
        c03950Hv.A0B = this.A0B;
        c03950Hv.A04 = this.A04;
        c03950Hv.A03 = this.A03;
        c03950Hv.A08 = this.A08;
        c03950Hv.A07 = this.A07;
        c03950Hv.A0A = this.A0A;
        return c03950Hv;
    }
}
