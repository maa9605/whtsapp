package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1yA */
/* loaded from: classes2.dex */
public abstract class AbstractC43891yA {
    public static final HashMap A0G = new HashMap<Integer, String>() { // from class: X.1yO
        {
            put(0, "NO_CATEGORY");
            put(1, "MANIFEST_WAITING");
            put(2, "MANIFEST_ERROR");
            put(3, "LOADING");
            put(4, "LOAD_FAILED");
            put(5, "UP_TO_DATE");
        }
    };
    public final AbstractC000600i A05;
    public final C0EL A06;
    public final C0E7 A07;
    public final AnonymousClass012 A08;
    public final C001200o A09;
    public final C000500h A0A;
    public final C43911yC A0B;
    public final C41451tw A0C;
    public final AnonymousClass035 A0D;
    public final InterfaceC002901k A0E;
    public final SparseArray A03 = new SparseArray();
    public final SparseArray A02 = new SparseArray();
    public long A00 = 0;
    public C44001yM A01 = null;
    public final List A0F = new ArrayList();
    public final SparseIntArray A04 = new SparseIntArray();

    public abstract boolean A0F(InterfaceC02170Ad interfaceC02170Ad, String str, int i);

    public AbstractC43891yA(C001200o c001200o, AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C0EL c0el, C43911yC c43911yC, AnonymousClass035 anonymousClass035, C0E7 c0e7, C41451tw c41451tw, C000500h c000500h) {
        this.A09 = c001200o;
        this.A08 = anonymousClass012;
        this.A05 = abstractC000600i;
        this.A0E = interfaceC002901k;
        this.A06 = c0el;
        this.A0B = c43911yC;
        this.A0D = anonymousClass035;
        this.A07 = c0e7;
        this.A0C = c41451tw;
        this.A0A = c000500h;
    }

    public synchronized int A00(int i) {
        return this.A04.get(i, 0);
    }

    public synchronized C44001yM A01() {
        C44001yM c44001yM = this.A01;
        if (c44001yM != null) {
            return c44001yM;
        }
        try {
            C000500h c000500h = this.A0A;
            String A03 = A03();
            SharedPreferences sharedPreferences = c000500h.A00;
            StringBuilder sb = new StringBuilder("downloadable_category_local_info_json_");
            sb.append(A03);
            String string = sharedPreferences.getString(sb.toString(), null);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            C44001yM A00 = C44001yM.A00(string);
            this.A01 = A00;
            return A00;
        } catch (JSONException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CategoryManager/getLocalIdHash/json exception while getting local category info for ");
            sb2.append(A03());
            sb2.append(e.getMessage());
            C000200d.A13("DownloadableUtils/reportCriticalEventIfBeta", sb2.toString());
            return null;
        }
    }

    public Object A02() {
        if (this instanceof C44011yN) {
            C44011yN c44011yN = (C44011yN) this;
            synchronized (this) {
                HashMap A0L = c44011yN.A0L();
                if (A0L.isEmpty()) {
                    return null;
                }
                return A0L;
            }
        } else if (!(this instanceof C43871y8)) {
            C43901yB c43901yB = (C43901yB) this;
            synchronized (this) {
                SparseArray sparseArray = c43901yB.A00;
                if (sparseArray != null) {
                    if (sparseArray.size() != 0) {
                        return sparseArray;
                    }
                }
                return null;
            }
        } else {
            throw new UnsupportedOperationException("EmojiManager/getContent/Not implemented");
        }
    }

    public String A03() {
        return !(this instanceof C44011yN) ? !(this instanceof C43871y8) ? "doodle_emoji" : "emoji" : "filter";
    }

    public Map A04(String str, int i, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("category", str);
        if (str2 != null) {
            hashMap.put("locale", str2);
        }
        if (str3 != null) {
            hashMap.put("existing_id", str3);
        }
        if (str4 != null) {
            hashMap.put("version", str4);
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x000a, code lost:
        if (r2 == 3) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A05(int r8) {
        /*
            r7 = this;
            int r2 = r7.A00(r8)
            r6 = 0
            r0 = 1
            if (r2 == r0) goto Lc
            r1 = 3
            r0 = 0
            if (r2 != r1) goto Ld
        Lc:
            r0 = 1
        Ld:
            X.C000700j.A07(r0)
            long r2 = r7.A00
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L1a
            r0 = 1
        L1a:
            X.C000700j.A07(r0)
            X.012 r0 = r7.A08
            long r2 = r0.A05()
            long r0 = r7.A00
            long r2 = r2 - r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L2b
            r6 = 1
        L2b:
            X.C000700j.A07(r6)
            r7.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC43891yA.A05(int):void");
    }

    public final synchronized void A06(int i) {
        this.A02.put(i, Long.valueOf(this.A08.A05()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x015f, code lost:
        if (r19 == 2) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0154 A[Catch: all -> 0x01dc, TryCatch #4 {, blocks: (B:151:0x0083, B:153:0x0087, B:154:0x008a, B:157:0x00a7, B:159:0x00b8, B:160:0x00c4, B:162:0x00d9, B:164:0x00e4, B:206:0x0185, B:207:0x01a9, B:209:0x01ad, B:210:0x01b9, B:211:0x01ba, B:212:0x01c3, B:213:0x01cc, B:214:0x01d5, B:166:0x00fd, B:175:0x010b, B:177:0x010f, B:179:0x011f, B:193:0x0161, B:194:0x0169, B:181:0x012a, B:185:0x0140, B:188:0x0150, B:190:0x0154, B:191:0x0159, B:187:0x014a, B:195:0x016e), top: B:230:0x0083, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0159 A[Catch: all -> 0x01dc, TryCatch #4 {, blocks: (B:151:0x0083, B:153:0x0087, B:154:0x008a, B:157:0x00a7, B:159:0x00b8, B:160:0x00c4, B:162:0x00d9, B:164:0x00e4, B:206:0x0185, B:207:0x01a9, B:209:0x01ad, B:210:0x01b9, B:211:0x01ba, B:212:0x01c3, B:213:0x01cc, B:214:0x01d5, B:166:0x00fd, B:175:0x010b, B:177:0x010f, B:179:0x011f, B:193:0x0161, B:194:0x0169, B:181:0x012a, B:185:0x0140, B:188:0x0150, B:190:0x0154, B:191:0x0159, B:187:0x014a, B:195:0x016e), top: B:230:0x0083, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A07(int r19, int r20) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC43891yA.A07(int, int):void");
    }

    public synchronized void A08(int i, int i2) {
        SparseIntArray sparseIntArray = this.A04;
        int i3 = sparseIntArray.get(i2, 0);
        if (i3 != 3 || i != 3) {
            if (i3 != 1) {
                if (i3 == 3 && i == 1) {
                }
                HashMap hashMap = A0G;
                hashMap.get(Integer.valueOf(i3));
                hashMap.get(Integer.valueOf(i));
                sparseIntArray.put(i2, i);
                return;
            } else if (i != 1) {
                HashMap hashMap2 = A0G;
                hashMap2.get(Integer.valueOf(i3));
                hashMap2.get(Integer.valueOf(i));
                sparseIntArray.put(i2, i);
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CategoryManager/setState/State change ERROR - ");
        HashMap hashMap3 = A0G;
        sb.append((String) hashMap3.get(Integer.valueOf(i3)));
        sb.append(" to ");
        sb.append((String) hashMap3.get(Integer.valueOf(i)));
        sb.append("!");
        Log.e(sb.toString());
    }

    public synchronized void A09(InterfaceC44051yR interfaceC44051yR, int i) {
        int A00 = A00(i);
        if (A00 == 3 || A00 == 1) {
            this.A0F.add(interfaceC44051yR);
        } else if (A00 != 4 && A00 != 2) {
            if (A00 == 5 && A02() != null) {
                Object A02 = A02();
                if (A02 == null) {
                    throw null;
                }
                interfaceC44051yR.ANc(A02);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("CategoryManager/registerCallback/Unexpected state encountered - ");
                sb.append((String) A0G.get(Integer.valueOf(A00)));
                Log.e(sb.toString());
                interfaceC44051yR.AJo();
            }
        } else {
            interfaceC44051yR.AJo();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0A(X.C44001yM r21, int r22, java.lang.String r23, long r24, X.C0J5 r26) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC43891yA.A0A(X.1yM, int, java.lang.String, long, X.0J5):void");
    }

    public void A0B(String str) {
        if (!(this instanceof C44011yN)) {
            if (this instanceof C43871y8) {
                return;
            }
            return;
        }
        C44011yN c44011yN = (C44011yN) this;
        synchronized (c44011yN) {
            c44011yN.A00.clear();
        }
    }

    public final void A0C(String str) {
        synchronized (this) {
            List list = this.A0F;
            if (list.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList(list);
            list.clear();
            if (str != null && A02() != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC44051yR) it.next()).ANc(A02());
                }
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC44051yR) it2.next()).AJo();
            }
        }
    }

    public synchronized void A0D(String str, String str2, int i) {
        if (TextUtils.isEmpty(str)) {
            this.A0A.A0a(A03(), null);
            this.A01 = null;
        } else {
            C44001yM c44001yM = this.A01;
            if (c44001yM == null) {
                this.A01 = new C44001yM(A03(), str, str2, null, null);
            } else {
                c44001yM.A03.put(Integer.toString(i), str);
            }
            try {
                C000500h c000500h = this.A0A;
                String A03 = A03();
                C44001yM c44001yM2 = this.A01;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", c44001yM2.A01);
                jSONObject.put("locale_lang", c44001yM2.A00);
                jSONObject.put("url", c44001yM2.A02);
                jSONObject.put("bundles", new JSONObject(c44001yM2.A03));
                c000500h.A0a(A03, jSONObject.toString());
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("CategoryManager/setLocalIdHash/json exception while setting local category info for ");
                sb.append(A03());
                sb.append(e.getMessage());
                C000200d.A13("DownloadableUtils/reportCriticalEventIfBeta", sb.toString());
            }
        }
    }

    public boolean A0E(int i) {
        if (!(this instanceof AbstractC43881y9)) {
            return ((C43901yB) this).A0G(i).get((i * 100) + 1) != null;
        }
        AbstractC43881y9 abstractC43881y9 = (AbstractC43881y9) this;
        C000700j.A06(i == 0);
        return abstractC43881y9.A0I();
    }
}
