package X;

import javax.security.auth.Destroyable;

/* renamed from: X.0b9 */
/* loaded from: classes.dex */
public class C0b9 implements Destroyable {
    public boolean A00;
    public final C02930Dl A01;
    public final C02920Dk A02;

    public C0b9(C02920Dk c02920Dk, C02930Dl c02930Dl) {
        this.A02 = c02920Dk;
        this.A01 = c02930Dl;
    }

    public static C0b9 A00() {
        C40641sb A02 = C40631sa.A00().A02();
        return new C0b9(new C02920Dk(A02.A01), new C02930Dl(A02.A00));
    }

    public static C0b9 A01(byte[] bArr) {
        if (bArr == null || bArr.length != 64) {
            return null;
        }
        byte[][] A1k = AnonymousClass029.A1k(bArr);
        return new C0b9(new C02920Dk(A1k[1]), new C02930Dl(A1k[0]));
    }

    public byte[] A02() {
        return AnonymousClass029.A1h(this.A01.A01, this.A02.A01);
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        if (this.A00) {
            return;
        }
        this.A01.destroy();
        this.A02.destroy();
        this.A00 = true;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.A00;
    }
}
