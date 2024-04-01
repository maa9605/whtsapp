package X;

import android.view.ViewGroup;
import com.whatsapp.StickyHeadersRecyclerView;

/* renamed from: X.1jO  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C35591jO extends AbstractC04890Mh {
    public AbstractC04890Mh A00;

    public C35591jO(AbstractC04890Mh abstractC04890Mh) {
        this.A00 = abstractC04890Mh;
        A0B(abstractC04890Mh.A00);
        abstractC04890Mh.A01.registerObserver(new AbstractC15100o5() { // from class: X.1jN
            @Override // X.AbstractC15100o5
            public void A00() {
                C35591jO.this.A01();
            }
        });
    }

    @Override // X.AbstractC04890Mh
    public long A00(int i) {
        long A0G = A0G(i);
        if (StickyHeadersRecyclerView.A09(A0G)) {
            return ((C1LE) this.A00).AAS((int) (A0G >> 32));
        }
        return this.A00.A00((int) (A0G & 4294967295L));
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return ((C1LE) this.A00).AAR() + this.A00.A0C();
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        long A0G = A0G(i);
        if (StickyHeadersRecyclerView.A09(A0G)) {
            return -1000;
        }
        return this.A00.A0D((int) (A0G & 4294967295L));
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        if (i == -1000) {
            return ((C1LE) this.A00).AJ6(viewGroup);
        }
        return this.A00.A0E(viewGroup, i);
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        long A0G = A0G(i);
        if (StickyHeadersRecyclerView.A09(A0G)) {
            ((C1LE) this.A00).AHy(c0ts, (int) (A0G >> 32));
        } else {
            this.A00.A0F(c0ts, (int) (A0G & 4294967295L));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        r2 = r2 << 32;
        r0 = (r9 - r5) + r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long A0G(int r9) {
        /*
            r8 = this;
            X.0Mh r7 = r8.A00
            X.1LE r7 = (X.C1LE) r7
            int r3 = r7.AAR()
            r2 = 0
            r6 = 0
            r5 = 0
        Lb:
            r4 = 32
            if (r2 >= r3) goto L1a
            if (r5 != r9) goto L1e
            long r2 = (long) r2
            long r2 = r2 << r4
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
        L18:
            long r2 = r2 | r0
            return r2
        L1a:
            int r0 = r3 + (-1)
            long r2 = (long) r0
            goto L29
        L1e:
            int r5 = r5 + 1
            int r1 = r7.A9A(r2)
            int r0 = r5 + r1
            if (r0 <= r9) goto L2e
            long r2 = (long) r2
        L29:
            long r2 = r2 << r4
            int r9 = r9 - r5
            int r9 = r9 + r6
            long r0 = (long) r9
            goto L18
        L2e:
            int r6 = r6 + r1
            int r2 = r2 + 1
            r5 = r0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35591jO.A0G(int):long");
    }
}
