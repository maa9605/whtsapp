package X;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.3Sb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C70383Sb {
    public final Set A03 = new HashSet();
    public long A00 = SystemClock.elapsedRealtime();
    public boolean A01 = false;
    public final InterfaceC70393Sc A02 = new InterfaceC70393Sc() { // from class: X.3kG
        @Override // X.InterfaceC70393Sc
        public final boolean AH1() {
            C70383Sb c70383Sb = C70383Sb.this;
            C000700j.A01();
            if (!c70383Sb.A01) {
                c70383Sb.A01 = true;
                Set<C78613kE> set = c70383Sb.A03;
                for (C78613kE c78613kE : set) {
                    c78613kE.A00();
                }
                set.clear();
                return true;
            }
            return true;
        }
    };

    public C70383Sb(final View view) {
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.3Sa
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                C70383Sb c70383Sb = C70383Sb.this;
                if (c70383Sb != null) {
                    C000700j.A01();
                    if (c70383Sb.A01) {
                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                        return true;
                    }
                    c70383Sb.A00 = SystemClock.elapsedRealtime();
                    return true;
                }
                throw null;
            }
        });
    }
}
