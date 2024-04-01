package X;

import android.text.TextUtils;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.SerializableLocation;
import com.whatsapp.SerializablePoint;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Ho */
/* loaded from: classes.dex */
public final class C0Ho {
    public static final Field A00;
    public static final Field A01;

    static {
        try {
            Field declaredField = C0AZ.class.getDeclaredField("unknownFields");
            A01 = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = C0Ab.class.getDeclaredField("count");
            A00 = declaredField2;
            declaredField2.setAccessible(true);
        } catch (NoSuchFieldException e) {
            Log.e("MessageUtil/isValidV2E2eMessage/error unknown-message-count, exception=", e);
            throw new AssertionError(e);
        }
    }

    public static int A00(C24D c24d) {
        EnumC55262k8 enumC55262k8 = EnumC55262k8.NONE;
        if ((c24d.A00 & 65536) == 65536) {
            EnumC55262k8 A002 = EnumC55262k8.A00(c24d.A01);
            if (A002 == null) {
                A002 = enumC55262k8;
            }
            int ordinal = A002.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        StringBuilder A0P = C000200d.A0P("MessageUtil/getGifAttribution/error: Unexpected gif attribution=");
                        if (A002 != null) {
                            enumC55262k8 = A002;
                        }
                        A0P.append(enumC55262k8);
                        Log.e(A0P.toString());
                        return 0;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }
        return 0;
    }

    public static int A01(C40531sQ c40531sQ) {
        try {
            return A00.getInt(A01.get(c40531sQ));
        } catch (IllegalAccessException e) {
            Log.e("MessageUtil/isValidV2E2eMessage/error unknown-message-count, exception=", e);
            throw new AssertionError(e);
        }
    }

    public static Pair A02(Jid jid, Jid jid2, DeviceJid deviceJid) {
        if (C003101m.A0U(jid) || C003101m.A0P(jid)) {
            if (deviceJid != null) {
                jid2 = deviceJid;
            }
        } else if (C003101m.A0P(jid2)) {
            if (deviceJid != null) {
                jid = deviceJid;
            }
            jid2 = jid;
            jid = jid2;
        } else if (deviceJid != null) {
            jid = deviceJid;
        }
        return new Pair(jid, jid2);
    }

    public static C40521sP A03(C40531sQ c40531sQ) {
        C40531sQ A06 = A06(c40531sQ);
        int i = A06.A00;
        if ((i & 8) == 8) {
            C2FQ A0n = A06.A0n();
            if ((A0n.A00 & 4) == 4) {
                return A0n.A0i();
            }
            return null;
        }
        if ((i & 16) == 16) {
            C48432Ff A11 = A06.A11();
            if ((A11.A04 & 2048) == 2048) {
                return A11.A0i();
            }
            return null;
        } else if ((i & 65536) == 65536) {
            C21Y A10 = A06.A10();
            if ((A10.A04 & 512) == 512) {
                return A10.A0i();
            }
            return null;
        } else {
            if ((i & 32) == 32) {
                C2FX A0r = A06.A0r();
                if ((A0r.A01 & 1024) == 1024) {
                    return A0r.A0i();
                }
                return null;
            }
            if ((i & 4) == 4) {
                AnonymousClass249 A0w = A06.A0w();
                if ((A0w.A00 & 4096) == 4096) {
                    return A0w.A0i();
                }
                return null;
            } else if ((i & 128) == 128) {
                C24C A0i = A06.A0i();
                if ((A0i.A00 & 1024) == 1024) {
                    return A0i.A0i();
                }
                return null;
            } else {
                if ((i & 256) == 256) {
                    C24D A1B = A06.A1B();
                    if ((A1B.A00 & 16384) == 16384) {
                        return A1B.A0i();
                    }
                    return null;
                } else if ((i & 64) == 64) {
                    C24B A0q = A06.A0q();
                    if ((A0q.A00 & 65536) == 65536) {
                        return A0q.A0i();
                    }
                    return null;
                } else {
                    if ((i & 4096) == 4096) {
                        C2FS A0o = A06.A0o();
                        if ((A0o.A00 & 2) == 2) {
                            return A0o.A0i();
                        }
                        return null;
                    } else if ((i & 2097152) == 2097152) {
                        C48572Ft A18 = A06.A18();
                        if ((A18.A00 & 16384) == 16384) {
                            return A18.A0i();
                        }
                        return null;
                    } else if ((i & 32768) == 32768) {
                        C48552Fr A17 = A06.A17();
                        if ((A17.A00 & 1) == 1) {
                            C40531sQ A0i2 = A17.A0i();
                            if ((A0i2.A00 & 32) == 32) {
                                C2FX A0r2 = A0i2.A0r();
                                if ((A0r2.A01 & 1024) == 1024) {
                                    return A0r2.A0i();
                                }
                                return null;
                            }
                            return null;
                        }
                        return null;
                    } else if ((i & C42271vT.A09) == 131072) {
                        C48532Fp A16 = A06.A16();
                        if ((A16.A00 & 1) == 1) {
                            C2FX A0r3 = A16.A0i().A0r();
                            if ((A0r3.A01 & 1024) == 1024) {
                                return A0r3.A0i();
                            }
                            return null;
                        }
                        return null;
                    } else if ((i & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216) {
                        C48492Fl A14 = A06.A14();
                        if ((A14.A00 & 8) == 8) {
                            return A14.A0i();
                        }
                        return null;
                    } else if ((i & 4194304) == 4194304) {
                        C2FZ A0u = A06.A0u();
                        if ((A0u.A00 & 64) == 64) {
                            return A0u.A0i();
                        }
                        return null;
                    } else if ((i & 8388608) == 8388608) {
                        C48592Fv A19 = A06.A19();
                        if ((A19.A00 & 4) == 4) {
                            return A19.A0i();
                        }
                        return null;
                    } else if ((i & 268435456) == 268435456) {
                        C40531sQ A0i3 = A06.A0t().A0i();
                        int i2 = A0i3.A00;
                        if ((i2 & 4) != 4) {
                            if ((i2 & 256) == 256) {
                                C24D A1B2 = A0i3.A1B();
                                if ((A1B2.A00 & 16384) == 16384) {
                                    return A1B2.A0i();
                                }
                                return null;
                            }
                            return null;
                        }
                        AnonymousClass249 A0w2 = A0i3.A0w();
                        if ((A0w2.A00 & 4096) == 4096) {
                            return A0w2.A0i();
                        }
                        return null;
                    } else if ((i & 536870912) == 536870912) {
                        C48452Fh A12 = A06.A12();
                        if ((A12.A00 & 2048) == 2048) {
                            return A12.A0i();
                        }
                        return null;
                    } else if ((i & 1073741824) == 1073741824) {
                        C48412Fd A0z = A06.A0z();
                        if ((A0z.A00 & 8) == 8) {
                            return A0z.A0i();
                        }
                        return null;
                    } else {
                        int i3 = A06.A01;
                        if ((i3 & 2) == 2) {
                            C2FI A0j = A06.A0j();
                            if ((A0j.A00 & 128) == 128) {
                                return A0j.A0i();
                            }
                            return null;
                        } else if ((i3 & 4) == 4) {
                            C2FK A0k = A06.A0k();
                            if ((A0k.A00 & 4) == 4) {
                                return A0k.A0i();
                            }
                            return null;
                        } else if ((i & 134217728) == 134217728) {
                            C48402Fc A0y = A06.A0y();
                            if ((A0y.A00 & 64) == 64) {
                                return A0y.A0i();
                            }
                            return null;
                        } else {
                            return null;
                        }
                    }
                }
            }
        }
    }

    public static EnumC55262k8 A04(C09H c09h) {
        int i = c09h.A05;
        if (i != 1) {
            if (i != 2) {
                return EnumC55262k8.NONE;
            }
            return EnumC55262k8.TENOR;
        }
        return EnumC55262k8.GIPHY;
    }

    public static C40531sQ A05(C40531sQ c40531sQ) {
        int i = c40531sQ.A00;
        if ((i & 268435456) == 268435456) {
            return c40531sQ.A0t().A0i();
        }
        if ((i & EditorInfoCompat.IME_FLAG_FORCE_ASCII) == Integer.MIN_VALUE) {
            return c40531sQ.A0s().A0i();
        }
        return null;
    }

    public static C40531sQ A06(C40531sQ c40531sQ) {
        if ((c40531sQ.A00 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) == Integer.MIN_VALUE) {
            c40531sQ = c40531sQ.A0s().A0i();
        }
        C40531sQ A05 = A05(c40531sQ);
        return A05 != null ? A05 : c40531sQ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:405:0x000e, code lost:
        if (r62 != false) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x01db, code lost:
        if (r7 == 2) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x0387, code lost:
        if (r55 != null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x050f, code lost:
        if (r0 == null) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x0610, code lost:
        if (X.C50322Rg.A02.contains(r10.A0j().A01) != false) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x0612, code lost:
        r0 = new X.C0KT(r56, r58, r52.A0B(), 2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:485:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:763:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:765:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:796:0x0620 A[EDGE_INSN: B:796:0x0620->B:684:0x0620 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v100, types: [X.0KT] */
    /* JADX WARN: Type inference failed for: r0v103, types: [X.0KT] */
    /* JADX WARN: Type inference failed for: r0v104, types: [X.0LU] */
    /* JADX WARN: Type inference failed for: r0v105, types: [X.0LU] */
    /* JADX WARN: Type inference failed for: r0v106, types: [X.0LN] */
    /* JADX WARN: Type inference failed for: r0v107, types: [X.0Ky] */
    /* JADX WARN: Type inference failed for: r0v111, types: [X.0fC] */
    /* JADX WARN: Type inference failed for: r0v113, types: [X.0Iu] */
    /* JADX WARN: Type inference failed for: r0v118, types: [X.092] */
    /* JADX WARN: Type inference failed for: r0v120, types: [X.0JJ, X.092] */
    /* JADX WARN: Type inference failed for: r0v124, types: [X.092] */
    /* JADX WARN: Type inference failed for: r0v126, types: [X.0JJ, X.092] */
    /* JADX WARN: Type inference failed for: r0v128, types: [X.0Ie] */
    /* JADX WARN: Type inference failed for: r0v131, types: [X.0LS] */
    /* JADX WARN: Type inference failed for: r0v134, types: [X.0LQ] */
    /* JADX WARN: Type inference failed for: r0v138, types: [X.2UF] */
    /* JADX WARN: Type inference failed for: r0v140, types: [X.1zz] */
    /* JADX WARN: Type inference failed for: r0v142, types: [X.1zr] */
    /* JADX WARN: Type inference failed for: r0v144, types: [X.0KU] */
    /* JADX WARN: Type inference failed for: r0v147, types: [X.0Hn] */
    /* JADX WARN: Type inference failed for: r0v148, types: [X.0DA] */
    /* JADX WARN: Type inference failed for: r0v150, types: [X.09E] */
    /* JADX WARN: Type inference failed for: r0v154, types: [X.0JP] */
    /* JADX WARN: Type inference failed for: r0v156, types: [X.09A] */
    /* JADX WARN: Type inference failed for: r0v157, types: [X.0LO] */
    /* JADX WARN: Type inference failed for: r0v158, types: [X.09G] */
    /* JADX WARN: Type inference failed for: r0v161, types: [X.095] */
    /* JADX WARN: Type inference failed for: r0v163, types: [X.09D] */
    /* JADX WARN: Type inference failed for: r0v165, types: [X.0JJ] */
    /* JADX WARN: Type inference failed for: r0v166, types: [X.0KC] */
    /* JADX WARN: Type inference failed for: r0v167, types: [X.0LP] */
    /* JADX WARN: Type inference failed for: r0v168, types: [X.0D8] */
    /* JADX WARN: Type inference failed for: r0v169, types: [X.092] */
    /* JADX WARN: Type inference failed for: r0v170, types: [X.0JJ] */
    /* JADX WARN: Type inference failed for: r0v171 */
    /* JADX WARN: Type inference failed for: r0v172 */
    /* JADX WARN: Type inference failed for: r0v173 */
    /* JADX WARN: Type inference failed for: r0v174 */
    /* JADX WARN: Type inference failed for: r0v175 */
    /* JADX WARN: Type inference failed for: r0v176 */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.0KT] */
    /* JADX WARN: Type inference failed for: r0v46, types: [X.0KT] */
    /* JADX WARN: Type inference failed for: r0v58, types: [X.092] */
    /* JADX WARN: Type inference failed for: r0v62, types: [X.0KT] */
    /* JADX WARN: Type inference failed for: r0v85, types: [X.0fU] */
    /* JADX WARN: Type inference failed for: r0v88, types: [X.092] */
    /* JADX WARN: Type inference failed for: r0v93, types: [X.0KT] */
    /* JADX WARN: Type inference failed for: r0v94, types: [X.0Pa] */
    /* JADX WARN: Type inference failed for: r0v97, types: [X.0LV] */
    /* JADX WARN: Type inference failed for: r0v98, types: [X.0PX] */
    /* JADX WARN: Type inference failed for: r47v0, types: [X.02L] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.AnonymousClass092 A07(X.C001200o r42, X.AbstractC000600i r43, X.C002301c r44, X.C05W r45, X.C06K r46, X.C02L r47, X.C003701t r48, X.C01B r49, X.C05U r50, X.C0DV r51, X.C40531sQ r52, X.C40521sP r53, X.C013606n r54, X.AnonymousClass093 r55, X.AnonymousClass094 r56, X.AbstractC005302j r57, long r58, boolean r60, boolean r61, boolean r62, int r63) {
        /*
            Method dump skipped, instructions count: 2009
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Ho.A07(X.00o, X.00i, X.01c, X.05W, X.06K, X.02L, X.01t, X.01B, X.05U, X.0DV, X.1sQ, X.1sP, X.06n, X.093, X.094, X.02j, long, boolean, boolean, boolean, int):X.092");
    }

    public static AnonymousClass092 A08(C05U c05u, AnonymousClass092 anonymousClass092) {
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0I;
        if (anonymousClass094 != null) {
            return c05u.A02(anonymousClass094, anonymousClass092.A0E, anonymousClass092.A0m);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x00ab, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00af, code lost:
        r0 = r3.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00c3, code lost:
        return r12.A0A(com.google.android.search.verification.client.R.plurals.n_contacts_message_title, r0, java.lang.Integer.valueOf(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A09(X.C002301c r12, X.C0DA r13) {
        /*
            java.util.List r3 = r13.A18()
            int r8 = r3.size()
            r6 = 1
            int r8 = r8 - r6
            r5 = 0
            r2 = 0
        Lc:
            int r0 = r3.size()
            r9 = 2
            r7 = 0
            if (r2 >= r0) goto Laf
            r0 = 100
            if (r2 >= r0) goto Laf
            java.lang.Object r0 = r3.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lab
            X.1x9 r0 = X.C04110Ip.A04(r0)
            if (r0 == 0) goto Lab
            java.util.ArrayList r0 = r0.A02
            java.util.Iterator r11 = r0.iterator()
        L2c:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lab
            java.lang.Object r4 = r11.next()
            X.2kL r4 = (X.C55392kL) r4
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r4.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2c
            java.lang.String r0 = "N"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L90
            java.util.List r4 = r4.A03
            int r10 = r4.size()
            if (r10 <= r6) goto L90
            r4.get(r5)
            java.lang.Object r7 = r4.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            if (r10 <= r9) goto L6c
            java.lang.Object r0 = r4.get(r9)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L6c
            r4.get(r9)
        L6c:
            r1 = 3
            if (r10 <= r1) goto L7e
            java.lang.Object r0 = r4.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L7e
            r4.get(r1)
        L7e:
            r1 = 4
            if (r10 <= r1) goto L90
            java.lang.Object r0 = r4.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L90
            r4.get(r1)
        L90:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L2c
            if (r7 == 0) goto Lab
            r4 = 2131755032(0x7f100018, float:1.9140932E38)
            long r2 = (long) r8
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r5] = r7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1[r6] = r0
            java.lang.String r0 = r12.A0A(r4, r2, r1)
            return r0
        Lab:
            int r2 = r2 + 1
            goto Lc
        Laf:
            int r0 = r3.size()
            r4 = 2131755124(0x7f100074, float:1.9141118E38)
            long r2 = (long) r0
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r5] = r0
            java.lang.String r0 = r12.A0A(r4, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Ho.A09(X.01c, X.0DA):java.lang.String");
    }

    public static String A0A(C40531sQ c40531sQ) {
        C0CX<C53522h3> c0cx;
        if ((c40531sQ.A01 & 2) != 2 || (c0cx = c40531sQ.A0j().A03) == null) {
            return null;
        }
        for (C53522h3 c53522h3 : c0cx) {
            if ((c53522h3.A00 & 8) == 8) {
                return c53522h3.A0j().A01;
            }
        }
        return null;
    }

    public static List A0B(C09H c09h) {
        int length;
        InteractiveAnnotation[] interactiveAnnotationArr = c09h.A0V;
        if (interactiveAnnotationArr != null && (length = interactiveAnnotationArr.length) > 0) {
            ArrayList arrayList = new ArrayList(length);
            for (InteractiveAnnotation interactiveAnnotation : interactiveAnnotationArr) {
                C0CT AVX = C55402kM.A04.AVX();
                int i = 0;
                while (true) {
                    SerializablePoint[] serializablePointArr = interactiveAnnotation.polygonVertices;
                    if (i < serializablePointArr.length) {
                        if (serializablePointArr[i] != null) {
                            C0CT AVX2 = C55412kN.A05.AVX();
                            double d = interactiveAnnotation.polygonVertices[i].x;
                            AVX2.A02();
                            C55412kN c55412kN = (C55412kN) AVX2.A00;
                            c55412kN.A02 |= 4;
                            c55412kN.A00 = d;
                            double d2 = interactiveAnnotation.polygonVertices[i].y;
                            AVX2.A02();
                            C55412kN c55412kN2 = (C55412kN) AVX2.A00;
                            c55412kN2.A02 |= 8;
                            c55412kN2.A01 = d2;
                            AVX.A02();
                            C55402kM.A09((C55402kM) AVX.A00, (C55412kN) AVX2.A01());
                        }
                        i++;
                    }
                }
                C0CT AVX3 = C55422kO.A04.AVX();
                double d3 = interactiveAnnotation.serializableLocation.latitude;
                AVX3.A02();
                C55422kO c55422kO = (C55422kO) AVX3.A00;
                c55422kO.A02 |= 1;
                c55422kO.A00 = d3;
                double d4 = interactiveAnnotation.serializableLocation.longitude;
                AVX3.A02();
                C55422kO c55422kO2 = (C55422kO) AVX3.A00;
                c55422kO2.A02 |= 2;
                c55422kO2.A01 = d4;
                String str = interactiveAnnotation.serializableLocation.name;
                AVX3.A02();
                C55422kO.A09((C55422kO) AVX3.A00, str);
                C0AZ A012 = AVX3.A01();
                AVX.A02();
                C55402kM c55402kM = (C55402kM) AVX.A00;
                c55402kM.A03 = A012;
                c55402kM.A00 = 2;
                arrayList.add(AVX.A01());
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public static List A0C(C40531sQ c40531sQ) {
        ArrayList arrayList = new ArrayList();
        int A012 = A01(c40531sQ);
        for (int i = 0; i < A012; i++) {
            arrayList.add(0);
        }
        int i2 = c40531sQ.A00;
        if ((i2 & 8) == 8) {
            arrayList.add(1);
        }
        if ((i2 & 1) == 1) {
            arrayList.add(2);
        }
        if ((i2 & 4) == 4) {
            arrayList.add(3);
        }
        if ((i2 & 16) == 16) {
            arrayList.add(4);
        }
        if ((i2 & 65536) == 65536) {
            arrayList.add(5);
        }
        if ((i2 & 32) == 32) {
            arrayList.add(6);
        }
        if ((i2 & 64) == 64) {
            arrayList.add(7);
        }
        if ((i2 & 128) == 128) {
            arrayList.add(8);
        }
        if ((i2 & 256) == 256) {
            arrayList.add(9);
        }
        if ((i2 & 1024) == 1024) {
            arrayList.add(10);
        }
        if ((i2 & 2048) == 2048) {
            arrayList.add(11);
        }
        if ((i2 & 4096) == 4096) {
            arrayList.add(12);
        }
        if ((i2 & 8192) == 8192) {
            arrayList.add(13);
        }
        if ((i2 & 32768) == 32768) {
            arrayList.add(14);
        }
        if ((i2 & C42271vT.A09) == 131072) {
            arrayList.add(15);
        }
        if ((i2 & 2097152) == 2097152) {
            arrayList.add(16);
        }
        if ((i2 & 262144) == 262144) {
            arrayList.add(17);
        }
        if ((i2 & 524288) == 524288) {
            arrayList.add(18);
        }
        if ((i2 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 16777216) {
            arrayList.add(19);
        }
        if ((i2 & 134217728) == 134217728) {
            arrayList.add(20);
        }
        if ((i2 & 536870912) == 536870912) {
            arrayList.add(21);
        }
        if ((i2 & 4194304) == 4194304) {
            arrayList.add(22);
        }
        if ((i2 & 1048576) == 1048576) {
            arrayList.add(23);
        }
        if ((i2 & 8388608) == 8388608) {
            arrayList.add(24);
        }
        if ((i2 & 268435456) == 268435456) {
            arrayList.add(25);
        }
        if ((i2 & 1073741824) == 1073741824) {
            arrayList.add(26);
        }
        if ((i2 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) == Integer.MIN_VALUE) {
            arrayList.add(27);
        }
        int i3 = c40531sQ.A01;
        if ((i3 & 1) == 1) {
            arrayList.add(28);
        }
        if ((i3 & 2) == 2) {
            arrayList.add(29);
        }
        if ((i3 & 4) == 4) {
            arrayList.add(30);
        }
        if ((i3 & 8) == 8) {
            arrayList.add(31);
        }
        return arrayList;
    }

    public static void A0D(C09H c09h, List list) {
        if (list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C55402kM c55402kM = (C55402kM) it.next();
                SerializablePoint[] serializablePointArr = new SerializablePoint[c55402kM.A02.size()];
                for (int i = 0; i < c55402kM.A02.size(); i++) {
                    C55412kN c55412kN = (C55412kN) c55402kM.A02.get(i);
                    int i2 = c55412kN.A02;
                    if ((i2 & 1) != 1 && (i2 & 2) != 2) {
                        serializablePointArr[i] = new SerializablePoint(c55412kN.A00, c55412kN.A01);
                    } else {
                        Log.i("MessageUtils/buildE2eMessage/info contains deprecated point");
                        break;
                    }
                }
                C55422kO A0i = c55402kM.A0i();
                arrayList.add(new InteractiveAnnotation(serializablePointArr, new SerializableLocation(A0i.A00, A0i.A01, A0i.A03)));
            }
            c09h.A0V = (InteractiveAnnotation[]) arrayList.toArray(new InteractiveAnnotation[0]);
        }
    }

    public static void A0E(C001200o c001200o, AbstractC000600i abstractC000600i, C002301c c002301c, C05W c05w, C06K c06k, C02L c02l, C003701t c003701t, C01B c01b, C05U c05u, C0DV c0dv, C013606n c013606n, C40521sP c40521sP, AnonymousClass094 anonymousClass094, boolean z, AnonymousClass092 anonymousClass092) {
        UserJid of;
        AbstractC005302j abstractC005302j;
        int i;
        int i2;
        if (anonymousClass092 != null && c40521sP != null) {
            int i3 = c40521sP.A00;
            if ((i3 & 256) == 256 && c40521sP.A0G) {
                anonymousClass092.A0U(1);
                if ((i3 & 128) == 128) {
                    i2 = Math.max(1, c40521sP.A03);
                } else {
                    i2 = 1;
                }
                anonymousClass092.A03 = i2;
            }
            if ((i3 & 2048) == 2048) {
                anonymousClass092.A0V(c40521sP.A02);
                if ((i3 & 4096) == 4096 && C003101m.A0b(anonymousClass094.A00)) {
                    anonymousClass092.A0j(Long.valueOf(c40521sP.A04 * 1000));
                }
            }
            if ((c40521sP.A00 & 16384) == 16384) {
                C40561sT A0i = c40521sP.A0i();
                String str = A0i.A09;
                String str2 = A0i.A03;
                EnumC40571sU A002 = EnumC40571sU.A00(A0i.A01);
                if (A002 == null) {
                    A002 = EnumC40571sU.NONE;
                }
                if (A002 == EnumC40571sU.IMAGE) {
                    i = 1;
                } else {
                    i = 0;
                    if (A002 == EnumC40571sU.VIDEO) {
                        i = 2;
                    }
                }
                anonymousClass092.A0H = new C0CZ(str, str2, i, A0i.A08, A0i.A04, A0i.A02.A06(), null, A0i.A06, A0i.A05, A0i.A07);
                anonymousClass092.A0U(1024);
            }
            anonymousClass092.A0v(C003101m.A0F(UserJid.class, c40521sP.A07));
            if (z) {
                GroupJid nullable = GroupJid.getNullable(c40521sP.A0E);
                int i4 = c40521sP.A00;
                int i5 = i4 & 4;
                if (!(i5 == 4) && (i4 & 8) == 8 && nullable != null) {
                    anonymousClass092.A0g(C05U.A00(nullable, 0L));
                } else if (i5 != 4) {
                } else {
                    if ((i4 & 2) == 2) {
                        DeviceJid nullable2 = DeviceJid.getNullable(c40521sP.A0D);
                        of = nullable2 == null ? null : nullable2.userJid;
                    } else {
                        AbstractC005302j A0A = anonymousClass092.A0A();
                        if (A0A == null) {
                            of = UserJid.of(anonymousClass092.A0n.A00);
                        } else {
                            of = UserJid.of(A0A);
                        }
                    }
                    if ((c40521sP.A00 & 8) == 8) {
                        abstractC005302j = AbstractC005302j.A02(c40521sP.A0E);
                    } else {
                        abstractC005302j = anonymousClass092.A0n.A00;
                    }
                    boolean A0A2 = c02l.A0A(of);
                    try {
                        C40531sQ A0j = c40521sP.A0j();
                        AnonymousClass094 anonymousClass0942 = new AnonymousClass094(abstractC005302j, A0A2, c40521sP.A0F);
                        if (!A0M(A0j, c01b, c003701t)) {
                            AnonymousClass092 A07 = A07(c001200o, abstractC000600i, c002301c, c05w, c06k, c02l, c003701t, c01b, c05u, c0dv, A0j, A03(A0j), c013606n, null, anonymousClass0942, of, 0L, false, true, true, 0);
                            if (!A0A2) {
                                if (of != null) {
                                    A07.A0d(of);
                                } else {
                                    throw new C011305p("null jid not from me");
                                }
                            }
                            if (A07.A0m == 0 && A07.A0G() == null && A07.A0b == null) {
                                return;
                            }
                            A07.A0Z(2);
                            anonymousClass092.A0g(A07);
                            return;
                        }
                        throw new C22W(18);
                    } catch (C011305p | C22W e) {
                        Log.w("MessageUtils/buildContextInfo/error quoted message was malformed, exception=", e);
                    }
                }
            }
        }
    }

    public static void A0F(C07910aI c07910aI, C07860aD c07860aD, int i) {
        if (c07860aD != null) {
            c07860aD.A02 = false;
        }
        if (c07910aI != null) {
            c07910aI.A00 = Boolean.FALSE;
            c07910aI.A04 = Integer.valueOf(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0093, code lost:
        if (r0 != 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0G(X.C40541sR r15, X.AnonymousClass295 r16) {
        /*
            r9 = r16
            if (r16 != 0) goto L5
            return
        L5:
            X.0AZ r0 = r15.A00
            X.1sQ r0 = (X.C40531sQ) r0
            X.2G0 r0 = r0.A1C()
            X.0CT r5 = r0.AVX()
            X.2Fz r5 = (X.C48632Fz) r5
            X.0AZ r0 = r5.A00
            X.2G0 r0 = (X.C2G0) r0
            X.2kP r0 = r0.A0i()
            X.0CT r7 = r0.AVX()
            X.2kQ r7 = (X.C55442kQ) r7
            X.0AN r11 = r9.A03
            if (r11 == 0) goto L2f
            r7.A02()
            X.0AZ r0 = r7.A00
            X.2kP r0 = (X.C55432kP) r0
            X.C55432kP.A09(r0, r11)
        L2f:
            X.0AN r10 = r9.A02
            if (r10 == 0) goto L3d
            r7.A02()
            X.0AZ r0 = r7.A00
            X.2kP r0 = (X.C55432kP) r0
            X.C55432kP.A0A(r0, r10)
        L3d:
            long r3 = r9.A01
            r6 = 2
            r13 = 0
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 == 0) goto L54
            r7.A02()
            X.0AZ r1 = r7.A00
            X.2kP r1 = (X.C55432kP) r1
            int r0 = r1.A00
            r0 = r0 | r6
            r1.A00 = r0
            r1.A04 = r3
        L54:
            long r1 = r9.A00
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto L69
            r7.A02()
            X.0AZ r8 = r7.A00
            X.2kP r8 = (X.C55432kP) r8
            int r0 = r8.A00
            r0 = r0 | 8
            r8.A00 = r0
            r8.A03 = r1
        L69:
            java.util.Set r9 = r9.A04
            if (r9 == 0) goto L88
            r7.A02()
            X.0AZ r12 = r7.A00
            X.2kP r12 = (X.C55432kP) r12
            X.0O0 r8 = r12.A07
            r0 = r8
            X.0CY r0 = (X.C0CY) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L83
            X.0O0 r0 = X.C0AZ.A04(r8)
            r12.A07 = r0
        L83:
            X.0O0 r0 = r12.A07
            X.C0Aa.A08(r9, r0)
        L88:
            if (r11 != 0) goto L95
            if (r10 != 0) goto L95
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 != 0) goto L95
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L96
        L95:
            r1 = 1
        L96:
            java.lang.String r0 = "Invalid adv device metadata"
            X.C000700j.A0A(r1, r0)
            r5.A02()
            X.0AZ r0 = r5.A00
            X.2G0 r0 = (X.C2G0) r0
            X.C2G0.A09(r0, r7)
            r5.A02()
            X.0AZ r1 = r5.A00
            X.2G0 r1 = (X.C2G0) r1
            int r0 = r1.A00
            r0 = r0 | r6
            r1.A00 = r0
            r1.A01 = r6
            r15.A02()
            X.0AZ r0 = r15.A00
            X.1sQ r0 = (X.C40531sQ) r0
            X.C40531sQ.A0f(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Ho.A0G(X.1sR, X.295):void");
    }

    public static void A0H(C48612Fx c48612Fx, String str, boolean z) {
        if (!z) {
            if (c48612Fx.A01 != 1) {
                throw new C22W(0);
            }
        } else if ((c48612Fx.A00 & 8) != 8) {
            throw new C22W(0);
        }
        if (!z) {
            C55452kR A0i = c48612Fx.A0i();
            if (A0i.A0k() == EnumC55462kS.HIGHLY_STRUCTURED_MESSAGE) {
                A0K(str, A0i.A0j());
            }
            if ((A0i.A00 & 32) == 32) {
                A0K(str, A0i.A0i());
                if ((A0i.A00 & 64) == 64) {
                    A0K(str, A0i.A0i());
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("MessageUtils/validateTemplateMessage/error no content for template message, message key=");
            sb.append(str);
            Log.e(sb.toString());
            throw new C22W(0);
        }
        C53432gu A0j = c48612Fx.A0j();
        if (A0j.A0i() == EnumC55472kT.HYDRATED_TITLE_TEXT && A0j.A01 != 2) {
            StringBuilder sb2 = new StringBuilder("MessageUtil/validateHydratedTemplateMessage/error no title with text title, message key=");
            sb2.append(str);
            Log.w(sb2.toString());
            throw new C22W(0);
        } else if ((A0j.A00 & 32) == 32) {
        } else {
            StringBuilder sb3 = new StringBuilder("MessageUtil/validateHydratedTemplateMessage/error no content, message key=");
            sb3.append(str);
            Log.w(sb3.toString());
            throw new C22W(0);
        }
    }

    public static void A0I(C40531sQ c40531sQ, String str) {
        if ((c40531sQ.A00 & 8192) == 8192) {
            A0K(str, c40531sQ.A0v());
            return;
        }
        throw new C22W(0);
    }

    public static void A0J(AnonymousClass097 anonymousClass097, C09H c09h, byte[] bArr) {
        int length = bArr.length;
        if (length == 32) {
            C42621w3 A03 = C42041uv.A03(C002701i.A1Y(bArr, C0DC.A02(anonymousClass097).A03, 80));
            c09h.A0U = bArr;
            c09h.A0Q = A03.A00;
            c09h.A0S = A03.A02;
            c09h.A0T = A03.A01;
            return;
        }
        StringBuilder A0P = C000200d.A0P("MessageUtils/setMediaKeyForMediaData/media key incorrect length; length=");
        A0P.append(length);
        A0P.append("; message.key=");
        A0P.append(anonymousClass097.A0n);
        Log.w(A0P.toString());
        throw new C22W(16);
    }

    public static void A0K(String str, C2G3 c2g3) {
        if ((c2g3.A00 & 1) == 1 && !TextUtils.isEmpty(c2g3.A09)) {
            if ((c2g3.A00 & 2) != 2 || TextUtils.isEmpty(c2g3.A06)) {
                StringBuilder sb = new StringBuilder("MessageUtil/validateHSM/error missing element for hsm, message.key");
                sb.append(str);
                Log.w(sb.toString());
                throw new C22W(21);
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("MessageUtil/validateHSM/error missing namespace for hsm, message.key=");
        sb2.append(str);
        Log.w(sb2.toString());
        throw new C22W(20);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x001a, code lost:
        if ((r5 & 268435456) == 268435456) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0L(X.AbstractC000600i r9, X.C40531sQ r10, java.util.List r11) {
        /*
            X.1sQ r3 = A05(r10)
            r8 = 0
            r2 = 1
            r6 = 2
            if (r3 == 0) goto L82
            int r1 = r10.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r4
            r0 = 0
            if (r1 != r4) goto L12
            r0 = 1
        L12:
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            if (r0 != 0) goto L4e
            int r5 = r3.A00
            r0 = r5 & r7
            if (r0 != r7) goto L4e
        L1c:
            java.lang.String r0 = "outer.hasEphemeralMessage="
            java.lang.StringBuilder r3 = X.C000200d.A0P(r0)
            r0 = 0
            if (r1 != r4) goto L26
            r0 = 1
        L26:
            r3.append(r0)
            java.lang.String r0 = ", inner.hasViewOnceMessage="
            r3.append(r0)
            r1 = r5 & r7
            r0 = 0
            if (r1 != r7) goto L34
            r0 = 1
        L34:
            r3.append(r0)
            java.lang.String r0 = ", inner.hasEphemeralMessage="
            r3.append(r0)
            r5 = r5 & r4
            r0 = 0
            if (r5 != r4) goto L41
            r0 = 1
        L41:
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "isValidMessage/futureproof/type"
            r9.A09(r0, r1, r2)
            return r8
        L4e:
            int r5 = r3.A00
            r0 = r5 & r4
            if (r0 == r4) goto L1c
            r4 = 16384(0x4000, float:2.2959E-41)
            r3 = r5 & r6
            if (r3 == r6) goto L5e
            r0 = r5 & r4
            if (r0 != r4) goto L82
        L5e:
            java.lang.String r0 = "hasSenderKeyDistributionMessage="
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            r0 = 0
            if (r3 != r6) goto L68
            r0 = 1
        L68:
            r1.append(r0)
            java.lang.String r0 = ", hasFastRatchetKeySenderKeyDistributionMessage="
            r1.append(r0)
            r5 = r5 & r4
            r0 = 0
            if (r5 != r4) goto L75
            r0 = 1
        L75:
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "isValidMessage/futureproof/key"
            r9.A09(r0, r1, r2)
            return r8
        L82:
            int r0 = r11.size()
            if (r0 == r2) goto L8f
            if (r0 != 0) goto L91
            int r0 = r10.A00
            r0 = r0 & r6
            if (r0 != r6) goto L91
        L8f:
            r8 = 1
            return r8
        L91:
            java.lang.String r1 = "MessageTypes="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "isValidMessage/numtype"
            r9.A09(r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Ho.A0L(X.00i, X.1sQ, java.util.List):boolean");
    }

    public static boolean A0M(C40531sQ c40531sQ, C01B c01b, C003701t c003701t) {
        int A012 = A01(c40531sQ);
        if (A012 > 0) {
            C000200d.A0p("MessageUtil/isUnknown/unknown tags=", A012);
            return true;
        } else if ((c40531sQ.A00 & 268435456) == 268435456 && !c01b.A0E(C01C.A2U)) {
            Log.e("MessageUtil/isUnknown/viewOnce");
            return true;
        } else {
            int i = c40531sQ.A00;
            if ((i & EditorInfoCompat.IME_FLAG_FORCE_ASCII) == Integer.MIN_VALUE) {
                if (c01b.A0E(C01C.A0n)) {
                    C40531sQ A0i = c40531sQ.A0s().A0i();
                    if ((A0i.A00 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) == Integer.MIN_VALUE) {
                        Log.e("MessageUtil/isUnknown/recursiveEphemeralMessage");
                        return true;
                    }
                    return A0M(A0i, c01b, c003701t);
                }
                Log.e("MessageUtil/isUnknown/ephemeralMessage");
                return true;
            }
            if ((i & 134217728) == 134217728) {
                if (c40531sQ.A0y().A0j() == EnumC55362kI.SINGLE_SELECT && c01b.A0E(C01C.A1I)) {
                    Log.e("MessageUtil/isUnknown/listMessage single select");
                    return true;
                } else if (c40531sQ.A0y().A0j() == EnumC55362kI.PRODUCT_LIST && c003701t.A0C(385)) {
                    Log.e("MessageUtil/isUnknown/listMessage product list");
                    return true;
                }
            }
            if ((c40531sQ.A01 & 2) == 2 && c003701t.A0C(362)) {
                Log.e("MessageUtil/isUnknown/buttonsMessage");
                return true;
            } else if ("novi_hub".equals(A0A(c40531sQ)) && c003701t.A0C(509)) {
                Log.e("MessageUtil/isUnknown/nativeFlowNoviHubMessage");
                return true;
            } else {
                int i2 = c40531sQ.A01;
                if ((i2 & 1) == 1) {
                    Log.e("MessageUtil/isUnknown/invoiceMessage");
                    return true;
                } else if ((i2 & 8) == 8) {
                    Log.e("MessageUtil/isUnknown/paymentInviteMessage");
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    public static boolean A0N(AnonymousClass092 anonymousClass092) {
        byte b = anonymousClass092.A0m;
        return b == 11 || b == 31;
    }

    public static byte[] A0O(byte[] bArr, C07910aI c07910aI, C07860aD c07860aD) {
        int length;
        if (bArr != null && (length = bArr.length) != 0) {
            int i = bArr[length - 1] & 255;
            if (i == 0) {
                Log.w("MessageUtil/removePadding/ axolotl derived plaintext has invalid padding");
                A0F(c07910aI, c07860aD, 10);
                return null;
            } else if (i >= length) {
                Log.w("MessageUtil/removePadding/ axolotl derived entire plaintext as padding");
                A0F(c07910aI, c07860aD, 10);
                return null;
            } else {
                int i2 = length - i;
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, 0, bArr2, 0, i2);
                return bArr2;
            }
        }
        Log.w("MessageUtil/removePadding/ axolotl derived null or empty plaintext from message");
        return null;
    }
}
