package X;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0FV  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0FV extends C0FS {
    @Override // X.C0FS
    public List A00(Context context) {
        return Arrays.asList("com.miui.miuilite", "com.miui.miuihome", "com.miui.miuihome2");
    }

    @Override // X.C0FS
    public void A01(Context context, int i) {
        try {
            Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
            Field declaredField = newInstance.getClass().getDeclaredField("messageCount");
            declaredField.setAccessible(true);
            declaredField.set(newInstance, Integer.valueOf(i));
        } catch (Exception unused) {
            Intent intent = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append("/");
            sb.append("com.whatsapp.Main");
            intent.putExtra("android.intent.extra.update_application_component_name", sb.toString());
            intent.putExtra("android.intent.extra.update_application_message_text", String.valueOf(i == 0 ? "" : Integer.valueOf(i)));
            context.sendBroadcast(intent);
        }
    }

    @Override // X.C0FS
    public void A02(Context context, Notification notification, int i) {
        if (Build.VERSION.SDK_INT < 19 || !Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            return;
        }
        try {
            Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
            obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i));
        } catch (Exception unused) {
            Log.e("Could not set badge for Xiaomi notification");
        }
    }
}
