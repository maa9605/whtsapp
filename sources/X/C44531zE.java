package X;

import com.whatsapp.util.Log;

/* renamed from: X.1zE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44531zE implements InterfaceC010405f {
    public C459524j A00;
    public final C44511zC A01;
    public final C44461z7 A02;
    public final C44331yt A03;
    public final C44381yy A04;
    public final C44401z0 A05;
    public final C05Y A06;
    public final InterfaceC002901k A07;

    public C44531zE(InterfaceC002901k interfaceC002901k, C05Y c05y, C44331yt c44331yt, C44381yy c44381yy, C44401z0 c44401z0, C44461z7 c44461z7, C44511zC c44511zC) {
        this.A07 = interfaceC002901k;
        this.A06 = c05y;
        this.A03 = c44331yt;
        this.A04 = c44381yy;
        this.A05 = c44401z0;
        this.A02 = c44461z7;
        this.A01 = c44511zC;
    }

    public final synchronized C459524j A00() {
        C459524j c459524j;
        c459524j = this.A00;
        if (c459524j != null) {
            this.A00 = null;
        } else {
            throw null;
        }
        return c459524j;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        C000200d.A13("sync-request-handler/onDeliveryFailure iqId:", str);
        this.A07.AS1(new RunnableEBaseShape1S0100000_I0_1(this, 29));
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        StringBuilder sb = new StringBuilder("sync-request-handler/onError iqId:");
        sb.append(str);
        Log.e(sb.toString());
        C02590Ca A0D = c02590Ca.A0D("error");
        if (A0D != null) {
            int A05 = A0D.A05("code", -1);
            if (A05 != -1) {
                C04P A0A = A0D.A0A("text");
                Long l = null;
                String str2 = A0A != null ? A0A.A03 : null;
                try {
                    long A07 = A0D.A07("backoff", -1L);
                    if (A07 != -1) {
                        l = Long.valueOf(A07 * 1000);
                    }
                } catch (C0L4 e) {
                    Log.e("SyncRequestHandler/getServerProvidedBackoffInMs the provided backoff is not an integral value.", e);
                }
                this.A07.AS1(new RunnableEBaseShape0S1201000_I0(this, l, str2, A05, 1));
                return;
            }
            StringBuilder sb2 = new StringBuilder("Expected attribute code in ");
            sb2.append(c02590Ca);
            throw new C0L4(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder("Expected child error in ");
        sb3.append(c02590Ca);
        throw new C0L4(sb3.toString());
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        C000200d.A14("sync-request-handler/onSuccess iqId:", str);
        try {
            this.A07.AS1(new RunnableEBaseShape0S0200000_I0_0(this, new C459624k(c02590Ca), 43));
        } catch (C44921zs | C24Q e) {
            A00();
            this.A07.AS1(new RunnableEBaseShape0S0200000_I0_0(this, e, 42));
        }
    }
}
