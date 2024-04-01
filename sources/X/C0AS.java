package X;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.search.verification.client.R;
import java.lang.ref.Reference;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0AS  reason: invalid class name */
/* loaded from: classes.dex */
public class C0AS {
    public static final View.AccessibilityDelegate A02 = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate A00;
    public final View.AccessibilityDelegate A01;

    public C0AS() {
        this.A01 = A02;
        this.A00 = new C07140Wz(this);
    }

    public C0AS(View.AccessibilityDelegate accessibilityDelegate) {
        this.A01 = accessibilityDelegate;
        this.A00 = new C07140Wz(this);
    }

    public C08410bR A00(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.A01.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C08410bR(accessibilityNodeProvider);
        }
        return null;
    }

    public void A01(View view, int i) {
        this.A01.sendAccessibilityEvent(view, i);
    }

    public void A02(View view, AccessibilityEvent accessibilityEvent) {
        this.A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void A03(View view, AccessibilityEvent accessibilityEvent) {
        this.A01.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void A04(View view, C08420bS c08420bS) {
        this.A01.onInitializeAccessibilityNodeInfo(view, c08420bS.A02);
    }

    public boolean A05(View view, int i, Bundle bundle) {
        Reference reference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i2 = 0; i2 < list.size() && ((C08440bU) list.get(i2)).A00() != i; i2++) {
        }
        boolean performAccessibilityAction = this.A01.performAccessibilityAction(view, i, bundle);
        if (!performAccessibilityAction && i == R.id.accessibility_action_clickable_span) {
            int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray == null || (reference = (Reference) sparseArray.get(i3)) == null || (clickableSpan = (ClickableSpan) reference.get()) == null) {
                return false;
            }
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            if (text instanceof Spanned) {
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                if (clickableSpanArr != null) {
                    for (ClickableSpan clickableSpan2 : clickableSpanArr) {
                        if (clickableSpan.equals(clickableSpan2)) {
                            clickableSpan.onClick(view);
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return performAccessibilityAction;
    }
}
