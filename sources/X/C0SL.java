package X;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.0SL */
/* loaded from: classes.dex */
public final class C0SL {
    public final C0SM A00;

    public C0SL(C0SM c0sm) {
        C07K.A1P(c0sm);
        this.A00 = c0sm;
    }

    public final LatLng A00() {
        try {
            return this.A00.ACU();
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final Object A01() {
        try {
            return BinderC06190Rw.A00(this.A00.AXK());
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A02() {
        try {
            this.A00.AEc();
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A03() {
        try {
            this.A00.AUi();
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A04(float f) {
        try {
            this.A00.AUE(f);
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A05(C019609c c019609c) {
        try {
            if (c019609c == null) {
                this.A00.AXH(null);
                return;
            }
            this.A00.AXH(c019609c.A00);
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A06(LatLng latLng) {
        try {
            this.A00.ATf(latLng);
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A07(boolean z) {
        try {
            this.A00.AU9(z);
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final boolean A08() {
        try {
            return this.A00.isVisible();
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0SL) {
            try {
                return this.A00.AXJ(((C0SL) obj).A00);
            } catch (RemoteException e) {
                throw new C09Y(e);
            }
        }
        return false;
    }

    public final int hashCode() {
        try {
            return this.A00.AXI();
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }
}
