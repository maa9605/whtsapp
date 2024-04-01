package X;

import java.util.List;

/* renamed from: X.229 */
/* loaded from: classes2.dex */
public abstract class AnonymousClass229 {
    public void A00() {
        if (!(this instanceof C78753kT)) {
            if (this instanceof C2JM) {
                ((C2JM) this).A00.A0B.A01();
                return;
            }
            return;
        }
        ((C78753kT) this).A00.A01();
    }

    public void A01(C2JK c2jk) {
        if (!(this instanceof C78753kT)) {
            if (this instanceof C2JM) {
                ((C2JM) this).A00.A0B.A01();
                return;
            }
            return;
        }
        C85713w6 c85713w6 = ((C78753kT) this).A00;
        C3KY c3ky = (C3KY) c85713w6.A00();
        int i = -1;
        for (int i2 = 0; i2 < c3ky.A02.size(); i2++) {
            if (((C2JK) c3ky.A02.get(i2)).A9d().equals(c2jk.A9d())) {
                i = i2;
            }
        }
        if (i != -1) {
            List list = c3ky.A02;
            list.remove(list.get(i));
            ((AbstractC04890Mh) c3ky).A01.A00();
        }
        c85713w6.A01();
    }
}
