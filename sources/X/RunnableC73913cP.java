package X;

import com.whatsapp.voipcalling.Voip;

/* renamed from: X.3cP  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC73913cP extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;

    @Override // java.lang.Runnable
    public final void run() {
        Voip.notifyAudioRouteChange(this.A00);
    }
}
