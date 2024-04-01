package X;

/* renamed from: X.1wD  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42721wD {
    public static volatile C42721wD A08;
    public final C05A A00;
    public final C05M A01;
    public final C02960Do A02;
    public final C05B A03;
    public final C05E A04;
    public final C42761wH A05;
    public final C05L A06;
    public final C0EB A07;

    public C42721wD(C05B c05b, C05A c05a, C05M c05m, C0EB c0eb, C42761wH c42761wH, C05L c05l, C05E c05e, C02960Do c02960Do) {
        this.A03 = c05b;
        this.A00 = c05a;
        this.A01 = c05m;
        this.A07 = c0eb;
        this.A05 = c42761wH;
        this.A06 = c05l;
        this.A04 = c05e;
        this.A02 = c02960Do;
    }

    public static C42721wD A00() {
        if (A08 == null) {
            synchronized (C42721wD.class) {
                if (A08 == null) {
                    A08 = new C42721wD(C05B.A00(), C05A.A00(), C05M.A00(), C0EB.A00(), C42761wH.A00(), C05L.A00(), C05E.A00(), C02960Do.A02);
                }
            }
        }
        return A08;
    }

    public void A01() {
        C05B c05b = this.A03;
        c05b.A05.clear();
        c05b.A04.clear();
        C42761wH c42761wH = this.A05;
        c42761wH.A00.A07(-1);
        C06F c06f = c42761wH.A06.A00;
        synchronized (c06f) {
            c06f.A07(-1);
        }
        c42761wH.A05.A01.A07(-1);
        this.A02.A01.clear();
        this.A06.A02();
        C05E c05e = this.A04;
        c05e.A05();
        c05e.A01 = false;
        C05M c05m = this.A01;
        synchronized (c05m) {
            if (c05m.A00) {
                synchronized (c05m) {
                    c05m.A0C().clear();
                    c05m.A00 = false;
                }
            }
        }
        C05A c05a = this.A00;
        synchronized (c05a) {
            c05a.A06.clear();
            c05a.A07.clear();
        }
        C0EB c0eb = this.A07;
        if (c0eb.A05 != null) {
            c0eb.A05.clear();
        }
    }
}
