package X;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.model.CameraPosition;

/* renamed from: X.0S8 */
/* loaded from: classes.dex */
public final class C0S8 {
    public C18N A00;
    public final IGoogleMapDelegate A01;

    public C0S8(IGoogleMapDelegate iGoogleMapDelegate) {
        C07K.A1P(iGoogleMapDelegate);
        this.A01 = iGoogleMapDelegate;
    }

    public final C18M A00() {
        try {
            return new C18M(this.A01.ACc());
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final C18N A01() {
        try {
            C18N c18n = this.A00;
            if (c18n == null) {
                C18N c18n2 = new C18N(this.A01.ADd());
                this.A00 = c18n2;
                return c18n2;
            }
            return c18n;
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final CameraPosition A02() {
        try {
            return this.A01.A8k();
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final C0SL A03(C31871d5 c31871d5) {
        try {
            C0SM A5F = this.A01.A5F(c31871d5);
            if (A5F != null) {
                return new C0SL(A5F);
            }
            return null;
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A04() {
        try {
            this.A01.ARl();
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A05() {
        try {
            this.A01.ATL(16.0f);
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A06(int i) {
        try {
            this.A01.ATI(i);
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A07(int i, int i2, int i3) {
        try {
            this.A01.ATZ(0, i, i2, i3);
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A08(C09X c09x) {
        try {
            this.A01.A5N(c09x.A00);
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A09(C09X c09x) {
        try {
            this.A01.AGX(c09x.A00);
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A0A(C09X c09x, C18E c18e) {
        try {
            this.A01.A5O(c09x.A00, c18e == null ? null : new BinderC39951qz(c18e));
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A0B(C09X c09x, C18E c18e) {
        try {
            this.A01.A5P(c09x.A00, 400, c18e == null ? null : new BinderC39951qz(c18e));
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A0C(C18F c18f) {
        try {
            this.A01.ATB(new C1r3(c18f));
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A0D(C18G c18g) {
        try {
            this.A01.ATS(new BinderC39531qH(c18g));
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A0E(C18H c18h) {
        try {
            this.A01.ATT(new BinderC39981r4(c18h));
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A0F(C18I c18i) {
        try {
            this.A01.ATU(new BinderC39971r2(c18i));
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A0G(C18J c18j) {
        try {
            this.A01.ATW(new BinderC39461qA(c18j));
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A0H(C18K c18k) {
        try {
            this.A01.ATX(new BinderC39961r1(c18k));
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A0I(C31861d4 c31861d4) {
        try {
            this.A01.ATH(c31861d4);
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A0J(boolean z) {
        try {
            this.A01.ATQ(z);
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }

    public final void A0K(boolean z) {
        try {
            this.A01.AU3(z);
        } catch (RemoteException e) {
            throw new C09Y(e);
        }
    }
}
