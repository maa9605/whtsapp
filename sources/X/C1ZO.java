package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1ZO  reason: invalid class name */
/* loaded from: classes.dex */
public class C1ZO implements InterfaceC21720zn {
    public static List A00(C21690zk c21690zk) {
        int i = c21690zk.A01;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            C21680zj c21680zj = c21690zk.A03[i2];
            if (c21680zj.A00(null) || (C20910yU.A00.equals(null) && c21680zj.A00(C20910yU.A01))) {
                arrayList.add(c21680zj);
            }
        }
        return arrayList;
    }
}
