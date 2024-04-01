package X;

import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Ga */
/* loaded from: classes.dex */
public abstract class AbstractC03520Ga {
    public static final C03680Gq A04 = new C03680Gq("unset", null, false);
    public C0EU A00;
    public C0GR A01;
    public boolean A02;
    public final C014406v A03 = C014406v.A00("BasePaymentAccountSetup", "onboarding", "COMMON");

    public synchronized C03680Gq A00() {
        ArrayList arrayList;
        arrayList = (ArrayList) A03(A02());
        return arrayList.isEmpty() ? null : (C03680Gq) arrayList.get(0);
    }

    public C03680Gq A01(String str) {
        C03680Gq[] c03680GqArr;
        C03650Gn A02 = this.A01.A02();
        if (A02 != null) {
            if (this.A02) {
                c03680GqArr = A02.A08;
            } else {
                c03680GqArr = A02.A07;
            }
            for (C03680Gq c03680Gq : c03680GqArr) {
                if (c03680Gq.A03.equals(str)) {
                    return c03680Gq;
                }
            }
            return null;
        }
        return null;
    }

    public synchronized List A02() {
        ArrayList arrayList;
        String A07 = this.A00.A07(this.A02);
        arrayList = new ArrayList();
        if (!TextUtils.isEmpty(A07)) {
            try {
                JSONObject jSONObject = new JSONObject(A07);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = jSONObject.getString(next);
                    boolean equals = string.equals("skipped");
                    if (equals) {
                        string = "-1";
                    }
                    C03680Gq c03680Gq = new C03680Gq(next, string, false);
                    c03680Gq.A02 = equals;
                    arrayList.add(c03680Gq);
                }
            } catch (JSONException e) {
                this.A03.A08("getCompletedStep threw: ", e);
            }
        }
        return arrayList;
    }

    public synchronized List A03(List list) {
        ArrayList arrayList;
        C03680Gq[] c03680GqArr;
        arrayList = new ArrayList();
        C03650Gn A02 = this.A01.A02();
        if (A02 != null) {
            if (this.A02) {
                c03680GqArr = A02.A08;
            } else {
                c03680GqArr = A02.A07;
            }
            for (C03680Gq c03680Gq : c03680GqArr) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        i = -1;
                        break;
                    } else if (((C03680Gq) list.get(i)).A03.equals(c03680Gq.A03)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0 || !((C03680Gq) list.get(i)).A00.equals(c03680Gq.A00) || (((C03680Gq) list.get(i)).A02 && !c03680Gq.A01)) {
                    arrayList.add(new C03680Gq(c03680Gq.A03, c03680Gq.A00, c03680Gq.A01));
                }
            }
        }
        return arrayList;
    }

    public synchronized void A04(C03680Gq c03680Gq) {
        if (c03680Gq != null) {
            List A02 = A02();
            ArrayList arrayList = (ArrayList) A02;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C03680Gq c03680Gq2 = (C03680Gq) it.next();
                if (c03680Gq2.A03.equals(c03680Gq.A03)) {
                    arrayList.remove(c03680Gq2);
                    A06(A02);
                    return;
                }
            }
        } else {
            C014406v c014406v = this.A03;
            StringBuilder sb = new StringBuilder();
            sb.append("/removeCompletedStep step to remove cannot be null: ");
            sb.append(c03680Gq);
            c014406v.A07(null, sb.toString(), null);
        }
    }

    public synchronized void A05(C03680Gq c03680Gq) {
        if (c03680Gq != null) {
            if (!c03680Gq.A03.equals("unset")) {
                List A02 = A02();
                List A03 = A03(A02);
                ArrayList arrayList = (ArrayList) A02;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((C03680Gq) it.next()).A03.equals(c03680Gq.A03)) {
                        return;
                    }
                }
                arrayList.add(c03680Gq);
                ArrayList arrayList2 = (ArrayList) A03;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C03680Gq c03680Gq2 = (C03680Gq) it2.next();
                    if (c03680Gq2.A03.equals(c03680Gq.A03)) {
                        arrayList2.remove(c03680Gq2);
                        break;
                    }
                }
                C014406v c014406v = this.A03;
                StringBuilder sb = new StringBuilder();
                sb.append("setCompletedStep setting step: ");
                sb.append(c03680Gq);
                sb.append(" as complete making completed steps: ");
                sb.append(A02);
                sb.append(" incomplete steps: ");
                sb.append(A03);
                c014406v.A07(null, sb.toString(), null);
                A06(A02);
            }
        }
    }

    public final synchronized void A06(List list) {
        JSONObject jSONObject = new JSONObject();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C03680Gq c03680Gq = (C03680Gq) it.next();
            if (!TextUtils.isEmpty(c03680Gq.A00)) {
                try {
                    jSONObject.put(c03680Gq.A03, c03680Gq.A02 ? "skipped" : c03680Gq.A00);
                } catch (JSONException e) {
                    this.A03.A08("setCompletedStep threw: ", e);
                }
            }
        }
        C014406v c014406v = this.A03;
        StringBuilder sb = new StringBuilder();
        sb.append("storing steps: ");
        sb.append(jSONObject);
        c014406v.A07(null, sb.toString(), null);
        C0EU c0eu = this.A00;
        boolean z = this.A02;
        String obj = jSONObject.toString();
        if (z) {
            C000200d.A0k(c0eu, "payments_setup_completed_steps", obj);
        } else {
            C000200d.A0k(c0eu, "payments_merchant_setup_completed_steps", obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x001c, code lost:
        if (A0B("tos_with_wallet") != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean A07() {
        /*
            r2 = this;
            monitor-enter(r2)
            X.0GR r0 = r2.A01     // Catch: java.lang.Throwable -> L23
            X.0Gn r0 = r0.A02()     // Catch: java.lang.Throwable -> L23
            r1 = 0
            if (r0 == 0) goto L21
            boolean r0 = r0.A04     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L21
            java.lang.String r0 = "tos_no_wallet"
            boolean r0 = r2.A0B(r0)     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L1e
            java.lang.String r0 = "tos_with_wallet"
            boolean r0 = r2.A0B(r0)     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L1f
        L1e:
            r1 = 1
        L1f:
            monitor-exit(r2)
            return r1
        L21:
            monitor-exit(r2)
            return r1
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC03520Ga.A07():boolean");
    }

    public synchronized boolean A08() {
        return A0A(1);
    }

    public synchronized boolean A09() {
        return A0A(2);
    }

    public final synchronized boolean A0A(int i) {
        C03680Gq[] c03680GqArr;
        int i2;
        C03650Gn A02 = this.A01.A02();
        if (A02 != null) {
            if ((this.A02 ? A02.A08 : A02.A07) != null) {
                List A022 = A02();
                if (this.A02) {
                    c03680GqArr = A02.A08;
                } else {
                    c03680GqArr = A02.A07;
                }
                int length = c03680GqArr.length;
                while (i2 < length) {
                    C03680Gq c03680Gq = c03680GqArr[i2];
                    int i3 = 0;
                    while (true) {
                        if (i3 >= A022.size()) {
                            i3 = -1;
                            break;
                        } else if (((C03680Gq) A022.get(i3)).A03.equals(c03680Gq.A03)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    i2 = ((i != 1 && (i != 2 || c03680Gq.A03.equals("2fa"))) || (i3 >= 0 && ((C03680Gq) ((ArrayList) A022).get(i3)).A00.equals(c03680Gq.A00))) ? i2 + 1 : 0;
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public boolean A0B(String str) {
        Iterator it = ((AbstractCollection) A02()).iterator();
        while (it.hasNext()) {
            if (((C03680Gq) it.next()).A03.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
