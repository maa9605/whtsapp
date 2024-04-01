package com.whatsapp.wabloks.base;

import X.ActivityC02290Ap;
import X.AnonymousClass024;
import X.AnonymousClass478;
import X.C000200d;
import X.C000700j;
import X.C00J;
import X.C018508q;
import X.C09M;
import X.C09O;
import X.C25001Dr;
import X.C25311Ew;
import X.C2MB;
import X.C2MU;
import X.C2Qg;
import X.C33391fp;
import X.C33821gW;
import X.C45Q;
import X.C47P;
import X.C47Q;
import X.C85003uh;
import X.C892046c;
import X.C893746t;
import X.C893846u;
import X.InterfaceC021309t;
import X.InterfaceC889445b;
import X.RunnableC74963e8;
import android.content.Context;
import android.widget.FrameLayout;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.base.BkFragment2;
import com.whatsapp.wabloks.ui.shops.ShopsProductPreviewFragment;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class BkFragment2 extends Hilt_BkFragment2 {
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

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0r() {
        this.A01 = null;
        FrameLayout frameLayout = this.A00;
        if (frameLayout != null) {
            C09M.A00();
            C09M.A01(frameLayout);
            this.A00 = null;
        }
        C2Qg c2Qg = this.A08;
        if (c2Qg != null) {
            c2Qg.A02(this);
        }
        super.A0r();
    }

    @Override // X.C0BA
    public void A0s() {
        this.A0U = true;
        Context A00 = A00();
        if (this.A03 == null) {
            this.A03 = (InterfaceC021309t) this.A0A.get();
            Context applicationContext = A00.getApplicationContext();
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

    @Override // com.whatsapp.wabloks.base.Hilt_BkFragment2, com.whatsapp.base.Hilt_WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        C2Qg A00 = ((C2MU) this.A0D.get()).A00(context);
        C2Qg c2Qg = this.A08;
        if (c2Qg != null && c2Qg != A00) {
            c2Qg.A02(this);
        }
        this.A08 = A00;
    }

    public void A18() {
        FrameLayout frameLayout = this.A00;
        C000700j.A04(frameLayout, "bloksView is null -- setBloksView() not called.");
        frameLayout.setVisibility(0);
        if (this.A01 != null) {
            C09M A00 = C09M.A00();
            C892046c c892046c = new C892046c(this.A0H, (ActivityC02290Ap) A09(), (C2MB) this.A0C.get());
            C33391fp c33391fp = this.A01;
            FrameLayout frameLayout2 = this.A00;
            C000700j.A04(frameLayout2, "bloksView is null -- setBloksView() not called.");
            A00.A03(c892046c, c33391fp, frameLayout2, true);
        }
    }

    public void A19(Exception exc) {
        ((C018508q) this.A0B.get()).A0G(new RunnableC74963e8(this, exc));
    }

    public void A1A(Exception exc) {
        try {
            if (!(this instanceof ShopsProductPreviewFragment)) {
                throw exc;
            }
            throw exc;
        } catch (Exception e) {
            Log.e(e);
            e.getMessage();
        }
    }

    public void A1B(final String str, InputStream inputStream, Exception exc) {
        try {
            if (exc == null) {
                C45Q.A0R(AnonymousClass024.A0D(inputStream), new InterfaceC889445b() { // from class: X.4Fk
                    {
                        BkFragment2.this = this;
                    }

                    @Override // X.InterfaceC889445b
                    public void AIr(AbstractC016907v abstractC016907v) {
                        try {
                            BkFragment2 bkFragment2 = BkFragment2.this;
                            if (bkFragment2.A0Y()) {
                                C45Q.A0A();
                                bkFragment2.A01 = C45Q.A00.A6g(abstractC016907v);
                                bkFragment2.A18();
                            }
                        } catch (Exception e) {
                            BkFragment2 bkFragment22 = BkFragment2.this;
                            StringBuilder A0P = C000200d.A0P("Bloks: onComponentReceived Error. AppId=");
                            A0P.append(str);
                            bkFragment22.A19(new C85003uh(A0P.toString(), e));
                        }
                    }

                    @Override // X.InterfaceC889445b
                    public void AJt(String str2) {
                        BkFragment2.this.A19(new C85003uh(C000200d.A0M(C000200d.A0P("Bloks: AppId="), str, ", ", str2)));
                    }
                });
                return;
            }
            throw exc;
        } catch (Exception e) {
            A19(new C85003uh(C000200d.A0H("Bloks: AppId=", str), e));
        }
    }
}
