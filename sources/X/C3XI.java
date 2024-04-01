package X;

import com.whatsapp.status.playback.StatusPlaybackActivity;

/* renamed from: X.3XI  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3XI extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ StatusPlaybackActivity A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C3XI(StatusPlaybackActivity statusPlaybackActivity, String str, int i, int i2) {
        this.A02 = statusPlaybackActivity;
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A1R(this.A03, this.A00, this.A01);
    }
}
