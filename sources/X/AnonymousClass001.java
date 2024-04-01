package X;

import com.whatsapp.AbstractConsumerAppShell;

/* renamed from: X.001 */
/* loaded from: classes.dex */
public abstract class AnonymousClass001 extends AbstractConsumerAppShell implements AnonymousClass005 {
    public final AnonymousClass021 componentManager = new AnonymousClass021(new AnonymousClass020(this));

    public /* bridge */ /* synthetic */ AnonymousClass005 componentManager() {
        return this.componentManager;
    }

    /* renamed from: componentManager */
    public final AnonymousClass021 m0componentManager() {
        return this.componentManager;
    }

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        return this.componentManager.generatedComponent();
    }

    @Override // com.whatsapp.AbstractAppShell, android.app.Application
    public void onCreate() {
        generatedComponent();
        super.onCreate();
    }
}
