package X;

import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.13y  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C227713y {
    public Looper A01;
    public String A04;
    public String A05;
    public final Context A06;
    public final Set A0B = new HashSet();
    public final Set A0C = new HashSet();
    public final Map A09 = new C006702y();
    public final Map A0A = new C006702y();
    public int A00 = -1;
    public C06210Ry A02 = C06210Ry.A00;
    public AbstractC30501ag A03 = C239618y.A00;
    public final ArrayList A07 = new ArrayList();
    public final ArrayList A08 = new ArrayList();

    public C227713y(Context context) {
        this.A06 = context;
        this.A01 = context.getMainLooper();
        this.A04 = context.getPackageName();
        this.A05 = context.getClass().getName();
    }

    public final C0NE A00() {
        Map map = this.A0A;
        C07K.A1b(!map.isEmpty(), "must call addApi() to add at least one API");
        C31971dF c31971dF = C31971dF.A00;
        C227413u c227413u = C239618y.A04;
        if (map.containsKey(c227413u)) {
            c31971dF = (C31971dF) map.get(c227413u);
        }
        C227413u c227413u2 = null;
        Set set = this.A0B;
        C230114w c230114w = new C230114w(set, this.A09, this.A04, this.A05, c31971dF);
        Map map2 = c230114w.A04;
        C006702y c006702y = new C006702y();
        C006702y c006702y2 = new C006702y();
        ArrayList arrayList = new ArrayList();
        Iterator it = map.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                C227413u c227413u3 = (C227413u) it.next();
                Object obj = map.get(c227413u3);
                boolean z = map2.get(c227413u3) != null;
                c006702y.put(c227413u3, Boolean.valueOf(z));
                C30841bG c30841bG = new C30841bG(c227413u3, z);
                arrayList.add(c30841bG);
                AbstractC30501ag abstractC30501ag = c227413u3.A00;
                C07K.A1c(abstractC30501ag != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
                InterfaceC30511ah A01 = abstractC30501ag.A01(this.A06, this.A01, c230114w, obj, c30841bG, c30841bG);
                c006702y2.put(c227413u3.A00(), A01);
                if (A01.AQw()) {
                    if (c227413u2 != null) {
                        String str = c227413u3.A02;
                        String str2 = c227413u2.A02;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str).length() + 21);
                        sb.append(str);
                        sb.append(" cannot be used with ");
                        sb.append(str2);
                        throw new IllegalStateException(sb.toString());
                    }
                    c227413u2 = c227413u3;
                }
            } else {
                if (c227413u2 != null) {
                    String str3 = c227413u2.A02;
                    C07K.A1e(true, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", str3);
                    C07K.A1e(set.equals(this.A0C), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", str3);
                }
                C30691b1.A00(c006702y2.values(), true);
                C30691b1 c30691b1 = new C30691b1(this.A06, new ReentrantLock(), this.A01, c230114w, this.A02, this.A03, c006702y, this.A07, this.A08, c006702y2, arrayList);
                Set set2 = C0NE.A00;
                synchronized (set2) {
                    set2.add(c30691b1);
                }
                return c30691b1;
            }
        }
    }

    public final void A01(C227413u c227413u) {
        C07K.A1Q(c227413u, "Api must not be null");
        this.A0A.put(c227413u, null);
        List A00 = c227413u.A00.A00(null);
        this.A0C.addAll(A00);
        this.A0B.addAll(A00);
    }
}
