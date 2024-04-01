package X;

import android.os.Handler;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: X.1qM  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C39581qM extends AbstractDialogInterface$OnCancelListenerC30821bE {
    public AnonymousClass146 A00;
    public final AnonymousClass036 A01;

    public C39581qM(AnonymousClass149 anonymousClass149) {
        super(anonymousClass149);
        this.A01 = new AnonymousClass036(0);
        ((LifecycleCallback) this).A00.A57("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void A00() {
        if (this.A01.isEmpty()) {
            return;
        }
        this.A00.A02(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void A01() {
        this.A03 = true;
        if (this.A01.isEmpty()) {
            return;
        }
        this.A00.A02(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void A02() {
        this.A03 = false;
        AnonymousClass146 anonymousClass146 = this.A00;
        if (anonymousClass146 != null) {
            synchronized (AnonymousClass146.A0G) {
                if (anonymousClass146.A03 == this) {
                    anonymousClass146.A03 = null;
                    anonymousClass146.A09.clear();
                }
            }
            return;
        }
        throw null;
    }

    @Override // X.AbstractDialogInterface$OnCancelListenerC30821bE
    public final void A06() {
        Handler handler = this.A00.A05;
        handler.sendMessage(handler.obtainMessage(3));
    }

    @Override // X.AbstractDialogInterface$OnCancelListenerC30821bE
    public final void A07(C30451ab c30451ab, int i) {
        AnonymousClass146 anonymousClass146 = this.A00;
        if (anonymousClass146.A03(c30451ab, i)) {
            return;
        }
        Handler handler = anonymousClass146.A05;
        handler.sendMessage(handler.obtainMessage(5, i, 0, c30451ab));
    }
}
