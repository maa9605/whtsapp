package X;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0bS */
/* loaded from: classes.dex */
public class C08420bS {
    public static int A03;
    public int A00 = -1;
    public int A01 = -1;
    public final AccessibilityNodeInfo A02;

    public static String A00(int i) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                        return "ACTION_CLICK";
                    case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case C42271vT.A09 /* 131072 */:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    default:
                        switch (i) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    public C08420bS(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.A02 = accessibilityNodeInfo;
    }

    public Bundle A01() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.A02.getExtras();
        }
        return new Bundle();
    }

    public CharSequence A02() {
        if (!A04("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            List A04 = A04("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List A042 = A04("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List A043 = A04("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List A044 = A04("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
            SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
            for (int i = 0; i < A04.size(); i++) {
                spannableString.setSpan(new ClickableSpan(((Number) A044.get(i)).intValue(), this, A01().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")) { // from class: X.0kl
                    public final int A00;
                    public final int A01;
                    public final C08420bS A02;

                    {
                        this.A01 = r1;
                        this.A02 = this;
                        this.A00 = r3;
                    }

                    @Override // android.text.style.ClickableSpan
                    public void onClick(View view) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.A01);
                        C08420bS c08420bS = this.A02;
                        c08420bS.A02.performAction(this.A00, bundle);
                    }
                }, ((Number) A04.get(i)).intValue(), ((Number) A042.get(i)).intValue(), ((Number) A043.get(i)).intValue());
            }
            return spannableString;
        }
        return this.A02.getText();
    }

    public List A03() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList;
        if (Build.VERSION.SDK_INT >= 21 && (actionList = this.A02.getActionList()) != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new C08440bU(actionList.get(i), 0, null));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public final List A04(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public final void A05(int i, boolean z) {
        Bundle A01 = A01();
        if (A01 != null) {
            int i2 = A01.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ (-1));
            if (!z) {
                i = 0;
            }
            A01.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public void A06(C08440bU c08440bU) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.A02.addAction((AccessibilityNodeInfo.AccessibilityAction) c08440bU.A00);
        }
    }

    public void A07(C08440bU c08440bU) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.A02.removeAction((AccessibilityNodeInfo.AccessibilityAction) c08440bU.A00);
        }
    }

    public void A08(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.A02.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }

    public void A09(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.A02.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) ((C13230ko) obj).A00);
        }
    }

    public void A0A(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.A02.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((C13240kp) obj).A00);
        }
    }

    public void A0B(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.A02.setDismissable(z);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C08420bS)) {
            C08420bS c08420bS = (C08420bS) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
            if (accessibilityNodeInfo == null) {
                if (c08420bS.A02 != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(c08420bS.A02)) {
                return false;
            }
            return this.A01 == c08420bS.A01 && this.A00 == c08420bS.A00;
        }
        return false;
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public String toString() {
        String str;
        CharSequence charSequence;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        accessibilityNodeInfo.getBoundsInParent(rect);
        StringBuilder sb2 = new StringBuilder("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        accessibilityNodeInfo.getBoundsInScreen(rect);
        StringBuilder sb3 = new StringBuilder("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(A02());
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; viewId: ");
        if (Build.VERSION.SDK_INT >= 18) {
            str = accessibilityNodeInfo.getViewIdResourceName();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        sb.append(accessibilityNodeInfo.isChecked());
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        StringBuilder sb4 = new StringBuilder("; scrollable: ");
        sb4.append(accessibilityNodeInfo.isScrollable());
        sb.append(sb4.toString());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List A032 = A03();
            for (int i = 0; i < A032.size(); i++) {
                C08440bU c08440bU = (C08440bU) A032.get(i);
                String A00 = A00(c08440bU.A00());
                if (A00.equals("ACTION_UNKNOWN") && Build.VERSION.SDK_INT >= 21 && ((AccessibilityNodeInfo.AccessibilityAction) c08440bU.A00).getLabel() != null) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        charSequence = ((AccessibilityNodeInfo.AccessibilityAction) c08440bU.A00).getLabel();
                    } else {
                        charSequence = null;
                    }
                    A00 = charSequence.toString();
                }
                sb.append(A00);
                if (i != A032.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int actions = accessibilityNodeInfo.getActions();
            if (actions != 0) {
                while (true) {
                    int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
                    actions &= numberOfTrailingZeros ^ (-1);
                    sb.append(A00(numberOfTrailingZeros));
                    if (actions == 0) {
                        break;
                    }
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
