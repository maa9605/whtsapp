package X;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0rY  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17100rY {
    public static final String A00 = AbstractC16430qO.A01("ProcessUtils");

    public static boolean A00(Context context) {
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object invoke;
        if (Build.VERSION.SDK_INT >= 28) {
            str = Application.getProcessName();
        } else {
            str = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread", false, C1Vc.class.getClassLoader());
                if (Build.VERSION.SDK_INT >= 18) {
                    Method declaredMethod = cls.getDeclaredMethod("currentProcessName", new Class[0]);
                    declaredMethod.setAccessible(true);
                    invoke = declaredMethod.invoke(null, new Object[0]);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
                    declaredMethod2.setAccessible(true);
                    Method declaredMethod3 = cls.getDeclaredMethod("getProcessName", new Class[0]);
                    declaredMethod3.setAccessible(true);
                    invoke = declaredMethod3.invoke(declaredMethod2.invoke(null, new Object[0]), new Object[0]);
                }
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th) {
                AbstractC16430qO.A00().A02(A00, "Unable to check ActivityThread for processName", th);
            }
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        str = next.processName;
                        break;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(null)) {
            return TextUtils.equals(str, null);
        }
        return TextUtils.equals(str, context.getApplicationInfo().processName);
    }
}
