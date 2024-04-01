package X;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: X.14f  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC228414f implements Runnable {
    public final C228314e A00;
    public final /* synthetic */ AbstractDialogInterface$OnCancelListenerC30821bE A01;

    public RunnableC228414f(AbstractDialogInterface$OnCancelListenerC30821bE abstractDialogInterface$OnCancelListenerC30821bE, C228314e c228314e) {
        this.A01 = abstractDialogInterface$OnCancelListenerC30821bE;
        this.A00 = c228314e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractDialogInterface$OnCancelListenerC30821bE abstractDialogInterface$OnCancelListenerC30821bE = this.A01;
        if (abstractDialogInterface$OnCancelListenerC30821bE.A03) {
            C228314e c228314e = this.A00;
            C30451ab c30451ab = c228314e.A01;
            if (c30451ab.A01()) {
                AnonymousClass149 anonymousClass149 = ((LifecycleCallback) abstractDialogInterface$OnCancelListenerC30821bE).A00;
                Activity AAt = anonymousClass149.AAt();
                PendingIntent pendingIntent = c30451ab.A02;
                int i = c228314e.A00;
                Intent intent = new Intent(AAt, GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", false);
                anonymousClass149.startActivityForResult(intent, 1);
                return;
            }
            C06210Ry c06210Ry = abstractDialogInterface$OnCancelListenerC30821bE.A01;
            int i2 = c30451ab.A01;
            if (c06210Ry == null) {
                throw null;
            }
            boolean z = true;
            if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 9) {
                z = false;
            }
            if (z) {
                AnonymousClass149 anonymousClass1492 = ((LifecycleCallback) abstractDialogInterface$OnCancelListenerC30821bE).A00;
                c06210Ry.A06(anonymousClass1492.AAt(), anonymousClass1492, i2, abstractDialogInterface$OnCancelListenerC30821bE);
            } else if (i2 != 18) {
                abstractDialogInterface$OnCancelListenerC30821bE.A07(c30451ab, c228314e.A00);
            } else {
                AnonymousClass149 anonymousClass1493 = ((LifecycleCallback) abstractDialogInterface$OnCancelListenerC30821bE).A00;
                Activity AAt2 = anonymousClass1493.AAt();
                ProgressBar progressBar = new ProgressBar(AAt2, null, 16842874);
                progressBar.setIndeterminate(true);
                progressBar.setVisibility(0);
                AlertDialog.Builder builder = new AlertDialog.Builder(AAt2);
                builder.setView(progressBar);
                builder.setMessage(C230214x.A02(AAt2, 18));
                builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                final AlertDialog create = builder.create();
                C06210Ry.A02(AAt2, create, "GooglePlayServicesUpdatingDialog", abstractDialogInterface$OnCancelListenerC30821bE);
                C06210Ry.A01(anonymousClass1493.AAt().getApplicationContext(), new C14T() { // from class: X.1bF
                    @Override // X.C14T
                    public final void A00() {
                        AbstractDialogInterface$OnCancelListenerC30821bE abstractDialogInterface$OnCancelListenerC30821bE2 = RunnableC228414f.this.A01;
                        abstractDialogInterface$OnCancelListenerC30821bE2.A02.set(null);
                        abstractDialogInterface$OnCancelListenerC30821bE2.A06();
                        Dialog dialog = create;
                        if (dialog.isShowing()) {
                            dialog.dismiss();
                        }
                    }
                });
            }
        }
    }
}
