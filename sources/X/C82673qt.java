package X;

import java.util.List;

/* renamed from: X.3qt  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C82673qt extends C0HS {
    public final InterfaceC49102Im A00;
    public final C2AS A01;

    public C82673qt(C2AS c2as, InterfaceC49102Im interfaceC49102Im) {
        this.A01 = c2as;
        this.A00 = interfaceC49102Im;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        return this.A01.A0E();
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        List list = (List) obj;
        if (list != null) {
            this.A00.AP4(list);
            return;
        }
        throw null;
    }
}
