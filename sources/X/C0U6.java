package X;

import android.os.Bundle;
import java.util.Map;

/* renamed from: X.0U6 */
/* loaded from: classes.dex */
public final class C0U6 {
    public Bundle A00;
    public C09070ca A02;
    public boolean A04;
    public C02550Bw A01 = new C02550Bw();
    public boolean A03 = true;

    public Bundle A00(String str) {
        if (this.A04) {
            Bundle bundle = this.A00;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle(str);
                this.A00.remove(str);
                if (this.A00.isEmpty()) {
                    this.A00 = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public void A01() {
        if (this.A03) {
            if (this.A02 == null) {
                this.A02 = new C09070ca(this);
            }
            try {
                C09050cY.class.getDeclaredConstructor(new Class[0]);
                C09070ca c09070ca = this.A02;
                c09070ca.A00.add(C09050cY.class.getName());
                return;
            } catch (NoSuchMethodException e) {
                StringBuilder A0P = C000200d.A0P("Class");
                A0P.append(C09050cY.class.getSimpleName());
                A0P.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(A0P.toString(), e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public void A02(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.A00;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C02550Bw c02550Bw = this.A01;
        C0YX c0yx = new C0YX(c02550Bw);
        c02550Bw.A03.put(c0yx, Boolean.FALSE);
        while (c0yx.hasNext()) {
            Map.Entry entry = (Map.Entry) c0yx.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC09030cV) entry.getValue()).ASA());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
