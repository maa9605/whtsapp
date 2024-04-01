package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1is  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC35271is extends C0ZT {
    public int A0F(Object obj) {
        return -1;
    }

    public abstract Object A0G(ViewGroup viewGroup, int i);

    public void A0H(ViewGroup viewGroup, int i, Object obj) {
    }

    public abstract void A0I(ViewGroup viewGroup, int i, Object obj);

    public abstract boolean A0J(View view, Object obj);

    @Override // X.C0ZT
    public final int A01(Object obj) {
        return A0F(obj);
    }

    @Override // X.C0ZT
    public final void A0A(ViewGroup viewGroup, int i, Object obj) {
        A0H(viewGroup, i, obj);
    }

    @Override // X.C0ZT
    public final Object A0C(ViewGroup viewGroup, int i) {
        return A0G(viewGroup, i);
    }

    @Override // X.C0ZT
    public final void A0D(ViewGroup viewGroup, int i, Object obj) {
        A0I(viewGroup, i, obj);
    }

    @Override // X.C0ZT
    public final boolean A0E(View view, Object obj) {
        return A0J(view, obj);
    }
}
