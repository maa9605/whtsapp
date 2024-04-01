package androidx.preference;

import X.C02160Ac;
import X.C07O;
import X.C08420bS;
import X.C13240kp;
import X.C1U3;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    @Override // androidx.preference.Preference
    public boolean A0O() {
        return false;
    }

    public PreferenceCategory(Context context) {
        this(context, null);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C07O.A04(context, R.attr.preferenceCategoryStyle, 16842892));
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.preference.Preference
    public void A0G(C08420bS c08420bS) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 28) {
            if (c08420bS == null) {
                throw null;
            }
            if (i5 >= 19 && (collectionItemInfo = c08420bS.A02.getCollectionItemInfo()) != null) {
                C13240kp c13240kp = new C13240kp(collectionItemInfo);
                if (Build.VERSION.SDK_INT >= 19) {
                    i = ((AccessibilityNodeInfo.CollectionItemInfo) c13240kp.A00).getRowIndex();
                } else {
                    i = 0;
                }
                if (Build.VERSION.SDK_INT >= 19) {
                    i2 = ((AccessibilityNodeInfo.CollectionItemInfo) c13240kp.A00).getRowSpan();
                } else {
                    i2 = 0;
                }
                if (Build.VERSION.SDK_INT >= 19) {
                    i3 = ((AccessibilityNodeInfo.CollectionItemInfo) c13240kp.A00).getColumnIndex();
                } else {
                    i3 = 0;
                }
                if (Build.VERSION.SDK_INT >= 19) {
                    i4 = ((AccessibilityNodeInfo.CollectionItemInfo) c13240kp.A00).getColumnSpan();
                } else {
                    i4 = 0;
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    z = ((AccessibilityNodeInfo.CollectionItemInfo) c13240kp.A00).isSelected();
                } else {
                    z = false;
                }
                c08420bS.A0A(C13240kp.A00(i, i2, i3, i4, true, z));
            }
        }
    }

    @Override // androidx.preference.Preference
    public boolean A0P() {
        return !super.A0O();
    }

    @Override // androidx.preference.Preference
    public void A0S(C1U3 c1u3) {
        TextView textView;
        super.A0S(c1u3);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            c1u3.A0H.setAccessibilityHeading(true);
        } else if (i >= 21) {
        } else {
            TypedValue typedValue = new TypedValue();
            if (((Preference) this).A05.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true) && (textView = (TextView) c1u3.A0C(16908310)) != null) {
                if (textView.getCurrentTextColor() != C02160Ac.A00(((Preference) this).A05, R.color.preference_fallback_accent_color)) {
                    return;
                }
                textView.setTextColor(typedValue.data);
            }
        }
    }
}
