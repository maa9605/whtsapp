package X;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0ZT  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0ZT {
    public DataSetObserver A00;
    public final DataSetObservable A01 = new DataSetObservable();

    public float A00(int i) {
        return 1.0f;
    }

    public int A01(Object obj) {
        return -1;
    }

    public Parcelable A02() {
        return null;
    }

    public CharSequence A03(int i) {
        return null;
    }

    public void A07(Parcelable parcelable, ClassLoader classLoader) {
    }

    public void A08(ViewGroup viewGroup) {
    }

    public void A09(ViewGroup viewGroup) {
    }

    public void A0A(ViewGroup viewGroup, int i, Object obj) {
    }

    public abstract int A0B();

    public abstract boolean A0E(View view, Object obj);

    public void A04() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.A00;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.A01.notifyChanged();
    }

    public void A05(DataSetObserver dataSetObserver) {
        this.A01.registerObserver(dataSetObserver);
    }

    public void A06(DataSetObserver dataSetObserver) {
        this.A01.unregisterObserver(dataSetObserver);
    }

    public Object A0C(ViewGroup viewGroup, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public void A0D(ViewGroup viewGroup, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }
}
