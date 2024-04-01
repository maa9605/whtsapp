package X;

import com.whatsapp.util.Log;
import java.io.Closeable;

/* renamed from: X.3W2  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3W2 implements Closeable {
    public boolean A00;
    public final AbstractC42231vP A01;

    public C3W2(AbstractC42231vP abstractC42231vP) {
        this.A01 = abstractC42231vP;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        boolean z;
        AbstractC42231vP abstractC42231vP;
        synchronized (this) {
            z = true;
            if (!this.A00) {
                this.A00 = true;
            } else {
                z = false;
            }
        }
        if (z) {
            AbstractC42231vP abstractC42231vP2 = this.A01;
            C3W0 c3w0 = null;
            if (abstractC42231vP2 != null) {
                StringBuilder A0P = C000200d.A0P("svc-client/onSessionClosed; service=");
                String str = abstractC42231vP2.A04;
                A0P.append(str);
                String obj = A0P.toString();
                if (!(this instanceof C81093oL)) {
                    abstractC42231vP = this.A01;
                } else {
                    abstractC42231vP = ((C81093oL) this).A00;
                }
                if (abstractC42231vP == abstractC42231vP2) {
                    synchronized (abstractC42231vP2) {
                        int i = abstractC42231vP2.A00;
                        if (i <= 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(obj);
                            sb.append(", imbalanced ref_cnt=");
                            sb.append(i);
                            Log.e(sb.toString());
                            AbstractC000600i abstractC000600i = abstractC42231vP2.A03;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("name=");
                            sb2.append(str);
                            sb2.append(", counter=");
                            sb2.append(abstractC42231vP2.A00);
                            abstractC000600i.A09("svc-client-reference-counter-imbalance", sb2.toString(), false);
                            abstractC42231vP2.A00 = 0;
                        } else {
                            int i2 = i - 1;
                            abstractC42231vP2.A00 = i2;
                            if (i2 == 0) {
                            }
                        }
                        C3W0 c3w02 = abstractC42231vP2.A01;
                        abstractC42231vP2.A01 = null;
                        c3w0 = c3w02;
                    }
                    if (c3w0 != null) {
                        c3w0.A01(false);
                        return;
                    }
                    return;
                }
                StringBuilder A0P2 = C000200d.A0P("A session from a different client has been provided. Client: ");
                A0P2.append(abstractC42231vP.A04);
                throw new IllegalArgumentException(A0P2.toString());
            }
            throw null;
        }
    }
}
