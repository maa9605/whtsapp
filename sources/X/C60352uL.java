package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.2uL  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C60352uL {
    public final int A00;
    public final List A01;

    public C60352uL(int i) {
        this.A01 = Collections.emptyList();
        this.A00 = i;
    }

    public C60352uL(List list) {
        this.A01 = Collections.unmodifiableList(list);
        this.A00 = 0;
    }
}
