package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2FF  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2FF {
    public final long A00;
    public final AbstractC005302j A01;
    public final UserJid A02;
    public final String A03;
    public final boolean A04;

    public C2FF(long j, boolean z, String str, AbstractC005302j abstractC005302j, UserJid userJid) {
        this.A00 = j;
        this.A04 = z;
        this.A03 = str;
        this.A01 = abstractC005302j;
        this.A02 = userJid;
    }

    public C41F A00() {
        UserJid userJid;
        C452521b A09 = C452421a.A09();
        A09.A04(this.A03);
        boolean z = this.A04;
        A09.A07(z);
        AbstractC005302j abstractC005302j = this.A01;
        A09.A06(abstractC005302j.getRawString());
        if (C003101m.A0U(abstractC005302j) && !z && (userJid = this.A02) != null) {
            A09.A05(userJid.getRawString());
        }
        C0CT AVX = C41F.A03.AVX();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.A00);
        if (seconds > 0) {
            AVX.A02();
            C41F c41f = (C41F) AVX.A00;
            c41f.A00 |= 2;
            c41f.A01 = seconds;
        }
        AVX.A02();
        C41F c41f2 = (C41F) AVX.A00;
        if (c41f2 != null) {
            c41f2.A02 = (C452421a) A09.A01();
            c41f2.A00 |= 1;
            return (C41F) AVX.A01();
        }
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2FF.class != obj.getClass()) {
            return false;
        }
        C2FF c2ff = (C2FF) obj;
        return this.A04 == c2ff.A04 && this.A03.equals(c2ff.A03) && this.A01.equals(c2ff.A01) && AnonymousClass024.A0l(this.A02, c2ff.A02);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A04), this.A03, this.A01});
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("SyncdMessage{timestamp=");
        A0P.append(this.A00);
        A0P.append(", isFromMe=");
        A0P.append(this.A04);
        A0P.append(", messageId=");
        A0P.append(this.A03);
        A0P.append(", remoteJid=");
        A0P.append(this.A01);
        A0P.append(", participant=");
        A0P.append(this.A02);
        A0P.append('}');
        return A0P.toString();
    }
}
