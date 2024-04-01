package X;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.INotificationSideChannel;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.02i  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C005202i {
    public static ServiceConnectionC005602n A02;
    public static String A03;
    public final NotificationManager A00;
    public final Context A01;
    public static final Object A05 = new Object();
    public static Set A04 = new HashSet();
    public static final Object A06 = new Object();

    public C005202i(Context context) {
        this.A01 = context;
        this.A00 = (NotificationManager) context.getSystemService("notification");
    }

    public final void A00(InterfaceC005502m interfaceC005502m) {
        synchronized (A06) {
            ServiceConnectionC005602n serviceConnectionC005602n = A02;
            if (serviceConnectionC005602n == null) {
                serviceConnectionC005602n = new ServiceConnectionC005602n(this.A01.getApplicationContext());
                A02 = serviceConnectionC005602n;
            }
            serviceConnectionC005602n.A02.obtainMessage(0, interfaceC005502m).sendToTarget();
        }
    }

    public void A01(final String str, final int i) {
        this.A00.cancel(str, i);
        if (Build.VERSION.SDK_INT <= 19) {
            final String packageName = this.A01.getPackageName();
            A00(new InterfaceC005502m(packageName, i, str) { // from class: X.02o
                public final int A00;
                public final String A01;
                public final String A02;

                {
                    this.A01 = packageName;
                    this.A00 = i;
                    this.A02 = str;
                }

                @Override // X.InterfaceC005502m
                public void ASN(INotificationSideChannel iNotificationSideChannel) {
                    iNotificationSideChannel.A60(this.A01, this.A00, this.A02);
                }

                public String toString() {
                    StringBuilder sb = new StringBuilder("CancelTask[");
                    sb.append("packageName:");
                    sb.append(this.A01);
                    sb.append(", id:");
                    sb.append(this.A00);
                    sb.append(", tag:");
                    sb.append(this.A02);
                    sb.append(", all:");
                    sb.append(false);
                    sb.append("]");
                    return sb.toString();
                }
            });
        }
    }

    public void A02(final String str, final int i, final Notification notification) {
        Bundle A0E = C002701i.A0E(notification);
        if (A0E == null || !A0E.getBoolean("android.support.useSideChannel")) {
            this.A00.notify(str, i, notification);
            return;
        }
        final String packageName = this.A01.getPackageName();
        A00(new InterfaceC005502m(packageName, i, str, notification) { // from class: X.02p
            public final int A00;
            public final Notification A01;
            public final String A02;
            public final String A03;

            {
                this.A02 = packageName;
                this.A00 = i;
                this.A03 = str;
                this.A01 = notification;
            }

            @Override // X.InterfaceC005502m
            public void ASN(INotificationSideChannel iNotificationSideChannel) {
                iNotificationSideChannel.AGn(this.A02, this.A00, this.A03, this.A01);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("NotifyTask[");
                sb.append("packageName:");
                sb.append(this.A02);
                sb.append(", id:");
                sb.append(this.A00);
                sb.append(", tag:");
                return C000200d.A0L(sb, this.A03, "]");
            }
        });
        this.A00.cancel(str, i);
    }

    public boolean A03() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return this.A00.areNotificationsEnabled();
        }
        if (i >= 19) {
            Context context = this.A01;
            Object systemService = context.getSystemService("appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i2 = applicationInfo.uid;
            try {
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                Class<?> cls2 = Integer.TYPE;
                return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(systemService, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i2), packageName)).intValue() == 0;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
                return true;
            }
        }
        return true;
    }
}
