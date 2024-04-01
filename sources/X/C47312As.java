package X;

/* renamed from: X.2As  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47312As {
    public static volatile C47312As A0O;
    public final C02L A00;
    public final C01B A01;
    public final C2BM A02;
    public final C44581zJ A03;
    public final C44331yt A04;
    public final C44311yr A05;
    public final C44321ys A06;
    public final C2BN A07;
    public final C05W A08;
    public final C018708s A09;
    public final C0FO A0A;
    public final C41221tZ A0B;
    public final AnonymousClass012 A0C;
    public final C001200o A0D;
    public final C05A A0E;
    public final C05M A0F;
    public final C0CA A0G;
    public final C0C9 A0H;
    public final C0C8 A0I;
    public final C05E A0J;
    public final C43081wp A0K;
    public final C44351yv A0L;
    public final C05Y A0M;
    public final C0CB A0N;

    public C47312As(AnonymousClass012 anonymousClass012, C05A c05a, C02L c02l, C001200o c001200o, C05M c05m, C01B c01b, C0FO c0fo, C05Y c05y, C05W c05w, C018708s c018708s, C44311yr c44311yr, C0C9 c0c9, C44581zJ c44581zJ, C44331yt c44331yt, C44321ys c44321ys, C0CB c0cb, C05E c05e, C43081wp c43081wp, C44351yv c44351yv, C0CA c0ca, C2BM c2bm, C41221tZ c41221tZ, C0C8 c0c8, C2BN c2bn) {
        this.A0C = anonymousClass012;
        this.A0E = c05a;
        this.A00 = c02l;
        this.A0D = c001200o;
        this.A0F = c05m;
        this.A01 = c01b;
        this.A0A = c0fo;
        this.A0M = c05y;
        this.A08 = c05w;
        this.A09 = c018708s;
        this.A05 = c44311yr;
        this.A0H = c0c9;
        this.A03 = c44581zJ;
        this.A04 = c44331yt;
        this.A06 = c44321ys;
        this.A0N = c0cb;
        this.A0J = c05e;
        this.A0K = c43081wp;
        this.A0L = c44351yv;
        this.A0G = c0ca;
        this.A02 = c2bm;
        this.A0B = c41221tZ;
        this.A0I = c0c8;
        this.A07 = c2bn;
    }

    public static C47312As A00() {
        if (A0O == null) {
            synchronized (C47312As.class) {
                if (A0O == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C05A A002 = C05A.A00();
                    C02L A003 = C02L.A00();
                    C001200o c001200o = C001200o.A01;
                    C05M A004 = C05M.A00();
                    C01B A005 = C01B.A00();
                    C0FO A006 = C0FO.A00();
                    C05Y A01 = C05Y.A01();
                    C05W A007 = C05W.A00();
                    C018708s A008 = C018708s.A00();
                    C44311yr A009 = C44311yr.A00();
                    C0C9 A0010 = C0C9.A00();
                    C44581zJ A0011 = C44581zJ.A00();
                    C44331yt A0012 = C44331yt.A00();
                    C44321ys A0013 = C44321ys.A00();
                    C0CB A0014 = C0CB.A00();
                    C05E A0015 = C05E.A00();
                    C43081wp A0016 = C43081wp.A00();
                    C44351yv A0017 = C44351yv.A00();
                    C0CA A0018 = C0CA.A00();
                    if (C2BM.A03 == null) {
                        synchronized (C2BM.class) {
                            if (C2BM.A03 == null) {
                                C2BM.A03 = new C2BM(C018608r.A02(), C0C9.A00(), C44581zJ.A00());
                            }
                        }
                    }
                    C2BM c2bm = C2BM.A03;
                    C41221tZ A0019 = C41221tZ.A00();
                    C0C8 A0020 = C0C8.A00();
                    if (C2BN.A00 == null) {
                        synchronized (C2BN.class) {
                            if (C2BN.A00 == null) {
                                C2BN.A00 = new C2BN();
                            }
                        }
                    }
                    A0O = new C47312As(A00, A002, A003, c001200o, A004, A005, A006, A01, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, c2bm, A0019, A0020, C2BN.A00);
                }
            }
        }
        return A0O;
    }
}
