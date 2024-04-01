package com.whatsapp.bloks.ui;

import X.ActivityC02290Ap;
import X.C000700j;
import X.C018508q;
import X.C09M;
import X.C2MB;
import X.C33391fp;
import X.C45X;
import X.C892046c;
import X.InterfaceC889445b;
import X.RunnableC56602nc;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.bloks.ui.BloksDialogFragment;
import com.whatsapp.util.Log;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class BloksDialogFragment extends Hilt_BloksDialogFragment {
    public WebView A00;
    public FrameLayout A01;
    public C33391fp A02;
    public C018508q A03;
    public C45X A04;
    public C2MB A05;
    public Boolean A06;

    @Override // X.C0BA
    public void A0f() {
        this.A0U = true;
        View currentFocus = A0A().getCurrentFocus();
        if (currentFocus != null) {
            this.A05.A01(currentFocus);
        }
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_bloks, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0r() {
        super.A0r();
        C09M.A00();
        C09M.A01(this.A01);
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        InterfaceC889445b interfaceC889445b = new InterfaceC889445b() { // from class: X.46w
            {
                BloksDialogFragment.this = this;
            }

            @Override // X.InterfaceC889445b
            public void AIr(AbstractC016907v abstractC016907v) {
                BloksDialogFragment bloksDialogFragment = BloksDialogFragment.this;
                if (bloksDialogFragment.A0Y()) {
                    C45Q.A0A();
                    bloksDialogFragment.A02 = C45Q.A00.A6g(abstractC016907v);
                    bloksDialogFragment.A00.setVisibility(8);
                    bloksDialogFragment.A01.setVisibility(0);
                    bloksDialogFragment.A18();
                }
            }

            @Override // X.InterfaceC889445b
            public void AJt(String str) {
                Log.e(str);
            }
        };
        Bundle A02 = A02();
        String string = A02().getString("screen_name");
        if (string != null) {
            Serializable serializable = A02().getSerializable("screen_params");
            if (A02.getBoolean("hot_reload")) {
                C45X c45x = this.A04;
                C000700j.A06(false);
                try {
                    Class<?> cls = Class.forName("com.whatsapp.bloks.DebugBloksPayloadUtil");
                    cls.getDeclaredMethod("getSingleBloksLayoutFromServerForHotReloading", String.class, HashMap.class, InterfaceC889445b.class).invoke(cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]), string, serializable, interfaceC889445b);
                    return;
                } catch (Exception e) {
                    Log.e("Error getting Debug Bloks Payload Util", e);
                    c45x.A01.AS1(new RunnableC56602nc(c45x, string, interfaceC889445b));
                    return;
                }
            }
            C45X c45x2 = this.A04;
            c45x2.A01.AS1(new RunnableC56602nc(c45x2, string, interfaceC889445b));
            return;
        }
        throw null;
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        this.A01 = (FrameLayout) view.findViewById(R.id.bloks_container);
        this.A00 = (WebView) view.findViewById(R.id.error_view);
        view.findViewById(R.id.bloks_dialogfragment_progressbar);
        view.findViewById(R.id.bloks_dialogfragment);
        A18();
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        Dialog A0z = super.A0z(bundle);
        A0z.setCanceledOnTouchOutside(false);
        Window window = A0z.getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        return A0z;
    }

    public final void A18() {
        if (this.A02 != null) {
            this.A06 = Boolean.TRUE;
            ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) A09();
            if (activityC02290Ap != null) {
                activityC02290Ap.onConfigurationChanged(activityC02290Ap.getResources().getConfiguration());
            }
            C09M.A00().A02(new C892046c(this.A0H, activityC02290Ap, this.A05), this.A02, this.A01);
            this.A06 = Boolean.FALSE;
        }
    }
}
