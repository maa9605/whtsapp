package com.google.firebase.messaging;

import X.AnonymousClass088;
import X.C08U;
import X.C1CA;
import X.C1CE;
import X.C32951f7;
import X.InterfaceC02190Af;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends C1CE {
    public static final Queue A00 = new ArrayDeque(10);

    public void A04() {
    }

    public void A05(C32951f7 c32951f7) {
    }

    public void A06(String str) {
    }

    @Override // X.C1CE
    public final Intent A00(Intent intent) {
        return (Intent) C1CA.A00().A04.poll();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00d4  */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.1CV] */
    @Override // X.C1CE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02(android.content.Intent r8) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.A02(android.content.Intent):void");
    }

    @Override // X.C1CE
    public final boolean A03(Intent intent) {
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
            if (pendingIntent != null) {
                try {
                    pendingIntent.send();
                } catch (PendingIntent.CanceledException unused) {
                    Log.e("FirebaseMessaging", "Notification pending intent canceled");
                }
            }
            if (AnonymousClass088.A1x(intent)) {
                if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
                    C08U A002 = C08U.A00();
                    A002.A03();
                    A002.A03.A02(InterfaceC02190Af.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
                AnonymousClass088.A1h("_no", intent);
                return true;
            }
            return true;
        }
        return false;
    }
}
