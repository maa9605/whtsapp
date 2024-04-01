package X;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* renamed from: X.3Xi  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C71753Xi {
    public static final InterfaceC71743Xh A00;

    static {
        InterfaceC71743Xh interfaceC71743Xh;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            interfaceC71743Xh = new InterfaceC71743Xh() { // from class: X.3qV
                @Override // X.InterfaceC71743Xh
                public Layout A6q(CharSequence charSequence, TextPaint textPaint, TextView textView, int i2) {
                    return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i2).setAlignment(Layout.Alignment.ALIGN_CENTER).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setUseLineSpacingFromFallbacks(textView.isFallbackLineSpacing()).build();
                }
            };
        } else if (i >= 23) {
            interfaceC71743Xh = new InterfaceC71743Xh() { // from class: X.3qU
                @Override // X.InterfaceC71743Xh
                public Layout A6q(CharSequence charSequence, TextPaint textPaint, TextView textView, int i2) {
                    return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i2).setAlignment(Layout.Alignment.ALIGN_CENTER).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).build();
                }
            };
        } else {
            interfaceC71743Xh = new InterfaceC71743Xh() { // from class: X.3qW
                @Override // X.InterfaceC71743Xh
                public Layout A6q(CharSequence charSequence, TextPaint textPaint, TextView textView, int i2) {
                    return new StaticLayout(charSequence, textPaint, i2, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
                }
            };
        }
        A00 = interfaceC71743Xh;
    }
}
