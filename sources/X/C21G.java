package X;

import java.util.ArrayList;

/* renamed from: X.21G  reason: invalid class name */
/* loaded from: classes2.dex */
public class C21G extends C451920u {
    public C21G(AbstractC000600i abstractC000600i, C01B c01b, C04300Jq c04300Jq, boolean z) {
        super(abstractC000600i, c01b, z);
        this.A00 = 7;
        ArrayList arrayList = new ArrayList(1);
        this.A0J = arrayList;
        AbstractC005302j A0A = c04300Jq.A0A();
        if (A0A == null) {
            throw null;
        }
        arrayList.add(A0A.getRawString());
    }

    public C21G(AbstractC000600i abstractC000600i, C01B c01b, C04360Jw c04360Jw, boolean z) {
        super(abstractC000600i, c01b, z);
        this.A00 = 7;
        this.A0A = c04360Jw.A0G;
        this.A0J = C003101m.A0E(c04360Jw.A01);
    }
}
