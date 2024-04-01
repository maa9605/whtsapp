package X;

import com.whatsapp.settings.SettingsPrivacy;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.283  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass283 implements InterfaceC010405f {
    public final C0NB A00;
    public final C05Y A01;

    public AnonymousClass283(C05Y c05y, C0NB c0nb) {
        this.A01 = c05y;
        this.A00 = c0nb;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        C000200d.A15("PrivacySettingsProtocolHelper/onDeliveryFailure iqid=", str);
        if (this.A00 == null) {
            throw null;
        }
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        Log.e("PrivacySettingsProtocolHelper/onError");
        if (this.A00 == null) {
            throw null;
        }
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        String str2;
        String str3;
        C02590Ca A0B = c02590Ca.A0B();
        C02590Ca.A01(A0B, "privacy");
        HashMap hashMap = new HashMap();
        C02590Ca[] c02590CaArr = A0B.A03;
        if (c02590CaArr != null) {
            for (C02590Ca c02590Ca2 : c02590CaArr) {
                C02590Ca.A01(c02590Ca2, "category");
                C04P A0A = c02590Ca2.A0A("name");
                if (A0A != null) {
                    str2 = A0A.A03;
                } else {
                    str2 = null;
                }
                C04P A0A2 = c02590Ca2.A0A("value");
                if (A0A2 != null) {
                    str3 = A0A2.A03;
                } else {
                    str3 = null;
                }
                if ("error".equals(str3)) {
                    C02590Ca A0B2 = c02590Ca2.A0B();
                    C02590Ca.A01(A0B2, "error");
                    C04P A0A3 = A0B2.A0A("code");
                    str3 = A0A3 != null ? A0A3.A03 : null;
                }
                hashMap.put(str2, str3);
            }
        }
        C0NB c0nb = this.A00;
        InterfaceC04440Ke interfaceC04440Ke = c0nb.A00;
        if (interfaceC04440Ke != null) {
            ((AnonymousClass281) interfaceC04440Ke).A00(3);
        }
        C04960Mq c04960Mq = c0nb.A01;
        SettingsPrivacy.A03(c04960Mq.A00, c04960Mq.A03, c04960Mq.A01, c04960Mq, hashMap);
    }
}
