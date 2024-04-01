package X;

import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.1z4  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44431z4 {
    public static volatile C44431z4 A05;
    public Runnable A01;
    public final InterfaceC002901k A04;
    public final C450520f A03 = new AnonymousClass038() { // from class: X.20f
    };
    public final C450120b A02 = new AnonymousClass064() { // from class: X.20b
    };
    public C450420e A00 = new C450420e();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.20f] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.20b] */
    public C44431z4(InterfaceC002901k interfaceC002901k) {
        this.A04 = interfaceC002901k;
    }

    public static C44431z4 A00() {
        if (A05 == null) {
            synchronized (C44431z4.class) {
                if (A05 == null) {
                    A05 = new C44431z4(C002801j.A00());
                }
            }
        }
        return A05;
    }

    public final void A01() {
        if (this.A00.A03()) {
            boolean A02 = this.A00.A02();
            C000200d.A1C("CriticalDataUploadManager/handleCompleted isSuccess=", A02);
            synchronized (this) {
                Runnable runnable = this.A01;
                if (runnable != null) {
                    this.A04.ART(runnable);
                    this.A01 = null;
                }
                C450420e c450420e = this.A00;
                C004802e c004802e = c450420e.A01;
                synchronized (c004802e) {
                    c004802e.A00 = 1;
                }
                C004802e c004802e2 = c450420e.A00;
                synchronized (c004802e2) {
                    c004802e2.A00 = 1;
                }
            }
            if (A02) {
                Set<InterfaceC450320d> set = this.A02.A00;
                synchronized (set) {
                    for (InterfaceC450320d interfaceC450320d : set) {
                        interfaceC450320d.APE();
                    }
                }
                return;
            }
            Set<InterfaceC450320d> set2 = this.A02.A00;
            synchronized (set2) {
                for (InterfaceC450320d interfaceC450320d2 : set2) {
                    interfaceC450320d2.AKB();
                }
            }
        }
    }

    public void A02(boolean z) {
        if (this.A00.A01() || !C450420e.A00(this.A00.A01, z)) {
            return;
        }
        StringBuilder sb = new StringBuilder("CriticalDataUploadManager/onHistorySyncComplete isSuccess=");
        sb.append(z);
        Log.i(sb.toString());
        A01();
    }

    public synchronized void A03(boolean z) {
        if (this.A00.A01() || !C450420e.A00(this.A00.A00, z)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CriticalDataUploadManager/onAppStateSyncComplete isSuccess=");
        sb.append(z);
        Log.i(sb.toString());
        A01();
    }
}
