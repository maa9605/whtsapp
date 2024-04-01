package X;

/* renamed from: X.3My  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C69053My {
    public static final C68863Mf A00;
    public static final C68863Mf A01;
    public static final C68863Mf A02;
    public static final C68863Mf A03;
    public static final C68863Mf A04;
    public static final C68863Mf A05;
    public static final C68863Mf A06;
    public static final C68863Mf A07;
    public static final C68863Mf A08;
    public static final C68863Mf A09;
    public static final C68863Mf A0A;
    public static final C68863Mf A0B;
    public static final C68863Mf[] A0C;

    static {
        EnumC68903Mj enumC68903Mj = EnumC68903Mj.ACTIVE;
        EnumC68903Mj enumC68903Mj2 = EnumC68903Mj.START;
        C76483gf c76483gf = C68933Mm.A0I;
        C68863Mf c68863Mf = new C68863Mf("START", enumC68903Mj2, null, c76483gf);
        A02 = c68863Mf;
        C68863Mf c68863Mf2 = new C68863Mf("WAIT_SH_HRR", enumC68903Mj, null, c76483gf);
        A0B = c68863Mf2;
        C68863Mf c68863Mf3 = new C68863Mf("WAIT_SEND_EARLY_DATA", enumC68903Mj, C68933Mm.A05, null);
        A09 = c68863Mf3;
        C68863Mf c68863Mf4 = new C68863Mf("WAIT_SH", enumC68903Mj, null, c76483gf);
        A0A = c68863Mf4;
        C68863Mf c68863Mf5 = new C68863Mf("WAIT_EE", enumC68903Mj, C68933Mm.A06, c76483gf);
        A06 = c68863Mf5;
        C68863Mf c68863Mf6 = new C68863Mf("WAIT_CERT_CR", enumC68903Mj, null, c76483gf);
        A04 = c68863Mf6;
        C68863Mf c68863Mf7 = new C68863Mf("WAIT_CERT", enumC68903Mj, null, c76483gf);
        A03 = c68863Mf7;
        C68863Mf c68863Mf8 = new C68863Mf("WAIT_CV", enumC68903Mj, null, c76483gf);
        A05 = c68863Mf8;
        C68863Mf c68863Mf9 = new C68863Mf("WAIT_FINISHED", enumC68903Mj, null, c76483gf);
        A07 = c68863Mf9;
        C68863Mf c68863Mf10 = new C68863Mf("WAIT_SEND_CERTS_FIN", enumC68903Mj, C68933Mm.A04, c76483gf);
        A08 = c68863Mf10;
        C68863Mf c68863Mf11 = new C68863Mf("CONNECTED", enumC68903Mj, C68933Mm.A07, null);
        A00 = c68863Mf11;
        C68863Mf c68863Mf12 = new C68863Mf("END", EnumC68903Mj.END, null, null);
        A01 = c68863Mf12;
        A0C = new C68863Mf[]{c68863Mf, c68863Mf3, c68863Mf2, c68863Mf4, c68863Mf5, c68863Mf6, c68863Mf7, c68863Mf8, c68863Mf9, c68863Mf10, c68863Mf11, c68863Mf12};
    }
}
