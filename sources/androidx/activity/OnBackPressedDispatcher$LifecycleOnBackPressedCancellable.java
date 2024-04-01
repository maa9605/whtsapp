package androidx.activity;

import X.AbstractC02530Bu;
import X.C02520Bt;
import X.C0C1;
import X.C0U8;
import X.C0UA;
import X.C0UL;
import X.C0YQ;
import X.InterfaceC02360Aw;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements C0YQ, C0UA {
    public C0YQ A00;
    public final C0UL A01;
    public final AbstractC02530Bu A02;
    public final /* synthetic */ C0U8 A03;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(C0U8 c0u8, AbstractC02530Bu abstractC02530Bu, C0UL c0ul) {
        this.A03 = c0u8;
        this.A02 = abstractC02530Bu;
        this.A01 = c0ul;
        abstractC02530Bu.A02(this);
    }

    @Override // X.C0UA
    public void AOy(InterfaceC02360Aw interfaceC02360Aw, C0C1 c0c1) {
        if (c0c1 == C0C1.ON_START) {
            final C0U8 c0u8 = this.A03;
            final C0UL c0ul = this.A01;
            c0u8.A01.add(c0ul);
            C0YQ c0yq = new C0YQ(c0ul) { // from class: X.0cq
                public final C0UL A00;

                {
                    this.A00 = c0ul;
                }

                @Override // X.C0YQ
                public void cancel() {
                    ArrayDeque arrayDeque = C0U8.this.A01;
                    C0UL c0ul2 = this.A00;
                    arrayDeque.remove(c0ul2);
                    c0ul2.A00.remove(this);
                }
            };
            c0ul.A00.add(c0yq);
            this.A00 = c0yq;
        } else if (c0c1 == C0C1.ON_STOP) {
            C0YQ c0yq2 = this.A00;
            if (c0yq2 == null) {
                return;
            }
            c0yq2.cancel();
        } else if (c0c1 != C0C1.ON_DESTROY) {
        } else {
            cancel();
        }
    }

    @Override // X.C0YQ
    public void cancel() {
        ((C02520Bt) this.A02).A01.A01(this);
        this.A01.A00.remove(this);
        C0YQ c0yq = this.A00;
        if (c0yq != null) {
            c0yq.cancel();
            this.A00 = null;
        }
    }
}
