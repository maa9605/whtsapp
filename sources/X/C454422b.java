package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.22b */
/* loaded from: classes2.dex */
public class C454422b {
    public final C43591xe A00;
    public final AnonymousClass232 A01;
    public final C22a A02;
    public final String A03;

    public C454422b(String str, C22a c22a, AnonymousClass232 anonymousClass232, C43591xe c43591xe) {
        this.A03 = str;
        this.A02 = c22a;
        this.A01 = anonymousClass232;
        this.A00 = c43591xe;
    }

    public static C454422b A00(C455322l c455322l, C22a c22a, C04130Ir c04130Ir, C02L c02l, C43091wq c43091wq, boolean z) {
        boolean z2;
        C04050If c04050If;
        boolean z3;
        boolean z4;
        C09H c09h = c04130Ir.A00().A02;
        if (c09h != null) {
            String str = c09h.A0I;
            C67533Fw c67533Fw = new C67533Fw(c43091wq);
            CopyOnWriteArrayList copyOnWriteArrayList = c04130Ir.A01;
            Iterator it = copyOnWriteArrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        z4 = c67533Fw.A00.A06((AnonymousClass097) it.next());
                        continue;
                    } catch (IOException e) {
                        Log.e("transcodeutils/needtranscodemedia exception", e);
                        z4 = true;
                        continue;
                    }
                    if (z4) {
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            AnonymousClass097 A00 = c04130Ir.A00();
            boolean A04 = c04130Ir.A04();
            C09H c09h2 = A00.A02;
            if (c09h2 != null) {
                if (A00 instanceof C04040Ie) {
                    c04050If = ((C04040Ie) A00).A01;
                } else {
                    c04050If = null;
                }
                AnonymousClass232 anonymousClass232 = new AnonymousClass232(c09h2.A0H, c09h2.A0F, A00.A1B(), A00.A06, A00.A07, C0DC.A02(A00), c09h2.A05, ((AnonymousClass092) A00).A04, c09h2.A0D, c09h2.A0E, A04, z2, !c09h2.A0O, c04050If, c455322l.A01(A00.A0m, A04), z, c09h2.A0N);
                AnonymousClass097 A002 = c04130Ir.A00();
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!C0DB.A0J(c02l, (AnonymousClass092) it2.next())) {
                            z3 = true;
                            break;
                        }
                    } else {
                        z3 = false;
                        break;
                    }
                }
                C09H c09h3 = A002.A02;
                if (c09h3 != null) {
                    C43621xh A003 = C43621xh.A00(c09h3, A002.A0E);
                    C04030Id A18 = A002.A18();
                    byte b = A002.A0m;
                    int i = ((AnonymousClass092) A002).A04;
                    C0DC A01 = C0DC.A01(b, i);
                    File file = c09h3.A0F;
                    long j = A002.A01;
                    String str2 = A002.A06;
                    String str3 = A002.A05;
                    int[] A07 = A18 != null ? A18.A07() : null;
                    int i2 = c09h3.A04;
                    boolean z5 = true;
                    if ((!C0DB.A0d(A002) || !A002.A14(1)) && ((AnonymousClass092) A002).A04 != 3) {
                        z5 = false;
                    }
                    return new C454422b(str, c22a, anonymousClass232, new C43591xe(A01, file, j, A003, str2, str3, i, z3, "mms", true, false, A07, i2, z5, null));
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public static C454422b A01(C22a c22a, int i, C0DC c0dc, Uri uri, C454522c c454522c, boolean z, boolean z2, C43621xh c43621xh, boolean z3) {
        return new C454422b(null, c22a, new AnonymousClass232(null, null, uri.toString(), null, null, c0dc, 0, i, 0L, 0L, z, z2, z2, null, c454522c, false, false), new C43591xe(c0dc, null, 0L, c43621xh, null, null, i, true, "optimistic", true, z3, null, 0, i == 3, null));
    }
}
