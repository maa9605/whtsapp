package X;

import android.graphics.Bitmap;

/* renamed from: X.0vS  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19450vS {
    public final int A00;
    public final int A01 = 100;
    public final Bitmap.Config A02;
    public final boolean A03;

    public C19450vS(C19460vT c19460vT) {
        this.A00 = c19460vT.A00;
        this.A03 = c19460vT.A03;
        this.A02 = c19460vT.A02;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19450vS.class != obj.getClass()) {
            return false;
        }
        C19450vS c19450vS = (C19450vS) obj;
        return this.A00 == c19450vS.A00 && this.A03 == c19450vS.A03 && this.A02 == c19450vS.A02;
    }

    public int hashCode() {
        return ((((((this.A02.ordinal() + ((((((((((3100 + this.A00) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + (this.A03 ? 1 : 0)) * 31)) * 31) + 0) * 31) + 0) * 31) + 0;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("ImageDecodeOptions{");
        C18940ua c18940ua = new C18940ua("ImageDecodeOptions");
        c18940ua.A00("minDecodeIntervalMs", String.valueOf(100));
        c18940ua.A00("maxDimensionPx", String.valueOf(this.A00));
        String valueOf = String.valueOf(false);
        c18940ua.A00("decodePreviewFrame", valueOf);
        c18940ua.A00("useLastFrameForPreview", valueOf);
        c18940ua.A00("decodeAllFrames", valueOf);
        c18940ua.A00("forceStaticImage", String.valueOf(this.A03));
        c18940ua.A00("bitmapConfigName", this.A02.name());
        c18940ua.A00("customImageDecoder", null);
        c18940ua.A00("bitmapTransformation", null);
        c18940ua.A00("colorSpace", null);
        A0P.append(c18940ua.toString());
        A0P.append("}");
        return A0P.toString();
    }
}
