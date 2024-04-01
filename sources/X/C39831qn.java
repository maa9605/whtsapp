package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: X.1qn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39831qn extends AbstractC31511cO {
    public Integer A00;
    public boolean A01;
    public boolean A02;
    public final AlarmManager A03;

    public C39831qn(AnonymousClass176 anonymousClass176) {
        super(anonymousClass176);
        this.A03 = (AlarmManager) ((AnonymousClass174) this).A00.A00.getSystemService("alarm");
    }

    @Override // X.AbstractC31511cO
    public final void A0D() {
        try {
            A0F();
            if (((Number) C17L.A0F.A00).longValue() > 0) {
                Context context = ((AnonymousClass174) this).A00.A00;
                ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if (receiverInfo == null || !receiverInfo.enabled) {
                    return;
                }
                A03("Receiver registered for local dispatch.");
                this.A01 = true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final int A0E() {
        Integer num = this.A00;
        if (num == null) {
            String valueOf = String.valueOf(((AnonymousClass174) this).A00.A00.getPackageName());
            num = Integer.valueOf((valueOf.length() != 0 ? "analytics".concat(valueOf) : new String("analytics")).hashCode());
            this.A00 = num;
        }
        return num.intValue();
    }

    public final void A0F() {
        this.A02 = false;
        AlarmManager alarmManager = this.A03;
        Context context = ((AnonymousClass174) this).A00.A00;
        alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsReceiver")), 0));
        if (Build.VERSION.SDK_INT >= 24) {
            int A0E = A0E();
            A06("Cancelling job. JobID", Integer.valueOf(A0E));
            ((JobScheduler) context.getSystemService("jobscheduler")).cancel(A0E);
        }
    }
}
