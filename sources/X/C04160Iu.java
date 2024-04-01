package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.Date;

/* renamed from: X.0Iu */
/* loaded from: classes.dex */
public class C04160Iu extends AnonymousClass095 implements AnonymousClass098, AnonymousClass099 {
    public int A00;
    public UserJid A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public BigDecimal A08;
    public BigDecimal A09;

    public C04160Iu(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 23);
    }

    public C04160Iu(AnonymousClass094 anonymousClass094, long j, C48492Fl c48492Fl, boolean z, boolean z2) {
        super(anonymousClass094, j, (byte) 23);
        try {
            this.A01 = UserJid.get(c48492Fl.A04);
        } catch (C011305p unused) {
        }
        C40K A0k = c48492Fl.A0k();
        this.A04 = A0k.A08;
        this.A07 = A0k.A0A;
        this.A03 = A0k.A06;
        String str = A0k.A05;
        this.A02 = str;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.A08 = C06960Vv.A02(new C09R(this.A02), A0k.A02);
                this.A09 = C06960Vv.A02(new C09R(this.A02), A0k.A03);
            } catch (IllegalArgumentException unused2) {
                this.A02 = null;
            }
        }
        this.A06 = A0k.A09;
        this.A05 = A0k.A0B;
        this.A00 = A0k.A01;
        A1J(A0k.A0i(), z, z2);
    }

    public C04160Iu(C04160Iu c04160Iu, AnonymousClass094 anonymousClass094, long j, C09H c09h, boolean z) {
        super(c04160Iu, anonymousClass094, j, c09h, z);
        this.A01 = c04160Iu.A01;
        this.A04 = c04160Iu.A04;
        this.A07 = c04160Iu.A07;
        this.A03 = c04160Iu.A03;
        this.A02 = c04160Iu.A02;
        this.A08 = c04160Iu.A08;
        this.A09 = c04160Iu.A09;
        this.A06 = c04160Iu.A06;
        this.A05 = c04160Iu.A05;
        this.A00 = c04160Iu.A00;
    }

    @Override // X.AnonymousClass095, X.AnonymousClass097
    public /* bridge */ /* synthetic */ AnonymousClass097 A19(AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        if (c09h != null) {
            C04160Iu c04160Iu = new C04160Iu(this, anonymousClass094, j, c09h, false);
            ((AnonymousClass097) c04160Iu).A04 = null;
            return c04160Iu;
        }
        throw null;
    }

    @Override // X.AnonymousClass095
    public AnonymousClass095 A1K(AnonymousClass094 anonymousClass094) {
        return new C04160Iu(this, anonymousClass094, this.A0E, ((AnonymousClass097) this).A02, true);
    }

    @Override // X.AnonymousClass095
    public /* bridge */ /* synthetic */ AnonymousClass095 A1L(AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        if (c09h != null) {
            C04160Iu c04160Iu = new C04160Iu(this, anonymousClass094, j, c09h, false);
            ((AnonymousClass097) c04160Iu).A04 = null;
            return c04160Iu;
        }
        throw null;
    }

    public void A1M(C468628o c468628o) {
        this.A04 = c468628o.A09;
        this.A07 = c468628o.A0B;
        this.A03 = c468628o.A06;
        C09R c09r = c468628o.A03;
        if (c09r != null) {
            this.A02 = c09r.A00;
            BigDecimal bigDecimal = c468628o.A0C;
            this.A08 = bigDecimal;
            C40091rZ c40091rZ = c468628o.A05;
            if (c40091rZ != null) {
                this.A09 = AnonymousClass088.A12(bigDecimal, c40091rZ, new Date());
            }
        }
        this.A06 = c468628o.A0A;
        this.A05 = c468628o.A08;
        this.A00 = c468628o.A0D.size();
    }

    @Override // X.AnonymousClass095, X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        UserJid userJid;
        C40541sR c40541sR = c40551sS.A01;
        C48482Fk c48482Fk = (C48482Fk) c40541sR.A06().AVX();
        C40J c40j = (C40J) c40541sR.A06().A0k().AVX();
        boolean z = c40551sS.A04;
        boolean z2 = c40551sS.A03;
        C2G6 A1I = A1I((C2G6) ((C40K) c40j.A00).A0i().AVX(), z, z2);
        if (A1I != null && (userJid = this.A01) != null) {
            String rawString = userJid.getRawString();
            c48482Fk.A02();
            C48492Fl.A0C((C48492Fl) c48482Fk.A00, rawString);
            if (!TextUtils.isEmpty(this.A04)) {
                String str = this.A04;
                c40j.A02();
                C40K.A0A((C40K) c40j.A00, str);
            }
            if (!TextUtils.isEmpty(this.A03)) {
                String str2 = this.A03;
                c40j.A02();
                C40K.A0C((C40K) c40j.A00, str2);
            }
            if (!TextUtils.isEmpty(this.A07)) {
                String str3 = this.A07;
                c40j.A02();
                C40K.A0B((C40K) c40j.A00, str3);
            }
            if (!TextUtils.isEmpty(this.A02) && this.A08 != null) {
                String str4 = this.A02;
                c40j.A02();
                C40K.A0D((C40K) c40j.A00, str4);
                BigDecimal bigDecimal = this.A08;
                BigDecimal bigDecimal2 = C06960Vv.A0B;
                long longValue = bigDecimal.multiply(bigDecimal2).longValue();
                c40j.A02();
                C40K c40k = (C40K) c40j.A00;
                c40k.A00 |= 32;
                c40k.A02 = longValue;
                BigDecimal bigDecimal3 = this.A09;
                if (bigDecimal3 != null) {
                    long longValue2 = bigDecimal3.multiply(bigDecimal2).longValue();
                    c40j.A02();
                    C40K c40k2 = (C40K) c40j.A00;
                    c40k2.A00 |= 1024;
                    c40k2.A03 = longValue2;
                }
            }
            if (!TextUtils.isEmpty(this.A06)) {
                String str5 = this.A06;
                c40j.A02();
                C40K.A0E((C40K) c40j.A00, str5);
            }
            if (!TextUtils.isEmpty(this.A05)) {
                String str6 = this.A05;
                c40j.A02();
                C40K.A0F((C40K) c40j.A00, str6);
            }
            int i = this.A00;
            c40j.A02();
            C40K c40k3 = (C40K) c40j.A00;
            c40k3.A00 |= 256;
            c40k3.A01 = i;
            c40j.A02();
            C40K.A09((C40K) c40j.A00, A1I);
            c48482Fk.A02();
            C48492Fl.A0B((C48492Fl) c48482Fk.A00, c40j);
            C0CM c0cm = c40551sS.A02;
            byte[] bArr = c40551sS.A05;
            if (AnonymousClass029.A1U(this, c0cm, bArr)) {
                C40521sP A0G = AnonymousClass029.A0G(c40551sS.A00, this, z2, c0cm, bArr);
                c48482Fk.A02();
                C48492Fl.A09((C48492Fl) c48482Fk.A00, A0G);
            }
            c40541sR.A02();
            C40531sQ.A0W((C40531sQ) c40541sR.A00, c48482Fk);
            return;
        }
        StringBuilder A0P = C000200d.A0P("FMessageProduct/buildE2eMessage/unable to send encrypted media message due to missing mediaKey or businessOwnerJid; message.key=");
        A0P.append(this.A0n);
        A0P.append("; media_wa_type=");
        A0P.append((int) this.A0m);
        A0P.append("; business_owner_jid=");
        A0P.append(this.A01);
        Log.w(A0P.toString());
    }

    @Override // X.AnonymousClass095, X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C04160Iu(this, anonymousClass094, this.A0E, ((AnonymousClass097) this).A02, true);
    }
}
