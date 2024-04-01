package X;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* renamed from: X.0C2 */
/* loaded from: classes.dex */
public class C0C2 extends C02500Br {
    public final /* synthetic */ C02510Bs this$0;

    public C0C2(C02510Bs c02510Bs) {
        this.this$0 = c02510Bs;
    }

    @Override // X.C02500Br, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            ((C0C3) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).A00 = this.this$0.A03;
        }
    }

    @Override // X.C02500Br, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C02510Bs c02510Bs = this.this$0;
        int i = c02510Bs.A00 - 1;
        c02510Bs.A00 = i;
        if (i == 0) {
            c02510Bs.A02.postDelayed(c02510Bs.A04, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new C02500Br() { // from class: X.0C4
            {
                C0C2.this = this;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity2) {
                C0C2.this.this$0.A00();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity2) {
                C02510Bs c02510Bs = C0C2.this.this$0;
                int i = c02510Bs.A01 + 1;
                c02510Bs.A01 = i;
                if (i == 1 && c02510Bs.A06) {
                    c02510Bs.A07.A05(C0C1.ON_START);
                    c02510Bs.A06 = false;
                }
            }
        });
    }

    @Override // X.C02500Br, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C02510Bs c02510Bs = this.this$0;
        int i = c02510Bs.A01 - 1;
        c02510Bs.A01 = i;
        if (i == 0 && c02510Bs.A05) {
            c02510Bs.A07.A05(C0C1.ON_STOP);
            c02510Bs.A06 = true;
        }
    }
}
