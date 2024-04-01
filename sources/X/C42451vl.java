package X;

import android.os.ConditionVariable;
import com.whatsapp.Mp4Ops;
import com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.1vl */
/* loaded from: classes2.dex */
public class C42451vl {
    public static volatile C42451vl A0m;
    public final C0IX A01;
    public final AbstractC000600i A02;
    public final C012005w A03;
    public final C018508q A04;
    public final C0E3 A05;
    public final Mp4Ops A06;
    public final C0F2 A07;
    public final C01B A08;
    public final C0EL A09;
    public final C0E6 A0A;
    public final C000400f A0B;
    public final AnonymousClass012 A0C;
    public final C001200o A0D;
    public final C0C9 A0E;
    public final C40411sD A0F;
    public final C00A A0G;
    public final C0ET A0H;
    public final C0ED A0I;
    public final C003701t A0J;
    public final C04000Ia A0K;
    public final C41491u0 A0L;
    public final C0HW A0M;
    public final C43111ws A0N;
    public final C43131wu A0O;
    public final C43121wt A0P;
    public final C41571uA A0Q;
    public final C42441vk A0R;
    public final C43151ww A0T;
    public final C43091wq A0U;
    public final C0EG A0V;
    public final C02O A0W;
    public final C43171wy A0X;
    public final C0GT A0Y;
    public final C0IY A0Z;
    public final C0CB A0a;
    public final C43101wr A0b;
    public final C41961un A0c;
    public final C42471vn A0d;
    public final C43141wv A0e;
    public final InterfaceC002901k A0f;
    public final C40951t8 A0g;
    public final Executor A0k;
    public final Executor A0l;
    public final C43181wz A0S = new C43181wz(this);
    public final HashMap A0h = new HashMap();
    public final HashMap A0i = new HashMap();
    public final Set A0j = new HashSet();
    public final ConditionVariable A00 = new ConditionVariable(true);

    public C42451vl(C001200o c001200o, AnonymousClass012 anonymousClass012, Mp4Ops mp4Ops, C003701t c003701t, C018508q c018508q, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C012005w c012005w, C0HW c0hw, C0EL c0el, C0IX c0ix, C0EG c0eg, C01B c01b, C40951t8 c40951t8, C41491u0 c41491u0, C0E6 c0e6, C0IY c0iy, C0ED c0ed, C41961un c41961un, C0E3 c0e3, C43091wq c43091wq, C42441vk c42441vk, C43101wr c43101wr, C43111ws c43111ws, C0C9 c0c9, C00A c00a, C0CB c0cb, C43121wt c43121wt, C40411sD c40411sD, C000400f c000400f, C42471vn c42471vn, C0ET c0et, C41571uA c41571uA, C43131wu c43131wu, C43141wv c43141wv, C04000Ia c04000Ia, C02O c02o, C43151ww c43151ww, C0GT c0gt, C0F2 c0f2, C43171wy c43171wy) {
        this.A0C = anonymousClass012;
        this.A06 = mp4Ops;
        this.A0J = c003701t;
        this.A04 = c018508q;
        this.A02 = abstractC000600i;
        this.A0D = c001200o;
        this.A0f = interfaceC002901k;
        this.A03 = c012005w;
        this.A0M = c0hw;
        this.A09 = c0el;
        this.A01 = c0ix;
        this.A0V = c0eg;
        this.A08 = c01b;
        this.A0g = c40951t8;
        this.A0L = c41491u0;
        this.A0A = c0e6;
        this.A0Z = c0iy;
        this.A0I = c0ed;
        this.A0c = c41961un;
        this.A05 = c0e3;
        this.A0U = c43091wq;
        this.A0R = c42441vk;
        this.A0b = c43101wr;
        this.A0N = c43111ws;
        this.A0E = c0c9;
        this.A0G = c00a;
        this.A0a = c0cb;
        this.A0P = c43121wt;
        this.A0F = c40411sD;
        this.A0B = c000400f;
        this.A0d = c42471vn;
        this.A0H = c0et;
        this.A0Q = c41571uA;
        this.A0O = c43131wu;
        this.A0e = c43141wv;
        this.A0K = c04000Ia;
        this.A0W = c02o;
        this.A0T = c43151ww;
        this.A0Y = c0gt;
        this.A07 = c0f2;
        this.A0X = c43171wy;
        this.A0k = new ExecutorC43191x0(c018508q);
        this.A0l = new ExecutorC43201x1(interfaceC002901k);
    }

    public static C42451vl A00() {
        if (A0m == null) {
            synchronized (C42451vl.class) {
                if (A0m == null) {
                    C001200o c001200o = C001200o.A01;
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    Mp4Ops A002 = Mp4Ops.A00();
                    C003701t A003 = C003701t.A00();
                    C018508q A004 = C018508q.A00();
                    AbstractC000600i A005 = AbstractC000600i.A00();
                    InterfaceC002901k A006 = C002801j.A00();
                    C012005w A007 = C012005w.A00();
                    C0HW A008 = C0HW.A00();
                    C0EL A009 = C0EL.A00();
                    C0IX A0010 = C0IX.A00();
                    C0EG A0011 = C0EG.A00();
                    C01B A0012 = C01B.A00();
                    C40951t8 A0013 = C40951t8.A00();
                    C41491u0 A0014 = C41491u0.A00();
                    C0E6 A0015 = C0E6.A00();
                    C0IY A0016 = C0IY.A00();
                    C0ED A01 = C0ED.A01();
                    C41961un A0S = C41961un.A0S();
                    C0E3 A06 = C0E3.A06();
                    C43091wq A012 = C43091wq.A01();
                    C42441vk c42441vk = C42441vk.A01;
                    C43101wr A013 = C43101wr.A01();
                    C43111ws A014 = C43111ws.A01();
                    C0C9 A0017 = C0C9.A00();
                    C00A c00a = C00A.A00;
                    C0CB A0018 = C0CB.A00();
                    C43121wt A0019 = C43121wt.A00();
                    C40411sD A0020 = C40411sD.A00();
                    C000400f A0021 = C000400f.A00();
                    C42471vn A015 = C42471vn.A01();
                    C0ET A0022 = C0ET.A00();
                    C41571uA A0023 = C41571uA.A00();
                    C43131wu A0024 = C43131wu.A00();
                    C43141wv A016 = C43141wv.A01();
                    C04000Ia A0025 = C04000Ia.A00();
                    C02O A0026 = C02O.A00();
                    if (C43151ww.A01 == null) {
                        synchronized (C43151ww.class) {
                            if (C43151ww.A01 == null) {
                                C43151ww.A01 = new C43151ww(C003701t.A00(), C002801j.A00());
                            }
                        }
                    }
                    A0m = new C42451vl(c001200o, A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A01, A0S, A06, A012, c42441vk, A013, A014, A0017, c00a, A0018, A0019, A0020, A0021, A015, A0022, A0023, A0024, A016, A0025, A0026, C43151ww.A01, C0GT.A00(), C0F2.A00(), C43171wy.A00());
                }
            }
        }
        return A0m;
    }

    public static final void A01(boolean z, C43211x2 c43211x2, AnonymousClass097 anonymousClass097) {
        Boolean bool;
        boolean z2;
        String str;
        byte[] bArr;
        Integer num;
        Integer num2;
        Long l;
        String str2;
        Integer num3;
        Integer num4;
        Integer num5;
        Long l2;
        Long l3;
        Integer num6;
        Integer num7;
        Integer num8;
        String str3;
        Long l4;
        Integer num9;
        Integer num10;
        byte[] bArr2;
        String str4;
        Boolean bool2;
        synchronized (anonymousClass097) {
            C09H c09h = anonymousClass097.A02;
            if (c09h != null) {
                C04020Ic A01 = c43211x2.A01();
                if (A01 != null) {
                    c09h.A0a = false;
                    c09h.A0Z = false;
                    c09h.A0Y = false;
                    c09h.A0X = false;
                    c09h.A0W = z;
                    synchronized (c43211x2) {
                        bool = c43211x2.A04;
                    }
                    if (bool != null) {
                        synchronized (c43211x2) {
                            bool2 = c43211x2.A04;
                        }
                        c09h.A0L = bool2.booleanValue();
                    }
                    if (c43211x2.A04() != null) {
                        c09h.A0P = c43211x2.A04().booleanValue();
                    }
                    synchronized (c43211x2) {
                        z2 = c43211x2.A0I;
                    }
                    if (z2) {
                        if (anonymousClass097.A18() != null) {
                            anonymousClass097.A18().A01();
                        }
                        c09h.A0K = null;
                        c09h.A0J = null;
                    }
                    c09h.A07 = c43211x2.A00();
                    synchronized (c43211x2) {
                        str = c43211x2.A0F;
                    }
                    if (str != null) {
                        synchronized (c43211x2) {
                            str4 = c43211x2.A0F;
                        }
                        c09h.A0I = str4;
                    }
                    synchronized (c43211x2) {
                        bArr = c43211x2.A0K;
                    }
                    if (bArr != null) {
                        C04040Ie c04040Ie = (C04040Ie) anonymousClass097;
                        synchronized (c43211x2) {
                            bArr2 = c43211x2.A0K;
                        }
                        c04040Ie.A01 = C04050If.A00(bArr2);
                    }
                    synchronized (c43211x2) {
                        num = c43211x2.A09;
                    }
                    if (num != null) {
                        synchronized (c43211x2) {
                            num10 = c43211x2.A09;
                        }
                        c09h.A02 = num10.intValue();
                    }
                    synchronized (c43211x2) {
                        num2 = c43211x2.A0A;
                    }
                    if (num2 != null) {
                        synchronized (c43211x2) {
                            num9 = c43211x2.A0A;
                        }
                        c09h.A03 = num9.intValue();
                    }
                    synchronized (c43211x2) {
                        l = c43211x2.A0D;
                    }
                    if (l != null) {
                        synchronized (c43211x2) {
                            l4 = c43211x2.A0D;
                        }
                        c09h.A09 = l4.longValue();
                    }
                    synchronized (c43211x2) {
                        str2 = c43211x2.A0G;
                    }
                    if (str2 != null) {
                        synchronized (c43211x2) {
                            str3 = c43211x2.A0G;
                        }
                        c09h.A0G = str3;
                    }
                    synchronized (c43211x2) {
                        num3 = c43211x2.A07;
                    }
                    if (num3 != null) {
                        synchronized (c43211x2) {
                            num8 = c43211x2.A07;
                        }
                        c09h.A01 = num8.intValue();
                    }
                    if (!z || A01.A02()) {
                        synchronized (c43211x2) {
                            num4 = c43211x2.A0C;
                        }
                        if (num4 != null) {
                            synchronized (c43211x2) {
                                num7 = c43211x2.A0C;
                            }
                            c09h.A08 = num7.intValue();
                        }
                        synchronized (c43211x2) {
                            num5 = c43211x2.A0B;
                        }
                        if (num5 != null) {
                            synchronized (c43211x2) {
                                num6 = c43211x2.A0B;
                            }
                            c09h.A06 = num6.intValue();
                        }
                        synchronized (c43211x2) {
                            l2 = c43211x2.A0E;
                        }
                        if (l2 != null) {
                            synchronized (c43211x2) {
                                l3 = c43211x2.A0E;
                            }
                            c09h.A0A = l3.longValue();
                        }
                        if (anonymousClass097.A0E() != null && c43211x2.A0B() != null) {
                            anonymousClass097.A0E().A03(c43211x2.A0B());
                        }
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }

    public C43221x3 A02(AnonymousClass097 anonymousClass097) {
        InterfaceC04060Ig interfaceC04060Ig;
        HashMap hashMap = this.A0i;
        synchronized (hashMap) {
            interfaceC04060Ig = (InterfaceC04060Ig) hashMap.get(anonymousClass097.A06);
        }
        if (interfaceC04060Ig instanceof C43221x3) {
            return (C43221x3) interfaceC04060Ig;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x019e, code lost:
        if (r90.A0E().A05() == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0296, code lost:
        if (r90.A0p != (-1)) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C43221x3 A03(final X.AnonymousClass097 r90, int r91, X.InterfaceC04070Ih r92, long r93, final boolean r95, boolean r96) {
        /*
            Method dump skipped, instructions count: 829
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42451vl.A03(X.097, int, X.0Ih, long, boolean, boolean):X.1x3");
    }

    public Collection A04() {
        ArrayList arrayList;
        C43181wz c43181wz = this.A0S;
        synchronized (c43181wz) {
            arrayList = new ArrayList(c43181wz.values());
        }
        return arrayList;
    }

    public void A05(AnonymousClass097 anonymousClass097, int i, InterfaceC04070Ih interfaceC04070Ih) {
        C43221x3 A03 = A03(anonymousClass097, i, interfaceC04070Ih, -1L, true, false);
        if (A03 == null) {
            return;
        }
        StringBuilder A0P = C000200d.A0P("MediaDownloadManager/start manual download ");
        A0P.append(anonymousClass097.A0n);
        A0P.append(", message.mediaHash=");
        C000200d.A1N(A0P, anonymousClass097.A06);
        this.A0f.AS1(A03);
    }

    public void A06(AnonymousClass097 anonymousClass097, int i, InterfaceC04070Ih interfaceC04070Ih, long j, boolean z, boolean z2) {
        C43221x3 A03 = A03(anonymousClass097, i, interfaceC04070Ih, j, z, z2);
        if (anonymousClass097.A0m == 0 || A03 != null) {
            StringBuilder A0P = C000200d.A0P("MediaDownloadManager/queueDownload auto download ");
            A0P.append(anonymousClass097.A0n);
            A0P.append(", message.mediaHash=");
            C000200d.A1N(A0P, anonymousClass097.A06);
            this.A0T.A07(anonymousClass097, A03);
        }
    }

    public final void A07(AnonymousClass097 anonymousClass097, boolean z, boolean z2) {
        InterfaceC04060Ig interfaceC04060Ig;
        HashMap hashMap = this.A0i;
        synchronized (hashMap) {
            interfaceC04060Ig = (InterfaceC04060Ig) hashMap.get(anonymousClass097.A06);
        }
        if (interfaceC04060Ig != null) {
            StringBuilder A0P = C000200d.A0P("MediaDownloadManager/cancelDownload/message.key=");
            A0P.append(anonymousClass097.A0n);
            A0P.append(", message.mediaHash=");
            A0P.append(anonymousClass097.A06);
            Log.i(A0P.toString());
            interfaceC04060Ig.A61(z2);
        }
        this.A0T.A06(anonymousClass097);
        if (z) {
            Set set = this.A0j;
            synchronized (set) {
                set.add(anonymousClass097.A0n);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x002e, code lost:
        if (r22.A01 != r20.A00) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x003e, code lost:
        if (r20.A01().A02 == null) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A08(boolean r19, X.C43211x2 r20, X.AnonymousClass097 r21, X.C04010Ib r22) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42451vl.A08(boolean, X.1x2, X.097, X.0Ib):void");
    }

    public final void A09(boolean z, AnonymousClass097 anonymousClass097, int i) {
        if (z) {
            if (C0DB.A0d(anonymousClass097)) {
                this.A0A.A00.A01(new ProcessVCardMessageJob(anonymousClass097.A0p));
                this.A0G.A05(anonymousClass097, 20);
            }
            this.A0E.A0W(anonymousClass097, i == 13 ? -1 : 3);
        }
    }

    public final boolean A0A(AnonymousClass097 anonymousClass097) {
        C43151ww c43151ww = this.A0T;
        boolean z = false;
        if (c43151ww.A04(anonymousClass097)) {
            return false;
        }
        synchronized (c43151ww) {
            RunnableC43241x5 runnableC43241x5 = (RunnableC43241x5) c43151ww.A01.get(anonymousClass097);
            if (runnableC43241x5 != null) {
                if (c43151ww.A05(anonymousClass097, runnableC43241x5)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public boolean A0B(final AnonymousClass097 anonymousClass097, final C04010Ib c04010Ib, final InterfaceC04070Ih interfaceC04070Ih, final boolean z, final String str, InterfaceC04060Ig interfaceC04060Ig) {
        C43221x3 A02;
        HashMap hashMap = this.A0i;
        synchronized (hashMap) {
            if (((InterfaceC04060Ig) hashMap.get(str)) == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("MediaDownloadManager/addAndDedupeDownload/No existing MMS download in progress, creating new download instance for mediaHash=");
                sb.append(str);
                Log.i(sb.toString());
                hashMap.put(str, interfaceC04060Ig);
                interfaceC04060Ig.A59(new InterfaceC04070Ih() { // from class: X.1x6
                    {
                        C42451vl.this = this;
                    }

                    @Override // X.InterfaceC04070Ih
                    public void AJX(boolean z2) {
                        HashMap hashMap2 = C42451vl.this.A0i;
                        synchronized (hashMap2) {
                            hashMap2.remove(str);
                        }
                    }

                    @Override // X.InterfaceC04070Ih
                    public void AJY(C04020Ic c04020Ic, C43211x2 c43211x2) {
                        HashMap hashMap2 = C42451vl.this.A0i;
                        synchronized (hashMap2) {
                            hashMap2.remove(str);
                        }
                    }
                });
                return false;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MediaDownloadManager/addAndDedupeDownload/MMS download already in progress (according to current downloads) mediaHash=");
            sb2.append(str);
            Log.i(sb2.toString());
            if (anonymousClass097 != null && c04010Ib != null && (A02 = A02(anonymousClass097)) != null) {
                A02.A0G.A03(new C0CG() { // from class: X.3FZ
                    {
                        C42451vl.this = this;
                    }

                    @Override // X.C0CG
                    public final void A54(Object obj) {
                        C42451vl c42451vl = C42451vl.this;
                        AnonymousClass097 anonymousClass0972 = anonymousClass097;
                        C04010Ib c04010Ib2 = c04010Ib;
                        InterfaceC04070Ih interfaceC04070Ih2 = interfaceC04070Ih;
                        boolean z2 = z;
                        C43211x2 c43211x2 = (C43211x2) obj;
                        c42451vl.A0d.A08(anonymousClass0972);
                        c42451vl.A08(true, c43211x2, anonymousClass0972, c04010Ib2);
                        if (anonymousClass0972 != null) {
                            C43181wz c43181wz = c42451vl.A0S;
                            synchronized (c43181wz) {
                                c43181wz.remove(anonymousClass0972.A0n);
                            }
                        }
                        c42451vl.A0k.execute(new RunnableEBaseShape0S0510000_I0(c42451vl, c43211x2, anonymousClass0972, c04010Ib2, interfaceC04070Ih2, z2, 2));
                    }
                }, this.A0l);
            }
            return true;
        }
    }
}
