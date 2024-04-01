package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1xO */
/* loaded from: classes2.dex */
public class C43431xO extends C0CH {
    public long A00;
    public C0J7 A01;
    public C43711xq A02;
    public File A03;
    public String A04;
    public AtomicReference A05;
    public boolean A06;
    public final AbstractC000600i A07;
    public final C012005w A08;
    public final C01B A09;
    public final C0EL A0A;
    public final C0CK A0B;
    public final C0CK A0C;
    public final C0CK A0D;
    public final C0CK A0E;
    public final AnonymousClass012 A0F;
    public final InterfaceC59882tZ A0G;
    public final InterfaceC43611xg A0H;
    public final C40411sD A0I;
    public final C03720Gu A0J;
    public final C04000Ia A0K;
    public final C43371xI A0L;
    public final C0HW A0M;
    public final C43401xL A0N;
    public final C43111ws A0O;
    public final C04150It A0P;
    public final C63192zK A0Q;
    public final C23G A0R;
    public final C456422x A0S;
    public final C43411xM A0T;
    public final C43381xJ A0U;
    public final C43391xK A0V;
    public final C2HU A0W;
    public final C02O A0X;
    public final C0IY A0Y;
    public final InterfaceC002901k A0Z;

    public C43431xO(AnonymousClass012 anonymousClass012, C018508q c018508q, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C012005w c012005w, C0HW c0hw, C0EL c0el, C01B c01b, C0IY c0iy, C43371xI c43371xI, C43111ws c43111ws, C43381xJ c43381xJ, C40411sD c40411sD, C43391xK c43391xK, C03720Gu c03720Gu, C43401xL c43401xL, C04000Ia c04000Ia, C02O c02o, C43411xM c43411xM, C04150It c04150It) {
        C2HU c2hu = new C2HU(c04000Ia);
        this.A05 = new AtomicReference(null);
        this.A0B = new C0CK();
        this.A0D = new C0CK();
        this.A0E = new C0CK();
        this.A0C = new C0CK();
        this.A0F = anonymousClass012;
        this.A07 = abstractC000600i;
        this.A0Z = interfaceC002901k;
        this.A0M = c0hw;
        this.A08 = c012005w;
        this.A0A = c0el;
        this.A09 = c01b;
        this.A0Y = c0iy;
        this.A0L = c43371xI;
        this.A0O = c43111ws;
        this.A0U = c43381xJ;
        this.A0I = c40411sD;
        this.A0V = c43391xK;
        this.A0T = c43411xM;
        this.A0J = c03720Gu;
        this.A0N = c43401xL;
        this.A0K = c04000Ia;
        this.A0X = c02o;
        this.A0S = c04150It.A04;
        this.A0P = c04150It;
        this.A0W = c2hu;
        C23G c23g = new C23G();
        this.A0R = c23g;
        synchronized (c23g) {
            C43591xe c43591xe = c04150It.A02;
            c23g.A00 = c43591xe.A03;
            c23g.A08 = c43591xe.A08;
            c23g.A07 = c43591xe.A07;
            c23g.A01 = c43591xe.A04;
        }
        InterfaceC43611xg interfaceC43611xg = c04150It.A00;
        this.A0H = interfaceC43611xg;
        this.A0G = interfaceC43611xg.AAo();
        this.A0Q = new C63192zK(anonymousClass012, c43381xJ, c40411sD);
        C0CG c0cg = new C0CG() { // from class: X.3GE
            {
                C43431xO.this = this;
            }

            @Override // X.C0CG
            public final void A54(Object obj) {
                C43431xO.this.A08((Integer) obj);
            }
        };
        Executor executor = c018508q.A06;
        ((C0CI) this).A01.A03(c0cg, executor);
        ((C0CI) this).A00.A03(new C0CG() { // from class: X.3GF
            {
                C43431xO.this = this;
            }

            @Override // X.C0CG
            public final void A54(Object obj) {
                C43431xO c43431xO = C43431xO.this;
                Throwable th = (Throwable) obj;
                StringBuilder A0P = C000200d.A0P("mediaupload/oncancelled, request=");
                A0P.append(c43431xO.A0P);
                A0P.append(", this=");
                A0P.append(c43431xO);
                Log.i(A0P.toString(), th);
                if (th instanceof FileNotFoundException) {
                    c43431xO.A08(7);
                } else if (th instanceof IOException) {
                    if (C0HW.A05(th)) {
                        c43431xO.A08(18);
                    } else {
                        c43431xO.A08(3);
                    }
                } else if (th instanceof C43691xo) {
                    c43431xO.A08(5);
                } else if (th instanceof NoSuchAlgorithmException) {
                    c43431xO.A08(16);
                } else {
                    c43431xO.A08(1);
                }
            }
        }, executor);
        this.A0B.A04(Boolean.TRUE);
        c0iy.A0B(this.A0P.A02.A05.A02, null, null, 0);
    }

    @Override // X.C0CH, X.C0CI
    public void A03() {
        super.A03();
        this.A0B.A01();
        this.A0D.A01();
        this.A0E.A01();
        this.A0C.A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:1235:0x0b76, code lost:
        if (r1 == false) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1242:0x0b88, code lost:
        if (r1 == false) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1245:0x0b92, code lost:
        if (r1 == false) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x017c, code lost:
        if (r6 == false) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:894:0x056c, code lost:
        if (r9 != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:895:0x056e, code lost:
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:896:0x0571, code lost:
        r17.close();
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:1175:0x0a0f A[Catch: all -> 0x0a91, TryCatch #31 {all -> 0x0a91, blocks: (B:667:0x000a, B:669:0x0014, B:670:0x001a, B:673:0x0031, B:677:0x0045, B:679:0x008a, B:683:0x00bb, B:684:0x00c4, B:686:0x00c7, B:688:0x00ca, B:690:0x00cd, B:691:0x00ce, B:692:0x00d0, B:777:0x0278, B:778:0x0279, B:779:0x0291, B:781:0x02a3, B:782:0x02a5, B:784:0x02b7, B:790:0x02c8, B:797:0x02db, B:799:0x02e6, B:798:0x02df, B:793:0x02cd, B:800:0x02ea, B:805:0x030e, B:807:0x031f, B:812:0x0359, B:814:0x0367, B:819:0x036e, B:820:0x036f, B:822:0x0385, B:823:0x038b, B:828:0x0398, B:829:0x0399, B:832:0x03aa, B:855:0x04ac, B:857:0x04bb, B:859:0x04c1, B:861:0x04cb, B:863:0x04e1, B:888:0x0560, B:936:0x0601, B:939:0x060b, B:941:0x060f, B:943:0x0612, B:945:0x0615, B:946:0x0616, B:948:0x061a, B:950:0x0624, B:952:0x0628, B:953:0x062a, B:955:0x062d, B:961:0x0634, B:965:0x0638, B:967:0x063e, B:969:0x0641, B:978:0x066a, B:1011:0x06ca, B:1099:0x0911, B:1101:0x0919, B:1103:0x0921, B:1105:0x092c, B:1107:0x0930, B:1109:0x0938, B:1111:0x0943, B:1116:0x0969, B:1119:0x0971, B:1121:0x0977, B:1123:0x097a, B:1124:0x0983, B:1131:0x098c, B:1130:0x098b, B:1132:0x098d, B:1133:0x098f, B:1138:0x0996, B:1139:0x0997, B:1141:0x099d, B:1143:0x09a3, B:1145:0x09cc, B:1147:0x09d1, B:1149:0x09d4, B:1161:0x09e3, B:1162:0x09ea, B:1164:0x09ef, B:1166:0x09f3, B:1168:0x09f7, B:1170:0x09fb, B:1172:0x0a07, B:1175:0x0a0f, B:1176:0x0a1f, B:992:0x0687, B:1010:0x06c3, B:896:0x0571, B:905:0x0585, B:926:0x05eb, B:934:0x05fb, B:1008:0x06bf, B:1012:0x06ce, B:1014:0x0709, B:1019:0x0732, B:1021:0x075e, B:1026:0x0798, B:1028:0x079e, B:1029:0x07a0, B:1031:0x07a4, B:1034:0x07a9, B:1060:0x0818, B:1065:0x083d, B:1067:0x0841, B:1069:0x0849, B:1070:0x0870, B:1071:0x0874, B:1075:0x0880, B:1076:0x0881, B:1073:0x0876, B:1081:0x089b, B:1083:0x08a3, B:1085:0x08b2, B:1087:0x08c5, B:1088:0x08ca, B:1090:0x08d2, B:1091:0x08e6, B:1036:0x07ac, B:1038:0x07bf, B:1039:0x07c1, B:1040:0x07c2, B:1041:0x07c3, B:1042:0x07c4, B:1043:0x07c5, B:1044:0x07c6, B:1045:0x07c7, B:1053:0x0807, B:835:0x03ce, B:837:0x03f6, B:839:0x03fa, B:841:0x03fe, B:842:0x041f, B:844:0x0437, B:854:0x04a8, B:848:0x0451, B:850:0x0455, B:1183:0x0a4e, B:1184:0x0a60, B:851:0x047e, B:1186:0x0a62, B:1188:0x0a64, B:700:0x00db, B:702:0x00e8, B:716:0x010a, B:747:0x01d4, B:749:0x01e4, B:752:0x01ee, B:754:0x01f2, B:756:0x01fc, B:758:0x0208, B:760:0x0218, B:765:0x0226, B:767:0x022a, B:769:0x022e, B:771:0x0234, B:773:0x023c, B:775:0x024a, B:764:0x0225, B:776:0x024c, B:717:0x013c, B:720:0x0144, B:722:0x0151, B:725:0x015d, B:727:0x0163, B:729:0x0169, B:731:0x016f, B:733:0x0175, B:741:0x0182, B:743:0x0188, B:744:0x019f, B:745:0x01aa, B:746:0x01b4, B:1189:0x0a65, B:1190:0x0a8c, B:1191:0x0a8d, B:705:0x00f5, B:707:0x00fa, B:993:0x0697, B:815:0x0368, B:954:0x062b, B:944:0x0613, B:906:0x058e, B:925:0x05e8, B:933:0x05f8, B:931:0x05f5, B:1000:0x06b1, B:1001:0x06b6, B:706:0x00f6, B:864:0x04ea, B:887:0x055d, B:895:0x056e, B:893:0x056b, B:898:0x0578, B:899:0x057d, B:970:0x064b, B:971:0x064d, B:976:0x065e, B:977:0x0661, B:983:0x0678, B:985:0x067a, B:986:0x067f, B:1125:0x0984, B:685:0x00c5, B:1046:0x07dd, B:1047:0x07df, B:1052:0x07ff, B:1051:0x07eb, B:1134:0x0990, B:824:0x038c, B:693:0x00d1, B:1074:0x087e, B:1148:0x09d2, B:689:0x00cb, B:1144:0x09bc), top: B:1283:0x000a }] */
    @Override // X.C0CH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object A04() {
        /*
            Method dump skipped, instructions count: 2976
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43431xO.A04():java.lang.Object");
    }

    public void A06() {
        int i;
        int i2;
        C04150It c04150It = this.A0P;
        C0DC c0dc = c04150It.A02.A05;
        if (c0dc == C0DC.A0N || c0dc == C0DC.A04 || c0dc == C0DC.A0Q) {
            try {
                C72653aN c72653aN = new C72653aN(this.A09, c04150It.A03());
                if (c72653aN.A04()) {
                    i = c72653aN.A01;
                } else {
                    i = c72653aN.A03;
                }
                if (c72653aN.A04()) {
                    i2 = c72653aN.A03;
                } else {
                    i2 = c72653aN.A01;
                }
                C23G c23g = this.A0R;
                synchronized (c23g) {
                    c23g.A03 = Integer.valueOf(i2);
                    c23g.A04 = Integer.valueOf(i);
                }
            } catch (C83663sU e) {
                Log.w("MMS upload unable to get video meta", e);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x004d, code lost:
        if (r3 != 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A07(long r8) {
        /*
            r7 = this;
            long r5 = r7.A00
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 <= 0) goto L17
            X.0EL r4 = r7.A0A
            long r2 = r8 - r5
            X.0It r0 = r7.A0P
            X.22a r0 = r0.A03
            boolean r1 = r0.A00
            r0 = 0
            if (r1 == 0) goto L14
            r0 = 4
        L14:
            r4.A06(r2, r0)
        L17:
            r7.A00 = r8
            X.22x r1 = r7.A0S
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r1.A08 = r0
            java.util.concurrent.FutureTask r0 = r7.A02
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L5e
            X.1xJ r0 = r7.A0U
            X.0It r1 = r7.A0P
            if (r0 == 0) goto L68
            boolean r0 = r1 instanceof X.C43651xk
            if (r0 == 0) goto L63
            r0 = r1
            X.1xk r0 = (X.C43651xk) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L5f
            java.io.File r1 = r1.A03()
            boolean r0 = r1.exists()
            X.C000700j.A07(r0)
            long r3 = r1.length()
        L49:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
        L4f:
            r0 = 100
            long r8 = r8 * r0
            long r1 = r8 / r3
        L54:
            int r0 = (int) r1
            X.0CK r1 = r7.A0D
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04(r0)
        L5e:
            return
        L5f:
            r3 = 65536(0x10000, double:3.2379E-319)
            goto L4f
        L63:
            X.1xe r0 = r1.A02
            long r3 = r0.A02
            goto L49
        L68:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43431xO.A07(long):void");
    }

    public final void A08(Integer num) {
        C23G c23g;
        if (this.A09.A0E(C01C.A1X) && this.A0P.A02.A0B) {
            C23G c23g2 = this.A0R;
            c23g2.A07(this.A0L.A01(C40731sm.A0T(c23g2.A03(), this.A0F.A05())));
        }
        if (num.intValue() == 18) {
            this.A0K.A04();
        }
        if (((C0CH) this).A02.isCancelled()) {
            num = 1;
        }
        C0CK c0ck = this.A0E;
        C04150It c04150It = this.A0P;
        C23G c23g3 = this.A0R;
        synchronized (c23g3) {
            c23g = new C23G();
            c23g.A00 = c23g3.A00;
            c23g.A0F = c23g3.A0F;
            c23g.A0H = c23g3.A0H;
            c23g.A0I = c23g3.A0I;
            c23g.A03 = c23g3.A03;
            c23g.A04 = c23g3.A04;
            c23g.A08 = c23g3.A08;
            c23g.A07 = c23g3.A07;
            c23g.A02 = c23g3.A02;
            c23g.A09 = c23g3.A09;
            c23g.A06 = c23g3.A06;
            c23g.A05 = c23g3.A05;
            c23g.A0C = c23g3.A0C;
            c23g.A0E = c23g3.A0E;
            c23g.A0D = c23g3.A0D;
            c23g.A0B = c23g3.A0B;
            c23g.A0A = c23g3.A0A;
            c23g.A0G = c23g3.A0G;
            c23g.A01 = c23g3.A01;
        }
        c0ck.A04(new C456322w(c04150It, c23g, num.intValue(), this.A06, this instanceof C23V, this.A03));
    }

    public final boolean A09() {
        C43591xe c43591xe = this.A0P.A02;
        C0DC c0dc = c43591xe.A05;
        if (C04030Id.A00(c0dc)) {
            if (c0dc == C0DC.A0N || c0dc == C0DC.A0M || c0dc == C0DC.A0Q) {
                return true;
            }
            int[] iArr = c43591xe.A0E;
            return iArr != null && iArr.length > 0;
        }
        return false;
    }

    @Override // X.C0CH, X.C0CJ
    public void cancel() {
        if (this.A05.get() != null) {
            if (this instanceof C23V) {
                if (this.A02 != null) {
                    this.A0Z.AS1(new RunnableEBaseShape3S0100000_I0_3(this, 46));
                } else {
                    throw null;
                }
            }
        }
        super.cancel();
    }
}
