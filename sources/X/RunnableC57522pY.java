package X;

import com.whatsapp.util.Log;

/* renamed from: X.2pY */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC57522pY extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AnonymousClass363 A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ RunnableC57522pY(AnonymousClass363 anonymousClass363, String str, int i, long j, long j2) {
        this.A03 = anonymousClass363;
        this.A04 = str;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2L8 A00;
        String A01;
        AnonymousClass363 anonymousClass363 = this.A03;
        String str = this.A04;
        int i = this.A00;
        long j = this.A01;
        long j2 = this.A02;
        if (str != null && (A00 = C2L8.A00(str)) != null && (A01 = anonymousClass363.A02.A01(A00.A00)) != null) {
            C37181m0 c37181m0 = new C37181m0();
            c37181m0.A00 = Integer.valueOf(i);
            c37181m0.A04 = A01;
            Long valueOf = Long.valueOf(anonymousClass363.A03.A05() / 1000);
            c37181m0.A03 = valueOf;
            c37181m0.A01 = Long.valueOf(valueOf.longValue() - j);
            c37181m0.A02 = Long.valueOf(j2);
            anonymousClass363.A04.A07(c37181m0);
            return;
        }
        Log.e("CompanionRegistrationLogger/no session id");
    }
}
