package androidx.preference;

import X.C07O;
import X.C14460mz;
import X.C28781Tu;
import X.C28791Tv;
import X.InterfaceC14300mj;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public String A00;
    public String A01;
    public boolean A02;
    public CharSequence[] A03;
    public CharSequence[] A04;

    public ListPreference(Context context) {
        this(context, null);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C07O.A04(context, R.attr.dialogPreferenceStyle, 16842897));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14460mz.A0Y, i, i2);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.A03 = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.A04 = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            C28791Tv c28791Tv = C28791Tv.A00;
            if (c28791Tv == null) {
                c28791Tv = new C28791Tv();
                C28791Tv.A00 = c28791Tv;
            }
            this.A0D = c28791Tv;
            A05();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C14460mz.A0f, i, i2);
        String string = obtainStyledAttributes2.getString(33);
        this.A00 = string == null ? obtainStyledAttributes2.getString(7) : string;
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public Parcelable A01() {
        Parcelable A01 = super.A01();
        if (this.A0X) {
            return A01;
        }
        C28781Tu c28781Tu = new C28781Tu(A01);
        c28781Tu.A00 = this.A01;
        return c28781Tu;
    }

    @Override // androidx.preference.Preference
    public CharSequence A02() {
        InterfaceC14300mj interfaceC14300mj = this.A0D;
        if (interfaceC14300mj != null) {
            return interfaceC14300mj.AQv(this);
        }
        CharSequence A0U = A0U();
        CharSequence A02 = super.A02();
        String str = this.A00;
        if (str == null) {
            return A02;
        }
        Object[] objArr = new Object[1];
        if (A0U == null) {
            A0U = "";
        }
        objArr[0] = A0U;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, A02)) {
            return A02;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    @Override // androidx.preference.Preference
    public Object A03(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public void A0D(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C28781Tu.class)) {
            super.A0D(parcelable);
            return;
        }
        C28781Tu c28781Tu = (C28781Tu) parcelable;
        super.A0D(c28781Tu.getSuperState());
        A0V(c28781Tu.A00);
    }

    @Override // androidx.preference.Preference
    public void A0I(CharSequence charSequence) {
        super.A0I(charSequence);
        String str = this.A00;
        if (charSequence == null) {
            if (str != null) {
                this.A00 = null;
            }
        } else if (charSequence.equals(str)) {
        } else {
            this.A00 = charSequence.toString();
        }
    }

    @Override // androidx.preference.Preference
    public void A0K(Object obj) {
        A0V(A04((String) obj));
    }

    public int A0T(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.A04) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (this.A04[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence A0U() {
        CharSequence[] charSequenceArr;
        int A0T = A0T(this.A01);
        if (A0T < 0 || (charSequenceArr = this.A03) == null) {
            return null;
        }
        return charSequenceArr[A0T];
    }

    public void A0V(String str) {
        boolean z = !TextUtils.equals(this.A01, str);
        if (z || !this.A02) {
            this.A01 = str;
            this.A02 = true;
            A0L(str);
            if (z) {
                A05();
            }
        }
    }

    public void A0W(CharSequence[] charSequenceArr) {
        this.A03 = charSequenceArr;
    }
}
