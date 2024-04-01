package X;

import android.util.SparseArray;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/* renamed from: X.0vr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC19700vr {
    public final Set A01 = new HashSet();
    public final C19660vn A00 = new C19660vn();

    public abstract int A01(Object obj);

    public Object A02(int i) {
        Object pollFirst;
        C19660vn c19660vn = this.A00;
        synchronized (c19660vn) {
            C19650vm c19650vm = (C19650vm) c19660vn.A02.get(i);
            if (c19650vm != null) {
                pollFirst = c19650vm.A03.pollFirst();
                if (c19660vn.A00 != c19650vm) {
                    c19660vn.A00(c19650vm);
                    C19650vm c19650vm2 = c19660vn.A00;
                    if (c19650vm2 == null) {
                        c19660vn.A00 = c19650vm;
                        c19660vn.A01 = c19650vm;
                    } else {
                        c19650vm.A01 = c19650vm2;
                        c19650vm2.A02 = c19650vm;
                        c19660vn.A00 = c19650vm;
                    }
                }
            } else {
                pollFirst = null;
            }
        }
        if (pollFirst != null) {
            synchronized (this) {
                this.A01.remove(pollFirst);
            }
            return pollFirst;
        }
        return pollFirst;
    }

    public void A03(Object obj) {
        boolean add;
        synchronized (this) {
            add = this.A01.add(obj);
        }
        if (add) {
            C19660vn c19660vn = this.A00;
            int A01 = A01(obj);
            synchronized (c19660vn) {
                SparseArray sparseArray = c19660vn.A02;
                C19650vm c19650vm = (C19650vm) sparseArray.get(A01);
                if (c19650vm == null) {
                    c19650vm = new C19650vm(A01, new LinkedList());
                    sparseArray.put(A01, c19650vm);
                }
                c19650vm.A03.addLast(obj);
                if (c19660vn.A00 != c19650vm) {
                    c19660vn.A00(c19650vm);
                    C19650vm c19650vm2 = c19660vn.A00;
                    if (c19650vm2 == null) {
                        c19660vn.A00 = c19650vm;
                        c19660vn.A01 = c19650vm;
                    } else {
                        c19650vm.A01 = c19650vm2;
                        c19650vm2.A02 = c19650vm;
                        c19660vn.A00 = c19650vm;
                    }
                }
            }
        }
    }
}
