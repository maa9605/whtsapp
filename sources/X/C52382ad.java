package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2ad  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52382ad {
    public final List A00;
    public final List A01;
    public final List A02;
    public final List A03;

    public C52382ad(List list, List list2, List list3, List list4) {
        this.A01 = list;
        this.A02 = list2;
        this.A03 = list3;
        this.A00 = list4;
    }

    public static C52382ad A00() {
        return new C52382ad(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());
    }

    public C52382ad A01() {
        return new C52382ad(new ArrayList(this.A01), new ArrayList(this.A02), new ArrayList(this.A03), new ArrayList(this.A00));
    }
}
