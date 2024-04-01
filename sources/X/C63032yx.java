package X;

/* renamed from: X.2yx */
/* loaded from: classes2.dex */
public class C63032yx {
    public byte A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public final int A0B = 3;

    public C36591l3 A00() {
        Long l;
        Long l2;
        Long l3;
        C36591l3 c36591l3 = new C36591l3();
        c36591l3.A01 = Integer.valueOf(this.A0B);
        c36591l3.A00 = Integer.valueOf(C002701i.A00(this.A00, 0, false));
        Long l4 = this.A0A;
        Long l5 = null;
        if (l4 != null && (l3 = this.A09) != null) {
            l = C000200d.A05(l4, l3.longValue());
        } else {
            l = null;
        }
        c36591l3.A09 = l;
        Long l6 = this.A08;
        if (l6 != null && (l2 = this.A07) != null) {
            l5 = C000200d.A05(l6, l2.longValue());
        }
        c36591l3.A02 = l5;
        c36591l3.A07 = Long.valueOf(this.A05);
        c36591l3.A08 = Long.valueOf(this.A06);
        c36591l3.A05 = Long.valueOf(this.A03);
        long j = this.A01;
        c36591l3.A03 = Long.valueOf(j != 0 ? (((j - 1) / 1024) + 1) * 1024 : 0L);
        long j2 = this.A04;
        c36591l3.A06 = Long.valueOf(j2 != 0 ? (((j2 - 1) / 1024) + 1) * 1024 : 0L);
        long j3 = this.A02;
        c36591l3.A04 = Long.valueOf(j3 != 0 ? (((j3 - 1) / 1024) + 1) * 1024 : 0L);
        return c36591l3;
    }

    public String toString() {
        return A00().toString();
    }
}
