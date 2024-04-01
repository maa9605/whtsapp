package androidx.preference;

import X.C07O;
import X.C14160mV;
import X.C14460mz;
import X.C1U3;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final C14160mV A00;

    public CheckBoxPreference(Context context) {
        this(context, null);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C07O.A04(context, R.attr.checkBoxPreferenceStyle, 16842895));
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0mV] */
    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A00 = new CompoundButton.OnCheckedChangeListener() { // from class: X.0mV
            {
                CheckBoxPreference.this = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CheckBoxPreference checkBoxPreference = CheckBoxPreference.this;
                if (!checkBoxPreference.A0R(Boolean.valueOf(z))) {
                    compoundButton.setChecked(!z);
                } else {
                    checkBoxPreference.A0U(z);
                }
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14460mz.A0H, i, i2);
        String string = obtainStyledAttributes.getString(5);
        ((TwoStatePreference) this).A01 = string == null ? obtainStyledAttributes.getString(0) : string;
        if (((TwoStatePreference) this).A02) {
            A05();
        }
        String string2 = obtainStyledAttributes.getString(4);
        ((TwoStatePreference) this).A00 = string2 == null ? obtainStyledAttributes.getString(1) : string2;
        if (!((TwoStatePreference) this).A02) {
            A05();
        }
        ((TwoStatePreference) this).A04 = obtainStyledAttributes.getBoolean(3, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void A0E(View view) {
        super.A0E(view);
        if (((AccessibilityManager) this.A05.getSystemService("accessibility")).isEnabled()) {
            A0V(view.findViewById(16908289));
            A0T(view.findViewById(16908304));
        }
    }

    @Override // androidx.preference.Preference
    public void A0S(C1U3 c1u3) {
        super.A0S(c1u3);
        A0V(c1u3.A0C(16908289));
        A0T(c1u3.A0C(16908304));
    }

    public final void A0V(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(((TwoStatePreference) this).A02);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.A00);
        }
    }
}
