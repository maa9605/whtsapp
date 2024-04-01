package X;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;

/* renamed from: X.10A */
/* loaded from: classes.dex */
public final class C10A {
    public final MediaCodecInfo.CodecCapabilities A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX WARN: Code restructure failed: missing block: B:41:0x001f, code lost:
        if (r7.isFeatureSupported("adaptive-playback") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0033, code lost:
        if (r7.isFeatureSupported("tunneled-playback") == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C10A(java.lang.String r5, java.lang.String r6, android.media.MediaCodecInfo.CodecCapabilities r7, boolean r8, boolean r9, boolean r10) {
        /*
            r4 = this;
            r4.<init>()
            if (r5 == 0) goto L59
            r4.A02 = r5
            r4.A01 = r6
            r4.A00 = r7
            r4.A05 = r8
            r3 = 1
            if (r9 != 0) goto L21
            if (r7 == 0) goto L21
            int r1 = X.C08M.A00
            r0 = 19
            if (r1 < r0) goto L21
            java.lang.String r0 = "adaptive-playback"
            boolean r1 = r7.isFeatureSupported(r0)
            r0 = 1
            if (r1 != 0) goto L22
        L21:
            r0 = 0
        L22:
            r4.A03 = r0
            r2 = 21
            if (r7 == 0) goto L35
            int r0 = X.C08M.A00
            if (r0 < r2) goto L35
            java.lang.String r0 = "tunneled-playback"
            boolean r1 = r7.isFeatureSupported(r0)
            r0 = 1
            if (r1 != 0) goto L36
        L35:
            r0 = 0
        L36:
            r4.A07 = r0
            if (r10 != 0) goto L48
            if (r7 == 0) goto L57
            int r0 = X.C08M.A00
            if (r0 < r2) goto L57
            java.lang.String r0 = "secure-playback"
            boolean r0 = r7.isFeatureSupported(r0)
            if (r0 == 0) goto L57
        L48:
            r4.A06 = r3
            java.lang.String r1 = X.C223412b.A02(r6)
            java.lang.String r0 = "video"
            boolean r0 = r0.equals(r1)
            r4.A04 = r0
            return
        L57:
            r3 = 0
            goto L48
        L59:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10A.<init>(java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean):void");
    }

    public final void A00(String str) {
        StringBuilder A0W = C000200d.A0W("NoSupport [", str, "] [");
        A0W.append(this.A02);
        A0W.append(", ");
        A0W.append(this.A01);
        A0W.append("] [");
        A0W.append(C08M.A02);
        A0W.append("]");
        Log.d("MediaCodecInfo", A0W.toString());
    }

    public boolean A01(int i, int i2, double d) {
        boolean isSizeSupported;
        boolean isSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            A00("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            A00("sizeAndRate.vCaps");
            return false;
        }
        if (d != -1.0d && d > 0.0d) {
            isSizeSupported = videoCapabilities.areSizeAndRateSupported(i, i2, d);
        } else {
            isSizeSupported = videoCapabilities.isSizeSupported(i, i2);
        }
        if (isSizeSupported) {
            return true;
        }
        if (i < i2) {
            if (d != -1.0d && d > 0.0d) {
                isSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i2, i, d);
            } else {
                isSizeSupported2 = videoCapabilities.isSizeSupported(i2, i);
            }
            if (isSizeSupported2) {
                StringBuilder A0R = C000200d.A0R("sizeAndRate.rotated, ", i, "x", i2, "x");
                A0R.append(d);
                StringBuilder A0W = C000200d.A0W("AssumedSupport [", A0R.toString(), "] [");
                A0W.append(this.A02);
                A0W.append(", ");
                A0W.append(this.A01);
                A0W.append("] [");
                A0W.append(C08M.A02);
                A0W.append("]");
                Log.d("MediaCodecInfo", A0W.toString());
                return true;
            }
        }
        StringBuilder A0R2 = C000200d.A0R("sizeAndRate.support, ", i, "x", i2, "x");
        A0R2.append(d);
        A00(A0R2.toString());
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:268:0x011b, code lost:
        if (r2 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A02(X.C21030yg r13) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10A.A02(X.0yg):boolean");
    }

    public boolean A03(C21030yg c21030yg) {
        if (this.A04) {
            return this.A03;
        }
        Pair A01 = C10I.A01(c21030yg.A0K);
        return A01 != null && ((Number) A01.first).intValue() == 42;
    }

    public boolean A04(C21030yg c21030yg, C21030yg c21030yg2, boolean z) {
        if (this.A04) {
            if (c21030yg.A0P.equals(c21030yg2.A0P) && c21030yg.A0B == c21030yg2.A0B) {
                if (this.A03 || (c21030yg.A0F == c21030yg2.A0F && c21030yg.A08 == c21030yg2.A08)) {
                    return (!z && c21030yg2.A0J == null) || C08M.A08(c21030yg.A0J, c21030yg2.A0J);
                }
                return false;
            }
            return false;
        }
        if ("audio/mp4a-latm".equals(this.A01) && c21030yg.A0P.equals(c21030yg2.A0P) && c21030yg.A05 == c21030yg2.A05 && c21030yg.A0C == c21030yg2.A0C) {
            Pair A01 = C10I.A01(c21030yg.A0K);
            Pair A012 = C10I.A01(c21030yg2.A0K);
            if (A01 != null && A012 != null) {
                return ((Number) A01.first).intValue() == 42 && ((Number) A012.first).intValue() == 42;
            }
        }
        return false;
    }

    public String toString() {
        return this.A02;
    }
}
