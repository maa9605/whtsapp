package X;

import android.content.Context;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1Vn */
/* loaded from: classes.dex */
public class C29131Vn implements InterfaceC16770qz {
    public static final String A03 = AbstractC16430qO.A01("WorkConstraintsTracker");
    public final InterfaceC16760qy A00;
    public final Object A01;
    public final AbstractC29141Vo[] A02;

    public C29131Vn(Context context, InterfaceC17300rs taskExecutor, InterfaceC16760qy callback) {
        Context applicationContext = context.getApplicationContext();
        this.A00 = callback;
        this.A02 = new AbstractC29141Vo[]{new AbstractC29141Vo(applicationContext, taskExecutor) { // from class: X.1p3
            {
                super(C16830r5.A00(applicationContext, taskExecutor).A00);
            }

            @Override // X.AbstractC29141Vo
            public boolean A01(C0OL workSpec) {
                return workSpec.A09.A05;
            }

            @Override // X.AbstractC29141Vo
            public boolean A02(Object isBatteryCharging) {
                return !((Boolean) isBatteryCharging).booleanValue();
            }
        }, new AbstractC29141Vo(applicationContext, taskExecutor) { // from class: X.1p4
            {
                super(C16830r5.A00(applicationContext, taskExecutor).A01);
            }

            @Override // X.AbstractC29141Vo
            public boolean A01(C0OL workSpec) {
                return workSpec.A09.A04;
            }

            @Override // X.AbstractC29141Vo
            public boolean A02(Object isBatteryNotLow) {
                return !((Boolean) isBatteryNotLow).booleanValue();
            }
        }, new AbstractC29141Vo(applicationContext, taskExecutor) { // from class: X.1p9
            {
                super(C16830r5.A00(applicationContext, taskExecutor).A03);
            }

            @Override // X.AbstractC29141Vo
            public boolean A01(C0OL workSpec) {
                return workSpec.A09.A07;
            }

            @Override // X.AbstractC29141Vo
            public boolean A02(Object isStorageNotLow) {
                return !((Boolean) isStorageNotLow).booleanValue();
            }
        }, new AbstractC29141Vo(applicationContext, taskExecutor) { // from class: X.1p5
            {
                super(C16830r5.A00(applicationContext, taskExecutor).A02);
            }

            @Override // X.AbstractC29141Vo
            public boolean A01(C0OL workSpec) {
                return workSpec.A09.A03 == C07j.CONNECTED;
            }

            @Override // X.AbstractC29141Vo
            public boolean A02(Object state) {
                C16750qx c16750qx = (C16750qx) state;
                if (Build.VERSION.SDK_INT >= 26) {
                    return (c16750qx.A00 && c16750qx.A03) ? false : true;
                }
                return true ^ c16750qx.A00;
            }
        }, new AbstractC29141Vo(applicationContext, taskExecutor) { // from class: X.1p8
            {
                super(C16830r5.A00(applicationContext, taskExecutor).A02);
            }

            @Override // X.AbstractC29141Vo
            public boolean A01(C0OL workSpec) {
                return workSpec.A09.A03 == C07j.UNMETERED;
            }

            @Override // X.AbstractC29141Vo
            public boolean A02(Object state) {
                C16750qx c16750qx = (C16750qx) state;
                return !c16750qx.A00 || c16750qx.A01;
            }
        }, new AbstractC29141Vo(applicationContext, taskExecutor) { // from class: X.1p7
            public static final String A00 = AbstractC16430qO.A01("NetworkNotRoamingCtrlr");

            {
                super(C16830r5.A00(applicationContext, taskExecutor).A02);
            }

            @Override // X.AbstractC29141Vo
            public boolean A01(C0OL workSpec) {
                return workSpec.A09.A03 == C07j.NOT_ROAMING;
            }

            @Override // X.AbstractC29141Vo
            public boolean A02(Object state) {
                C16750qx c16750qx = (C16750qx) state;
                if (Build.VERSION.SDK_INT >= 24) {
                    return (c16750qx.A00 && c16750qx.A02) ? false : true;
                }
                AbstractC16430qO.A00().A02(A00, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
                return !c16750qx.A00;
            }
        }, new AbstractC29141Vo(applicationContext, taskExecutor) { // from class: X.1p6
            public static final String A00 = AbstractC16430qO.A01("NetworkMeteredCtrlr");

            {
                super(C16830r5.A00(applicationContext, taskExecutor).A02);
            }

            @Override // X.AbstractC29141Vo
            public boolean A01(C0OL workSpec) {
                return workSpec.A09.A03 == C07j.METERED;
            }

            @Override // X.AbstractC29141Vo
            public boolean A02(Object state) {
                C16750qx c16750qx = (C16750qx) state;
                if (Build.VERSION.SDK_INT >= 26) {
                    return (c16750qx.A00 && c16750qx.A01) ? false : true;
                }
                AbstractC16430qO.A00().A02(A00, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
                return !c16750qx.A00;
            }
        }};
        this.A01 = new Object();
    }

    public void A00() {
        AbstractC29141Vo[] abstractC29141VoArr;
        synchronized (this.A01) {
            for (AbstractC29141Vo abstractC29141Vo : this.A02) {
                if (!abstractC29141Vo.A03.isEmpty()) {
                    abstractC29141Vo.A03.clear();
                    abstractC29141Vo.A01.A03(abstractC29141Vo);
                }
            }
        }
    }

    public void A01(Iterable workSpecs) {
        synchronized (this.A01) {
            AbstractC29141Vo[] abstractC29141VoArr = this.A02;
            for (AbstractC29141Vo abstractC29141Vo : abstractC29141VoArr) {
                if (abstractC29141Vo.A00 != null) {
                    abstractC29141Vo.A00 = null;
                    abstractC29141Vo.A00(null, abstractC29141Vo.A02);
                }
            }
            for (AbstractC29141Vo abstractC29141Vo2 : abstractC29141VoArr) {
                List list = abstractC29141Vo2.A03;
                list.clear();
                Iterator it = workSpecs.iterator();
                while (it.hasNext()) {
                    C0OL c0ol = (C0OL) it.next();
                    if (abstractC29141Vo2.A01(c0ol)) {
                        list.add(c0ol.A0D);
                    }
                }
                if (list.isEmpty()) {
                    abstractC29141Vo2.A01.A03(abstractC29141Vo2);
                } else {
                    AbstractC16800r2 abstractC16800r2 = abstractC29141Vo2.A01;
                    synchronized (abstractC16800r2.A03) {
                        Set set = abstractC16800r2.A04;
                        if (set.add(abstractC29141Vo2)) {
                            if (set.size() == 1) {
                                abstractC16800r2.A00 = abstractC16800r2.A00();
                                AbstractC16430qO.A00().A02(AbstractC16800r2.A05, String.format("%s: initial state = %s", abstractC16800r2.getClass().getSimpleName(), abstractC16800r2.A00), new Throwable[0]);
                                abstractC16800r2.A01();
                            }
                            abstractC29141Vo2.AIy(abstractC16800r2.A00);
                        }
                    }
                }
                abstractC29141Vo2.A00(abstractC29141Vo2.A00, abstractC29141Vo2.A02);
            }
            for (AbstractC29141Vo abstractC29141Vo3 : abstractC29141VoArr) {
                if (abstractC29141Vo3.A00 != this) {
                    abstractC29141Vo3.A00 = this;
                    abstractC29141Vo3.A00(this, abstractC29141Vo3.A02);
                }
            }
        }
    }

    public boolean A02(String workSpecId) {
        AbstractC29141Vo[] abstractC29141VoArr;
        synchronized (this.A01) {
            for (AbstractC29141Vo abstractC29141Vo : this.A02) {
                Object obj = abstractC29141Vo.A02;
                if (obj != null && abstractC29141Vo.A02(obj) && abstractC29141Vo.A03.contains(workSpecId)) {
                    AbstractC16430qO.A00().A02(A03, String.format("Work %s constrained by %s", workSpecId, abstractC29141Vo.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }
}
