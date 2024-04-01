package androidx.preference;

import X.C000200d;
import X.C07O;
import X.C0BA;
import X.C14460mz;
import X.InterfaceC09450e7;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public int A00;
    public Drawable A01;
    public CharSequence A02;
    public CharSequence A03;
    public CharSequence A04;
    public CharSequence A05;

    public DialogPreference(Context context) {
        this(context, null);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C07O.A04(context, R.attr.dialogPreferenceStyle, 16842897));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14460mz.A0M, i, i2);
        String string = obtainStyledAttributes.getString(9);
        string = string == null ? obtainStyledAttributes.getString(0) : string;
        this.A03 = string;
        if (string == null) {
            this.A03 = this.A0H;
        }
        String string2 = obtainStyledAttributes.getString(8);
        this.A02 = string2 == null ? obtainStyledAttributes.getString(1) : string2;
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.A01 = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = obtainStyledAttributes.getString(11);
        this.A05 = string3 == null ? obtainStyledAttributes.getString(3) : string3;
        String string4 = obtainStyledAttributes.getString(10);
        this.A04 = string4 == null ? obtainStyledAttributes.getString(4) : string4;
        this.A00 = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void A08() {
        DialogFragment multiSelectListPreferenceDialogFragmentCompat;
        InterfaceC09450e7 interfaceC09450e7 = this.A0F.A04;
        if (interfaceC09450e7 != null) {
            C0BA c0ba = (C0BA) interfaceC09450e7;
            if (c0ba.A0C().A0Q.A01("androidx.preference.PreferenceFragment.DIALOG") == null) {
                if (this instanceof EditTextPreference) {
                    String str = this.A0L;
                    multiSelectListPreferenceDialogFragmentCompat = new EditTextPreferenceDialogFragmentCompat();
                    Bundle bundle = new Bundle(1);
                    bundle.putString("key", str);
                    multiSelectListPreferenceDialogFragmentCompat.A0P(bundle);
                } else if (this instanceof ListPreference) {
                    String str2 = this.A0L;
                    multiSelectListPreferenceDialogFragmentCompat = new ListPreferenceDialogFragmentCompat();
                    Bundle bundle2 = new Bundle(1);
                    bundle2.putString("key", str2);
                    multiSelectListPreferenceDialogFragmentCompat.A0P(bundle2);
                } else if (this instanceof MultiSelectListPreference) {
                    String str3 = this.A0L;
                    multiSelectListPreferenceDialogFragmentCompat = new MultiSelectListPreferenceDialogFragmentCompat();
                    Bundle bundle3 = new Bundle(1);
                    bundle3.putString("key", str3);
                    multiSelectListPreferenceDialogFragmentCompat.A0P(bundle3);
                } else {
                    StringBuilder A0P = C000200d.A0P("Cannot display dialog for an unknown Preference type: ");
                    A0P.append(getClass().getSimpleName());
                    A0P.append(". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                    throw new IllegalArgumentException(A0P.toString());
                }
                multiSelectListPreferenceDialogFragmentCompat.A0S(c0ba, 0);
                multiSelectListPreferenceDialogFragmentCompat.A14(c0ba.A0C(), "androidx.preference.PreferenceFragment.DIALOG");
            }
        }
    }
}
