package X;

import com.whatsapp.util.Log;

/* renamed from: X.0I2 */
/* loaded from: classes.dex */
public class C0I2 implements C0I3, C0I4 {
    public final AbstractC42841wP A00;
    public final C41991uq A01;

    public C0I2(C41991uq c41991uq, AbstractC42841wP abstractC42841wP) {
        this.A01 = c41991uq;
        this.A00 = abstractC42841wP;
    }

    @Override // X.C0I3
    public void ARv(int i) {
        if (i < 500) {
            if (i >= 400) {
                this.A01.A0F(false);
                return;
            }
            StringBuilder A0Q = C000200d.A0Q("unexpected return code: ", i, " op: ");
            A0Q.append(this.A00);
            Log.e(A0Q.toString());
            return;
        }
        C41991uq c41991uq = this.A01;
        AbstractC42841wP abstractC42841wP = this.A00;
        if (c41991uq.A0K(abstractC42841wP)) {
            StringBuilder A0P = C000200d.A0P("qr_error 500 queueing: ");
            A0P.append(abstractC42841wP);
            Log.e(A0P.toString());
            c41991uq.A0Q.add(abstractC42841wP);
            return;
        }
        StringBuilder A0P2 = C000200d.A0P("qr_error 500 op invalid dropping: ");
        A0P2.append(abstractC42841wP);
        Log.e(A0P2.toString());
    }

    @Override // X.C0I4
    public void ARz(Exception exc) {
        StringBuilder A0P = C000200d.A0P("qr_exception: ");
        A0P.append(this.A00);
        Log.e(A0P.toString(), exc);
    }
}
