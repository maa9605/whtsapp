package X;

import android.util.Base64;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.wamsys.JniBridge;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.2DZ */
/* loaded from: classes2.dex */
public abstract class C2DZ {
    public final CountDownLatch A00 = new CountDownLatch(1);
    public volatile Object A01;

    public static Object A00(C2DZ c2dz) {
        C0IX c0ix;
        InterfaceC19940wW interfaceC19940wW;
        int i;
        String str;
        int i2;
        int i3;
        int i4;
        String str2;
        String str3;
        try {
            if (!(c2dz instanceof C85303vB)) {
                if (!(c2dz instanceof C85283v9)) {
                    if (!(c2dz instanceof C85273v8)) {
                        if (!(c2dz instanceof C47912Db)) {
                            if (!(c2dz instanceof C85243v5)) {
                                if (!(c2dz instanceof C85223v3)) {
                                    final C2DY c2dy = (C2DY) c2dz;
                                    C05630Pm c05630Pm = c2dy.A00;
                                    AbstractC19910wT abstractC19910wT = new AbstractC19910wT() { // from class: X.3v1
                                        @Override // X.AbstractC19910wT
                                        public void A02(int i5, int i6, int i7, String str4, long j, int i8, int i9, long j2, long j3, long j4, String str5, String str6, long j5, long j6, boolean z, String str7) {
                                            C3Z1 c3z1;
                                            C47902Da c47902Da;
                                            C3Z2 c3z2 = C3Z2.ERROR_UNSPECIFIED;
                                            C3Z2 c3z22 = C3Z2.OK;
                                            C2DY c2dy2 = c2dy;
                                            C2DW c2dw = c2dy2.A01;
                                            if (c2dw != null) {
                                                C3Z2 c3z23 = c3z22;
                                                if (i5 != 1) {
                                                    c3z23 = i5 != 3 ? c3z2 : C3Z2.FAIL;
                                                }
                                                if (c3z23 == c3z2) {
                                                    C000200d.A0p("wamsys/registration/unknown-exist-status ", i5);
                                                }
                                                try {
                                                    if (c3z23 != c3z22) {
                                                        if (c2dw != null) {
                                                            if (i6 != 16) {
                                                                switch (i6) {
                                                                    case 1:
                                                                        c3z1 = C3Z1.INCORRECT;
                                                                        break;
                                                                    case 2:
                                                                        c3z1 = C3Z1.BLOCKED;
                                                                        break;
                                                                    case 3:
                                                                        c3z1 = C3Z1.LENGTH_LONG;
                                                                        break;
                                                                    case 4:
                                                                        c3z1 = C3Z1.LENGTH_SHORT;
                                                                        break;
                                                                    case 5:
                                                                        c3z1 = C3Z1.FORMAT_WRONG;
                                                                        break;
                                                                    case 6:
                                                                        c3z1 = C3Z1.TEMPORARILY_UNAVAILABLE;
                                                                        break;
                                                                    case 7:
                                                                        c3z1 = C3Z1.OLD_VERSION;
                                                                        break;
                                                                    default:
                                                                        switch (i6) {
                                                                            case 23:
                                                                                c3z1 = C3Z1.SECURITY_CODE;
                                                                                break;
                                                                            case 24:
                                                                                c3z1 = C3Z1.INVALID_SKEY_SIGNATURE;
                                                                                break;
                                                                            case 25:
                                                                                c3z1 = C3Z1.BIZ_NOT_ALLOWED;
                                                                                break;
                                                                            case 26:
                                                                                c3z1 = C3Z1.LIMITED_RELEASE;
                                                                                break;
                                                                            default:
                                                                                throw new IOException("fail, unknown reason");
                                                                        }
                                                                }
                                                            } else {
                                                                c3z1 = C3Z1.ERROR_BAD_TOKEN;
                                                            }
                                                            c47902Da = new C47902Da(c3z23, c3z1);
                                                            c47902Da.A05 = String.valueOf(j);
                                                            c47902Da.A01 = i8;
                                                            c47902Da.A00 = i9;
                                                            c47902Da.A06 = String.valueOf(j2);
                                                            c47902Da.A07 = String.valueOf(j3);
                                                            c47902Da.A03 = j4;
                                                            c47902Da.A09 = str5;
                                                            c47902Da.A08 = str6;
                                                            c47902Da.A04 = j5;
                                                            c47902Da.A02 = j6;
                                                            c47902Da.A0A = z;
                                                            if (str7 != null) {
                                                                c47902Da.A0B = Base64.decode(str7, 0);
                                                            }
                                                        } else {
                                                            throw null;
                                                        }
                                                    } else {
                                                        c47902Da = new C47902Da(c3z23, str4, i7 == 1);
                                                    }
                                                    ((C2DZ) c2dy2).A01 = c47902Da;
                                                    ((C2DZ) c2dy2).A00.countDown();
                                                    return;
                                                } catch (IOException unused) {
                                                    C000200d.A0p("wamsys/registration/unknown-exist-fail-reason ", i6);
                                                    ((C2DZ) c2dy2).A01 = null;
                                                    ((C2DZ) c2dy2).A00.countDown();
                                                    return;
                                                }
                                            }
                                            throw null;
                                        }
                                    };
                                    String str4 = c2dy.A02;
                                    String str5 = c2dy.A03;
                                    byte[] bArr = c2dy.A07;
                                    byte[] bArr2 = c2dy.A06;
                                    Map map = c2dy.A05;
                                    List list = c2dy.A04;
                                    if (c05630Pm.A00 != null) {
                                        JniBridge.jvidispatchIOOOOOOO(0, str4, str5, abstractC19910wT, bArr, bArr2, map, list);
                                    } else {
                                        throw null;
                                    }
                                } else {
                                    final C85223v3 c85223v3 = (C85223v3) c2dz;
                                    C05630Pm c05630Pm2 = c85223v3.A00;
                                    AbstractC19910wT abstractC19910wT2 = new AbstractC19910wT() { // from class: X.3v2
                                        @Override // X.AbstractC19910wT
                                        public void A04(int i5, int i6, String str6, int i7, long j, String str7, String str8, long j2, long j3, String str9, String str10, long j4, int i8, int i9, String str11) {
                                            C3Z5 c3z5;
                                            C3Z5 c3z52 = C3Z5.ERROR_UNSPECIFIED;
                                            C85223v3 c85223v32 = c85223v3;
                                            if (c85223v32.A01 != null) {
                                                if (i5 == 1) {
                                                    c3z5 = C3Z5.OK;
                                                } else if (i5 == 2) {
                                                    c3z5 = C3Z5.YES;
                                                } else if (i5 == 3) {
                                                    if (i6 == 2) {
                                                        c3z5 = C3Z5.ERROR_BLOCKED;
                                                    } else if (i6 == 26) {
                                                        c3z5 = C3Z5.ERROR_LIMITED_RELEASE;
                                                    } else if (i6 == 29) {
                                                        c3z5 = C3Z5.ERROR_FLASH_CALL_DISABLED;
                                                    } else if (i6 == 23) {
                                                        c3z5 = C3Z5.SECURITY_CODE;
                                                    } else if (i6 != 24) {
                                                        switch (i6) {
                                                            case 6:
                                                                c3z5 = C3Z5.ERROR_TEMPORARILY_UNAVAILABLE;
                                                                break;
                                                            case 7:
                                                                c3z5 = C3Z5.ERROR_OLD_VERSION;
                                                                break;
                                                            case 8:
                                                                c3z5 = C3Z5.ERROR_TOO_RECENT;
                                                                break;
                                                            case 9:
                                                                c3z5 = C3Z5.ERROR_TOO_MANY;
                                                                break;
                                                            case 10:
                                                                c3z5 = C3Z5.ERROR_NEXT_METHOD;
                                                                break;
                                                            case GoogleMigrateImporterActivity.A0E /* 11 */:
                                                                c3z5 = C3Z5.ERROR_TOO_MANY_GUESSES;
                                                                break;
                                                            case 12:
                                                                c3z5 = C3Z5.ERROR_BAD_PARAMETER;
                                                                break;
                                                            case 13:
                                                                c3z5 = C3Z5.ERROR_MISSING_PARAMETER;
                                                                break;
                                                            case 14:
                                                                c3z5 = C3Z5.ERROR_PROVIDER_TIMEOUT;
                                                                break;
                                                            case 15:
                                                                c3z5 = C3Z5.ERROR_PROVIDER_UNROUTABLE;
                                                                break;
                                                            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                                                                c3z5 = C3Z5.ERROR_BAD_TOKEN;
                                                                break;
                                                            case 17:
                                                                c3z5 = C3Z5.ERROR_TOO_MANY_ALL_METHODS;
                                                                break;
                                                            case 18:
                                                                c3z5 = C3Z5.ERROR_NO_ROUTES;
                                                                break;
                                                            default:
                                                                c3z5 = c3z52;
                                                                break;
                                                        }
                                                    } else {
                                                        c3z5 = C3Z5.ERROR_INVALID_SKEY_SIGNATURE;
                                                    }
                                                } else {
                                                    if (i5 == 4) {
                                                        c3z5 = C3Z5.YES_WITH_CODE;
                                                    }
                                                    c3z5 = c3z52;
                                                }
                                                if (c3z5 == c3z52) {
                                                    StringBuilder sb = new StringBuilder("wamsys/registration/request-code-status-unspecified; response-status ");
                                                    sb.append(i5);
                                                    sb.append(" failure-reason ");
                                                    sb.append(i6);
                                                    Log.e(sb.toString());
                                                }
                                                C3Z4 c3z4 = new C3Z4(c3z5);
                                                c3z4.A03 = i6;
                                                c3z4.A08 = str6;
                                                c3z4.A0G = i7 == 1;
                                                c3z4.A0B = String.valueOf(j);
                                                c3z4.A07 = str7;
                                                c3z4.A0A = str8;
                                                c3z4.A0C = String.valueOf(j2);
                                                c3z4.A0D = String.valueOf(j3);
                                                c3z4.A0F = str9;
                                                c3z4.A0E = str10;
                                                c3z4.A04 = j4;
                                                c3z4.A01 = i8;
                                                c3z4.A00 = i9;
                                                c3z4.A06 = str11;
                                                ((C2DZ) c85223v32).A01 = c3z4;
                                                ((C2DZ) c85223v32).A00.countDown();
                                                return;
                                            }
                                            throw null;
                                        }
                                    };
                                    String str6 = c85223v3.A03;
                                    String str7 = c85223v3.A04;
                                    byte[] bArr3 = c85223v3.A08;
                                    String str8 = c85223v3.A05;
                                    String str9 = c85223v3.A02;
                                    Map map2 = c85223v3.A07;
                                    List list2 = c85223v3.A06;
                                    if (c05630Pm2.A00 != null) {
                                        JniBridge.jvidispatchIOOOOOOOO(0, str6, str7, str8, str9, abstractC19910wT2, bArr3, map2, list2);
                                    } else {
                                        throw null;
                                    }
                                }
                            } else {
                                final C85243v5 c85243v5 = (C85243v5) c2dz;
                                C05630Pm c05630Pm3 = c85243v5.A00;
                                AbstractC19910wT abstractC19910wT3 = new AbstractC19910wT() { // from class: X.3v4
                                    @Override // X.AbstractC19910wT
                                    public void A03(int i5, int i6, int i7, String str10, long j, String str11, String str12, long j2, String str13, String str14, String str15) {
                                        C3Z7 c3z7;
                                        C3Z7 c3z72 = C3Z7.ERROR_UNSPECIFIED;
                                        C85243v5 c85243v52 = c85243v5;
                                        if (c85243v52.A01 != null) {
                                            if (i5 != 1) {
                                                if (i5 == 3) {
                                                    if (i6 == 2) {
                                                        c3z7 = C3Z7.FAIL_BLOCKED;
                                                    } else if (i6 == 6) {
                                                        c3z7 = C3Z7.FAIL_TEMPORARILY_UNAVAILABLE;
                                                    } else if (i6 == 11) {
                                                        c3z7 = C3Z7.FAIL_TOO_MANY_GUESSES;
                                                    } else if (i6 != 26) {
                                                        switch (i6) {
                                                            case 19:
                                                                c3z7 = C3Z7.FAIL_MISMATCH;
                                                                break;
                                                            case C0M6.A01 /* 20 */:
                                                                c3z7 = C3Z7.FAIL_GUESSED_TOO_FAST;
                                                                break;
                                                            case 21:
                                                                c3z7 = C3Z7.FAIL_MISSING;
                                                                break;
                                                            case 22:
                                                                c3z7 = C3Z7.FAIL_STALE;
                                                                break;
                                                            case 23:
                                                                c3z7 = C3Z7.SECURITY_CODE;
                                                                break;
                                                        }
                                                    } else {
                                                        c3z7 = C3Z7.ERROR_LIMITED_RELEASE;
                                                    }
                                                }
                                                c3z7 = c3z72;
                                            } else {
                                                c3z7 = C3Z7.YES;
                                            }
                                            if (c3z7 == c3z72) {
                                                StringBuilder sb = new StringBuilder("wamsys/registration/verify-code-status-unspecified; response-status ");
                                                sb.append(i5);
                                                sb.append(" failure-reason ");
                                                sb.append(i6);
                                                Log.e(sb.toString());
                                            }
                                            C3Z6 c3z6 = new C3Z6(c3z7);
                                            c3z6.A03 = str10;
                                            c3z6.A07 = i7 == 1;
                                            c3z6.A04 = String.valueOf(j);
                                            c3z6.A06 = str11;
                                            c3z6.A05 = str12;
                                            c3z6.A00 = j2;
                                            if (str13 != null) {
                                                c3z6.A08 = Base64.decode(str13, 0);
                                            }
                                            c3z6.A02 = str15;
                                            ((C2DZ) c85243v52).A01 = c3z6;
                                            ((C2DZ) c85243v52).A00.countDown();
                                            return;
                                        }
                                        throw null;
                                    }
                                };
                                String str10 = c85243v5.A04;
                                String str11 = c85243v5.A02;
                                String str12 = c85243v5.A03;
                                byte[] bArr4 = c85243v5.A07;
                                Map map3 = c85243v5.A06;
                                List list3 = c85243v5.A05;
                                if (c05630Pm3.A00 != null) {
                                    JniBridge.jvidispatchIOOOOOOO(1, str10, str11, str12, abstractC19910wT3, bArr4, map3, list3);
                                } else {
                                    throw null;
                                }
                            }
                        } else {
                            final C47912Db c47912Db = (C47912Db) c2dz;
                            C05630Pm c05630Pm4 = c47912Db.A01;
                            AbstractC19910wT abstractC19910wT4 = new AbstractC19910wT() { // from class: X.3v6
                                @Override // X.AbstractC19910wT
                                public void A01(int i5, int i6, int i7, String str13, int i8, long j, String str14, String str15, long j2, long j3, long j4, boolean z, int i9, String str16, String str17, String str18) {
                                    EnumC47932Dd enumC47932Dd;
                                    EnumC47932Dd enumC47932Dd2 = EnumC47932Dd.ERROR_UNSPECIFIED;
                                    C47912Db c47912Db2 = c47912Db;
                                    if (c47912Db2.A02 != null) {
                                        if (i5 != 1 && i5 != 2) {
                                            if (i5 == 3) {
                                                if (i6 == 1) {
                                                    enumC47932Dd = EnumC47932Dd.FAIL_INCORRECT;
                                                } else if (i6 == 2) {
                                                    enumC47932Dd = EnumC47932Dd.FAIL_BLOCKED;
                                                } else if (i6 == 6) {
                                                    enumC47932Dd = EnumC47932Dd.FAIL_TEMPORARILY_UNAVAILABLE;
                                                } else if (i6 == 11) {
                                                    enumC47932Dd = EnumC47932Dd.FAIL_TOO_MANY_GUESSES;
                                                } else if (i6 == 22) {
                                                    enumC47932Dd = EnumC47932Dd.FAIL_STALE;
                                                } else if (i6 == 28) {
                                                    enumC47932Dd = EnumC47932Dd.FAIL_RESET_TOO_SOON;
                                                } else if (i6 == 19) {
                                                    enumC47932Dd = EnumC47932Dd.FAIL_MISMATCH;
                                                } else if (i6 == 20) {
                                                    enumC47932Dd = EnumC47932Dd.FAIL_GUESSED_TOO_FAST;
                                                }
                                            }
                                            enumC47932Dd = enumC47932Dd2;
                                        } else {
                                            enumC47932Dd = EnumC47932Dd.YES;
                                        }
                                        if (enumC47932Dd == enumC47932Dd2) {
                                            StringBuilder sb = new StringBuilder("wamsys/registration/security-status-unspecified; response-status ");
                                            sb.append(i5);
                                            sb.append(" failure-reason ");
                                            sb.append(i6);
                                            Log.e(sb.toString());
                                        }
                                        C47922Dc c47922Dc = new C47922Dc(enumC47932Dd);
                                        c47922Dc.A06 = str13;
                                        c47922Dc.A09 = i7 == 1;
                                        c47922Dc.A05 = String.valueOf(i8);
                                        c47922Dc.A00 = j;
                                        c47922Dc.A08 = str14;
                                        c47922Dc.A07 = str15;
                                        c47922Dc.A02 = j2;
                                        c47922Dc.A01 = j3;
                                        c47922Dc.A0A = z;
                                        if (str18 != null) {
                                            c47922Dc.A0B = Base64.decode(str18, 0);
                                        }
                                        c47922Dc.A04 = str17;
                                        ((C2DZ) c47912Db2).A01 = c47922Dc;
                                        ((C2DZ) c47912Db2).A00.countDown();
                                        return;
                                    }
                                    throw null;
                                }
                            };
                            String str13 = c47912Db.A05;
                            int i5 = c47912Db.A00;
                            byte[] bArr5 = c47912Db.A09;
                            String str14 = c47912Db.A03;
                            String str15 = c47912Db.A04;
                            byte[] bArr6 = c47912Db.A08;
                            Map map4 = c47912Db.A07;
                            List list4 = c47912Db.A06;
                            if (c05630Pm4.A00 != null) {
                                JniBridge.jvidispatchIIOOOOOOOO(i5, str13, str14, str15, abstractC19910wT4, bArr5, bArr6, map4, list4);
                            } else {
                                throw null;
                            }
                        }
                    } else {
                        C85273v8 c85273v8 = (C85273v8) c2dz;
                        C05630Pm c05630Pm5 = c85273v8.A00;
                        AbstractC19910wT abstractC19910wT5 = new AbstractC19910wT() { // from class: X.3v7
                            @Override // X.AbstractC19910wT
                            public void A00(int i6, int i7) {
                                C000200d.A0t("wamsys/registration/send-funnel-log/status/", i6, "/failureReason/", i7);
                            }
                        };
                        String str16 = c85273v8.A03;
                        String str17 = c85273v8.A04;
                        byte[] bArr7 = c85273v8.A07;
                        String str18 = c85273v8.A02;
                        String str19 = c85273v8.A05;
                        String str20 = c85273v8.A01;
                        Map map5 = c85273v8.A06;
                        if (c05630Pm5.A00 != null) {
                            JniBridge.jvidispatchIOOOOOOOO(1, str16, str17, str18, str19, str20, abstractC19910wT5, bArr7, map5);
                        } else {
                            throw null;
                        }
                    }
                } else {
                    C85283v9 c85283v9 = (C85283v9) c2dz;
                    try {
                        C0IX c0ix2 = c85283v9.A02.A01;
                        InterfaceC19930wV interfaceC19930wV = c85283v9.A00;
                        C75113eN c75113eN = c85283v9.A01;
                        int i6 = c75113eN.A01;
                        int i7 = c75113eN.A00;
                        int i8 = c75113eN.A02;
                        String str21 = c75113eN.A07;
                        String str22 = c75113eN.A06;
                        String str23 = c75113eN.A04;
                        byte[] bArr8 = c75113eN.A09;
                        byte[] bArr9 = c75113eN.A08;
                        byte[] bArr10 = c75113eN.A0A;
                        String str24 = c75113eN.A03;
                        String str25 = c75113eN.A05;
                        if (c0ix2.A00 != null) {
                            JniBridge.jvidispatchIIIIOOOOOOOOO(i6, i7, i8, str21, str22, str23, str24, str25, interfaceC19930wV, bArr8, bArr9, bArr10);
                        } else {
                            throw null;
                        }
                    } catch (Exception unused) {
                        Log.e("Error: Could not enqueue download request in wa-msys");
                        ((C2DZ) c85283v9).A01 = new C04020Ic(17, null, false);
                        ((C2DZ) c85283v9).A00.countDown();
                    }
                }
                c2dz.A00.await();
                return c2dz.A01;
            }
            C85303vB c85303vB = (C85303vB) c2dz;
            try {
                c0ix = c85303vB.A02.A01;
                interfaceC19940wW = c85303vB.A00;
                C75123eO c75123eO = c85303vB.A01;
                i = c75123eO.A00;
                str = c75123eO.A05;
                i2 = c75123eO.A03;
                i3 = c75123eO.A02;
                i4 = c75123eO.A01;
                str2 = c75123eO.A06;
                str3 = c75123eO.A04;
            } catch (Exception unused2) {
                Log.e("Error : Could not enqueue upload request in wa-msys.");
                ((C2DZ) c85303vB).A01 = 23;
                ((C2DZ) c85303vB).A00.countDown();
            }
            if (c0ix.A00 != null) {
                JniBridge.jvidispatchIIIIIOOOO(i, i2, i3, i4, str, str2, str3, interfaceC19940wW);
                c2dz.A00.await();
                return c2dz.A01;
            }
            throw null;
        } catch (Exception e) {
            Log.e("AsyncRunnable/runAndWait", e);
            return null;
        }
        Log.e("AsyncRunnable/runAndWait", e);
        return null;
    }
}
