package com.whatsapp.wabloks.ui;

import X.C90364As;
import X.InterfaceC90354Ar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.wabloks.base.BkFragment2;
import java.io.InputStream;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class BkSampleFragment extends BkFragment2 {
    public FrameLayout A00;

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.bk_sample_fragment, viewGroup, false);
        this.A00 = frameLayout;
        return frameLayout;
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        ((BkFragment2) this).A00 = this.A00;
        HashMap hashMap = new HashMap();
        hashMap.put("params", "{\"params\":{}}");
        ((C90364As) ((BkFragment2) this).A09.get()).A00("com.bloks.www.minishops.whatsapp.privacy_notice", hashMap, new InterfaceC90354Ar() { // from class: X.3uf
            public final /* synthetic */ String A01 = "com.bloks.www.minishops.whatsapp.privacy_notice";

            @Override // X.InterfaceC90354Ar
            public final void ANz(InputStream inputStream, String str, Exception exc) {
                BkFragment2.this.A1B(this.A01, inputStream, exc);
            }
        });
    }
}
