package X;

import android.util.SparseArray;

/* renamed from: X.0vn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19660vn {
    public C19650vm A00;
    public C19650vm A01;
    public final SparseArray A02 = new SparseArray();

    public final synchronized void A00(C19650vm c19650vm) {
        C19650vm c19650vm2 = c19650vm.A02;
        C19650vm c19650vm3 = c19650vm.A01;
        if (c19650vm2 != null) {
            c19650vm2.A01 = c19650vm3;
        }
        if (c19650vm3 != null) {
            c19650vm3.A02 = c19650vm2;
        }
        c19650vm.A02 = null;
        c19650vm.A01 = null;
        if (c19650vm == this.A00) {
            this.A00 = c19650vm3;
        }
        if (c19650vm == this.A01) {
            this.A01 = c19650vm2;
        }
    }
}
