package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2cC  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C53252cC implements InterfaceC53232cA {
    public C53202c3 A00;

    @Override // X.InterfaceC53232cA
    public int AAh() {
        return 2;
    }

    public C53252cC(C53202c3 c53202c3) {
        this.A00 = c53202c3;
    }

    @Override // X.InterfaceC53232cA
    public UserJid AAk() {
        C06C A02 = this.A00.A02();
        if (A02 == null) {
            return null;
        }
        return (UserJid) A02.A03(UserJid.class);
    }
}
