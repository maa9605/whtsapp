package X;

import android.view.Surface;

/* renamed from: X.12p  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC224812p implements Runnable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ AnonymousClass136 A01;

    public /* synthetic */ RunnableC224812p(AnonymousClass136 anonymousClass136, Surface surface) {
        this.A01 = anonymousClass136;
        this.A00 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass136 anonymousClass136 = this.A01;
        anonymousClass136.A01.ANq(this.A00);
    }
}
