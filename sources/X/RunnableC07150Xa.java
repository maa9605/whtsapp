package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.0Xa  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC07150Xa implements Runnable {
    public final /* synthetic */ AnonymousClass011 A00;

    public /* synthetic */ RunnableC07150Xa(AnonymousClass011 anonymousClass011) {
        this.A00 = anonymousClass011;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass011 anonymousClass011 = this.A00;
        if (anonymousClass011.A0H()) {
            anonymousClass011.A07.ASO(anonymousClass011.A02, false);
        }
        if (anonymousClass011.A0F()) {
            anonymousClass011.A07.ASO(anonymousClass011.A00, false);
        }
        anonymousClass011.A0F.A01.A02(new RunnableC07150Xa(anonymousClass011), TimeUnit.SECONDS.toMillis(300L));
    }
}
