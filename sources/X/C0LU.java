package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0LU */
/* loaded from: classes.dex */
public class C0LU extends AnonymousClass092 implements AnonymousClass098, AnonymousClass099, C0D9 {
    public C0XT A00;

    @Override // X.AnonymousClass092
    public String A16() {
        return null;
    }

    @Override // X.AnonymousClass092
    public void A17(String str) {
    }

    public C0LU(AnonymousClass094 anonymousClass094, long j, byte b) {
        super(anonymousClass094, j, b);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0LU(X.AnonymousClass094 r18, long r19, X.C48402Fc r21, byte r22) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LU.<init>(X.094, long, X.2Fc, byte):void");
    }

    public C0LU(C0LU c0lu, AnonymousClass094 anonymousClass094, long j, boolean z) {
        super(c0lu, anonymousClass094, j, z);
        this.A00 = c0lu.A00;
        A1B();
    }

    public static final List A01(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C40A c40a = (C40A) it.next();
                String str = c40a.A02;
                C0CX<AnonymousClass404> c0cx = c40a.A01;
                ArrayList arrayList2 = new ArrayList();
                if (c0cx != null) {
                    for (AnonymousClass404 anonymousClass404 : c0cx) {
                        arrayList2.add(new C50342Ri(anonymousClass404.A01));
                    }
                }
                arrayList.add(new C50352Rj(str, arrayList2));
            }
        }
        return arrayList;
    }

    public String A18() {
        C0XT c0xt = this.A00;
        if (c0xt == null) {
            return null;
        }
        return c0xt.A03;
    }

    public String A19() {
        C0XT c0xt = this.A00;
        if (c0xt == null) {
            return null;
        }
        return c0xt.A04;
    }

    public String A1A() {
        C0XT c0xt = this.A00;
        if (c0xt == null) {
            return null;
        }
        return c0xt.A05;
    }

    public final void A1B() {
        C50332Rh c50332Rh;
        C03900Hp A0E = A0E();
        if (A0E != null) {
            C0XT c0xt = this.A00;
            if (c0xt != null && c0xt.A00 == 2 && (c50332Rh = c0xt.A01) != null) {
                A0E.A04(c50332Rh.A01.A02, true);
                return;
            } else {
                A0E.A03(null);
                return;
            }
        }
        throw null;
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        EnumC55362kI enumC55362kI;
        C50332Rh c50332Rh;
        C40541sR c40541sR = c40551sS.A01;
        C0CT AVX = ((C40531sQ) c40541sR.A00).A0y().AVX();
        C0XT c0xt = this.A00;
        if (c0xt != null) {
            int i = c0xt.A00;
            if (i == 1) {
                enumC55362kI = EnumC55362kI.SINGLE_SELECT;
            } else if (i != 2) {
                enumC55362kI = EnumC55362kI.UNKNOWN;
            } else {
                enumC55362kI = EnumC55362kI.PRODUCT_LIST;
            }
            AVX.A02();
            C48402Fc.A0A((C48402Fc) AVX.A00, enumC55362kI);
            if (!TextUtils.isEmpty(c0xt.A05)) {
                String str = c0xt.A05;
                AVX.A02();
                C48402Fc.A0D((C48402Fc) AVX.A00, str);
            }
            if (!TextUtils.isEmpty(c0xt.A04)) {
                String str2 = c0xt.A04;
                AVX.A02();
                C48402Fc.A0G((C48402Fc) AVX.A00, str2);
            }
            String str3 = c0xt.A03;
            AVX.A02();
            C48402Fc.A0E((C48402Fc) AVX.A00, str3);
            String str4 = c0xt.A02;
            AVX.A02();
            C48402Fc.A0F((C48402Fc) AVX.A00, str4);
            int i2 = c0xt.A00;
            if (i2 == 1) {
                for (C50382Rm c50382Rm : c0xt.A06) {
                    C0CT AVX2 = C40E.A03.AVX();
                    String str5 = c50382Rm.A00;
                    if (!TextUtils.isEmpty(str5)) {
                        AVX2.A02();
                        C40E.A0A((C40E) AVX2.A00, str5);
                    }
                    for (C0XV c0xv : c50382Rm.A01) {
                        C0CT AVX3 = C40C.A04.AVX();
                        String str6 = c0xv.A02;
                        AVX3.A02();
                        C40C.A09((C40C) AVX3.A00, str6);
                        String str7 = c0xv.A01;
                        AVX3.A02();
                        C40C.A0B((C40C) AVX3.A00, str7);
                        String str8 = c0xv.A00;
                        if (!TextUtils.isEmpty(str8)) {
                            AVX3.A02();
                            C40C.A0A((C40C) AVX3.A00, str8);
                        }
                        AVX2.A02();
                        C40E.A09((C40E) AVX2.A00, (C40C) AVX3.A01());
                    }
                    AVX.A02();
                    C48402Fc.A0C((C48402Fc) AVX.A00, (C40E) AVX2.A01());
                }
            } else if (i2 == 2 && (c50332Rh = c0xt.A01) != null) {
                C0CT AVX4 = AnonymousClass408.A04.AVX();
                for (C50352Rj c50352Rj : c50332Rh.A02) {
                    C0CT AVX5 = C40A.A03.AVX();
                    String str9 = c50352Rj.A00;
                    if (!TextUtils.isEmpty(str9)) {
                        AVX5.A02();
                        C40A.A0A((C40A) AVX5.A00, str9);
                    }
                    for (C50342Ri c50342Ri : c50352Rj.A01) {
                        C0CT AVX6 = AnonymousClass404.A02.AVX();
                        String str10 = c50342Ri.A00;
                        if (!TextUtils.isEmpty(str10)) {
                            AVX6.A02();
                            AnonymousClass404.A09((AnonymousClass404) AVX6.A00, str10);
                            AVX5.A02();
                            C40A.A09((C40A) AVX5.A00, (AnonymousClass404) AVX6.A01());
                        }
                    }
                    AVX4.A02();
                    AnonymousClass408.A0A((AnonymousClass408) AVX4.A00, (C40A) AVX5.A01());
                    String rawString = c50332Rh.A00.getRawString();
                    AVX4.A02();
                    AnonymousClass408.A0B((AnonymousClass408) AVX4.A00, rawString);
                }
                AnonymousClass405 anonymousClass405 = (AnonymousClass405) AnonymousClass406.A03.AVX();
                C50362Rk c50362Rk = c50332Rh.A01;
                byte[] bArr = c50362Rk.A02;
                if (bArr != null) {
                    C0AN A01 = C0AN.A01(bArr, 0, bArr.length);
                    anonymousClass405.A02();
                    AnonymousClass406.A09((AnonymousClass406) anonymousClass405.A00, A01);
                }
                String str11 = c50362Rk.A01;
                anonymousClass405.A02();
                AnonymousClass406.A0A((AnonymousClass406) anonymousClass405.A00, str11);
                AVX4.A02();
                AnonymousClass408.A09((AnonymousClass408) AVX4.A00, anonymousClass405);
                AVX.A02();
                C48402Fc.A0B((C48402Fc) AVX.A00, (AnonymousClass408) AVX4.A01());
            }
            C0CM c0cm = c40551sS.A02;
            byte[] bArr2 = c40551sS.A05;
            if (AnonymousClass029.A1U(this, c0cm, bArr2)) {
                C40521sP A0G = AnonymousClass029.A0G(c40551sS.A00, this, c40551sS.A03, c0cm, bArr2);
                AVX.A02();
                C48402Fc.A09((C48402Fc) AVX.A00, A0G);
            }
            c40541sR.A02();
            C40531sQ.A0Q((C40531sQ) c40541sR.A00, (C48402Fc) AVX.A01());
        }
    }

    @Override // X.C0D9
    public AnonymousClass092 A6F(AnonymousClass094 anonymousClass094, long j) {
        C0XT c0xt = this.A00;
        if (c0xt != null) {
            C000700j.A06(c0xt.A00 == 2);
            if (c0xt.A01 != null) {
                return new C0LU(this, anonymousClass094, j, false);
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C0LU(this, anonymousClass094, this.A0E, true);
    }
}
