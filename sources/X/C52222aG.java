package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.2aG  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52222aG {
    public static InterfaceC471629w A00(Context context, int i) {
        Class<?> loadClass;
        try {
            ClassLoader classLoader = C52222aG.class.getClassLoader();
            if (classLoader == null || (loadClass = classLoader.loadClass("com.whatsapp.camera.litecamera.LiteCameraView")) == null) {
                return null;
            }
            return (InterfaceC471629w) loadClass.getConstructor(Context.class, Integer.TYPE).newInstance(context, Integer.valueOf(i));
        } catch (Exception e) {
            Log.e("LiteCamera is not available", e);
            return null;
        }
    }
}
