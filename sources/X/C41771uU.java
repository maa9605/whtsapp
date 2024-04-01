package X;

import android.net.Uri;
import android.util.Pair;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1uU */
/* loaded from: classes2.dex */
public class C41771uU {
    public static volatile C41771uU A0M;
    public final C018508q A00;
    public final C02L A01;
    public final C0E3 A02;
    public final AnonymousClass012 A03;
    public final C0C9 A04;
    public final C00A A05;
    public final C0ED A06;
    public final C003701t A07;
    public final AnonymousClass011 A08;
    public final C44551zG A09;
    public final C48292Er A0A;
    public final C43131wu A0B;
    public final C48282Eq A0C;
    public final C455322l A0D;
    public final C43091wq A0E;
    public final C455422m A0F;
    public final C48302Es A0G;
    public final C47892Cz A0H;
    public final InterfaceC002901k A0I;
    public final Object A0J = new Object();
    public final WeakHashMap A0K = new WeakHashMap();
    public final Executor A0L;

    public C41771uU(AnonymousClass012 anonymousClass012, C003701t c003701t, C018508q c018508q, C02L c02l, InterfaceC002901k interfaceC002901k, AnonymousClass011 anonymousClass011, C455322l c455322l, C0ED c0ed, C0E3 c0e3, C43091wq c43091wq, C44551zG c44551zG, C0C9 c0c9, C455422m c455422m, C00A c00a, C48282Eq c48282Eq, C43131wu c43131wu, C47892Cz c47892Cz, C48292Er c48292Er, C48302Es c48302Es) {
        this.A03 = anonymousClass012;
        this.A07 = c003701t;
        this.A00 = c018508q;
        this.A01 = c02l;
        this.A0I = interfaceC002901k;
        this.A08 = anonymousClass011;
        this.A0D = c455322l;
        this.A06 = c0ed;
        this.A02 = c0e3;
        this.A0E = c43091wq;
        this.A09 = c44551zG;
        this.A04 = c0c9;
        this.A0F = c455422m;
        this.A05 = c00a;
        this.A0C = c48282Eq;
        this.A0B = c43131wu;
        this.A0H = c47892Cz;
        this.A0A = c48292Er;
        this.A0G = c48302Es;
        this.A0L = new ExecutorC43191x0(c018508q);
    }

    public static C41771uU A00() {
        if (A0M == null) {
            synchronized (C41771uU.class) {
                if (A0M == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C003701t A002 = C003701t.A00();
                    C42461vm.A00();
                    C018508q A003 = C018508q.A00();
                    C02L A004 = C02L.A00();
                    InterfaceC002901k A005 = C002801j.A00();
                    AnonymousClass011 A006 = AnonymousClass011.A00();
                    C455322l A007 = C455322l.A00();
                    C0E6.A00();
                    C0ED A01 = C0ED.A01();
                    C0E3 A06 = C0E3.A06();
                    C43091wq A012 = C43091wq.A01();
                    C44551zG A008 = C44551zG.A00();
                    C0C9 A009 = C0C9.A00();
                    C455422m A0010 = C455422m.A00();
                    C00A c00a = C00A.A00;
                    if (C48282Eq.A02 == null) {
                        synchronized (C48282Eq.class) {
                            if (C48282Eq.A02 == null) {
                                C48282Eq.A02 = new C48282Eq(AnonymousClass012.A00(), C43121wt.A00());
                            }
                        }
                    }
                    C48282Eq c48282Eq = C48282Eq.A02;
                    C43131wu A0011 = C43131wu.A00();
                    C47892Cz A0012 = C47892Cz.A00();
                    if (C48292Er.A07 == null) {
                        synchronized (C48292Er.class) {
                            if (C48292Er.A07 == null) {
                                C48292Er.A07 = new C48292Er(C003701t.A00(), C02L.A00(), C41961un.A0S(), C43371xI.A00(), C42471vn.A01(), C0GT.A00(), C0F2.A00());
                            }
                        }
                    }
                    C48292Er c48292Er = C48292Er.A07;
                    if (C48302Es.A0E == null) {
                        synchronized (C48302Es.class) {
                            if (C48302Es.A0E == null) {
                                C48302Es.A0E = new C48302Es(C001200o.A01, C42461vm.A00(), C018508q.A00(), AbstractC000600i.A00(), C02L.A00(), C01B.A00(), C0C9.A00(), C0ER.A00(), C451720r.A00(), C2EQ.A00(), C47892Cz.A00(), C41501u1.A00());
                            }
                        }
                    }
                    A0M = new C41771uU(A00, A002, A003, A004, A005, A006, A007, A01, A06, A012, A008, A009, A0010, c00a, c48282Eq, A0011, A0012, c48292Er, C48302Es.A0E);
                }
            }
        }
        return A0M;
    }

    public final C04130Ir A01(AnonymousClass097 anonymousClass097) {
        synchronized (this.A0J) {
            for (Map.Entry entry : this.A0K.entrySet()) {
                boolean z = false;
                if (((C04130Ir) entry.getKey()).A01(anonymousClass097.A0n) != null) {
                    z = true;
                    continue;
                }
                if (z) {
                    return (C04130Ir) entry.getKey();
                }
            }
            return null;
        }
    }

    public C454622d A02(C04130Ir c04130Ir) {
        C454622d c454622d;
        synchronized (this.A0J) {
            c454622d = (C454622d) this.A0K.get(c04130Ir);
        }
        return c454622d;
    }

    public C454622d A03(AnonymousClass097 anonymousClass097) {
        return A02(A01(anonymousClass097));
    }

    public void A04(long j, C454622d c454622d, boolean z, Integer num, int i, C04130Ir c04130Ir) {
        int i2;
        if (j > 0) {
            if (c454622d.A0K.A02.A00) {
                i2 = 3;
            } else {
                i2 = 1;
                if (z) {
                    i2 = 2;
                }
            }
            C43131wu c43131wu = this.A0B;
            double d = j;
            boolean z2 = num.intValue() == 0;
            synchronized (c43131wu) {
                long A02 = c43131wu.A02();
                int A01 = c43131wu.A01();
                C25B A022 = c43131wu.A03.A02(A02, i, A01, i2, false);
                double d2 = A022.A01;
                Double.isNaN(d2);
                Double.isNaN(d2);
                Double.isNaN(d);
                A022.A01 = (long) (d2 + d);
                if (z2) {
                    A022.A07++;
                }
                c43131wu.A03.A03(A02, i, A01, i2, false, A022);
            }
        }
        if (num.intValue() == 0) {
            for (AnonymousClass092 anonymousClass092 : Collections.unmodifiableList(c04130Ir.A01)) {
                this.A0B.A05(C0E3.A02(anonymousClass092), i);
            }
            if (this.A07.A0C(475)) {
                if (c454622d.A01().A00() == 1 || c454622d.A01().A00() == 3) {
                    C48282Eq c48282Eq = this.A0C;
                    C04140Is A00 = c454622d.A00();
                    A00.A05 = c48282Eq.A00.A01();
                    c48282Eq.A01.A05(A00);
                }
            }
        }
    }

    public final void A05(C04130Ir c04130Ir, C454622d c454622d) {
        synchronized (this.A0J) {
            if (c454622d == null) {
                this.A0K.remove(c04130Ir);
            } else {
                this.A0K.put(c04130Ir, c454622d);
            }
        }
    }

    public void A06(C04130Ir c04130Ir, C22a c22a, C22e c22e, AnonymousClass097 anonymousClass097, boolean z, boolean z2, byte[] bArr) {
        C454622d c454622d;
        if (anonymousClass097 == null || (c454622d = A02(A01(anonymousClass097))) == null) {
            c454622d = (C454622d) c22e;
        }
        this.A0L.execute(new RunnableEBaseShape2S0200000_I0_2(this, c04130Ir, 47));
        this.A0I.AS1(new RunnableC62872yh(this, c454622d, c04130Ir, c22a, z2, z, bArr));
    }

    public void A07(final C454622d c454622d, final C04130Ir c04130Ir) {
        c04130Ir.A02();
        A05(c04130Ir, c454622d);
        c454622d.A0S = "mms";
        C0CG c0cg = new C0CG() { // from class: X.3FH
            {
                C41771uU.this = this;
            }

            @Override // X.C0CG
            public final void A54(Object obj) {
                C41771uU c41771uU = C41771uU.this;
                C04130Ir c04130Ir2 = c04130Ir;
                CopyOnWriteArrayList copyOnWriteArrayList = c04130Ir2.A01;
                copyOnWriteArrayList.size();
                final C48292Er c48292Er = c41771uU.A0A;
                C48292Er.A01(obj, c04130Ir2, new InterfaceC48332Ev() { // from class: X.3Ey
                    @Override // X.InterfaceC48332Ev
                    public final boolean A5T(Object obj2, AnonymousClass097 anonymousClass097, C09H c09h) {
                        String str = (String) obj2;
                        if (c48292Er != null) {
                            c09h.A0I = str;
                            return true;
                        }
                        throw null;
                    }
                });
                c41771uU.A05.A06(copyOnWriteArrayList, -1);
            }
        };
        Executor executor = this.A0L;
        c454622d.A08.A03(c0cg, executor);
        c454622d.A06.A03(new C0CG() { // from class: X.3FG
            {
                C41771uU.this = this;
            }

            @Override // X.C0CG
            public final void A54(Object obj) {
                C41771uU c41771uU = C41771uU.this;
                C04130Ir c04130Ir2 = c04130Ir;
                AtomicInteger atomicInteger = (AtomicInteger) obj;
                if (c41771uU.A0A != null) {
                    atomicInteger.addAndGet(c04130Ir2.A01.size());
                    return;
                }
                throw null;
            }
        }, null);
        c454622d.A07.A03(new C0CG() { // from class: X.3FD
            {
                C41771uU.this = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:109:0x00aa, code lost:
                if (r1.A0T(r7) == false) goto L54;
             */
            @Override // X.C0CG
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void A54(java.lang.Object r16) {
                /*
                    r15 = this;
                    r2 = r16
                    X.1uU r0 = X.C41771uU.this
                    X.0Ir r10 = r2
                    X.0KW r2 = (X.C0KW) r2
                    java.util.concurrent.CopyOnWriteArrayList r11 = r10.A01
                    r11.size()
                    java.io.File r9 = r2.A01
                    X.2Er r3 = r0.A0A
                    r14 = 0
                    if (r3 == 0) goto Lbd
                    X.097 r1 = r10.A00()
                    monitor-enter(r1)
                    X.097 r0 = r10.A00()     // Catch: java.lang.Throwable -> Lba
                    X.09H r0 = r0.A02     // Catch: java.lang.Throwable -> Lba
                    if (r0 == 0) goto Lb9
                    java.io.File r7 = r0.A0F     // Catch: java.lang.Throwable -> Lba
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> Lba
                    int r6 = r11.size()
                    java.util.concurrent.atomic.AtomicInteger r0 = r2.A03
                    r0.addAndGet(r6)
                    boolean r0 = r9.equals(r7)
                    r5 = 0
                    r1 = 1
                    if (r0 == 0) goto L3b
                    java.util.concurrent.atomic.AtomicBoolean r0 = r2.A02
                    r0.set(r1)
                L3a:
                    return
                L3b:
                    if (r6 == 0) goto L3a
                    X.0F2 r4 = r3.A01
                    java.util.concurrent.atomic.AtomicBoolean r0 = r2.A02
                    boolean r1 = r0.getAndSet(r1)
                    boolean r0 = r4.A0A(r9)
                    if (r0 == 0) goto L4e
                    r4.A08(r9, r6, r1)
                L4e:
                    long r2 = r2.A00
                    r12 = 0
                    int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
                    if (r0 != 0) goto L6a
                    java.lang.String r0 = "sendmediamessagemanager/applyMediaFileReference file size from reference is 0.  filesize computed from file is = "
                    java.lang.StringBuilder r8 = X.C000200d.A0P(r0)
                    long r0 = r9.length()
                    r8.append(r0)
                    java.lang.String r0 = r8.toString()
                    com.whatsapp.util.Log.e(r0)
                L6a:
                    java.util.List r0 = java.util.Collections.unmodifiableList(r11)
                    java.util.Iterator r8 = r0.iterator()
                L72:
                    boolean r0 = r8.hasNext()
                    if (r0 == 0) goto L89
                    java.lang.Object r1 = r8.next()
                    X.097 r1 = (X.AnonymousClass097) r1
                    monitor-enter(r1)
                    X.09H r0 = r1.A02     // Catch: java.lang.Throwable -> L95
                    if (r0 == 0) goto L94
                    r0.A0F = r9     // Catch: java.lang.Throwable -> L95
                    r1.A01 = r2     // Catch: java.lang.Throwable -> L95
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L95
                    goto L72
                L89:
                    if (r7 == 0) goto L3a
                    X.097 r0 = r10.A00()
                    byte r2 = r0.A0m
                    if (r4 == 0) goto Lb8
                    goto L98
                L94:
                    throw r14     // Catch: java.lang.Throwable -> L95
                L95:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L95
                    throw r0
                L98:
                    X.05w r1 = r4.A01     // Catch: java.io.IOException -> Lae
                    boolean r0 = r1.A0S(r7)     // Catch: java.io.IOException -> Lae
                    if (r0 != 0) goto Lac
                    boolean r0 = r1.A0R(r7)     // Catch: java.io.IOException -> Lae
                    if (r0 == 0) goto Lb4
                    boolean r0 = r1.A0T(r7)     // Catch: java.io.IOException -> Lae
                    if (r0 != 0) goto Lb4
                Lac:
                    r5 = 1
                    goto Lb4
                Lae:
                    r1 = move-exception
                    java.lang.String r0 = "ReferenceCountedFileManager/isPrivateManagedMediaFile "
                    com.whatsapp.util.Log.e(r0, r1)
                Lb4:
                    r4.A01(r7, r2, r5, r6)
                    return
                Lb8:
                    throw r14
                Lb9:
                    throw r14     // Catch: java.lang.Throwable -> Lba
                Lba:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> Lba
                    throw r0
                Lbd:
                    throw r14
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C3FD.A54(java.lang.Object):void");
            }
        }, null);
        c454622d.A0B.A03(new C0CG() { // from class: X.2Et
            public int A00 = -1;
            public int A01;

            {
                C41771uU.this = this;
            }

            @Override // X.C0CG
            public void A54(Object obj) {
                Number number = (Number) obj;
                int intValue = number.intValue();
                if (intValue != this.A00) {
                    this.A00 = intValue;
                    if (intValue >= this.A01 + 5) {
                        this.A01 = intValue;
                        c04130Ir.A01.size();
                    }
                    C41771uU c41771uU = C41771uU.this;
                    final C48292Er c48292Er = c41771uU.A0A;
                    C04130Ir c04130Ir2 = c04130Ir;
                    if (C48292Er.A01(number, c04130Ir2, new InterfaceC48332Ev() { // from class: X.3F8
                        @Override // X.InterfaceC48332Ev
                        public final boolean A5T(Object obj2, AnonymousClass097 anonymousClass097, C09H c09h) {
                            Number number2 = (Number) obj2;
                            if (anonymousClass097.A0m != 1) {
                                long j = c09h.A0C;
                                long intValue2 = number2.intValue();
                                r5 = j != intValue2;
                                c09h.A0C = intValue2;
                            }
                            return r5;
                        }
                    })) {
                        c41771uU.A05.A06(c04130Ir2.A01, 8);
                    }
                }
            }
        }, executor);
        c454622d.A0A.A03(new C0CG() { // from class: X.3FI
            {
                C41771uU.this = this;
            }

            @Override // X.C0CG
            public final void A54(Object obj) {
                C41771uU c41771uU = C41771uU.this;
                C04130Ir c04130Ir2 = c04130Ir;
                CopyOnWriteArrayList copyOnWriteArrayList = c04130Ir2.A01;
                copyOnWriteArrayList.size();
                final C48292Er c48292Er = c41771uU.A0A;
                C48292Er.A01(obj, c04130Ir2, new InterfaceC48332Ev() { // from class: X.3Ew
                    @Override // X.InterfaceC48332Ev
                    public final boolean A5T(Object obj2, AnonymousClass097 anonymousClass097, C09H c09h) {
                        C2z6 c2z6 = (C2z6) obj2;
                        c09h.A0F = c2z6.A01;
                        anonymousClass097.A08 = c2z6.A02;
                        anonymousClass097.A01 = c2z6.A00;
                        if (anonymousClass097.A0E() != null) {
                            anonymousClass097.A0E().A03(c2z6.A03);
                            return true;
                        }
                        return true;
                    }
                });
                c41771uU.A05.A06(copyOnWriteArrayList, -1);
            }
        }, executor);
        c454622d.A0C.A03(new C0CG() { // from class: X.3F9
            {
                C41771uU.this = this;
            }

            @Override // X.C0CG
            public final void A54(Object obj) {
                C41771uU c41771uU = C41771uU.this;
                C04130Ir c04130Ir2 = c04130Ir;
                CopyOnWriteArrayList copyOnWriteArrayList = c04130Ir2.A01;
                copyOnWriteArrayList.size();
                final C48292Er c48292Er = c41771uU.A0A;
                C48292Er.A01(obj, c04130Ir2, new InterfaceC48332Ev() { // from class: X.3FM
                    @Override // X.InterfaceC48332Ev
                    public final boolean A5T(Object obj2, AnonymousClass097 anonymousClass097, C09H c09h) {
                        byte[] bArr;
                        Uri parse;
                        C48292Er c48292Er2 = c48292Er;
                        AnonymousClass235 anonymousClass235 = (AnonymousClass235) obj2;
                        if (anonymousClass235.A02) {
                            String A1B = anonymousClass097.A1B();
                            File file = null;
                            if (A1B != null && (parse = Uri.parse(A1B)) != null && parse.isAbsolute()) {
                                file = AnonymousClass024.A05(parse);
                            }
                            File file2 = anonymousClass235.A01;
                            if (file2 != null) {
                                anonymousClass097.A08 = file2.getName();
                                long length = file2.length();
                                c09h.A0A = length;
                                anonymousClass097.A01 = length;
                                c09h.A0F = file2;
                                if (anonymousClass097.A0E() != null && (bArr = anonymousClass235.A03) != null) {
                                    anonymousClass097.A0E().A03(bArr);
                                    c48292Er2.A06.A08(anonymousClass097);
                                }
                                c09h.A0O = true;
                                c09h.A0L = true;
                                if (anonymousClass235 instanceof C3G2) {
                                    C3G2 c3g2 = (C3G2) anonymousClass235;
                                    c09h.A06 = c3g2.A02;
                                    c09h.A08 = c3g2.A03;
                                    c09h.A02 = c3g2.A00;
                                    c09h.A03 = c3g2.A01;
                                    if (c3g2.A04) {
                                        int[] iArr = c3g2.A05;
                                        if (iArr.length > 0) {
                                            C04030Id A18 = anonymousClass097.A18();
                                            if (A18 != null) {
                                                synchronized (A18) {
                                                    A18.A03 = iArr;
                                                    A18.A01 = true;
                                                }
                                            } else {
                                                throw null;
                                            }
                                        }
                                    }
                                } else if (anonymousClass235 instanceof C3G5) {
                                    C3G5 c3g5 = (C3G5) anonymousClass235;
                                    anonymousClass097.A00 = c3g5.A00;
                                    if (c3g5.A01) {
                                        anonymousClass097.A06 = null;
                                        anonymousClass097.A05 = null;
                                    }
                                    c09h.A0H = null;
                                } else if (anonymousClass235 instanceof C3G3) {
                                    C3G3 c3g3 = (C3G3) anonymousClass235;
                                    anonymousClass097.A06 = c3g3.A01;
                                    anonymousClass097.A05 = null;
                                    int i = c3g3.A02;
                                    if (i > 0) {
                                        c09h.A04 = i;
                                    }
                                    Boolean bool = c3g3.A00;
                                    if (bool != null) {
                                        ((C04040Ie) anonymousClass097).A00 = bool.booleanValue();
                                    }
                                }
                                anonymousClass097.A0B = anonymousClass235.A00;
                                if (file != null && !file.equals(file2)) {
                                    c48292Er2.A05.A0g(file);
                                }
                                return true;
                            }
                            throw null;
                        }
                        c09h.A0a = false;
                        ((AnonymousClass092) anonymousClass097).A08 = 0;
                        c09h.A0L = false;
                        c09h.A0O = false;
                        return true;
                    }
                });
                for (AnonymousClass092 anonymousClass092 : Collections.unmodifiableList(copyOnWriteArrayList)) {
                    c41771uU.A04.A0W(anonymousClass092, -1);
                }
            }
        }, null);
        c454622d.A0E.A03(new C0CG() { // from class: X.3FC
            {
                C41771uU.this = this;
            }

            @Override // X.C0CG
            public final void A54(Object obj) {
                C41771uU c41771uU = C41771uU.this;
                C04130Ir c04130Ir2 = c04130Ir;
                CopyOnWriteArrayList copyOnWriteArrayList = c04130Ir2.A01;
                copyOnWriteArrayList.size();
                final C48292Er c48292Er = c41771uU.A0A;
                C48292Er.A01(obj, c04130Ir2, new InterfaceC48332Ev() { // from class: X.3FP
                    @Override // X.InterfaceC48332Ev
                    public final boolean A5T(Object obj2, AnonymousClass097 anonymousClass097, C09H c09h) {
                        if (C0DB.A0J(c48292Er.A00, anonymousClass097)) {
                            anonymousClass097.A0Y(13);
                            c09h.A0P = true;
                        } else {
                            anonymousClass097.A0Y(1);
                        }
                        c09h.A0a = true;
                        c09h.A0C = 0L;
                        c09h.A0L = true;
                        return true;
                    }
                });
                c41771uU.A05.A06(copyOnWriteArrayList, -1);
            }
        }, executor);
        c454622d.A0F.A03(new C0CG() { // from class: X.2Eu
            public int A00 = -1;
            public int A01;

            {
                C41771uU.this = this;
            }

            @Override // X.C0CG
            public void A54(Object obj) {
                Number number = (Number) obj;
                int intValue = number.intValue();
                if (intValue != this.A00) {
                    this.A00 = intValue;
                    if (intValue >= this.A01 + 5) {
                        this.A01 = intValue;
                        c04130Ir.A01.size();
                    }
                    C41771uU c41771uU = C41771uU.this;
                    final C48292Er c48292Er = c41771uU.A0A;
                    C04130Ir c04130Ir2 = c04130Ir;
                    C48292Er.A01(number, c04130Ir2, new InterfaceC48332Ev() { // from class: X.3FK
                        @Override // X.InterfaceC48332Ev
                        public final boolean A5T(Object obj2, AnonymousClass097 anonymousClass097, C09H c09h) {
                            Number number2 = (Number) obj2;
                            if (c48292Er != null) {
                                c09h.A0C = number2.intValue();
                                return true;
                            }
                            throw null;
                        }
                    });
                    c41771uU.A05.A06(c04130Ir2.A01, 8);
                }
            }
        }, executor);
        c454622d.A05.A03(new C0CG() { // from class: X.3FB
            {
                C41771uU.this = this;
            }

            @Override // X.C0CG
            public final void A54(Object obj) {
                C41771uU c41771uU = C41771uU.this;
                C04130Ir c04130Ir2 = c04130Ir;
                c04130Ir2.A01.size();
                final C48292Er c48292Er = c41771uU.A0A;
                C48292Er.A01(obj, c04130Ir2, new InterfaceC48332Ev() { // from class: X.3F7
                    @Override // X.InterfaceC48332Ev
                    public final boolean A5T(Object obj2, AnonymousClass097 anonymousClass097, C09H c09h) {
                        byte[] bArr;
                        C48292Er c48292Er2 = c48292Er;
                        C23J c23j = (C23J) obj2;
                        C0DC A02 = C0DC.A02(anonymousClass097);
                        C03900Hp A0E = anonymousClass097.A0E();
                        if (A0E != null && (bArr = c23j.A02) != null) {
                            c48292Er2.A04.A02(A0E);
                            A0E.A04(bArr, C0HW.A04(A02));
                        }
                        Pair pair = c23j.A01;
                        if (pair != null) {
                            c09h.A08 = ((Number) pair.first).intValue();
                            c09h.A06 = ((Number) pair.second).intValue();
                        }
                        Pair pair2 = c23j.A00;
                        if (pair2 != null) {
                            c09h.A02 = ((Number) pair2.first).intValue();
                            c09h.A03 = ((Number) pair2.second).intValue();
                        }
                        byte[] bArr2 = c23j.A03;
                        if (bArr2 == null || !(anonymousClass097 instanceof C04040Ie)) {
                            return true;
                        }
                        ((C04040Ie) anonymousClass097).A01 = C04050If.A00(bArr2);
                        return true;
                    }
                });
                C018508q c018508q = c41771uU.A00;
                c018508q.A02.post(new RunnableEBaseShape2S0200000_I0_2(c41771uU, c04130Ir2, 45));
            }
        }, null);
        c454622d.A09.A03(new C3FJ(this, c04130Ir, c454622d), executor);
    }

    public void A08(AnonymousClass092 anonymousClass092, boolean z) {
        if (!(anonymousClass092 instanceof AnonymousClass097)) {
            StringBuilder A0P = C000200d.A0P("mediajobmanager/cancelmessage; attempt to cancel non-media message: ");
            A0P.append(anonymousClass092.A0n);
            Log.e(A0P.toString());
        } else if (C0D6.A00(anonymousClass092.A08, 2) >= 0) {
            StringBuilder A0P2 = C000200d.A0P("mediajobmanager/cancelmessage; attempt to cancel uploaded message: ");
            A0P2.append(anonymousClass092.A0n);
            Log.e(A0P2.toString());
            if (z) {
                this.A00.A07(R.string.file_uploaded, 0);
            }
        } else {
            StringBuilder A0P3 = C000200d.A0P("mediajobmanager/cancelmessage: ");
            A0P3.append(anonymousClass092.A0n);
            Log.e(A0P3.toString());
            final AnonymousClass097 anonymousClass097 = (AnonymousClass097) anonymousClass092;
            this.A0H.A02(anonymousClass092);
            C2E5 c2e5 = new C2E5(this, Collections.singletonList(anonymousClass097));
            this.A0I.AS1(c2e5);
            ((C0CI) c2e5).A01.A03(new C0CG() { // from class: X.3FA
                {
                    C41771uU.this = this;
                }

                @Override // X.C0CG
                public final void A54(Object obj) {
                    C41771uU c41771uU = C41771uU.this;
                    AnonymousClass097 anonymousClass0972 = anonymousClass097;
                    if (C48292Er.A00(anonymousClass0972, false)) {
                        c41771uU.A04.A0T(anonymousClass0972);
                        c41771uU.A0I.AS1(new RunnableEBaseShape2S0200000_I0_2(c41771uU, anonymousClass0972, 46));
                    }
                }
            }, this.A0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0046, code lost:
        if (r1 == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A09(X.AnonymousClass097 r6) {
        /*
            r5 = this;
            X.09H r0 = r6.A02
            r4 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.A0O
            if (r0 == 0) goto La
            return r4
        La:
            X.0Ir r0 = r5.A01(r6)
            X.22d r3 = r5.A02(r0)
            if (r3 == 0) goto L56
            X.1zG r0 = r5.A09
            X.22n r2 = r0.A0B
            X.232 r0 = r3.A03()
            X.0DC r1 = r0.A05
            X.22r r0 = r2.A04
            X.233 r1 = r0.A00(r1)
            monitor-enter(r1)
            java.util.Map r0 = r1.A01     // Catch: java.lang.Throwable -> L53
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L53
            X.1x5 r0 = (X.RunnableC43241x5) r0     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L32
            java.lang.Runnable r2 = r0.A02     // Catch: java.lang.Throwable -> L53
            goto L33
        L32:
            r2 = 0
        L33:
            monitor-exit(r1)
            X.23O r2 = (X.C23O) r2
            if (r2 == 0) goto L56
            monitor-enter(r2)
            X.23B r1 = r2.A00     // Catch: java.lang.Throwable -> L50
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L50
            X.1xt r0 = r1.A00     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L48
            boolean r1 = r0.AEV()     // Catch: java.lang.Throwable -> L50
            r0 = 1
            if (r1 != 0) goto L49
        L48:
            r0 = 0
        L49:
            monitor-exit(r2)
            if (r0 == 0) goto L56
            return r4
        L4d:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
            throw r0     // Catch: java.lang.Throwable -> L50
        L50:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L53:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L56:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41771uU.A09(X.097):boolean");
    }

    public boolean A0A(AnonymousClass097 anonymousClass097) {
        boolean containsKey;
        C454622d A02 = A02(A01(anonymousClass097));
        if (A02 != null) {
            C455422m c455422m = this.A09.A0E;
            synchronized (c455422m) {
                containsKey = c455422m.A01.containsKey(A02);
            }
            if (containsKey) {
                return true;
            }
        }
        return false;
    }
}
