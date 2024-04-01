package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass005;
import X.AnonymousClass029;
import X.C0CR;
import X.C52902bX;
import X.C52912bY;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.whatsapp.base.WaFragment;

/* loaded from: classes.dex */
public abstract class Hilt_PasswordInputFragment extends WaFragment implements AnonymousClass005 {
    public ContextWrapper A00;
    public final Object A01 = new Object();
    public volatile C52912bY A02;

    public abstract void A0x();

    @Override // X.C0BA
    public void A0c(Activity activity) {
        boolean z = true;
        this.A0U = true;
        ContextWrapper contextWrapper = this.A00;
        if (contextWrapper != null && C52912bY.A00(contextWrapper) != activity) {
            z = false;
        }
        AnonymousClass029.A1J(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        if (this.A00 == null) {
            this.A00 = new C52902bX(super.A0a(), this);
            A0x();
        }
    }

    @Override // X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        if (this.A00 == null) {
            this.A00 = new C52902bX(super.A0a(), this);
            A0x();
        }
    }

    @Override // X.C0BA, X.C0B1
    public C0CR A9l() {
        return AnonymousClass029.A0F(this);
    }

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new C52912bY(this);
                }
            }
        }
        return this.A02.generatedComponent();
    }
}
