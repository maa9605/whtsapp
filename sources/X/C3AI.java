package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.3AI  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3AI implements InterfaceC010405f {
    public final C05Y A00;
    public final WeakReference A01;

    public C3AI(InterfaceC49902Nn interfaceC49902Nn, C05Y c05y) {
        this.A01 = new WeakReference(interfaceC49902Nn);
        this.A00 = c05y;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        Log.e("sendVerifyLinkRequest/delivery failure ");
        InterfaceC49902Nn interfaceC49902Nn = (InterfaceC49902Nn) this.A01.get();
        if (interfaceC49902Nn != null) {
            interfaceC49902Nn.AJp(500);
        }
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        int A01 = C40731sm.A01(c02590Ca);
        C000200d.A0r("sendVerifyLinkRequest/response-error ", A01);
        InterfaceC49902Nn interfaceC49902Nn = (InterfaceC49902Nn) this.A01.get();
        if (interfaceC49902Nn != null) {
            interfaceC49902Nn.AJp(A01);
        }
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        int i;
        String A0F;
        C02590Ca A0D = c02590Ca.A0D("response");
        InterfaceC49902Nn interfaceC49902Nn = (InterfaceC49902Nn) this.A01.get();
        if (A0D == null) {
            int A01 = C40731sm.A01(c02590Ca);
            if (interfaceC49902Nn != null) {
                interfaceC49902Nn.AJp(A01);
            }
            C000200d.A0r("sendVerifyLinkRequest/response-error ", A01);
            return;
        }
        C02590Ca A0D2 = A0D.A0D("status");
        if (A0D2 == null) {
            if (interfaceC49902Nn != null) {
                interfaceC49902Nn.AJp(-1);
            }
            Log.w("sendVerifyLinkRequest/response-error -1");
            return;
        }
        try {
            if (A0D2.A0F() != null) {
                i = Integer.parseInt(A0D2.A0F());
                if (i == 200) {
                    C02590Ca A0D3 = A0D.A0D("url");
                    if (A0D3 != null) {
                        A0F = A0D3.A0F();
                    } else {
                        A0F = null;
                    }
                    if (interfaceC49902Nn != null) {
                        interfaceC49902Nn.APG(AnonymousClass024.A0j(A0F) ? null : Uri.parse(A0F));
                        return;
                    }
                    return;
                }
            } else {
                i = 0;
            }
            if (interfaceC49902Nn != null) {
                interfaceC49902Nn.AJp(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("sendVerifyLinkRequest/response-error ");
            sb.append(i);
            Log.w(sb.toString());
        } catch (NumberFormatException unused) {
            if (interfaceC49902Nn != null) {
                interfaceC49902Nn.AJp(-1);
            }
            Log.w("sendVerifyLinkRequest/response-error -1");
        }
    }
}
