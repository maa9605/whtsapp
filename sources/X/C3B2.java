package X;

import com.whatsapp.gallery.MediaGalleryFragmentBase;
import java.lang.ref.WeakReference;

/* renamed from: X.3B2  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3B2 extends C0HS {
    public int A00;
    public int A01;
    public final int A02;
    public final C018508q A03;
    public final C002301c A04;
    public final InterfaceC60932vK A05;
    public final C52602b0 A06;
    public final WeakReference A07;
    public final boolean A08;

    public C3B2(C018508q c018508q, C002301c c002301c, MediaGalleryFragmentBase mediaGalleryFragmentBase, InterfaceC60932vK interfaceC60932vK, int i, boolean z) {
        this.A03 = c018508q;
        this.A04 = c002301c;
        this.A07 = new WeakReference(mediaGalleryFragmentBase);
        this.A05 = interfaceC60932vK;
        this.A02 = i;
        this.A08 = z;
        this.A06 = new C52602b0(c002301c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
        if (A04() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
        r6.add(r4);
     */
    @Override // X.C0HS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A07(java.lang.Object[] r15) {
        /*
            r14 = this;
            X.2vK r1 = r14.A05
            boolean r0 = r14.A08
            r8 = 1
            r0 = r0 ^ r8
            X.2a8 r7 = r1.A6s(r0)
            int r0 = r7.getCount()
            r14.A01 = r0
            long r11 = android.os.SystemClock.uptimeMillis()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5 = 0
            r13 = 0
            r4 = r13
            r3 = 0
        L1d:
            int r0 = r14.A01
            if (r3 >= r0) goto La1
            boolean r0 = r14.A04()
            if (r0 != 0) goto La1
            X.2a4 r9 = r7.AB8(r3)
            if (r9 == 0) goto La1
            int r0 = r14.A02
            int r0 = r0 - r8
            if (r3 != r0) goto L57
            if (r4 == 0) goto L57
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r6)
            X.01c r0 = r14.A04
            X.2az r1 = new X.2az
            r1.<init>(r0, r4)
            int r0 = r14.A01
            r1.count = r0
            r2.add(r1)
            long r11 = android.os.SystemClock.uptimeMillis()
            X.08q r0 = r14.A03
            java.lang.RunnableEBaseShape1S0210000_I1 r1 = new java.lang.RunnableEBaseShape1S0210000_I1
            r1.<init>(r14, r2, r8, r5)
            android.os.Handler r0 = r0.A02
            r0.post(r1)
        L57:
            long r0 = r9.A9h()
            X.2b0 r2 = r14.A06
            X.2az r1 = r2.A00(r0)
            if (r4 == 0) goto L6c
            boolean r0 = r4.equals(r1)
            if (r0 != 0) goto L6f
            r6.add(r4)
        L6c:
            r1.count = r5
            r4 = r1
        L6f:
            int r0 = r4.count
            int r0 = r0 + r8
            r4.count = r0
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L9d
            r9 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 + r11
            long r1 = android.os.SystemClock.uptimeMillis()
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L9d
            long r11 = android.os.SystemClock.uptimeMillis()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r6)
            r6.clear()
            X.08q r0 = r14.A03
            java.lang.RunnableEBaseShape1S0210000_I1 r1 = new java.lang.RunnableEBaseShape1S0210000_I1
            r1.<init>(r14, r2, r5, r5)
            android.os.Handler r0 = r0.A02
            r0.post(r1)
        L9d:
            int r3 = r3 + 1
            goto L1d
        La1:
            if (r4 == 0) goto Lac
            boolean r0 = r14.A04()
            if (r0 != 0) goto Lac
            r6.add(r4)
        Lac:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto Lbe
            X.08q r0 = r14.A03
            java.lang.RunnableEBaseShape1S0210000_I1 r1 = new java.lang.RunnableEBaseShape1S0210000_I1
            r1.<init>(r14, r6, r5, r5)
            android.os.Handler r0 = r0.A02
            r0.post(r1)
        Lbe:
            int r0 = r7.getCount()
            r14.A01 = r0
            r7.close()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3B2.A07(java.lang.Object[]):java.lang.Object");
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = (MediaGalleryFragmentBase) this.A07.get();
        if (mediaGalleryFragmentBase != null) {
            mediaGalleryFragmentBase.A15(false);
        }
    }
}
