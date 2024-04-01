package com.whatsapp;

import X.C2BY;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class EmojiPicker$EmojiWeight implements C2BY, Serializable {
    public static final long serialVersionUID = 1;
    public int code;
    public int[] emoji;
    public int modifier;
    public float weight;

    public EmojiPicker$EmojiWeight(int[] iArr, float f) {
        this.emoji = iArr;
        this.weight = f;
    }

    @Override // X.C2BY
    public boolean A6K(Object obj) {
        return Arrays.equals(this.emoji, (int[]) obj);
    }

    @Override // X.C2BY
    public Object AAN() {
        return this.emoji;
    }

    @Override // X.C2BY
    public float AE0() {
        return this.weight;
    }

    @Override // X.C2BY
    public void AUB(float f) {
        this.weight = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EmojiPicker$EmojiWeight.class != obj.getClass()) {
            return false;
        }
        EmojiPicker$EmojiWeight emojiPicker$EmojiWeight = (EmojiPicker$EmojiWeight) obj;
        return Float.compare(emojiPicker$EmojiWeight.weight, this.weight) == 0 && Arrays.equals(this.emoji, emojiPicker$EmojiWeight.emoji);
    }

    public int hashCode() {
        return Arrays.hashCode(this.emoji) + (Float.valueOf(this.weight).hashCode() * 31 * 31);
    }
}
