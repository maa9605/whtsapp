package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Jw */
/* loaded from: classes.dex */
public class C04360Jw extends C04300Jq {
    public int A00;
    public List A01;
    public final C02630Ce A02;
    public transient long A03;
    public final transient C04420Kc A04;

    public C04360Jw(AnonymousClass094 anonymousClass094, long j, int i) {
        super(anonymousClass094, j, i);
        this.A01 = new ArrayList();
        this.A04 = null;
        this.A02 = null;
    }

    public C04360Jw(C04420Kc c04420Kc, C02630Ce c02630Ce, long j, int i) {
        super(new AnonymousClass094(C003101m.A04(c04420Kc.A01), true, c04420Kc.A07), j, i);
        this.A01 = new ArrayList();
        this.A02 = c02630Ce;
        A0Y(6);
        this.A04 = c04420Kc;
    }

    @Override // X.AnonymousClass092
    public int A04() {
        return this.A00;
    }

    @Override // X.AnonymousClass092
    public Object A0F() {
        if (this.A01.size() > 0) {
            return C003101m.A0E(this.A01);
        }
        return null;
    }

    @Override // X.C04300Jq, X.AnonymousClass092
    public List A0P() {
        return this.A01;
    }

    @Override // X.C04300Jq, X.AnonymousClass092
    public void A0R() {
        Collections.sort(this.A01);
    }

    @Override // X.AnonymousClass092
    public void A0W(int i) {
        this.A00 = i;
    }

    @Override // X.AnonymousClass092
    public void A0k(Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() <= 0 || !(list.get(0) instanceof String)) {
                return;
            }
            this.A01 = C003101m.A0F(UserJid.class, list);
        }
    }

    @Override // X.C04300Jq, X.AnonymousClass092
    public void A0u(List list) {
        if (list != null) {
            this.A01 = list;
        } else {
            this.A01 = new ArrayList();
        }
    }
}
