package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0T2  reason: invalid class name */
/* loaded from: classes.dex */
public class C0T2 extends C0CI {
    public int A00;
    public boolean A01 = false;
    public final List A02;
    public final List A03;

    public C0T2(List list) {
        C000700j.A09(list.size() > 0, "AllOfAsyncFuture: futures list is empty");
        this.A02 = new ArrayList(Collections.nCopies(list.size(), null));
        this.A03 = new ArrayList(Collections.nCopies(list.size(), null));
        this.A00 = list.size();
        for (final int i = 0; i < list.size(); i++) {
            C0CI c0ci = (C0CI) list.get(i);
            c0ci.A01.A03(new C0CG() { // from class: X.1jo
                @Override // X.C0CG
                public final void A54(Object obj) {
                    int i2;
                    C0T2 c0t2 = C0T2.this;
                    int i3 = i;
                    synchronized (c0t2) {
                        c0t2.A02.set(i3, obj);
                        c0t2.A01 = true;
                        i2 = c0t2.A00 - 1;
                        c0t2.A00 = i2;
                    }
                    if (i2 != 0) {
                        return;
                    }
                    c0t2.A04();
                }
            }, null);
            c0ci.A00.A03(new C0CG() { // from class: X.1jp
                @Override // X.C0CG
                public final void A54(Object obj) {
                    int i2;
                    C0T2 c0t2 = C0T2.this;
                    int i3 = i;
                    synchronized (c0t2) {
                        c0t2.A03.set(i3, obj);
                        i2 = c0t2.A00 - 1;
                        c0t2.A00 = i2;
                    }
                    if (i2 != 0) {
                        return;
                    }
                    c0t2.A04();
                }
            }, null);
        }
    }

    public final void A04() {
        ArrayList arrayList;
        C60792v3 c60792v3;
        synchronized (this) {
            arrayList = null;
            if (this.A01) {
                c60792v3 = null;
                arrayList = new ArrayList(this.A02);
            } else {
                c60792v3 = new C60792v3(this.A03);
            }
        }
        if (arrayList != null) {
            A00(arrayList);
        } else {
            A01(c60792v3);
        }
    }
}
