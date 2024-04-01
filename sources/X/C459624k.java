package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.24k  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C459624k {
    public static final List A04 = new ArrayList();
    public final List A01 = new ArrayList();
    public final List A03 = new ArrayList();
    public final List A00 = new ArrayList();
    public final List A02 = new ArrayList();

    public C459624k(C02590Ca c02590Ca) {
        String str;
        String str2;
        C24R c24r;
        C02590Ca A0D;
        C02590Ca[] c02590CaArr;
        C02590Ca[] c02590CaArr2;
        C02590Ca A0D2 = c02590Ca.A0D("sync");
        if (A0D2 != null) {
            for (C02590Ca c02590Ca2 : A0D2.A0H("collection")) {
                C04P A0A = c02590Ca2.A0A("type");
                if (A0A != null) {
                    str = A0A.A03;
                } else {
                    str = null;
                }
                if ("error".equals(str)) {
                    C02590Ca A0D3 = c02590Ca2.A0D("error");
                    if (A0D3 != null) {
                        try {
                            int A05 = A0D3.A05("code", -1);
                            C04P A0A2 = A0D3.A0A("text");
                            String str3 = A0A2 != null ? A0A2.A03 : null;
                            if (A05 == 409 && (A0D = c02590Ca2.A0D("patches")) != null && (c02590CaArr = A0D.A03) != null && c02590CaArr.length > 0) {
                                c24r = A01(c02590Ca2);
                            } else {
                                C04P A0A3 = c02590Ca2.A0A("has_more_patches");
                                if (A0A3 != null) {
                                    str2 = A0A3.A03;
                                } else {
                                    str2 = null;
                                }
                                c24r = new C24R("true".equals(str2), A00(c02590Ca2), A04);
                            }
                            this.A01.add(new C2K7(A05, str3, A00(c02590Ca2), c24r));
                        } catch (C0L4 e) {
                            StringBuilder sb = new StringBuilder("Expected attribute code in ");
                            sb.append(A0D3);
                            sb.append(" exception");
                            sb.append(e.getMessage());
                            throw new C24Q(true, sb.toString());
                        }
                    } else {
                        throw null;
                    }
                } else {
                    C04P A0A4 = c02590Ca2.A0A("version");
                    if (A0A4 != null && A0A4.A03 != null) {
                        try {
                            long A07 = c02590Ca2.A07("version", -1L);
                            if (A07 != -1) {
                                this.A03.add(new C2KA(A07, A00(c02590Ca2)));
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Expected attribute version in ");
                                sb2.append(c02590Ca2);
                                throw new C24Q(true, sb2.toString());
                            }
                        } catch (C0L4 e2) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Expected attribute version in ");
                            sb3.append(c02590Ca2);
                            sb3.append(" exception");
                            sb3.append(e2.getMessage());
                            throw new C24Q(true, sb3.toString());
                        }
                    } else {
                        C02590Ca A0D4 = c02590Ca2.A0D("patches");
                        if (A0D4 != null && (c02590CaArr2 = A0D4.A03) != null && c02590CaArr2.length > 0) {
                            this.A02.add(A01(c02590Ca2));
                        } else {
                            this.A00.add(A00(c02590Ca2));
                        }
                    }
                }
            }
            return;
        }
        throw new C24Q(true, "Expected node sync in response, but not found");
    }

    public static final String A00(C02590Ca c02590Ca) {
        String str;
        C04P A0A = c02590Ca.A0A("name");
        if (A0A == null || (str = A0A.A03) == null) {
            StringBuilder sb = new StringBuilder("Expected attribute name in ");
            sb.append(c02590Ca);
            throw new C24Q(true, sb.toString());
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r3 != 101) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C24R A01(X.C02590Ca r9) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C459624k.A01(X.0Ca):X.24R");
    }
}
