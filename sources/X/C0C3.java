package X;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;

/* renamed from: X.0C3  reason: invalid class name */
/* loaded from: classes.dex */
public class C0C3 extends Fragment {
    public C0C0 A00;

    public static void A00(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.0YT
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity2, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity2) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity2) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity2) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity2) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity2) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPostCreated(Activity activity2, Bundle bundle) {
                    C0C3.A01(activity2, C0C1.ON_CREATE);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPostResumed(Activity activity2) {
                    C0C3.A01(activity2, C0C1.ON_RESUME);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPostStarted(Activity activity2) {
                    C0C3.A01(activity2, C0C1.ON_START);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPreDestroyed(Activity activity2) {
                    C0C3.A01(activity2, C0C1.ON_DESTROY);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPrePaused(Activity activity2) {
                    C0C3.A01(activity2, C0C1.ON_PAUSE);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPreStopped(Activity activity2) {
                    C0C3.A01(activity2, C0C1.ON_STOP);
                }
            });
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0C3(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static void A01(Activity activity, C0C1 c0c1) {
        if (activity instanceof InterfaceC02360Aw) {
            AbstractC02530Bu AAs = ((InterfaceC02360Aw) activity).AAs();
            if (AAs instanceof C02520Bt) {
                ((C02520Bt) AAs).A05(c0c1);
            }
        }
    }

    public final void A02(C0C1 c0c1) {
        if (Build.VERSION.SDK_INT < 29) {
            A01(getActivity(), c0c1);
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        A02(C0C1.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        A02(C0C1.ON_DESTROY);
        this.A00 = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        A02(C0C1.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        C0C0 c0c0 = this.A00;
        if (c0c0 != null) {
            ((C02580Bz) c0c0).A00.A00();
        }
        A02(C0C1.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        C0C0 c0c0 = this.A00;
        if (c0c0 != null) {
            C02510Bs c02510Bs = ((C02580Bz) c0c0).A00;
            int i = c02510Bs.A01 + 1;
            c02510Bs.A01 = i;
            if (i == 1 && c02510Bs.A06) {
                c02510Bs.A07.A05(C0C1.ON_START);
                c02510Bs.A06 = false;
            }
        }
        A02(C0C1.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        A02(C0C1.ON_STOP);
    }
}
