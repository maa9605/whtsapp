package androidx.media;

import X.AbstractC16340qF;
import X.C0M5;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC16340qF abstractC16340qF) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        C0M5 c0m5 = audioAttributesCompat.A00;
        if (abstractC16340qF.A09(1)) {
            c0m5 = abstractC16340qF.A03();
        }
        audioAttributesCompat.A00 = (AudioAttributesImpl) c0m5;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC16340qF abstractC16340qF) {
        if (abstractC16340qF != null) {
            AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.A00;
            abstractC16340qF.A06(1);
            abstractC16340qF.A08(audioAttributesImpl);
            return;
        }
        throw null;
    }
}
