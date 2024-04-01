package com.whatsapp.push;

import X.AbstractServiceC85923wT;
import X.C006702y;
import X.C32951f7;
import X.C42121v8;
import android.os.Bundle;
import java.util.Map;

/* loaded from: classes2.dex */
public class GcmListenerService extends AbstractServiceC85923wT {
    public C42121v8 A00;

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void A04() {
        this.A00.A00(null, null, null, null, null, null, false, null, null, 0);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void A05(C32951f7 c32951f7) {
        int i;
        int i2;
        Map map = c32951f7.A01;
        C006702y c006702y = map;
        if (map == null) {
            Bundle bundle = c32951f7.A00;
            C006702y c006702y2 = new C006702y();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if ((obj instanceof String) && !str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                    c006702y2.put(str, obj);
                }
            }
            c32951f7.A01 = c006702y2;
            c006702y = c006702y2;
        }
        C42121v8 c42121v8 = this.A00;
        String str2 = (String) c006702y.get("id");
        String str3 = (String) c006702y.get("ip");
        String str4 = (String) c006702y.get("cl_sess");
        String str5 = (String) c006702y.get("mmsov");
        String str6 = (String) c006702y.get("fbips");
        String str7 = (String) c006702y.get("er_ri");
        boolean equals = "1".equals(c006702y.get("notify"));
        String str8 = (String) c006702y.get("push_id");
        String str9 = (String) c006702y.get("push_ts");
        String string = c32951f7.A00.getString("google.original_priority");
        if (string == null) {
            string = c32951f7.A00.getString("google.priority");
        }
        if ("high".equals(string)) {
            i = 1;
        } else {
            boolean equals2 = "normal".equals(string);
            i = 0;
            if (equals2) {
                i = 2;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        String string2 = c32951f7.A00.getString("google.delivered_priority");
        if (string2 == null) {
            if ("1".equals(c32951f7.A00.getString("google.priority_reduced"))) {
                i2 = 2;
                c42121v8.A01(str2, str3, str4, str5, str6, str7, equals, str8, str9, 0, valueOf, Integer.valueOf(i2));
            }
            string2 = c32951f7.A00.getString("google.priority");
        }
        if ("high".equals(string2)) {
            i2 = 1;
        } else {
            i2 = 0;
            if ("normal".equals(string2)) {
                i2 = 2;
            }
        }
        c42121v8.A01(str2, str3, str4, str5, str6, str7, equals, str8, str9, 0, valueOf, Integer.valueOf(i2));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void A06(String str) {
        RegistrationIntentService.A01(this);
    }
}
