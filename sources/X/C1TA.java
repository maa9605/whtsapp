package X;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1TA */
/* loaded from: classes.dex */
public class C1TA implements InterfaceC12750k0 {
    public int A00;
    public RemoteViews A01;
    public final Notification.Builder A02;
    public final C005402l A04;
    public final List A05 = new ArrayList();
    public final Bundle A03 = new Bundle();

    public C1TA(C005402l c005402l) {
        Notification.Builder builder;
        Notification.Action.Builder builder2;
        Bundle bundle;
        this.A04 = c005402l;
        int i = Build.VERSION.SDK_INT;
        Context context = c005402l.A0B;
        if (i >= 26) {
            builder = new Notification.Builder(context, c005402l.A0J);
            this.A02 = builder;
        } else {
            builder = new Notification.Builder(context);
            this.A02 = builder;
        }
        Notification notification = c005402l.A07;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(c005402l.A0H).setContentText(c005402l.A0G).setContentInfo(null).setContentIntent(c005402l.A09).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(c005402l.A0A, (notification.flags & 128) != 0).setLargeIcon(c005402l.A0C).setNumber(c005402l.A02).setProgress(c005402l.A05, c005402l.A04, c005402l.A0T);
        if (Build.VERSION.SDK_INT < 21) {
            this.A02.setSound(notification.sound, notification.audioStreamType);
        }
        this.A02.setSubText(null).setUsesChronometer(c005402l.A0V).setPriority(c005402l.A03);
        Iterator it = c005402l.A0N.iterator();
        while (it.hasNext()) {
            C07940aL c07940aL = (C07940aL) it.next();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 20) {
                if (i2 >= 23) {
                    IconCompat A00 = c07940aL.A00();
                    builder2 = new Notification.Action.Builder(A00 == null ? null : A00.A07(), c07940aL.A03, c07940aL.A01);
                } else {
                    builder2 = new Notification.Action.Builder(c07940aL.A00, c07940aL.A03, c07940aL.A01);
                }
                C12830k9[] c12830k9Arr = c07940aL.A09;
                if (c12830k9Arr != null) {
                    for (RemoteInput remoteInput : C12830k9.A01(c12830k9Arr)) {
                        builder2.addRemoteInput(remoteInput);
                    }
                }
                Bundle bundle2 = c07940aL.A07;
                if (bundle2 != null) {
                    bundle = new Bundle(bundle2);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", c07940aL.A04);
                if (Build.VERSION.SDK_INT >= 24) {
                    builder2.setAllowGeneratedReplies(c07940aL.A04);
                }
                int i3 = c07940aL.A06;
                bundle.putInt("android.support.action.semanticAction", i3);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 28) {
                    builder2.setSemanticAction(i3);
                }
                if (i4 >= 29) {
                    builder2.setContextual(false);
                }
                bundle.putBoolean("android.support.action.showsUserInterface", c07940aL.A05);
                builder2.addExtras(bundle);
                this.A02.addAction(builder2.build());
            } else {
                List list = this.A05;
                this.A02.addAction(c07940aL.A00, c07940aL.A03, c07940aL.A01);
                Bundle bundle3 = new Bundle(c07940aL.A07);
                C12830k9[] c12830k9Arr2 = c07940aL.A09;
                if (c12830k9Arr2 != null) {
                    bundle3.putParcelableArray("android.support.remoteInputs", C0XI.A01(c12830k9Arr2));
                }
                C12830k9[] c12830k9Arr3 = c07940aL.A08;
                if (c12830k9Arr3 != null) {
                    bundle3.putParcelableArray("android.support.dataRemoteInputs", C0XI.A01(c12830k9Arr3));
                }
                bundle3.putBoolean("android.support.allowGeneratedReplies", c07940aL.A04);
                list.add(bundle3);
            }
        }
        Bundle bundle4 = c005402l.A0D;
        if (bundle4 != null) {
            this.A03.putAll(bundle4);
        }
        if (Build.VERSION.SDK_INT < 20) {
            if (c005402l.A0S) {
                this.A03.putBoolean("android.support.localOnly", true);
            }
            String str = c005402l.A0K;
            if (str != null) {
                this.A03.putString("android.support.groupKey", str);
                if (c005402l.A0R) {
                    this.A03.putBoolean("android.support.isGroupSummary", true);
                } else {
                    this.A03.putBoolean("android.support.useSideChannel", true);
                }
            }
            String str2 = c005402l.A0M;
            if (str2 != null) {
                this.A03.putString("android.support.sortKey", str2);
            }
        }
        this.A01 = c005402l.A0E;
        if (Build.VERSION.SDK_INT >= 19) {
            this.A02.setShowWhen(c005402l.A0U);
            if (Build.VERSION.SDK_INT < 21) {
                ArrayList arrayList = c005402l.A0P;
                if (!arrayList.isEmpty()) {
                    this.A03.putStringArray("android.people", (String[]) arrayList.toArray(new String[arrayList.size()]));
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.A02.setLocalOnly(c005402l.A0S).setGroup(c005402l.A0K).setGroupSummary(c005402l.A0R).setSortKey(c005402l.A0M);
            this.A00 = c005402l.A01;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.A02.setCategory(c005402l.A0I).setColor(c005402l.A00).setVisibility(c005402l.A06).setPublicVersion(c005402l.A08).setSound(notification.sound, notification.audioAttributes);
            Iterator it2 = c005402l.A0P.iterator();
            while (it2.hasNext()) {
                this.A02.addPerson((String) it2.next());
            }
            if (c005402l.A0O.size() > 0) {
                Bundle bundle5 = c005402l.A02().getBundle("android.car.EXTENSIONS");
                bundle5 = bundle5 == null ? new Bundle() : bundle5;
                Bundle bundle6 = new Bundle();
                int i5 = 0;
                while (true) {
                    ArrayList arrayList2 = c005402l.A0O;
                    if (i5 >= arrayList2.size()) {
                        break;
                    }
                    bundle6.putBundle(Integer.toString(i5), C0XI.A00((C07940aL) arrayList2.get(i5)));
                    i5++;
                }
                bundle5.putBundle("invisible_actions", bundle6);
                c005402l.A02().putBundle("android.car.EXTENSIONS", bundle5);
                this.A03.putBundle("android.car.EXTENSIONS", bundle5);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.A02.setExtras(c005402l.A0D).setRemoteInputHistory(null);
            RemoteViews remoteViews = c005402l.A0E;
            if (remoteViews != null) {
                this.A02.setCustomContentView(remoteViews);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.A02.setBadgeIconType(0).setShortcutId(c005402l.A0L).setTimeoutAfter(0L).setGroupAlertBehavior(c005402l.A01);
            if (!TextUtils.isEmpty(c005402l.A0J)) {
                this.A02.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.A02.setAllowSystemGeneratedContextualActions(true);
            this.A02.setBubbleMetadata(null);
        }
    }

    public static final void A00(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & (-2);
        notification.defaults = i;
        notification.defaults = i & (-3);
    }
}
