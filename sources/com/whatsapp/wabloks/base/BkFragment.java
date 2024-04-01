package com.whatsapp.wabloks.base;

import X.AnonymousClass024;
import X.AnonymousClass478;
import X.C00J;
import X.C09M;
import X.C09O;
import X.C25001Dr;
import X.C25311Ew;
import X.C2MU;
import X.C2Qg;
import X.C33391fp;
import X.C33821gW;
import X.C45Q;
import X.C47P;
import X.C47Q;
import X.C893746t;
import X.C893846u;
import X.InterfaceC021309t;
import X.InterfaceC889445b;
import X.InterfaceC90354Ar;
import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.base.BkFragment;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class BkFragment extends Hilt_BkFragment {
    public FrameLayout A00;
    public C33391fp A01;
    public C09O A02;
    public InterfaceC021309t A03;
    public C47P A04;
    public AnonymousClass478 A05;
    public C47Q A06;
    public C893746t A07;
    public C2Qg A08;
    public C00J A09;
    public C00J A0A;
    public C00J A0B;
    public C00J A0C;
    public C00J A0D;

    @Override // X.C0BA
    public void A0r() {
        this.A01 = null;
        FrameLayout frameLayout = this.A00;
        if (frameLayout != null) {
            C09M.A00();
            C09M.A01(frameLayout);
        }
        C2Qg c2Qg = this.A08;
        if (c2Qg != null) {
            c2Qg.A02(this);
        }
        this.A0U = true;
    }

    @Override // X.C0BA
    public void A0s() {
        this.A0U = true;
        A0y(A00());
    }

    @Override // com.whatsapp.wabloks.base.Hilt_BkFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        C2Qg A00 = ((C2MU) this.A0D.get()).A00(context);
        C2Qg c2Qg = this.A08;
        if (c2Qg != null && c2Qg != A00) {
            c2Qg.A02(this);
        }
        this.A08 = A00;
    }

    @Override // X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        A0y(A00());
    }

    public final void A0y(Context context) {
        if (this.A03 == null) {
            this.A03 = (InterfaceC021309t) this.A0A.get();
            Context applicationContext = context.getApplicationContext();
            InterfaceC021309t interfaceC021309t = this.A03;
            C45Q.A0A();
            C25311Ew c25311Ew = new C25311Ew(C45Q.A01);
            C45Q.A0A();
            Map emptyMap = Collections.emptyMap();
            C47P c47p = this.A04;
            AnonymousClass478 anonymousClass478 = this.A05;
            C47Q c47q = this.A06;
            C09O c09o = this.A02;
            C893746t c893746t = this.A07;
            C09M.A0C = new C09M(applicationContext, interfaceC021309t, c25311Ew, C893846u.A00, new C25001Dr(), new C33821gW(), emptyMap, c47p, anonymousClass478, c47q, c09o, c893746t);
        }
    }

    public void A0z(InterfaceC90354Ar interfaceC90354Ar, InputStream inputStream, String str, Exception exc) {
        try {
            if (exc == null) {
                C45Q.A0R(AnonymousClass024.A0D(inputStream), new InterfaceC889445b() { // from class: X.4Fj
                    {
                        BkFragment.this = this;
                    }

                    @Override // X.InterfaceC889445b
                    public void AIr(AbstractC016907v abstractC016907v) {
                        BkFragment bkFragment = BkFragment.this;
                        if (bkFragment.A0Y()) {
                            C45Q.A0A();
                            bkFragment.A01 = C45Q.A00.A6g(abstractC016907v);
                            FrameLayout frameLayout = bkFragment.A00;
                            C000700j.A04(frameLayout, "bloksView is null -- setBloksView() not called.");
                            frameLayout.setVisibility(0);
                            if (bkFragment.A01 != null) {
                                ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) bkFragment.A09();
                                if (activityC02290Ap != null) {
                                    activityC02290Ap.onConfigurationChanged(activityC02290Ap.getResources().getConfiguration());
                                }
                                C09M A00 = C09M.A00();
                                C892046c c892046c = new C892046c(bkFragment.A0H, activityC02290Ap, (C2MB) bkFragment.A0C.get());
                                C33391fp c33391fp = bkFragment.A01;
                                FrameLayout frameLayout2 = bkFragment.A00;
                                C000700j.A04(frameLayout2, "bloksView is null -- setBloksView() not called.");
                                A00.A02(c892046c, c33391fp, frameLayout2);
                            }
                        }
                    }

                    @Override // X.InterfaceC889445b
                    public void AJt(String str2) {
                        Log.e(str2);
                    }
                });
                if (interfaceC90354Ar != null) {
                    interfaceC90354Ar.ANz(inputStream, str, exc);
                    return;
                }
                return;
            }
            throw exc;
        } catch (Exception e) {
            Log.e("WaBloksFragment error: ", e);
            if (interfaceC90354Ar != null) {
                interfaceC90354Ar.ANz(inputStream, str, e);
            }
        }
    }
}
