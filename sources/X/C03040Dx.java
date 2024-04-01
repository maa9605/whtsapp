package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.Voip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Dx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03040Dx implements InterfaceC007103c {
    public final int A00;
    public final /* synthetic */ C02950Dn A01;

    public C03040Dx(C02950Dn c02950Dn, int i) {
        this.A01 = c02950Dn;
        this.A00 = i;
    }

    public static C05670Pr A00() {
        if (C05670Pr.A0u == null) {
            synchronized (C05670Pr.class) {
                if (C05670Pr.A0u == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C003701t A002 = C003701t.A00();
                    C05B A003 = C05B.A00();
                    C05A A004 = C05A.A00();
                    AbstractC000600i A005 = AbstractC000600i.A00();
                    C02L A006 = C02L.A00();
                    C05M A007 = C05M.A00();
                    C05O A008 = C05O.A00();
                    AnonymousClass011 A009 = AnonymousClass011.A00();
                    C01B A0010 = C01B.A00();
                    C0EB A0011 = C0EB.A00();
                    C05R A0012 = C05R.A00();
                    C0GU A0013 = C0GU.A00();
                    C0D5 A0014 = C0D5.A00();
                    C03690Gr A0015 = C03690Gr.A00();
                    C05S A0016 = C05S.A00();
                    C42781wJ A0017 = C42781wJ.A00();
                    C06Q A0018 = C06Q.A00();
                    C0HY A0019 = C0HY.A00();
                    C000400f A0020 = C000400f.A00();
                    C28L A0021 = C28L.A00();
                    C06R A0022 = C06R.A00();
                    C05C A0023 = C05C.A00();
                    C48072Dr A0024 = C48072Dr.A00();
                    C05L A0025 = C05L.A00();
                    C06S A0026 = C06S.A00();
                    C05Q A0027 = C05Q.A00();
                    C06W A0028 = C06W.A00();
                    C06X A0029 = C06X.A00();
                    C06Y A0030 = C06Y.A00();
                    C0E9 A0031 = C0E9.A00();
                    C06O A0032 = C06O.A00();
                    C06Z A0033 = C06Z.A00();
                    C012706e A0034 = C012706e.A00();
                    C012306a A0035 = C012306a.A00();
                    C05E A0036 = C05E.A00();
                    if (C48082Ds.A05 == null) {
                        synchronized (C48082Ds.class) {
                            if (C48082Ds.A05 == null) {
                                C48082Ds.A05 = new C48082Ds(AnonymousClass012.A00(), C003701t.A00(), C0EG.A00());
                            }
                        }
                    }
                    C48082Ds c48082Ds = C48082Ds.A05;
                    C014706y A0037 = C014706y.A00();
                    C0G2 A0038 = C0G2.A00();
                    C03730Gv A0039 = C03730Gv.A00();
                    C012806f A0040 = C012806f.A00();
                    C0F3 A0041 = C0F3.A00();
                    C42791wK A0042 = C42791wK.A00();
                    C013006h A0043 = C013006h.A00();
                    AnonymousClass070.A01();
                    C06J A01 = C06J.A01();
                    C0H0 A0044 = C0H0.A00();
                    C06I A0045 = C06I.A00();
                    C013106i A012 = C013106i.A01();
                    C47962Dg A0046 = C47962Dg.A00();
                    C013206j A0047 = C013206j.A00();
                    C0FE A0048 = C0FE.A00();
                    C013306k A07 = C013306k.A07();
                    if (C0QI.A06 == null) {
                        synchronized (C0QI.class) {
                            if (C0QI.A06 == null) {
                                C0QI.A06 = new C0QI(new C48092Dt(null));
                            }
                        }
                    }
                    C0QI c0qi = C0QI.A06;
                    if (C0Q1.A03 == null) {
                        synchronized (C0Q1.class) {
                            if (C0Q1.A03 == null) {
                                C0Q1.A03 = new C0Q1(C05B.A00(), AbstractC000600i.A00(), C05U.A01());
                            }
                        }
                    }
                    C0Q1 c0q1 = C0Q1.A03;
                    C02O.A00();
                    C03020Dv.A00();
                    C42431vj A0049 = C42431vj.A00();
                    C014606x A0050 = C014606x.A00();
                    AnonymousClass079.A00();
                    C05670Pr.A0u = new C05670Pr(A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028, A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, c48082Ds, A0037, A0038, A0039, A0040, A0041, A0042, A0043, A01, A0044, A0045, A012, A0046, A0047, A0048, A07, c0qi, c0q1, A0049, A0050);
                }
            }
        }
        C05670Pr c05670Pr = C05670Pr.A0u;
        C02180Ae.A1B(c05670Pr);
        return c05670Pr;
    }

    public static C90334Ap A01() {
        if (C90334Ap.A01 == null) {
            synchronized (C90334Ap.class) {
                if (C90334Ap.A01 == null) {
                    C90334Ap.A01 = new C90334Ap(C01B.A00());
                }
            }
        }
        C90334Ap c90334Ap = C90334Ap.A01;
        C02180Ae.A1B(c90334Ap);
        return c90334Ap;
    }

    @Override // X.InterfaceC007103c
    public Object get() {
        Object obj;
        Object obj2;
        final Set unmodifiableSet;
        int i = this.A00;
        switch (i) {
            case 0:
                return C02950Dn.A07(this.A01);
            case 1:
                C02950Dn c02950Dn = this.A01;
                Object obj3 = c02950Dn.A02;
                if (obj3 instanceof C41111tO) {
                    synchronized (obj3) {
                        obj = c02950Dn.A02;
                        if (obj instanceof C41111tO) {
                            InterfaceC007103c interfaceC007103c = c02950Dn.A0z;
                            if (interfaceC007103c == null) {
                                interfaceC007103c = new C03040Dx(c02950Dn, 2);
                                c02950Dn.A0z = interfaceC007103c;
                            }
                            C00J A00 = C41161tT.A00(interfaceC007103c);
                            InterfaceC007103c interfaceC007103c2 = c02950Dn.A0v;
                            if (interfaceC007103c2 == null) {
                                interfaceC007103c2 = new C03040Dx(c02950Dn, 3);
                                c02950Dn.A0v = interfaceC007103c2;
                            }
                            C00J A002 = C41161tT.A00(interfaceC007103c2);
                            InterfaceC007103c interfaceC007103c3 = c02950Dn.A0y;
                            if (interfaceC007103c3 == null) {
                                interfaceC007103c3 = new C03040Dx(c02950Dn, 4);
                                c02950Dn.A0y = interfaceC007103c3;
                            }
                            obj = new C91694Fx(A00, A002, C41161tT.A00(interfaceC007103c3));
                            C41161tT.A01(c02950Dn.A02, obj);
                            c02950Dn.A02 = obj;
                        }
                    }
                    return obj;
                }
                return obj3;
            case 2:
                return C42041uv.A01();
            case 3:
                ComponentCallbacks2C011905v A003 = ComponentCallbacks2C011905v.A00();
                C02180Ae.A1B(A003);
                return A003;
            case 4:
                C02O A004 = C02O.A00();
                C02180Ae.A1B(A004);
                return A004;
            case 5:
                return C02950Dn.A05(this.A01);
            case 6:
                return C41121tP.A00();
            case 7:
                if (C44P.A00 == null) {
                    synchronized (C44P.class) {
                        if (C44P.A00 == null) {
                            C44P.A00 = new C44P();
                        }
                    }
                }
                C44P c44p = C44P.A00;
                C02180Ae.A1B(c44p);
                return c44p;
            case 8:
                C2Lo A005 = C2Lo.A00();
                C02180Ae.A1B(A005);
                return A005;
            case 9:
                C018308n A02 = C018308n.A02();
                C02180Ae.A1B(A02);
                return A02;
            case 10:
                return C02950Dn.A04(this.A01);
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                return C41131tQ.A02();
            case 12:
                return C2MF.A07();
            case 13:
                if (this.A01 != null) {
                    ArrayList arrayList = new ArrayList(1);
                    final InterfaceC002901k A04 = C41131tQ.A04();
                    final C02E A01 = C42041uv.A01();
                    final C462626b A022 = C42041uv.A02();
                    final C0G2 A006 = C0G2.A00();
                    C02180Ae.A1B(A006);
                    C0EQ c0eq = new C0EQ(A04, A01, A022, A006) { // from class: X.1hq
                        public final C0G2 A00;
                        public final C02E A01;
                        public final C462626b A02;
                        public final InterfaceC002901k A03;

                        {
                            this.A03 = A04;
                            this.A01 = A01;
                            this.A02 = A022;
                            this.A00 = A006;
                        }

                        @Override // X.C0EQ
                        public void AKy() {
                            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                            Debug.getMemoryInfo(memoryInfo);
                            StringBuilder A0P = C000200d.A0P("device/memory private_dirty=");
                            A0P.append(memoryInfo.getTotalPrivateDirty());
                            A0P.append("kB pss=");
                            A0P.append(memoryInfo.getTotalPss());
                            A0P.append("kB shared_dirty=");
                            A0P.append(memoryInfo.getTotalSharedDirty());
                            A0P.append("kB");
                            Log.i(A0P.toString());
                            ActivityManager A012 = this.A01.A01();
                            if (A012 == null) {
                                Log.w("device/info am=null");
                            } else {
                                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = A012.getRunningAppProcesses();
                                if (runningAppProcesses != null) {
                                    try {
                                        int[] iArr = new int[runningAppProcesses.size()];
                                        for (int i2 = 0; i2 < runningAppProcesses.size(); i2++) {
                                            iArr[i2] = runningAppProcesses.get(i2).pid;
                                        }
                                        Debug.MemoryInfo[] processMemoryInfo = A012.getProcessMemoryInfo(iArr);
                                        if (processMemoryInfo != null) {
                                            int length = processMemoryInfo.length;
                                            int i3 = 0;
                                            for (Debug.MemoryInfo memoryInfo2 : processMemoryInfo) {
                                                i3 += memoryInfo2.getTotalPss();
                                            }
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("device/memory processes=");
                                            sb.append(length);
                                            sb.append(" total=");
                                            sb.append(i3);
                                            Log.i(sb.toString());
                                        }
                                    } catch (Exception e) {
                                        Log.i("device/processes/error ", e);
                                    }
                                    C0G3 c0g3 = this.A00.A00;
                                    StringBuilder sb2 = new StringBuilder("device/battery ");
                                    sb2.append(c0g3);
                                    Log.i(sb2.toString());
                                    this.A03.AS1(new C1FJ(this.A02));
                                }
                            }
                            Log.w("device/processes/none");
                            C0G3 c0g32 = this.A00.A00;
                            StringBuilder sb22 = new StringBuilder("device/battery ");
                            sb22.append(c0g32);
                            Log.i(sb22.toString());
                            this.A03.AS1(new C1FJ(this.A02));
                        }
                    };
                    C0EP A007 = C0EP.A00();
                    C02180Ae.A1B(A007);
                    C47222Aj A008 = C47222Aj.A00();
                    C02180Ae.A1B(A008);
                    C03740Gw A009 = C03740Gw.A00();
                    C02180Ae.A1B(A009);
                    C42171vH A023 = C42111v7.A02();
                    if (C37M.A04 == null) {
                        synchronized (C37M.class) {
                            if (C37M.A04 == null) {
                                C37M.A04 = new C37M(C02L.A00(), C002801j.A00(), C41321tj.A00(), C05G.A00());
                            }
                        }
                    }
                    C37M c37m = C37M.A04;
                    C02180Ae.A1B(c37m);
                    HashSet hashSet = new HashSet();
                    hashSet.add(c0eq);
                    hashSet.add(A007);
                    hashSet.add(A008);
                    hashSet.add(A009);
                    hashSet.add(A023);
                    hashSet.add(c37m);
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        if (it.next() == null) {
                            throw new NullPointerException("Set contributions cannot be null");
                        }
                    }
                    arrayList.addAll(hashSet);
                    if (arrayList.isEmpty()) {
                        return Collections.emptySet();
                    }
                    if (arrayList.size() == 1) {
                        return Collections.singleton(arrayList.get(0));
                    }
                    return Collections.unmodifiableSet(new HashSet(arrayList));
                }
                throw null;
            case 14:
                C02950Dn c02950Dn2 = this.A01;
                Object obj4 = c02950Dn2.A03;
                if (obj4 instanceof C41111tO) {
                    synchronized (obj4) {
                        obj2 = c02950Dn2.A03;
                        if (obj2 instanceof C41111tO) {
                            InterfaceC007103c interfaceC007103c4 = c02950Dn2.A12;
                            if (interfaceC007103c4 == null) {
                                interfaceC007103c4 = new C03040Dx(c02950Dn2, 15);
                                c02950Dn2.A12 = interfaceC007103c4;
                            }
                            C00J A0010 = C41161tT.A00(interfaceC007103c4);
                            C00J A0011 = C41161tT.A00(c02950Dn2.A2Y());
                            InterfaceC007103c interfaceC007103c5 = c02950Dn2.A13;
                            if (interfaceC007103c5 == null) {
                                interfaceC007103c5 = new C03040Dx(c02950Dn2, 17);
                                c02950Dn2.A13 = interfaceC007103c5;
                            }
                            obj2 = new C90344Aq(A0010, A0011, C41161tT.A00(interfaceC007103c5));
                            C41161tT.A01(c02950Dn2.A03, obj2);
                            c02950Dn2.A03 = obj2;
                        }
                    }
                    return obj2;
                }
                return obj4;
            case 15:
                C001200o c001200o = C001200o.A01;
                C02180Ae.A1B(c001200o);
                return c001200o;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                C018508q A0012 = C018508q.A00();
                C02180Ae.A1B(A0012);
                return A0012;
            case 17:
                return C41441tv.A00();
            case 18:
                return C02950Dn.A03(this.A01);
            case 19:
                C02950Dn c02950Dn3 = this.A01;
                if (c02950Dn3 != null) {
                    Context context = c02950Dn3.A00.A00;
                    C02180Ae.A1B(context);
                    C04Z A0013 = C04Z.A00();
                    C02180Ae.A1B(A0013);
                    return new C76163g9(context, A0013);
                }
                throw null;
            case C0M6.A01 /* 20 */:
                return C41131tQ.A04();
            case 21:
                return C41871ue.A07();
            case 22:
                return C02950Dn.A06(this.A01);
            case 23:
                return C41341tl.A00();
            case 24:
                return C02950Dn.A08(this.A01);
            case 25:
                C02950Dn c02950Dn4 = this.A01;
                if (c02950Dn4 != null) {
                    InterfaceC007103c interfaceC007103c6 = c02950Dn4.A16;
                    if (interfaceC007103c6 == null) {
                        interfaceC007103c6 = new C03040Dx(c02950Dn4, 26);
                        c02950Dn4.A16 = interfaceC007103c6;
                    }
                    C41161tT.A00(interfaceC007103c6);
                    C00J A0014 = C41161tT.A00(c02950Dn4.A2X());
                    InterfaceC007103c interfaceC007103c7 = c02950Dn4.A17;
                    if (interfaceC007103c7 == null) {
                        interfaceC007103c7 = new C03040Dx(c02950Dn4, 27);
                        c02950Dn4.A17 = interfaceC007103c7;
                    }
                    C00J A0015 = C41161tT.A00(interfaceC007103c7);
                    C47P A2I = c02950Dn4.A2I();
                    AnonymousClass478 A2J = c02950Dn4.A2J();
                    C47Q A2K = c02950Dn4.A2K();
                    C09O c09o = C09O.A00;
                    C02180Ae.A1B(c09o);
                    C893746t A2L = c02950Dn4.A2L();
                    InterfaceC007103c interfaceC007103c8 = c02950Dn4.A0r;
                    if (interfaceC007103c8 == null) {
                        interfaceC007103c8 = new C03040Dx(c02950Dn4, 28);
                        c02950Dn4.A0r = interfaceC007103c8;
                    }
                    return new C91574Fl(A0014, A0015, A2I, A2J, A2K, c09o, A2L, C41161tT.A00(interfaceC007103c8));
                }
                throw null;
            case 26:
                return C41121tP.A01();
            case 27:
                return C41131tQ.A03();
            case 28:
                C02950Dn c02950Dn5 = this.A01;
                InterfaceC007103c interfaceC007103c9 = c02950Dn5.A10;
                if (interfaceC007103c9 == null) {
                    interfaceC007103c9 = new C03040Dx(c02950Dn5, 29);
                    c02950Dn5.A10 = interfaceC007103c9;
                }
                final C00J A0016 = C41161tT.A00(interfaceC007103c9);
                final C00J A0017 = C41161tT.A00(c02950Dn5.A2X());
                final C00J A0018 = C41161tT.A00(c02950Dn5.A2Y());
                InterfaceC007103c interfaceC007103c10 = c02950Dn5.A0l;
                if (interfaceC007103c10 == null) {
                    interfaceC007103c10 = new C03040Dx(c02950Dn5, 30);
                    c02950Dn5.A0l = interfaceC007103c10;
                }
                final C00J A0019 = C41161tT.A00(interfaceC007103c10);
                InterfaceC007103c interfaceC007103c11 = c02950Dn5.A0z;
                if (interfaceC007103c11 == null) {
                    interfaceC007103c11 = new C03040Dx(c02950Dn5, 2);
                    c02950Dn5.A0z = interfaceC007103c11;
                }
                final C00J A0020 = C41161tT.A00(interfaceC007103c11);
                InterfaceC007103c interfaceC007103c12 = c02950Dn5.A0i;
                if (interfaceC007103c12 == null) {
                    interfaceC007103c12 = new C03040Dx(c02950Dn5, 31);
                    c02950Dn5.A0i = interfaceC007103c12;
                }
                final C00J A0021 = C41161tT.A00(interfaceC007103c12);
                final C00J A0022 = C41161tT.A00(c02950Dn5.A2Z());
                InterfaceC007103c interfaceC007103c13 = c02950Dn5.A0s;
                if (interfaceC007103c13 == null) {
                    interfaceC007103c13 = new C03040Dx(c02950Dn5, 32);
                    c02950Dn5.A0s = interfaceC007103c13;
                }
                final C00J A0023 = C41161tT.A00(interfaceC007103c13);
                InterfaceC007103c interfaceC007103c14 = c02950Dn5.A0e;
                if (interfaceC007103c14 == null) {
                    interfaceC007103c14 = new C03040Dx(c02950Dn5, 33);
                    c02950Dn5.A0e = interfaceC007103c14;
                }
                final C00J A0024 = C41161tT.A00(interfaceC007103c14);
                InterfaceC007103c interfaceC007103c15 = c02950Dn5.A16;
                if (interfaceC007103c15 == null) {
                    interfaceC007103c15 = new C03040Dx(c02950Dn5, 26);
                    c02950Dn5.A16 = interfaceC007103c15;
                }
                final C00J A0025 = C41161tT.A00(interfaceC007103c15);
                InterfaceC007103c interfaceC007103c16 = c02950Dn5.A0Y;
                if (interfaceC007103c16 == null) {
                    interfaceC007103c16 = new C03040Dx(c02950Dn5, 34);
                    c02950Dn5.A0Y = interfaceC007103c16;
                }
                final C00J A0026 = C41161tT.A00(interfaceC007103c16);
                InterfaceC007103c interfaceC007103c17 = c02950Dn5.A0k;
                if (interfaceC007103c17 == null) {
                    interfaceC007103c17 = new C03040Dx(c02950Dn5, 37);
                    c02950Dn5.A0k = interfaceC007103c17;
                }
                final C00J A0027 = C41161tT.A00(interfaceC007103c17);
                InterfaceC007103c interfaceC007103c18 = c02950Dn5.A0U;
                if (interfaceC007103c18 == null) {
                    interfaceC007103c18 = new C03040Dx(c02950Dn5, 38);
                    c02950Dn5.A0U = interfaceC007103c18;
                }
                final C00J A0028 = C41161tT.A00(interfaceC007103c18);
                ArrayList arrayList2 = new ArrayList(1);
                Set<Object> singleton = Collections.singleton(new C4I6());
                C02180Ae.A1B(singleton);
                for (Object obj5 : singleton) {
                    if (obj5 == null) {
                        throw new NullPointerException("Set contributions cannot be null");
                    }
                }
                arrayList2.addAll(singleton);
                if (arrayList2.isEmpty()) {
                    unmodifiableSet = Collections.emptySet();
                } else if (arrayList2.size() == 1) {
                    unmodifiableSet = Collections.singleton(arrayList2.get(0));
                } else {
                    unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList2));
                }
                final C91614Fp c91614Fp = new C91614Fp(A0016, A0017, A0023, A0024, A0025, A0027, A0026, A0028) { // from class: X.4I5
                };
                new C90234Af() { // from class: X.4Ft
                };
                final C1WM c1wm = new C1WM(new C33311fh());
                final InterfaceC021309t interfaceC021309t = new InterfaceC021309t(A0016, A0018, A0017, A0019, A0023, A0020, A0021, A0022, c91614Fp, c1wm) { // from class: X.4Fq
                    public C2Qg A00;
                    public final InterfaceC021309t A01;
                    public final AbstractC90224Ae A02;
                    public final C00J A03;
                    public final C00J A04;
                    public final C00J A05;
                    public final C00J A06;
                    public final C00J A07;
                    public final C00J A08;
                    public final C00J A09;
                    public final C00J A0A;

                    {
                        this.A09 = A0016;
                        this.A06 = A0018;
                        this.A03 = A0017;
                        this.A05 = A0019;
                        this.A07 = A0023;
                        this.A08 = A0020;
                        this.A04 = A0021;
                        this.A0A = A0022;
                        this.A02 = c91614Fp;
                        this.A01 = c1wm;
                    }

                    public static final HashMap A00(Map map) {
                        HashMap hashMap = new HashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (entry.getValue() instanceof Number) {
                                hashMap.put(AnonymousClass088.A0r((InterfaceC020509l) entry.getKey()), entry.getValue().toString());
                            } else {
                                hashMap.put(AnonymousClass088.A0r((InterfaceC020509l) entry.getKey()), entry.getValue() != C0A6.A00 ? AnonymousClass088.A0q((InterfaceC020509l) entry.getValue()).toString() : null);
                            }
                        }
                        return hashMap;
                    }

                    public final UserJid A01(String str) {
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                return UserJid.get(str);
                            } catch (C011305p e) {
                                UserJid fromIdentifier = UserJid.getFromIdentifier(str);
                                StringBuilder A0P = C000200d.A0P("bloks/openchat - Jid missing suffix: ");
                                A0P.append(e.getMessage());
                                ((AbstractC000600i) this.A05.get()).A09(A0P.toString(), null, true);
                                return fromIdentifier;
                            }
                        }
                        throw new C011305p("Jid is Empty");
                    }

                    public final C4I5 A02() {
                        AbstractC90224Ae abstractC90224Ae = this.A02;
                        if (abstractC90224Ae instanceof C4I5) {
                            return (C4I5) abstractC90224Ae;
                        }
                        StringBuilder A0P = C000200d.A0P("Expected BkWaBloksActivityExtensions -- got: ");
                        A0P.append(abstractC90224Ae.getClass().getSimpleName());
                        throw new IllegalStateException(A0P.toString());
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ab, code lost:
                        if (r14.equals("wa.action.StartFieldStatTimer") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b7, code lost:
                        if (r14.equals("bk.action.bloks.OpenScreen") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c3, code lost:
                        if (r14.equals("wa.action.HandleError") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:111:0x01cf, code lost:
                        if (r14.equals("wa.action.GetChildNode") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:114:0x01db, code lost:
                        if (r14.equals("wa.action.FormatStringV2") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:117:0x01e7, code lost:
                        if (r14.equals("bk.action.navigation.OpenUrl") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:120:0x01f3, code lost:
                        if (r14.equals("wa.action.TimeInFuture") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:123:0x01ff, code lost:
                        if (r14.equals("bk.action.logging.LogEvent") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:126:0x020b, code lost:
                        if (r14.equals("bk.action.io.clipboard.SetString") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:129:0x0217, code lost:
                        if (r14.equals("wa.action.SendFieldStat") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
                        if (r14.equals("wa.action.FinishActivityWithResult") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:132:0x0223, code lost:
                        if (r14.equals("bk.action.navigation.SetNavBar") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:135:0x022f, code lost:
                        if (r14.equals("bk.action.io.CurrentTimeMillis") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
                        if (r14.equals("wa.action.bloks.LaunchDialog") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
                        if (r14.equals("wa.action.ShowProgressBar") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
                        if (r14.equals("bk.action.bloks.OpenBottomSheet") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
                        if (r14.equals("wa.action.DismissDialog") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
                        if (r14.equals("bk.action.io.DebugToast") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
                        if (r14.equals("wa.action.FormatString") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
                        if (r14.equals("bk.action.bloks.DismissBottomSheet") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
                        if (r14.equals("wa.action.PopScreen") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:39:0x00af, code lost:
                        if (r14.equals("wa.action.GetFieldStatEventId") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bb, code lost:
                        if (r14.equals("wa.action.Logging") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
                        if (r14.equals("wa.action.navigation.OpenContactInfo") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
                        if (r14.equals("wa.action.GetIntentParameter") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
                        if (r14.equals("wa.action.FinishActivity") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:54:0x00eb, code lost:
                        if (r14.equals("bk.action.io.Toast") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f7, code lost:
                        if (r14.equals("bk.action.session_store.Get") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:60:0x0103, code lost:
                        if (r14.equals("wa.action.navigation.OpenChat") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:63:0x010f, code lost:
                        if (r14.equals("wa.action.share.Text") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:66:0x011b, code lost:
                        if (r14.equals("bk.action.navigation.CloseScreen") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:69:0x0127, code lost:
                        if (r14.equals("wa.action.DismissProgressBar") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:72:0x0133, code lost:
                        if (r14.equals("wa.action.SendFieldStatV2") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:75:0x013f, code lost:
                        if (r14.equals("bk.action.bloks.AsyncAction") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:78:0x014b, code lost:
                        if (r14.equals("wa.action.ResetFieldStats") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:81:0x0157, code lost:
                        if (r14.equals("bk.action.bloks.PushBottomSheet") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:84:0x0163, code lost:
                        if (r14.equals("wa.action.GetFieldStatElapsedTime") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:87:0x016f, code lost:
                        if (r14.equals("wa.action.navigation.OpenScreenWithOptions") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:90:0x017b, code lost:
                        if (r14.equals("bk.action.bloks.LaunchDialog") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:93:0x0187, code lost:
                        if (r14.equals("wa.action.GetAttributeValue") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:96:0x0193, code lost:
                        if (r14.equals("wa.action.OpenUrl") == false) goto L3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:99:0x019f, code lost:
                        if (r14.equals("wa.action.navigation.OpenNativeActionSheet") == false) goto L3;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC021309t
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public X.InterfaceC020509l A7h(X.C33971gl r18, X.C021109r r19, final X.C021209s r20) {
                        /*
                            Method dump skipped, instructions count: 3360
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C91624Fq.A7h(X.1gl, X.09r, X.09s):X.09l");
                    }
                };
                return new InterfaceC021309t(unmodifiableSet, interfaceC021309t) { // from class: X.4Fr
                    public final InterfaceC021309t A00;
                    public final Set A01;

                    {
                        this.A01 = unmodifiableSet;
                        this.A00 = interfaceC021309t;
                    }

                    @Override // X.InterfaceC021309t
                    public InterfaceC020509l A7h(C33971gl c33971gl, C021109r c021109r, C021209s c021209s) {
                        for (C4I6 c4i6 : this.A01) {
                            if (c4i6.A00.contains(c33971gl.A00)) {
                                return c4i6.A7h(c33971gl, c021109r, c021209s);
                            }
                        }
                        InterfaceC021309t interfaceC021309t2 = this.A00;
                        if (interfaceC021309t2 != null) {
                            return interfaceC021309t2.A7h(c33971gl, c021109r, c021209s);
                        }
                        return C0A6.A00;
                    }
                };
            case 29:
                return C41131tQ.A01();
            case 30:
                AbstractC000600i A0029 = AbstractC000600i.A00();
                C02180Ae.A1B(A0029);
                return A0029;
            case 31:
                return C893546r.A01();
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                return C41131tQ.A00();
            case 33:
                return C41171tU.A00();
            case 34:
                return C02950Dn.A0A(this.A01);
            case 35:
                return A01();
            case 36:
                C05Y A012 = C05Y.A01();
                C02180Ae.A1B(A012);
                return A012;
            case 37:
                return C41141tR.A00();
            case 38:
                return C02950Dn.A09(this.A01);
            case 39:
                C02950Dn c02950Dn6 = this.A01;
                if (c02950Dn6 != null) {
                    return new C90294Al(C41161tT.A00(c02950Dn6.A2X()));
                }
                throw null;
            case 40:
                return C2MA.A01();
            case 41:
                C50412Rp A0030 = C50412Rp.A00();
                C02180Ae.A1B(A0030);
                return A0030;
            case 42:
                return A00();
            case 43:
                return Voip.getCallInfo();
            case 44:
                Voip.CallState currentCallState = Voip.getCurrentCallState();
                C02180Ae.A1B(currentCallState);
                return currentCallState;
            default:
                throw new AssertionError(i);
        }
    }
}
