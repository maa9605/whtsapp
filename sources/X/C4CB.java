package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.4CB  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4CB extends C48B {
    public final Context A00;
    public final C018508q A01;
    public final C02L A02;
    public final C0E7 A03;
    public final C013606n A04;
    public final C90564Bm A05;
    public final C28S A06;
    public final C463026g A07;
    public final C0DV A08;
    public final C4CV A09;
    public final String A0A;

    public C4CB(Context context, C018508q c018508q, C02L c02l, C0DV c0dv, C49682Lx c49682Lx, C894947f c894947f, C0E7 c0e7, C463026g c463026g, C013606n c013606n, C4CV c4cv, C28S c28s, C90564Bm c90564Bm) {
        super(c463026g, c894947f.A04);
        this.A00 = context;
        this.A01 = c018508q;
        this.A02 = c02l;
        this.A08 = c0dv;
        this.A03 = c0e7;
        this.A0A = c49682Lx.A02();
        this.A07 = c463026g;
        this.A04 = c013606n;
        this.A09 = c4cv;
        this.A06 = c28s;
        this.A05 = c90564Bm;
    }

    public final void A00(String str, String str2, String str3, String str4, InterfaceC03640Gm interfaceC03640Gm) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C04P("action", "upi-remove-credential", null, (byte) 0));
        arrayList.add(new C04P("vpa", str, null, (byte) 0));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new C04P("vpa-id", str2, null, (byte) 0));
        }
        arrayList.add(new C04P("upi-bank-info", str3, null, (byte) 0));
        arrayList.add(new C04P("device-id", this.A0A, null, (byte) 0));
        arrayList.add(new C04P("credential-id", str4, null, (byte) 0));
        this.A07.A0A(new C02590Ca("account", (C04P[]) arrayList.toArray(new C04P[0]), null, null), interfaceC03640Gm);
    }

    public void A01(String str, String str2, String str3, String str4, boolean z, InterfaceC03640Gm interfaceC03640Gm) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C04P("action", "upi-edit-default-credential", null, (byte) 0));
        arrayList.add(new C04P("vpa", str, null, (byte) 0));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new C04P("vpa-id", str2, null, (byte) 0));
        }
        arrayList.add(new C04P("upi-bank-info", str3, null, (byte) 0));
        arrayList.add(new C04P("device-id", this.A0A, null, (byte) 0));
        arrayList.add(new C04P("credential-id", str4, null, (byte) 0));
        arrayList.add(new C04P("default", Integer.toString(z ? 1 : 0), null, (byte) 0));
        this.A07.A0B(new C02590Ca("account", (C04P[]) arrayList.toArray(new C04P[0]), null, null), interfaceC03640Gm);
    }
}
