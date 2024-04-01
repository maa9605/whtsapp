package X;

import android.os.ConditionVariable;
import java.util.Iterator;

/* renamed from: X.05h  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C010605h extends AnonymousClass038 {
    public static final C010605h A03 = new C010605h();
    public final Object A02 = new Object();
    public final ConditionVariable A01 = new ConditionVariable(false);
    public boolean A00 = false;

    public void A02(boolean z) {
        synchronized (this.A02) {
            if (this.A00 == z) {
                return;
            }
            this.A00 = z;
            if (!z) {
                this.A01.close();
            } else {
                this.A01.open();
            }
            synchronized (super.A00) {
                Iterator it = super.A00.iterator();
                while (true) {
                    C0G5 c0g5 = (C0G5) it;
                    if (c0g5.hasNext()) {
                        ((C0EM) c0g5.next()).AIL(z);
                    }
                }
            }
        }
    }

    public boolean A03() {
        boolean z;
        synchronized (this.A02) {
            z = this.A00;
        }
        return z;
    }
}
