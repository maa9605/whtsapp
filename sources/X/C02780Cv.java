package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.List;

/* renamed from: X.0Cv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C02780Cv extends AbstractC02790Cw {
    public final Rect A00;
    public final TextView A01;
    public final C02E A02;

    public C02780Cv(C02E c02e, TextView textView) {
        super(textView);
        this.A00 = new Rect();
        this.A02 = c02e;
        this.A01 = textView;
    }

    @Override // X.AbstractC02790Cw
    public int A06(float f, float f2) {
        TextView textView = this.A01;
        CharSequence text = textView.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            int offsetForPosition = textView.getOffsetForPosition(f, f2);
            InterfaceC02760Ct[] interfaceC02760CtArr = (InterfaceC02760Ct[]) spanned.getSpans(offsetForPosition, offsetForPosition, InterfaceC02760Ct.class);
            return interfaceC02760CtArr.length == 1 ? spanned.getSpanStart(interfaceC02760CtArr[0]) : EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    }

    @Override // X.AbstractC02790Cw
    public void A0A(int i, C08420bS c08420bS) {
        AccessibilityNodeInfo accessibilityNodeInfo;
        InterfaceC02760Ct A0J = A0J(i);
        if (A0J != null) {
            CharSequence text = this.A01.getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                text = spanned.subSequence(spanned.getSpanStart(A0J), spanned.getSpanEnd(A0J));
            }
            accessibilityNodeInfo = c08420bS.A02;
            accessibilityNodeInfo.setContentDescription(text);
        } else {
            StringBuilder sb = new StringBuilder("TouchableSpan is null for offset: ");
            sb.append(i);
            Log.e("LinkAccessibilityHelper", sb.toString());
            CharSequence text2 = this.A01.getText();
            accessibilityNodeInfo = c08420bS.A02;
            accessibilityNodeInfo.setContentDescription(text2);
        }
        accessibilityNodeInfo.setFocusable(true);
        accessibilityNodeInfo.setClickable(true);
        Rect rect = this.A00;
        A0K(A0J, rect);
        if (!rect.isEmpty()) {
            A0K(A0J, rect);
            accessibilityNodeInfo.setBoundsInParent(rect);
        } else {
            StringBuilder sb2 = new StringBuilder("LinkSpan bounds is empty for: ");
            sb2.append(i);
            Log.e("LinkAccessibilityHelper", sb2.toString());
            rect.set(0, 0, 1, 1);
            accessibilityNodeInfo.setBoundsInParent(rect);
        }
        accessibilityNodeInfo.addAction(16);
    }

    @Override // X.AbstractC02790Cw
    public void A0C(List list) {
        if (this.A02.A0H.A00.getPackageManager().hasSystemFeature("android.hardware.type.featurephone")) {
            return;
        }
        CharSequence text = this.A01.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            for (InterfaceC02760Ct interfaceC02760Ct : (InterfaceC02760Ct[]) spanned.getSpans(0, spanned.length(), InterfaceC02760Ct.class)) {
                list.add(Integer.valueOf(spanned.getSpanStart(interfaceC02760Ct)));
            }
        }
    }

    @Override // X.AbstractC02790Cw
    public boolean A0F(int i, int i2, Bundle bundle) {
        if (i2 == 16) {
            InterfaceC02760Ct A0J = A0J(i);
            if (A0J != null) {
                A0J.onClick(this.A01);
                return true;
            }
            StringBuilder sb = new StringBuilder("LinkSpan is null for offset: ");
            sb.append(i);
            Log.e("LinkAccessibilityHelper", sb.toString());
            return false;
        }
        return false;
    }

    public final InterfaceC02760Ct A0J(int i) {
        CharSequence text = this.A01.getText();
        if (text instanceof Spanned) {
            InterfaceC02760Ct[] interfaceC02760CtArr = (InterfaceC02760Ct[]) ((Spanned) text).getSpans(i, i, InterfaceC02760Ct.class);
            if (interfaceC02760CtArr.length == 1) {
                return interfaceC02760CtArr[0];
            }
            return null;
        }
        return null;
    }

    public final void A0K(InterfaceC02760Ct interfaceC02760Ct, Rect rect) {
        Layout layout;
        TextView textView = this.A01;
        CharSequence text = textView.getText();
        rect.setEmpty();
        if (!(text instanceof Spanned) || (layout = textView.getLayout()) == null) {
            return;
        }
        Spanned spanned = (Spanned) text;
        int spanStart = spanned.getSpanStart(interfaceC02760Ct);
        int spanEnd = spanned.getSpanEnd(interfaceC02760Ct);
        int lineForOffset = layout.getLineForOffset(spanStart);
        int lineForOffset2 = layout.getLineForOffset(spanEnd);
        layout.getLineBounds(lineForOffset, rect);
        if (lineForOffset2 == lineForOffset) {
            rect.left = (int) layout.getPrimaryHorizontal(spanStart);
            rect.right = (int) layout.getPrimaryHorizontal(spanEnd);
        } else {
            Rect rect2 = new Rect();
            while (true) {
                lineForOffset++;
                if (lineForOffset > lineForOffset2) {
                    break;
                }
                layout.getLineBounds(lineForOffset, rect2);
                rect.union(rect2);
            }
        }
        rect.offset(textView.getTotalPaddingLeft(), textView.getTotalPaddingTop());
    }
}
