package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.06A  reason: invalid class name */
/* loaded from: classes.dex */
public class C06A {
    public final C06B A00;
    public final Map A01 = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v2, types: [X.06B] */
    public C06A(final C002301c c002301c) {
        this.A00 = new C06C(c002301c) { // from class: X.06B
            public final C002301c A00;

            @Override // X.C06C
            public long A01() {
                return -2L;
            }

            @Override // X.C06C
            public boolean A0E() {
                return true;
            }

            @Override // X.C06C
            public boolean A0F() {
                return true;
            }

            {
                super(C06D.A00);
                this.A0F = "WhatsApp";
                this.A00 = c002301c;
                this.A03 = 3;
                this.A04 = -2L;
            }

            @Override // X.C06C
            public String A05() {
                return this.A00.A06(R.string.whatsapp_name);
            }

            @Override // X.C06C
            public void A07(long j) {
                StringBuilder sb = new StringBuilder("Attempting to set the id of the server contact to=");
                sb.append(j);
                Log.e(sb.toString());
            }

            @Override // X.C06C
            public void A08(String str) {
                C000700j.A08(false, "Setting verified name for ServerContact not allowed");
            }
        };
    }

    public void A00(C06C c06c) {
        Map map;
        Object obj;
        Jid A03 = c06c.A03(AbstractC005302j.class);
        if (A03 == null || (obj = (map = this.A01).get(A03)) == null || obj == c06c) {
            return;
        }
        map.remove(A03);
    }
}
