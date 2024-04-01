package androidx.media;

import X.AbstractC16340qF;
import X.C1VA;
import android.media.AudioAttributes;

/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC16340qF abstractC16340qF) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.A01 = (AudioAttributes) abstractC16340qF.A01(audioAttributesImplApi21.A01, 1);
        audioAttributesImplApi21.A00 = abstractC16340qF.A00(audioAttributesImplApi21.A00, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC16340qF abstractC16340qF) {
        if (abstractC16340qF != null) {
            AudioAttributes audioAttributes = audioAttributesImplApi21.A01;
            abstractC16340qF.A06(1);
            ((C1VA) abstractC16340qF).A05.writeParcelable(audioAttributes, 0);
            abstractC16340qF.A07(audioAttributesImplApi21.A00, 2);
            return;
        }
        throw null;
    }
}
