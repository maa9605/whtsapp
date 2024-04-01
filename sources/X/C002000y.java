package X;

import com.whatsapp.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.00y  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C002000y implements C00z {
    public static volatile C002000y A02;
    public Method A01 = null;
    public String A00 = null;

    public static C002000y A00() {
        if (A02 == null) {
            synchronized (C00z.class) {
                if (A02 == null) {
                    A02 = new C002000y();
                }
            }
        }
        return A02;
    }

    @Override // X.C00z
    public synchronized void AG2(String str, int i) {
        Method method = this.A01;
        if (method == null) {
            System.load(str);
            return;
        }
        try {
            C000700j.A07(this.A00 != null);
            String str2 = (String) method.invoke(Runtime.getRuntime(), str, C002000y.class.getClassLoader(), this.A00);
            if (str2 == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("robustsofileloader/load: nativeLoad returned error ");
            sb.append(str2);
            throw new UnsatisfiedLinkError(sb.toString());
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("robustsofileloader/load: Cannot load ");
            sb2.append(str);
            String obj = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("robustsofileloader/load: Error when loading lib: ");
            sb3.append(obj);
            Log.e(sb3.toString(), e);
            throw new UnsatisfiedLinkError(obj);
        }
    }
}
