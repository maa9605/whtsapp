package X;

import com.whatsapp.util.Log;

/* renamed from: X.0Qr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC05900Qr extends AbstractC05910Qs implements Runnable, C0I3 {
    public int A00 = 60;
    public C0I1 A01;
    public final C03340Fh A02;
    public final C41991uq A03;

    public RunnableC05900Qr(C41991uq c41991uq, C03340Fh c03340Fh, C0I1 c0i1) {
        this.A03 = c41991uq;
        this.A02 = c03340Fh;
        this.A01 = c0i1;
    }

    @Override // X.AbstractC05910Qs
    public void A00() {
        C000200d.A1F(C000200d.A0P("groupmgr/group_request/timeout/type:"), this.A00);
        super.A01 = true;
        this.A02.A07(this.A01, false);
    }

    @Override // X.C0I3
    public void ARv(int i) {
        StringBuilder A0Q = C000200d.A0Q("BroadcastListResponseHandler/request failed : ", i, " | ");
        A0Q.append(this.A01);
        A0Q.append(" | ");
        A0Q.append(this.A00);
        Log.e(A0Q.toString());
        cancel();
        this.A02.A07(this.A01, false);
    }

    @Override // java.lang.Runnable
    public void run() {
        cancel();
        C000200d.A1F(new StringBuilder("BroadcastListResponseHandler/request success/"), this.A00);
    }
}
