package X;

/* renamed from: X.05D  reason: invalid class name */
/* loaded from: classes.dex */
public class C05D {
    public static volatile C05D A04;
    public final C05E A01;
    public final AnonymousClass011 A02;
    public long A00 = -1;
    public final AnonymousClass015 A03 = new C05K().samplingRate;

    public C05D(AnonymousClass011 anonymousClass011, C05E c05e) {
        this.A02 = anonymousClass011;
        this.A01 = c05e;
    }

    public static C05D A00() {
        if (A04 == null) {
            synchronized (C05D.class) {
                if (A04 == null) {
                    AnonymousClass012.A00();
                    A04 = new C05D(AnonymousClass011.A00(), C05E.A00());
                }
            }
        }
        return A04;
    }

    public void A01(String str, long j) {
        boolean booleanValue;
        AnonymousClass015 anonymousClass015 = this.A03;
        if (anonymousClass015.A00()) {
            C05K c05k = new C05K();
            c05k.A05 = str;
            c05k.A03 = Long.valueOf(j);
            c05k.A01 = Boolean.valueOf(AnonymousClass024.A0c());
            C05E c05e = this.A01;
            c05e.A05();
            C05J c05j = c05e.A06;
            synchronized (c05j) {
                booleanValue = c05j.A0I(c05j.A00).booleanValue();
            }
            c05k.A00 = Boolean.valueOf(booleanValue);
            long j2 = this.A00;
            if (j2 == -1) {
                j2 = c05e.A02() / 1048576;
                this.A00 = j2;
            }
            c05k.A04 = Long.valueOf(j2);
            if (C000700j.A00.booleanValue()) {
                c05k.A02 = 1;
            }
            this.A02.A08(c05k, anonymousClass015.A02);
        }
    }
}
