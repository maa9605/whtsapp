package androidx.preference;

import X.AbstractC02800Cx;
import X.C02820Cz;
import X.C0BA;
import X.C0PA;
import X.C14460mz;
import X.C1U1;
import X.C28811Tx;
import X.C38541oW;
import X.InterfaceC09430e5;
import X.InterfaceC09440e6;
import X.InterfaceC09450e7;
import X.InterfaceC09460e8;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public abstract class PreferenceFragmentCompat extends C0BA implements InterfaceC09430e5, InterfaceC09440e6, InterfaceC09450e7, InterfaceC09460e8 {
    public C0PA A02;
    public RecyclerView A03;
    public boolean A04;
    public boolean A05;
    public final C28811Tx A06 = new C28811Tx(this);
    public int A00 = R.layout.preference_list_fragment;
    public Handler A01 = new Handler() { // from class: X.0mk
        {
            PreferenceFragmentCompat.this = this;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                PreferenceFragmentCompat preferenceFragmentCompat = PreferenceFragmentCompat.this;
                PreferenceScreen preferenceScreen = preferenceFragmentCompat.A02.A07;
                if (preferenceScreen != null) {
                    preferenceFragmentCompat.A03.setAdapter(new C1U1(preferenceScreen));
                    preferenceScreen.A07();
                }
            }
        }
    };
    public final Runnable A07 = new Runnable() { // from class: X.0ml
        {
            PreferenceFragmentCompat.this = this;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = PreferenceFragmentCompat.this.A03;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    };

    public abstract void A0y(Bundle bundle, String str);

    @Override // X.C0BA
    public void A0g() {
        this.A0U = true;
        C0PA c0pa = this.A02;
        c0pa.A06 = this;
        c0pa.A04 = this;
    }

    @Override // X.C0BA
    public void A0k(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.A02.A07;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.A0C(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray obtainStyledAttributes = A0a().obtainStyledAttributes(null, C14460mz.A0h, R.attr.preferenceFragmentCompatStyle, 0);
        this.A00 = obtainStyledAttributes.getResourceId(0, this.A00);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(A0a());
        View inflate = cloneInContext.inflate(this.A00, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            if (!A0a().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
                recyclerView = (RecyclerView) cloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setAccessibilityDelegateCompat(new C38541oW(recyclerView));
            }
            this.A03 = recyclerView;
            C28811Tx c28811Tx = this.A06;
            recyclerView.A0k(c28811Tx);
            A0x(drawable);
            if (dimensionPixelSize != -1) {
                c28811Tx.A00 = dimensionPixelSize;
                c28811Tx.A03.A03.A0N();
            }
            c28811Tx.A02 = z;
            if (this.A03.getParent() == null) {
                viewGroup2.addView(this.A03);
            }
            this.A01.post(this.A07);
            return inflate;
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    @Override // X.C0BA
    public void A0r() {
        this.A01.removeCallbacks(this.A07);
        this.A01.removeMessages(1);
        if (this.A04) {
            this.A03.setAdapter(null);
            PreferenceScreen preferenceScreen = this.A02.A07;
            if (preferenceScreen != null) {
                preferenceScreen.A09();
            }
        }
        this.A03 = null;
        this.A0U = true;
    }

    @Override // X.C0BA
    public void A0t() {
        this.A0U = true;
        C0PA c0pa = this.A02;
        c0pa.A06 = null;
        c0pa.A04 = null;
    }

    @Override // X.C0BA
    public void A0v(Bundle bundle) {
        String str;
        super.A0v(bundle);
        TypedValue typedValue = new TypedValue();
        A09().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        A09().getTheme().applyStyle(i, false);
        C0PA c0pa = new C0PA(A0a());
        this.A02 = c0pa;
        c0pa.A05 = this;
        Bundle bundle2 = super.A06;
        if (bundle2 != null) {
            str = bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        } else {
            str = null;
        }
        A0y(bundle, str);
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.A02.A07) != null) {
            preferenceScreen2.A0B(bundle2);
        }
        if (this.A04 && (preferenceScreen = this.A02.A07) != null) {
            this.A03.setAdapter(new C1U1(preferenceScreen));
            preferenceScreen.A07();
        }
        this.A05 = true;
    }

    public void A0x(Drawable drawable) {
        C28811Tx c28811Tx = this.A06;
        if (c28811Tx != null) {
            if (drawable != null) {
                c28811Tx.A00 = drawable.getIntrinsicHeight();
            } else {
                c28811Tx.A00 = 0;
            }
            c28811Tx.A01 = drawable;
            c28811Tx.A03.A03.A0N();
            return;
        }
        throw null;
    }

    @Override // X.InterfaceC09430e5
    public Preference A7p(CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        C0PA c0pa = this.A02;
        if (c0pa == null || (preferenceScreen = c0pa.A07) == null) {
            return null;
        }
        return preferenceScreen.A0T(charSequence);
    }

    @Override // X.InterfaceC09440e6
    public boolean AND(Preference preference) {
        if (preference.A0K != null) {
            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            AbstractC02800Cx A0N = A0A().A0N();
            Bundle bundle = preference.A08;
            if (bundle == null) {
                bundle = new Bundle();
                preference.A08 = bundle;
            }
            C0BA A00 = A0N.A08().A00(A0A().getClassLoader(), preference.A0K);
            A00.A0P(bundle);
            A00.A0S(this, 0);
            C02820Cz c02820Cz = new C02820Cz(A0N);
            c02820Cz.A01(((View) this.A0A.getParent()).getId(), A00, null);
            c02820Cz.A03(null);
            c02820Cz.A04();
            return true;
        }
        return false;
    }
}
