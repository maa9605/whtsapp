package androidx.work.impl.workers;

import X.AbstractC16430qO;
import X.C09610eQ;
import X.InterfaceC16760qy;
import X.InterfaceFutureC09630eS;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements InterfaceC16760qy {
    public static final String A05 = AbstractC16430qO.A01("ConstraintTrkngWrkr");
    public ListenableWorker A00;
    public WorkerParameters A01;
    public C09610eQ A02;
    public final Object A03;
    public volatile boolean A04;

    @Override // X.InterfaceC16760qy
    public void AH3(List workSpecIds) {
    }

    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        this.A01 = workerParams;
        this.A03 = new Object();
        this.A04 = false;
        this.A02 = new C09610eQ();
    }

    @Override // androidx.work.ListenableWorker
    public InterfaceFutureC09630eS A00() {
        super.A01.A04.execute(new Runnable() { // from class: X.0ru
            @Override // java.lang.Runnable
            public void run() {
                String str;
                final ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
                Object obj = ((ListenableWorker) constraintTrackingWorker).A01.A01.A00.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    AbstractC16430qO.A00().A03(ConstraintTrackingWorker.A05, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.A02.A08(new C1VE());
                    return;
                }
                ListenableWorker A00 = ((ListenableWorker) constraintTrackingWorker).A01.A02.A00(((ListenableWorker) constraintTrackingWorker).A00, str, constraintTrackingWorker.A01);
                constraintTrackingWorker.A00 = A00;
                if (A00 == null) {
                    AbstractC16430qO.A00().A02(ConstraintTrackingWorker.A05, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.A02.A08(new C1VE());
                    return;
                }
                C0OL A02 = ((C1W8) C0OP.A00(((ListenableWorker) constraintTrackingWorker).A00).A04.A0B()).A02(((ListenableWorker) constraintTrackingWorker).A01.A03.toString());
                if (A02 == null) {
                    constraintTrackingWorker.A02.A08(new C1VE());
                    return;
                }
                Context context = ((ListenableWorker) constraintTrackingWorker).A00;
                C29131Vn c29131Vn = new C29131Vn(context, C0OP.A00(context).A06, constraintTrackingWorker);
                c29131Vn.A01(Collections.singletonList(A02));
                if (c29131Vn.A02(((ListenableWorker) constraintTrackingWorker).A01.A03.toString())) {
                    AbstractC16430qO A002 = AbstractC16430qO.A00();
                    String str2 = ConstraintTrackingWorker.A05;
                    A002.A02(str2, String.format("Constraints met for delegate %s", str), new Throwable[0]);
                    try {
                        final InterfaceFutureC09630eS A003 = constraintTrackingWorker.A00.A00();
                        A003.A5E(new Runnable() { // from class: X.0rv
                            @Override // java.lang.Runnable
                            public void run() {
                                ConstraintTrackingWorker constraintTrackingWorker2 = ConstraintTrackingWorker.this;
                                synchronized (constraintTrackingWorker2.A03) {
                                    if (constraintTrackingWorker2.A04) {
                                        constraintTrackingWorker2.A02.A08(new C09640eT());
                                    } else {
                                        constraintTrackingWorker2.A02.A07(A003);
                                    }
                                }
                            }
                        }, ((ListenableWorker) constraintTrackingWorker).A01.A04);
                        return;
                    } catch (Throwable th) {
                        AbstractC16430qO.A00().A02(str2, String.format("Delegated worker %s threw exception in startWork.", str), th);
                        synchronized (constraintTrackingWorker.A03) {
                            if (constraintTrackingWorker.A04) {
                                AbstractC16430qO.A00().A02(str2, "Constraints were unmet, Retrying.", new Throwable[0]);
                                constraintTrackingWorker.A02.A08(new C09640eT());
                            } else {
                                constraintTrackingWorker.A02.A08(new C1VE());
                            }
                            return;
                        }
                    }
                }
                AbstractC16430qO.A00().A02(ConstraintTrackingWorker.A05, String.format("Constraints not met for delegate %s. Requesting retry.", str), new Throwable[0]);
                constraintTrackingWorker.A02.A08(new C09640eT());
            }
        });
        return this.A02;
    }

    @Override // androidx.work.ListenableWorker
    public void A01() {
        ListenableWorker listenableWorker = this.A00;
        if (listenableWorker != null && !listenableWorker.A03) {
            ListenableWorker listenableWorker2 = this.A00;
            listenableWorker2.A03 = true;
            listenableWorker2.A01();
        }
    }

    @Override // androidx.work.ListenableWorker
    public boolean A02() {
        ListenableWorker listenableWorker = this.A00;
        return listenableWorker != null && listenableWorker.A02();
    }

    @Override // X.InterfaceC16760qy
    public void AH4(List workSpecIds) {
        AbstractC16430qO.A00().A02(A05, String.format("Constraints changed for %s", workSpecIds), new Throwable[0]);
        synchronized (this.A03) {
            this.A04 = true;
        }
    }
}
