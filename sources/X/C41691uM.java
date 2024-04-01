package X;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.1uM  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41691uM {
    public static volatile C41691uM A06;
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final C41541u6 A01;
    public final C05W A02;
    public final AnonymousClass008 A03;
    public final C0CA A04;
    public final C41681uL A05;

    public C41691uM(C41541u6 c41541u6, C05W c05w, AnonymousClass008 anonymousClass008, C0CA c0ca, C41681uL c41681uL) {
        this.A01 = c41541u6;
        this.A02 = c05w;
        this.A03 = anonymousClass008;
        this.A04 = c0ca;
        this.A05 = c41681uL;
    }

    public static C41691uM A00() {
        if (A06 == null) {
            synchronized (C41691uM.class) {
                if (A06 == null) {
                    A06 = new C41691uM(C41541u6.A00(), C05W.A00(), AnonymousClass008.A01, C0CA.A00(), C41681uL.A00());
                }
            }
        }
        return A06;
    }

    public void A01(Collection collection) {
        if (this.A01.A0T.A02()) {
            return;
        }
        this.A02.A0O(collection);
        this.A05.A05(new ArrayList(collection));
    }
}
