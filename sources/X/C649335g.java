package X;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.util.Log;

/* renamed from: X.35g  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C649335g extends C0ZT {
    public final C0ZT A00;

    public C649335g(C0ZT c0zt) {
        this.A00 = c0zt;
    }

    @Override // X.C0ZT
    public float A00(int i) {
        return this.A00.A00(i);
    }

    @Override // X.C0ZT
    public int A01(Object obj) {
        return this.A00.A01(obj);
    }

    @Override // X.C0ZT
    public Parcelable A02() {
        return this.A00.A02();
    }

    @Override // X.C0ZT
    public CharSequence A03(int i) {
        C0ZT c0zt = this.A00;
        if (c0zt.A0B() <= 0) {
            Log.i("infinitepageadapter/getpagetitle/count is zero");
            return null;
        }
        return c0zt.A03(i % c0zt.A0B());
    }

    @Override // X.C0ZT
    public void A04() {
        this.A00.A04();
    }

    @Override // X.C0ZT
    public void A05(DataSetObserver dataSetObserver) {
        this.A00.A05(dataSetObserver);
    }

    @Override // X.C0ZT
    public void A06(DataSetObserver dataSetObserver) {
        this.A00.A06(dataSetObserver);
    }

    @Override // X.C0ZT
    public void A07(Parcelable parcelable, ClassLoader classLoader) {
        this.A00.A07(parcelable, classLoader);
    }

    @Override // X.C0ZT
    public void A08(ViewGroup viewGroup) {
        this.A00.A08(viewGroup);
    }

    @Override // X.C0ZT
    public void A09(ViewGroup viewGroup) {
        this.A00.A09(viewGroup);
    }

    @Override // X.C0ZT
    public void A0A(ViewGroup viewGroup, int i, Object obj) {
        this.A00.A0A(viewGroup, i, obj);
    }

    @Override // X.C0ZT
    public int A0B() {
        C0ZT c0zt = this.A00;
        if (c0zt.A0B() < 214748364) {
            return c0zt.A0B() * 10;
        }
        return c0zt.A0B();
    }

    @Override // X.C0ZT
    public Object A0C(ViewGroup viewGroup, int i) {
        C0ZT c0zt = this.A00;
        if (c0zt.A0B() <= 0) {
            Log.i("infinitepageadapter/instantiateitem/count is zero");
            return null;
        }
        return c0zt.A0C(viewGroup, i % c0zt.A0B());
    }

    @Override // X.C0ZT
    public void A0D(ViewGroup viewGroup, int i, Object obj) {
        C0ZT c0zt = this.A00;
        if (c0zt.A0B() <= 0) {
            Log.i("infinitepageadapter/destroyitem/count is zero");
        } else {
            c0zt.A0D(viewGroup, i % c0zt.A0B(), obj);
        }
    }

    @Override // X.C0ZT
    public boolean A0E(View view, Object obj) {
        return this.A00.A0E(view, obj);
    }
}
