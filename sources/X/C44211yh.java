package X;

import android.view.View;

/* renamed from: X.1yh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44211yh {
    public final View A00;
    public final AnonymousClass092 A01;
    public final InterfaceC43821y3 A02;
    public final InterfaceC43851y6 A03;
    public final Object A04;
    public final boolean A05;

    public C44211yh(AnonymousClass092 anonymousClass092, View view, InterfaceC43821y3 interfaceC43821y3, InterfaceC43851y6 interfaceC43851y6, Object obj, boolean z) {
        this.A01 = anonymousClass092;
        this.A00 = view;
        this.A02 = interfaceC43821y3;
        this.A03 = interfaceC43851y6;
        this.A04 = obj;
        this.A05 = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C44211yh.class != obj.getClass()) {
            return false;
        }
        return this.A01.A0n.equals(((C44211yh) obj).A01.A0n);
    }

    public int hashCode() {
        return this.A01.A0n.hashCode();
    }
}
