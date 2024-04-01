package X;

import android.util.Pair;
import com.whatsapp.util.Log;

/* renamed from: X.3GO  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3GO implements InterfaceC010405f {
    public final C01B A00;
    public final C2zJ A01;
    public final C05Y A02;
    public final C0Ml A03 = new C0Ml();

    public C3GO(C01B c01b, C05Y c05y, C2zJ c2zJ) {
        this.A00 = c01b;
        this.A02 = c05y;
        this.A01 = c2zJ;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        C000200d.A14("ResumeCheckProtocolHelper/onDeliveryFailure iqId:", str);
        this.A03.A00(new C3TL(str));
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        StringBuilder sb = new StringBuilder("ResumeCheckProtocolHelper/onError iqId:");
        sb.append(str);
        Log.i(sb.toString());
        Pair A00 = C2GM.A00(c02590Ca);
        if (A00 != null) {
            this.A01.A00(((Number) A00.first).intValue(), ((Number) A00.second).intValue());
        } else {
            this.A01.A00(0, 0);
        }
        this.A03.A01(null);
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        String str2;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder("ResumeCheckProtocolHelper/onSuccess iqId:");
        sb.append(str);
        Log.i(sb.toString());
        C02590Ca A0D = c02590Ca.A0D("resume");
        if (A0D != null) {
            C04P A0A = A0D.A0A("url");
            if (A0A != null) {
                str2 = A0A.A03;
            } else {
                str2 = null;
            }
            C04P A0A2 = A0D.A0A("resume");
            if (A0A2 != null) {
                str3 = A0A2.A03;
            } else {
                str3 = null;
            }
            C04P A0A3 = A0D.A0A("direct_path");
            if (A0A3 != null) {
                str4 = A0A3.A03;
            } else {
                str4 = null;
            }
            C2zJ c2zJ = this.A01;
            synchronized (c2zJ) {
                if (str3 == null) {
                    C48162Eb c48162Eb = new C48162Eb();
                    c48162Eb.A03 = C0Qt.FAILURE;
                    c48162Eb.A05 = "empty response";
                    c2zJ.A00 = c48162Eb;
                } else if (str3.equals("complete")) {
                    C48162Eb c48162Eb2 = new C48162Eb();
                    c2zJ.A00 = c48162Eb2;
                    c48162Eb2.A06 = str2;
                    c48162Eb2.A04 = str4;
                    c48162Eb2.A03 = C0Qt.COMPLETE;
                } else {
                    C48162Eb c48162Eb3 = new C48162Eb();
                    c2zJ.A00 = c48162Eb3;
                    c48162Eb3.A02 = Integer.parseInt(str3);
                    c48162Eb3.A03 = C0Qt.RESUME;
                }
            }
        } else {
            C2zJ c2zJ2 = this.A01;
            if (c2zJ2 != null) {
                StringBuilder sb2 = new StringBuilder("ResumeCheckProtocolHelper/onMalformedResponse response:");
                sb2.append(c02590Ca);
                Log.i(sb2.toString());
                StringBuilder sb3 = new StringBuilder("tags:");
                C02590Ca[] c02590CaArr = c02590Ca.A03;
                if (c02590CaArr != null) {
                    for (C02590Ca c02590Ca2 : c02590CaArr) {
                        sb3.append(c02590Ca2.A00);
                        sb3.append(',');
                    }
                } else {
                    sb3.append("null");
                }
                c2zJ2.A02.A09("resume_check/unexpected iq response", sb3.toString(), true);
                c2zJ2.A00(0, 0);
            } else {
                throw null;
            }
        }
        this.A03.A01(null);
    }
}
