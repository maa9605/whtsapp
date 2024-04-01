package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.33C  reason: invalid class name */
/* loaded from: classes2.dex */
public class C33C {
    public final /* synthetic */ C33B A00;

    public C33C(C33B c33b) {
        this.A00 = c33b;
    }

    public void A00(int i) {
        C33B c33b = this.A00;
        C2L3 c2l3 = c33b.A00;
        c2l3.A04.A0A(Boolean.FALSE);
        if (i == 406 || i == 404) {
            AnonymousClass272 anonymousClass272 = c2l3.A0B;
            UserJid userJid = c33b.A01;
            String str = c33b.A02;
            synchronized (anonymousClass272) {
                C29y c29y = (C29y) anonymousClass272.A00.get(userJid);
                if (c29y != null) {
                    int i2 = 0;
                    while (true) {
                        ArrayList arrayList = c29y.A02;
                        if (i2 >= arrayList.size()) {
                            break;
                        } else if (str.equals(((C2A0) arrayList.get(i2)).A00.A03)) {
                            arrayList.remove(i2);
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        c2l3.A02.A0A(new C645333s(c33b.A01, i));
    }
}
