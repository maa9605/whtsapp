package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.0Jx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04370Jx extends C04300Jq {
    public UserJid A00;
    public UserJid A01;
    public transient long A02;
    public final transient AbstractC000600i A03;

    @Override // X.AnonymousClass092
    public AbstractC005302j A0A() {
        return null;
    }

    @Override // X.C04300Jq, X.AnonymousClass092
    public void A0d(AbstractC005302j abstractC005302j) {
    }

    public C04370Jx(AnonymousClass094 anonymousClass094, long j, int i, AbstractC000600i abstractC000600i) {
        super(anonymousClass094, j, i);
        this.A03 = abstractC000600i;
    }

    @Override // X.AnonymousClass092
    public Object A0F() {
        UserJid userJid;
        if (((C04300Jq) this).A00 != 10 || (userJid = this.A00) == null) {
            return null;
        }
        return userJid.getRawString();
    }

    @Override // X.C04300Jq, X.AnonymousClass092
    public String A0I() {
        UserJid userJid;
        if (((C04300Jq) this).A00 != 10 || (userJid = this.A01) == null) {
            return null;
        }
        return userJid.getRawString();
    }

    @Override // X.AnonymousClass092
    public String A0J() {
        UserJid userJid;
        int i = ((C04300Jq) this).A00;
        if (i == 28 && this.A01 == null) {
            this.A03.A09("sys-msg/number-change/old-jid-persist-null", A19(), true);
        }
        if (i != 28 || (userJid = this.A01) == null) {
            return null;
        }
        return userJid.getRawString();
    }

    @Override // X.AnonymousClass092
    public String A0N() {
        UserJid userJid;
        int i = ((C04300Jq) this).A00;
        if (i == 28 && this.A00 == null) {
            this.A03.A09("sys-msg/number-change/new-jid-persist-null", A19(), true);
        }
        if (i != 28 || (userJid = this.A00) == null) {
            return null;
        }
        return userJid.getRawString();
    }

    @Override // X.AnonymousClass092
    public void A0k(Object obj) {
        if (((C04300Jq) this).A00 == 10 && (obj instanceof String)) {
            this.A00 = UserJid.getNullable((String) obj);
        }
    }

    @Override // X.C04300Jq, X.AnonymousClass092
    public void A0n(String str) {
        if (((C04300Jq) this).A00 == 10) {
            this.A01 = UserJid.getNullable(str);
        }
    }

    @Override // X.AnonymousClass092
    public void A0o(String str) {
        if (((C04300Jq) this).A00 == 28) {
            if (this.A01 != null) {
                if (TextUtils.isEmpty(str)) {
                    this.A03.A09("sys-msg/number-change/old-jid-null-override", A19(), false);
                } else if (UserJid.getNullable(str) == null) {
                    this.A03.A09("sys-msg/number-change/old-jid-invalid-override", A19(), false);
                }
            }
            this.A01 = UserJid.getNullable(str);
        }
    }

    @Override // X.AnonymousClass092
    public void A0s(String str) {
        if (((C04300Jq) this).A00 == 28) {
            if (this.A00 != null) {
                if (TextUtils.isEmpty(str)) {
                    this.A03.A09("sys-msg/number-change/new-jid-null-override", A19(), false);
                } else if (UserJid.getNullable(str) == null) {
                    this.A03.A09("sys-msg/number-change/new-jid-invalid-override", A19(), false);
                }
            }
            this.A00 = UserJid.getNullable(str);
        }
    }

    public final String A19() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        StringBuilder A0P = C000200d.A0P("id=");
        A0P.append(this.A0p);
        A0P.append(", created=");
        A0P.append(simpleDateFormat.format(Long.valueOf(this.A0E)));
        return A0P.toString();
    }
}
