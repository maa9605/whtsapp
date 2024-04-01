package X;

import com.whatsapp.jid.UserJid;
import java.util.Collections;

/* renamed from: X.28u */
/* loaded from: classes2.dex */
public class C469228u {
    public static volatile C469228u A08;
    public final C06K A00;
    public final C29H A01;
    public final C29E A02;
    public final C29F A03;
    public final C29G A04;
    public final C29I A05;
    public final C29D A06;
    public final C29J A07;

    public C469228u(C06K c06k, C29D c29d, C29E c29e, C29F c29f, C29G c29g, C29H c29h, C29I c29i, C29J c29j) {
        this.A00 = c06k;
        this.A06 = c29d;
        this.A02 = c29e;
        this.A03 = c29f;
        this.A04 = c29g;
        this.A01 = c29h;
        this.A05 = c29i;
        this.A07 = c29j;
    }

    public static C469228u A00() {
        if (A08 == null) {
            synchronized (C469228u.class) {
                if (A08 == null) {
                    C06K A00 = C06K.A00();
                    if (C29D.A01 == null) {
                        synchronized (C29D.class) {
                            if (C29D.A01 == null) {
                                C29D.A01 = new C29D(C05W.A00());
                            }
                        }
                    }
                    C29D c29d = C29D.A01;
                    if (C29E.A05 == null) {
                        synchronized (C29E.class) {
                            if (C29E.A05 == null) {
                                C29E.A05 = new C29E(AbstractC000600i.A00(), C02L.A00(), C0EC.A00(), C41401tr.A01(), C41711uO.A00());
                            }
                        }
                    }
                    C29E c29e = C29E.A05;
                    if (C29F.A02 == null) {
                        synchronized (C29F.class) {
                            if (C29F.A02 == null) {
                                C29F.A02 = new C29F(C013406l.A00(), C0DW.A00());
                            }
                        }
                    }
                    C29F c29f = C29F.A02;
                    if (C29G.A01 == null) {
                        synchronized (C29G.class) {
                            if (C29G.A01 == null) {
                                C29G.A01 = new C29G(C456723a.A00());
                            }
                        }
                    }
                    C29G c29g = C29G.A01;
                    if (C29H.A0A == null) {
                        synchronized (C29H.class) {
                            if (C29H.A0A == null) {
                                C29H.A0A = new C29H(C018508q.A00(), AbstractC000600i.A00(), AnonymousClass011.A00(), C0EG.A00(), C05W.A00(), C0C9.A00(), AnonymousClass075.A00(), C41681uL.A00(), C06K.A00(), C06M.A00);
                            }
                        }
                    }
                    C29H c29h = C29H.A0A;
                    if (C29I.A01 == null) {
                        synchronized (C29I.class) {
                            if (C29I.A01 == null) {
                                C29I.A01 = new C29I(C05W.A00());
                            }
                        }
                    }
                    C29I c29i = C29I.A01;
                    if (C29J.A01 == null) {
                        synchronized (C29J.class) {
                            if (C29J.A01 == null) {
                                C29J.A01 = new C29J(C05W.A00());
                            }
                        }
                    }
                    A08 = new C469228u(A00, c29d, c29e, c29f, c29g, c29h, c29i, C29J.A01);
                }
            }
        }
        return A08;
    }

    public void A01(C29K c29k, C29L c29l, C06C c06c) {
        UserJid userJid = c29k.A07;
        if (userJid == null) {
            throw null;
        }
        if (userJid.equals(c06c.A02())) {
            A02(c29l, Collections.singletonMap(c29k.A07, c29k), null, Collections.singletonList(new C29M(c06c)), null);
            return;
        }
        StringBuilder A0P = C000200d.A0P("jid doesn't match, jid1=");
        A0P.append(c29k.A07);
        A0P.append(", jid2=");
        A0P.append(c06c.A02());
        throw new IllegalArgumentException(A0P.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:521:0x006d, code lost:
        if (r3 != 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0095, code lost:
        if (r5.A0X != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x024f, code lost:
        if (r5.A0W != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x04de, code lost:
        if (r9.get(r10) == null) goto L326;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:551:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:916:0x043d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:924:0x02f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:927:0x045e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:929:0x0439 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:934:0x0447 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r31v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.HashSet, java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(X.C29L r29, java.util.Map r30, java.util.Map r31, java.util.List r32, X.C05270Nz r33) {
        /*
            Method dump skipped, instructions count: 1946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C469228u.A02(X.29L, java.util.Map, java.util.Map, java.util.List, X.0Nz):void");
    }
}
