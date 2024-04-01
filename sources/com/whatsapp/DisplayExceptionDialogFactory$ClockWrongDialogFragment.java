package com.whatsapp;

import X.ActivityC02330At;
import X.C002301c;
import X.C005002g;
import X.C09K;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class DisplayExceptionDialogFactory$ClockWrongDialogFragment extends Hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment {
    public C005002g A00;
    public C002301c A01;
    public boolean A02 = true;

    @Override // X.C0BA
    public void A0s() {
        this.A0U = true;
        if (this.A00.A04()) {
            return;
        }
        A10();
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        Log.w("home/dialog clock-wrong");
        C002301c c002301c = this.A01;
        final ActivityC02330At A09 = A09();
        final C005002g c005002g = this.A00;
        C09K c09k = new C09K(A09, c002301c) { // from class: X.1iu
            @Override // X.C09K, android.app.Dialog
            public void onCreate(Bundle bundle2) {
                long time;
                super.onCreate(bundle2);
                Date date = new Date();
                StringBuilder A0P = C000200d.A0P("conversations/clock-wrong-time ");
                A0P.append(date.toString());
                Log.w(A0P.toString());
                Date date2 = c005002g.A00;
                if (date2 != null) {
                    time = date2.getTime();
                } else {
                    time = date.getTime();
                }
                final Activity activity = A09;
                C002301c c002301c2 = this.A02;
                ((TextView) findViewById(R.id.clock_wrong_date)).setText(activity.getString(R.string.clock_wrong_report_current_date_time, AnonymousClass029.A0h(c002301c2, time), TimeZone.getDefault().getDisplayName(c002301c2.A0I())));
                findViewById(R.id.close).setOnClickListener(new View.OnClickListener() { // from class: X.1H2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Activity activity2 = activity;
                        activity2.startActivity(new Intent("android.settings.DATE_SETTINGS"));
                        activity2.finish();
                        Process.killProcess(Process.myPid());
                    }
                });
            }
        };
        c09k.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: X.159
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                A09.finish();
                Process.killProcess(Process.myPid());
            }
        });
        return c09k;
    }

    @Override // X.C0BA, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.A0U = true;
        this.A02 = false;
        A16(false, false);
        new DisplayExceptionDialogFactory$ClockWrongDialogFragment().A14(A09().A0N(), DisplayExceptionDialogFactory$ClockWrongDialogFragment.class.getName());
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        ActivityC02330At A09;
        if (!((DialogFragment) this).A0C) {
            A16(true, true);
        }
        if (!this.A02 || (A09 = A09()) == null) {
            return;
        }
        A09.finish();
    }
}
