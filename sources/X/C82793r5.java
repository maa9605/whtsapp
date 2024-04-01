package X;

import android.util.SparseBooleanArray;
import com.whatsapp.stickers.StickerStorePackPreviewActivity;

/* renamed from: X.3r5 */
/* loaded from: classes2.dex */
public class C82793r5 extends C0HS {
    public final int A00;
    public final C42531vt A01;
    public final /* synthetic */ StickerStorePackPreviewActivity A02;

    public C82793r5(StickerStorePackPreviewActivity stickerStorePackPreviewActivity, int i, C42531vt c42531vt) {
        this.A02 = stickerStorePackPreviewActivity;
        this.A00 = i;
        this.A01 = c42531vt;
    }

    @Override // X.C0HS
    public void A06() {
        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = this.A02;
        C3Y5 c3y5 = stickerStorePackPreviewActivity.A0J;
        int i = this.A00;
        SparseBooleanArray sparseBooleanArray = c3y5.A01;
        if (sparseBooleanArray != null) {
            sparseBooleanArray.put(i, true);
        }
        stickerStorePackPreviewActivity.A0K.A02(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0072, code lost:
        if (r1 != null) goto L22;
     */
    @Override // X.C0HS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A07(java.lang.Object[] r8) {
        /*
            r7 = this;
            X.0JM[] r8 = (X.C0JM[]) r8
            int r2 = r8.length
            r1 = 1
            r0 = 0
            if (r2 == r1) goto L8
            r1 = 0
        L8:
            X.C000700j.A07(r1)
            r4 = r8[r0]
            if (r4 == 0) goto L7c
            com.whatsapp.stickers.StickerStorePackPreviewActivity r5 = r7.A02
            java.util.Map r1 = r5.A0Q
            java.lang.String r0 = r4.A0B
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L74
            X.00f r0 = r5.A0F
            X.028 r0 = r0.A05
            r0.A02()
            java.io.File r1 = r0.A03
            java.lang.String r0 = "sticker"
            java.io.File r6 = new java.io.File
            r6.<init>(r1, r0)
            boolean r0 = r6.exists()
            if (r0 != 0) goto L39
            boolean r0 = r6.mkdirs()
            if (r0 == 0) goto L79
        L39:
            java.lang.String r3 = r4.A0B
            if (r3 == 0) goto L7a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r1 = 47
            r0 = 45
            java.lang.String r0 = r3.replace(r1, r0)
            r2.append(r0)
            java.lang.String r0 = ".webp"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.io.File r3 = new java.io.File
            r3.<init>(r6, r0)
            java.util.Map r2 = r5.A0Q
            java.lang.String r1 = r4.A0B
            java.lang.String r0 = r3.getAbsolutePath()
            r2.put(r1, r0)
            X.2Br r0 = r5.A0G
            java.io.File r0 = r0.A01(r4, r3)
            if (r0 == 0) goto L79
            java.lang.String r1 = r0.getAbsolutePath()
            if (r1 == 0) goto L79
        L74:
            r0 = 2
            r4.A08 = r1
            r4.A01 = r0
        L79:
            return r4
        L7a:
            r0 = 0
            throw r0
        L7c:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82793r5.A07(java.lang.Object[]):java.lang.Object");
    }

    @Override // X.C0HS
    public void A08() {
        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = this.A02;
        C3Y5 c3y5 = stickerStorePackPreviewActivity.A0J;
        if (c3y5 != null) {
            int i = this.A00;
            SparseBooleanArray sparseBooleanArray = c3y5.A01;
            if (sparseBooleanArray != null) {
                sparseBooleanArray.put(i, false);
            }
        }
        C82613qn c82613qn = stickerStorePackPreviewActivity.A0K;
        if (c82613qn != null) {
            c82613qn.A02(this.A00);
        }
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C0JM c0jm = (C0JM) obj;
        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = this.A02;
        C3Y5 c3y5 = stickerStorePackPreviewActivity.A0J;
        int i = this.A00;
        SparseBooleanArray sparseBooleanArray = c3y5.A01;
        if (sparseBooleanArray != null) {
            sparseBooleanArray.put(i, false);
        }
        stickerStorePackPreviewActivity.A0K.A02(i);
        stickerStorePackPreviewActivity.A0K.A0J(i, c0jm, this.A01);
    }
}
