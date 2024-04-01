package X;

import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.26t  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C464226t implements C0EK {
    public static volatile C464226t A04;
    public final C41541u6 A00;
    public final C0EG A01;
    public final C0EJ A02;
    public final InterfaceC002901k A03;

    @Override // X.C0EK
    public int[] AAP() {
        return new int[]{210};
    }

    public C464226t(InterfaceC002901k interfaceC002901k, C0EG c0eg, C41541u6 c41541u6, C0EJ c0ej) {
        this.A03 = interfaceC002901k;
        this.A01 = c0eg;
        this.A00 = c41541u6;
        this.A02 = c0ej;
    }

    @Override // X.C0EK
    public boolean AEN(int i, Message message) {
        String str;
        if (i != 210) {
            return false;
        }
        C02590Ca c02590Ca = (C02590Ca) message.obj;
        if (c02590Ca != null) {
            Parcelable parcelable = message.getData().getParcelable("stanzaKey");
            C000700j.A04(parcelable, "stanzaKey is null");
            C04420Kc c04420Kc = (C04420Kc) parcelable;
            C05140Nm A042 = this.A02.A04(c04420Kc.A00);
            if (A042 != null) {
                A042.A00(3);
            }
            HashMap hashMap = new HashMap();
            for (C02590Ca c02590Ca2 : c02590Ca.A0H("collection")) {
                C04P A0A = c02590Ca2.A0A("name");
                if (A0A != null) {
                    str = A0A.A03;
                } else {
                    str = null;
                }
                C04P A0A2 = c02590Ca2.A0A("version");
                long A01 = AnonymousClass024.A01(A0A2 != null ? A0A2.A03 : null, 0);
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put(str, Long.valueOf(A01));
                }
            }
            this.A03.AS1(new RunnableEBaseShape0S0300000_I0_0(this, hashMap, c04420Kc, 29));
            return true;
        }
        return true;
    }
}
