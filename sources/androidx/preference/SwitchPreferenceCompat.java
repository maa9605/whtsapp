package androidx.preference;

import X.C14460mz;
import X.C14510n4;
import X.C1U3;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public CharSequence A00;
    public CharSequence A01;
    public final C14510n4 A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0n4] */
    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle, 0);
        this.A02 = new CompoundButton.OnCheckedChangeListener() { // from class: X.0n4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SwitchPreferenceCompat switchPreferenceCompat = SwitchPreferenceCompat.this;
                if (!switchPreferenceCompat.A0R(Boolean.valueOf(z))) {
                    compoundButton.setChecked(!z);
                } else {
                    switchPreferenceCompat.A0U(z);
                }
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14460mz.A0u, R.attr.switchPreferenceCompatStyle, 0);
        String string = obtainStyledAttributes.getString(7);
        ((TwoStatePreference) this).A01 = string == null ? obtainStyledAttributes.getString(0) : string;
        if (((TwoStatePreference) this).A02) {
            A05();
        }
        String string2 = obtainStyledAttributes.getString(6);
        ((TwoStatePreference) this).A00 = string2 == null ? obtainStyledAttributes.getString(1) : string2;
        if (!((TwoStatePreference) this).A02) {
            A05();
        }
        String string3 = obtainStyledAttributes.getString(9);
        this.A01 = string3 == null ? obtainStyledAttributes.getString(3) : string3;
        A05();
        String string4 = obtainStyledAttributes.getString(8);
        this.A00 = string4 == null ? obtainStyledAttributes.getString(4) : string4;
        A05();
        ((TwoStatePreference) this).A04 = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void A0E(View view) {
        super.A0E(view);
        if (((AccessibilityManager) this.A05.getSystemService("accessibility")).isEnabled()) {
            A0V(view.findViewById(R.id.switchWidget));
            A0T(view.findViewById(16908304));
        }
    }

    @Override // androidx.preference.Preference
    public void A0S(C1U3 c1u3) {
        super.A0S(c1u3);
        A0V(c1u3.A0C(R.id.switchWidget));
        A0T(c1u3.A0C(16908304));
    }

    public final void A0V(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(((TwoStatePreference) this).A02);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.A01);
            switchCompat.setTextOff(this.A00);
            switchCompat.setOnCheckedChangeListener(this.A02);
        }
    }
}
