package androidx.media;

import X.AbstractC16340qF;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC16340qF abstractC16340qF) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.A03 = abstractC16340qF.A00(audioAttributesImplBase.A03, 1);
        audioAttributesImplBase.A00 = abstractC16340qF.A00(audioAttributesImplBase.A00, 2);
        audioAttributesImplBase.A01 = abstractC16340qF.A00(audioAttributesImplBase.A01, 3);
        audioAttributesImplBase.A02 = abstractC16340qF.A00(audioAttributesImplBase.A02, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC16340qF abstractC16340qF) {
        if (abstractC16340qF != null) {
            abstractC16340qF.A07(audioAttributesImplBase.A03, 1);
            abstractC16340qF.A07(audioAttributesImplBase.A00, 2);
            abstractC16340qF.A07(audioAttributesImplBase.A01, 3);
            abstractC16340qF.A07(audioAttributesImplBase.A02, 4);
            return;
        }
        throw null;
    }
}
