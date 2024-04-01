package X;

import android.app.Application;
import android.telephony.TelephonyManager;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3mF  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C79803mF extends C0HS {
    public final C02E A00;
    public final C001200o A01;
    public final C000500h A02;
    public final C2DT A03;
    public final C79893mO A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final WeakReference A09;
    public final boolean A0A;

    public C79803mF(boolean z, String str, String str2, String str3, String str4, C001200o c001200o, C79893mO c79893mO, C02E c02e, C22D c22d, C000500h c000500h, C2DT c2dt) {
        this.A0A = z;
        this.A06 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A05 = str4;
        this.A01 = c001200o;
        this.A04 = c79893mO;
        this.A00 = c02e;
        this.A09 = new WeakReference(c22d);
        this.A03 = c2dt;
        this.A02 = c000500h;
        if (this.A07.equals("sms")) {
            C000700j.A03(this.A05);
        }
    }

    @Override // X.C0HS
    public void A06() {
        StringBuilder A0P = C000200d.A0P("requestcode/");
        String str = this.A07;
        C000200d.A1N(A0P, str);
        C22D c22d = (C22D) this.A09.get();
        if (c22d != null) {
            c22d.AUs(this.A0A, str);
        }
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        String str;
        Application application = this.A01.A00;
        String str2 = this.A08;
        String A00 = C3VN.A00(application, str2);
        StringBuilder A0P = C000200d.A0P("requestcode/");
        String str3 = this.A07;
        C000200d.A1Q(A0P, str3, "/bkgnd");
        String string = this.A02.A00.getString("com.whatsapp.registration.RegisterPhone.mistyped_state", null);
        TelephonyManager A0G = this.A00.A0G();
        if (A0G != null) {
            str = A0G.getNetworkOperator();
        } else {
            str = null;
        }
        C28A A002 = C28A.A00(str);
        C28A A003 = C28A.A00(A0G != null ? A0G.getSimOperator() : null);
        try {
            C2DT c2dt = this.A03;
            String str4 = this.A06;
            String str5 = C28E.A00;
            String str6 = this.A05;
            C79893mO c79893mO = this.A04;
            c2dt.A05();
            byte[] A09 = c2dt.A09(str4, str2);
            Log.i("http/registration/wamsys/requestcode");
            HashMap hashMap = new HashMap();
            if (string != null) {
                hashMap.put("mistyped", string.getBytes());
            }
            hashMap.put("reason", str5.getBytes());
            if (str6 != null) {
                hashMap.put("hasav", str6.getBytes());
            }
            hashMap.put("client_metrics", c79893mO.A00().toString().getBytes());
            hashMap.put("mcc", A002.A00.getBytes());
            hashMap.put("mnc", A002.A01.getBytes());
            hashMap.put("sim_mcc", A003.A00.getBytes());
            hashMap.put("sim_mnc", A003.A01.getBytes());
            c2dt.A08(hashMap);
            c2dt.A07(hashMap);
            C2DW c2dw = c2dt.A0F;
            List A04 = c2dt.A04();
            C05630Pm c05630Pm = c2dt.A00;
            if (c2dw != null) {
                C3Z4 c3z4 = (C3Z4) C2DZ.A00(new C85223v3(c2dw, c05630Pm, str4, str2, A09, A00, str3, hashMap, A04));
                if (c3z4 != null && c3z4.A05 == C3Z5.YES_WITH_CODE) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("requestcode/");
                    sb.append(str3);
                    sb.append("/status/error/yes-with-code");
                    Log.e(sb.toString());
                }
                return new C0FK(c3z4.A05, c3z4);
            }
            throw null;
        } catch (Exception e) {
            StringBuilder A0P2 = C000200d.A0P("requestcode/");
            A0P2.append(str3);
            A0P2.append("/error ");
            Log.e(A0P2.toString(), e);
            return new C0FK(C3Z5.ERROR_UNSPECIFIED, null);
        }
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C0FK c0fk = (C0FK) obj;
        C22D c22d = (C22D) this.A09.get();
        if (c22d == null) {
            StringBuilder A0P = C000200d.A0P("requestcode/");
            A0P.append(this.A07);
            A0P.append("/error/callback null");
            Log.e(A0P.toString());
            return;
        }
        boolean z = this.A0A;
        String str = this.A07;
        c22d.AEe(z, str);
        Object obj2 = c0fk.A00;
        if (obj2 == null) {
            throw null;
        }
        c22d.AIg(str, (C3Z5) obj2, (C3Z4) c0fk.A01);
    }
}
