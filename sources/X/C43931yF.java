package X;

import com.whatsapp.emoji.EmojiDescriptor;

/* renamed from: X.1yF  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43931yF extends AbstractC43921yD {
    public int A00;
    public final int A01;
    public final CharSequence A02;

    public C43931yF(CharSequence charSequence) {
        this.A02 = charSequence;
        this.A01 = charSequence.length();
    }

    public int A01(int i) {
        this.A00 = i;
        return A02(i, EmojiDescriptor.getDescriptor(this));
    }

    public int A02(int i, int i2) {
        if (i2 != -1) {
            return A03(i, i2);
        }
        return Character.charCount(Character.codePointAt(this.A02, i));
    }

    public int A03(int i, int i2) {
        int codePointAt;
        int i3 = (i2 >> 12) & 7;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int codePointAt2 = Character.codePointAt(this.A02, i + i5);
            i5 += Character.charCount(codePointAt2);
            if (codePointAt2 == 65039) {
                i4--;
            }
            i4++;
        }
        int i6 = i + i5;
        return (i6 >= this.A01 || (codePointAt = Character.codePointAt(this.A02, i6)) != 65039) ? i5 : i5 + Character.charCount(codePointAt);
    }
}
