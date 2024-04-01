package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.2bw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C53132bw {
    public static volatile C53132bw A04;
    public AnonymousClass097 A00;
    public Integer A01;
    public final C42451vl A02;
    public final ArrayList A03 = new ArrayList();

    public C53132bw(C42451vl c42451vl) {
        this.A02 = c42451vl;
    }

    public static synchronized C53132bw A00() {
        C53132bw c53132bw;
        synchronized (C53132bw.class) {
            if (A04 == null && A04 == null) {
                C003701t.A00();
                A04 = new C53132bw(C42451vl.A00());
            }
            c53132bw = A04;
        }
        return c53132bw;
    }

    public final void A01(AnonymousClass097 anonymousClass097, int i) {
        Integer num;
        StringBuilder A0P = C000200d.A0P("statusdownload/queue-status-download ");
        A0P.append(anonymousClass097.A0n.A01);
        A0P.append(" ");
        A0P.append(anonymousClass097.A0G);
        A0P.append(", mode = ");
        A0P.append(i);
        Log.i(A0P.toString());
        if (!anonymousClass097.equals(this.A00) || ((num = this.A01) != null && i < num.intValue())) {
            this.A00 = anonymousClass097;
            this.A01 = Integer.valueOf(i);
            this.A02.A05(anonymousClass097, i, new InterfaceC04070Ih() { // from class: X.2hT
                @Override // X.InterfaceC04070Ih
                public void AJX(boolean z) {
                    Log.i("statusdownload/status-cancelled");
                    C53132bw c53132bw = C53132bw.this;
                    c53132bw.A00 = null;
                    c53132bw.A01 = null;
                }

                @Override // X.InterfaceC04070Ih
                public void AJY(C04020Ic c04020Ic, C43211x2 c43211x2) {
                    AnonymousClass097 anonymousClass0972;
                    Log.i("statusdownload/status-completed");
                    C53132bw c53132bw = C53132bw.this;
                    while (true) {
                        ArrayList arrayList = c53132bw.A03;
                        if (arrayList.size() <= 0) {
                            anonymousClass0972 = null;
                            break;
                        }
                        anonymousClass0972 = (AnonymousClass097) arrayList.remove(0);
                        AnonymousClass097 anonymousClass0973 = c53132bw.A00;
                        if (anonymousClass0973 == null || !anonymousClass0972.A0n.equals(anonymousClass0973.A0n)) {
                            C09H c09h = anonymousClass0972.A02;
                            if (c09h != null && !c09h.A0P) {
                                break;
                            }
                        }
                    }
                    c53132bw.A00 = null;
                    c53132bw.A01 = null;
                    if (anonymousClass0972 != null) {
                        c53132bw.A01(anonymousClass0972, C0DB.A0b(anonymousClass0972) ? 3 : 0);
                    }
                }
            });
        }
    }
}
