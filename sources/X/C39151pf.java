package X;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.rendercore.text.RCTextView;
import java.util.List;

/* renamed from: X.1pf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C39151pf extends AbstractC02790Cw {
    public C0AS A00;
    public final /* synthetic */ RCTextView A01;

    @Override // X.AbstractC02790Cw
    public boolean A0F(int i, int i2, Bundle bundle) {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39151pf(RCTextView rCTextView) {
        super(rCTextView);
        this.A01 = rCTextView;
        rCTextView.setFocusable(false);
        rCTextView.setImportantForAccessibility(1);
    }

    @Override // X.C0AS
    public void A03(View view, AccessibilityEvent accessibilityEvent) {
        ((C0AS) this).A01.onPopulateAccessibilityEvent(view, accessibilityEvent);
        RCTextView rCTextView = this.A01;
        if (TextUtils.isEmpty(rCTextView.A09)) {
            return;
        }
        accessibilityEvent.getText().add(RCTextView.getTextForAccessibility(rCTextView));
    }

    @Override // X.AbstractC02790Cw, X.C0AS
    public void A04(View view, C08420bS c08420bS) {
        View.AccessibilityDelegate accessibilityDelegate = ((C0AS) this).A01;
        AccessibilityNodeInfo accessibilityNodeInfo = c08420bS.A02;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        CharSequence textForAccessibility = RCTextView.getTextForAccessibility((RCTextView) view);
        if (!TextUtils.isEmpty(textForAccessibility)) {
            accessibilityNodeInfo.setText(textForAccessibility);
            accessibilityNodeInfo.addAction(256);
            accessibilityNodeInfo.addAction(512);
            accessibilityNodeInfo.setMovementGranularities(31);
            accessibilityNodeInfo.addAction(C42271vT.A09);
        }
        C0AS c0as = this.A00;
        if (c0as != null) {
            c0as.A04(view, c08420bS);
        }
    }

    @Override // X.AbstractC02790Cw
    public int A06(float f, float f2) {
        RCTextView rCTextView = this.A01;
        CharSequence charSequence = rCTextView.A09;
        if (!(charSequence instanceof Spanned)) {
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        Spanned spanned = (Spanned) charSequence;
        int i = 0;
        while (true) {
            ClickableSpan[] clickableSpanArr = rCTextView.A0B;
            if (i >= clickableSpanArr.length) {
                return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            }
            ClickableSpan clickableSpan = clickableSpanArr[i];
            int spanStart = spanned.getSpanStart(clickableSpan);
            int spanEnd = spanned.getSpanEnd(clickableSpan);
            int A00 = rCTextView.A00((int) f, (int) f2);
            if (A00 >= spanStart && A00 <= spanEnd) {
                return i;
            }
            i++;
        }
    }

    @Override // X.AbstractC02790Cw
    public void A0A(int i, C08420bS c08420bS) {
        RCTextView rCTextView = this.A01;
        Spanned spanned = (Spanned) rCTextView.A09;
        ClickableSpan clickableSpan = rCTextView.A0B[i];
        int spanStart = spanned.getSpanStart(clickableSpan);
        int spanEnd = spanned.getSpanEnd(clickableSpan);
        int lineForOffset = rCTextView.A08.getLineForOffset(spanStart);
        int lineForOffset2 = rCTextView.A08.getLineForOffset(spanEnd);
        Path path = new Path();
        Rect rect = new Rect();
        RectF rectF = new RectF();
        rCTextView.A08.getSelectionPath(spanStart, lineForOffset == lineForOffset2 ? spanEnd : rCTextView.A08.getLineVisibleEnd(lineForOffset), path);
        path.computeBounds(rectF, true);
        rectF.round(rect);
        AccessibilityNodeInfo accessibilityNodeInfo = c08420bS.A02;
        accessibilityNodeInfo.setBoundsInParent(rect);
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setFocusable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setVisibleToUser(true);
        accessibilityNodeInfo.setText(spanned.subSequence(spanStart, spanEnd));
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override // X.AbstractC02790Cw
    public void A0C(List list) {
        ClickableSpan[] clickableSpanArr = this.A01.A0B;
        if (clickableSpanArr != null) {
            int length = clickableSpanArr.length;
            for (int i = 0; i < length; i++) {
                list.add(Integer.valueOf(i));
            }
        }
    }
}
