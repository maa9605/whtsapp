package X;

import com.whatsapp.schedulers.alarm.SchedulerExperimentAlarmService;

/* renamed from: X.3wf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractServiceC86013wf extends C0NZ implements AnonymousClass005 {
    public volatile C2GL A02;
    public final Object A01 = new Object();
    public boolean A00 = false;

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new C2GL(this);
                }
            }
        }
        return this.A02.generatedComponent();
    }

    @Override // X.AbstractServiceC05030Na, android.app.Service
    public void onCreate() {
        if (!this.A00) {
            this.A00 = true;
            ((C0RY) generatedComponent()).A0I((SchedulerExperimentAlarmService) this);
        }
        super.onCreate();
    }
}