package com.google.android.gms.common.api;

import X.AnonymousClass146;
import X.C06210Ry;
import X.C30451ab;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public int A00 = 0;

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.A00 = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                AnonymousClass146 A00 = AnonymousClass146.A00(this);
                if (i2 == -1) {
                    Handler handler = A00.A05;
                    handler.sendMessage(handler.obtainMessage(3));
                } else if (i2 == 0) {
                    C30451ab c30451ab = new C30451ab(13, null);
                    int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                    if (!A00.A03(c30451ab, intExtra)) {
                        Handler handler2 = A00.A05;
                        handler2.sendMessage(handler2.obtainMessage(5, intExtra, 0, c30451ab));
                    }
                }
            }
        } else if (i == 2) {
            this.A00 = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        this.A00 = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.A00 = bundle.getInt("resolution");
        }
        if (this.A00 != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Number number = (Number) extras.get("error_code");
            if (pendingIntent == null) {
                if (number == null) {
                    Log.e("GoogleApiActivity", "Activity started without resolution");
                    finish();
                    return;
                }
                C06210Ry.A00.A05(this, number.intValue(), this);
                this.A00 = 1;
                return;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.A00 = 1;
            } catch (IntentSender.SendIntentException e) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.A00);
        super.onSaveInstanceState(bundle);
    }
}
