package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4Gd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C91754Gd extends C28V {
    public final C3NV A00;
    public final String A01;

    public C91754Gd(Context context, C018508q c018508q, C0E7 c0e7, C28S c28s, C3NV c3nv, String str) {
        super(context, c018508q, c0e7, c28s);
        this.A01 = str;
        this.A00 = c3nv;
    }

    @Override // X.C28V
    public void A02(C28Q c28q) {
        StringBuilder A0P = C000200d.A0P("PAY: onRequestError action: ");
        String str = this.A01;
        A0P.append(str);
        A0P.append(" error: ");
        A0P.append(c28q);
        Log.i(A0P.toString());
        C3NV c3nv = this.A00;
        if (c3nv != null) {
            c3nv.A06(str, c28q.A00);
        }
    }

    @Override // X.C28V
    public void A03(C28Q c28q) {
        StringBuilder A0P = C000200d.A0P("PAY: onResponseError action: ");
        String str = this.A01;
        A0P.append(str);
        A0P.append(" error: ");
        A0P.append(c28q);
        Log.i(A0P.toString());
        C3NV c3nv = this.A00;
        if (c3nv != null) {
            c3nv.A06(str, c28q.A00);
            int i = c28q.A00;
            if (i != 403 && i != 405 && i != 406 && i != 426 && i != 460 && i != 410 && i != 409 && i != 2826008) {
                if (i == 440) {
                    synchronized (c3nv) {
                        c3nv.A02 = i;
                        CopyOnWriteArrayList copyOnWriteArrayList = c3nv.A06;
                        StringBuilder sb = new StringBuilder();
                        sb.append("tos-");
                        sb.append(i);
                        copyOnWriteArrayList.add(sb.toString());
                    }
                    return;
                }
                return;
            }
            synchronized (c3nv) {
                c3nv.A01 = i;
                CopyOnWriteArrayList copyOnWriteArrayList2 = c3nv.A06;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("payability-");
                sb2.append(i);
                copyOnWriteArrayList2.add(sb2.toString());
            }
        }
    }

    @Override // X.C28V
    public void A04(C02590Ca c02590Ca) {
        StringBuilder A0P = C000200d.A0P("PAY: onResponseSuccess for op: action: ");
        String str = this.A01;
        C000200d.A1N(A0P, str);
        C3NV c3nv = this.A00;
        if (c3nv != null) {
            c3nv.A05(str);
        }
    }
}
