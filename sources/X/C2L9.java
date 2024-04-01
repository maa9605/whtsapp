package X;

import com.whatsapp.util.Log;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;

/* renamed from: X.2L9 */
/* loaded from: classes2.dex */
public class C2L9 {
    public static volatile C2L9 A0B;
    public C29S A00;
    public final AbstractC000600i A01;
    public final C06L A02;
    public final C05W A03;
    public final C469228u A04;
    public final C0E7 A05;
    public final C41401tr A06;
    public final C05Y A07;
    public final ConcurrentHashMap A08 = new ConcurrentHashMap();
    public final ConcurrentHashMap A09 = new ConcurrentHashMap();
    public final ConcurrentHashMap A0A = new ConcurrentHashMap();

    public C2L9(AbstractC000600i abstractC000600i, C05Y c05y, C05W c05w, C0E7 c0e7, C06L c06l, C41401tr c41401tr, C469228u c469228u) {
        this.A01 = abstractC000600i;
        this.A07 = c05y;
        this.A03 = c05w;
        this.A05 = c0e7;
        this.A02 = c06l;
        this.A06 = c41401tr;
        this.A04 = c469228u;
    }

    public static C2L9 A00() {
        if (A0B == null) {
            synchronized (C2L9.class) {
                if (A0B == null) {
                    A0B = new C2L9(AbstractC000600i.A00(), C05Y.A01(), C05W.A00(), C0E7.A00(), C06L.A00(), C41401tr.A01(), C469228u.A00());
                }
            }
        }
        return A0B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x000b, code lost:
        if (r12 == X.C22H.A01) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.EnumC40721sl A01(X.C22H r12, com.whatsapp.jid.UserJid r13) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2L9.A01(X.22H, com.whatsapp.jid.UserJid):X.1sl");
    }

    public final synchronized C29S A02() {
        C29S c29s;
        c29s = this.A00;
        if (c29s == null) {
            c29s = new C29S(this.A01, this.A07, this.A06.A08(), new C29Q() { // from class: X.2Ta
                {
                    C2L9.this = this;
                }

                @Override // X.C29Q
                public void AEK(String str, int i, int i2, long j) {
                    throw new UnsupportedOperationException();
                }

                @Override // X.C29Q
                public void AEL(String str, int i, C29T c29t) {
                    StringBuilder sb = new StringBuilder("ContactQuerySync/result sid=");
                    sb.append(str);
                    sb.append(" index=");
                    sb.append(i);
                    Log.i(sb.toString());
                    C2L9.this.A0A.put(str, c29t);
                }

                @Override // X.C29Q
                public void AEM(String str, int i, int i2, long j) {
                    throw new UnsupportedOperationException();
                }
            });
            this.A00 = c29s;
        }
        return c29s;
    }

    public final void A03(String str, ExecutionException executionException) {
        if ((executionException.getCause() instanceof RuntimeException) || !(!(executionException.getCause() instanceof Error) || (executionException.getCause() instanceof AssertionError) || (executionException.getCause() instanceof OutOfMemoryError))) {
            this.A01.A09(C000200d.A0H("ContactQuerySync/", str), executionException.getMessage(), true);
        }
    }
}
