package X;

/* renamed from: X.10B  reason: invalid class name */
/* loaded from: classes.dex */
public class C10B extends Exception {
    public final String decoderName;
    public final String diagnosticInfo;
    public final C10B fallbackDecoderInitializationException;
    public final String mimeType;
    public final boolean secureDecoderRequired;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C10B(X.C21030yg r10, java.lang.Throwable r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "Decoder init failed: ["
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r12)
            java.lang.String r0 = "], "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r2 = r1.toString()
            java.lang.String r4 = r10.A0P
            java.lang.String r1 = "neg_"
            java.lang.String r0 = "com.google.android.exoplayer.MediaCodecTrackRenderer_"
            java.lang.StringBuilder r1 = X.C000200d.A0V(r0, r1)
            int r0 = java.lang.Math.abs(r12)
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            r6 = 0
            r5 = 0
            r1 = r9
            r3 = r11
            r8 = r6
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10B.<init>(X.0yg, java.lang.Throwable, int):void");
    }

    public C10B(String str, Throwable th, String str2, boolean z, String str3, String str4, C10B c10b) {
        super(str, th);
        this.mimeType = str2;
        this.secureDecoderRequired = z;
        this.decoderName = str3;
        this.diagnosticInfo = str4;
        this.fallbackDecoderInitializationException = c10b;
    }
}
