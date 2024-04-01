package com.google.firebase.iid;

import X.C017408c;
import X.C017508d;
import X.C07K;
import X.C08U;
import X.C08f;
import X.C0BF;
import X.C0BG;
import X.C0BK;
import X.C0BN;
import X.C0BO;
import X.C0BP;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class Registrar {
    public final List getComponents() {
        C017508d c017508d = new C017508d(FirebaseInstanceId.class, new Class[0]);
        c017508d.A01(new C0BG(C08U.class, 1));
        c017508d.A01(new C0BG(C0BK.class, 1));
        c017508d.A01(new C0BG(C0BF.class, 1));
        C08f c08f = C0BN.A00;
        C07K.A1Q(c08f, "Null factory");
        c017508d.A01 = c08f;
        C07K.A1c(c017508d.A00 == 0, "Instantiation type has already been set.");
        c017508d.A00 = 1;
        C017408c A00 = c017508d.A00();
        C017508d c017508d2 = new C017508d(C0BO.class, new Class[0]);
        c017508d2.A01(new C0BG(FirebaseInstanceId.class, 1));
        C08f c08f2 = C0BP.A00;
        C07K.A1Q(c08f2, "Null factory");
        c017508d2.A01 = c08f2;
        return Arrays.asList(A00, c017508d2.A00());
    }
}
