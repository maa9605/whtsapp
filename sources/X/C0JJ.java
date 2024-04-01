package X;

import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.TextData;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0JJ */
/* loaded from: classes.dex */
public class C0JJ extends AnonymousClass092 implements AnonymousClass098, AnonymousClass099, C0D9 {
    public int A00;
    public TextData A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public byte[] A06;

    public C0JJ(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 0);
        this.A00 = 0;
    }

    public C0JJ(AnonymousClass094 anonymousClass094, long j, byte b) {
        super(anonymousClass094, j, b);
        this.A00 = 0;
    }

    public C0JJ(AnonymousClass094 anonymousClass094, long j, C0CZ c0cz) {
        super(anonymousClass094, j, (byte) 0);
        this.A00 = 0;
        A0l(c0cz.A06);
        this.A0H = c0cz;
        A0U(1024);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0JJ(X.AnonymousClass094 r8, long r9, X.C2FX r11) {
        /*
            r7 = this;
            X.3lG r3 = X.EnumC79203lG.VIDEO
            r0 = 0
            r7.<init>(r8, r9, r0)
            r7.A00 = r0
            java.lang.String r1 = r11.A0A
            r5 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r0 = X.AnonymousClass024.A0K(r1, r5)
            r7.A0l(r0)
            java.lang.String r2 = r11.A09
            java.lang.String r1 = X.C04310Jr.A02(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r4 = 1
            if (r0 != 0) goto L26
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L75
        L26:
            int r1 = r11.A01
            r0 = 16
            r1 = r1 & r0
            if (r1 != r0) goto L35
            java.lang.String r0 = r11.A0B
            java.lang.String r0 = X.AnonymousClass024.A0K(r0, r5)
            r7.A04 = r0
        L35:
            int r1 = r11.A01
            r0 = 8
            r1 = r1 & r0
            if (r1 != r0) goto L44
            java.lang.String r0 = r11.A08
            java.lang.String r0 = X.AnonymousClass024.A0K(r0, r5)
            r7.A02 = r0
        L44:
            int r2 = r11.A01
            r1 = 4
            r0 = r2 & r1
            if (r0 != r1) goto L4f
            java.lang.String r0 = r11.A07
            r7.A05 = r0
        L4f:
            r1 = 256(0x100, float:3.59E-43)
            r0 = r2 & r1
            if (r0 != r1) goto L67
            X.3lG r1 = X.EnumC79203lG.NONE
            int r0 = r11.A03
            if (r0 == 0) goto Lb5
            if (r0 != r4) goto L61
            r0 = r3
        L5e:
            if (r0 == 0) goto L61
            r1 = r0
        L61:
            r0 = 0
            if (r1 != r3) goto L65
            r0 = 1
        L65:
            r7.A00 = r0
        L67:
            r0 = 512(0x200, float:7.175E-43)
            r2 = r2 & r0
            if (r2 != r0) goto L75
            X.0AN r0 = r11.A05
            byte[] r0 = r0.A06()
            r7.A1C(r0)
        L75:
            int r6 = r11.A01
            r5 = 64
            r4 = r6 & r5
            r0 = 0
            if (r4 != r5) goto L7f
            r0 = 1
        L7f:
            r3 = 128(0x80, float:1.794E-43)
            r2 = 32
            if (r0 != 0) goto L8d
            r0 = r6 & r2
            if (r0 == r2) goto L8d
            r0 = r6 & r3
            if (r0 != r3) goto Lb4
        L8d:
            com.whatsapp.TextData r1 = new com.whatsapp.TextData
            r1.<init>()
            if (r4 != r5) goto L98
            int r0 = r11.A00
            r1.backgroundColor = r0
        L98:
            r0 = r6 & r2
            if (r0 != r2) goto La0
            int r0 = r11.A04
            r1.textColor = r0
        La0:
            r6 = r6 & r3
            if (r6 != r3) goto Lb1
            int r0 = r11.A02
            X.3lF r0 = X.EnumC79193lF.A00(r0)
            if (r0 != 0) goto Lad
            X.3lF r0 = X.EnumC79193lF.SANS_SERIF
        Lad:
            int r0 = r0.value
            r1.fontStyle = r0
        Lb1:
            r7.A1A(r1)
        Lb4:
            return
        Lb5:
            r0 = r1
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JJ.<init>(X.094, long, X.2FX):void");
    }

    public C0JJ(AnonymousClass094 anonymousClass094, long j, String str) {
        super(anonymousClass094, j, (byte) 0);
        this.A00 = 0;
        A0l(AnonymousClass024.A0K(str, 65536));
    }

    public C0JJ(AnonymousClass094 anonymousClass094, long j, String str, C05920Qu c05920Qu, List list) {
        super(anonymousClass094, j, (byte) 0);
        this.A00 = 0;
        A0l(str);
        if (c05920Qu != null && c05920Qu.A0C()) {
            this.A04 = c05920Qu.A0D;
            this.A02 = c05920Qu.A0A;
            this.A05 = c05920Qu.A09;
            this.A00 = c05920Qu.A02;
            A1C(c05920Qu.A0F);
        }
        A0v(list);
    }

    public C0JJ(C0JJ c0jj, AnonymousClass094 anonymousClass094, long j, boolean z) {
        super(c0jj, anonymousClass094, j, z);
        this.A00 = 0;
        this.A04 = c0jj.A04;
        this.A02 = c0jj.A02;
        this.A05 = c0jj.A05;
        this.A01 = c0jj.A01;
        this.A06 = c0jj.A06;
        this.A00 = c0jj.A00;
    }

    @Override // X.AnonymousClass092
    public int A05() {
        return this.A00;
    }

    @Override // X.AnonymousClass092
    public Object A0F() {
        TextData textData = this.A01;
        return textData != null ? textData : this.A06;
    }

    @Override // X.AnonymousClass092
    public String A0J() {
        return this.A04;
    }

    @Override // X.AnonymousClass092
    public String A0M() {
        return this.A03;
    }

    @Override // X.AnonymousClass092
    public String A0N() {
        return this.A02;
    }

    @Override // X.AnonymousClass092
    public String A0O() {
        return this.A05;
    }

    @Override // X.AnonymousClass092
    public void A0X(int i) {
        this.A00 = i;
    }

    @Override // X.AnonymousClass092
    public void A0k(Object obj) {
        if (obj instanceof TextData) {
            A1A((TextData) obj);
        } else if (!(obj instanceof byte[]) && obj != null) {
            StringBuilder A0P = C000200d.A0P("FMessageText/setObjectForDatabaseFieldThumbImage/setting wrong object; object.class=");
            A0P.append(obj.getClass());
            C000700j.A08(false, A0P.toString());
        } else {
            this.A06 = (byte[]) obj;
        }
    }

    @Override // X.AnonymousClass092
    public void A0o(String str) {
        this.A04 = str;
    }

    @Override // X.AnonymousClass092
    public void A0r(String str) {
        this.A03 = str;
    }

    @Override // X.AnonymousClass092
    public void A0s(String str) {
        this.A02 = str;
    }

    @Override // X.AnonymousClass092
    public void A0t(String str) {
        this.A05 = str;
    }

    @Override // X.AnonymousClass092
    public String A16() {
        return A0G();
    }

    @Override // X.AnonymousClass092
    public void A17(String str) {
        A0l(str);
    }

    @Override // X.C0D9
    /* renamed from: A18 */
    public C0JJ A6F(AnonymousClass094 anonymousClass094, long j) {
        C0JJ c0jj = new C0JJ(this, anonymousClass094, j, false);
        C05530Pc c05530Pc = A0D().A00;
        if (c05530Pc != null) {
            c0jj.A0h(new C05530Pc(c05530Pc.A00, c05530Pc.A01, new ArrayList()));
        }
        A1B(c0jj, anonymousClass094);
        return c0jj;
    }

    public String A19() {
        return A0G();
    }

    public void A1A(TextData textData) {
        byte[] bArr;
        if (textData != null && (bArr = this.A06) != null) {
            textData.thumbnail = bArr;
            this.A06 = null;
        }
        this.A01 = textData;
    }

    public void A1B(C0JJ c0jj, AnonymousClass094 anonymousClass094) {
        if (C003101m.A0Z(anonymousClass094.A00)) {
            TextData textData = new TextData();
            textData.backgroundColor = C48222Ej.A00();
            textData.textColor = -1;
            textData.fontStyle = 0;
            c0jj.A1A(textData);
            if (C40731sm.A0n(c0jj)) {
                StringBuilder sb = new StringBuilder();
                String A0G = c0jj.A0G();
                if (!TextUtils.isEmpty(A0G)) {
                    sb.append(A0G);
                }
                String A0Q = C40731sm.A0Q(c0jj);
                if (!TextUtils.isEmpty(A0Q)) {
                    if (!TextUtils.isEmpty(sb)) {
                        sb.append("\n\n");
                    }
                    sb.append(A0Q);
                }
                C05530Pc c05530Pc = c0jj.A0D().A00;
                if (c05530Pc != null && !TextUtils.isEmpty(c05530Pc.A01)) {
                    if (!TextUtils.isEmpty(sb)) {
                        sb.append("\n\n");
                    }
                    sb.append(c05530Pc.A01);
                }
                String obj = sb.toString();
                if (!TextUtils.isEmpty(obj)) {
                    c0jj.A0l(C48222Ej.A03(obj));
                }
            } else if (TextUtils.isEmpty(A0G())) {
            } else {
                c0jj.A0l(C48222Ej.A03(c0jj.A0G()));
            }
        } else if (this.A01 == null) {
        } else {
            c0jj.A01 = null;
            c0jj.A1C(this.A01.thumbnail);
        }
    }

    public void A1C(byte[] bArr) {
        TextData textData = this.A01;
        if (textData != null) {
            textData.thumbnail = bArr;
        } else {
            this.A06 = bArr;
        }
    }

    public byte[] A1D() {
        TextData textData = this.A01;
        if (textData != null) {
            return textData.thumbnail;
        }
        return this.A06;
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        int i;
        AnonymousClass093 anonymousClass093 = this.A0F;
        if (anonymousClass093 != null) {
            if (anonymousClass093.A0O()) {
                long longValue = this.A0F.A07.A00.scaleByPowerOfTen(3).longValue();
                AnonymousClass093 anonymousClass0932 = this.A0F;
                String str = anonymousClass0932.A0G;
                C0K8 c0k8 = anonymousClass0932.A09;
                C466327p c466327p = c0k8 == null ? null : c0k8.A00;
                long A07 = c0k8 == null ? 0L : c0k8.A07();
                UserJid userJid = anonymousClass0932.A0C;
                C02L c02l = c40551sS.A00;
                C40541sR c40541sR = c40551sS.A01;
                boolean z = c40551sS.A03;
                C0CM c0cm = c40551sS.A02;
                byte[] bArr = c40551sS.A05;
                C48522Fo c48522Fo = (C48522Fo) ((C40531sQ) c40541sR.A00).A16().AVX();
                C40541sR c40541sR2 = (C40541sR) ((C48532Fp) c48522Fo.A00).A0i().AVX();
                C2FW c2fw = (C2FW) c40541sR2.A05().AVX();
                if (A0G() != null) {
                    c2fw.A04(A0G());
                }
                if (AnonymousClass029.A1U(this, c0cm, bArr)) {
                    C40521sP A0G = AnonymousClass029.A0G(c02l, this, z, c0cm, bArr);
                    c2fw.A02();
                    C2FX.A0A((C2FX) c2fw.A00, A0G);
                }
                c40541sR2.A02();
                C40531sQ.A0K((C40531sQ) c40541sR2.A00, c2fw);
                c48522Fo.A02();
                C48532Fp.A09((C48532Fp) c48522Fo.A00, c40541sR2);
                c48522Fo.A02();
                C48532Fp c48532Fp = (C48532Fp) c48522Fo.A00;
                c48532Fp.A00 |= 4;
                c48532Fp.A01 = longValue;
                c48522Fo.A02();
                C48532Fp c48532Fp2 = (C48532Fp) c48522Fo.A00;
                C48532Fp.A0B(c48532Fp2, str);
                C0CT AVX = c48532Fp2.A0j().AVX();
                if (c466327p != null) {
                    longValue = c466327p.A01();
                }
                AVX.A02();
                C55332kF c55332kF = (C55332kF) AVX.A00;
                c55332kF.A00 |= 1;
                c55332kF.A02 = longValue;
                if (c466327p != null) {
                    i = c466327p.A00();
                } else {
                    i = SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
                }
                AVX.A02();
                C55332kF c55332kF2 = (C55332kF) AVX.A00;
                c55332kF2.A00 |= 2;
                c55332kF2.A01 = i;
                if (c466327p != null) {
                    str = c466327p.A02().A9K();
                }
                AVX.A02();
                C55332kF.A09((C55332kF) AVX.A00, str);
                c48522Fo.A02();
                C48532Fp.A0A((C48532Fp) c48522Fo.A00, (C55332kF) AVX.A01());
                c48522Fo.A02();
                C48532Fp c48532Fp3 = (C48532Fp) c48522Fo.A00;
                c48532Fp3.A00 |= 16;
                c48532Fp3.A02 = A07 / 1000;
                if (userJid != null) {
                    String rawString = userJid.getRawString();
                    c48522Fo.A02();
                    C48532Fp.A0C((C48532Fp) c48522Fo.A00, rawString);
                }
                c40541sR.A02();
                C40531sQ.A0Y((C40531sQ) c40541sR.A00, c48522Fo);
                return;
            }
            AnonymousClass093 anonymousClass0933 = this.A0F;
            String str2 = anonymousClass0933.A0K;
            UserJid userJid2 = anonymousClass0933.A0B;
            C02L c02l2 = c40551sS.A00;
            C40541sR c40541sR3 = c40551sS.A01;
            boolean z2 = c40551sS.A03;
            C0CM c0cm2 = c40551sS.A02;
            byte[] bArr2 = c40551sS.A05;
            C48542Fq c48542Fq = (C48542Fq) ((C40531sQ) c40541sR3.A00).A17().AVX();
            C40541sR c40541sR4 = (C40541sR) ((C48552Fr) c48542Fq.A00).A0i().AVX();
            C2FW c2fw2 = (C2FW) c40541sR4.A05().AVX();
            if (A0G() != null) {
                c2fw2.A04(A0G());
            }
            if (str2 != null) {
                C452521b A09 = C452421a.A09();
                A09.A02();
                C452421a.A0A((C452421a) A09.A00, str2);
                A09.A07(false);
                AbstractC005302j abstractC005302j = this.A0n.A00;
                if (C003101m.A0U(abstractC005302j) && userJid2 != null) {
                    A09.A05(userJid2.getRawString());
                }
                A09.A06(C003101m.A07(abstractC005302j));
                c48542Fq.A02();
                C48552Fr.A0A((C48552Fr) c48542Fq.A00, (C452421a) A09.A01());
            }
            if (AnonymousClass029.A1U(this, c0cm2, bArr2)) {
                C40521sP A0G2 = AnonymousClass029.A0G(c02l2, this, z2, c0cm2, bArr2);
                c2fw2.A02();
                C2FX.A0A((C2FX) c2fw2.A00, A0G2);
            }
            c40541sR4.A02();
            C40531sQ.A0K((C40531sQ) c40541sR4.A00, c2fw2);
            c48542Fq.A02();
            C48552Fr.A09((C48552Fr) c48542Fq.A00, c40541sR4);
            c40541sR3.A02();
            C40531sQ.A0Z((C40531sQ) c40541sR3.A00, c48542Fq);
        } else if (C40731sm.A0n(this)) {
            C40541sR c40541sR5 = c40551sS.A01;
            C02L c02l3 = c40551sS.A00;
            C0CM c0cm3 = c40551sS.A02;
            byte[] bArr3 = c40551sS.A05;
            boolean z3 = c40551sS.A03;
            C2GC c2gc = (C2GC) c40541sR5.A04().AVX();
            if (!TextUtils.isEmpty(A0G())) {
                EnumC55382kK enumC55382kK = EnumC55382kK.TEXT;
                c2gc.A02();
                C2FI.A0A((C2FI) c2gc.A00, enumC55382kK);
                String A0G3 = A0G();
                c2gc.A02();
                C2FI.A0F((C2FI) c2gc.A00, A0G3);
            } else {
                EnumC55382kK enumC55382kK2 = EnumC55382kK.EMPTY;
                c2gc.A02();
                C2FI.A0A((C2FI) c2gc.A00, enumC55382kK2);
            }
            C40731sm.A0f(c2gc, A0D().A00);
            if (AnonymousClass029.A1U(this, c0cm3, bArr3)) {
                C40521sP A0G4 = AnonymousClass029.A0G(c02l3, this, z3, c0cm3, bArr3);
                c2gc.A02();
                C2FI.A09((C2FI) c2gc.A00, A0G4);
            }
            c40541sR5.A02();
            C40531sQ.A0C((C40531sQ) c40541sR5.A00, (C2FI) c2gc.A01());
        } else if (TextUtils.isEmpty(this.A04) && TextUtils.isEmpty(this.A02) && this.A01 == null && !A14(1024) && !AnonymousClass029.A1U(this, c40551sS.A02, c40551sS.A05)) {
            C40541sR c40541sR6 = c40551sS.A01;
            String A0G5 = A0G();
            c40541sR6.A02();
            C40531sQ.A0g((C40531sQ) c40541sR6.A00, A0G5);
        } else {
            C40541sR c40541sR7 = c40551sS.A01;
            C2FW c2fw3 = (C2FW) c40541sR7.A05().AVX();
            c2fw3.A04(A0G());
            String A02 = C04310Jr.A02(A0G());
            if (!TextUtils.isEmpty(A02)) {
                c2fw3.A02();
                C2FX.A0D((C2FX) c2fw3.A00, A02);
            }
            if (!TextUtils.isEmpty(this.A04)) {
                String str3 = this.A04;
                c2fw3.A02();
                C2FX.A0G((C2FX) c2fw3.A00, str3);
            }
            if (!TextUtils.isEmpty(this.A02)) {
                String str4 = this.A02;
                c2fw3.A02();
                C2FX.A0F((C2FX) c2fw3.A00, str4);
            }
            if (!TextUtils.isEmpty(this.A05)) {
                String str5 = this.A05;
                c2fw3.A02();
                C2FX.A0E((C2FX) c2fw3.A00, str5);
            }
            if (this.A00 == 1) {
                EnumC79203lG enumC79203lG = EnumC79203lG.VIDEO;
                c2fw3.A02();
                C2FX.A0C((C2FX) c2fw3.A00, enumC79203lG);
            } else {
                EnumC79203lG enumC79203lG2 = EnumC79203lG.NONE;
                c2fw3.A02();
                C2FX.A0C((C2FX) c2fw3.A00, enumC79203lG2);
            }
            TextData textData = this.A01;
            if (textData != null) {
                int i2 = textData.backgroundColor;
                c2fw3.A02();
                C2FX c2fx = (C2FX) c2fw3.A00;
                c2fx.A01 |= 64;
                c2fx.A00 = i2;
                int i3 = this.A01.textColor;
                c2fw3.A02();
                C2FX c2fx2 = (C2FX) c2fw3.A00;
                c2fx2.A01 |= 32;
                c2fx2.A04 = i3;
                EnumC79193lF A00 = EnumC79193lF.A00(this.A01.fontStyle);
                c2fw3.A02();
                C2FX.A0B((C2FX) c2fw3.A00, A00);
                byte[] bArr4 = this.A01.thumbnail;
                if (bArr4 != null) {
                    C0AN A01 = C0AN.A01(bArr4, 0, bArr4.length);
                    c2fw3.A02();
                    C2FX.A09((C2FX) c2fw3.A00, A01);
                }
            } else {
                byte[] bArr5 = this.A06;
                if (bArr5 != null) {
                    C0AN A012 = C0AN.A01(bArr5, 0, bArr5.length);
                    c2fw3.A02();
                    C2FX.A09((C2FX) c2fw3.A00, A012);
                }
            }
            C0CM c0cm4 = c40551sS.A02;
            byte[] bArr6 = c40551sS.A05;
            if (AnonymousClass029.A1U(this, c0cm4, bArr6)) {
                C40521sP A0G6 = AnonymousClass029.A0G(c40551sS.A00, this, c40551sS.A03, c0cm4, bArr6);
                c2fw3.A02();
                C2FX.A0A((C2FX) c2fw3.A00, A0G6);
            }
            c40541sR7.A02();
            C40531sQ.A0K((C40531sQ) c40541sR7.A00, c2fw3);
        }
    }

    @Override // X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C0JJ(this, anonymousClass094, this.A0E, true);
    }
}
