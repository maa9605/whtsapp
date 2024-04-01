package X;

/* renamed from: X.25M  reason: invalid class name */
/* loaded from: classes2.dex */
public class C25M {
    public static volatile C25M A06;
    public final C012005w A00;
    public final AnonymousClass012 A01;
    public final C25Q A02;
    public final C25N A03;
    public final C25O A04;
    public final InterfaceC002901k A05;

    public C25M(AnonymousClass012 anonymousClass012, InterfaceC002901k interfaceC002901k, C012005w c012005w, C44301yq c44301yq, C0C9 c0c9, C40411sD c40411sD, C42471vn c42471vn, C05E c05e, C25Q c25q, C06J c06j) {
        this.A01 = anonymousClass012;
        this.A05 = interfaceC002901k;
        this.A00 = c012005w;
        this.A02 = c25q;
        C25N c25n = new C25N(anonymousClass012, c44301yq);
        this.A03 = c25n;
        this.A04 = new C25O(c0c9, c40411sD, c42471vn, c05e, c06j, c25n);
    }

    public final boolean A00(Long l) {
        return l == null || this.A01.A05() - l.longValue() > 1296000000;
    }
}
