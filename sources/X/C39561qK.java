package X;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: X.1qK */
/* loaded from: classes.dex */
public final class C39561qK implements InterfaceC227813z, AnonymousClass140, InterfaceC30851bH {
    public boolean A01;
    public final int A02;
    public final InterfaceC227113q A03;
    public final InterfaceC30511ah A04;
    public final C14G A05;
    public final C19W A06;
    public final C228114c A07;
    public final /* synthetic */ AnonymousClass146 A0C;
    public final Queue A0A = new LinkedList();
    public final Set A0B = new HashSet();
    public final Map A09 = new HashMap();
    public final List A08 = new ArrayList();
    public C30451ab A00 = null;

    public C39561qK(AnonymousClass146 anonymousClass146, C0ND c0nd) {
        this.A0C = anonymousClass146;
        Handler handler = anonymousClass146.A05;
        Looper looper = handler.getLooper();
        C230014v A00 = c0nd.A00();
        C230114w c230114w = new C230114w(A00.A00, null, A00.A02, A00.A03, A00.A01);
        AbstractC30501ag abstractC30501ag = c0nd.A03.A00;
        C07K.A1c(abstractC30501ag != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        InterfaceC30511ah A01 = abstractC30501ag.A01(c0nd.A01, looper, c230114w, null, this, this);
        this.A04 = A01;
        this.A03 = A01;
        this.A07 = c0nd.A07;
        this.A05 = new C14G();
        this.A02 = c0nd.A00;
        if (this.A04.ARg()) {
            Context context = anonymousClass146.A04;
            C230014v A002 = c0nd.A00();
            this.A06 = new C19W(context, handler, new C230114w(A002.A00, null, A002.A02, A002.A03, A002.A01), C19W.A07);
            return;
        }
        this.A06 = null;
    }

    public final void A00() {
        AnonymousClass146 anonymousClass146 = this.A0C;
        C07K.A1F(anonymousClass146.A05);
        InterfaceC30511ah interfaceC30511ah = this.A04;
        if (!interfaceC30511ah.isConnected() && !interfaceC30511ah.AF9()) {
            int A00 = anonymousClass146.A07.A00(anonymousClass146.A04, interfaceC30511ah);
            if (A00 != 0) {
                AIv(new C30451ab(A00, null));
                return;
            }
            C30541al c30541al = new C30541al(anonymousClass146, interfaceC30511ah, this.A07);
            if (interfaceC30511ah.ARg()) {
                final C19W c19w = this.A06;
                InterfaceC33101fM interfaceC33101fM = c19w.A02;
                if (interfaceC33101fM != null) {
                    interfaceC33101fM.A7H();
                }
                c19w.A01.A00 = Integer.valueOf(System.identityHashCode(c19w));
                AbstractC30501ag abstractC30501ag = c19w.A06;
                Context context = c19w.A04;
                Handler handler = c19w.A05;
                Looper looper = handler.getLooper();
                C230114w c230114w = c19w.A01;
                c19w.A02 = (InterfaceC33101fM) abstractC30501ag.A01(context, looper, c230114w, c230114w.A01, c19w, c19w);
                c19w.A00 = c30541al;
                Set set = c19w.A03;
                if (set != null && !set.isEmpty()) {
                    c19w.A02.connect();
                } else {
                    handler.post(new Runnable() { // from class: X.14X
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((C30541al) c19w.A00).A00(new C30451ab(4));
                        }
                    });
                }
            }
            interfaceC30511ah.A6Q(c30541al);
        }
    }

    public final void A01() {
        Handler handler = this.A0C.A05;
        C07K.A1F(handler);
        this.A00 = null;
        A06(C30451ab.A04);
        if (this.A01) {
            C228114c c228114c = this.A07;
            handler.removeMessages(11, c228114c);
            handler.removeMessages(9, c228114c);
            this.A01 = false;
        }
        Iterator it = this.A09.values().iterator();
        if (!it.hasNext()) {
            A03();
            A05();
            return;
        }
        it.next();
        throw null;
    }

    public final void A02() {
        AnonymousClass146 anonymousClass146 = this.A0C;
        Handler handler = anonymousClass146.A05;
        C07K.A1F(handler);
        this.A00 = null;
        this.A01 = true;
        this.A05.A00(true, C227914a.A03);
        C228114c c228114c = this.A07;
        handler.sendMessageDelayed(Message.obtain(handler, 9, c228114c), 5000L);
        handler.sendMessageDelayed(Message.obtain(handler, 11, c228114c), 120000L);
        anonymousClass146.A07.A01.clear();
    }

    public final void A03() {
        Queue queue = this.A0A;
        ArrayList arrayList = new ArrayList(queue);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C14J c14j = (C14J) obj;
            if (!this.A04.isConnected()) {
                return;
            }
            if (A0A(c14j)) {
                queue.remove(c14j);
            }
        }
    }

    public final void A04() {
        C07K.A1F(this.A0C.A05);
        Status status = AnonymousClass146.A0E;
        A07(status);
        C14G c14g = this.A05;
        if (c14g != null) {
            c14g.A00(false, status);
            Map map = this.A09;
            for (C14A c14a : (C14A[]) map.keySet().toArray(new C14A[map.size()])) {
                A08(new AbstractC39611qP(c14a, new C0NR()) { // from class: X.19G
                    public final C14A A00;

                    {
                        super(r2);
                        this.A00 = c14a;
                    }

                    @Override // X.C14J
                    public final /* bridge */ /* synthetic */ void A03(C14G c14g2, boolean z) {
                    }

                    @Override // X.AbstractC30791bB
                    public final boolean A05(C39561qK c39561qK) {
                        c39561qK.A09.get(this.A00);
                        return false;
                    }

                    @Override // X.AbstractC30791bB
                    public final C30461ac[] A06(C39561qK c39561qK) {
                        c39561qK.A09.get(this.A00);
                        return null;
                    }

                    @Override // X.AbstractC39611qP
                    public final void A07(C39561qK c39561qK) {
                        c39561qK.A09.remove(this.A00);
                        C0NR c0nr = super.A00;
                        Boolean bool = Boolean.FALSE;
                        C0AD c0ad = c0nr.A00;
                        synchronized (c0ad.A04) {
                            if (c0ad.A02) {
                                return;
                            }
                            c0ad.A02 = true;
                            c0ad.A01 = bool;
                            c0ad.A03.A00(c0ad);
                        }
                    }
                });
            }
            A06(new C30451ab(4));
            InterfaceC30511ah interfaceC30511ah = this.A04;
            if (interfaceC30511ah.isConnected()) {
                interfaceC30511ah.AQF(new C30781bA(this));
                return;
            }
            return;
        }
        throw null;
    }

    public final void A05() {
        AnonymousClass146 anonymousClass146 = this.A0C;
        Handler handler = anonymousClass146.A05;
        C228114c c228114c = this.A07;
        handler.removeMessages(12, c228114c);
        handler.sendMessageDelayed(handler.obtainMessage(12, c228114c), anonymousClass146.A02);
    }

    public final void A06(C30451ab c30451ab) {
        Set<C228214d> set = this.A0B;
        for (C228214d c228214d : set) {
            String str = null;
            if (C07K.A1k(c30451ab, C30451ab.A04)) {
                str = this.A04.A9x();
            }
            c228214d.A00(this.A07, c30451ab, str);
        }
        set.clear();
    }

    public final void A07(Status status) {
        C07K.A1F(this.A0C.A05);
        Queue<C14J> queue = this.A0A;
        for (C14J c14j : queue) {
            c14j.A01(status);
        }
        queue.clear();
    }

    public final void A08(C14J c14j) {
        C07K.A1F(this.A0C.A05);
        if (this.A04.isConnected()) {
            if (A0A(c14j)) {
                A05();
                return;
            } else {
                this.A0A.add(c14j);
                return;
            }
        }
        this.A0A.add(c14j);
        C30451ab c30451ab = this.A00;
        if (c30451ab != null && c30451ab.A01()) {
            AIv(c30451ab);
        } else {
            A00();
        }
    }

    public final boolean A09(C30451ab c30451ab) {
        synchronized (AnonymousClass146.A0G) {
            AnonymousClass146 anonymousClass146 = this.A0C;
            if (anonymousClass146.A03 == null || !anonymousClass146.A09.contains(this.A07)) {
                return false;
            }
            C39581qM c39581qM = anonymousClass146.A03;
            C228314e c228314e = new C228314e(c30451ab, this.A02);
            if (c39581qM.A02.compareAndSet(null, c228314e)) {
                ((AbstractDialogInterface$OnCancelListenerC30821bE) c39581qM).A00.post(new RunnableC228414f(c39581qM, c228314e));
            }
            return true;
        }
    }

    public final boolean A0A(C14J c14j) {
        if (!(c14j instanceof AbstractC30791bB)) {
            C14G c14g = this.A05;
            InterfaceC30511ah interfaceC30511ah = this.A04;
            c14j.A03(c14g, interfaceC30511ah.ARg());
            try {
                c14j.A02(this);
                return true;
            } catch (DeadObjectException unused) {
                AIw(1);
                interfaceC30511ah.A7H();
                return true;
            }
        }
        AbstractC30791bB abstractC30791bB = (AbstractC30791bB) c14j;
        C30461ac[] A06 = abstractC30791bB.A06(this);
        if (A06 != null && (r8 = A06.length) != 0) {
            C30461ac[] A8S = this.A04.A8S();
            if (A8S == null) {
                A8S = new C30461ac[0];
            }
            C006702y c006702y = new C006702y(A8S.length);
            for (C30461ac c30461ac : A8S) {
                c006702y.put(c30461ac.A02, Long.valueOf(c30461ac.A00()));
            }
            for (C30461ac c30461ac2 : A06) {
                if (!c006702y.containsKey(c30461ac2.A02) || ((Number) c006702y.get(c30461ac2.A02)).longValue() < c30461ac2.A00()) {
                    if (abstractC30791bB.A05(this)) {
                        AnonymousClass145 anonymousClass145 = new AnonymousClass145(this.A07, c30461ac2);
                        List list = this.A08;
                        int indexOf = list.indexOf(anonymousClass145);
                        if (indexOf >= 0) {
                            Object obj = list.get(indexOf);
                            Handler handler = this.A0C.A05;
                            handler.removeMessages(15, obj);
                            handler.sendMessageDelayed(Message.obtain(handler, 15, obj), 5000L);
                            return false;
                        }
                        list.add(anonymousClass145);
                        AnonymousClass146 anonymousClass146 = this.A0C;
                        Handler handler2 = anonymousClass146.A05;
                        handler2.sendMessageDelayed(Message.obtain(handler2, 15, anonymousClass145), 5000L);
                        handler2.sendMessageDelayed(Message.obtain(handler2, 16, anonymousClass145), 120000L);
                        C30451ab c30451ab = new C30451ab(2, null);
                        if (A09(c30451ab)) {
                            return false;
                        }
                        anonymousClass146.A03(c30451ab, this.A02);
                        return false;
                    }
                    abstractC30791bB.A04(new AnonymousClass142(c30461ac2));
                    return false;
                }
            }
        }
        C14G c14g2 = this.A05;
        InterfaceC30511ah interfaceC30511ah2 = this.A04;
        c14j.A03(c14g2, interfaceC30511ah2.ARg());
        try {
            c14j.A02(this);
            return true;
        } catch (DeadObjectException unused2) {
            AIw(1);
            interfaceC30511ah2.A7H();
            return true;
        }
    }

    @Override // X.InterfaceC227813z
    public final void AIu(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.A0C.A05;
        if (myLooper == handler.getLooper()) {
            A01();
        } else {
            handler.post(new Runnable() { // from class: X.14N
                {
                    C39561qK.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C39561qK.this.A01();
                }
            });
        }
    }

    @Override // X.AnonymousClass140
    public final void AIv(C30451ab c30451ab) {
        InterfaceC33101fM interfaceC33101fM;
        AnonymousClass146 anonymousClass146 = this.A0C;
        Handler handler = anonymousClass146.A05;
        C07K.A1F(handler);
        C19W c19w = this.A06;
        if (c19w != null && (interfaceC33101fM = c19w.A02) != null) {
            interfaceC33101fM.A7H();
        }
        C07K.A1F(handler);
        this.A00 = null;
        anonymousClass146.A07.A01.clear();
        A06(c30451ab);
        int i = c30451ab.A01;
        if (i == 4) {
            A07(AnonymousClass146.A0F);
        } else if (this.A0A.isEmpty()) {
            this.A00 = c30451ab;
        } else if (A09(c30451ab) || anonymousClass146.A03(c30451ab, this.A02)) {
        } else {
            if (i == 18) {
                this.A01 = true;
            }
            if (this.A01) {
                handler.sendMessageDelayed(Message.obtain(handler, 9, this.A07), 5000L);
                return;
            }
            String str = this.A07.A01.A02;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38);
            sb.append("API: ");
            sb.append(str);
            sb.append(" is not available on this device.");
            A07(new Status(17, sb.toString()));
        }
    }

    @Override // X.InterfaceC227813z
    public final void AIw(int i) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.A0C.A05;
        if (myLooper == handler.getLooper()) {
            A02();
        } else {
            handler.post(new Runnable() { // from class: X.14O
                {
                    C39561qK.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C39561qK.this.A02();
                }
            });
        }
    }

    @Override // X.InterfaceC30851bH
    public final void AWL(final C30451ab c30451ab, C227413u c227413u, boolean z) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.A0C.A05;
        if (myLooper == handler.getLooper()) {
            AIv(c30451ab);
        } else {
            handler.post(new Runnable() { // from class: X.14P
                {
                    C39561qK.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C39561qK.this.AIv(c30451ab);
                }
            });
        }
    }
}
