package X;

/* renamed from: X.2Eq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48282Eq {
    public static volatile C48282Eq A02;
    public final AnonymousClass012 A00;
    public final C43121wt A01;

    public C48282Eq(AnonymousClass012 anonymousClass012, C43121wt c43121wt) {
        this.A00 = anonymousClass012;
        this.A01 = c43121wt;
    }

    public boolean A00(C04140Is c04140Is) {
        AnonymousClass012 anonymousClass012 = this.A00;
        if (anonymousClass012.A01() - c04140Is.A04 >= 86400000) {
            c04140Is.A04 = anonymousClass012.A01();
            c04140Is.A01 = 1;
            this.A01.A05(c04140Is);
            return true;
        }
        int i = c04140Is.A01;
        if (i >= 15) {
            return false;
        }
        c04140Is.A01 = i + 1;
        this.A01.A05(c04140Is);
        return true;
    }
}
