package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1kd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C36331kd extends C0HS {
    public C1N6 A00;
    public UserJid A01;
    public final /* synthetic */ C06K A02;

    public C36331kd(C06K c06k, UserJid userJid, C1N6 c1n6) {
        this.A02 = c06k;
        this.A01 = userJid;
        this.A00 = c1n6;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        return this.A02.A04.A0D(this.A01);
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C05210Nt c05210Nt = (C05210Nt) obj;
        C1N6 c1n6 = this.A00;
        if (c1n6 != null) {
            c1n6.AI2(c05210Nt);
        }
    }
}
