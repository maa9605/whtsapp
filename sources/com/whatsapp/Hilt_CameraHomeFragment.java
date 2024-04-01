package com.whatsapp;

import X.C003701t;
import X.C0CS;
import X.C52902bX;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public abstract class Hilt_CameraHomeFragment extends Hilt_BaseViewStubFragment {
    public ContextWrapper A00;
    public ViewStub A01;
    public C003701t A02;
    public boolean A03 = false;
    public boolean A04 = false;

    @Override // com.whatsapp.base.WaFragment, X.C0BA
    public void A0V(boolean z) {
        ViewStub viewStub;
        super.A0V(z);
        if (z && (viewStub = this.A01) != null && !this.A03) {
            viewStub.inflate();
            this.A03 = true;
        }
    }

    @Override // X.C0BA
    public Context A0a() {
        return this.A00;
    }

    @Override // X.C0BA
    public LayoutInflater A0b(Bundle bundle) {
        return LayoutInflater.from(new C52902bX(LayoutInflater.from(new C52902bX(A03(), this)), this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x000d, code lost:
        if (X.C52912bY.A00(r0) == r4) goto L11;
     */
    @Override // com.whatsapp.Hilt_BaseViewStubFragment, X.C0BA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0c(android.app.Activity r4) {
        /*
            r3 = this;
            super.A0c(r4)
            android.content.ContextWrapper r0 = r3.A00
            r1 = 0
            if (r0 == 0) goto Lf
            android.content.Context r0 = X.C52912bY.A00(r0)
            r2 = 0
            if (r0 != r4) goto L10
        Lf:
            r2 = 1
        L10:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            X.AnonymousClass029.A1J(r2, r0, r1)
            android.content.ContextWrapper r0 = r3.A00
            if (r0 != 0) goto L27
            android.content.ContextWrapper r1 = r3.A00
            X.2bX r0 = new X.2bX
            r0.<init>(r1, r3)
            r3.A00 = r0
            r3.A0x()
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Hilt_CameraHomeFragment.A0c(android.app.Activity):void");
    }

    @Override // X.C0BA
    public void A0e() {
        this.A0U = true;
        this.A03 = false;
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_viewstub, viewGroup, false);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.fragmentViewStub);
        this.A01 = viewStub;
        viewStub.setLayoutResource(R.layout.camera_controls);
        if (!this.A03 && (this.A0j || !this.A02.A0C(128))) {
            this.A01.inflate();
            this.A03 = true;
        }
        return inflate;
    }

    @Override // com.whatsapp.Hilt_BaseViewStubFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        if (this.A00 == null) {
            this.A00 = new C52902bX(((Hilt_BaseViewStubFragment) this).A00, this);
            A0x();
        }
    }

    @Override // com.whatsapp.Hilt_BaseViewStubFragment
    public void A0x() {
        if (this.A04) {
            return;
        }
        this.A04 = true;
        ((C0CS) generatedComponent()).A05((CameraHomeFragment) this);
    }
}
