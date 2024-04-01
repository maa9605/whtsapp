package X;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: X.3Bz */
/* loaded from: classes2.dex */
public class C66673Bz extends C0HS {
    public final /* synthetic */ C3C0 A00;
    public final /* synthetic */ String A01;

    public C66673Bz(C3C0 c3c0, String str) {
        this.A00 = c3c0;
        this.A01 = str;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        String A0D = C40061rW.A0D("https://wa.tenor.co/v1/trending", "key", C0FH.A0K);
        String str = this.A01;
        if (!TextUtils.isEmpty(str)) {
            A0D = C40061rW.A0D(A0D, "pos", str);
        }
        C53702hN c53702hN = this.A00.A00;
        if (c53702hN != null) {
            C36881lW c36881lW = new C36881lW();
            c36881lW.A08 = "Tenor";
            c36881lW.A00 = 1;
            return C53702hN.A01(c53702hN, A0D, c36881lW);
        }
        throw null;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C0FK c0fk = (C0FK) obj;
        if (c0fk == null) {
            this.A00.A00(null, null, true);
        } else {
            this.A00.A00((String) c0fk.A00, (Collection) c0fk.A01, false);
        }
    }
}
