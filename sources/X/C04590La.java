package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0La */
/* loaded from: classes.dex */
public class C04590La extends C04300Jq {
    public UserJid A00;
    public UserJid A01;
    public AnonymousClass094 A02;
    public String A03;

    public C04590La(AnonymousClass094 anonymousClass094, long j, int i) {
        super(anonymousClass094, j, i);
    }

    @Override // X.C04300Jq, X.AnonymousClass092
    public UserJid A0B() {
        return this.A01;
    }

    @Override // X.AnonymousClass092
    public Object A0F() {
        String str;
        AnonymousClass094 anonymousClass094 = this.A02;
        if (anonymousClass094 != null) {
            String[] strArr = new String[3];
            AbstractC005302j abstractC005302j = anonymousClass094.A00;
            if (abstractC005302j != null) {
                str = abstractC005302j.getRawString();
            } else {
                str = "null";
            }
            strArr[0] = str;
            strArr[1] = String.valueOf(anonymousClass094.A02);
            strArr[2] = anonymousClass094.A01;
            return TextUtils.join(";", Arrays.asList(strArr));
        }
        return null;
    }

    @Override // X.AnonymousClass092
    public String A0J() {
        return this.A03;
    }

    @Override // X.AnonymousClass092
    public String A0K() {
        return C003101m.A07(this.A01);
    }

    @Override // X.AnonymousClass092
    public String A0L() {
        return C003101m.A07(this.A00);
    }

    @Override // X.C04300Jq, X.AnonymousClass092
    public List A0P() {
        C000700j.A08(false, "should not be called for FMessageSystemPayment");
        return null;
    }

    @Override // X.C04300Jq, X.AnonymousClass092
    public void A0d(AbstractC005302j abstractC005302j) {
        if (abstractC005302j == null) {
            return;
        }
        if (!A18()) {
            StringBuilder A0P = C000200d.A0P("should not be called for FMessageSystem, key = ");
            A0P.append(this.A0n.toString());
            A0P.append(" action = ");
            A0P.append(((C04300Jq) this).A00);
            C000700j.A08(false, A0P.toString());
        }
        this.A0G = abstractC005302j;
    }

    @Override // X.AnonymousClass092
    public void A0k(Object obj) {
        if (obj instanceof String) {
            String[] split = ((String) obj).split(";");
            C000700j.A08(split.length == 3, "Wrong format of expired reference key.");
            this.A02 = new AnonymousClass094(UserJid.getNullable(split[0]), Boolean.valueOf(split[1]).booleanValue(), split[2]);
        }
    }

    @Override // X.AnonymousClass092
    public void A0o(String str) {
        this.A03 = str;
    }

    @Override // X.AnonymousClass092
    public void A0p(String str) {
        this.A01 = UserJid.getNullable(str);
    }

    @Override // X.AnonymousClass092
    public void A0q(String str) {
        this.A00 = UserJid.getNullable(str);
    }

    @Override // X.C04300Jq, X.AnonymousClass092
    public void A0u(List list) {
        C000700j.A08(false, "should not be called for FMessageSystemPayment");
    }
}
