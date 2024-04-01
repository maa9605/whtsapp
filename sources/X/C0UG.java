package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/* renamed from: X.0UG */
/* loaded from: classes.dex */
public abstract class C0UG extends C0UH {
    public final Activity A00;
    public final Context A01;
    public final Handler A02;
    public final AbstractC02800Cx A03;

    public abstract void A02(C0BA c0ba, Intent intent, int i, Bundle bundle);

    public C0UG(ActivityC02330At activityC02330At) {
        Handler handler = new Handler();
        this.A03 = new C0UI();
        this.A00 = activityC02330At;
        this.A01 = activityC02330At;
        this.A02 = handler;
    }
}
