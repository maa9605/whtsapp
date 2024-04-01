package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.1a6  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC30211a6 implements InterfaceC06380Sv {
    public int A00;
    public AnonymousClass126 A01;
    public final ArrayList A02 = new ArrayList(1);
    public final boolean A03;

    public AbstractC30211a6(boolean z) {
        this.A03 = z;
    }

    public final void A00() {
        AnonymousClass126 anonymousClass126 = this.A01;
        for (int i = 0; i < this.A00; i++) {
            ((C12L) this.A02.get(i)).APr(this, anonymousClass126, this.A03);
        }
        this.A01 = null;
    }

    public final void A01() {
        for (int i = 0; i < this.A00; i++) {
            this.A02.get(i);
        }
    }

    public final void A02(int i) {
        AnonymousClass126 anonymousClass126 = this.A01;
        for (int i2 = 0; i2 < this.A00; i2++) {
            ((C12L) this.A02.get(i2)).AI4(this, anonymousClass126, this.A03, i);
        }
    }

    public final void A03(AnonymousClass126 anonymousClass126) {
        this.A01 = anonymousClass126;
        for (int i = 0; i < this.A00; i++) {
            ((C12L) this.A02.get(i)).APs(this, anonymousClass126, this.A03);
        }
    }

    @Override // X.InterfaceC06380Sv
    public final void A5K(C12L c12l) {
        ArrayList arrayList = this.A02;
        if (arrayList.contains(c12l)) {
            return;
        }
        arrayList.add(c12l);
        this.A00++;
    }

    @Override // X.InterfaceC06380Sv
    public /* synthetic */ Map ACr() {
        return Collections.emptyMap();
    }
}
