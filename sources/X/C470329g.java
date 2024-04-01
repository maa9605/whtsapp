package X;

import android.util.Base64;
import com.whatsapp.util.Log;

/* renamed from: X.29g  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C470329g implements InterfaceC010405f {
    public static volatile C470329g A02;
    public C41431tu A00;
    public final C05Y A01;

    public C470329g(C05Y c05y) {
        this.A01 = c05y;
    }

    public String A00(byte[] bArr) {
        if (this.A00 == null) {
            Log.e("PrivateStatsSender/requestToSign need to set iq response listener first");
            return null;
        }
        C05Y c05y = this.A01;
        String A022 = c05y.A02();
        if (c05y.A0B(239, A022, new C02590Ca("iq", new C04P[]{new C04P("id", A022, null, (byte) 0), new C04P("xmlns", "privatestats", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("to", C04260Jm.A00)}, new C02590Ca("sign_credential", new C04P[]{new C04P("version", "1", null, (byte) 0)}, new C02590Ca("blinded_credential", null, null, bArr))), this, 32000L)) {
            return A022;
        }
        Log.e("PrivateStatsSender/requestToSign failed to send iq request");
        return null;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        C000200d.A13("PrivateStatsSender/onDeliveryFailure iqId = ", str);
        C41431tu c41431tu = this.A00;
        if (c41431tu != null) {
            synchronized (c41431tu) {
                if (!str.equalsIgnoreCase(c41431tu.A0C)) {
                    Log.e("PrivateStats/onSendFailure mismatched iq id, reset");
                    c41431tu.A04.A03(12);
                    c41431tu.A02();
                    return;
                }
                c41431tu.A03(5);
            }
        }
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        StringBuilder sb = new StringBuilder("PrivateStatsSender/onError iqId = ");
        sb.append(str);
        Log.e(sb.toString());
        C02590Ca A0E = c02590Ca.A0E("error");
        int A04 = A0E.A04("code");
        A0E.A0A("text");
        C41431tu c41431tu = this.A00;
        if (c41431tu != null) {
            synchronized (c41431tu) {
                if (!str.equalsIgnoreCase(c41431tu.A0C)) {
                    Log.e("PrivateStats/onIqResponseError mismatched iq id, reset");
                    c41431tu.A02();
                } else if (A04 == 500) {
                    c41431tu.A03(3);
                } else {
                    Log.e("PrivateStats/onIqResponseError iq errors, stop attempting to send iq");
                    c41431tu.A04.A03(11);
                    c41431tu.A06(false, 2);
                }
            }
        }
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        C02590Ca A0E = c02590Ca.A0E("sign_credential");
        long A06 = A0E.A06("t");
        byte[] bArr = A0E.A0E("signed_credential").A01;
        byte[] bArr2 = A0E.A0E("acs_public_key").A01;
        C02590Ca A0D = A0E.A0D("dleq_proof");
        if (A0D != null) {
            C02590Ca A0E2 = A0D.A0E("c");
            C02590Ca A0E3 = A0D.A0E("s");
            C41431tu c41431tu = this.A00;
            if (c41431tu != null) {
                byte[] bArr3 = A0E2.A01;
                byte[] bArr4 = A0E3.A01;
                synchronized (c41431tu) {
                    if (bArr3 != null) {
                        c41431tu.A04.A05("dleq_proof_c", Base64.encodeToString(bArr3, 10));
                    }
                    if (bArr4 != null) {
                        c41431tu.A04.A05("dleq_proof_s", Base64.encodeToString(bArr4, 10));
                    }
                }
            }
        }
        C41431tu c41431tu2 = this.A00;
        if (c41431tu2 != null) {
            synchronized (c41431tu2) {
                if (!str.equalsIgnoreCase(c41431tu2.A0C)) {
                    Log.e("PrivateStatsToken/onReceiveSignedToken iq requests messed up, reset");
                    c41431tu2.A02();
                } else if (bArr2 != null && bArr != null) {
                    c41431tu2.A07.AS1(new RunnableEBaseShape0S0300100_I0(c41431tu2, bArr2, bArr, A06, 0));
                } else {
                    c41431tu2.A04.A03(10);
                    c41431tu2.A06(false, 3);
                }
            }
        }
    }
}
