package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashSet;

/* renamed from: X.251  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass251 implements InterfaceC010405f {
    public final AbstractC000600i A00;
    public final C01B A01;
    public final AnonymousClass250 A02;
    public final C000500h A03;
    public final C05Y A04;

    public AnonymousClass251(AbstractC000600i abstractC000600i, C01B c01b, C05Y c05y, C000500h c000500h, AnonymousClass250 anonymousClass250) {
        this.A00 = abstractC000600i;
        this.A01 = c01b;
        this.A04 = c05y;
        this.A03 = c000500h;
        this.A02 = anonymousClass250;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        this.A02.A00.A00();
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        this.A02.A00.A01(C40731sm.A01(c02590Ca));
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        String str2;
        C02590Ca A0B = c02590Ca.A0B();
        C02590Ca.A01(A0B, "list");
        if (A0B.A0G("matched").equals("false")) {
            HashSet hashSet = new HashSet();
            C02590Ca[] c02590CaArr = A0B.A03;
            if (c02590CaArr != null) {
                for (C02590Ca c02590Ca2 : c02590CaArr) {
                    C02590Ca.A01(c02590Ca2, "item");
                    hashSet.add(c02590Ca2.A08(UserJid.class, "jid", this.A00));
                }
            }
            C04P A0A = A0B.A0A("c_dhash");
            if (A0A != null) {
                str2 = A0A.A03;
            } else {
                str2 = null;
            }
            if (TextUtils.equals(str2, this.A03.A00.getString("block_list_v2_dhash", null))) {
                Log.w("blocklistv2setprotocolhelper/onSuccess/only dhash mis-match.");
                AnonymousClass250 anonymousClass250 = this.A02;
                C04P A0A2 = A0B.A0A("dhash");
                anonymousClass250.A00(false, hashSet, A0A2 != null ? A0A2.A03 : null);
                return;
            }
            Log.w("blocklistv2setprotocolhelper/onSuccess/dhash and c_dhash mis-match.");
            this.A02.A00(true, hashSet, null);
            return;
        }
        AnonymousClass250 anonymousClass2502 = this.A02;
        C04P A0A3 = A0B.A0A("dhash");
        anonymousClass2502.A00.A02(A0A3 != null ? A0A3.A03 : null);
    }
}
