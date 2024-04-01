package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.0Jq */
/* loaded from: classes.dex */
public class C04300Jq extends AnonymousClass092 {
    public final int A00;

    @Override // X.AnonymousClass092
    public int A06() {
        return 7;
    }

    @Override // X.AnonymousClass092
    public UserJid A0B() {
        return null;
    }

    @Override // X.AnonymousClass092
    public void A0R() {
    }

    @Override // X.AnonymousClass092
    public boolean A0x() {
        return false;
    }

    @Override // X.AnonymousClass092
    public boolean A0y() {
        return false;
    }

    @Override // X.AnonymousClass092
    public boolean A13() {
        return false;
    }

    public C04300Jq(AnonymousClass094 anonymousClass094, long j, int i) {
        super(anonymousClass094, j, (byte) 0);
        A0Y(6);
        this.A00 = i;
    }

    @Override // X.AnonymousClass092
    public long A08() {
        return this.A00;
    }

    @Override // X.AnonymousClass092
    public String A0I() {
        return C003101m.A07(this.A0G);
    }

    @Override // X.AnonymousClass092
    public List A0P() {
        C000700j.A08(false, "should not be called for FMessageSystem");
        return null;
    }

    @Override // X.AnonymousClass092
    public void A0Q() {
        C000700j.A08(false, "Cannot change status for FMessageSystem");
    }

    @Override // X.AnonymousClass092
    public void A0Y(int i) {
        if (i != 6) {
            C000700j.A08(false, "Cannot change status for FMessageSystem");
        }
        super.A0Y(i);
    }

    @Override // X.AnonymousClass092
    public void A0d(AbstractC005302j abstractC005302j) {
        if (abstractC005302j == null) {
            return;
        }
        if (A18()) {
            this.A0G = abstractC005302j;
            return;
        }
        StringBuilder A0P = C000200d.A0P("FMessageSystem/setRemoteResourceJid/should not be called for FMessageSystem, key = ");
        A0P.append(this.A0n.toString());
        A0P.append(" action = ");
        A0P.append(this.A00);
        Log.e(A0P.toString());
    }

    @Override // X.AnonymousClass092
    public void A0n(String str) {
        this.A0G = null;
        if (!A18() || TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC005302j A02 = AbstractC005302j.A02(str);
        this.A0G = A02;
        if (A02 == null) {
            StringBuilder A0P = C000200d.A0P("Something went wrong with this message, key = ");
            A0P.append(this.A0n.toString());
            A0P.append(" action = ");
            A0P.append(this.A00);
            C000700j.A08(false, A0P.toString());
        }
    }

    @Override // X.AnonymousClass092
    public void A0u(List list) {
        C000700j.A08(false, "should not be called for FMessageSystem");
    }

    @Override // X.AnonymousClass092
    public String A16() {
        return A0G();
    }

    @Override // X.AnonymousClass092
    public void A17(String str) {
        A0l(str);
    }

    public boolean A18() {
        int i = this.A00;
        return i == 18 || i == 57 || i == 20 || i == 14 || i == 52 || i == 27 || i == 4 || i == 7 || i == 51 || i == 11 || i == 17 || i == 1 || i == 6 || i == 5 || i == 12 || i == 29 || i == 30 || i == 31 || i == 32 || i == 54 || i == 53 || i == 13 || i == 15 || i == 16 || i == 9 || i == 21 || i == 42 || i == 40 || i == 41 || i == 64 || i == 65 || i == 56 || i == 59 || i == 60;
    }
}
