package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.0CK */
/* loaded from: classes.dex */
public class C0CK implements C0CG {
    public Object A00;
    public final Object A01 = new Object();
    public final List A02 = new ArrayList();

    public Object A00() {
        Object obj;
        synchronized (this.A01) {
            obj = this.A00;
        }
        return obj;
    }

    public void A01() {
        synchronized (this.A01) {
            this.A02.clear();
        }
    }

    public void A02(C0CG c0cg) {
        synchronized (this.A01) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                if (((C0CG) ((Pair) it.next()).first).equals(c0cg)) {
                    it.remove();
                }
            }
        }
    }

    public void A03(C0CG c0cg, Executor executor) {
        Object obj;
        synchronized (this.A01) {
            obj = this.A00;
            this.A02.add(Pair.create(c0cg, executor));
        }
        if (obj != null) {
            if (executor == null) {
                c0cg.A54(obj);
            } else {
                executor.execute(new C1MU(c0cg, obj));
            }
        }
    }

    public void A04(Object obj) {
        ArrayList arrayList;
        synchronized (this.A01) {
            this.A00 = obj;
            arrayList = new ArrayList(this.A02);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            C0CG c0cg = (C0CG) pair.first;
            Executor executor = (Executor) pair.second;
            if (executor == null) {
                c0cg.A54(obj);
            } else {
                executor.execute(new C1MU(c0cg, obj));
            }
        }
    }

    @Override // X.C0CG
    public void A54(Object obj) {
        A04(obj);
    }
}
