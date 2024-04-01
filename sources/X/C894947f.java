package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.47f */
/* loaded from: classes3.dex */
public class C894947f {
    public static final ArrayList A0C = new ArrayList(Arrays.asList("+919223274424", "+919870804455", "+919818277355"));
    public static final ArrayList A0D = new ArrayList(Arrays.asList("+919870804455", "+919223274424", "+919818277355"));
    public static volatile C894947f A0E;
    public int A00;
    public int A01;
    public int A02;
    public C90544Bk A03;
    public C3NV A04;
    public Boolean A05;
    public ArrayList A06;
    public ArrayList A07;
    public HashMap A08;
    public final C02L A09;
    public final C90564Bm A0A;
    public final C4CV A0B;

    public C894947f(C02L c02l, C4CV c4cv, C90564Bm c90564Bm) {
        this.A09 = c02l;
        this.A0B = c4cv;
        this.A0A = c90564Bm;
        A08();
    }

    public static C894947f A00() {
        if (A0E == null) {
            synchronized (C894947f.class) {
                if (A0E == null) {
                    A0E = new C894947f(C02L.A00(), C4CV.A00(), C90564Bm.A00());
                }
            }
        }
        return A0E;
    }

    public static String A01(HashMap hashMap, String str) {
        if (hashMap.get(str) != null) {
            try {
                JSONObject jSONObject = new JSONObject((String) hashMap.get(str)).getJSONObject("data");
                StringBuilder sb = new StringBuilder();
                sb.append(jSONObject.getString("code"));
                sb.append(",");
                sb.append(jSONObject.getString("ki"));
                sb.append(",");
                sb.append(jSONObject.getString("encryptedBase64String"));
                return sb.toString();
            } catch (JSONException e) {
                StringBuilder sb2 = new StringBuilder("PAY: IndiaUPIPaymentBankSetup getEncryptedBlob read: ");
                sb2.append(str);
                sb2.append("  blob threw: ");
                Log.i(sb2.toString(), e);
                return null;
            }
        }
        return null;
    }

    public final C90544Bk A02(C4IA c4ia) {
        ArrayList A06 = A06(c4ia);
        if (A06 != null && !A06.isEmpty()) {
            String str = (String) A06.get(this.A01 % A06.size());
            ArrayList arrayList = this.A07;
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C90544Bk c90544Bk = (C90544Bk) it.next();
                    if (str.equals(c90544Bk.A05())) {
                        return c90544Bk;
                    }
                }
            }
        }
        return null;
    }

    public String A03(C4IA c4ia) {
        ArrayList<String> arrayList;
        Bundle bundle;
        C02L c02l = this.A09;
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid != null) {
            String str = userJid.user;
            C90544Bk A02 = A02(c4ia);
            if (A02 == null || (bundle = A02.A00) == null || (arrayList = bundle.getStringArrayList("smsGateways")) == null || arrayList.size() <= 0) {
                arrayList = (str.endsWith("0") || str.endsWith("2") || str.endsWith("4") || str.endsWith("6") || str.endsWith("8")) ? A0C : A0D;
            }
            C000700j.A05(arrayList);
            int size = arrayList.size();
            this.A00 = size;
            return arrayList.get(this.A02 % size);
        }
        throw null;
    }

    public String A04(C4IA c4ia) {
        String A03 = this.A0A.A03();
        if (TextUtils.isEmpty(A03)) {
            C90544Bk A02 = A02(c4ia);
            return (A02 == null || TextUtils.isEmpty(A02.A05())) ? "ICICI" : A02.A05();
        }
        return A03;
    }

    public String A05(C4IA c4ia) {
        C90544Bk A02 = A02(c4ia);
        if (A02 != null) {
            Bundle bundle = A02.A00;
            if (!TextUtils.isEmpty(bundle != null ? bundle.getString("transactionPrefix") : null)) {
                Bundle bundle2 = A02.A00;
                if (bundle2 != null) {
                    return bundle2.getString("transactionPrefix");
                }
                return null;
            }
        }
        return this.A0A.A02();
    }

    public ArrayList A06(C4IA c4ia) {
        Bundle bundle;
        ArrayList arrayList;
        if (c4ia == null || (arrayList = c4ia.A0F) == null || arrayList.isEmpty()) {
            C90544Bk c90544Bk = this.A03;
            if (c90544Bk == null || (bundle = c90544Bk.A00) == null) {
                return null;
            }
            return bundle.getStringArrayList("pspRouting");
        }
        return arrayList;
    }

    public void A07() {
        int i = this.A02 + 1;
        if (i != this.A00 || this.A07.size() <= 1) {
            this.A02 = i;
            return;
        }
        this.A02 = 0;
        this.A01++;
    }

    public void A08() {
        this.A04 = new C3NV();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A06 = null;
        this.A07 = null;
        this.A03 = null;
        this.A08 = null;
        this.A0B.A03.A03();
    }

    public void A09(ArrayList arrayList, ArrayList arrayList2, C90544Bk c90544Bk) {
        this.A06 = arrayList;
        this.A07 = arrayList2;
        this.A03 = c90544Bk;
        StringBuilder A0P = C000200d.A0P("PAY: IndiaUpiPaymentSetup setPspAndBanksList got banks: ");
        A0P.append(arrayList);
        Log.i(A0P.toString());
        StringBuilder sb = new StringBuilder("PAY: IndiaUpiPaymentSetup setPspAndBanksList pspConfig: ");
        sb.append(this.A07);
        Log.i(sb.toString());
        StringBuilder sb2 = new StringBuilder("PAY: IndiaUpiPaymentSetup setPspAndBanksList pspRouting: ");
        sb2.append(c90544Bk);
        Log.i(sb2.toString());
    }
}
