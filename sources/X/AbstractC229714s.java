package X;

import java.util.ArrayList;

/* renamed from: X.14s  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC229714s {
    public Object A00;
    public boolean A01 = false;
    public final /* synthetic */ AbstractC229914u A02;

    public AbstractC229714s(AbstractC229914u abstractC229914u, Object obj) {
        this.A02 = abstractC229914u;
        this.A00 = obj;
    }

    public abstract void A01(Object obj);

    public final void A00() {
        synchronized (this) {
            this.A00 = null;
        }
        ArrayList arrayList = this.A02.A0N;
        synchronized (arrayList) {
            arrayList.remove(this);
        }
    }
}
