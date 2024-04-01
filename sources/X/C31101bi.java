package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.1bi  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31101bi extends AbstractDialogInterface$OnClickListenerC230314y {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ Intent A02;

    public C31101bi(Intent intent, Activity activity, int i) {
        this.A02 = intent;
        this.A01 = activity;
        this.A00 = i;
    }

    @Override // X.AbstractDialogInterface$OnClickListenerC230314y
    public final void A00() {
        Intent intent = this.A02;
        if (intent != null) {
            this.A01.startActivityForResult(intent, this.A00);
        }
    }
}
