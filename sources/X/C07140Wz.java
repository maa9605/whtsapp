package X;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.search.verification.client.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Wz */
/* loaded from: classes.dex */
public final class C07140Wz extends View.AccessibilityDelegate {
    public final C0AS A00;

    public C07140Wz(C0AS c0as) {
        this.A00 = c0as;
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.A00.A01.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C08410bR A00 = this.A00.A00(view);
        if (A00 != null) {
            return (AccessibilityNodeProvider) A00.A00;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.A00.A02(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        int length;
        int i;
        C08420bS c08420bS = new C08420bS(accessibilityNodeInfo);
        Boolean bool = (Boolean) new AbstractC07120Wx() { // from class: X.0bT
            @Override // X.AbstractC07120Wx
            public Object A01(View view2) {
                return Boolean.valueOf(view2.isScreenReaderFocusable());
            }

            @Override // X.AbstractC07120Wx
            public void A02(View view2, Object obj) {
                view2.setScreenReaderFocusable(((Boolean) obj).booleanValue());
            }

            @Override // X.AbstractC07120Wx
            public boolean A03(Object obj, Object obj2) {
                Boolean bool2 = (Boolean) obj;
                Boolean bool3 = (Boolean) obj2;
                return !((bool2 == null ? false : bool2.booleanValue()) == (bool3 == null ? false : bool3.booleanValue()));
            }
        }.A00(view);
        boolean booleanValue = bool == null ? false : bool.booleanValue();
        if (Build.VERSION.SDK_INT >= 28) {
            c08420bS.A02.setScreenReaderFocusable(booleanValue);
        } else {
            c08420bS.A05(1, booleanValue);
        }
        Boolean bool2 = (Boolean) new C07130Wy().A00(view);
        boolean booleanValue2 = bool2 == null ? false : bool2.booleanValue();
        if (Build.VERSION.SDK_INT >= 28) {
            c08420bS.A02.setHeading(booleanValue2);
        } else {
            c08420bS.A05(2, booleanValue2);
        }
        CharSequence charSequence = (CharSequence) new C0Ww().A00(view);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            c08420bS.A02.setPaneTitle(charSequence);
        } else if (i2 >= 19) {
            c08420bS.A02.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
        this.A00.A04(view, c08420bS);
        CharSequence text = accessibilityNodeInfo.getText();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 19 && i3 < 26) {
            if (i3 >= 19) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = c08420bS.A02;
                accessibilityNodeInfo2.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo2.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo2.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo2.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            }
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    if (((Reference) sparseArray.valueAt(i4)).get() == null) {
                        arrayList.add(Integer.valueOf(i4));
                    }
                }
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    sparseArray.remove(((Number) arrayList.get(i5)).intValue());
                }
            }
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, text.length(), ClickableSpan.class);
                if (clickableSpanArr != null && (length = clickableSpanArr.length) > 0) {
                    c08420bS.A01().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    for (int i6 = 0; i6 < length; i6++) {
                        ClickableSpan clickableSpan = clickableSpanArr[i6];
                        int i7 = 0;
                        while (true) {
                            if (i7 < sparseArray2.size()) {
                                if (clickableSpan.equals(((Reference) sparseArray2.valueAt(i7)).get())) {
                                    i = sparseArray2.keyAt(i7);
                                    break;
                                }
                                i7++;
                            } else {
                                i = C08420bS.A03;
                                C08420bS.A03 = i + 1;
                                break;
                            }
                        }
                        sparseArray2.put(i, new WeakReference(clickableSpanArr[i6]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i6];
                        c08420bS.A04("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        c08420bS.A04("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        c08420bS.A04("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        c08420bS.A04("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                    }
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            c08420bS.A06((C08440bU) list.get(i8));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.A00.A03(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.A00.A01.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.A00.A05(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEvent(View view, int i) {
        this.A00.A01(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.A00.A01.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
