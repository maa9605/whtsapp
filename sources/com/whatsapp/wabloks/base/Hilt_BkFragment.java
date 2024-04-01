package com.whatsapp.wabloks.base;

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
import com.whatsapp.wabloks.ui.PrivacyNotice.Hilt_PrivacyNoticeFragment;
import com.whatsapp.wabloks.ui.PrivacyNotice.PrivacyNoticeFragment;
import com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment;
import com.whatsapp.wabloks.ui.bottomsheet.Hilt_BkBottomSheetContentFragment;

/* loaded from: classes3.dex */
public abstract class Hilt_BkFragment extends WaFragment implements AnonymousClass005 {
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
        if (this instanceof Hilt_BkBottomSheetContentFragment) {
            Hilt_BkBottomSheetContentFragment hilt_BkBottomSheetContentFragment = (Hilt_BkBottomSheetContentFragment) this;
            if (hilt_BkBottomSheetContentFragment.A01) {
                return;
            }
            hilt_BkBottomSheetContentFragment.A01 = true;
            ((C0CS) hilt_BkBottomSheetContentFragment.generatedComponent()).A3Z((BkBottomSheetContentFragment) hilt_BkBottomSheetContentFragment);
        } else if (!(this instanceof Hilt_PrivacyNoticeFragment)) {
            if (this.A01) {
                return;
            }
            this.A01 = true;
            ((C0CS) generatedComponent()).A3T((BkFragment) this);
        } else {
            Hilt_PrivacyNoticeFragment hilt_PrivacyNoticeFragment = (Hilt_PrivacyNoticeFragment) this;
            if (hilt_PrivacyNoticeFragment.A01) {
                return;
            }
            hilt_PrivacyNoticeFragment.A01 = true;
            ((C0CS) hilt_PrivacyNoticeFragment.generatedComponent()).A3X((PrivacyNoticeFragment) hilt_PrivacyNoticeFragment);
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
