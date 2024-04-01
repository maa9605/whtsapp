package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.0fC */
/* loaded from: classes.dex */
public class C10040fC extends AnonymousClass095 implements AnonymousClass098, AnonymousClass099 {
    public UserJid A00;
    public String A01;
    public String A02;

    public C10040fC(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 37);
    }

    public C10040fC(AnonymousClass094 anonymousClass094, long j, C48492Fl c48492Fl, boolean z, boolean z2) {
        super(anonymousClass094, j, (byte) 37);
        try {
            this.A00 = UserJid.get(c48492Fl.A04);
        } catch (C011305p unused) {
        }
        C40I A0j = c48492Fl.A0j();
        this.A02 = A0j.A03;
        this.A01 = A0j.A02;
        A1J(A0j.A0i(), z, z2);
    }

    public C10040fC(C10040fC c10040fC, AnonymousClass094 anonymousClass094, long j, C09H c09h, boolean z) {
        super(c10040fC, anonymousClass094, j, c09h, z);
        this.A00 = c10040fC.A00;
        this.A02 = c10040fC.A02;
        this.A01 = c10040fC.A01;
    }

    @Override // X.AnonymousClass095
    public AnonymousClass095 A1K(AnonymousClass094 anonymousClass094) {
        return new C10040fC(this, anonymousClass094, this.A0E, ((AnonymousClass097) this).A02, true);
    }

    @Override // X.AnonymousClass095
    public AnonymousClass095 A1L(AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        if (c09h != null) {
            C10040fC c10040fC = new C10040fC(this, anonymousClass094, j, c09h, false);
            ((AnonymousClass097) c10040fC).A04 = null;
            return c10040fC;
        }
        throw null;
    }

    @Override // X.AnonymousClass095, X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        UserJid userJid;
        C40541sR c40541sR = c40551sS.A01;
        C48482Fk c48482Fk = (C48482Fk) c40541sR.A06().AVX();
        C40H c40h = (C40H) c40541sR.A06().A0j().AVX();
        boolean z = c40551sS.A04;
        boolean z2 = c40551sS.A03;
        C2G6 A1I = A1I((C2G6) ((C40I) c40h.A00).A0i().AVX(), z, z2);
        if (A1I != null && (userJid = this.A00) != null) {
            String rawString = userJid.getRawString();
            c48482Fk.A02();
            C48492Fl.A0C((C48492Fl) c48482Fk.A00, rawString);
            if (!TextUtils.isEmpty(this.A01)) {
                String str = this.A01;
                c40h.A02();
                C40I.A0B((C40I) c40h.A00, str);
            }
            if (!TextUtils.isEmpty(this.A02)) {
                String str2 = this.A02;
                c40h.A02();
                C40I.A0A((C40I) c40h.A00, str2);
            }
            c40h.A02();
            C40I.A09((C40I) c40h.A00, A1I);
            c48482Fk.A02();
            C48492Fl.A0A((C48492Fl) c48482Fk.A00, c40h);
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
        StringBuilder A0P = C000200d.A0P("FMessageCatalog/buildE2eMessage/unable to send encrypted media message due to missing mediaKey or businessOwnerJid; message.key=");
        A0P.append(this.A0n);
        A0P.append("; media_wa_type=");
        A0P.append((int) this.A0m);
        A0P.append("; business_owner_jid=");
        A0P.append(this.A00);
        Log.w(A0P.toString());
    }

    @Override // X.AnonymousClass095, X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C10040fC(this, anonymousClass094, this.A0E, ((AnonymousClass097) this).A02, true);
    }
}
