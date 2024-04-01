package X;

import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.0OV  reason: invalid class name */
/* loaded from: classes.dex */
public class C0OV implements InterfaceC010405f {
    public final AbstractC000600i A00;
    public final C001200o A01;
    public final C05Y A02;
    public final C0NA A03;
    public volatile UserJid A04;

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
    }

    public C0OV(C001200o c001200o, AbstractC000600i abstractC000600i, C05Y c05y, C0NA c0na) {
        this.A01 = c001200o;
        this.A00 = abstractC000600i;
        this.A02 = c05y;
        this.A03 = c0na;
    }

    public void A00(UserJid userJid, long j) {
        this.A04 = userJid;
        C05Y c05y = this.A02;
        String A02 = c05y.A02();
        ArrayList arrayList = new ArrayList();
        long j2 = j / 1000;
        if (j2 == 0) {
            arrayList.add(new C02590Ca("user", new C04P[]{new C04P("jid", userJid)}, null, null));
        } else {
            arrayList.add(new C02590Ca("user", new C04P[]{new C04P("jid", userJid), new C04P("t", Long.toString(j2), null, (byte) 0)}, null, null));
        }
        c05y.A0B(41, A02, new C02590Ca("iq", new C04P[]{new C04P("id", A02, null, (byte) 0), new C04P("xmlns", "status", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("to", C04260Jm.A00)}, new C02590Ca("status", null, (C02590Ca[]) arrayList.toArray(new C02590Ca[0]), null)), this, 0L);
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        this.A03.AJr(this.A04, C40731sm.A01(c02590Ca));
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        C02590Ca[] c02590CaArr;
        String str2;
        String str3;
        C02590Ca A0D = c02590Ca.A0D("status");
        if (A0D != null && (c02590CaArr = A0D.A03) != null && c02590CaArr.length == 1) {
            C02590Ca c02590Ca2 = c02590CaArr[0];
            C02590Ca.A01(c02590Ca2, "user");
            C04P A0A = c02590Ca2.A0A("t");
            if (A0A != null) {
                str2 = A0A.A03;
            } else {
                str2 = null;
            }
            long A03 = AnonymousClass024.A03(str2, 0L) * 1000;
            C04P A0A2 = c02590Ca2.A0A("code");
            if (A0A2 != null) {
                str3 = A0A2.A03;
            } else {
                str3 = null;
            }
            C04P A0A3 = c02590Ca2.A0A("type");
            String str4 = A0A3 != null ? A0A3.A03 : null;
            UserJid userJid = (UserJid) c02590Ca2.A09(UserJid.class, "jid", this.A00);
            String A0F = c02590Ca2.A0F();
            if (str4 != null && str4.equals("fail")) {
                if (!"401".equals(str3) && !"403".equals(str3) && !"404".equals(str3)) {
                    this.A03.AMS(userJid);
                    return;
                } else {
                    this.A03.AJF(userJid);
                    return;
                }
            }
            if (TextUtils.isEmpty(A0F)) {
                A0F = this.A01.A00.getResources().getString(R.string.default_about_text);
            }
            this.A03.AP0(userJid, A0F, A03);
            return;
        }
        this.A03.AMS(this.A04);
    }
}
