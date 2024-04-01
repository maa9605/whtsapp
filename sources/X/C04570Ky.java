package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.0Ky */
/* loaded from: classes.dex */
public class C04570Ky extends AnonymousClass092 implements AnonymousClass098, AnonymousClass099 {
    public long A00;
    public C011005l A01;
    public UserJid A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;

    public C04570Ky(C02L c02l, AnonymousClass094 anonymousClass094, long j, C2FZ c2fz, boolean z) {
        super(anonymousClass094, j, (byte) 24);
        UserJid of;
        if (anonymousClass094.A02) {
            c02l.A05();
            of = c02l.A03;
        } else {
            of = UserJid.of(anonymousClass094.A00);
        }
        this.A02 = of;
        this.A01 = C011005l.A04(c2fz.A05);
        this.A04 = c2fz.A06;
        this.A00 = c2fz.A01;
        this.A05 = c2fz.A07;
        this.A03 = c2fz.A04;
        byte[] A06 = c2fz.A02.A06();
        if (A06.length > 0) {
            super.A01 = 1;
            A0E().A04(A06, z);
        }
    }

    public C04570Ky(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 24);
    }

    public C04570Ky(C04570Ky c04570Ky, AnonymousClass094 anonymousClass094, long j) {
        super(c04570Ky, anonymousClass094, j, true);
        this.A02 = c04570Ky.A02;
        this.A01 = c04570Ky.A01;
        this.A04 = c04570Ky.A04;
        this.A00 = c04570Ky.A00;
        this.A05 = c04570Ky.A05;
        this.A06 = c04570Ky.A06;
        this.A03 = c04570Ky.A03;
    }

    @Override // X.AnonymousClass092
    public String A0J() {
        return this.A03;
    }

    @Override // X.AnonymousClass092
    public void A0o(String str) {
        this.A03 = str;
    }

    @Override // X.AnonymousClass092
    public String A16() {
        return this.A03;
    }

    @Override // X.AnonymousClass092
    public void A17(String str) {
        this.A03 = str;
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C40541sR c40541sR = c40551sS.A01;
        C2FY c2fy = (C2FY) ((C40531sQ) c40541sR.A00).A0u().AVX();
        if (this.A01 != null) {
            String str = this.A05;
            if (str != null) {
                c2fy.A02();
                C2FZ.A0C((C2FZ) c2fy.A00, str);
            } else {
                Log.e("FMessageGroupInvite/buildE2eMessage missing invite hash");
            }
            if (c40551sS.A04 && this.A06) {
                c2fy.A02();
                C2FZ c2fz = (C2FZ) c2fy.A00;
                c2fz.A00 |= 4;
                c2fz.A01 = 0L;
            } else {
                long j = this.A00;
                c2fy.A02();
                C2FZ c2fz2 = (C2FZ) c2fy.A00;
                c2fz2.A00 |= 4;
                c2fz2.A01 = j;
            }
            String str2 = this.A04;
            if (str2 != null) {
                c2fy.A02();
                C2FZ.A0D((C2FZ) c2fy.A00, str2);
            }
            String rawString = this.A01.getRawString();
            c2fy.A02();
            C2FZ.A0B((C2FZ) c2fy.A00, rawString);
            if (!TextUtils.isEmpty(this.A03)) {
                String str3 = this.A03;
                c2fy.A02();
                C2FZ.A0E((C2FZ) c2fy.A00, str3);
            }
            C03900Hp A0E = A0E();
            if (A0E != null && A0E.A08() != null) {
                C0AN A00 = C0AN.A00(A0E.A08());
                c2fy.A02();
                C2FZ.A09((C2FZ) c2fy.A00, A00);
            }
            C0CM c0cm = c40551sS.A02;
            byte[] bArr = c40551sS.A05;
            if (AnonymousClass029.A1U(this, c0cm, bArr)) {
                C40521sP A0G = AnonymousClass029.A0G(c40551sS.A00, this, c40551sS.A03, c0cm, bArr);
                c2fy.A02();
                C2FZ.A0A((C2FZ) c2fy.A00, A0G);
            }
            c40541sR.A02();
            C40531sQ.A0N((C40531sQ) c40541sR.A00, c2fy);
            return;
        }
        Log.w("FMessageGroupInvite/buildE2eMessage failed to build e2e message");
    }

    @Override // X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C04570Ky(this, anonymousClass094, this.A0E);
    }
}
