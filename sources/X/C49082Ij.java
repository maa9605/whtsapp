package X;

import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Ij */
/* loaded from: classes2.dex */
public class C49082Ij {
    public static volatile C49082Ij A05;
    public C83363s0 A00;
    public final C04940Mo A01;
    public final C06810Vc A02;
    public final C000400f A03;
    public final InterfaceC002901k A04;

    public C49082Ij(InterfaceC002901k interfaceC002901k, C06810Vc c06810Vc, C04940Mo c04940Mo, C000400f c000400f) {
        this.A04 = interfaceC002901k;
        this.A02 = c06810Vc;
        this.A01 = c04940Mo;
        this.A03 = c000400f;
    }

    public void A00(ActivityC02290Ap activityC02290Ap, String str, String str2, String str3, String str4, ArrayList arrayList, List list, boolean z) {
        C83363s0 c83363s0 = this.A00;
        if (c83363s0 != null && c83363s0.A00() == AsyncTask.Status.RUNNING) {
            this.A00.A05(false);
        }
        C83363s0 c83363s02 = new C83363s0(this.A01, this.A03, new C83343ry(this, str2, arrayList, str3, activityC02290Ap), str, str4, list, z);
        this.A00 = c83363s02;
        this.A04.ARy(c83363s02, new Void[0]);
    }
}
