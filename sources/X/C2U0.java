package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2U0 */
/* loaded from: classes2.dex */
public class C2U0 {
    public int A00 = 0;

    public C2U0() {
    }

    public C2U0(int i) {
    }

    public static C2A1 A00(C02590Ca c02590Ca) {
        if (c02590Ca != null) {
            C02590Ca A0D = c02590Ca.A0D("after");
            String A0F = A0D != null ? A0D.A0F() : null;
            return new C2A1(!TextUtils.isEmpty(A0F), A0F);
        }
        return new C2A1(false, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x01f2, code lost:
        if (java.lang.Boolean.parseBoolean(r5.A0F()) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0242, code lost:
        if (r2.isEmpty() != false) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x019b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x01a9 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C468628o A01(X.C02590Ca r33) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2U0.A01(X.0Ca):X.28o");
    }

    public C59952tg A02(C02590Ca c02590Ca) {
        C02590Ca A0D = c02590Ca.A0D(this.A00 != 1 ? "product_catalog" : "product_list");
        if (A0D != null) {
            List<C02590Ca> A0H = A0D.A0H("product");
            ArrayList arrayList = new ArrayList();
            for (C02590Ca c02590Ca2 : A0H) {
                C468628o A01 = A01(c02590Ca2);
                if (A01 != null) {
                    arrayList.add(A01);
                }
            }
            return new C59952tg(arrayList, A00(A0D.A0D("paging")));
        }
        return null;
    }

    public void A03(C02590Ca c02590Ca, final UserJid userJid, final C06K c06k) {
        C04P A0A;
        String str;
        C02590Ca A0D = c02590Ca.A0D(this.A00 != 1 ? "product_catalog" : "product_list");
        if (A0D != null && (A0A = A0D.A0A("cart_enabled")) != null && (str = A0A.A03) != null) {
            boolean parseBoolean = Boolean.parseBoolean(str);
            C06N c06n = c06k.A04;
            C05210Nt A0D2 = c06n.A0D(userJid);
            if (A0D2 != null && A0D2.A08 != parseBoolean) {
                A0D2.A08 = parseBoolean;
                if (c06n != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(userJid, A0D2);
                    c06n.A0F(hashMap);
                    c06k.A00.post(new Runnable() { // from class: X.1N5
                        @Override // java.lang.Runnable
                        public final void run() {
                            C06K c06k2 = c06k;
                            c06k2.A02.A02(userJid);
                        }
                    });
                    return;
                }
                throw null;
            }
        }
    }
}
