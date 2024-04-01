package X;

import android.text.TextUtils;
import android.util.Base64;
import java.util.Arrays;

/* renamed from: X.26y */
/* loaded from: classes2.dex */
public class C464726y implements InterfaceC04730Lp, C0EK {
    public static volatile C464726y A0I;
    public final AbstractC000600i A00;
    public final C018508q A01;
    public final C06K A02;
    public final C06M A03;
    public final C06L A04;
    public final AnonymousClass271 A05;
    public final C464826z A06;
    public final AnonymousClass272 A07;
    public final AnonymousClass075 A08;
    public final C41321tj A09;
    public final AnonymousClass012 A0A;
    public final C000500h A0B;
    public final C0C9 A0C;
    public final AnonymousClass011 A0D;
    public final C0EG A0E;
    public final C0EJ A0F;
    public final AnonymousClass270 A0G;
    public final InterfaceC002901k A0H;

    @Override // X.C0EK
    public int[] AAP() {
        return new int[]{202};
    }

    @Override // X.InterfaceC04730Lp
    public void AKm() {
    }

    @Override // X.InterfaceC04730Lp
    public void AKn() {
    }

    public C464726y(AnonymousClass012 anonymousClass012, C018508q c018508q, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, AnonymousClass011 anonymousClass011, C0EG c0eg, C0C9 c0c9, C464826z c464826z, AnonymousClass270 anonymousClass270, C41321tj c41321tj, AnonymousClass271 anonymousClass271, AnonymousClass272 anonymousClass272, C0EJ c0ej, AnonymousClass075 anonymousClass075, C000500h c000500h, C06L c06l, C06K c06k, C06M c06m) {
        this.A0A = anonymousClass012;
        this.A01 = c018508q;
        this.A00 = abstractC000600i;
        this.A0H = interfaceC002901k;
        this.A0D = anonymousClass011;
        this.A0E = c0eg;
        this.A0C = c0c9;
        this.A06 = c464826z;
        this.A0G = anonymousClass270;
        this.A05 = anonymousClass271;
        this.A09 = c41321tj;
        this.A07 = anonymousClass272;
        this.A0F = c0ej;
        this.A08 = anonymousClass075;
        this.A0B = c000500h;
        this.A04 = c06l;
        this.A02 = c06k;
        this.A03 = c06m;
    }

    public final boolean A00(String str, C04420Kc c04420Kc, C468328l c468328l) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        byte[] decode = Base64.decode(str.getBytes(), 0);
        Arrays.toString(decode);
        C468428m c468428m = new C468428m(C22H.A0E);
        c468428m.A04 = true;
        c468428m.A00 = c468328l;
        c468428m.A03(decode);
        this.A09.A02(c468428m.A01(), true);
        this.A0E.A0L(c04420Kc);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:276:0x02f5, code lost:
        if (r0 != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:229:0x01df  */
    @Override // X.C0EK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AEN(int r26, android.os.Message r27) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C464726y.AEN(int, android.os.Message):boolean");
    }
}
