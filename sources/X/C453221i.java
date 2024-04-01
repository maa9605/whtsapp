package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.21i  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C453221i {
    public C0K0 A00;
    public final long A01;
    public final AnonymousClass094 A02;
    public final List A03;

    public C453221i(long j, List list, AnonymousClass094 anonymousClass094) {
        ArrayList arrayList = new ArrayList();
        this.A03 = arrayList;
        this.A02 = anonymousClass094;
        this.A01 = j;
        if (list != null) {
            arrayList.addAll(list);
        }
    }
}
