package X;

import com.whatsapp.Mp4Ops;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.23L */
/* loaded from: classes2.dex */
public class C23L extends AbstractC43161wx {
    public static volatile C23L A0Y;
    public final C0IX A00;
    public final AbstractC000600i A01;
    public final C012005w A02;
    public final C018508q A03;
    public final C0E3 A04;
    public final Mp4Ops A05;
    public final C01B A06;
    public final C0EL A07;
    public final C000400f A08;
    public final AnonymousClass012 A09;
    public final C001200o A0A;
    public final C0C9 A0B;
    public final C40411sD A0C;
    public final C00A A0D;
    public final C003701t A0E;
    public final C04000Ia A0F;
    public final C41491u0 A0G;
    public final C0HW A0H;
    public final C43111ws A0I;
    public final C43131wu A0J;
    public final C43121wt A0K;
    public final C41571uA A0L;
    public final C43091wq A0M;
    public final C02O A0N;
    public final C0GT A0O;
    public final C0IY A0P;
    public final C0CB A0Q;
    public final C43101wr A0R;
    public final C41961un A0S;
    public final C42471vn A0T;
    public final C43141wv A0U;
    public final InterfaceC002901k A0V;
    public final C40951t8 A0W;
    public final Executor A0X;

    public C23L(C001200o c001200o, AnonymousClass012 anonymousClass012, Mp4Ops mp4Ops, C003701t c003701t, C018508q c018508q, AbstractC000600i abstractC000600i, final InterfaceC002901k interfaceC002901k, C012005w c012005w, C0HW c0hw, C0EL c0el, C0IX c0ix, C01B c01b, C40951t8 c40951t8, C41491u0 c41491u0, C0IY c0iy, C41961un c41961un, C0E3 c0e3, C43091wq c43091wq, C43101wr c43101wr, C43111ws c43111ws, C0C9 c0c9, C00A c00a, C0CB c0cb, C43121wt c43121wt, C40411sD c40411sD, C000400f c000400f, C42471vn c42471vn, C41571uA c41571uA, C43131wu c43131wu, C43141wv c43141wv, C04000Ia c04000Ia, C02O c02o, C0GT c0gt) {
        super(C007203d.A00(new InterfaceC007103c() { // from class: X.3Fd
            @Override // X.InterfaceC007103c
            public final Object get() {
                ThreadPoolExecutor A6y = interfaceC002901k.A6y("ThumbnailDownloadQueue", 1, 2, 5L, 10, new LinkedBlockingQueue());
                A6y.allowCoreThreadTimeOut(true);
                return A6y;
            }
        }));
        this.A09 = anonymousClass012;
        this.A05 = mp4Ops;
        this.A0E = c003701t;
        this.A03 = c018508q;
        this.A01 = abstractC000600i;
        this.A0A = c001200o;
        this.A0V = interfaceC002901k;
        this.A02 = c012005w;
        this.A0H = c0hw;
        this.A07 = c0el;
        this.A00 = c0ix;
        this.A06 = c01b;
        this.A0W = c40951t8;
        this.A0G = c41491u0;
        this.A0P = c0iy;
        this.A0S = c41961un;
        this.A04 = c0e3;
        this.A0M = c43091wq;
        this.A0R = c43101wr;
        this.A0I = c43111ws;
        this.A0B = c0c9;
        this.A0D = c00a;
        this.A0Q = c0cb;
        this.A0K = c43121wt;
        this.A0C = c40411sD;
        this.A08 = c000400f;
        this.A0T = c42471vn;
        this.A0L = c41571uA;
        this.A0J = c43131wu;
        this.A0U = c43141wv;
        this.A0F = c04000Ia;
        this.A0N = c02o;
        this.A0O = c0gt;
        this.A0X = new ExecutorC43201x1(interfaceC002901k);
    }

    public static C23L A00() {
        if (A0Y == null) {
            synchronized (C23L.class) {
                if (A0Y == null) {
                    A0Y = new C23L(C001200o.A01, AnonymousClass012.A00(), Mp4Ops.A00(), C003701t.A00(), C018508q.A00(), AbstractC000600i.A00(), C002801j.A00(), C012005w.A00(), C0HW.A00(), C0EL.A00(), C0IX.A00(), C01B.A00(), C40951t8.A00(), C41491u0.A00(), C0IY.A00(), C41961un.A0S(), C0E3.A06(), C43091wq.A01(), C43101wr.A01(), C43111ws.A01(), C0C9.A00(), C00A.A00, C0CB.A00(), C43121wt.A00(), C40411sD.A00(), C000400f.A00(), C42471vn.A01(), C41571uA.A00(), C43131wu.A00(), C43141wv.A01(), C04000Ia.A00(), C02O.A00(), C0GT.A00());
                }
            }
        }
        return A0Y;
    }

    public void A07(final AnonymousClass092 anonymousClass092, int i) {
        String str;
        C05610Pk c05610Pk = anonymousClass092.A0N;
        if (c05610Pk == null || c05610Pk.A06 || c05610Pk.A03 == null || c05610Pk.A05 == null || c05610Pk.A04 == null || c05610Pk.A07 == null) {
            return;
        }
        AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
        boolean A0Z = C003101m.A0Z(abstractC005302j);
        boolean z = anonymousClass092 instanceof AnonymousClass097;
        if (!z) {
            str = UUID.randomUUID().toString();
        } else {
            C09H c09h = ((AnonymousClass097) anonymousClass092).A02;
            if (c09h != null) {
                str = c09h.A0I;
                if (str == null) {
                    str = UUID.randomUUID().toString();
                }
            } else {
                throw null;
            }
        }
        if (z) {
            C09H c09h2 = ((AnonymousClass097) anonymousClass092).A02;
            if (c09h2 != null) {
                c09h2.A0I = str;
            } else {
                throw null;
            }
        }
        byte b = anonymousClass092.A0m;
        C43221x3 c43221x3 = new C43221x3(this.A0A, this.A09, this.A05, this.A0E, this.A03, this.A01, this.A0V, this.A0H, this.A02, this.A07, this.A00, this.A06, this.A0W, this.A0G, this.A0P, this.A0S, this.A04, this.A0M, this.A0R, this.A0I, this.A0Q, this.A0C, this.A0K, this.A08, this.A0L, this.A0J, this.A0U, this.A0F, this.A0N, null, new C04010Ib(C0DC.A00(b), 0, null, null, 0L, 0L, null, null, c05610Pk.A05, null, str, c05610Pk.A04, null, c05610Pk.A03, null, 0, 2, C002701i.A00(b, 0, false), 1, A0Z, false, false, false, false, false, false, false, true, c05610Pk.A07, null), i, 1L, C0E3.A00(abstractC005302j), false);
        c43221x3.A0G.A03(new C0CG() { // from class: X.3Fe
            {
                C23L.this = this;
            }

            @Override // X.C0CG
            public final void A54(Object obj) {
                C23L c23l = C23L.this;
                AnonymousClass092 anonymousClass0922 = anonymousClass092;
                C43211x2 c43211x2 = (C43211x2) obj;
                if (anonymousClass0922.A0E() != null && c43211x2.A0B() != null) {
                    c23l.A0T.A08(anonymousClass0922);
                    c23l.A0O.A03(anonymousClass0922.A0E(), new RunnableEBaseShape0S0300000_I0_0(c23l, anonymousClass0922, c43211x2, 27));
                }
            }
        }, this.A0X);
        A01(anonymousClass092, c43221x3);
    }
}
