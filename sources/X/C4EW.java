package X;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4EW  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4EW extends C0HS {
    public final int A00 = 3;
    public final C03090Ed A01;
    public final C42021ut A02;
    public final C0DV A03;
    public final C28021Ps A04;
    public final InterfaceC002901k A05;
    public final WeakReference A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C4EW(ActivityC02270An activityC02270An, InterfaceC002901k interfaceC002901k, C0DV c0dv, C28021Ps c28021Ps, C03090Ed c03090Ed, C42021ut c42021ut, boolean z, boolean z2, boolean z3) {
        this.A05 = interfaceC002901k;
        this.A04 = c28021Ps;
        this.A03 = c0dv;
        this.A01 = c03090Ed;
        this.A02 = c42021ut;
        this.A06 = new WeakReference(activityC02270An);
        this.A08 = z;
        this.A09 = z2;
        this.A07 = z3;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        List arrayList3 = new ArrayList();
        if (this.A09) {
            C28021Ps c28021Ps = this.A04;
            c28021Ps.A03 = true;
            C0DV c0dv = this.A03;
            c0dv.A04();
            C013306k c013306k = c0dv.A07;
            arrayList2 = c013306k.A0a(c28021Ps);
            c0dv.A04();
            arrayList3 = c013306k.A0U(this.A00);
        }
        if (this.A08) {
            C0DV c0dv2 = this.A03;
            c0dv2.A04();
            arrayList = c0dv2.A08.A0A();
        }
        return new C899749e(arrayList, arrayList2, arrayList3);
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C899749e c899749e = (C899749e) obj;
        synchronized (this) {
            ActivityC02270An activityC02270An = (ActivityC02270An) this.A06.get();
            if (activityC02270An != null) {
                activityC02270An.ARS();
                if (activityC02270An instanceof InterfaceC899649d) {
                    List<C0N2> list = c899749e.A00;
                    ((InterfaceC899649d) activityC02270An).AVp(list);
                    if (this.A07) {
                        ArrayList arrayList = new ArrayList();
                        for (C0N2 c0n2 : list) {
                            if (!TextUtils.isEmpty(c0n2.A07)) {
                                arrayList.add(c0n2.A07);
                            }
                        }
                        this.A05.AS1(new RunnableEBaseShape8S0100000_I1_0(this.A02, 49));
                    }
                }
                if (this.A09 && (activityC02270An instanceof InterfaceC900049h)) {
                    InterfaceC900049h interfaceC900049h = (InterfaceC900049h) activityC02270An;
                    List list2 = c899749e.A02;
                    interfaceC900049h.AVu(list2);
                    List list3 = c899749e.A01;
                    interfaceC900049h.AVs(list3);
                    if (this.A07) {
                        A0A(list2);
                        A0A(list3);
                    }
                }
                activityC02270An.invalidateOptionsMenu();
            }
        }
    }

    public final void A0A(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass093 anonymousClass093 = (AnonymousClass093) it.next();
            if (!TextUtils.isEmpty(anonymousClass093.A0I)) {
                arrayList.add(anonymousClass093.A0I);
            }
        }
        this.A05.AS1(new C3RF(this, arrayList));
    }

    public /* synthetic */ void A0B(List list) {
        this.A01.A03(list);
    }
}
