package X;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1bE */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterface$OnCancelListenerC30821bE extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public final Handler A00;
    public final C06210Ry A01;
    public final AtomicReference A02;
    public volatile boolean A03;

    public abstract void A06();

    public abstract void A07(C30451ab c30451ab, int i);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDialogInterface$OnCancelListenerC30821bE(AnonymousClass149 anonymousClass149) {
        super(anonymousClass149);
        C06210Ry c06210Ry = C06210Ry.A00;
        this.A02 = new AtomicReference(null);
        this.A00 = new HandlerC234416q(Looper.getMainLooper());
        this.A01 = c06210Ry;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0058, code lost:
        if (r3 != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicReference r4 = r6.A02
            java.lang.Object r5 = r4.get()
            X.14e r5 = (X.C228314e) r5
            r3 = 0
            r0 = 1
            if (r7 == r0) goto L2c
            r0 = 2
            if (r7 != r0) goto L55
            X.0Ry r1 = r6.A01
            X.149 r0 = r6.A00
            android.app.Activity r0 = r0.AAt()
            int r2 = r1.A00(r0)
            if (r2 != 0) goto L1e
            r3 = 1
        L1e:
            if (r5 != 0) goto L21
            return
        L21:
            X.1ab r0 = r5.A01
            int r1 = r0.A01
            r0 = 18
            if (r1 != r0) goto L58
            if (r2 != r0) goto L58
            return
        L2c:
            r3 = -1
            if (r8 == r3) goto L5a
            if (r8 != 0) goto L55
            r2 = 13
            if (r9 == 0) goto L3b
            java.lang.String r0 = "<<ResolutionFailureErrorDetail>>"
            int r2 = r9.getIntExtra(r0, r2)
        L3b:
            r1 = 0
            X.1ab r0 = new X.1ab
            r0.<init>(r2, r1)
            if (r5 == 0) goto L45
            int r3 = r5.A00
        L45:
            X.14e r5 = new X.14e
            r5.<init>(r0, r3)
            r4.set(r5)
        L4d:
            X.1ab r1 = r5.A01
            int r0 = r5.A00
            r6.A07(r1, r0)
        L54:
            return
        L55:
            if (r5 == 0) goto L54
            goto L4d
        L58:
            if (r3 == 0) goto L4d
        L5a:
            r0 = 0
            r4.set(r0)
            r6.A06()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractDialogInterface$OnCancelListenerC30821bE.A03(int, int, android.content.Intent):void");
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void A04(Bundle bundle) {
        C228314e c228314e;
        if (bundle != null) {
            AtomicReference atomicReference = this.A02;
            if (bundle.getBoolean("resolving_error", false)) {
                c228314e = new C228314e(new C30451ab(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                c228314e = null;
            }
            atomicReference.set(c228314e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void A05(Bundle bundle) {
        C228314e c228314e = (C228314e) this.A02.get();
        if (c228314e != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", c228314e.A00);
            C30451ab c30451ab = c228314e.A01;
            bundle.putInt("failed_status", c30451ab.A01);
            bundle.putParcelable("failed_resolution", c30451ab.A02);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        C30451ab c30451ab = new C30451ab(13, null);
        AtomicReference atomicReference = this.A02;
        C228314e c228314e = (C228314e) atomicReference.get();
        A07(c30451ab, c228314e == null ? -1 : c228314e.A00);
        atomicReference.set(null);
        A06();
    }
}
