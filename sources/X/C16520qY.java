package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.0qY  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16520qY {
    public final Handler A00;

    public C16520qY() {
        Handler handler;
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            handler = Handler.createAsync(mainLooper);
        } else {
            try {
                handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
                Log.v("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor");
                handler = new Handler(mainLooper);
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (!(cause instanceof RuntimeException)) {
                    if (cause instanceof Error) {
                        throw cause;
                    }
                    throw new RuntimeException(cause);
                }
                throw cause;
            }
        }
        this.A00 = handler;
    }
}
