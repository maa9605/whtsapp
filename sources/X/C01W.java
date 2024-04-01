package X;

import android.os.Process;
import com.whatsapp.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.01W  reason: invalid class name */
/* loaded from: classes.dex */
public class C01W {
    public static Method A00;
    public static final int[] A01 = {4096};

    static {
        try {
            A00 = Process.class.getMethod("readProcFile", String.class, int[].class, String[].class, long[].class, float[].class);
        } catch (Exception unused) {
            A00 = null;
            Log.e("procreader/native API inaccessible");
        }
    }

    public static boolean A00() {
        if (A00 == null) {
            return false;
        }
        try {
            int myPid = Process.myPid();
            StringBuilder sb = new StringBuilder();
            sb.append("/proc/");
            sb.append(myPid);
            sb.append("/cgroup");
            try {
                String[] strArr = {null};
                A00.invoke(null, sb.toString(), A01, strArr, null, null);
                String str = strArr[0];
                if (str == null) {
                    return false;
                }
                return str.contains("/bg_non_interactive") || (str.contains("cpuset:/") && !str.contains("cpuset:/top-app"));
            } catch (Exception unused) {
                Log.e("procreader/native API invoke error");
                return false;
            }
        } catch (RuntimeException e) {
            Log.e("procreader/Runtime Exception", e);
            return false;
        }
    }
}
