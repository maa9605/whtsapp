package X;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.4GE  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4GE implements InterfaceC41971uo {
    public final C00J A00;
    public final C00J A01;
    public final C00J A02;
    public final C00J A03;
    public final C00J A04;
    public final List A05;

    public C4GE(C00J c00j, C00J c00j2, C00J c00j3, C00J c00j4, C00J c00j5, C00J c00j6) {
        this.A03 = c00j;
        this.A01 = c00j3;
        this.A00 = c00j4;
        this.A02 = c00j5;
        this.A04 = c00j6;
        this.A05 = ((C90244Ag) c00j2.get()).A03;
    }

    public final void A00(Context context, Intent intent) {
        if (((InterfaceC41261td) this.A02.get()).AFs()) {
            ((C018308n) this.A00.get()).A09(C018308n.A00(context), intent, 475);
        } else {
            ((InterfaceC41271te) this.A03.get()).AUq(((ActivityC02330At) C018308n.A01(context, ActivityC02330At.class)).A0N(), "TOSFragment");
        }
    }

    public /* synthetic */ void A01(WeakReference weakReference, Intent intent, C50162Qh c50162Qh) {
        Context context = (Context) weakReference.get();
        if (context == null) {
            return;
        }
        int i = c50162Qh.A00;
        if (2 == i) {
            ((C018308n) this.A00.get()).A06(context, intent);
        } else if (i != 0) {
        } else {
            ((InterfaceC41261td) this.A02.get()).A67();
            A00(context, intent);
        }
    }
}
