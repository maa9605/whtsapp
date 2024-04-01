package X;

import android.content.Intent;
import android.util.Pair;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.service.MDSyncService;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.3FJ */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3FJ implements C0CG {
    public final /* synthetic */ C04130Ir A00;
    public final /* synthetic */ C41771uU A01;
    public final /* synthetic */ C454622d A02;

    public /* synthetic */ C3FJ(C41771uU c41771uU, C04130Ir c04130Ir, C454622d c454622d) {
        this.A01 = c41771uU;
        this.A00 = c04130Ir;
        this.A02 = c454622d;
    }

    @Override // X.C0CG
    public final void A54(Object obj) {
        boolean z;
        String str;
        C456422x c456422x;
        int i;
        long j;
        Long l;
        Long l2;
        int i2;
        C41771uU c41771uU = this.A01;
        C04130Ir c04130Ir = this.A00;
        C454622d c454622d = this.A02;
        Integer num = (Integer) obj;
        CopyOnWriteArrayList copyOnWriteArrayList = c04130Ir.A01;
        copyOnWriteArrayList.size();
        int A00 = c454622d.A01().A00();
        C456322w c456322w = (C456322w) c454622d.A0G.A00();
        if (c456322w != null) {
            final C48292Er c48292Er = c41771uU.A0A;
            C48292Er.A01(c456322w, c04130Ir, new InterfaceC48332Ev() { // from class: X.3F0
                /* JADX WARN: Code restructure failed: missing block: B:198:0x0014, code lost:
                    if (r0 != false) goto L171;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:208:0x002a, code lost:
                    if (r0 != false) goto L167;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:316:0x0131, code lost:
                    if (r2 == 22) goto L142;
                 */
                @Override // X.InterfaceC48332Ev
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final boolean A5T(java.lang.Object r6, X.AnonymousClass097 r7, X.C09H r8) {
                    /*
                        Method dump skipped, instructions count: 338
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C3F0.A5T(java.lang.Object, X.097, X.09H):boolean");
                }
            });
        }
        C456322w c456322w2 = (C456322w) c454622d.A0D.A00();
        if (c456322w2 != null) {
            final C48292Er c48292Er2 = c41771uU.A0A;
            C48292Er.A01(c456322w2, c04130Ir, new InterfaceC48332Ev() { // from class: X.3Ex
                /* JADX WARN: Code restructure failed: missing block: B:60:0x0036, code lost:
                    if (r0 != false) goto L39;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x004c, code lost:
                    if (r0 != false) goto L35;
                 */
                @Override // X.InterfaceC48332Ev
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final boolean A5T(java.lang.Object r7, X.AnonymousClass097 r8, X.C09H r9) {
                    /*
                        r6 = this;
                        X.2Er r5 = r1
                        X.22w r7 = (X.C456322w) r7
                        X.01t r4 = r5.A02
                        X.094 r0 = r8.A0n
                        X.02j r0 = r0.A00
                        boolean r0 = X.C003101m.A0Z(r0)
                        boolean r0 = X.C0DB.A0Q(r4, r8, r0)
                        if (r0 != 0) goto L16
                        r0 = 1
                        return r0
                    L16:
                        X.23G r3 = r7.A02
                        X.0Pk r2 = r8.A0N
                        if (r2 != 0) goto L28
                        X.0Pk r2 = new X.0Pk
                        r2.<init>()
                        r8.A0N = r2
                        r0 = 2048(0x800, float:2.87E-42)
                        r8.A0U(r0)
                    L28:
                        java.lang.String r0 = r3.A04()
                        if (r0 != 0) goto L38
                        monitor-enter(r3)
                        boolean r0 = r3.A0D     // Catch: java.lang.Throwable -> L32
                        goto L35
                    L32:
                        r0 = move-exception
                        monitor-exit(r3)
                        throw r0
                    L35:
                        monitor-exit(r3)
                        if (r0 == 0) goto L3e
                    L38:
                        java.lang.String r0 = r3.A04()
                        r2.A04 = r0
                    L3e:
                        java.lang.String r0 = r3.A05()
                        if (r0 != 0) goto L4e
                        monitor-enter(r3)
                        boolean r0 = r3.A0E     // Catch: java.lang.Throwable -> L48
                        goto L4b
                    L48:
                        r0 = move-exception
                        monitor-exit(r3)
                        throw r0
                    L4b:
                        monitor-exit(r3)
                        if (r0 == 0) goto L54
                    L4e:
                        java.lang.String r0 = r3.A05()
                        r2.A05 = r0
                    L54:
                        X.1xh r0 = r3.A00()
                        if (r0 == 0) goto L6a
                        X.1xh r0 = r3.A00()
                        byte[] r0 = r0.A01
                        r2.A07 = r0
                        X.1xh r0 = r3.A00()
                        long r0 = r0.A00
                        r2.A02 = r0
                    L6a:
                        int r0 = r7.A00
                        if (r0 != 0) goto L80
                        java.lang.String r0 = r3.A03()
                        if (r0 == 0) goto L80
                        X.1xI r1 = r5.A03
                        java.lang.String r0 = r3.A03()
                        java.lang.String r0 = r1.A01(r0)
                        r2.A03 = r0
                    L80:
                        boolean r0 = X.C0DB.A0P(r4, r8)
                        r2.A09 = r0
                        r0 = 1
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C67283Ex.A5T(java.lang.Object, X.097, X.09H):boolean");
                }
            });
        }
        Object A002 = c454622d.A04.A00();
        if (A002 != null) {
            final C48292Er c48292Er3 = c41771uU.A0A;
            C48292Er.A01(A002, c04130Ir, new InterfaceC48332Ev() { // from class: X.3FL
                @Override // X.InterfaceC48332Ev
                public final boolean A5T(Object obj2, AnonymousClass097 anonymousClass097, C09H c09h) {
                    C23J c23j = (C23J) obj2;
                    C05610Pk c05610Pk = anonymousClass097.A0N;
                    if (c05610Pk == null) {
                        c05610Pk = new C05610Pk();
                        anonymousClass097.A0N = c05610Pk;
                        anonymousClass097.A0U(2048);
                    }
                    c05610Pk.A08 = c23j.A02;
                    Pair pair = c23j.A01;
                    if (pair != null) {
                        c05610Pk.A01 = ((Number) pair.first).intValue();
                        c05610Pk.A00 = ((Number) pair.second).intValue();
                        return true;
                    }
                    return true;
                }
            });
        }
        final C48292Er c48292Er4 = c41771uU.A0A;
        int intValue = num.intValue();
        C48292Er.A01(Integer.valueOf(intValue), c04130Ir, new InterfaceC48332Ev() { // from class: X.3FO
            @Override // X.InterfaceC48332Ev
            public final boolean A5T(Object obj2, AnonymousClass097 anonymousClass097, C09H c09h) {
                int intValue2 = ((Number) obj2).intValue();
                c09h.A0a = false;
                if (intValue2 == 0) {
                    c09h.A0P = true;
                }
                return true;
            }
        });
        Iterator it = copyOnWriteArrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                if (C003101m.A0U(((AnonymousClass092) it.next()).A0n.A00)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        C48302Es c48302Es = c41771uU.A0G;
        C22a c22a = c454622d.A0K.A02;
        boolean z2 = c22a.A01;
        int i3 = 3;
        Long l3 = null;
        l3 = null;
        if (A00 != 0 && A00 != 2) {
            if (c456322w == null) {
                StringBuilder sb = new StringBuilder("mediauploadresponseprocessor/processUploadResponse/not regular upload, but upload response is null: uploadType=");
                sb.append(A00);
                sb.append("; result=");
                sb.append(intValue);
                Log.e(sb.toString());
            } else if (A00 == 1) {
                C67443Fn c67443Fn = (C67443Fn) c456322w.A01;
                C23G c23g = c456322w.A02;
                AnonymousClass097 A003 = c04130Ir.A00();
                StringBuilder A0P = C000200d.A0P("webmediareupload/end ");
                AnonymousClass094 anonymousClass094 = A003.A0n;
                A0P.append(anonymousClass094);
                A0P.append(" result:");
                A0P.append(intValue);
                Log.i(A0P.toString());
                if (intValue == 0) {
                    StringBuilder A0P2 = C000200d.A0P("webmediareupload/success ");
                    A0P2.append(anonymousClass094);
                    A0P2.append(" ");
                    A0P2.append(c23g.A06());
                    Log.i(A0P2.toString());
                    c48302Es.A08.A01(c67443Fn.A00, new C27g(c48302Es.A00, c48302Es.A03, c23g.A06(), c23g.A00() != null ? c23g.A00().A01 : null, c23g.A03(), c23g.A04()), 5);
                    c48302Es.A05.A0W(A003, -1);
                } else {
                    c48302Es.A08.A01(c67443Fn.A00, new C27g(c48302Es.A00, c48302Es.A03, 502), 5);
                }
            } else if (A00 == 3) {
                AnonymousClass097 A004 = c04130Ir.A00();
                C67433Fm c67433Fm = (C67433Fm) c456322w.A01;
                C41501u1 c41501u1 = c48302Es.A06;
                if (intValue != 0) {
                    i2 = 2;
                    if (intValue != 7) {
                        i2 = 0;
                    }
                } else {
                    i2 = 1;
                }
                Jid jid = c67433Fm.A01;
                c41501u1.A02(A004, i2, jid, A004.A0n.A01, c67433Fm.A00, c67433Fm.A03, c67433Fm.A02, c456322w.A02.A03());
                if (c48302Es.A02.A0A(jid)) {
                    c48302Es.A09.A03(c48302Es.A04.A00, MDSyncService.class, new Intent("com.whatsapp.service.MDSyncService.RMR_COMPLETED"));
                }
                if (intValue == 0) {
                    c48302Es.A05.A0W(A004, -1);
                }
            }
        } else {
            int i4 = intValue == 0 ? 2 : 0;
            C02L c02l = c48302Es.A02;
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) it2.next();
                if (!C0DB.A0J(c02l, anonymousClass092)) {
                    if (i4 == 0) {
                        anonymousClass092.A08 = 0;
                    } else {
                        anonymousClass092.A0Y(i4);
                    }
                }
            }
            if (intValue != 21) {
                switch (intValue) {
                    case 2:
                        c48302Es.A01.A05(R.string.error_no_disc_space, 0);
                        break;
                    case 3:
                        c48302Es.A01.A07(R.string.share_failed, 0);
                        break;
                    case 4:
                        c48302Es.A01.A05(R.string.error_out_of_memory, 0);
                        break;
                    case 5:
                        byte b = c04130Ir.A00().A0m;
                        C018508q c018508q = c48302Es.A01;
                        if (b == 1) {
                            c018508q.A05(R.string.error_file_is_not_a_image, 0);
                            break;
                        } else {
                            c018508q.A05(R.string.error_bad_media, 0);
                            break;
                        }
                    case 6:
                        c48302Es.A01.A05(R.string.no_access_permission, 0);
                        break;
                    case 7:
                        c48302Es.A01.A05(c48302Es.A0B.A01(), 0);
                        break;
                }
            } else if (z2) {
                c48302Es.A01.A07(R.string.share_file_format_unsupport, 0);
            }
            if (c04130Ir.A04()) {
                if (c456322w != null && (c456422x = c456322w.A01.A04) != null) {
                    l3 = c456422x.A0E;
                }
                C2EQ c2eq = c48302Es.A0A;
                AnonymousClass097 A005 = c04130Ir.A00();
                long longValue = l3 != null ? l3.longValue() : 0L;
                if (intValue == 0) {
                    i3 = 1;
                } else if (intValue == 1) {
                    i3 = 2;
                }
                c2eq.A05(A005, longValue, i3);
            }
            for (AnonymousClass097 anonymousClass097 : Collections.unmodifiableList(copyOnWriteArrayList)) {
                if (i4 == 2) {
                    C09H c09h = anonymousClass097.A02;
                    if (c09h != null) {
                        if (anonymousClass097.A09 == null) {
                            C000200d.A1M(C000200d.A0P("mediauploadresponseprocessor/uploaded, but url is null for "), anonymousClass097.A0n.A01);
                        }
                        if (anonymousClass097.A01 <= 0) {
                            File file = c09h.A0F;
                            if (file != null) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(file);
                                sb2.append("; exists=");
                                sb2.append(c09h.A0F.exists());
                                sb2.append("; size=");
                                sb2.append(c09h.A0F.length());
                                str = sb2.toString();
                            } else {
                                str = "null";
                            }
                            StringBuilder A0P3 = C000200d.A0P("mediauploadresponseprocessor/uploaded, but mediaSize=");
                            A0P3.append(anonymousClass097.A01);
                            A0P3.append("; file=");
                            A0P3.append(str);
                            A0P3.append("; msg=");
                            C000200d.A1M(A0P3, anonymousClass097.A0n.A01);
                        }
                    } else {
                        throw null;
                    }
                }
                c48302Es.A05.A0W(anonymousClass097, i4 == 2 ? 1 : -1);
                if (i4 != 2) {
                    c48302Es.A07.A02(anonymousClass097);
                }
            }
        }
        c41771uU.A05(c04130Ir, null);
        if (c22a.A00) {
            i = 4;
        } else {
            i = 2;
            if (z) {
                i = 3;
            }
        }
        AnonymousClass011 anonymousClass011 = c41771uU.A08;
        C44551zG c44551zG = c41771uU.A09;
        anonymousClass011.A0B(c44551zG.A04(c454622d, c454622d.A00, i), null, false);
        AnonymousClass234 anonymousClass234 = c454622d.A01;
        if (anonymousClass234 != null && c456322w2 != null) {
            C04140Is c04140Is = anonymousClass234.A00;
            C22v c22v = anonymousClass234.A01;
            anonymousClass011.A0B(c44551zG.A03(c04140Is, c22v, c456322w2, c456322w2.A00, i, c22v.A00()), null, false);
        }
        int A04 = C0E3.A04(c04130Ir.A00(), c41771uU.A06);
        C456422x c456422x2 = c454622d.A01().A04;
        if (c456422x2 != null && (l = c456422x2.A08) != null) {
            j = l.longValue();
            C456622z c456622z = c456422x2.A01;
            if (c456622z != null && (l2 = c456622z.A02) != null) {
                j -= l2.longValue();
            }
        } else {
            j = 0;
        }
        c41771uU.A0I.AS1(new RunnableC62882yi(c41771uU, j, c454622d, z, num, A04, c04130Ir));
        c454622d.A04();
    }
}
