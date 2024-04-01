package X;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.0YR  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0YR extends C0MU {
    public static final C0CR A05 = new C0CR() { // from class: X.0YS
        @Override // X.C0CR
        public C0MU A6e(Class cls) {
            return new C0YR(true);
        }
    };
    public final boolean A04;
    public final HashMap A02 = new HashMap();
    public final HashMap A01 = new HashMap();
    public final HashMap A03 = new HashMap();
    public boolean A00 = false;

    public C0YR(boolean z) {
        this.A04 = z;
    }

    @Override // X.C0MU
    public void A01() {
        if (AbstractC02800Cx.A01(3)) {
            StringBuilder sb = new StringBuilder("onCleared called for ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        this.A00 = true;
    }

    public boolean A02(C0BA c0ba) {
        if (this.A02.containsKey(c0ba.A0S) && this.A04) {
            return this.A00;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0YR.class != obj.getClass()) {
            return false;
        }
        C0YR c0yr = (C0YR) obj;
        return this.A02.equals(c0yr.A02) && this.A01.equals(c0yr.A01) && this.A03.equals(c0yr.A03);
    }

    public int hashCode() {
        return this.A03.hashCode() + ((this.A01.hashCode() + (this.A02.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.A02.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.A01.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.A03.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
