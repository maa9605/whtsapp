package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4Ag */
/* loaded from: classes3.dex */
public class C90244Ag {
    public final InterfaceC90374At A00;
    public final C00J A01;
    public final C00J A02;
    public final List A03;

    public C90244Ag(C00J c00j, C00J c00j2) {
        InterfaceC90374At interfaceC90374At = new InterfaceC90374At() { // from class: X.3uq
            {
                C90244Ag.this = this;
            }

            @Override // X.InterfaceC90374At
            public final Intent AQc(Context context, Uri uri) {
                return C90244Ag.this.A01(context, uri);
            }
        };
        this.A00 = interfaceC90374At;
        this.A03 = new ArrayList(Arrays.asList(new InterfaceC90374At() { // from class: X.3up
            {
                C90244Ag.this = this;
            }

            @Override // X.InterfaceC90374At
            public final Intent AQc(Context context, Uri uri) {
                return C90244Ag.this.A00(context, uri);
            }
        }, interfaceC90374At));
        this.A01 = c00j;
        this.A02 = c00j2;
    }

    public final C4Ad A00(Context context, Uri uri) {
        JSONObject jSONObject;
        String A05 = ((C003701t) this.A01.get()).A05(210);
        if (TextUtils.isEmpty(A05)) {
            return null;
        }
        C91674Fv c91674Fv = new C91674Fv();
        this.A02.get();
        if (!C44P.A00(uri.toString(), A05, c91674Fv) || (jSONObject = c91674Fv.A00) == null) {
            return null;
        }
        try {
            return new C4Ad(context, "com.bloks.www.minishops.whatsapp.pdp", C02180Ae.A0o(jSONObject), false);
        } catch (JSONException e) {
            Log.e("ShopsLinks.handleShopsPdpLink: Failed to assemble JSON", e);
            return null;
        }
    }

    public final C4Ad A01(Context context, Uri uri) {
        C91674Fv c91674Fv = new C91674Fv();
        if (A02(uri.toString(), c91674Fv)) {
            try {
                return new C4Ad(context, "com.bloks.www.minishops.storefront.wa", C02180Ae.A0o(c91674Fv.A00), false);
            } catch (JSONException e) {
                Log.e("ShopsLinks.handleStoreFrontLink: Failed to assemble JSON", e);
                return null;
            }
        }
        return null;
    }

    public boolean A02(String str, C91674Fv c91674Fv) {
        C00J c00j = this.A01;
        String A05 = ((C003701t) c00j.get()).A05(265);
        if (((C003701t) c00j.get()).A0C(267) && !TextUtils.isEmpty(A05)) {
            this.A02.get();
            if (C44P.A00(str, A05, c91674Fv) && c91674Fv.A00 != null) {
                return true;
            }
        }
        return false;
    }
}
