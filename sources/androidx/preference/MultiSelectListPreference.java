package androidx.preference;

import X.C28801Tw;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public Set A00;
    public CharSequence[] A01;
    public CharSequence[] A02;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r1 = 2130968851(0x7f040113, float:1.7546367E38)
            r0 = 16842897(0x1010091, float:2.3693964E-38)
            int r2 = X.C07O.A04(r4, r1, r0)
            r1 = 0
            r3.<init>(r4, r5, r2, r1)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.A00 = r0
            int[] r0 = X.C14460mz.A0c
            android.content.res.TypedArray r2 = r4.obtainStyledAttributes(r5, r0, r2, r1)
            r0 = 2
            java.lang.CharSequence[] r0 = r2.getTextArray(r0)
            if (r0 != 0) goto L26
            java.lang.CharSequence[] r0 = r2.getTextArray(r1)
        L26:
            r3.A01 = r0
            r0 = 3
            r1 = 1
            java.lang.CharSequence[] r0 = r2.getTextArray(r0)
            if (r0 != 0) goto L34
            java.lang.CharSequence[] r0 = r2.getTextArray(r1)
        L34:
            r3.A02 = r0
            r2.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public Parcelable A01() {
        Parcelable A01 = super.A01();
        if (this.A0X) {
            return A01;
        }
        C28801Tw c28801Tw = new C28801Tw(A01);
        c28801Tw.A00 = this.A00;
        return c28801Tw;
    }

    @Override // androidx.preference.Preference
    public Object A03(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public void A0D(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C28801Tw.class)) {
            super.A0D(parcelable);
            return;
        }
        C28801Tw c28801Tw = (C28801Tw) parcelable;
        super.A0D(c28801Tw.getSuperState());
        A0T(c28801Tw.A00);
    }

    @Override // androidx.preference.Preference
    public void A0K(Object obj) {
        Set<String> set = (Set) obj;
        if (A0Q()) {
            set = this.A0F.A03().getStringSet(this.A0L, set);
        }
        A0T(set);
    }

    public void A0T(Set set) {
        this.A00.clear();
        this.A00.addAll(set);
        if (A0Q()) {
            if (!set.equals(A0Q() ? this.A0F.A03().getStringSet(this.A0L, null) : null)) {
                SharedPreferences.Editor A02 = this.A0F.A02();
                A02.putStringSet(this.A0L, set);
                if (!this.A0F.A09) {
                    A02.apply();
                }
            }
        }
        A05();
    }
}
