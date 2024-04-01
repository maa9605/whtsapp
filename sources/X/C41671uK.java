package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1uK */
/* loaded from: classes2.dex */
public class C41671uK {
    public static volatile C41671uK A07;
    public final C0C9 A00;
    public final C2UD A01;
    public final C41561u9 A02;
    public final AnonymousClass079 A03;
    public final C2UC A04;
    public final C0EN A05;
    public final C0EJ A06;

    public C41671uK(C0EN c0en, C0C9 c0c9, C41561u9 c41561u9, C2UC c2uc, C0EJ c0ej, C2UD c2ud, AnonymousClass079 anonymousClass079) {
        this.A05 = c0en;
        this.A00 = c0c9;
        this.A02 = c41561u9;
        this.A04 = c2uc;
        this.A06 = c0ej;
        this.A01 = c2ud;
        this.A03 = anonymousClass079;
    }

    public static C41671uK A00() {
        if (A07 == null) {
            synchronized (C41671uK.class) {
                if (A07 == null) {
                    C0EN A00 = C0EN.A00();
                    C0C9 A002 = C0C9.A00();
                    C41561u9 A003 = C41561u9.A00();
                    if (C2UC.A04 == null) {
                        synchronized (C2UC.class) {
                            if (C2UC.A04 == null) {
                                C2UC.A04 = new C2UC(C002801j.A00(), C41541u6.A00(), C0EN.A00(), C44311yr.A00());
                            }
                        }
                    }
                    C2UC c2uc = C2UC.A04;
                    C0EJ A004 = C0EJ.A00();
                    if (C2UD.A03 == null) {
                        synchronized (C2UD.class) {
                            if (C2UD.A03 == null) {
                                C2UD.A03 = new C2UD(C05U.A01(), C0C9.A00(), C05E.A00());
                            }
                        }
                    }
                    A07 = new C41671uK(A00, A002, A003, c2uc, A004, C2UD.A03, AnonymousClass079.A00());
                }
            }
        }
        return A07;
    }

    public final void A01(AnonymousClass092 anonymousClass092, C05190Nr c05190Nr) {
        C0CD A04;
        if ("peer".equals(c05190Nr.A0N)) {
            C2UC c2uc = this.A04;
            if (c2uc != null) {
                if (anonymousClass092 instanceof C44911zr) {
                    C44911zr c44911zr = (C44911zr) anonymousClass092;
                    try {
                        try {
                            try {
                                C44311yr c44311yr = c2uc.A01;
                                DeviceJid deviceJid = c44911zr.A0v;
                                if (deviceJid != null) {
                                    HashMap A1B = c44911zr.A1B();
                                    HashSet hashSet = new HashSet(A1B.values());
                                    hashSet.remove(null);
                                    c44311yr.A0A(hashSet);
                                    Set keySet = A1B.keySet();
                                    StringBuilder sb = new StringBuilder("SyncdKeyManager/handleAppStateSyncKeyShareMessage syncdKeyIds = ");
                                    sb.append(keySet);
                                    Log.i(sb.toString());
                                    boolean z = keySet.size() == hashSet.size();
                                    C41421tt c41421tt = c44311yr.A07;
                                    List A05 = c41421tt.A05((byte) 39);
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = ((ArrayList) A05).iterator();
                                    while (it.hasNext()) {
                                        C44991zz c44991zz = (C44991zz) it.next();
                                        if (z || deviceJid.equals(((C0JU) c44991zz).A00)) {
                                            if (keySet.equals(Collections.unmodifiableSet(c44991zz.A00))) {
                                                arrayList.add(Long.valueOf(c44991zz.A0p));
                                            }
                                        }
                                    }
                                    c41421tt.A07(arrayList);
                                    Set A052 = c44311yr.A05();
                                    if ((!((HashSet) A052).isEmpty()) && ((HashSet) c44311yr.A06()).isEmpty()) {
                                        StringBuilder sb2 = new StringBuilder("SyncdKeyManager/handleAppStateSyncKeyShareMessage: One or more keys missing on all the clients for collection(s): ");
                                        sb2.append(A052);
                                        Log.e(sb2.toString());
                                        throw new Exception() { // from class: X.2UE
                                        };
                                    }
                                    c2uc.A03.AS1(new RunnableEBaseShape4S0100000_I0_4(c2uc.A00, 30));
                                }
                            } catch (C2UE unused) {
                                c2uc.A00.A0S(30);
                            }
                        } catch (C44921zs e) {
                            c2uc.A00.A0S(e.errorCode);
                        }
                        return;
                    } finally {
                        c2uc.A02.A02(c44911zr);
                    }
                } else if (anonymousClass092 instanceof C44991zz) {
                    C44991zz c44991zz2 = (C44991zz) anonymousClass092;
                    C44311yr c44311yr2 = c2uc.A01;
                    if (c44311yr2 != null) {
                        DeviceJid deviceJid2 = c44991zz2.A0v;
                        if (deviceJid2 != null) {
                            HashMap A042 = c44311yr2.A04(Collections.unmodifiableSet(c44991zz2.A00));
                            StringBuilder sb3 = new StringBuilder("SyncdKeyManager/handleAppStateSyncKeyRequestMessage syncdKeyMap = ");
                            sb3.append(A042);
                            Log.i(sb3.toString());
                            c44311yr2.A0B(false, A042, deviceJid2);
                        }
                        c2uc.A02.A02(c44991zz2);
                        return;
                    }
                    throw null;
                } else if (!(anonymousClass092 instanceof C2UF)) {
                    if (anonymousClass092 != null) {
                        c2uc.A02.A02(anonymousClass092);
                        return;
                    }
                    return;
                } else {
                    C2UF c2uf = (C2UF) anonymousClass092;
                    C41541u6 c41541u6 = c2uc.A00;
                    long j = c2uf.A00;
                    synchronized (c41541u6) {
                        if (c41541u6.A0W() || c41541u6.A0F.A02.A03().getBoolean("syncd_soft_fatal_on_device", false)) {
                            C44411z1 c44411z1 = c41541u6.A0F;
                            synchronized (c44411z1) {
                                C42961wc c42961wc = c44411z1.A02;
                                long j2 = c42961wc.A03().getLong("syncd_soft_fatal_time", 0L);
                                if (j2 == 0 || j < j2) {
                                    c42961wc.A02().putLong("syncd_soft_fatal_time", j).apply();
                                }
                            }
                        }
                    }
                    c2uc.A02.A02(c2uf);
                    return;
                }
            }
            throw null;
        }
        C07860aD A03 = this.A06.A03(c05190Nr);
        if (A03 != null) {
            A03.A00(4);
        }
        if (anonymousClass092 == null) {
            C2UD c2ud = this.A01;
            A04 = c2ud.A01.A04();
            try {
                C0C9 c0c9 = c2ud.A00;
                AnonymousClass094 anonymousClass094 = c05190Nr.A09;
                if (anonymousClass094 == null) {
                    anonymousClass094 = c05190Nr.A0b;
                }
                if (c0c9.A0F(anonymousClass094) == null) {
                    C05U c05u = c2ud.A02;
                    AnonymousClass094 anonymousClass0942 = c05190Nr.A09;
                    if (anonymousClass0942 == null) {
                        anonymousClass0942 = c05190Nr.A0b;
                    }
                    AnonymousClass092 A02 = c05u.A02(anonymousClass0942, c05190Nr.A0Y, (byte) 11);
                    c05190Nr.A06(A02);
                    c0c9.A0j(A02);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        A04.close();
                    } catch (Throwable unused2) {
                    }
                }
            }
        } else if ((anonymousClass092 instanceof C03890Hn) && anonymousClass092.A00 == 7) {
            this.A02.A04((C03890Hn) anonymousClass092, true);
        } else {
            if (anonymousClass092 instanceof C0KU) {
                AnonymousClass079 anonymousClass079 = this.A03;
                C0KU c0ku = (C0KU) anonymousClass092;
                AnonymousClass071 anonymousClass071 = anonymousClass079.A00;
                if (anonymousClass071.A01(c0ku.A00)) {
                    C0IT A022 = anonymousClass079.A02(c0ku);
                    if (A022 != null) {
                        C0CM c0cm = A022.A0N;
                        AbstractC005302j abstractC005302j = c0ku.A0n.A00;
                        long j3 = c0ku.A0E;
                        if (!anonymousClass071.A03(abstractC005302j, j3, c0ku.A00, j3, c0cm) && c0ku.A07 == 0) {
                            A04 = anonymousClass079.A03.A04();
                            try {
                                C03790Hb A00 = A04.A00();
                                anonymousClass079.A04(c0ku, A022);
                                A00.A00();
                                A00.close();
                                A04.close();
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } finally {
                                    try {
                                        A04.close();
                                    } catch (Throwable unused3) {
                                    }
                                }
                            }
                        }
                    }
                }
                this.A05.A02(anonymousClass092);
                return;
            }
            this.A00.A0j(anonymousClass092);
        }
    }
}
