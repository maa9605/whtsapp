package X;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Fn */
/* loaded from: classes.dex */
public class C03390Fn {
    public static final long A0M = TimeUnit.DAYS.toMillis(60);
    public static final C03490Fx A0N = new C03490Fx();
    public NotificationManager A00;
    public boolean A01 = false;
    public boolean A02 = false;
    public final Handler A03;
    public final C018508q A04;
    public final C01B A05;
    public final C0GC A06;
    public final C03320Ff A07;
    public final C0GA A08;
    public final AnonymousClass008 A09;
    public final C018708s A0A;
    public final C02E A0B;
    public final AnonymousClass012 A0C;
    public final C001200o A0D;
    public final C02F A0E;
    public final C000500h A0F;
    public final C05M A0G;
    public final C0DK A0H;
    public final C0GG A0I;
    public final C03340Fh A0J;
    public final C0GE A0K;
    public final C03360Fk A0L;

    public static int A00(boolean z) {
        return z ? 3 : 4;
    }

    public C03390Fn(AnonymousClass012 anonymousClass012, C018508q c018508q, C001200o c001200o, C05M c05m, C01B c01b, C02E c02e, C018708s c018708s, AnonymousClass008 anonymousClass008, C03320Ff c03320Ff, C02F c02f, C000500h c000500h, C03340Fh c03340Fh, C0DK c0dk, C03360Fk c03360Fk) {
        boolean z = C03480Fw.A00;
        this.A08 = z ? new C0GA() { // from class: X.0G9
            {
                C03390Fn.this = this;
            }

            @Override // X.C0GA
            public void A00() {
                C03390Fn.this.A0B();
            }
        } : null;
        this.A06 = z ? new C0GC() { // from class: X.0GB
            {
                C03390Fn.this = this;
            }

            @Override // X.C0GC
            public void A00(AbstractC005302j abstractC005302j) {
                C03390Fn.this.A0B();
            }
        } : null;
        this.A0K = z ? new C0GE() { // from class: X.0GD
            {
                C03390Fn.this = this;
            }

            @Override // X.C0GE
            public void A00(Set set) {
                C03390Fn.this.A0B();
            }
        } : null;
        this.A0I = z ? new C0GG() { // from class: X.0GF
            {
                C03390Fn.this = this;
            }

            @Override // X.C0GG
            public void A00() {
                C03390Fn.this.A0B();
            }

            @Override // X.C0GG
            public void A03(AbstractC005302j abstractC005302j) {
                C03390Fn.this.A0B();
            }
        } : null;
        this.A0C = anonymousClass012;
        this.A04 = c018508q;
        this.A0D = c001200o;
        this.A0G = c05m;
        this.A05 = c01b;
        this.A0B = c02e;
        this.A0A = c018708s;
        this.A09 = anonymousClass008;
        this.A07 = c03320Ff;
        this.A0E = c02f;
        this.A0F = c000500h;
        this.A0J = c03340Fh;
        this.A0H = c0dk;
        this.A0L = c03360Fk;
        if (Build.VERSION.SDK_INT >= 26) {
            HandlerThread handlerThread = new HandlerThread("notif-update-channel-names", 10);
            handlerThread.start();
            this.A03 = new Handler(handlerThread.getLooper(), new Handler.Callback() { // from class: X.1QO
                {
                    C03390Fn.this = this;
                }

                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    C03390Fn.this.A0C();
                    return true;
                }
            });
        }
    }

    public static String A01(String str) {
        Pair A03 = C003101m.A03(str);
        if (A03 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C003101m.A0A((String) A03.first));
        sb.append("_");
        sb.append(A03.second);
        return sb.toString();
    }

    public static final void A02(NotificationChannel notificationChannel, AbstractC005302j abstractC005302j) {
        String A00;
        String rawString = abstractC005302j.getRawString();
        if (C003101m.A0U(abstractC005302j)) {
            A00 = A0N.A00("group_chat_defaults");
        } else {
            A00 = A0N.A00("individual_chat_defaults");
        }
        if (A00 != null) {
            notificationChannel.setConversationId(A00, rawString);
            A01(A00);
        }
    }

    public static void A03(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            for (NotificationChannel notificationChannel : notificationManager.getNotificationChannels()) {
                if (!C0GH.A01.contains(notificationChannel.getId()) && !"miscellaneous".equals(notificationChannel.getId())) {
                    StringBuilder A0P = C000200d.A0P("chat-settings-store/deleteAllNotificationChannels/Deleting notification channel: ");
                    A0P.append(notificationChannel.getId());
                    Log.i(A0P.toString());
                    notificationManager.deleteNotificationChannel(notificationChannel.getId());
                }
            }
            C03490Fx c03490Fx = A0N;
            synchronized (c03490Fx) {
                c03490Fx.A01.clear();
                c03490Fx.A00.clear();
            }
            return;
        }
        throw null;
    }

    public NotificationChannel A04(String str) {
        C03490Fx c03490Fx = A0N;
        if (c03490Fx.A04(str)) {
            return A05().getNotificationChannel(c03490Fx.A00(str));
        }
        return null;
    }

    public synchronized NotificationManager A05() {
        NotificationManager notificationManager;
        notificationManager = this.A00;
        if (notificationManager == null) {
            notificationManager = (NotificationManager) this.A0D.A00.getSystemService("notification");
            this.A00 = notificationManager;
        }
        return notificationManager;
    }

    public final ContentValues A06(NotificationChannel notificationChannel, String str, String str2, String str3, boolean z) {
        ContentValues contentValues = new ContentValues();
        Integer A05 = C0DU.A05(str);
        if (A05 != null) {
            if (!notificationChannel.shouldShowLights()) {
                contentValues.put("message_light", "000000");
            } else if (!A05.equals(Integer.valueOf(notificationChannel.getLightColor()))) {
                contentValues.put("message_light", C0DU.A06(notificationChannel.getLightColor()).toUpperCase(Locale.US));
            }
        } else if (notificationChannel.shouldShowLights()) {
            contentValues.put("message_light", "FFFFFF");
        }
        if (C0DU.A0C(str2) != null) {
            if (!notificationChannel.shouldVibrate()) {
                contentValues.put("message_vibrate", "0");
            }
        } else if (notificationChannel.shouldVibrate()) {
            contentValues.put("message_vibrate", "1");
        }
        if (!TextUtils.isEmpty(str3)) {
            if (notificationChannel.getSound() == null) {
                contentValues.put("message_tone", "");
            } else if (!str3.equals(notificationChannel.getSound().toString())) {
                contentValues.put("message_tone", notificationChannel.getSound().toString());
            }
        } else if (notificationChannel.getSound() != null && !TextUtils.isEmpty(notificationChannel.getSound().toString())) {
            contentValues.put("message_tone", notificationChannel.getSound().toString());
        }
        int i = z ? 3 : 4;
        int importance = notificationChannel.getImportance();
        if (importance != i && importance >= 3) {
            contentValues.put("low_pri_notifications", Boolean.valueOf(importance == 3));
        }
        return contentValues;
    }

    public Uri A07(String str) {
        Uri parse;
        if (str == null) {
            parse = Uri.EMPTY;
        } else {
            parse = Uri.parse(str);
        }
        return (TextUtils.isEmpty(str) || AnonymousClass024.A0e(this.A0B, this.A0E, parse, true)) ? parse : Settings.System.DEFAULT_NOTIFICATION_URI;
    }

    public CharSequence A08(String str) {
        if ("individual_chat_defaults".equals(str)) {
            return this.A0D.A00.getString(R.string.settings_notification);
        }
        if ("group_chat_defaults".equals(str)) {
            return this.A0D.A00.getString(R.string.settings_group_notification);
        }
        if ("silent_notifications".equals(str)) {
            return this.A0D.A00.getString(R.string.category_silent_notifications);
        }
        if ("voip_notification".equals(str)) {
            return this.A0D.A00.getString(R.string.category_voip);
        }
        AbstractC005302j A02 = AbstractC005302j.A02(str);
        if (A02 == null) {
            return null;
        }
        return this.A0A.A08(this.A0H.A02(A02), false);
    }

    public String A09() {
        return A0A("voip_notification", A08("voip_notification"), 4, null, null, null, null);
    }

    public synchronized String A0A(String str, CharSequence charSequence, int i, String str2, String str3, Uri uri, String str4) {
        C03490Fx c03490Fx = A0N;
        if (c03490Fx.A04(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("chat-settings-store/addNotificationChannel channel already exists for settingsId:");
            sb.append(C003101m.A0A(str));
            Log.e(sb.toString());
            return c03490Fx.A00(str);
        }
        C000500h c000500h = this.A0F;
        int i2 = c000500h.A00.getInt("num_notification_channels_created", 0) + 1;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("_");
        sb2.append(String.valueOf(i2));
        String obj = sb2.toString();
        NotificationChannel notificationChannel = new NotificationChannel(obj, charSequence, i);
        if (!TextUtils.isEmpty(str4)) {
            notificationChannel.setGroup(str4);
        }
        Integer A05 = C0DU.A05(str2);
        if (A05 != null) {
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(A05.intValue());
        } else {
            notificationChannel.enableLights(false);
        }
        long[] A0C = C0DU.A0C(str3);
        if (A0C != null) {
            notificationChannel.setVibrationPattern(A0C);
            notificationChannel.enableVibration(true);
        } else {
            notificationChannel.enableVibration(false);
        }
        notificationChannel.setSound(uri, Notification.AUDIO_ATTRIBUTES_DEFAULT);
        notificationChannel.setLockscreenVisibility(0);
        if (!"group_chat_defaults".equals(str) && !"individual_chat_defaults".equals(str)) {
            AbstractC005302j A02 = AbstractC005302j.A02(str);
            if (Build.VERSION.SDK_INT >= 30 && A02 != null) {
                A02(notificationChannel, A02);
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("chat-settings-store/addNotificationChannel adding channel with id:");
        sb3.append(A01(obj));
        sb3.append(" importance:");
        sb3.append(i);
        sb3.append(" lights:");
        sb3.append(notificationChannel.shouldShowLights());
        sb3.append(" color:");
        sb3.append(C0DU.A06(notificationChannel.getLightColor()));
        sb3.append(" vibrate:");
        sb3.append(notificationChannel.shouldVibrate());
        sb3.append(" sounduri:");
        sb3.append(notificationChannel.getSound());
        Log.i(sb3.toString());
        A05().createNotificationChannel(notificationChannel);
        c000500h.A0D().putInt("num_notification_channels_created", i2).apply();
        c03490Fx.A02(str, obj);
        return obj;
    }

    public synchronized void A0B() {
        Handler handler = this.A03;
        C000700j.A07(handler != null);
        if (!handler.hasMessages(1)) {
            handler.sendEmptyMessageDelayed(1, 3000L);
        }
    }

    public synchronized void A0C() {
        if (this.A01) {
            for (NotificationChannel notificationChannel : A05().getNotificationChannels()) {
                if (!C0GH.A01.contains(notificationChannel.getId()) && !"miscellaneous".equals(notificationChannel.getId()) && "channel_group_chats".equals(notificationChannel.getGroup())) {
                    String A0B = C003101m.A0B(notificationChannel.getId());
                    if (A0B != null) {
                        CharSequence name = notificationChannel.getName();
                        CharSequence A08 = A08(A0B);
                        if (!TextUtils.equals(name, A08)) {
                            notificationChannel.getId();
                            A05().createNotificationChannel(new NotificationChannel(notificationChannel.getId(), A08, notificationChannel.getImportance()));
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("chat-settings-store/updateChannelNames ignoring channel:");
                        sb.append(notificationChannel.getId());
                        Log.i(sb.toString());
                    }
                }
            }
        }
    }

    public synchronized void A0D(SQLiteDatabase sQLiteDatabase) {
        String A0B;
        C03490Fx c03490Fx = A0N;
        synchronized (c03490Fx) {
            c03490Fx.A01.clear();
            c03490Fx.A00.clear();
        }
        this.A01 = false;
        C001200o c001200o = this.A0D;
        C0GH.A00(c001200o.A00);
        List<NotificationChannel> notificationChannels = A05().getNotificationChannels();
        C000500h c000500h = this.A0F;
        SharedPreferences sharedPreferences = c000500h.A00;
        sharedPreferences.getInt("notification_channels_schema_version", 0);
        if (sharedPreferences.getInt("notification_channels_schema_version", 0) >= 2) {
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (NotificationChannel notificationChannel : notificationChannels) {
                if (!C0GH.A01.contains(notificationChannel.getId())) {
                    String A0B2 = C003101m.A0B(notificationChannel.getId());
                    if ("individual_chat_defaults".equals(A0B2)) {
                        z = true;
                    } else if ("group_chat_defaults".equals(A0B2)) {
                        z2 = true;
                    } else if ("silent_notifications".equals(A0B2)) {
                        z3 = true;
                    }
                }
            }
            if (z && z2 && z3) {
                notificationChannels.size();
                sharedPreferences.getInt("num_notification_channels_created", 0);
                A05().getNotificationChannelGroups();
                for (NotificationChannel notificationChannel2 : notificationChannels) {
                    if (!C0GH.A01.contains(notificationChannel2.getId()) && !"miscellaneous".equals(notificationChannel2.getId()) && (A0B = C003101m.A0B(notificationChannel2.getId())) != null) {
                        C003101m.A0A(A0B);
                        c03490Fx.A02(A0B, notificationChannel2.getId());
                    }
                }
                this.A01 = true;
                this.A04.A0G(new Runnable() { // from class: X.1QN
                    {
                        C03390Fn.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C03390Fn c03390Fn = C03390Fn.this;
                        if (!c03390Fn.A02) {
                            c03390Fn.A09.A01(c03390Fn.A08);
                            c03390Fn.A07.A01(c03390Fn.A06);
                            c03390Fn.A0J.A00(c03390Fn.A0I);
                            c03390Fn.A0L.A01(c03390Fn.A0K);
                            c03390Fn.A02 = true;
                        }
                    }
                });
                return;
            }
        }
        A03(c001200o.A00);
        A05().getNotificationChannelGroups();
        try {
            Cursor query = sQLiteDatabase.query("settings", new String[]{"jid", "message_light", "message_vibrate", "message_tone", "use_custom_notifications", "low_pri_notifications"}, null, null, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        String string4 = query.getString(3);
                        boolean z4 = query.getInt(4) == 1;
                        AbstractC005302j A02 = AbstractC005302j.A02(string);
                        try {
                            if (!"individual_chat_defaults".equals(string) && !"group_chat_defaults".equals(string)) {
                                if (z4 && A02 != null) {
                                    C05M c05m = this.A0G;
                                    if (c05m.A0E(A02) && c05m.A05(A02) > this.A0C.A01() - A0M) {
                                    }
                                }
                            }
                            A0A(string, A08(string), query.getInt(5) == 1 ? 3 : 4, string2, string3, A07(string4), "channel_group_chats");
                        } catch (Throwable th) {
                            th = th;
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                try {
                                    query.close();
                                } catch (Throwable unused) {
                                }
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                query.close();
            }
        } catch (Exception e) {
            Log.e("chat-settings-store/syncNotificationChannels", e);
        }
        if (!c03490Fx.A04("individual_chat_defaults")) {
            A0A("individual_chat_defaults", A08("individual_chat_defaults"), 4, "FFFFFF", "1", Settings.System.DEFAULT_NOTIFICATION_URI, "channel_group_chats");
        }
        if (!c03490Fx.A04("group_chat_defaults")) {
            A0A("group_chat_defaults", A08("group_chat_defaults"), 4, "FFFFFF", "1", Settings.System.DEFAULT_NOTIFICATION_URI, "channel_group_chats");
        }
        if (!c03490Fx.A04("silent_notifications")) {
            A0A("silent_notifications", A08("silent_notifications"), 2, null, null, null, null);
        }
        this.A01 = true;
        c000500h.A0D().putInt("notification_channels_schema_version", 2).apply();
        this.A04.A0G(new Runnable() { // from class: X.1QN
            {
                C03390Fn.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C03390Fn c03390Fn = C03390Fn.this;
                if (!c03390Fn.A02) {
                    c03390Fn.A09.A01(c03390Fn.A08);
                    c03390Fn.A07.A01(c03390Fn.A06);
                    c03390Fn.A0J.A00(c03390Fn.A0I);
                    c03390Fn.A0L.A01(c03390Fn.A0K);
                    c03390Fn.A02 = true;
                }
            }
        });
    }

    public void A0E(String str) {
        C03490Fx c03490Fx = A0N;
        String A00 = c03490Fx.A00(str);
        if (A00 == null || C0GH.A01.contains(A00)) {
            return;
        }
        A05().deleteNotificationChannel(A00);
        c03490Fx.A03(str, A00);
        StringBuilder sb = new StringBuilder("chat-settings-store/deleteNotificationChannel/deleting channelId:");
        sb.append(A01(A00));
        sb.append(" for settingsId:");
        sb.append(C003101m.A0A(str));
        Log.i(sb.toString());
    }

    public void A0F(String str, CharSequence charSequence, String str2, String str3, Uri uri, boolean z, boolean z2) {
        C003101m.A0A(str);
        String A00 = A0N.A00(str);
        if (C0GH.A01.contains(A00)) {
            return;
        }
        if (A00 != null) {
            NotificationChannel notificationChannel = A05().getNotificationChannel(A00);
            boolean z3 = false;
            Integer A05 = C0DU.A05(str2);
            if (A05 == null ? notificationChannel.shouldShowLights() : !(notificationChannel.shouldShowLights() && A05.equals(Integer.valueOf(notificationChannel.getLightColor())))) {
                z3 = true;
            }
            if (C0DU.A0C(str3) == null ? notificationChannel.shouldVibrate() : !notificationChannel.shouldVibrate()) {
                z3 = true;
            }
            Uri sound = notificationChannel.getSound();
            if (uri != sound && (uri == null || !uri.equals(sound))) {
                z3 = true;
            }
            int importance = notificationChannel.getImportance();
            int i = z ? 3 : 4;
            if (importance != i) {
                if (importance >= 3 || (!this.A05.A0E(C01C.A1i) && ("group_chat_defaults".equals(str) || "individual_chat_defaults".equals(str)))) {
                    z3 = true;
                } else {
                    C003101m.A0A(str);
                    if ((Build.VERSION.SDK_INT < 30 && z2 && TextUtils.isEmpty(notificationChannel.getConversationId())) || z3) {
                        A0E(str);
                        A0A(str, charSequence, importance, str2, str3, uri, "channel_group_chats");
                        return;
                    }
                    C003101m.A0A(str);
                    return;
                }
            }
            importance = i;
            if (Build.VERSION.SDK_INT < 30) {
            }
            C003101m.A0A(str);
            return;
        }
        A0A(str, charSequence, z ? 3 : 4, str2, str3, uri, "channel_group_chats");
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0185, code lost:
        if (r3 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0G(X.C0CD r24, android.app.NotificationChannel r25) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03390Fn.A0G(X.0CD, android.app.NotificationChannel):boolean");
    }
}
