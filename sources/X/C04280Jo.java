package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Jo */
/* loaded from: classes.dex */
public class C04280Jo extends AbstractC04290Jp {
    public C0D3 A00;

    public C04280Jo(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 10);
    }

    public C04280Jo(AnonymousClass094 anonymousClass094, C0D3 c0d3) {
        super(anonymousClass094, c0d3.A08, (byte) 10);
        ArrayList arrayList = new ArrayList();
        AnonymousClass094 anonymousClass0942 = this.A0n;
        AbstractC005302j abstractC005302j = anonymousClass0942.A00;
        UserJid of = UserJid.of(abstractC005302j);
        if (!C003101m.A0b(of)) {
            StringBuilder A0P = C000200d.A0P("CallLog/fromFMessageMissedCall bad UserJid: ");
            A0P.append(abstractC005302j);
            Log.e(A0P.toString());
        } else {
            C0D3 c0d32 = new C0D3(new C07950aM(of, anonymousClass0942.A02, anonymousClass0942.A01, 0), this, -1L, this.A0E, c0d3.A0E, 0, 2, 0L, false, true, c0d3.A05, c0d3.A0D, Collections.emptyList(), c0d3.A04, null);
            for (C0D4 c0d4 : c0d3.A0A.values()) {
                Map map = c0d32.A0A;
                UserJid userJid = c0d4.A02;
                map.put(userJid, new C0D4(-1L, userJid, c0d4.A00));
            }
            arrayList.add(c0d32);
        }
        A1A(arrayList);
    }

    @Override // X.AbstractC04290Jp
    public C0D3 A18() {
        C0D3 c0d3;
        synchronized (this.A0o) {
            c0d3 = this.A00;
            if (c0d3 == null) {
                c0d3 = C0D3.A01(this, ((AbstractC04290Jp) this).A01, 0, 2, 0L, true);
                this.A00 = c0d3;
            }
        }
        return c0d3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0015, code lost:
        if (r0 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A1B() {
        /*
            r4 = this;
            java.util.List r1 = r4.A02
            boolean r0 = r1.isEmpty()
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L17
            java.lang.Object r0 = r1.get(r2)
            X.0D3 r0 = (X.C0D3) r0
            boolean r0 = r0.A0E()
            r1 = 1
            if (r0 != 0) goto L18
        L17:
            r1 = 0
        L18:
            boolean r0 = r4.A1C()
            if (r0 == 0) goto L22
            if (r1 == 0) goto L21
            r3 = 3
        L21:
            return r3
        L22:
            if (r1 == 0) goto L25
            r2 = 2
        L25:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04280Jo.A1B():int");
    }

    public boolean A1C() {
        List list = ((AbstractC04290Jp) this).A02;
        if (list.isEmpty()) {
            return ((AbstractC04290Jp) this).A01;
        }
        return ((C0D3) list.get(0)).A0E;
    }
}
