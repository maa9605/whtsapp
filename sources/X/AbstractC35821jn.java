package X;

import android.widget.RemoteViewsService;
import com.whatsapp.appwidget.WidgetService;

/* renamed from: X.1jn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC35821jn extends RemoteViewsService implements AnonymousClass005 {
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

    @Override // android.app.Service
    public void onCreate() {
        if (!this.A00) {
            this.A00 = true;
            ((C0RY) generatedComponent()).A03((WidgetService) this);
        }
        super.onCreate();
    }
}
