package X;

import java.util.TreeMap;

/* renamed from: X.0wn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C20090wn {
    public C20080wm A00;
    public boolean A01;

    public C20090wn(C20180wy c20180wy) {
        int[] iArr;
        TreeMap treeMap = c20180wy.A07.A01;
        if (treeMap == null || (iArr = (int[]) treeMap.get("trace_config.duration_condition")) == null || iArr.length <= 0) {
            return;
        }
        this.A00 = new C20080wm(iArr);
        this.A01 = true;
    }
}
