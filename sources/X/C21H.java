package X;

import java.util.ArrayList;

/* renamed from: X.21H  reason: invalid class name */
/* loaded from: classes2.dex */
public class C21H extends C451920u {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21H(AbstractC000600i abstractC000600i, C01B c01b, C04300Jq c04300Jq, boolean z) {
        super(abstractC000600i, c01b, z);
        AbstractC005302j abstractC005302j = c04300Jq.A0n.A00;
        this.A00 = C003101m.A0P(abstractC005302j) ? 12 : 3;
        ArrayList arrayList = new ArrayList(1);
        this.A0J = arrayList;
        AbstractC005302j A0A = c04300Jq.A0A();
        if (A0A != null) {
            arrayList.add(A0A.getRawString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21H(AbstractC000600i abstractC000600i, C01B c01b, C04360Jw c04360Jw, boolean z) {
        super(abstractC000600i, c01b, z);
        AbstractC005302j abstractC005302j = c04360Jw.A0n.A00;
        this.A00 = C003101m.A0P(abstractC005302j) ? 12 : 3;
        this.A0A = c04360Jw.A0G;
        this.A0J = C003101m.A0E(c04360Jw.A01);
    }
}
