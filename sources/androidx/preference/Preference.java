package androidx.preference;

import X.AbstractC04890Mh;
import X.C000200d;
import X.C07O;
import X.C08420bS;
import X.C0PA;
import X.C14460mz;
import X.C1U1;
import X.InterfaceC09440e6;
import X.InterfaceC14260mf;
import X.InterfaceC14270mg;
import X.InterfaceC14280mh;
import X.InterfaceC14300mj;
import X.MenuItem$OnMenuItemClickListenerC14290mi;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Preference implements Comparable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public Context A05;
    public Intent A06;
    public Drawable A07;
    public Bundle A08;
    public InterfaceC14260mf A09;
    public InterfaceC14270mg A0A;
    public InterfaceC14280mh A0B;
    public MenuItem$OnMenuItemClickListenerC14290mi A0C;
    public InterfaceC14300mj A0D;
    public PreferenceGroup A0E;
    public C0PA A0F;
    public CharSequence A0G;
    public CharSequence A0H;
    public Object A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public List A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public final View.OnClickListener A0d;

    public Object A03(TypedArray typedArray, int i) {
        return null;
    }

    public void A08() {
    }

    public void A0G(C08420bS c08420bS) {
    }

    public void A0K(Object obj) {
    }

    public Preference(Context context) {
        this(context, null);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C07O.A04(context, R.attr.preferenceStyle, 16842894));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.A02 = Integer.MAX_VALUE;
        this.A0S = true;
        this.A0Z = true;
        this.A0X = true;
        this.A0R = true;
        this.A0W = true;
        this.A0c = true;
        this.A0N = true;
        this.A0O = true;
        this.A0b = true;
        this.A0a = true;
        this.A01 = R.layout.preference;
        this.A0d = new View.OnClickListener() { // from class: X.0mc
            {
                Preference.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Preference.this.A0E(view);
            }
        };
        this.A05 = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14460mz.A0f, i, i2);
        this.A00 = obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        String string = obtainStyledAttributes.getString(26);
        this.A0L = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.A0H = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.A0G = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.A02 = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = obtainStyledAttributes.getString(22);
        this.A0K = string2 == null ? obtainStyledAttributes.getString(13) : string2;
        this.A01 = obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.A03 = obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        this.A0S = obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        this.A0Z = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        this.A0X = obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        String string3 = obtainStyledAttributes.getString(19);
        this.A0J = string3 == null ? obtainStyledAttributes.getString(10) : string3;
        this.A0N = obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, this.A0Z));
        this.A0O = obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, this.A0Z));
        if (obtainStyledAttributes.hasValue(18)) {
            this.A0I = A03(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.A0I = A03(obtainStyledAttributes, 11);
        }
        this.A0a = obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.A0U = hasValue;
        if (hasValue) {
            this.A0b = obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        this.A0V = obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        this.A0c = obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        this.A0Q = obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    public long A00() {
        return this.A04;
    }

    public Parcelable A01() {
        this.A0P = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public CharSequence A02() {
        InterfaceC14300mj interfaceC14300mj = this.A0D;
        if (interfaceC14300mj != null) {
            return interfaceC14300mj.AQv(this);
        }
        return this.A0G;
    }

    public String A04(String str) {
        return !A0Q() ? str : this.A0F.A03().getString(this.A0L, str);
    }

    public void A05() {
        InterfaceC14260mf interfaceC14260mf = this.A09;
        if (interfaceC14260mf != null) {
            C1U1 c1u1 = (C1U1) interfaceC14260mf;
            int indexOf = c1u1.A05.indexOf(this);
            if (indexOf != -1) {
                ((AbstractC04890Mh) c1u1).A01.A04(indexOf, 1, this);
            }
        }
    }

    public void A06() {
        InterfaceC14260mf interfaceC14260mf = this.A09;
        if (interfaceC14260mf != null) {
            C1U1 c1u1 = (C1U1) interfaceC14260mf;
            c1u1.A00.removeCallbacks(c1u1.A02);
            c1u1.A00.post(c1u1.A02);
        }
    }

    public void A07() {
        PreferenceScreen preferenceScreen;
        Preference A0T;
        if (!TextUtils.isEmpty(this.A0J)) {
            String str = this.A0J;
            C0PA c0pa = this.A0F;
            if (c0pa != null && (preferenceScreen = c0pa.A07) != null && (A0T = preferenceScreen.A0T(str)) != null) {
                List list = A0T.A0M;
                if (list == null) {
                    list = new ArrayList();
                    A0T.A0M = list;
                }
                list.add(this);
                boolean A0P = A0T.A0P();
                if (this.A0R == A0P) {
                    this.A0R = !A0P;
                    A0M(A0P());
                    A05();
                    return;
                }
                return;
            }
            StringBuilder A0P2 = C000200d.A0P("Dependency \"");
            A0P2.append(this.A0J);
            A0P2.append("\" not found for preference \"");
            A0P2.append(this.A0L);
            A0P2.append("\" (title: \"");
            A0P2.append((Object) this.A0H);
            A0P2.append("\"");
            throw new IllegalStateException(A0P2.toString());
        }
    }

    public void A09() {
        A0A();
    }

    public final void A0A() {
        C0PA c0pa;
        PreferenceScreen preferenceScreen;
        Preference A0T;
        List list;
        String str = this.A0J;
        if (str == null || (c0pa = this.A0F) == null || (preferenceScreen = c0pa.A07) == null || (A0T = preferenceScreen.A0T(str)) == null || (list = A0T.A0M) == null) {
            return;
        }
        list.remove(this);
    }

    public void A0B(Bundle bundle) {
        Parcelable parcelable;
        if (!(!TextUtils.isEmpty(this.A0L)) || (parcelable = bundle.getParcelable(this.A0L)) == null) {
            return;
        }
        this.A0P = false;
        A0D(parcelable);
        if (!this.A0P) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void A0C(Bundle bundle) {
        if (!TextUtils.isEmpty(this.A0L)) {
            this.A0P = false;
            Parcelable A01 = A01();
            if (!this.A0P) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (A01 != null) {
                bundle.putParcelable(this.A0L, A01);
            }
        }
    }

    public void A0D(Parcelable parcelable) {
        this.A0P = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public void A0E(View view) {
        Intent intent;
        InterfaceC09440e6 interfaceC09440e6;
        if (A0O() && this.A0Z) {
            A08();
            InterfaceC14280mh interfaceC14280mh = this.A0B;
            if (interfaceC14280mh != null && interfaceC14280mh.ANC(this)) {
                return;
            }
            C0PA c0pa = this.A0F;
            if ((c0pa != null && (interfaceC09440e6 = c0pa.A06) != null && interfaceC09440e6.AND(this)) || (intent = this.A06) == null) {
                return;
            }
            this.A05.startActivity(intent);
        }
    }

    public final void A0F(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                A0F(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public void A0H(C0PA c0pa) {
        SharedPreferences sharedPreferences;
        long j;
        this.A0F = c0pa;
        if (!this.A0T) {
            synchronized (c0pa) {
                j = c0pa.A00;
                c0pa.A00 = 1 + j;
            }
            this.A04 = j;
        }
        if (A0Q()) {
            C0PA c0pa2 = this.A0F;
            if (c0pa2 != null) {
                sharedPreferences = c0pa2.A03();
            } else {
                sharedPreferences = null;
            }
            if (sharedPreferences.contains(this.A0L)) {
                A0K(null);
                return;
            }
        }
        Object obj = this.A0I;
        if (obj == null) {
            return;
        }
        A0K(obj);
    }

    public void A0I(CharSequence charSequence) {
        if (this.A0D == null) {
            if (TextUtils.equals(this.A0G, charSequence)) {
                return;
            }
            this.A0G = charSequence;
            A05();
            return;
        }
        throw new IllegalStateException("Preference already has a SummaryProvider set.");
    }

    public void A0J(CharSequence charSequence) {
        CharSequence charSequence2 = this.A0H;
        if (charSequence == null) {
            if (charSequence2 == null) {
                return;
            }
        } else if (charSequence.equals(charSequence2)) {
            return;
        }
        this.A0H = charSequence;
        A05();
    }

    public void A0L(String str) {
        if (A0Q() && !TextUtils.equals(str, A04(null))) {
            SharedPreferences.Editor A02 = this.A0F.A02();
            A02.putString(this.A0L, str);
            if (!this.A0F.A09) {
                A02.apply();
            }
        }
    }

    public void A0M(boolean z) {
        List list = this.A0M;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) list.get(i);
            if (preference.A0R == z) {
                preference.A0R = !z;
                preference.A0M(preference.A0P());
                preference.A05();
            }
        }
    }

    public void A0N(boolean z) {
        if (this.A0S != z) {
            this.A0S = z;
            A0M(A0P());
            A05();
        }
    }

    public boolean A0O() {
        return this.A0S && this.A0R && this.A0W;
    }

    public boolean A0P() {
        return !A0O();
    }

    public boolean A0Q() {
        return this.A0F != null && this.A0X && (TextUtils.isEmpty(this.A0L) ^ true);
    }

    public boolean A0R(Object obj) {
        InterfaceC14270mg interfaceC14270mg = this.A0A;
        return interfaceC14270mg == null || interfaceC14270mg.ANB(this, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0S(X.C1U3 r9) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.A0S(X.1U3):void");
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.A02;
        int i2 = preference.A02;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.A0H;
        CharSequence charSequence2 = preference.A0H;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.A0H.toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.A0H;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence A02 = A02();
        if (!TextUtils.isEmpty(A02)) {
            sb.append(A02);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }
}
