package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import java.util.Iterator;

/* renamed from: X.0EO  reason: invalid class name */
/* loaded from: classes.dex */
public class C0EO {
    public static volatile C0EO A06;
    public final Handler A00;
    public final Handler A01;
    public final Handler A02;
    public final C0FO A03;
    public final C00A A04;
    public final C0EX A05;

    public C0EO(final C05M c05m, final C0EB c0eb, final C0FO c0fo, final C00A c00a, final C03340Fh c03340Fh, C0EX c0ex) {
        this.A03 = c0fo;
        this.A04 = c00a;
        this.A05 = c0ex;
        final Looper mainLooper = Looper.getMainLooper();
        this.A00 = new Handler(mainLooper) { // from class: X.0GM
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) message.obj;
                int i = message.what;
                if (i == 3) {
                    C00A c00a2 = c00a;
                    if (c00a2 != null) {
                        C000700j.A01();
                        Iterator it = c00a2.A00.iterator();
                        while (true) {
                            C0G5 c0g5 = (C0G5) it;
                            if (!c0g5.hasNext()) {
                                return;
                            }
                            ((C00T) c0g5.next()).A06(anonymousClass092);
                        }
                    } else {
                        throw null;
                    }
                } else if (i == 4) {
                    C0FO c0fo2 = c0fo;
                    AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
                    if (abstractC005302j != null) {
                        c0fo2.A02(abstractC005302j);
                        c00a.A04(anonymousClass092, message.arg1);
                        return;
                    }
                    throw null;
                } else if (i == 5) {
                    C0EO c0eo = C0EO.this;
                    c0eo.A04.A04(anonymousClass092, message.arg1);
                    AnonymousClass093 anonymousClass093 = anonymousClass092.A0F;
                    if (anonymousClass093 != null) {
                        C0EX c0ex2 = c0eo.A05;
                        C000700j.A01();
                        Iterator it2 = c0ex2.A00.iterator();
                        while (true) {
                            C0G5 c0g52 = (C0G5) it2;
                            if (!c0g52.hasNext()) {
                                break;
                            }
                            ((InterfaceC28001Pq) c0g52.next()).AMt(anonymousClass093);
                        }
                    }
                    C0FO c0fo3 = c0eo.A03;
                    AbstractC005302j abstractC005302j2 = anonymousClass092.A0n.A00;
                    if (abstractC005302j2 == null) {
                        throw null;
                    }
                    c0fo3.A04(abstractC005302j2, false);
                } else if (i == 6) {
                    c0fo.A01();
                } else if (i != 7) {
                } else {
                    C00A c00a3 = c00a;
                    if (c00a3 != null) {
                        C000700j.A01();
                        Iterator it3 = c00a3.A00.iterator();
                        while (true) {
                            C0G5 c0g53 = (C0G5) it3;
                            if (!c0g53.hasNext()) {
                                return;
                            }
                            ((C00T) c0g53.next()).A04();
                        }
                    } else {
                        throw null;
                    }
                }
            }
        };
        final Looper mainLooper2 = Looper.getMainLooper();
        this.A02 = new Handler(mainLooper2) { // from class: X.0GN
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                AnonymousClass092 anonymousClass092;
                AnonymousClass092 anonymousClass0922;
                if (message.what == 11) {
                    Pair pair = (Pair) message.obj;
                    anonymousClass092 = (AnonymousClass092) pair.first;
                    anonymousClass0922 = (AnonymousClass092) pair.second;
                } else {
                    anonymousClass092 = (AnonymousClass092) message.obj;
                    anonymousClass0922 = null;
                }
                int i = message.what;
                if (i != 2) {
                    switch (i) {
                        case 10:
                            C00A c00a2 = c00a;
                            if (c00a2 != null) {
                                C000700j.A01();
                                Iterator it = c00a2.A00.iterator();
                                while (true) {
                                    C0G5 c0g5 = (C0G5) it;
                                    if (!c0g5.hasNext()) {
                                        return;
                                    }
                                    ((C00T) c0g5.next()).A01(anonymousClass092);
                                }
                            } else {
                                throw null;
                            }
                        case GoogleMigrateImporterActivity.A0E /* 11 */:
                            C00A c00a3 = c00a;
                            if (c00a3 == null) {
                                throw null;
                            }
                            if (anonymousClass0922 == null) {
                                return;
                            }
                            C000700j.A01();
                            Iterator it2 = c00a3.A00.iterator();
                            while (true) {
                                C0G5 c0g52 = (C0G5) it2;
                                if (!c0g52.hasNext()) {
                                    return;
                                }
                                ((C00T) c0g52.next()).A09(anonymousClass092, anonymousClass0922);
                            }
                        case 12:
                            C03340Fh c03340Fh2 = c03340Fh;
                            AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
                            if (abstractC005302j != null) {
                                AbstractC005302j abstractC005302j2 = abstractC005302j;
                                synchronized (c03340Fh2.A00) {
                                    Iterator it3 = c03340Fh2.A00.iterator();
                                    while (true) {
                                        C0G5 c0g53 = (C0G5) it3;
                                        if (c0g53.hasNext()) {
                                            ((C0GG) c0g53.next()).A07(abstractC005302j2);
                                        }
                                    }
                                }
                                return;
                            }
                            throw null;
                        case 13:
                            C03340Fh c03340Fh3 = c03340Fh;
                            AbstractC005302j abstractC005302j3 = anonymousClass092.A0n.A00;
                            if (abstractC005302j3 != null) {
                                AbstractC005302j abstractC005302j4 = abstractC005302j3;
                                synchronized (c03340Fh3.A00) {
                                    Iterator it4 = c03340Fh3.A00.iterator();
                                    while (true) {
                                        C0G5 c0g54 = (C0G5) it4;
                                        if (c0g54.hasNext()) {
                                            ((C0GG) c0g54.next()).A06(abstractC005302j4);
                                        }
                                    }
                                }
                                return;
                            }
                            throw null;
                        default:
                            return;
                    }
                } else {
                    C0EO.this.A02(anonymousClass092, message.arg1);
                }
            }
        };
        final Looper mainLooper3 = Looper.getMainLooper();
        this.A01 = new Handler(mainLooper3) { // from class: X.0GO
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    C0FO c0fo2 = c0fo;
                    AbstractC005302j A02 = AbstractC005302j.A02((String) message.obj);
                    if (A02 != null) {
                        c0fo2.A04(A02, false);
                        return;
                    }
                    throw null;
                } else if (i == 2) {
                    AbstractC005302j A022 = AbstractC005302j.A02((String) message.obj);
                    if (A022 != null) {
                        c00a.A03(A022);
                        c0fo.A04(A022, false);
                        return;
                    }
                    throw null;
                } else if (i == 8) {
                    C0EB c0eb2 = c0eb;
                    c0eb2.A0C();
                    c0eb2.A05.clear();
                    C00A c00a2 = c00a;
                    c00a2.A03(C04580Kz.A00);
                    for (AbstractC005302j abstractC005302j : c05m.A0B()) {
                        c00a2.A03(abstractC005302j);
                        c0fo.A04(abstractC005302j, true);
                    }
                } else if (i == 9) {
                    C0EB c0eb3 = c0eb;
                    c0eb3.A0C();
                    c0eb3.A05.clear();
                    C00A c00a3 = c00a;
                    c00a3.A03(C04580Kz.A00);
                    C05M c05m2 = c05m;
                    for (AbstractC005302j abstractC005302j2 : c05m2.A0B()) {
                        if (!C003101m.A0V(abstractC005302j2)) {
                            synchronized (c05m2) {
                                if (abstractC005302j2 != null) {
                                    c05m2.A0C().remove(abstractC005302j2);
                                }
                            }
                            C0FO c0fo3 = c0fo;
                            c0fo3.A06.A0E(abstractC005302j2);
                            C03340Fh c03340Fh2 = c0fo3.A05;
                            c03340Fh2.A02();
                            c03340Fh2.A06(abstractC005302j2);
                        } else {
                            c0fo.A04(abstractC005302j2, true);
                        }
                        c00a3.A03(abstractC005302j2);
                    }
                }
            }
        };
    }

    public static C0EO A00() {
        if (A06 == null) {
            synchronized (C0EO.class) {
                if (A06 == null) {
                    A06 = new C0EO(C05M.A00(), C0EB.A00(), C0FO.A00(), C00A.A00, C03340Fh.A00, C0EX.A00);
                }
            }
        }
        return A06;
    }

    public void A01(AnonymousClass092 anonymousClass092, int i) {
        this.A02.post(new C1OI(this, anonymousClass092, i));
    }

    public final void A02(AnonymousClass092 anonymousClass092, int i) {
        this.A04.A05(anonymousClass092, i);
        C0FO c0fo = this.A03;
        AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
        if (abstractC005302j != null) {
            c0fo.A04(abstractC005302j, false);
            AnonymousClass093 anonymousClass093 = anonymousClass092.A0F;
            if (anonymousClass093 != null) {
                this.A05.A02(anonymousClass093);
                return;
            }
            return;
        }
        throw null;
    }
}
