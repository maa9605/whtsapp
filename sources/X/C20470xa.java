package X;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.0xa  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C20470xa {
    public static C20460xZ A00;
    public static final Map A01 = new HashMap(4);
    public static final WeakHashMap A02 = new WeakHashMap();

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0xZ] */
    public static C13040kV A00(Context context, Object obj) {
        Map map = A01;
        Map map2 = (Map) map.get(context);
        if (map2 == null) {
            Context context2 = context;
            while ((context2 instanceof ContextWrapper) && !(context2 instanceof Activity) && !(context2 instanceof Application) && !(context2 instanceof Service)) {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            if (A02.containsKey(context2)) {
                return null;
            }
            if (A00 == null) {
                A00 = new Application.ActivityLifecycleCallbacks() { // from class: X.0xZ
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPaused(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityResumed(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStopped(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        if (C20470xa.A01.containsKey(activity)) {
                            throw new IllegalStateException("The MountContentPools has a reference to an activity that has just been created");
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
                        Map map3 = C20470xa.A01;
                        map3.remove(activity);
                        Iterator it = map3.entrySet().iterator();
                        while (it.hasNext()) {
                            Context context3 = (Context) ((Map.Entry) it.next()).getKey();
                            Context context4 = activity;
                            while (context4 instanceof ContextWrapper) {
                                context4 = ((ContextWrapper) context4).getBaseContext();
                            }
                            while (context3 instanceof ContextWrapper) {
                                context3 = ((ContextWrapper) context3).getBaseContext();
                            }
                            if (context3 == context4) {
                                it.remove();
                            }
                        }
                        WeakHashMap weakHashMap = C20470xa.A02;
                        Activity activity2 = activity;
                        while ((activity2 instanceof ContextWrapper) && !(activity2 instanceof Activity) && !(activity2 instanceof Application) && !(activity2 instanceof Service)) {
                            activity2 = activity2.getBaseContext();
                        }
                        weakHashMap.put(activity2, Boolean.TRUE);
                    }
                };
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(A00);
            }
            map2 = new HashMap();
            map.put(context, map2);
        }
        C13040kV c13040kV = (C13040kV) map2.get(obj);
        if (c13040kV == null) {
            C13040kV c13040kV2 = new C13040kV(3);
            map2.put(obj, c13040kV2);
            return c13040kV2;
        }
        return c13040kV;
    }
}
