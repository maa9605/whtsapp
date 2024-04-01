package com.whatsapp.wabloks.base;

import X.ActivityC02290Ap;
import X.AnonymousClass024;
import X.C002301c;
import X.C00J;
import X.C018508q;
import X.C09250cv;
import X.C09M;
import X.C0BA;
import X.C0E7;
import X.C2MB;
import X.C33391fp;
import X.C45Q;
import X.C4GD;
import X.C892046c;
import X.C90364As;
import X.InterfaceC889445b;
import X.InterfaceC90354Ar;
import X.RunnableC74983eA;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.base.BkScreenFragment;
import java.io.InputStream;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class BkScreenFragment extends Hilt_BkScreenFragment {
    public View A00;
    public WebView A01;
    public FrameLayout A02;
    public FrameLayout A03;
    public C33391fp A04;
    public C0E7 A05;
    public C2MB A06;
    public C00J A07;
    public C00J A08;
    public C00J A09;

    @Override // X.C0BA
    public void A0f() {
        this.A0U = true;
        View currentFocus = A0A().getCurrentFocus();
        if (currentFocus != null) {
            this.A06.A01(currentFocus);
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
        C09M.A01(this.A02);
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A04 = null;
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        this.A02 = (FrameLayout) view.findViewById(R.id.bloks_container);
        this.A01 = (WebView) view.findViewById(R.id.error_view);
        this.A00 = view.findViewById(R.id.bloks_dialogfragment_progressbar);
        this.A03 = (FrameLayout) view.findViewById(R.id.bloks_dialogfragment);
        A19();
        FrameLayout frameLayout = this.A03;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        View view2 = this.A00;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        C90364As c90364As = (C90364As) this.A07.get();
        String string = A02().getString("screen_name");
        if (string != null) {
            c90364As.A00(string, (HashMap) A02().getSerializable("screen_params"), new InterfaceC90354Ar() { // from class: X.3ug
                {
                    BkScreenFragment.this = this;
                }

                @Override // X.InterfaceC90354Ar
                public final void ANz(InputStream inputStream, String str, Exception exc) {
                    BkScreenFragment.this.A1A(inputStream, exc);
                }
            });
            return;
        }
        throw null;
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

    public void A18() {
        View view = this.A00;
        if (view != null) {
            view.setVisibility(8);
        }
        FrameLayout frameLayout = this.A03;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    public final void A19() {
        if (this.A04 != null) {
            ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) A09();
            if (activityC02290Ap != null) {
                activityC02290Ap.onConfigurationChanged(activityC02290Ap.getResources().getConfiguration());
            }
            C09M.A00().A02(new C892046c(this.A0H, activityC02290Ap, this.A06), this.A04, this.A02);
        }
    }

    public void A1A(InputStream inputStream, Exception exc) {
        C018508q c018508q;
        RunnableC74983eA runnableC74983eA;
        try {
            if (exc != null) {
                try {
                    if (exc instanceof C4GD) {
                        throw ((C4GD) exc);
                    }
                    throw exc;
                } catch (C4GD unused) {
                    Intent intent = new Intent();
                    intent.putExtra("error_code", 475);
                    A09().setResult(-1, intent);
                    A09().finish();
                    return;
                } catch (Exception unused2) {
                    boolean A05 = this.A05.A05();
                    int i = R.string.error_invalid_link;
                    if (!A05) {
                        i = R.string.no_internet_message;
                    }
                    Log.e("BloksScreenFragment iq error", exc);
                    View view = ((C0BA) this).A0A;
                    if (view != null) {
                        C09250cv.A00(view, ((C002301c) this.A09.get()).A06(i), 0).A04();
                    }
                    return;
                }
            }
            try {
                C45Q.A0R(AnonymousClass024.A0D(inputStream), new InterfaceC889445b() { // from class: X.4Fm
                    {
                        BkScreenFragment.this = this;
                    }

                    @Override // X.InterfaceC889445b
                    public void AIr(AbstractC016907v abstractC016907v) {
                        BkScreenFragment bkScreenFragment = BkScreenFragment.this;
                        if (bkScreenFragment.A0Y()) {
                            C45Q.A0A();
                            bkScreenFragment.A04 = C45Q.A00.A6g(abstractC016907v);
                            bkScreenFragment.A01.setVisibility(8);
                            bkScreenFragment.A02.setVisibility(0);
                            bkScreenFragment.A19();
                        }
                    }

                    @Override // X.InterfaceC889445b
                    public void AJt(String str) {
                        Log.e(str);
                    }
                });
                c018508q = (C018508q) this.A08.get();
                runnableC74983eA = new RunnableC74983eA(this);
            } catch (Exception e) {
                Log.e("BloksScreenFragment parse error", e);
                View view2 = ((C0BA) this).A0A;
                if (view2 != null) {
                    C09250cv.A00(view2, ((C002301c) this.A09.get()).A06(R.string.error_unexpected), 0).A04();
                }
                c018508q = (C018508q) this.A08.get();
                runnableC74983eA = new RunnableC74983eA(this);
            }
            c018508q.A02.post(runnableC74983eA);
        } finally {
            ((C018508q) this.A08.get()).A02.post(new RunnableC74983eA(this));
        }
    }
}
