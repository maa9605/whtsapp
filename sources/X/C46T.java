package X;

import com.whatsapp.util.Log;

/* renamed from: X.46T */
/* loaded from: classes3.dex */
public class C46T {
    public final C00J A00;
    public final C00J A01;
    public final C00J A02;

    public C46T(C00J c00j, C00J c00j2, C00J c00j3) {
        this.A01 = c00j;
        this.A02 = c00j2;
        this.A00 = c00j3;
    }

    public void A00(C46O c46o, C46P c46p, C46R c46r) {
        int max = Math.max(0, 1);
        int i = 0;
        do {
            try {
                c46o.A00 = null;
                c46p.A7Q(c46o);
            } catch (Exception e) {
                c46o.A00 = e;
            }
            i++;
            if (i >= max) {
                break;
            }
        } while (c46o.A00 != null);
        ((C018508q) this.A00.get()).A02.post(new RunnableC56812o4(this, c46r, c46o));
    }

    /* renamed from: A01 */
    public final void A02(C46R c46r, C46O c46o) {
        if (c46r != null) {
            try {
                ((C018508q) this.A00.get()).A02.post(new RunnableC56822o6(c46r, c46o));
            } catch (Exception e) {
                Log.e(e);
            }
        }
    }
}
