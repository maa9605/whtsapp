package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1u0 */
/* loaded from: classes2.dex */
public class C41491u0 {
    public static volatile C41491u0 A0S;
    public final C0IX A00;
    public final AbstractC000600i A01;
    public final C012005w A02;
    public final C018508q A03;
    public final C02L A04;
    public final C0F2 A05;
    public final C01B A06;
    public final C0EL A07;
    public final AnonymousClass012 A08;
    public final C001200o A09;
    public final C40411sD A0A;
    public final C03720Gu A0B;
    public final C003701t A0C;
    public final AnonymousClass011 A0D;
    public final C04000Ia A0E;
    public final C43371xI A0F;
    public final C0HW A0G;
    public final C43401xL A0H;
    public final C43111ws A0I;
    public final C43121wt A0J;
    public final C43411xM A0K;
    public final C43381xJ A0L;
    public final C43391xK A0M;
    public final C02O A0N;
    public final C05U A0O;
    public final C0IY A0P;
    public final InterfaceC002901k A0Q;
    public final C43361xH A0R;

    public C41491u0(C001200o c001200o, AnonymousClass012 anonymousClass012, C003701t c003701t, C018508q c018508q, AbstractC000600i abstractC000600i, C02L c02l, InterfaceC002901k interfaceC002901k, C012005w c012005w, C0HW c0hw, C0EL c0el, AnonymousClass011 anonymousClass011, C0IX c0ix, C01B c01b, C43361xH c43361xH, C0IY c0iy, C43371xI c43371xI, C05U c05u, C43111ws c43111ws, C43381xJ c43381xJ, C43121wt c43121wt, C40411sD c40411sD, C43391xK c43391xK, C03720Gu c03720Gu, C43401xL c43401xL, C04000Ia c04000Ia, C02O c02o, C43411xM c43411xM, C0F2 c0f2) {
        this.A09 = c001200o;
        this.A08 = anonymousClass012;
        this.A0C = c003701t;
        this.A03 = c018508q;
        this.A01 = abstractC000600i;
        this.A04 = c02l;
        this.A0Q = interfaceC002901k;
        this.A02 = c012005w;
        this.A0G = c0hw;
        this.A07 = c0el;
        this.A0D = anonymousClass011;
        this.A00 = c0ix;
        this.A06 = c01b;
        this.A0R = c43361xH;
        this.A0P = c0iy;
        this.A0F = c43371xI;
        this.A0O = c05u;
        this.A0I = c43111ws;
        this.A0L = c43381xJ;
        this.A0J = c43121wt;
        this.A0A = c40411sD;
        this.A0M = c43391xK;
        this.A0B = c03720Gu;
        this.A0H = c43401xL;
        this.A0E = c04000Ia;
        this.A0N = c02o;
        this.A0K = c43411xM;
        this.A05 = c0f2;
    }

    public static C41491u0 A00() {
        if (A0S == null) {
            synchronized (C41491u0.class) {
                if (A0S == null) {
                    C001200o c001200o = C001200o.A01;
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C003701t A002 = C003701t.A00();
                    C018508q A003 = C018508q.A00();
                    AbstractC000600i A004 = AbstractC000600i.A00();
                    C02L A005 = C02L.A00();
                    InterfaceC002901k A006 = C002801j.A00();
                    C012005w A007 = C012005w.A00();
                    C0HW A008 = C0HW.A00();
                    C0EL A009 = C0EL.A00();
                    AnonymousClass011 A0010 = AnonymousClass011.A00();
                    C0IX A0011 = C0IX.A00();
                    C01B A0012 = C01B.A00();
                    C43361xH A0013 = C43361xH.A00();
                    C0IY A0014 = C0IY.A00();
                    C43371xI A0015 = C43371xI.A00();
                    C05U A01 = C05U.A01();
                    C43111ws A012 = C43111ws.A01();
                    if (C43381xJ.A07 == null) {
                        synchronized (C43381xJ.class) {
                            if (C43381xJ.A07 == null) {
                                C43381xJ.A07 = new C43381xJ(AnonymousClass012.A00(), AbstractC000600i.A00(), C05Q.A00(), C42591vz.A09(), C02C.A00());
                            }
                        }
                    }
                    C43381xJ c43381xJ = C43381xJ.A07;
                    C43121wt A0016 = C43121wt.A00();
                    C40411sD A0017 = C40411sD.A00();
                    C43391xK A0018 = C43391xK.A00();
                    C03720Gu A0019 = C03720Gu.A00();
                    C43401xL c43401xL = C43401xL.A01;
                    if (c43401xL == null) {
                        c43401xL = new C43401xL(C000500h.A00());
                        C43401xL.A01 = c43401xL;
                    }
                    C04000Ia A0020 = C04000Ia.A00();
                    C02O A0021 = C02O.A00();
                    if (C43411xM.A02 == null) {
                        synchronized (C43411xM.class) {
                            if (C43411xM.A02 == null) {
                                C43411xM.A02 = new C43411xM(C0HW.A00(), C04000Ia.A00());
                            }
                        }
                    }
                    A0S = new C41491u0(c001200o, A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A01, A012, c43381xJ, A0016, A0017, A0018, A0019, c43401xL, A0020, A0021, C43411xM.A02, C0F2.A00());
                }
            }
        }
        return A0S;
    }

    public C04130Ir A01(List list, C09H c09h, byte b, int i, String str, Uri uri, AnonymousClass092 anonymousClass092, List list2, boolean z) {
        return A02(list, c09h, b, i, str, uri, anonymousClass092, list2, z, 0, null);
    }

    public C04130Ir A02(List list, C09H c09h, byte b, int i, String str, Uri uri, AnonymousClass092 anonymousClass092, List list2, boolean z, int i2, List list3) {
        StringBuilder sb = new StringBuilder("mediafactory/createmediamessages/uri=");
        sb.append(uri);
        Log.i(sb.toString());
        ArrayList arrayList = new ArrayList();
        String A0C = list.size() > 1 ? A0C() : null;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(A08((AbstractC005302j) it.next(), c09h.A02(), b, i, str, uri, anonymousClass092, A0C, list2, z, i2, list3));
        }
        return new C04130Ir(arrayList);
    }

    public C04130Ir A03(List list, C09H c09h, int i, String str, AnonymousClass092 anonymousClass092, boolean z) {
        return A01(list, c09h, (byte) 9, i, str, null, anonymousClass092, null, z);
    }

    public C04140Is A04(String str) {
        if (str != null) {
            C43121wt c43121wt = this.A0J;
            synchronized (c43121wt) {
                C06F c06f = c43121wt.A00;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(1);
                if (c06f.A04(sb.toString()) != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(1);
                    return (C04140Is) c06f.A04(sb2.toString());
                }
                return null;
            }
        }
        return null;
    }

    public C04140Is A05(String str, boolean z, boolean z2) {
        if (str != null) {
            C04140Is A03 = this.A0J.A03(str, z2 ? 3 : 1);
            if (A03 != null) {
                if (z) {
                    A03.A03++;
                }
                return A03;
            }
            return null;
        }
        return null;
    }

    public C43431xO A06(C04150It c04150It) {
        return A0B().booleanValue() ? new C43421xN(this.A09, this.A08, this.A0C, this.A03, this.A01, this.A0Q, this.A02, this.A0G, this.A07, this.A00, this.A06, this.A0P, this.A0F, this.A0I, this.A0L, this.A0A, this.A0M, this.A0B, this.A0H, this.A0E, this.A0N, this.A0K, this.A05, c04150It) : new C43431xO(this.A08, this.A03, this.A01, this.A0Q, this.A02, this.A0G, this.A07, this.A06, this.A0P, this.A0F, this.A0I, this.A0L, this.A0A, this.A0M, this.A0B, this.A0H, this.A0E, this.A0N, this.A0K, c04150It);
    }

    public AnonymousClass097 A07(AbstractC005302j abstractC005302j, C09H c09h, byte b, int i, AnonymousClass092 anonymousClass092, boolean z) {
        return A09(abstractC005302j, c09h, b, i, null, null, anonymousClass092, null, z);
    }

    public AnonymousClass097 A08(AbstractC005302j abstractC005302j, C09H c09h, byte b, int i, String str, Uri uri, AnonymousClass092 anonymousClass092, String str2, List list, boolean z, int i2, List list2) {
        AnonymousClass097 A03 = this.A0O.A03(abstractC005302j, c09h, this.A08.A05(), 0, b, 1, null, 0L, i, anonymousClass092);
        if (str != null) {
            A03.A04 = str.trim();
            if (TextUtils.isEmpty(A03.A1A())) {
                A03.A04 = null;
            }
        }
        File file = c09h.A0F;
        if (file != null) {
            A03.A08 = file.getName();
            A03.A01 = c09h.A0F.length();
        } else if (uri != null) {
            A03.A08 = uri.toString();
            A03.A01 = 0L;
        } else {
            throw null;
        }
        if (b == 2 || b == 3 || b == 43 || b == 13) {
            long j = c09h.A0D;
            if (j <= 0 && c09h.A0E <= 0) {
                A03.A00 = C0DD.A03(c09h.A0F);
            } else {
                A03.A00 = (int) ((c09h.A0E - j) / 1000);
            }
        }
        A03.A0v(list);
        c09h.A0A = A03.A01;
        c09h.A0L = true;
        A03.A0m(str2);
        if (z) {
            A03.A0U(4);
        }
        if (list2 != null && !list2.isEmpty()) {
            c09h.A0V = (InteractiveAnnotation[]) list2.toArray(new InteractiveAnnotation[0]);
        }
        if (i2 > 0) {
            A03.A0U(1);
            ((AnonymousClass092) A03).A03 = i2;
        }
        return A03;
    }

    public AnonymousClass097 A09(AbstractC005302j abstractC005302j, C09H c09h, byte b, int i, String str, Uri uri, AnonymousClass092 anonymousClass092, List list, boolean z) {
        return A08(abstractC005302j, c09h, b, i, str, uri, anonymousClass092, null, list, z, 0, null);
    }

    public C04160Iu A0A(AbstractC005302j abstractC005302j, C09H c09h, Uri uri, AnonymousClass092 anonymousClass092) {
        return (C04160Iu) A08(abstractC005302j, c09h, (byte) 23, 0, null, uri, anonymousClass092, null, null, false, 0, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x001f, code lost:
        if (r1 == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Boolean A0B() {
        /*
            r3 = this;
            X.01t r1 = r3.A0C
            r0 = 147(0x93, float:2.06E-43)
            boolean r0 = r1.A0C(r0)
            if (r0 != 0) goto L14
            X.01B r1 = r3.A06
            X.03B r0 = X.C01C.A2Z
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L21
        L14:
            X.1xH r2 = r3.A0R
            monitor-enter(r2)
            boolean r1 = r2.A01     // Catch: java.lang.Throwable -> L1a
            goto L1d
        L1a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L1d:
            monitor-exit(r2)
            r0 = 1
            if (r1 != 0) goto L22
        L21:
            r0 = 0
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41491u0.A0B():java.lang.Boolean");
    }

    public String A0C() {
        byte[] A03 = C05V.A03(this.A08, this.A04, false);
        if (A03 != null) {
            return C02A.A03(A03);
        }
        throw new IllegalStateException("multicast id could not be created");
    }
}
