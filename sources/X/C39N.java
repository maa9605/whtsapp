package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.39N  reason: invalid class name */
/* loaded from: classes2.dex */
public class C39N extends C0HS {
    public final C2L9 A00;
    public final C2NW A01;
    public final UserJid A02;
    public final C05Y A03;

    public C39N(C05Y c05y, C2L9 c2l9, C2NW c2nw, UserJid userJid) {
        this.A03 = c05y;
        this.A00 = c2l9;
        this.A01 = c2nw;
        this.A02 = userJid;
    }

    @Override // X.C0HS
    public void A06() {
        this.A01.APS();
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        try {
            this.A03.A08(32000L);
            return this.A00.A01(C22H.A08, this.A02);
        } catch (C1PZ unused) {
            return null;
        }
    }

    @Override // X.C0HS
    public void A08() {
        this.A01.ANW();
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        this.A01.APR((EnumC40721sl) obj);
    }
}
