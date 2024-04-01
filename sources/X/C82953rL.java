package X;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.3rL */
/* loaded from: classes2.dex */
public class C82953rL extends AbstractC04890Mh {
    public ArrayList A00;
    public AbstractC461525e[] A01;
    public final /* synthetic */ C82963rM A02;

    public C82953rL(C82963rM c82963rM, AbstractC461525e[] abstractC461525eArr, ArrayList arrayList) {
        this.A02 = c82963rM;
        this.A00 = arrayList;
        this.A01 = abstractC461525eArr;
        A0B(true);
    }

    @Override // X.AbstractC04890Mh
    public long A00(int i) {
        if (super.A00) {
            String str = ((C3YJ) this.A00.get(i)).A01;
            C82963rM c82963rM = this.A02;
            HashMap hashMap = c82963rM.A0C;
            Number number = (Number) hashMap.get(str);
            if (number == null) {
                long j = c82963rM.A03;
                c82963rM.A03 = 1 + j;
                number = Long.valueOf(j);
                hashMap.put(str, number);
            }
            return number.longValue();
        }
        return -1L;
    }

    @Override // X.AbstractC04890Mh
    public void A07(C0TS c0ts) {
        if (c0ts instanceof C82923rI) {
            ((C82923rI) c0ts).A0C();
        }
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A00.size();
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        return this.A00.get(i) instanceof C82913rH ? 1 : 0;
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        if (i == 1) {
            C82963rM c82963rM = this.A02;
            return new C82923rI(c82963rM.A07, c82963rM.A0B, viewGroup);
        }
        return new C82933rJ(this.A02.A07, viewGroup);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x021d, code lost:
        if (r6 != 3) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0251  */
    /* JADX WARN: Type inference failed for: r2v12, types: [X.0ps, X.1ot] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0ps, X.1ot] */
    @Override // X.AbstractC04890Mh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0F(X.C0TS r23, int r24) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82953rL.A0F(X.0TS, int):void");
    }
}
