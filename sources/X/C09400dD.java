package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;

/* renamed from: X.0dD */
/* loaded from: classes.dex */
public class C09400dD {
    public int A00 = -1;
    public final C0BA A01;
    public final C0RC A02;

    public C09400dD(C0RC c0rc, C0BA c0ba) {
        this.A02 = c0rc;
        this.A01 = c0ba;
    }

    public C09400dD(C0RC c0rc, C0BA c0ba, C13720li c13720li) {
        this.A02 = c0rc;
        this.A01 = c0ba;
        c0ba.A08 = null;
        c0ba.A01 = 0;
        c0ba.A0b = false;
        c0ba.A0T = false;
        C0BA c0ba2 = c0ba.A0E;
        c0ba.A0R = c0ba2 != null ? c0ba2.A0S : null;
        c0ba.A0E = null;
        Bundle bundle = c13720li.A00;
        if (bundle != null) {
            c0ba.A07 = bundle;
        } else {
            c0ba.A07 = new Bundle();
        }
    }

    public C09400dD(C0RC c0rc, ClassLoader classLoader, C0UP c0up, C13720li c13720li) {
        this.A02 = c0rc;
        this.A01 = c0up.A00(classLoader, c13720li.A05);
        Bundle bundle = c13720li.A04;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        C0BA c0ba = this.A01;
        c0ba.A0P(bundle);
        c0ba.A0S = c13720li.A07;
        c0ba.A0X = c13720li.A09;
        c0ba.A0h = true;
        c0ba.A03 = c13720li.A02;
        c0ba.A02 = c13720li.A01;
        c0ba.A0Q = c13720li.A06;
        c0ba.A0i = c13720li.A0C;
        c0ba.A0g = c13720li.A0B;
        c0ba.A0W = c13720li.A08;
        c0ba.A0Z = c13720li.A0A;
        c0ba.A0J = EnumC02560Bx.values()[c13720li.A03];
        Bundle bundle2 = c13720li.A00;
        if (bundle2 != null) {
            this.A01.A07 = bundle2;
        } else {
            this.A01.A07 = new Bundle();
        }
        if (AbstractC02800Cx.A01(2)) {
            StringBuilder A0P = C000200d.A0P("Instantiated fragment ");
            A0P.append(this.A01);
            Log.v("FragmentManager", A0P.toString());
        }
    }

    public final Bundle A00() {
        Bundle bundle = new Bundle();
        C0BA c0ba = this.A01;
        c0ba.A0k(bundle);
        c0ba.A0N.A00.A02(bundle);
        Parcelable A04 = c0ba.A0G.A04();
        if (A04 != null) {
            bundle.putParcelable(ActivityC02330At.A0C, A04);
        }
        this.A02.A05(c0ba, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        View view = c0ba.A0A;
        if (view != null && view != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            view.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                c0ba.A08 = sparseArray;
            }
        }
        if (c0ba.A08 != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", c0ba.A08);
        }
        if (!c0ba.A0j) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", c0ba.A0j);
        }
        return bundle;
    }

    public void A01(ClassLoader classLoader) {
        boolean z;
        C0BA c0ba = this.A01;
        Bundle bundle = c0ba.A07;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        c0ba.A08 = c0ba.A07.getSparseParcelableArray("android:view_state");
        String string = c0ba.A07.getString("android:target_state");
        c0ba.A0R = string;
        if (string != null) {
            c0ba.A05 = c0ba.A07.getInt("android:target_req_state", 0);
        }
        Boolean bool = c0ba.A0P;
        if (bool != null) {
            z = bool.booleanValue();
            c0ba.A0j = z;
            c0ba.A0P = null;
        } else {
            z = c0ba.A07.getBoolean("android:user_visible_hint", true);
            c0ba.A0j = z;
        }
        if (z) {
            return;
        }
        c0ba.A0V = true;
    }
}
