package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2n4  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C56312n4 {
    public final C2U0 A00;

    public C56312n4(C2U0 c2u0) {
        this.A00 = c2u0;
    }

    public C29z A00(C02590Ca c02590Ca) {
        int i;
        int i2;
        C02590Ca A0D;
        List<C02590Ca> A0H = c02590Ca.A0H("product");
        ArrayList arrayList = new ArrayList();
        for (C02590Ca c02590Ca2 : A0H) {
            C468628o A01 = C2U0.A01(c02590Ca2);
            if (A01 != null) {
                arrayList.add(A01);
            }
        }
        C02590Ca A0D2 = c02590Ca.A0D("id");
        C02590Ca A0D3 = c02590Ca.A0D("name");
        C02590Ca A0D4 = c02590Ca.A0D("status_info");
        C02590Ca A0D5 = c02590Ca.A0D("item_count");
        String str = null;
        String A0F = A0D2 == null ? null : A0D2.A0F();
        String A0F2 = A0D3 == null ? null : A0D3.A0F();
        if (A0F != null && A0F2 != null) {
            try {
                i = Integer.parseInt(A0D5 == null ? null : A0D5.A0F());
            } catch (NumberFormatException unused) {
                i = 0;
            }
            if (A0D4 != null && (A0D = A0D4.A0D("status")) != null) {
                str = A0D.A0F();
            }
            if (!AnonymousClass024.A0j(str) && !"approved".equalsIgnoreCase(str)) {
                i2 = 1;
                if ("rejected".equalsIgnoreCase(str)) {
                    i2 = 2;
                }
            } else {
                i2 = 0;
            }
            return new C29z(A0F, A0F2, i2, i, arrayList);
        }
        Log.e("CollectionParser/parseCollectionNode/required fields missing");
        return null;
    }
}
