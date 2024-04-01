package X;

import android.app.PendingIntent;
import android.os.Bundle;

/* renamed from: X.1bV  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC30971bV extends AbstractC229714s {
    public final int A00;
    public final Bundle A01;
    public final /* synthetic */ AbstractC229914u A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC30971bV(AbstractC229914u abstractC229914u, int i, Bundle bundle) {
        super(abstractC229914u, Boolean.TRUE);
        this.A02 = abstractC229914u;
        this.A00 = i;
        this.A01 = bundle;
    }

    public abstract void A02(C30451ab c30451ab);

    public abstract boolean A03();

    @Override // X.AbstractC229714s
    public final /* synthetic */ void A01(Object obj) {
        int i = this.A00;
        if (i == 0) {
            if (A03()) {
                return;
            }
            this.A02.A08(1, null);
            A02(new C30451ab(8, null));
        } else if (i != 10) {
            this.A02.A08(1, null);
            Bundle bundle = this.A01;
            A02(new C30451ab(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            AbstractC229914u abstractC229914u = this.A02;
            abstractC229914u.A08(1, null);
            throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", getClass().getSimpleName(), abstractC229914u.A06(), abstractC229914u.A05()));
        }
    }
}
