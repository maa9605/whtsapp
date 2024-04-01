package X;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: X.3Bw */
/* loaded from: classes2.dex */
public class C66643Bw extends C0HS {
    public final /* synthetic */ C66653Bx A00;
    public final /* synthetic */ String A01;

    public C66643Bw(C66653Bx c66653Bx, String str) {
        this.A00 = c66653Bx;
        this.A01 = str;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        String A0D = C40061rW.A0D("https://api.giphy.com/v1/gifs/trending", "api_key", C0FH.A0C, "rating", "pg-13");
        String str = this.A01;
        if (!TextUtils.isEmpty(str)) {
            A0D = C40061rW.A0D(A0D, "offset", str);
        }
        C53712hO c53712hO = this.A00.A00;
        if (c53712hO != null) {
            C36881lW c36881lW = new C36881lW();
            c36881lW.A08 = "Giphy";
            c36881lW.A00 = 1;
            return C53712hO.A00(c53712hO, A0D, c36881lW);
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
