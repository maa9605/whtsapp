package androidx.preference;

import X.C1U6;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public CharSequence A00;
    public CharSequence A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public TwoStatePreference(Context context) {
        this(context, null);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.preference.Preference
    public Parcelable A01() {
        Parcelable A01 = super.A01();
        if (this.A0X) {
            return A01;
        }
        C1U6 c1u6 = new C1U6(A01);
        c1u6.A00 = this.A02;
        return c1u6;
    }

    @Override // androidx.preference.Preference
    public Object A03(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    public void A08() {
        boolean z = !this.A02;
        if (A0R(Boolean.valueOf(z))) {
            A0U(z);
        }
    }

    @Override // androidx.preference.Preference
    public void A0D(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C1U6.class)) {
            super.A0D(parcelable);
            return;
        }
        C1U6 c1u6 = (C1U6) parcelable;
        super.A0D(c1u6.getSuperState());
        A0U(c1u6.A00);
    }

    @Override // androidx.preference.Preference
    public void A0K(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (A0Q()) {
            booleanValue = this.A0F.A03().getBoolean(this.A0L, booleanValue);
        }
        A0U(booleanValue);
    }

    @Override // androidx.preference.Preference
    public boolean A0P() {
        if (this.A04) {
            if (this.A02) {
                return true;
            }
        } else if (!this.A02) {
            return true;
        }
        return super.A0P();
    }

    public void A0T(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            int i = 0;
            if (this.A02 && !TextUtils.isEmpty(this.A01)) {
                textView.setText(this.A01);
            } else if (!this.A02 && !TextUtils.isEmpty(this.A00)) {
                textView.setText(this.A00);
            } else {
                CharSequence A02 = A02();
                if (TextUtils.isEmpty(A02)) {
                    i = 8;
                } else {
                    textView.setText(A02);
                }
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    public void A0U(boolean z) {
        boolean z2 = true;
        if (this.A02 == z) {
            z2 = false;
            if (this.A03) {
                return;
            }
        }
        this.A02 = z;
        this.A03 = true;
        if (A0Q()) {
            boolean z3 = !z;
            if (A0Q()) {
                z3 = this.A0F.A03().getBoolean(this.A0L, z3);
            }
            if (z != z3) {
                SharedPreferences.Editor A02 = this.A0F.A02();
                A02.putBoolean(this.A0L, z);
                if (!this.A0F.A09) {
                    A02.apply();
                }
            }
        }
        if (z2) {
            A0M(A0P());
            A05();
        }
    }
}
