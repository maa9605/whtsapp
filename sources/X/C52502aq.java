package X;

import java.util.List;

/* renamed from: X.2aq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52502aq implements InterfaceC09100ce {
    public C0DK A00;
    public final C018708s A01;
    public final List A02;

    public C52502aq(C0DK c0dk, C018708s c018708s, List list) {
        this.A00 = c0dk;
        this.A01 = c018708s;
        this.A02 = list;
    }

    @Override // X.InterfaceC09100ce
    public boolean A7m(AbstractC005302j abstractC005302j) {
        C06C c06c = (C06C) this.A00.A05().get(abstractC005302j);
        return (c06c == null || C003101m.A0a(c06c.A02()) || !this.A01.A0G(c06c, this.A02, true)) ? false : true;
    }
}
