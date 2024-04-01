package X;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.2Am */
/* loaded from: classes2.dex */
public class C47252Am extends C00T {
    public static volatile C47252Am A05;
    public C2DB A00;
    public final Handler A01;
    public final C2DC A02;
    public final Map A03;
    public final Executor A04;

    public C47252Am(InterfaceC002901k interfaceC002901k, C2DB c2db, C2DC c2dc) {
        ExecutorC004702d executorC004702d = new ExecutorC004702d(interfaceC002901k, false);
        this.A01 = new Handler(Looper.getMainLooper());
        this.A03 = new LinkedHashMap();
        this.A00 = c2db;
        this.A02 = c2dc;
        this.A04 = executorC004702d;
    }

    public static C47252Am A00() {
        if (A05 == null) {
            synchronized (C47252Am.class) {
                if (A05 == null) {
                    A05 = new C47252Am(C002801j.A00(), C2DB.A00, C2DC.A00());
                }
            }
        }
        return A05;
    }

    @Override // X.C00T
    public void A08(AnonymousClass092 anonymousClass092, int i) {
        if (anonymousClass092 instanceof AnonymousClass097) {
            A0E(anonymousClass092, i);
        }
    }

    @Override // X.C00T
    public void A0C(AnonymousClass092 anonymousClass092, int i) {
        A0E(anonymousClass092, i);
    }

    public final void A0D() {
        C2DB c2db = this.A00;
        ArrayList arrayList = new ArrayList(this.A03.values());
        if (c2db != null) {
            C000700j.A01();
            Iterator it = c2db.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    C2DD c2dd = ((C81773pR) c0g5.next()).A00;
                    if (arrayList.isEmpty()) {
                        C2DE c2de = c2dd.A04;
                        c2de.A00 = false;
                        c2de.A01 = false;
                    } else {
                        C2DE c2de2 = c2dd.A04;
                        if (!c2de2.A00) {
                            c2de2.A00 = true;
                            c2de2.A01 = true;
                        }
                    }
                    c2dd.A00();
                } else {
                    return;
                }
            }
        } else {
            throw null;
        }
    }

    public final void A0E(AnonymousClass092 anonymousClass092, int i) {
        C09H c09h;
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        if (C003101m.A0Z(anonymousClass094.A00) && anonymousClass094.A02) {
            if (!(anonymousClass092 instanceof AnonymousClass097) || (i == 1 && (c09h = ((AnonymousClass097) anonymousClass092).A02) != null && c09h.A0O && !c09h.A0a && c09h.A0P)) {
                if ((anonymousClass092 instanceof C03890Hn) && ((C03890Hn) anonymousClass092).A00 == null) {
                    return;
                }
                if (this.A02 != null) {
                    this.A04.execute(new RunnableEBaseShape4S0200000_I0_4(this, anonymousClass092, 15));
                    return;
                }
                throw null;
            }
        }
    }
}
