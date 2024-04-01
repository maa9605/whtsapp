package com.whatsapp.wabloks.ui.shops;

import X.AnonymousClass011;
import X.AnonymousClass024;
import X.C000200d;
import X.C02180Ae;
import X.C0FK;
import X.C0HK;
import X.C0MU;
import X.C45Q;
import X.C85003uh;
import X.C90244Ag;
import X.C90364As;
import X.C91674Fv;
import X.InterfaceC41261td;
import X.InterfaceC889445b;
import X.InterfaceC90354Ar;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.ui.shops.ShopsProductPreviewFragmentViewModel;
import java.io.InputStream;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ShopsProductPreviewFragmentViewModel extends C0MU {
    public final C0HK A00 = new C0HK();
    public final AnonymousClass011 A01;
    public final C90244Ag A02;
    public final C90364As A03;
    public final InterfaceC41261td A04;

    public ShopsProductPreviewFragmentViewModel(C90244Ag c90244Ag, InterfaceC41261td interfaceC41261td, AnonymousClass011 anonymousClass011, C90364As c90364As) {
        this.A02 = c90244Ag;
        this.A04 = interfaceC41261td;
        this.A01 = anonymousClass011;
        this.A03 = c90364As;
    }

    public void A02(String str) {
        HashMap hashMap = new HashMap();
        C91674Fv c91674Fv = new C91674Fv();
        if (this.A02.A02(str, c91674Fv)) {
            try {
                JSONObject jSONObject = c91674Fv.A00;
                if (jSONObject != null) {
                    hashMap.put("params", C02180Ae.A0o(jSONObject));
                    this.A03.A00("com.bloks.www.minishops.whatsapp.products_preview_h_scroll", hashMap, new InterfaceC90354Ar() { // from class: X.3uw
                        public final /* synthetic */ String A01 = "com.bloks.www.minishops.whatsapp.products_preview_h_scroll";

                        @Override // X.InterfaceC90354Ar
                        public final void ANz(InputStream inputStream, String str2, Exception exc) {
                            ShopsProductPreviewFragmentViewModel.this.A03(this.A01, inputStream, exc);
                        }
                    });
                    return;
                }
                throw null;
            } catch (JSONException e) {
                Log.e(e);
            }
        }
    }

    public void A03(final String str, InputStream inputStream, Exception exc) {
        try {
            if (exc == null) {
                C45Q.A0R(AnonymousClass024.A0D(inputStream), new InterfaceC889445b() { // from class: X.4G8
                    @Override // X.InterfaceC889445b
                    public void AIr(AbstractC016907v abstractC016907v) {
                        try {
                            C45Q.A0A();
                            ShopsProductPreviewFragmentViewModel.this.A00.A0B(new C0FK(C45Q.A00.A6g(abstractC016907v), null));
                        } catch (Exception e) {
                            C0HK c0hk = ShopsProductPreviewFragmentViewModel.this.A00;
                            StringBuilder A0P = C000200d.A0P("Bloks: onComponentReceived Error. AppId=");
                            A0P.append(str);
                            c0hk.A0B(new C0FK(null, new C85003uh(A0P.toString(), e)));
                        }
                    }

                    @Override // X.InterfaceC889445b
                    public void AJt(String str2) {
                        ShopsProductPreviewFragmentViewModel.this.A00.A0A(new C0FK(null, new C85003uh(C000200d.A0M(C000200d.A0P("Bloks: AppId="), str, ", ", str2))));
                    }
                });
                return;
            }
            throw exc;
        } catch (Exception e) {
            this.A00.A0A(new C0FK(null, new C85003uh(C000200d.A0H("Bloks: AppId=", str), e)));
        }
    }
}
