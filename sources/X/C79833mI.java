package X;

import android.telephony.TelephonyManager;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3mI  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C79833mI extends C0HS {
    public final C000500h A00;
    public final C2DT A01;
    public final C79903mP A02;
    public final C3Z0 A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final WeakReference A07;

    public C79833mI(String str, String str2, String str3, C3Z0 c3z0, C22C c22c, C000500h c000500h, C2DT c2dt, C79903mP c79903mP) {
        this.A04 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A03 = c3z0;
        this.A02 = c79903mP;
        this.A07 = new WeakReference(c22c);
        this.A01 = c2dt;
        this.A00 = c000500h;
        C79903mP c79903mP2 = this.A02;
        int i = c000500h.A00.getInt("reg_attempts_verify_code", 0) + 1;
        C000200d.A0g(c000500h, "reg_attempts_verify_code", i);
        ((C2DX) c79903mP2).A00 = i;
    }

    @Override // X.C0HS
    public void A06() {
        C000200d.A1N(C000200d.A0P("verifycode/"), this.A05);
        C22C c22c = (C22C) this.A07.get();
        if (c22c != null) {
            c22c.AUt();
        }
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        String str;
        String str2;
        String str3;
        String str4 = ((String[]) objArr)[0];
        if (str4 != null) {
            StringBuilder sb = new StringBuilder("verifycode/");
            String str5 = this.A05;
            sb.append(str5);
            sb.append("/code ");
            sb.append(str4);
            Log.i(sb.toString());
            C000500h c000500h = this.A00;
            String string = c000500h.A00.getString("com.whatsapp.registration.RegisterPhone.mistyped_state", null);
            try {
                C2DT c2dt = this.A01;
                String str6 = this.A04;
                String str7 = this.A06;
                C3Z0 c3z0 = this.A03;
                C79903mP c79903mP = this.A02;
                c2dt.A05();
                byte[] A09 = c2dt.A09(str6, str7);
                int ordinal = c3z0.ordinal();
                int i = 2;
                if (ordinal == 0) {
                    i = 1;
                } else if (ordinal != 1) {
                    if (ordinal == 2) {
                        i = 3;
                    } else if (ordinal != 3) {
                        Log.w("http/registration/entrymethod/unknown");
                        i = 0;
                    } else {
                        i = 4;
                    }
                }
                String valueOf = String.valueOf(i);
                TelephonyManager A0G = c2dt.A02.A0G();
                if (A0G != null) {
                    str = A0G.getNetworkOperator();
                } else {
                    str = null;
                }
                C28A A00 = C28A.A00(str);
                if (A0G != null) {
                    str2 = A0G.getSimOperator();
                } else {
                    str2 = null;
                }
                C28A A002 = C28A.A00(str2);
                if (A0G != null) {
                    str3 = A0G.getNetworkOperatorName();
                } else {
                    str3 = "";
                }
                String simOperatorName = A0G != null ? A0G.getSimOperatorName() : "";
                Log.i("http/registration/wamsys/verifycode");
                HashMap hashMap = new HashMap();
                if (string != null) {
                    hashMap.put("mistyped", string.getBytes());
                }
                hashMap.put("client_metrics", c79903mP.A00().toString().getBytes());
                hashMap.put("entered", valueOf.getBytes());
                hashMap.put("mcc", A00.A00.getBytes());
                hashMap.put("mnc", A00.A01.getBytes());
                hashMap.put("sim_mcc", A002.A00.getBytes());
                hashMap.put("sim_mnc", A002.A01.getBytes());
                hashMap.put("network_operator_name", str3.getBytes());
                hashMap.put("sim_operator_name", simOperatorName.getBytes());
                c2dt.A08(hashMap);
                c2dt.A07(hashMap);
                C2DW c2dw = c2dt.A0F;
                List A04 = c2dt.A04();
                C05630Pm c05630Pm = c2dt.A00;
                if (c2dw != null) {
                    C3Z6 c3z6 = (C3Z6) C2DZ.A00(new C85243v5(c2dw, c05630Pm, str4, str6, str7, A09, hashMap, A04));
                    if (c3z6 != null && c3z6.A01 == C3Z7.YES) {
                        c2dt.A06(c3z6.A02);
                    }
                    c000500h.A0D().putString("registration_code", str4).apply();
                    return new Pair(c3z6.A01, c3z6);
                }
                throw null;
            } catch (Exception e) {
                StringBuilder A0P = C000200d.A0P("verifycode/");
                A0P.append(str5);
                A0P.append("/error ");
                Log.e(A0P.toString(), e);
                return new Pair(C3Z7.ERROR_UNSPECIFIED, null);
            }
        }
        throw null;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        Pair pair = (Pair) obj;
        C22C c22c = (C22C) this.A07.get();
        if (c22c != null) {
            c22c.AEg();
            c22c.AIh(this.A05, (C3Z7) pair.first, (C3Z6) pair.second);
        }
    }
}
