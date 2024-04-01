package androidx.preference;

import X.C28761Tr;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r1 = 2130968881(0x7f040131, float:1.7546428E38)
            r0 = 16842898(0x1010092, float:2.3693967E-38)
            int r1 = X.C07O.A04(r4, r1, r0)
            r2 = 0
            r3.<init>(r4, r5, r1, r2)
            int[] r0 = X.C14460mz.A0O
            android.content.res.TypedArray r1 = r4.obtainStyledAttributes(r5, r0, r1, r2)
            boolean r0 = r1.getBoolean(r2, r2)
            boolean r0 = r1.getBoolean(r2, r0)
            if (r0 == 0) goto L2e
            X.1Ts r0 = X.C28771Ts.A00
            if (r0 != 0) goto L29
            X.1Ts r0 = new X.1Ts
            r0.<init>()
            X.C28771Ts.A00 = r0
        L29:
            r3.A0D = r0
            r3.A05()
        L2e:
            r1.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public Parcelable A01() {
        Parcelable A01 = super.A01();
        if (this.A0X) {
            return A01;
        }
        C28761Tr c28761Tr = new C28761Tr(A01);
        c28761Tr.A00 = this.A00;
        return c28761Tr;
    }

    @Override // androidx.preference.Preference
    public Object A03(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public void A0D(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C28761Tr.class)) {
            super.A0D(parcelable);
            return;
        }
        C28761Tr c28761Tr = (C28761Tr) parcelable;
        super.A0D(c28761Tr.getSuperState());
        A0T(c28761Tr.A00);
    }

    @Override // androidx.preference.Preference
    public void A0K(Object obj) {
        A0T(A04((String) obj));
    }

    @Override // androidx.preference.Preference
    public boolean A0P() {
        return TextUtils.isEmpty(this.A00) || super.A0P();
    }

    public void A0T(String str) {
        boolean A0P = A0P();
        this.A00 = str;
        A0L(str);
        boolean A0P2 = A0P();
        if (A0P2 != A0P) {
            A0M(A0P2);
        }
        A05();
    }
}
