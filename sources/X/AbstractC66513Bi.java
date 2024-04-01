package X;

import com.whatsapp.Mp4Ops;
import java.io.File;

/* renamed from: X.3Bi */
/* loaded from: classes2.dex */
public abstract class AbstractC66513Bi extends C0HS {
    public final AbstractC000600i A00;
    public final Mp4Ops A01;
    public final C000400f A02;
    public final AnonymousClass012 A03;
    public final C04560Kx A04;
    public final AnonymousClass240 A05;
    public final String A06;
    public final boolean A07;

    public AbstractC66513Bi(Mp4Ops mp4Ops, AbstractC000600i abstractC000600i, C000400f c000400f, String str, boolean z, AnonymousClass012 anonymousClass012, C04560Kx c04560Kx, AnonymousClass240 anonymousClass240) {
        this.A01 = mp4Ops;
        this.A00 = abstractC000600i;
        this.A02 = c000400f;
        this.A06 = str;
        this.A05 = anonymousClass240;
        this.A07 = z;
        this.A04 = c04560Kx;
        this.A03 = anonymousClass012;
    }

    @Override // X.C0HS
    public /* bridge */ /* synthetic */ Object A07(Object[] objArr) {
        return A0A();
    }

    @Override // X.C0HS
    public /* bridge */ /* synthetic */ void A09(Object obj) {
        File file;
        C61382w3 c61382w3 = (C61382w3) obj;
        AnonymousClass240 anonymousClass240 = this.A05;
        String str = this.A06;
        byte[] bArr = null;
        if (c61382w3 == null) {
            file = null;
        } else {
            file = c61382w3.A02;
            bArr = c61382w3.A03;
        }
        anonymousClass240.AKO(str, file, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01b0 A[Catch: IOException -> 0x01b3, TRY_LEAVE, TryCatch #12 {IOException -> 0x01b3, blocks: (B:205:0x01ab, B:207:0x01b0), top: B:244:0x01ab }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C61382w3 A0A() {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC66513Bi.A0A():X.2w3");
    }
}
