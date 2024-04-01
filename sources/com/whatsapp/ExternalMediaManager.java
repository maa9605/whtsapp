package com.whatsapp;

import X.AbstractServiceC05030Na;
import X.AbstractServiceC28891Uh;
import X.C000400f;
import X.C469829b;
import X.C47242Al;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class ExternalMediaManager extends AbstractServiceC28891Uh {
    public C469829b A00;
    public C000400f A01;
    public C47242Al A02;

    /* JADX WARN: Removed duplicated region for block: B:51:0x005c  */
    @Override // X.AbstractServiceC05030Na
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(android.content.Intent r6) {
        /*
            r5 = this;
            java.lang.String r2 = android.os.Environment.getExternalStorageState()
            int r1 = r2.hashCode()
            r0 = 1242932856(0x4a15a678, float:2451870.0)
            r4 = 0
            r3 = 1
            if (r1 == r0) goto L3a
            r0 = 1299749220(0x4d789964, float:2.60675136E8)
            if (r1 != r0) goto L56
            java.lang.String r0 = "mounted_ro"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L56
            X.00f r1 = r5.A01
            boolean r0 = r1.A00
            if (r0 != 0) goto L26
            boolean r0 = r1.A01
            if (r0 != 0) goto L34
        L26:
            r1.A00 = r4
            r1.A01 = r3
            java.lang.String r0 = "media-state-manager/read-only"
            com.whatsapp.util.Log.i(r0)
        L2f:
            X.2Al r0 = r5.A02
            r0.A01()
        L34:
            X.29b r0 = r5.A00
            r0.A06(r2)
            return
        L3a:
            java.lang.String r0 = "mounted"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L56
            X.00f r1 = r5.A01
            boolean r0 = r1.A00
            if (r0 != 0) goto L4c
            boolean r0 = r1.A01
            if (r0 == 0) goto L34
        L4c:
            r1.A00 = r4
            r1.A01 = r4
            java.lang.String r0 = "media-state-manager/external/available"
            com.whatsapp.util.Log.i(r0)
            goto L2f
        L56:
            X.00f r1 = r5.A01
            boolean r0 = r1.A00
            if (r0 != 0) goto L34
            r1.A00 = r3
            r1.A01 = r3
            java.lang.String r0 = "media-state-manager/external/unavailable "
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0)
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ExternalMediaManager.A05(android.content.Intent):void");
    }

    /* loaded from: classes.dex */
    public class ExternalMediaStateReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if ("android.intent.action.MEDIA_BAD_REMOVAL".equals(intent.getAction()) || "android.intent.action.MEDIA_EJECT".equals(intent.getAction()) || "android.intent.action.MEDIA_MOUNTED".equals(intent.getAction()) || "android.intent.action.MEDIA_REMOVED".equals(intent.getAction()) || "android.intent.action.MEDIA_SHARED".equals(intent.getAction()) || "android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    AbstractServiceC05030Na.A00(context, ExternalMediaManager.class, 5, intent.setClass(context, ExternalMediaManager.class));
                }
            }
        }
    }
}
