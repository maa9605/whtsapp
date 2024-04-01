package com.whatsapp;

import X.AnonymousClass005;
import X.AnonymousClass029;
import X.C0CR;
import X.C52902bX;
import X.C52912bY;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

/* loaded from: classes.dex */
public abstract class Hilt_RoundedBottomSheetDialogFragment extends BottomSheetDialogFragment implements AnonymousClass005 {
    public ContextWrapper A00;
    public final Object A01 = new Object();
    public volatile C52912bY A02;

    public abstract void A18();

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public LayoutInflater A0b(Bundle bundle) {
        return LayoutInflater.from(new C52902bX(super.A0b(bundle), this));
    }

    @Override // X.C0BA
    public void A0c(Activity activity) {
        boolean z = true;
        this.A0U = true;
        ContextWrapper contextWrapper = this.A00;
        if (contextWrapper != null && C52912bY.A00(contextWrapper) != activity) {
            z = false;
        }
        AnonymousClass029.A1J(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        A17();
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        A17();
    }

    public final void A17() {
        if (this.A00 == null) {
            this.A00 = new C52902bX(super.A0a(), this);
            A18();
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
