package X;

import java.util.List;

/* renamed from: X.3Tu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C70833Tu {
    public C49182Ix A00;
    public C85353vG A01;
    public final AbstractC000600i A02;
    public final C018508q A03;
    public final C44441z5 A04;
    public final C44471z8 A05;
    public final C44331yt A06;
    public final AnonymousClass012 A07;
    public final C001200o A08;
    public final C000500h A09;
    public final C01J A0A;
    public final C01R A0B;
    public final C41711uO A0C;
    public final C05Y A0D;
    public final C2AV A0E;
    public final C41521u3 A0F;
    public final C2Iz A0G;
    public final InterfaceC002901k A0H;
    public final C41981up A0I;
    public final C41991uq A0J;

    public C70833Tu(C001200o c001200o, AnonymousClass012 anonymousClass012, C018508q c018508q, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C41981up c41981up, C41991uq c41991uq, C05Y c05y, C01R c01r, C41521u3 c41521u3, C44331yt c44331yt, C01J c01j, C000500h c000500h, C2AV c2av, C41711uO c41711uO, C44441z5 c44441z5, C44471z8 c44471z8, C2Iz c2Iz) {
        this.A08 = c001200o;
        this.A07 = anonymousClass012;
        this.A03 = c018508q;
        this.A02 = abstractC000600i;
        this.A0H = interfaceC002901k;
        this.A0I = c41981up;
        this.A0J = c41991uq;
        this.A0D = c05y;
        this.A0B = c01r;
        this.A06 = c44331yt;
        this.A0A = c01j;
        this.A09 = c000500h;
        this.A0F = c41521u3;
        this.A0E = c2av;
        this.A0C = c41711uO;
        this.A04 = c44441z5;
        this.A05 = c44471z8;
        this.A0G = c2Iz;
    }

    public InterfaceC49192Iy A00() {
        C41711uO c41711uO = this.A0C;
        if (c41711uO.A0H.A02()) {
            C49182Ix c49182Ix = this.A00;
            if (c49182Ix == null) {
                C49182Ix c49182Ix2 = new C49182Ix(this.A07, this.A03, this.A02, this.A0H, this.A0D, this.A0B, this.A06, this.A0G, this.A0A, this.A09, c41711uO, this.A04, this.A05);
                this.A00 = c49182Ix2;
                return c49182Ix2;
            }
            return c49182Ix;
        }
        if (this.A01 == null) {
            C85353vG c85353vG = new C85353vG(this.A03, this.A08, this.A0I, this.A0J, this.A0F, this.A0E, this.A0G);
            this.A01 = c85353vG;
            C41991uq c41991uq = c85353vG.A08;
            InterfaceC43021wi interfaceC43021wi = c85353vG.A07;
            List list = c41991uq.A0R;
            if (!list.contains(interfaceC43021wi)) {
                list.add(interfaceC43021wi);
            }
        }
        return this.A01;
    }
}
