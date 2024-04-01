package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.20j */
/* loaded from: classes2.dex */
public class C450920j {
    public static volatile C450920j A08;
    public final AbstractC000600i A00;
    public final C451020k A01;
    public final AnonymousClass012 A02;
    public final C000500h A03;
    public final C44501zB A04 = new C450820i(this);
    public final C41711uO A05;
    public final C003701t A06;
    public final C05Y A07;

    public C450920j(AnonymousClass012 anonymousClass012, C003701t c003701t, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C05Y c05y, C01R c01r, C01J c01j, C000500h c000500h, C41711uO c41711uO) {
        this.A02 = anonymousClass012;
        this.A06 = c003701t;
        this.A00 = abstractC000600i;
        this.A07 = c05y;
        this.A03 = c000500h;
        this.A05 = c41711uO;
        this.A01 = new C451020k(anonymousClass012, interfaceC002901k, c01r, c01j, c000500h, c41711uO);
    }

    public static C450920j A00() {
        if (A08 == null) {
            synchronized (C41401tr.class) {
                if (A08 == null) {
                    A08 = new C450920j(AnonymousClass012.A00(), C003701t.A00(), AbstractC000600i.A00(), C002801j.A00(), C05Y.A01(), C01R.A02, C01J.A00(), C000500h.A00(), C41711uO.A00());
                }
            }
        }
        return A08;
    }

    public void A01(int i) {
        long A05 = this.A02.A05();
        C451020k c451020k = this.A01;
        C000500h c000500h = c451020k.A01;
        C000200d.A0h(c000500h, "adv_key_index_list_last_failure_time", A05);
        C000200d.A0f(c000500h, "adv_key_index_list_require_update");
        int i2 = c000500h.A00.getInt("adv_key_index_list_update_retry_count", 0) + 1;
        c000500h.A0D().putInt("adv_key_index_list_update_retry_count", i2).apply();
        StringBuilder sb = new StringBuilder("DeviceKeyIndexListUpdateHandler/onError code=");
        sb.append(i);
        sb.append("; retryCount=");
        sb.append(i2);
        Log.e(sb.toString());
        if (i2 > 5) {
            C000500h c000500h2 = this.A03;
            if (A05 - c000500h2.A00.getLong("adv_key_index_list_last_update_time", 0L) > (this.A06.A03(477) + 4) * 86400000) {
                Log.w("DeviceKeyIndexListUpdateHandler/onError logout all devices");
                c451020k.A05();
                return;
            }
            C000200d.A0f(c000500h2, "adv_key_index_list_update_retry_count");
            this.A00.A09("adv-key-index-list-update", "key index list update fails for more than 5 times", true);
        }
    }

    public final void A02(boolean z, long j) {
        C451020k c451020k = this.A01;
        SharedPreferences sharedPreferences = c451020k.A01.A00;
        try {
            AnonymousClass297 A04 = c451020k.A04(c451020k.A03(C451020k.A00(sharedPreferences.getInt("adv_raw_id", -1), sharedPreferences.getInt("adv_current_key_index", -1), j)));
            if (A04 != null) {
                C2F2 c2f2 = new C2F2(this.A07, z, j, this);
                C05Y c05y = c2f2.A02;
                String A02 = c05y.A02();
                c05y.A06(268, A02, new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("id", A02, null, (byte) 0), new C04P("xmlns", "md", null, (byte) 0), new C04P("type", "set", null, (byte) 0)}, new C02590Ca("key-index-list", new C04P[]{new C04P("ts", c2f2.A00)}, null, A04.A0B())), c2f2, 32000L);
                return;
            }
        } catch (Exception e) {
            Log.e("CompanionDeviceAdvUtil/createADVSignedKeyIndexList ", e);
        }
        Log.e("DeviceKeyIndexListUpdateHandler/updateKeyIndexList fail to generate index list");
        A01(-1);
    }

    public final boolean A03() {
        ArrayList arrayList;
        if (this.A06.A03(477) != 0) {
            C41711uO c41711uO = this.A05;
            if (!c41711uO.A0H.A02()) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList(c41711uO.A0F.A04.A01().A03());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
