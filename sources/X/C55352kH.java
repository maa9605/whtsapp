package X;

import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.2kH  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55352kH implements InterfaceC010405f {
    public final AbstractC000600i A00;
    public final C0ES A01;
    public final C0T9 A02;
    public final C05Y A03;
    public final C0I3 A04;
    public final C04500Kk A05;
    public final C0TA A06;
    public final String A07;
    public final String A08;
    public final List A09;

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
    }

    public C55352kH(AbstractC000600i abstractC000600i, C05Y c05y, C0ES c0es, C2K9 c2k9) {
        String rawString = c2k9.A00.getRawString();
        String str = c2k9.A01;
        C04500Kk c04500Kk = c2k9.A07;
        List list = c2k9.A02;
        this.A00 = abstractC000600i;
        this.A03 = c05y;
        this.A01 = c0es;
        this.A04 = c2k9;
        this.A02 = c2k9;
        this.A06 = c2k9;
        this.A07 = rawString;
        this.A08 = str;
        this.A05 = c04500Kk;
        this.A09 = list;
    }

    public void A00(boolean z) {
        C02590Ca[] c02590CaArr;
        C02590Ca c02590Ca;
        C04500Kk c04500Kk = this.A05;
        String A02 = c04500Kk != null ? c04500Kk.A01 : this.A03.A02();
        String str = this.A08;
        String str2 = this.A07;
        List list = this.A09;
        int i = 1;
        if (list.size() > 0) {
            int size = list.size();
            if (z) {
                size++;
            }
            c02590CaArr = new C02590Ca[size];
            int i2 = 0;
            while (i2 < list.size()) {
                C04P[] c04pArr = new C04P[i];
                c04pArr[0] = new C04P("jid", (Jid) list.get(i2));
                c02590CaArr[i2] = new C02590Ca("participant", c04pArr, null, null);
                i2++;
                i = 1;
            }
            if (z) {
                c02590CaArr[list.size()] = new C02590Ca("dogfooding", null, null, null);
            }
        } else {
            c02590CaArr = null;
        }
        boolean isEmpty = TextUtils.isEmpty(null);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        C04P[] c04pArr2 = new C04P[(!isEmpty ? 1 : 0) + 1 + (!isEmpty2 ? 1 : 0)];
        c04pArr2[0] = new C04P("subject", str, null, (byte) 0);
        if (!isEmpty) {
            c04pArr2[1] = new C04P("type", null, null, (byte) 0);
        }
        if (!isEmpty2) {
            c04pArr2[isEmpty ? (char) 1 : (char) 2] = new C04P("key", str2, null, (byte) 0);
        }
        if (c02590CaArr == null) {
            c02590Ca = new C02590Ca("create", c04pArr2, null, null);
        } else {
            c02590Ca = new C02590Ca("create", c04pArr2, c02590CaArr, null);
        }
        C04P[] c04pArr3 = new C04P[c04500Kk == null ? 4 : 5];
        c04pArr3[0] = new C04P("xmlns", "w:g2", null, (byte) 0);
        c04pArr3[1] = new C04P("id", A02, null, (byte) 0);
        c04pArr3[2] = new C04P("type", "set", null, (byte) 0);
        c04pArr3[3] = new C04P("to", C0N9.A00);
        if (c04500Kk != null) {
            c04pArr3[4] = new C04P("web", c04500Kk.A00, null, (byte) 0);
        }
        this.A03.A0B(14, A02, new C02590Ca("iq", c04pArr3, c02590Ca), this, 0L);
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        Pair A09 = C40731sm.A09(c02590Ca);
        if (A09 != null) {
            int intValue = ((Number) A09.first).intValue();
            String str2 = (String) A09.second;
            if (intValue == 500 && str2 != null && str2.equals("internal-server-error")) {
                intValue = -500;
            }
            this.A04.ARv(intValue);
        }
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00d5: IGET  (r0 I:X.0I3) = (r6 I:X.2kH) X.2kH.A04 X.0I3, block:B:28:0x00d3 */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.2kH] */
    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        ?? r6;
        String str2;
        String str3;
        String str4;
        String str5;
        C02590Ca A0B = c02590Ca.A0B();
        C02590Ca.A01(A0B, "group");
        try {
            C04P A0A = A0B.A0A("id");
            if (A0A != null && (str2 = A0A.A03) != null) {
                C011005l A05 = C003101m.A05(str2);
                AbstractC000600i abstractC000600i = this.A00;
                Jid A08 = A0B.A08(UserJid.class, "creator", abstractC000600i);
                C04P A0A2 = A0B.A0A("creation");
                if (A0A2 != null) {
                    str3 = A0A2.A03;
                } else {
                    str3 = null;
                }
                long A03 = AnonymousClass024.A03(str3, 0L) * 1000;
                C04P A0A3 = A0B.A0A("subject");
                if (A0A3 != null) {
                    str4 = A0A3.A03;
                } else {
                    str4 = null;
                }
                C04P A0A4 = A0B.A0A("s_t");
                if (A0A4 != null) {
                    str5 = A0A4.A03;
                } else {
                    str5 = null;
                }
                long A032 = AnonymousClass024.A03(str5, 0L) * 1000;
                Jid A082 = A0B.A08(UserJid.class, "s_o", abstractC000600i);
                C04P A0A5 = A0B.A0A("type");
                String str6 = A0A5 != null ? A0A5.A03 : null;
                C2KE c2ke = new C2KE(A05);
                C43981yK.A09(abstractC000600i, c02590Ca, c2ke, "group");
                StringBuilder sb = new StringBuilder("groupmgr/onGroupCreated/");
                sb.append(A05);
                sb.append("/");
                sb.append(A08);
                sb.append("/");
                sb.append(A03);
                sb.append("/");
                sb.append(str4);
                sb.append("/");
                sb.append(A082);
                sb.append("/");
                sb.append(A032);
                sb.append("/");
                sb.append(str6);
                sb.append("/");
                sb.append(c2ke.A03.keySet());
                Log.i(sb.toString());
                Map map = c2ke.A01;
                if (!map.isEmpty()) {
                    C0ES.A02(3001, map);
                }
                this.A02.ARw(A05);
                this.A06.ARx(c2ke);
                return;
            }
            throw null;
        } catch (C011305p unused) {
            r6.A04.ARv(800);
        }
    }
}
