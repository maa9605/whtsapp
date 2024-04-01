package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.17R  reason: invalid class name */
/* loaded from: classes.dex */
public final class C17R extends AbstractC39661qU {
    public final Context A00;

    public C17R(Context context, Looper looper, C230114w c230114w, InterfaceC227813z interfaceC227813z, AnonymousClass140 anonymousClass140) {
        super(context, looper, 45, c230114w, interfaceC227813z, anonymousClass140);
        this.A00 = context;
    }

    @Override // X.AbstractC229914u
    public final /* synthetic */ IInterface A03(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return queryLocalInterface instanceof InterfaceC237317w ? queryLocalInterface : new C31711ck(iBinder);
    }

    @Override // X.AbstractC229914u
    public final String A05() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    @Override // X.AbstractC229914u
    public final String A06() {
        return "com.google.android.gms.safetynet.service.START";
    }

    @Override // X.AbstractC39661qU, X.InterfaceC30511ah
    public final int ABP() {
        return 12200000;
    }
}
