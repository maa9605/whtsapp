package com.whatsapp.gallery;

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
import com.whatsapp.camera.CameraMediaPickerFragment;
import com.whatsapp.camera.Hilt_CameraMediaPickerFragment;
import com.whatsapp.gallerypicker.Hilt_MediaPickerFragment;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.storage.Hilt_StorageUsageMediaGalleryFragment;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;

/* loaded from: classes2.dex */
public abstract class Hilt_MediaGalleryFragmentBase extends WaFragment implements AnonymousClass005 {
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
        if (this instanceof Hilt_StorageUsageMediaGalleryFragment) {
            Hilt_StorageUsageMediaGalleryFragment hilt_StorageUsageMediaGalleryFragment = (Hilt_StorageUsageMediaGalleryFragment) this;
            if (hilt_StorageUsageMediaGalleryFragment.A01) {
                return;
            }
            hilt_StorageUsageMediaGalleryFragment.A01 = true;
            ((C0CS) hilt_StorageUsageMediaGalleryFragment.generatedComponent()).A34((StorageUsageMediaGalleryFragment) hilt_StorageUsageMediaGalleryFragment);
        } else if (this instanceof Hilt_MediaPickerFragment) {
            Hilt_MediaPickerFragment hilt_MediaPickerFragment = (Hilt_MediaPickerFragment) this;
            if (hilt_MediaPickerFragment.A01) {
                return;
            }
            hilt_MediaPickerFragment.A01 = true;
            ((C0CS) hilt_MediaPickerFragment.generatedComponent()).A1d((MediaPickerFragment) hilt_MediaPickerFragment);
        } else if (this instanceof Hilt_MediaGalleryFragment) {
            Hilt_MediaGalleryFragment hilt_MediaGalleryFragment = (Hilt_MediaGalleryFragment) this;
            if (hilt_MediaGalleryFragment.A01) {
                return;
            }
            hilt_MediaGalleryFragment.A01 = true;
            ((C0CS) hilt_MediaGalleryFragment.generatedComponent()).A1Z((MediaGalleryFragment) hilt_MediaGalleryFragment);
        } else if (!(this instanceof Hilt_CameraMediaPickerFragment)) {
            if (this.A01) {
                return;
            }
            this.A01 = true;
            ((C0CS) generatedComponent()).A1a((MediaGalleryFragmentBase) this);
        } else {
            Hilt_CameraMediaPickerFragment hilt_CameraMediaPickerFragment = (Hilt_CameraMediaPickerFragment) this;
            if (hilt_CameraMediaPickerFragment.A01) {
                return;
            }
            hilt_CameraMediaPickerFragment.A01 = true;
            ((C0CS) hilt_CameraMediaPickerFragment.generatedComponent()).A0q((CameraMediaPickerFragment) hilt_CameraMediaPickerFragment);
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
