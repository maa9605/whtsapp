package com.whatsapp.conversationslist;

import X.C002701i;
import X.C019208x;
import X.C0W5;
import X.C2Ni;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.SmsDefaultAppWarning;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class SmsDefaultAppWarning extends C2Ni {
    public C0W5 A00;

    public final void A1P() {
        this.A00.A00(this, getIntent().getData(), getString(R.string.tell_a_friend_sms, "https://whatsapp.com/dl/"), 17);
    }

    @Override // X.C2Ni, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        ActivityInfo activityInfo;
        super.onCreate(bundle);
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(getIntent().getData());
        ResolveInfo resolveActivity = getPackageManager().resolveActivity(intent, 0);
        if (resolveActivity != null && (activityInfo = resolveActivity.activityInfo) != null && "com.whatsapp".equals(activityInfo.packageName)) {
            C002701i.A19(this, 0);
        } else {
            C002701i.A19(this, 1);
        }
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i == 0) {
            C019208x c019208x = new C019208x(this);
            c019208x.A02(R.string.warning_sms_default_app);
            c019208x.A05(R.string.sms_invite, new DialogInterface.OnClickListener() { // from class: X.2sz
                {
                    SmsDefaultAppWarning.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    SmsDefaultAppWarning smsDefaultAppWarning = SmsDefaultAppWarning.this;
                    C002701i.A18(smsDefaultAppWarning, 0);
                    smsDefaultAppWarning.A1P();
                    smsDefaultAppWarning.finish();
                }
            });
            c019208x.A04(R.string.sms_reset, new DialogInterface.OnClickListener() { // from class: X.2t1
                {
                    SmsDefaultAppWarning.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    SmsDefaultAppWarning smsDefaultAppWarning = SmsDefaultAppWarning.this;
                    Log.i("smsdefaultappwarning/reset");
                    smsDefaultAppWarning.getPackageManager().clearPackagePreferredActivities("com.whatsapp");
                    smsDefaultAppWarning.finish();
                }
            });
            c019208x.A06(R.string.sms_sms, new DialogInterface.OnClickListener() { // from class: X.2t2
                {
                    SmsDefaultAppWarning.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    SmsDefaultAppWarning smsDefaultAppWarning = SmsDefaultAppWarning.this;
                    C002701i.A18(smsDefaultAppWarning, 0);
                    smsDefaultAppWarning.A00.A00(smsDefaultAppWarning, smsDefaultAppWarning.getIntent().getData(), smsDefaultAppWarning.getIntent().getStringExtra("sms_body"), null);
                    smsDefaultAppWarning.finish();
                }
            });
            c019208x.A01.A02 = new DialogInterface.OnCancelListener() { // from class: X.2t3
                {
                    SmsDefaultAppWarning.this = this;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    SmsDefaultAppWarning.this.finish();
                }
            };
            return c019208x.A00();
        } else if (i != 1) {
            return super.onCreateDialog(i);
        } else {
            C019208x c019208x2 = new C019208x(this);
            c019208x2.A02(R.string.warning_sms);
            c019208x2.A05(R.string.sms_invite, new DialogInterface.OnClickListener() { // from class: X.2sy
                {
                    SmsDefaultAppWarning.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    SmsDefaultAppWarning smsDefaultAppWarning = SmsDefaultAppWarning.this;
                    C002701i.A18(smsDefaultAppWarning, 1);
                    smsDefaultAppWarning.A1P();
                    smsDefaultAppWarning.finish();
                }
            });
            c019208x2.A06(R.string.sms_sms, new DialogInterface.OnClickListener() { // from class: X.2t4
                {
                    SmsDefaultAppWarning.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    SmsDefaultAppWarning smsDefaultAppWarning = SmsDefaultAppWarning.this;
                    C002701i.A18(smsDefaultAppWarning, 1);
                    smsDefaultAppWarning.A00.A00(smsDefaultAppWarning, smsDefaultAppWarning.getIntent().getData(), smsDefaultAppWarning.getIntent().getStringExtra("sms_body"), null);
                    smsDefaultAppWarning.finish();
                }
            });
            c019208x2.A01.A02 = new DialogInterface.OnCancelListener() { // from class: X.2t0
                {
                    SmsDefaultAppWarning.this = this;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    SmsDefaultAppWarning.this.finish();
                }
            };
            return c019208x2.A00();
        }
    }
}
