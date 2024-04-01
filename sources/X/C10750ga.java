package X;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0ga  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C10750ga {
    public Interpolator A01;
    public C0TU A02;
    public boolean A03;
    public long A00 = -1;
    public final C06680Un A04 = new C06680Un() { // from class: X.1nn
        public boolean A01 = false;
        public int A00 = 0;

        @Override // X.C0TU
        public void AH8(View view) {
            int i = this.A00 + 1;
            this.A00 = i;
            C10750ga c10750ga = C10750ga.this;
            if (i == c10750ga.A05.size()) {
                C0TU c0tu = c10750ga.A02;
                if (c0tu != null) {
                    c0tu.AH8(null);
                }
                this.A00 = 0;
                this.A01 = false;
                c10750ga.A03 = false;
            }
        }

        @Override // X.C06680Un, X.C0TU
        public void AHC(View view) {
            if (this.A01) {
                return;
            }
            this.A01 = true;
            C0TU c0tu = C10750ga.this.A02;
            if (c0tu != null) {
                c0tu.AHC(null);
            }
        }
    };
    public final ArrayList A05 = new ArrayList();

    public void A00() {
        if (this.A03) {
            Iterator it = this.A05.iterator();
            while (it.hasNext()) {
                ((C0TT) it.next()).A00();
            }
            this.A03 = false;
        }
    }

    public void A01() {
        View view;
        if (this.A03) {
            return;
        }
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            C0TT c0tt = (C0TT) it.next();
            long j = this.A00;
            if (j >= 0) {
                c0tt.A04(j);
            }
            Interpolator interpolator = this.A01;
            if (interpolator != null && (view = (View) c0tt.A01.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.A02 != null) {
                c0tt.A06(this.A04);
            }
            c0tt.A01();
        }
        this.A03 = true;
    }
}
