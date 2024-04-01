package X;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.165 */
/* loaded from: classes.dex */
public abstract class AnonymousClass165 {
    public Bundle A00;
    public AnonymousClass166 A01;
    public LinkedList A02;
    public final AnonymousClass167 A03 = new C31281c1(this);

    public final void A00(int i) {
        while (!this.A02.isEmpty() && ((AnonymousClass164) this.A02.getLast()).ADF() >= i) {
            this.A02.removeLast();
        }
    }

    public final void A01(Bundle bundle, AnonymousClass164 anonymousClass164) {
        AnonymousClass166 anonymousClass166 = this.A01;
        if (anonymousClass166 != null) {
            anonymousClass164.AWP(anonymousClass166);
            return;
        }
        LinkedList linkedList = this.A02;
        if (linkedList == null) {
            linkedList = new LinkedList();
            this.A02 = linkedList;
        }
        linkedList.add(anonymousClass164);
        if (bundle != null) {
            Bundle bundle2 = this.A00;
            if (bundle2 == null) {
                this.A00 = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        AnonymousClass167 anonymousClass167 = this.A03;
        C31791cx c31791cx = (C31791cx) this;
        c31791cx.A00 = anonymousClass167;
        if (anonymousClass167 == null || ((AnonymousClass165) c31791cx).A01 != null) {
            return;
        }
        try {
            try {
                Context context = c31791cx.A01;
                C0K6.A00(context);
                IMapViewDelegate AWk = C18X.A01(context).AWk(new BinderC06190Rw(context), c31791cx.A03);
                if (AWk != null) {
                    AnonymousClass167 anonymousClass1672 = c31791cx.A00;
                    C31781cw c31781cw = new C31781cw(c31791cx.A02, AWk);
                    AnonymousClass165 anonymousClass165 = ((C31281c1) anonymousClass1672).A00;
                    anonymousClass165.A01 = c31781cw;
                    Iterator it = anonymousClass165.A02.iterator();
                    while (it.hasNext()) {
                        ((AnonymousClass164) it.next()).AWP(anonymousClass165.A01);
                    }
                    anonymousClass165.A02.clear();
                    anonymousClass165.A00 = null;
                    List<C18L> list = c31791cx.A04;
                    for (C18L c18l : list) {
                        try {
                            ((C31781cw) ((AnonymousClass165) c31791cx).A01).A02.AB3(new C1r0(c18l));
                        } catch (RemoteException e) {
                            throw new C09Y(e);
                        }
                    }
                    list.clear();
                }
            } catch (RemoteException e2) {
                throw new C09Y(e2);
            }
        } catch (C226813n unused) {
        }
    }
}
