package X;

import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.24w  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C460824w implements InterfaceC010405f {
    public final C460624u A00;
    public final AnonymousClass012 A01;
    public final C05Y A02;

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
    }

    public C460824w(AnonymousClass012 anonymousClass012, C05Y c05y, C460624u c460624u) {
        this.A01 = anonymousClass012;
        this.A02 = c05y;
        this.A00 = c460624u;
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        if (C40731sm.A01(c02590Ca) == 404) {
            this.A00.A01(-1);
            return;
        }
        C460624u c460624u = this.A00;
        int i = c460624u.A00().getInt("biz_block_reasons_api_back_off_days", 0);
        if (i == 0) {
            c460624u.A01(1);
            c460624u.A02(TimeUnit.DAYS.toMillis(1L) + this.A01.A05());
        } else if (i <= 0 || i >= 16) {
        } else {
            c460624u.A01(i << 1);
            c460624u.A02(TimeUnit.DAYS.toMillis(i) + c460624u.A00().getLong("biz_block_reasons_api_cooling_timestamp", 0L));
        }
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        String str2;
        String str3;
        String str4;
        String str5;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C02590Ca A0D = c02590Ca.A0D("mobile_config");
        if (A0D == null) {
            return;
        }
        C02590Ca A0D2 = A0D.A0D("list");
        if (A0D2 != null && A0D2.A03 != null) {
            C04P A0A = A0D2.A0A("name");
            if (A0A != null) {
                str2 = A0A.A03;
            } else {
                str2 = null;
            }
            if ("biz_block_reasons".equals(str2)) {
                C04P A0A2 = A0D2.A0A("v");
                if (A0A2 != null) {
                    str3 = A0A2.A03;
                } else {
                    str3 = null;
                }
                int A01 = AnonymousClass024.A01(str3, 0);
                C04P A0A3 = A0D2.A0A("language");
                if (A0A3 != null) {
                    str4 = A0A3.A03;
                } else {
                    str4 = null;
                }
                if (A01 > 0 && str4 != null) {
                    for (C02590Ca c02590Ca2 : A0D2.A0H("item")) {
                        C04P A0A4 = c02590Ca2.A0A("id");
                        if (A0A4 != null) {
                            str5 = A0A4.A03;
                        } else {
                            str5 = null;
                        }
                        linkedHashMap.put(str5, c02590Ca2.A0F());
                    }
                    C04P A0A5 = A0D2.A0A("country");
                    String str6 = A0A5 != null ? A0A5.A03 : null;
                    if (!linkedHashMap.isEmpty()) {
                        C460624u c460624u = this.A00;
                        c460624u.A00().edit().putInt("biz_block_reasons_version", A01).apply();
                        c460624u.A00().edit().putString("biz_block_reasons_language", str4).apply();
                        c460624u.A00().edit().putString("biz_block_reasons_country", str6).apply();
                        c460624u.A00().edit().putString("biz_block_reasons", new JSONObject(linkedHashMap).toString()).apply();
                    }
                }
            }
        }
        C460624u c460624u2 = this.A00;
        c460624u2.A01(0);
        c460624u2.A02(0L);
    }
}
