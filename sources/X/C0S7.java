package X;

import android.database.Observable;

/* renamed from: X.0S7  reason: invalid class name */
/* loaded from: classes.dex */
public class C0S7 extends Observable {
    public void A00() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC15100o5) ((Observable) this).mObservers.get(size)).A00();
        }
    }

    public void A01(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC15100o5) ((Observable) this).mObservers.get(size)).A04(i, i2, 1);
        }
    }

    public void A02(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC15100o5) ((Observable) this).mObservers.get(size)).A02(i, i2);
        }
    }

    public void A03(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC15100o5) ((Observable) this).mObservers.get(size)).A03(i, i2);
        }
    }

    public void A04(int i, int i2, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC15100o5) ((Observable) this).mObservers.get(size)).A05(i, i2, obj);
        }
    }

    public boolean A05() {
        return !((Observable) this).mObservers.isEmpty();
    }
}
