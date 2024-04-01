package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.0r2 */
/* loaded from: classes.dex */
public abstract class AbstractC16800r2 {
    public static final String A05 = AbstractC16430qO.A01("ConstraintTracker");
    public Object A00;
    public final Context A01;
    public final InterfaceC17300rs A02;
    public final Object A03 = new Object();
    public final Set A04 = new LinkedHashSet();

    public abstract Object A00();

    public abstract void A01();

    public abstract void A02();

    public AbstractC16800r2(Context context, InterfaceC17300rs taskExecutor) {
        this.A01 = context.getApplicationContext();
        this.A02 = taskExecutor;
    }

    public void A03(InterfaceC16740qw listener) {
        synchronized (this.A03) {
            Set set = this.A04;
            if (set.remove(listener) && set.isEmpty()) {
                A02();
            }
        }
    }

    public void A04(Object newState) {
        synchronized (this.A03) {
            Object obj = this.A00;
            if (obj == newState || (obj != null && obj.equals(newState))) {
                return;
            }
            this.A00 = newState;
            final ArrayList arrayList = new ArrayList(this.A04);
            ((C1WH) this.A02).A02.execute(new Runnable() { // from class: X.0r1
                {
                    AbstractC16800r2.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    for (InterfaceC16740qw interfaceC16740qw : arrayList) {
                        interfaceC16740qw.AIy(AbstractC16800r2.this.A00);
                    }
                }
            });
        }
    }
}
