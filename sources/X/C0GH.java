package X;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import com.google.android.search.verification.client.R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0GH  reason: invalid class name */
/* loaded from: classes.dex */
public class C0GH {
    public static boolean A00;
    public static final Set A01 = new HashSet();

    public static synchronized void A00(Context context) {
        synchronized (C0GH.class) {
            if (!A00) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                notificationManager.createNotificationChannelGroup(new NotificationChannelGroup("channel_group_chats", context.getString(R.string.chats)));
                NotificationChannel notificationChannel = new NotificationChannel("critical_app_alerts@1", context.getString(R.string.category_critial_app_alerts), 4);
                notificationChannel.setLockscreenVisibility(0);
                notificationChannel.setShowBadge(true);
                notificationManager.createNotificationChannel(notificationChannel);
                NotificationChannel notificationChannel2 = new NotificationChannel("chat_history_backup@1", context.getString(R.string.category_chat_history_backup), 2);
                notificationChannel2.setLockscreenVisibility(0);
                notificationChannel2.setShowBadge(false);
                notificationManager.createNotificationChannel(notificationChannel2);
                NotificationChannel notificationChannel3 = new NotificationChannel("failure_notifications@1", context.getString(R.string.category_failure_notifications), 3);
                notificationChannel3.setLockscreenVisibility(0);
                notificationChannel3.setShowBadge(true);
                notificationManager.createNotificationChannel(notificationChannel3);
                NotificationChannel notificationChannel4 = new NotificationChannel("media_playback@1", context.getString(R.string.category_media_playback), 2);
                notificationChannel4.setLockscreenVisibility(0);
                notificationChannel4.setShowBadge(false);
                notificationManager.createNotificationChannel(notificationChannel4);
                NotificationChannel notificationChannel5 = new NotificationChannel("other_notifications@1", context.getString(R.string.category_other_notifications), 2);
                notificationChannel5.setLockscreenVisibility(0);
                notificationChannel5.setShowBadge(false);
                notificationManager.createNotificationChannel(notificationChannel5);
                NotificationChannel notificationChannel6 = new NotificationChannel("sending_media@1", context.getString(R.string.category_sending_media), 2);
                notificationChannel6.setLockscreenVisibility(0);
                notificationChannel6.setShowBadge(false);
                notificationManager.createNotificationChannel(notificationChannel6);
                Set set = A01;
                set.add("critical_app_alerts@1");
                set.add("chat_history_backup@1");
                set.add("failure_notifications@1");
                set.add("media_playback@1");
                set.add("other_notifications@1");
                set.add("sending_media@1");
                A00 = true;
            }
        }
    }
}
