package com.whatsapp.wabloks.ui.PrivacyNotice;

import X.C00J;
import X.C50162Qh;
import X.C90364As;
import X.C91644Fs;
import X.InterfaceC90354Ar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.base.BkFragment;
import com.whatsapp.wabloks.ui.PrivacyNotice.PrivacyNoticeFragment;
import java.io.InputStream;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class PrivacyNoticeFragment extends Hilt_PrivacyNoticeFragment {
    public WebView A00;
    public FrameLayout A01;
    public C00J A02;

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_bloks, viewGroup, false);
    }

    @Override // com.whatsapp.wabloks.base.BkFragment, X.C0BA
    public void A0r() {
        super.A0r();
        this.A00 = null;
        this.A01 = null;
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        this.A01 = (FrameLayout) view.findViewById(R.id.bloks_container);
        this.A00 = (WebView) view.findViewById(R.id.error_view);
        view.findViewById(R.id.bloks_dialogfragment_progressbar);
        view.findViewById(R.id.bloks_dialogfragment);
        ((BkFragment) this).A00 = this.A01;
        String string = A02().getString("screen_name");
        if (string != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("params", "{\"params\":{}}");
            final InterfaceC90354Ar interfaceC90354Ar = new InterfaceC90354Ar() { // from class: X.3ut
                {
                    PrivacyNoticeFragment.this = this;
                }

                @Override // X.InterfaceC90354Ar
                public final void ANz(InputStream inputStream, String str, Exception exc) {
                    PrivacyNoticeFragment.this.A11(exc);
                }
            };
            ((C90364As) ((BkFragment) this).A09.get()).A00(string, hashMap, new InterfaceC90354Ar() { // from class: X.3ue
                @Override // X.InterfaceC90354Ar
                public final void ANz(InputStream inputStream, String str, Exception exc) {
                    this.A0z(interfaceC90354Ar, inputStream, str, exc);
                }
            });
            return;
        }
        throw null;
    }

    public /* synthetic */ void A10(int i) {
        ((BkFragment) this).A08.A00(new C50162Qh(i));
        ((BkFragment) this).A08.A00(new C91644Fs());
    }

    public void A11(Exception exc) {
        try {
            if (exc == null) {
                this.A00.setVisibility(8);
                return;
            }
            throw exc;
        } catch (Throwable th) {
            Log.e("PrivacyNoticeFragment error: ", th);
        }
    }
}
