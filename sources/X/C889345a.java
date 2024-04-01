package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.45a  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C889345a {
    public static List A02 = Arrays.asList("urn:xmpp:whatsapp:account", "w:pay");
    public static volatile C889345a A03;
    public final C018508q A00;
    public final C05Y A01;

    public C889345a(C018508q c018508q, C05Y c05y) {
        this.A00 = c018508q;
        this.A01 = c05y;
    }

    public final C02590Ca A00(String str, Map map, C90604Br c90604Br) {
        Map map2 = (Map) map.get("properties");
        Map map3 = (Map) map.get("children");
        if ("accept_pay".equals(str) && map2 != null && map2.containsKey("merchant")) {
            map2.containsKey("merchant-fees");
        }
        ArrayList arrayList = new ArrayList();
        if (map2 != null && map2.size() > 0) {
            for (Map.Entry entry : map2.entrySet()) {
                arrayList.add(new C04P((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        C04P[] c04pArr = (C04P[]) arrayList.toArray(new C04P[0]);
        ArrayList arrayList2 = new ArrayList();
        if (map3 != null && map3.size() > 0) {
            for (Map.Entry entry2 : map3.entrySet()) {
                arrayList2.add(A00((String) entry2.getKey(), (Map) entry2.getValue(), c90604Br));
            }
        }
        return new C02590Ca(str, c04pArr, (C02590Ca[]) arrayList2.toArray(new C02590Ca[0]), null);
    }

    public final Map A01(C02590Ca c02590Ca) {
        HashMap hashMap = new HashMap();
        if (c02590Ca != null) {
            HashMap hashMap2 = new HashMap();
            C04P[] A0I = c02590Ca.A0I();
            if (A0I != null) {
                for (C04P c04p : A0I) {
                    hashMap2.put(c04p.A02, c04p.A03);
                }
            }
            hashMap.put("properties", C45Q.A08(hashMap2));
            HashMap hashMap3 = new HashMap();
            C02590Ca[] c02590CaArr = c02590Ca.A03;
            if (c02590CaArr != null) {
                for (C02590Ca c02590Ca2 : c02590CaArr) {
                    hashMap3.put(c02590Ca2.A00, A01(c02590Ca2));
                }
            }
            hashMap.put("children", C45Q.A09(hashMap3));
        }
        return C45Q.A09(hashMap);
    }
}
