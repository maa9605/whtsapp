package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.17y  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C237517y extends AbstractC39661qU {
    public final C236317m A00;
    public final String A01;

    public C237517y(Context context, Looper looper, InterfaceC227813z interfaceC227813z, AnonymousClass140 anonymousClass140, C230114w c230114w) {
        super(context, looper, 23, c230114w, interfaceC227813z, anonymousClass140);
        this.A00 = new C236317m(this);
        this.A01 = "locationServices";
    }

    @Override // X.AbstractC229914u
    public Bundle A01() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.A01);
        return bundle;
    }

    @Override // X.AbstractC229914u
    public /* synthetic */ IInterface A03(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof InterfaceC235717g ? queryLocalInterface : new C31631ca(iBinder);
    }

    @Override // X.AbstractC229914u
    public String A05() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // X.AbstractC229914u
    public String A06() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // X.AbstractC39661qU, X.InterfaceC30511ah
    public int ABP() {
        return 11925000;
    }
}
