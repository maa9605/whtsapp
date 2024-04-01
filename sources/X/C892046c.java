package X;

import android.app.ProgressDialog;

/* renamed from: X.46c  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C892046c implements InterfaceC25071Dy {
    public final ProgressDialog A00;
    public final AbstractC02800Cx A01;
    public final InterfaceC24961Dn A02 = new InterfaceC24961Dn() { // from class: X.46b
    };
    public final ActivityC02290Ap A03;
    public final C2MB A04;

    public C892046c(AbstractC02800Cx abstractC02800Cx, ActivityC02290Ap activityC02290Ap, C2MB c2mb) {
        this.A01 = abstractC02800Cx;
        this.A03 = activityC02290Ap;
        this.A00 = new ProgressDialog(activityC02290Ap);
        this.A04 = c2mb;
    }
}
