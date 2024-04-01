package X;

import android.os.Bundle;

/* renamed from: X.1oO  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38531oO extends C0HK implements C0m4 {
    public InterfaceC02360Aw A00;
    public C28671Td A01;
    public C13930m5 A02;
    public final int A03;
    public final Bundle A04;
    public final C13930m5 A05;

    public C38531oO(int i, Bundle bundle, C13930m5 c13930m5, C13930m5 c13930m52) {
        this.A03 = i;
        this.A04 = bundle;
        this.A05 = c13930m5;
        this.A02 = c13930m52;
        if (c13930m5.A01 == null) {
            c13930m5.A01 = this;
            c13930m5.A00 = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override // X.C0HL
    public void A02() {
        C13930m5 c13930m5 = this.A05;
        c13930m5.A06 = true;
        c13930m5.A05 = false;
        c13930m5.A02 = false;
        c13930m5.A02();
    }

    @Override // X.C0HL
    public void A03() {
        C13930m5 c13930m5 = this.A05;
        c13930m5.A06 = false;
        c13930m5.A03();
    }

    @Override // X.C0HL
    public void A09(InterfaceC05620Pl interfaceC05620Pl) {
        super.A09(interfaceC05620Pl);
        this.A00 = null;
        this.A01 = null;
    }

    @Override // X.C0HL
    public void A0B(Object obj) {
        super.A0B(obj);
        C13930m5 c13930m5 = this.A02;
        if (c13930m5 != null) {
            c13930m5.A01();
            c13930m5.A05 = true;
            c13930m5.A06 = false;
            c13930m5.A02 = false;
            c13930m5.A03 = false;
            c13930m5.A04 = false;
            this.A02 = null;
        }
    }

    public C13930m5 A0C(boolean z) {
        C13930m5 c13930m5 = this.A05;
        c13930m5.A06();
        c13930m5.A02 = true;
        C28671Td c28671Td = this.A01;
        if (c28671Td != null) {
            super.A09(c28671Td);
            this.A00 = null;
            this.A01 = null;
            if (z && c28671Td.A00) {
                c28671Td.A01.ALZ(c28671Td.A02);
            }
        }
        C0m4 c0m4 = c13930m5.A01;
        if (c0m4 != null) {
            if (c0m4 == this) {
                c13930m5.A01 = null;
                if ((c28671Td == null || c28671Td.A00) && !z) {
                    return c13930m5;
                }
                c13930m5.A01();
                c13930m5.A05 = true;
                c13930m5.A06 = false;
                c13930m5.A02 = false;
                c13930m5.A03 = false;
                c13930m5.A04 = false;
                return this.A02;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }

    public void A0D() {
        InterfaceC02360Aw interfaceC02360Aw = this.A00;
        C28671Td c28671Td = this.A01;
        if (interfaceC02360Aw == null || c28671Td == null) {
            return;
        }
        super.A09(c28671Td);
        A05(interfaceC02360Aw, c28671Td);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.A03);
        sb.append(" : ");
        C07O.A0v(this.A05, sb);
        sb.append("}}");
        return sb.toString();
    }
}
