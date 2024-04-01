package X;

import java.security.Provider;
import java.security.Security;

/* renamed from: X.3vf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C85473vf {
    public final Provider A00;

    public C85473vf() {
        Provider c01z;
        if (Security.getProvider("SC") != null) {
            c01z = Security.getProvider("SC");
        } else {
            c01z = new C01Z();
        }
        this.A00 = c01z;
    }
}
