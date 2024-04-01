package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.0Nr */
/* loaded from: classes.dex */
public class C05190Nr {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public long A04;
    public AnonymousClass093 A05;
    public Jid A06;
    public C010805j A07;
    public C010805j A08;
    public AnonymousClass094 A09;
    public AnonymousClass092 A0A;
    public C05200Ns A0B;
    public Boolean A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public byte[] A0V;
    public byte[] A0W;
    public byte[] A0X;
    public final long A0Y;
    public final Jid A0Z;
    public final UserJid A0a;
    public final AnonymousClass094 A0b;
    public final C05U A0c;
    public final String A0d;

    public C05190Nr(C05U c05u, Jid jid, UserJid userJid, String str, long j, boolean z) {
        this.A0c = c05u;
        if (jid != null) {
            this.A0Z = jid;
            this.A0a = userJid;
            this.A0d = str;
            this.A0Y = j;
            AbstractC005302j A04 = C003101m.A04(jid);
            if (str == null) {
                throw null;
            }
            this.A0b = new AnonymousClass094(A04, z, str);
            if (userJid != null) {
                this.A09 = new AnonymousClass094(userJid, true, str);
                return;
            }
            return;
        }
        throw null;
    }

    public int A00() {
        Integer num = this.A0E;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int A01() {
        Integer num = this.A0H;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public AbstractC005302j A02() {
        return C003101m.A04(this.A0Z);
    }

    public Jid A03() {
        Jid jid = this.A0Z;
        return (C003101m.A0U(jid) || C003101m.A0P(jid)) ? this.A06 : jid;
    }

    public AnonymousClass092 A04(byte b) {
        AnonymousClass092 anonymousClass092 = this.A0A;
        if (anonymousClass092 == null) {
            C05U c05u = this.A0c;
            AnonymousClass094 anonymousClass094 = this.A09;
            if (anonymousClass094 == null) {
                anonymousClass094 = this.A0b;
            }
            anonymousClass092 = c05u.A02(anonymousClass094, this.A0Y, b);
            this.A0A = anonymousClass092;
        }
        A06(anonymousClass092);
        return this.A0A;
    }

    public String A05() {
        AnonymousClass094 anonymousClass094 = this.A09;
        if (anonymousClass094 == null) {
            anonymousClass094 = this.A0b;
        }
        return anonymousClass094.toString();
    }

    public void A06(AnonymousClass092 anonymousClass092) {
        int i;
        this.A0A = anonymousClass092;
        Jid A03 = A03();
        if (A03 instanceof DeviceJid) {
            anonymousClass092.A0v = (DeviceJid) A03;
        }
        AnonymousClass094 anonymousClass094 = this.A09;
        if (anonymousClass094 == null) {
            anonymousClass094 = this.A0b;
        }
        if (anonymousClass094.A02) {
            anonymousClass092.A0Y(4);
            this.A0A.A0w = true;
        } else {
            Jid jid = this.A06;
            if (jid != null) {
                anonymousClass092.A0d(C003101m.A04(jid));
            }
        }
        Integer num = this.A0H;
        if (num != null) {
            this.A0A.A07 = num.intValue();
        }
        Integer num2 = this.A0G;
        if (num2 != null) {
            this.A0A.A06 = num2.intValue();
        }
        AnonymousClass092 anonymousClass0922 = this.A0A;
        anonymousClass0922.A0E = this.A0Y;
        Long l = this.A0I;
        if (l != null) {
            anonymousClass0922.A0C = l.longValue();
        }
        anonymousClass0922.A0s = this.A04;
        Integer num3 = this.A0F;
        if (num3 != null) {
            anonymousClass0922.A0P = num3;
        }
        String str = this.A0P;
        if (str != null) {
            anonymousClass0922.A0Z = str;
        }
        boolean z = this.A0R;
        anonymousClass0922.A0f = z;
        Long l2 = this.A0L;
        if (l2 != null) {
            anonymousClass0922.A0U = l2;
        }
        anonymousClass0922.A0A = this.A03;
        anonymousClass0922.A0O = this.A0B;
        anonymousClass0922.A0T = this.A0K;
        anonymousClass0922.A0S = this.A0J;
        Integer num4 = this.A0E;
        if (num4 != null) {
            anonymousClass0922.A00 = num4.intValue();
        }
        int i2 = this.A02;
        if (i2 != 0) {
            anonymousClass0922.A0U(i2);
        }
        AnonymousClass093 anonymousClass093 = this.A05;
        if (anonymousClass093 != null) {
            anonymousClass0922.A0F = anonymousClass093;
            String str2 = anonymousClass093.A0I;
            if (str2 == null) {
                anonymousClass0922.A0b = "UNSET";
            } else {
                anonymousClass0922.A0b = str2;
            }
        }
        anonymousClass0922.A0i = this.A0U;
        if (z && anonymousClass0922.A07 == 0) {
            anonymousClass0922.A0V(0);
            anonymousClass0922.A0j(null);
        } else if (!anonymousClass0922.A10() && (i = this.A01) != 0 && C003101m.A0U(anonymousClass0922.A0n.A00)) {
            anonymousClass0922.A0V(i);
        }
        this.A0A.A0h = this.A0S;
    }
}
