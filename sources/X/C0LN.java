package X;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;

/* renamed from: X.0LN */
/* loaded from: classes.dex */
public class C0LN extends AnonymousClass097 implements AnonymousClass098, AnonymousClass099 {
    public int A00;
    public int A01;
    public int A02;
    public UserJid A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public BigDecimal A09;
    public final transient AbstractC000600i A0A;

    public C0LN(AbstractC000600i abstractC000600i, AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 44);
        this.A0A = abstractC000600i;
    }

    public C0LN(AbstractC000600i abstractC000600i, AnonymousClass094 anonymousClass094, long j, C48452Fh c48452Fh, boolean z) {
        super(anonymousClass094, j, (byte) 44);
        this.A0A = abstractC000600i;
        ((AnonymousClass097) this).A02 = new C09H();
        this.A06 = c48452Fh.A08;
        this.A07 = c48452Fh.A09;
        this.A00 = c48452Fh.A01;
        this.A05 = c48452Fh.A07;
        this.A01 = EnumC79273lO.A01.value;
        this.A02 = EnumC79283lP.A01.value;
        try {
            this.A03 = UserJid.get(c48452Fh.A0A);
        } catch (C011305p unused) {
            StringBuilder A0P = C000200d.A0P("FMessageOrder/FMessageOrder invalid seller jid <");
            A0P.append(c48452Fh.A0A);
            A0P.append(">");
            Log.w(A0P.toString());
        }
        this.A08 = c48452Fh.A0B;
        C0AN c0an = c48452Fh.A05;
        if (c0an != null) {
            byte[] A06 = c0an.A06();
            if (A06.length > 0) {
                ((AnonymousClass092) this).A01 = 1;
                C03900Hp A0E = A0E();
                if (A0E != null) {
                    A0E.A04(A06, z);
                }
            }
        }
        String str = c48452Fh.A0C;
        this.A04 = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.A09 = C06960Vv.A02(new C09R(this.A04), c48452Fh.A04);
        } catch (IllegalArgumentException unused2) {
            this.A04 = null;
        }
    }

    public C0LN(AbstractC000600i abstractC000600i, C0LN c0ln, AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        super(c0ln, anonymousClass094, j, c09h, true, c0ln.A0m);
        this.A0A = abstractC000600i;
        this.A06 = c0ln.A06;
        this.A07 = c0ln.A07;
        this.A00 = c0ln.A00;
        this.A01 = c0ln.A01;
        this.A02 = c0ln.A02;
        this.A05 = c0ln.A05;
        this.A03 = c0ln.A03;
        this.A08 = c0ln.A08;
        this.A04 = c0ln.A04;
        this.A09 = c0ln.A09;
    }

    @Override // X.AnonymousClass097
    public AnonymousClass097 A19(AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        throw new C2EY("Order messages can not be forwarded");
    }

    public String A1H(Context context, C002301c c002301c) {
        int i = this.A00;
        String A0A = c002301c.A0A(R.plurals.total_items, i, Integer.valueOf(i));
        return TextUtils.isEmpty(this.A05) ? A0A : context.getString(R.string.message_preview_order, A0A, this.A05);
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C40541sR c40541sR = c40551sS.A01;
        C48442Fg c48442Fg = (C48442Fg) ((C40531sQ) c40541sR.A00).A12().AVX();
        String str = this.A06;
        if (str != null) {
            c48442Fg.A02();
            C48452Fh.A0D((C48452Fh) c48442Fg.A00, str);
        }
        String str2 = this.A07;
        if (str2 != null) {
            c48442Fg.A02();
            C48452Fh.A0F((C48452Fh) c48442Fg.A00, str2);
        }
        int i = this.A00;
        c48442Fg.A02();
        C48452Fh c48452Fh = (C48452Fh) c48442Fg.A00;
        c48452Fh.A00 |= 4;
        c48452Fh.A01 = i;
        String str3 = this.A05;
        if (str3 != null) {
            c48442Fg.A02();
            C48452Fh.A0E((C48452Fh) c48442Fg.A00, str3);
        }
        if (this.A01 != 1 || this.A02 != 1) {
            C06Y A00 = C06Y.A00();
            C05E A002 = C05E.A00();
            AbstractC000600i abstractC000600i = this.A0A;
            StringBuilder A0P = C000200d.A0P("row_id=");
            A0P.append(this.A0p);
            A0P.append("; is_migrated=");
            A0P.append(A00.A07());
            A0P.append("; is_write_to_old_schema_enabled=");
            A002.A05();
            A0P.append(A002.A06.A0N());
            abstractC000600i.A09("FMessageOrder/buildE2EMessage: Corrupted message", A0P.toString(), true);
        }
        int i2 = this.A01;
        if (i2 != 1) {
            AbstractC000600i abstractC000600i2 = this.A0A;
            StringBuilder A0P2 = C000200d.A0P("status=");
            A0P2.append(i2);
            abstractC000600i2.A09("FMessageOrder/setOrderStatus: Unexpected status", A0P2.toString(), true);
        } else {
            EnumC79273lO enumC79273lO = EnumC79273lO.A01;
            c48442Fg.A02();
            C48452Fh.A0B((C48452Fh) c48442Fg.A00, enumC79273lO);
        }
        int i3 = this.A02;
        if (i3 != 1) {
            AbstractC000600i abstractC000600i3 = this.A0A;
            StringBuilder A0P3 = C000200d.A0P("surface=");
            A0P3.append(i3);
            abstractC000600i3.A09("FMessageOrder/setOrderSurface: Unexpected surface", A0P3.toString(), true);
        } else {
            EnumC79283lP enumC79283lP = EnumC79283lP.A01;
            c48442Fg.A02();
            C48452Fh.A0C((C48452Fh) c48442Fg.A00, enumC79283lP);
        }
        UserJid userJid = this.A03;
        if (userJid != null) {
            String rawString = userJid.getRawString();
            c48442Fg.A02();
            C48452Fh.A0G((C48452Fh) c48442Fg.A00, rawString);
        }
        String str4 = this.A08;
        if (str4 != null) {
            c48442Fg.A02();
            C48452Fh.A0H((C48452Fh) c48442Fg.A00, str4);
        }
        if (!TextUtils.isEmpty(this.A04) && this.A09 != null) {
            String str5 = this.A04;
            c48442Fg.A02();
            C48452Fh.A0I((C48452Fh) c48442Fg.A00, str5);
            long longValue = this.A09.multiply(C06960Vv.A0B).longValue();
            c48442Fg.A02();
            C48452Fh c48452Fh2 = (C48452Fh) c48442Fg.A00;
            c48452Fh2.A00 |= 512;
            c48452Fh2.A04 = longValue;
        }
        C03900Hp A0E = A0E();
        if (A0E != null && A0E.A08() != null) {
            C0AN A003 = C0AN.A00(A0E.A08());
            c48442Fg.A02();
            C48452Fh.A09((C48452Fh) c48442Fg.A00, A003);
        }
        C0CM c0cm = c40551sS.A02;
        byte[] bArr = c40551sS.A05;
        if (AnonymousClass029.A1U(this, c0cm, bArr)) {
            C40521sP A0G = AnonymousClass029.A0G(c40551sS.A00, this, c40551sS.A03, c0cm, bArr);
            c48442Fg.A02();
            C48452Fh.A0A((C48452Fh) c48442Fg.A00, A0G);
        }
        c40541sR.A02();
        C40531sQ.A0U((C40531sQ) c40541sR.A00, c48442Fg);
    }

    @Override // X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C0LN(this.A0A, this, anonymousClass094, this.A0E, ((AnonymousClass097) this).A02);
    }
}
