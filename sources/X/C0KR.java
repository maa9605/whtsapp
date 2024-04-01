package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.math.BigDecimal;

/* renamed from: X.0KR */
/* loaded from: classes.dex */
public class C0KR {
    public static volatile C0KR A08;
    public final C02L A00;
    public final C0C9 A01;
    public final C013606n A02;
    public final C0EU A03;
    public final C0GR A04;
    public final C0DV A05;
    public final C466027m A06;
    public final C466127n A07;

    public C0KR(C02L c02l, C0DV c0dv, C0C9 c0c9, C0EU c0eu, C013606n c013606n, C0GR c0gr) {
        this.A00 = c02l;
        this.A05 = c0dv;
        this.A01 = c0c9;
        this.A03 = c0eu;
        this.A02 = c013606n;
        this.A04 = c0gr;
        C465927l c465927l = new C465927l();
        this.A06 = new C466027m(c465927l);
        this.A07 = new C466127n(null, c465927l);
    }

    public static C0KR A00() {
        if (A08 == null) {
            synchronized (C0KR.class) {
                if (A08 == null) {
                    A08 = new C0KR(C02L.A00(), C0DV.A00(), C0C9.A00(), C0EU.A00(), C013606n.A03(), C0GR.A00());
                }
            }
        }
        return A08;
    }

    public final AnonymousClass093 A01(long j, C02590Ca c02590Ca) {
        String str;
        String str2 = AnonymousClass093.A0Q;
        C04P A0A = c02590Ca.A0A("country");
        if (A0A != null) {
            str2 = A0A.A03;
        }
        C04P A0A2 = c02590Ca.A0A("version");
        byte[] bArr = null;
        if (A0A2 != null) {
            str = A0A2.A03;
        } else {
            str = null;
        }
        int A01 = AnonymousClass024.A01(str, 1);
        try {
            bArr = this.A07.A0B(c02590Ca);
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder("PAY: PaymentsProtoParser serializeProtocolNode: ");
            sb.append(e);
            Log.e(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("PAY PaymentsProtoParser: buildFuturePaymentFromPayNode: futurePayment country=");
        sb2.append(str2);
        sb2.append(" version=");
        sb2.append(A01);
        Log.i(sb2.toString());
        return AnonymousClass093.A04(j, str2, A01, bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0029, code lost:
        if ("PARTIAL".equalsIgnoreCase(r2) == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.AnonymousClass093 A02(com.whatsapp.jid.UserJid r16, long r17, X.C02590Ca r19) {
        /*
            r15 = this;
            java.lang.String r0 = "version"
            r1 = r19
            X.04P r0 = r1.A0A(r0)
            r11 = 0
            if (r0 == 0) goto Lda
            java.lang.String r2 = r0.A03
        Ld:
            r0 = 1
            int r13 = X.AnonymousClass024.A01(r2, r0)
            java.lang.String r0 = "sync-status"
            X.04P r0 = r1.A0A(r0)
            if (r0 == 0) goto Ld7
            java.lang.String r2 = r0.A03
        L1c:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "PARTIAL"
            boolean r0 = r0.equalsIgnoreCase(r2)
            r4 = 1
            if (r0 != 0) goto L2c
        L2b:
            r4 = 0
        L2c:
            if (r4 == 0) goto Lc8
            X.06o r0 = X.C013806p.A06
            java.lang.String r6 = r0.A9K()
        L34:
            if (r4 == 0) goto Lc4
            X.0Gn r0 = X.C03650Gn.A0E
        L38:
            java.lang.String r12 = r0.A02
            java.lang.String r0 = "country"
            X.04P r0 = r1.A0A(r0)
            if (r0 == 0) goto L44
            java.lang.String r12 = r0.A03
        L44:
            java.lang.String r0 = "amount"
            X.04P r0 = r1.A0A(r0)
            if (r0 == 0) goto Lc2
            java.lang.String r2 = r0.A03
        L4e:
            java.lang.String r0 = "receiver"
            X.04P r0 = r1.A0A(r0)
            if (r0 == 0) goto Lc0
            java.lang.String r0 = r0.A03
        L58:
            com.whatsapp.jid.UserJid r5 = com.whatsapp.jid.UserJid.getNullable(r0)
            if (r5 == 0) goto Lde
            X.0Gn r0 = X.C03650Gn.A0F
            java.lang.String r3 = r0.A02
            boolean r0 = r3.equals(r12)
            if (r0 == 0) goto L6f
            X.0DV r0 = r15.A05
            X.0Gf r0 = r0.A01
            if (r0 != 0) goto Lbb
            r12 = r3
        L6f:
            X.0DV r0 = r15.A05
            X.0Gh r0 = r0.A02(r12)
            if (r0 == 0) goto Lb9
            X.0DX r0 = r0.ACJ(r6)
            if (r0 == 0) goto Lb9
            int r14 = r0.AD6()
        L81:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto Ldd
            X.06o r8 = X.C013606n.A01(r6)
            if (r4 == 0) goto Lb0
            r7 = r11
        L8e:
            r2 = 3
            if (r4 == 0) goto L93
            r2 = 1000(0x3e8, float:1.401E-42)
        L93:
            r3 = 0
            r9 = r17
            r4 = r16
            X.093 r2 = X.AnonymousClass093.A02(r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14)
            java.lang.String r0 = "transaction-id"
            X.04P r0 = r1.A0A(r0)
            if (r0 == 0) goto La6
            java.lang.String r11 = r0.A03
        La6:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto Laf
            r2.A0G(r11)
        Laf:
            return r2
        Lb0:
            int r0 = r8.A9i()
            X.06r r7 = X.C014006r.A00(r2, r0)
            goto L8e
        Lb9:
            r14 = 0
            goto L81
        Lbb:
            java.lang.String r12 = r0.getPaymentCountryFromCurrency(r6)
            goto L6f
        Lc0:
            r0 = r11
            goto L58
        Lc2:
            r2 = r11
            goto L4e
        Lc4:
            X.0Gn r0 = X.C03650Gn.A0F
            goto L38
        Lc8:
            java.lang.String r0 = "currency"
            X.04P r0 = r1.A0A(r0)
            if (r0 == 0) goto Ld4
            java.lang.String r6 = r0.A03
            goto L34
        Ld4:
            r6 = r11
            goto L34
        Ld7:
            r2 = r11
            goto L1c
        Lda:
            r2 = r11
            goto Ld
        Ldd:
            return r11
        Lde:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KR.A02(com.whatsapp.jid.UserJid, long, X.0Ca):X.093");
    }

    public AnonymousClass093 A03(UserJid userJid, UserJid userJid2, long j, C02590Ca c02590Ca) {
        String str;
        String str2;
        String str3;
        C0DX ACJ;
        String str4 = this.A04.A02().A02;
        C04P A0A = c02590Ca.A0A("country");
        if (A0A != null) {
            str4 = A0A.A03;
        }
        C04P A0A2 = c02590Ca.A0A("version");
        if (A0A2 != null) {
            str = A0A2.A03;
        } else {
            str = null;
        }
        int A01 = AnonymousClass024.A01(str, 1);
        C04P A0A3 = c02590Ca.A0A("request-id");
        if (A0A3 != null && (str2 = A0A3.A03) != null) {
            C04P A0A4 = c02590Ca.A0A("expiry-ts");
            if (A0A4 != null && (str3 = A0A4.A03) != null) {
                C04P A0A5 = c02590Ca.A0A("sender");
                UserJid nullable = UserJid.getNullable(A0A5 != null ? A0A5.A03 : null);
                if (nullable == null) {
                    nullable = userJid;
                }
                if (str4 != null) {
                    String A9K = C013806p.A06.A9K();
                    InterfaceC03590Gh A02 = this.A05.A02(str4);
                    if (A02 != null && (ACJ = A02.ACJ(A9K)) != null) {
                        String A9K2 = C013806p.A06.A9K();
                        InterfaceC013706o A012 = C013606n.A01(A9K2);
                        if (nullable != null) {
                            AnonymousClass093 A022 = AnonymousClass093.A02(20, 12, nullable, userJid2, A9K2, new C014006r(new BigDecimal(0), 1), A012, j, str2, str4, A01, ACJ.AD6());
                            C0K8 AEp = ACJ.AEp();
                            if (AEp != null) {
                                A022.A0E(AEp, AnonymousClass024.A03(str3, j / 1000) * 1000);
                            }
                            return A022;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0042, code lost:
        if (r37 == null) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x011d, code lost:
        if (r1 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0179, code lost:
        if ("PARTIAL".equalsIgnoreCase(r2) == false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x01d0, code lost:
        if (r4.A00.doubleValue() <= 0.0d) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x030e, code lost:
        if (r32 != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0310, code lost:
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x03a9, code lost:
        if (r32 != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x03ad, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x04c4, code lost:
        if (r5.equals("deposit") != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x04cd, code lost:
        if (r5.equals("withdrawal") != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x04d6, code lost:
        if (r5.equals("refund") != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x04d8, code lost:
        r32 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:433:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x03e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.AnonymousClass093 A04(X.C02590Ca r60) {
        /*
            Method dump skipped, instructions count: 1378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KR.A04(X.0Ca):X.093");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x023d, code lost:
        if (r4 == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0245, code lost:
        if (r4 == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x024f, code lost:
        if (r4 == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0259, code lost:
        if (r4 == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0263, code lost:
        if (r4 == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x026b, code lost:
        if (r4 == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0273, code lost:
        if (r4 == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x027b, code lost:
        if (r4 == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x02c2, code lost:
        if (r6.equals("wallet") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x02cd, code lost:
        if (r6.equals("merchant") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x02d8, code lost:
        if (r6.equals("bank") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x02e3, code lost:
        if (r6.equals("card") == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList A05(X.C02590Ca r36) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KR.A05(X.0Ca):java.util.ArrayList");
    }

    public boolean A06(AnonymousClass093 anonymousClass093) {
        byte[] bArr;
        AnonymousClass093 A02;
        C0DX ACJ;
        if (anonymousClass093.A0Q() && (bArr = anonymousClass093.A0P) != null) {
            try {
                C02590Ca A06 = this.A06.A06(bArr);
                if (A06 != null) {
                    String str = A06.A00;
                    if (str.equals("pay")) {
                        AnonymousClass094 anonymousClass094 = new AnonymousClass094(anonymousClass093.A0A, anonymousClass093.A0O, anonymousClass093.A0J);
                        if (anonymousClass094.A00 == null || anonymousClass094.A01 == null) {
                            return false;
                        }
                        C0C9 c0c9 = this.A01;
                        AnonymousClass092 A05 = c0c9.A0H.A05(anonymousClass094);
                        if (A05 != null) {
                            C04P A0A = A06.A0A("type");
                            String str2 = A0A != null ? A0A.A03 : null;
                            AbstractC005302j A0A2 = A05.A0A();
                            if (str2 == null || !str2.equals("request")) {
                                A02 = A02(UserJid.of(A0A2), A05.A0E, A06);
                                if (A02 == null) {
                                    return false;
                                }
                            } else {
                                AnonymousClass093 anonymousClass0932 = A05.A0F;
                                if (anonymousClass0932 == null) {
                                    return false;
                                }
                                AbstractC005302j abstractC005302j = A05.A0n.A00;
                                if (C003101m.A0U(abstractC005302j) && !this.A00.A0A(anonymousClass0932.A0C)) {
                                    return false;
                                }
                                AnonymousClass093 anonymousClass0933 = A05.A0F;
                                String str3 = anonymousClass0933.A0E;
                                String str4 = anonymousClass0933.A0G;
                                InterfaceC03590Gh A022 = this.A05.A02(str3);
                                if (A022 != null && (ACJ = A022.ACJ(str4)) != null) {
                                    AnonymousClass093 anonymousClass0934 = A05.A0F;
                                    UserJid userJid = anonymousClass0934.A0C;
                                    UserJid userJid2 = anonymousClass0934.A0B;
                                    String str5 = anonymousClass0934.A0G;
                                    C014006r c014006r = anonymousClass0934.A07;
                                    InterfaceC013706o interfaceC013706o = anonymousClass0934.A06;
                                    long j = A05.A0E;
                                    String str6 = anonymousClass0934.A0E;
                                    A02 = AnonymousClass093.A02(20, 12, userJid, userJid2, str5, c014006r, interfaceC013706o, j, null, str6, AnonymousClass093.A01(str6), ACJ.AD6());
                                    int i = A05.A0F.A01;
                                    if (i != 0) {
                                        A02.A01 = i;
                                    }
                                    AnonymousClass093 A03 = A03(UserJid.of(abstractC005302j), UserJid.of(A0A2), A05.A0E, A06);
                                    A02.A0I = A03.A0I;
                                    A02.A09 = A03.A09;
                                } else {
                                    throw null;
                                }
                            }
                            c0c9.A0P(anonymousClass094, A02);
                            return true;
                        }
                        return false;
                    } else if (str.equals("transaction")) {
                        AnonymousClass093 A04 = A04(A06);
                        if (A04.A0A == null && !TextUtils.isEmpty(A04.A0J)) {
                            AnonymousClass094 anonymousClass0942 = new AnonymousClass094(A04.A0A, A04.A0O, A04.A0J);
                            C0C9 c0c92 = this.A01;
                            AnonymousClass092 A052 = c0c92.A0H.A05(anonymousClass0942);
                            if (A052 != null) {
                                AnonymousClass093 anonymousClass0935 = A052.A0F;
                                if (anonymousClass0935 != null && !TextUtils.isEmpty(anonymousClass0935.A0K)) {
                                    A04.A0K = A052.A0F.A0K;
                                }
                                c0c92.A0P(anonymousClass0942, A04);
                                return true;
                            }
                        }
                        C0DV c0dv = this.A05;
                        c0dv.A04();
                        return c0dv.A07.A0k(A04.A0J, A04, anonymousClass093);
                    }
                }
            } catch (C0L4 | IOException e) {
                StringBuilder sb = new StringBuilder("PAY: PaymentsProtoParser deserializeProtocolNode: ");
                sb.append(e);
                Log.e(sb.toString());
            }
            return false;
        }
        return false;
    }
}
