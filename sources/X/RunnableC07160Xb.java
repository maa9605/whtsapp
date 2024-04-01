package X;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Xb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC07160Xb implements Runnable {
    public final /* synthetic */ AnonymousClass011 A00;

    public /* synthetic */ RunnableC07160Xb(AnonymousClass011 anonymousClass011) {
        this.A00 = anonymousClass011;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final int nextInt;
        final AnonymousClass011 anonymousClass011 = this.A00;
        if (anonymousClass011.A0K) {
            if (anonymousClass011.A0G()) {
                if (anonymousClass011.A0J > 0 && (nextInt = new Random().nextInt(anonymousClass011.A0J) + 10) > 0) {
                    anonymousClass011.A0F.A02.A02(new Runnable() { // from class: X.1PF
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass011 anonymousClass0112 = AnonymousClass011.this;
                            anonymousClass0112.A06.ASP(anonymousClass0112.A01, false, true, nextInt);
                        }
                    }, nextInt * 1000);
                } else {
                    anonymousClass011.A06.ASP(anonymousClass011.A01, false, true, 0);
                }
            }
            anonymousClass011.A0F.A02.A02(new RunnableC07160Xb(anonymousClass011), TimeUnit.SECONDS.toMillis(305 - new Random().nextInt(45)));
        }
    }
}
