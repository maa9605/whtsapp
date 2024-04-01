package X;

import android.content.Intent;

/* renamed from: X.0qs  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC16700qs implements Runnable {
    public final int A00;
    public final Intent A01;
    public final C29111Vj A02;

    public RunnableC16700qs(C29111Vj dispatcher, Intent intent, int startId) {
        this.A02 = dispatcher;
        this.A01 = intent;
        this.A00 = startId;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A02.A03(this.A01, this.A00);
    }
}
