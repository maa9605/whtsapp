package com.google.firebase.iid;

import X.C000200d;
import X.C02400Ba;
import X.C08U;
import X.C1CA;
import X.C1CE;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;

/* loaded from: classes.dex */
public class FirebaseInstanceIdService extends C1CE {
    @Override // X.C1CE
    public final Intent A00(Intent intent) {
        return (Intent) C1CA.A00().A03.poll();
    }

    @Override // X.C1CE
    public final void A02(Intent intent) {
        String stringExtra;
        if ("com.google.firebase.iid.TOKEN_REFRESH".equals(intent.getAction()) || (stringExtra = intent.getStringExtra("CMD")) == null) {
            return;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            Log.d("FirebaseInstanceId", C000200d.A08(valueOf.length() + stringExtra.length() + 21, "Received command: ", stringExtra, " - ", valueOf));
        }
        if (!"RST".equals(stringExtra) && !"RST_FULL".equals(stringExtra)) {
            if ("SYNC".equals(stringExtra)) {
                FirebaseInstanceId firebaseInstanceId = FirebaseInstanceId.getInstance(C08U.A00());
                if (firebaseInstanceId != null) {
                    C02400Ba c02400Ba = FirebaseInstanceId.A08;
                    synchronized (c02400Ba) {
                        String concat = "".concat("|T|");
                        SharedPreferences sharedPreferences = c02400Ba.A01;
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        for (String str : sharedPreferences.getAll().keySet()) {
                            if (str.startsWith(concat)) {
                                edit.remove(str);
                            }
                        }
                        edit.commit();
                    }
                    firebaseInstanceId.A07();
                    return;
                }
                throw null;
            }
            return;
        }
        FirebaseInstanceId.getInstance(C08U.A00()).A08();
    }
}
