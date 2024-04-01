package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.0js  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12680js implements Application.ActivityLifecycleCallbacks {
    public Activity A00;
    public Object A01;
    public boolean A03 = false;
    public boolean A02 = false;
    public boolean A04 = false;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public C12680js(Activity activity) {
        this.A00 = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.A00 == activity) {
            this.A00 = null;
            this.A02 = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (!this.A02 || this.A04 || this.A03) {
            return;
        }
        Object obj = this.A01;
        try {
            final Object obj2 = C12690jt.A03.get(activity);
            if (obj2 == obj) {
                final Object obj3 = C12690jt.A02.get(activity);
                C12690jt.A00.postAtFrontOfQueue(new Runnable() { // from class: X.0jr
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Method method = C12690jt.A05;
                            if (method != null) {
                                method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                            } else {
                                C12690jt.A04.invoke(obj3, obj2, Boolean.FALSE);
                            }
                        } catch (RuntimeException e) {
                            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                                throw e;
                            }
                        } catch (Throwable th) {
                            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                        }
                    }
                });
                this.A04 = true;
                this.A01 = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (this.A00 == activity) {
            this.A03 = true;
        }
    }
}
