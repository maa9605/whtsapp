package com.whatsapp.mediacomposer;

import X.AnonymousClass005;
import X.AnonymousClass029;
import X.C0CR;
import X.C0CS;
import X.C52902bX;
import X.C52912bY;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

/* loaded from: classes2.dex */
public abstract class Hilt_MediaComposerFragment extends WaFragment implements AnonymousClass005 {
    public ContextWrapper A00;
    public volatile C52912bY A03;
    public final Object A02 = new Object();
    public boolean A01 = false;

    @Override // X.C0BA
    public Context A0a() {
        return this.A00;
    }

    @Override // X.C0BA
    public LayoutInflater A0b(Bundle bundle) {
        return LayoutInflater.from(new C52902bX(A03(), this));
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

    public void A0x() {
        if (this instanceof Hilt_VideoComposerFragment) {
            Hilt_VideoComposerFragment hilt_VideoComposerFragment = (Hilt_VideoComposerFragment) this;
            if (hilt_VideoComposerFragment.A01) {
                return;
            }
            hilt_VideoComposerFragment.A01 = true;
            ((C0CS) hilt_VideoComposerFragment.generatedComponent()).A1w((VideoComposerFragment) hilt_VideoComposerFragment);
        } else if (this instanceof Hilt_ImageComposerFragment) {
            Hilt_ImageComposerFragment hilt_ImageComposerFragment = (Hilt_ImageComposerFragment) this;
            if (hilt_ImageComposerFragment.A01) {
                return;
            }
            hilt_ImageComposerFragment.A01 = true;
            ((C0CS) hilt_ImageComposerFragment.generatedComponent()).A1u((ImageComposerFragment) hilt_ImageComposerFragment);
        } else if (!(this instanceof Hilt_GifComposerFragment)) {
            if (this.A01) {
                return;
            }
            this.A01 = true;
            ((C0CS) generatedComponent()).A1v((MediaComposerFragment) this);
        } else {
            Hilt_GifComposerFragment hilt_GifComposerFragment = (Hilt_GifComposerFragment) this;
            if (hilt_GifComposerFragment.A01) {
                return;
            }
            hilt_GifComposerFragment.A01 = true;
            ((C0CS) hilt_GifComposerFragment.generatedComponent()).A1t((GifComposerFragment) hilt_GifComposerFragment);
        }
    }

    @Override // X.C0BA, X.C0B1
    public C0CR A9l() {
        return AnonymousClass029.A0F(this);
    }

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    this.A03 = new C52912bY(this);
                }
            }
        }
        return this.A03.generatedComponent();
    }
}
