package X;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;

/* renamed from: X.0Zo  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0Zo extends C0VX {
    public final Bundle A00;
    public final AbstractC02530Bu A01;
    public final C0U6 A02;

    public abstract C0MU A02(String str, Class cls, C07750Zs c07750Zs);

    public C0Zo(InterfaceC02390Az interfaceC02390Az, Bundle bundle) {
        this.A02 = interfaceC02390Az.ACx();
        this.A01 = interfaceC02390Az.AAs();
        this.A00 = bundle;
    }

    @Override // X.C0VY
    public void A00(C0MU c0mu) {
        SavedStateHandleController.A00(c0mu, this.A02, this.A01);
    }

    @Override // X.C0VX
    public final C0MU A01(String str, Class cls) {
        C0U6 c0u6 = this.A02;
        AbstractC02530Bu abstractC02530Bu = this.A01;
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, C07750Zs.A00(c0u6.A00(str), this.A00));
        savedStateHandleController.A02(c0u6, abstractC02530Bu);
        SavedStateHandleController.A01(c0u6, abstractC02530Bu);
        C0MU A02 = A02(str, cls, savedStateHandleController.A01);
        A02.A00(savedStateHandleController);
        return A02;
    }

    @Override // X.C0VX, X.C0CR
    public final C0MU A6e(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return A01(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
