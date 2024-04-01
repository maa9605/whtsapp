package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.whatsapp.emoji.EmojiPopupFooter;

/* renamed from: X.2us  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60682us extends Animation {
    public final int A00;
    public final int A01;
    public final /* synthetic */ C48362Ey A02;

    public C60682us(C48362Ey c48362Ey, int i) {
        this.A02 = c48362Ey;
        this.A00 = i;
        EmojiPopupFooter emojiPopupFooter = c48362Ey.A08;
        int i2 = emojiPopupFooter.A00;
        this.A01 = i2;
        setDuration((Math.abs(i2 - i) * 300) / emojiPopupFooter.getHeight());
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        EmojiPopupFooter emojiPopupFooter = this.A02.A08;
        int i = this.A01;
        emojiPopupFooter.setTopOffset((int) (((this.A00 - i) * f) + i));
    }
}
