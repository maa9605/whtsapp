package androidx.preference;

import X.C006802z;
import X.C14460mz;
import X.C28821Ty;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.PreferenceGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public int A00;
    public int A01;
    public List A02;
    public boolean A03;
    public boolean A04;
    public final Handler A05;
    public final C006802z A06;
    public final Runnable A07;

    public boolean A0X() {
        return true;
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A06 = new C006802z();
        this.A05 = new Handler();
        this.A04 = true;
        this.A00 = 0;
        this.A03 = false;
        this.A01 = Integer.MAX_VALUE;
        this.A07 = new Runnable() { // from class: X.0mm
            {
                PreferenceGroup.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (this) {
                    PreferenceGroup.this.A06.clear();
                }
            }
        };
        this.A02 = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14460mz.A0i, i, i2);
        this.A04 = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1)) {
            int i3 = obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i3 != Integer.MAX_VALUE && !(!TextUtils.isEmpty(this.A0L))) {
                StringBuilder sb = new StringBuilder();
                sb.append(getClass().getSimpleName());
                sb.append(" should have a key defined if it contains an expandable preference");
                Log.e("PreferenceGroup", sb.toString());
            }
            this.A01 = i3;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public Parcelable A01() {
        return new C28821Ty(super.A01(), this.A01);
    }

    @Override // androidx.preference.Preference
    public void A07() {
        super.A07();
        this.A03 = true;
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((Preference) this.A02.get(i)).A07();
        }
    }

    @Override // androidx.preference.Preference
    public void A09() {
        A0A();
        this.A03 = false;
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((Preference) this.A02.get(i)).A09();
        }
    }

    @Override // androidx.preference.Preference
    public void A0B(Bundle bundle) {
        super.A0B(bundle);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((Preference) this.A02.get(i)).A0B(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public void A0C(Bundle bundle) {
        super.A0C(bundle);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((Preference) this.A02.get(i)).A0C(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public void A0D(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C28821Ty.class)) {
            super.A0D(parcelable);
            return;
        }
        C28821Ty c28821Ty = (C28821Ty) parcelable;
        this.A01 = c28821Ty.A00;
        super.A0D(c28821Ty.getSuperState());
    }

    @Override // androidx.preference.Preference
    public void A0M(boolean z) {
        super.A0M(z);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) this.A02.get(i);
            if (preference.A0W == z) {
                preference.A0W = !z;
                preference.A0M(preference.A0P());
                preference.A05();
            }
        }
    }

    public Preference A0T(CharSequence charSequence) {
        Preference A0T;
        if (charSequence != null) {
            if (TextUtils.equals(this.A0L, charSequence)) {
                return this;
            }
            int size = this.A02.size();
            for (int i = 0; i < size; i++) {
                Preference preference = (Preference) this.A02.get(i);
                if (TextUtils.equals(preference.A0L, charSequence)) {
                    return preference;
                }
                if ((preference instanceof PreferenceGroup) && (A0T = ((PreferenceGroup) preference).A0T(charSequence)) != null) {
                    return A0T;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("Key cannot be null");
    }

    public void A0U() {
        synchronized (this) {
            List list = this.A02;
            for (int size = list.size() - 1; size >= 0; size--) {
                A0W((Preference) list.get(0));
            }
        }
        A06();
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0V(androidx.preference.Preference r9) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.PreferenceGroup.A0V(androidx.preference.Preference):void");
    }

    public final void A0W(Preference preference) {
        synchronized (this) {
            preference.A0A();
            if (preference.A0E == this) {
                preference.A0E = null;
            }
            if (this.A02.remove(preference)) {
                String str = preference.A0L;
                if (str != null) {
                    this.A06.put(str, Long.valueOf(preference.A00()));
                    Handler handler = this.A05;
                    Runnable runnable = this.A07;
                    handler.removeCallbacks(runnable);
                    handler.post(runnable);
                }
                if (this.A03) {
                    preference.A09();
                }
            }
        }
    }
}
