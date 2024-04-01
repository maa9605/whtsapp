package X;

import android.app.Application;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2DT */
/* loaded from: classes2.dex */
public class C2DT {
    public static volatile C2DT A0G;
    public final C05630Pm A00;
    public final C0E7 A01;
    public final C02E A02;
    public final C001200o A03;
    public final C02F A04;
    public final C000500h A05;
    public final C002301c A06;
    public final C2DV A07;
    public final C41451tw A08;
    public final C42101v5 A09;
    public final C462526a A0A;
    public final AnonymousClass035 A0B;
    public final C004902f A0C;
    public final InterfaceC002901k A0D;
    public final C43361xH A0E;
    public final C2DW A0F;

    public C2DT(C001200o c001200o, C004902f c004902f, InterfaceC002901k interfaceC002901k, C43361xH c43361xH, C42101v5 c42101v5, C02E c02e, C002301c c002301c, C462526a c462526a, AnonymousClass035 anonymousClass035, C0E7 c0e7, C41451tw c41451tw, C02F c02f, C000500h c000500h, C05630Pm c05630Pm, C2DV c2dv, C2DW c2dw) {
        this.A03 = c001200o;
        this.A0C = c004902f;
        this.A0D = interfaceC002901k;
        this.A0E = c43361xH;
        this.A09 = c42101v5;
        this.A02 = c02e;
        this.A06 = c002301c;
        this.A0A = c462526a;
        this.A0B = anonymousClass035;
        this.A01 = c0e7;
        this.A08 = c41451tw;
        this.A04 = c02f;
        this.A05 = c000500h;
        this.A00 = c05630Pm;
        this.A07 = c2dv;
        this.A0F = c2dw;
    }

    /* JADX WARN: Type inference failed for: r20v0, types: [X.2DW] */
    public static C2DT A00() {
        if (A0G == null) {
            synchronized (C2DT.class) {
                if (A0G == null) {
                    C001200o c001200o = C001200o.A01;
                    AnonymousClass012.A00();
                    C004902f A00 = C004902f.A00();
                    InterfaceC002901k A002 = C002801j.A00();
                    C43361xH A003 = C43361xH.A00();
                    C42101v5 A004 = C42101v5.A00();
                    C02E A005 = C02E.A00();
                    C002301c A006 = C002301c.A00();
                    C462526a A007 = C462526a.A00();
                    AnonymousClass035 A008 = AnonymousClass035.A00();
                    C0E7 A009 = C0E7.A00();
                    C41451tw A0010 = C41451tw.A00();
                    C02F A0011 = C02F.A00();
                    C000500h A0012 = C000500h.A00();
                    if (C05630Pm.A01 == null) {
                        synchronized (C05630Pm.class) {
                            if (C05630Pm.A01 == null) {
                                C05630Pm.A01 = new C05630Pm(JniBridge.getInstance());
                            }
                        }
                    }
                    A0G = new C2DT(c001200o, A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, C05630Pm.A01, C2DV.A00(), new Object() { // from class: X.2DW
                    });
                }
            }
        }
        return A0G;
    }

    public C47902Da A01(String str, String str2, byte[] bArr, String str3, String str4, byte[] bArr2, JSONObject jSONObject, C2DX c2dx) {
        String str5;
        A05();
        boolean A08 = this.A04.A08();
        C02E c02e = this.A02;
        TelephonyManager A0G2 = c02e.A0G();
        String valueOf = String.valueOf(A0G2 == null ? -1 : A0G2.getSimState());
        TelephonyManager A0G3 = c02e.A0G();
        String str6 = "";
        if (A0G3 != null) {
            str5 = A0G3.getNetworkOperatorName();
            str6 = A0G3.getSimOperatorName();
        } else {
            str5 = "";
        }
        Log.i("http/registration/wamsys/checkifexists");
        HashMap hashMap = new HashMap();
        hashMap.put("token", str3.getBytes());
        hashMap.put("mistyped", str4.getBytes());
        if (jSONObject != null) {
            hashMap.put("offline_ab", jSONObject.toString().getBytes());
        }
        JSONObject A00 = c2dx.A00();
        try {
            A00.put("was_activated_from_stub", this.A03.A00.getSharedPreferences("downloader_stub", 0).getBoolean("activated", false));
        } catch (JSONException unused) {
            Log.e("Failed to add stub activation metric.");
        }
        hashMap.put("client_metrics", A00.toString().getBytes());
        hashMap.put("read_phone_permission_granted", (A08 ? "1" : "0").getBytes());
        hashMap.put("sim_state", valueOf.getBytes());
        hashMap.put("network_operator_name", str5.getBytes());
        hashMap.put("sim_operator_name", str6.getBytes());
        A08(hashMap);
        A07(hashMap);
        C2DW c2dw = this.A0F;
        List A04 = A04();
        C05630Pm c05630Pm = this.A00;
        if (c2dw != null) {
            return (C47902Da) C2DZ.A00(new C2DY(c2dw, c05630Pm, str, str2, bArr, bArr2, hashMap, A04));
        }
        throw null;
    }

    public C47922Dc A02(String str, String str2, String str3, String str4, C2DX c2dx) {
        byte[] bArr;
        int i;
        A05();
        byte[] A09 = A09(str, str2);
        Log.i("http/registration/wamsys/resetsecuritycode");
        HashMap hashMap = new HashMap();
        hashMap.put("client_metrics", c2dx.A00().toString().getBytes());
        A07(hashMap);
        if (str4 != null) {
            bArr = str4.getBytes();
        } else {
            bArr = null;
        }
        if ("wipe".equals(str3)) {
            i = 2;
        } else {
            i = 0;
            if ("email".equals(str3)) {
                i = 1;
            }
        }
        C47922Dc c47922Dc = (C47922Dc) C2DZ.A00(new C47912Db(this.A0F, this.A00, null, i, bArr, str, str2, A09, hashMap, A04()));
        if (c47922Dc != null && c47922Dc.A03 == EnumC47932Dd.YES) {
            A06(c47922Dc.A04);
        }
        return c47922Dc;
    }

    public HashMap A03() {
        HashMap hashMap = new HashMap();
        C0JL c0jl = (C0JL) this.A08.A01().A02(C0FH.A0B, null, false);
        try {
            int A6H = c0jl.A6H();
            if (A6H != 200) {
                StringBuilder sb = new StringBuilder();
                sb.append("http/serverstatus/error status=");
                sb.append(A6H);
                Log.e(sb.toString());
                c0jl.A01.disconnect();
                return hashMap;
            }
            StringBuilder sb2 = new StringBuilder();
            InputStream AAe = c0jl.AAe();
            InputStreamReader inputStreamReader = new InputStreamReader(AAe, "UTF-8");
            try {
                char[] cArr = new char[4096];
                while (true) {
                    int read = inputStreamReader.read(cArr);
                    if (read < 0) {
                        break;
                    }
                    sb2.append(cArr, 0, read);
                }
                String obj = sb2.toString();
                if (AAe != null) {
                    AAe.close();
                }
                try {
                    JSONObject jSONObject = new JSONObject(obj);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string = jSONObject.getJSONObject(next).getString("available");
                        if ("false".equals(string)) {
                            hashMap.put(next, Boolean.FALSE);
                        } else if ("true".equals(string)) {
                            hashMap.put(next, Boolean.TRUE);
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("http/serverstatus/error ");
                            sb3.append(next);
                            sb3.append("=");
                            sb3.append(string);
                            Log.e(sb3.toString());
                        }
                    }
                    c0jl.A01.disconnect();
                    return hashMap;
                } catch (JSONException e) {
                    throw new IOException("error parsing json", e);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    c0jl.A01.disconnect();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public final List A04() {
        ArrayList arrayList = new ArrayList();
        C2DV c2dv = this.A07;
        if (c2dv != null) {
            try {
                c2dv.A01();
            } catch (IOException e) {
                Log.e("DomainFrontingManager/get-providers/error getting providers from the file", e);
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(c2dv.A07);
            arrayList2.addAll(c2dv.A08);
            arrayList2.addAll(c2dv.A06);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C47942De c47942De = (C47942De) it.next();
                StringBuilder sb = new StringBuilder();
                sb.append(c47942De.A02);
                sb.append(" ");
                sb.append(c47942De.A01);
                sb.append(" ");
                sb.append(c47942De.A03);
                arrayList.add(sb.toString());
            }
            return arrayList;
        }
        throw null;
    }

    public void A05() {
        this.A0E.A04(this.A03, this.A0C, this.A0D, this.A06, this.A0B, this.A05, this.A09.ACN().A01);
    }

    public final void A06(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.A0A.A01(Base64.decode(str, 3));
        } catch (IllegalArgumentException e) {
            Log.e("routing_info_helper/update_routing_info the routing info wasn't saved.", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x002f, code lost:
        if (r2 < 6) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A07(java.util.Map r7) {
        /*
            r6 = this;
            r7.size()
            X.0E7 r0 = r6.A01
            android.net.NetworkInfo r0 = r0.A04()
            java.lang.Integer r0 = X.C0HA.A01(r0)
            if (r0 != 0) goto L86
            r0 = -1
        L10:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            byte[] r1 = r0.getBytes()
            java.lang.String r0 = "network_radio_type"
            r7.put(r0, r1)
            X.00o r5 = r6.A03
            X.02E r1 = r6.A02
            X.02F r0 = r6.A04
            java.lang.String r0 = X.C28E.A0B(r5, r1, r0)
            if (r0 == 0) goto L31
            int r2 = r0.length()
            r1 = 6
            r0 = 1
            if (r2 >= r1) goto L32
        L31:
            r0 = 0
        L32:
            java.lang.String r4 = "1"
            java.lang.String r3 = "0"
            r1 = r3
            if (r0 == 0) goto L3a
            r1 = r4
        L3a:
            byte[] r1 = r1.getBytes()
            java.lang.String r0 = "simnum"
            r7.put(r0, r1)
            android.app.Application r0 = r5.A00
            java.io.File r2 = r0.getFilesDir()
            java.lang.String r1 = "rc2"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L57
            r4 = r3
        L57:
            byte[] r1 = r4.getBytes()
            java.lang.String r0 = "hasinrc"
            r7.put(r0, r1)
            int r0 = android.os.Process.myPid()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            byte[] r1 = r0.getBytes()
            java.lang.String r0 = "pid"
            r7.put(r0, r1)
            X.2Df r0 = X.EnumC47952Df.RELEASE
            int r0 = r0.value
            java.lang.String r0 = java.lang.String.valueOf(r0)
            byte[] r1 = r0.getBytes()
            java.lang.String r0 = "rc"
            r7.put(r0, r1)
            r7.size()
            return
        L86:
            int r0 = r0.intValue()
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2DT.A07(java.util.Map):void");
    }

    public final void A08(Map map) {
        boolean z = this.A05.A00.getBoolean("green_alert_dual_tos_shown", false);
        if (z) {
            map.put("tos_version", Integer.toString(z ? 1 : 0).getBytes());
        }
    }

    public byte[] A09(String str, String str2) {
        Application application = this.A03.A00;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        String A0S = C40731sm.A0S(sb.toString());
        byte[] A0E = C02A.A0E(application, A0S);
        if (A0E == null) {
            byte[] A0B = C02A.A0B();
            C02A.A09(application, A0B, A0S);
            return A0B;
        }
        return A0E;
    }
}
