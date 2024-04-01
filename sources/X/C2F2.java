package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.2F2  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2F2 implements InterfaceC010405f {
    public final long A00;
    public final C450920j A01;
    public final C05Y A02;
    public final boolean A03;

    public C2F2(C05Y c05y, boolean z, long j, C450920j c450920j) {
        this.A02 = c05y;
        this.A03 = z;
        this.A00 = j;
        this.A01 = c450920j;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        C000200d.A0j(this.A01.A03, "adv_key_index_list_require_update", true);
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        C02590Ca A0D = c02590Ca.A0D("error");
        this.A01.A01(A0D != null ? A0D.A05("code", -1) : -1);
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        String str2;
        long j;
        C02590Ca A0D = c02590Ca.A0D("retry-ts");
        if (A0D != null) {
            C04P A0A = A0D.A0A("ts");
            if (A0A != null) {
                str2 = A0A.A03;
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                j = AnonymousClass024.A03(str2, -1L);
            } else {
                j = -1;
            }
            if (!this.A03 && j != -1) {
                C450920j c450920j = this.A01;
                if (c450920j != null) {
                    StringBuilder sb = new StringBuilder("DeviceKeyIndexListUpdateHandler/onRetry ts=");
                    sb.append(j);
                    Log.e(sb.toString());
                    c450920j.A02(true, j);
                    return;
                }
                throw null;
            }
            this.A01.A01(-1);
            return;
        }
        this.A01.A01.A07(this.A00);
    }
}
