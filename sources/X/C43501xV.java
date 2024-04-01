package X;

import android.util.Pair;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1xV  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43501xV {
    public final List A02;
    public final int A01 = 10;
    public final int A00 = 20;

    public C43501xV(List list) {
        this.A02 = list;
    }

    public static double A00(List list) {
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((Number) it.next()).intValue();
        }
        return j / list.size();
    }

    public final Pair A01() {
        List<Number> list = this.A02;
        double A00 = A00(list);
        double A002 = A00(list);
        double d = 0.0d;
        for (Number number : list) {
            double intValue = number.intValue() - A002;
            d += intValue * intValue;
        }
        double sqrt = Math.sqrt(d / list.size());
        return new Pair(Integer.valueOf((int) (A00 - (2.0d * sqrt))), Integer.valueOf((int) ((sqrt * 1.0d) + A00)));
    }

    public void A02(int i) {
        List list;
        if (A03()) {
            Pair A01 = A01();
            Object obj = A01.first;
            if (i < ((Number) obj).intValue()) {
                list = this.A02;
                list.add(obj);
            } else {
                Object obj2 = A01.second;
                if (i > ((Number) obj2).intValue()) {
                    list = this.A02;
                    list.add(obj2);
                } else {
                    list = this.A02;
                    list.add(Integer.valueOf(i));
                }
            }
            if (list.size() > this.A00) {
                list.remove(0);
                return;
            }
            return;
        }
        List list2 = this.A02;
        list2.add(Integer.valueOf(i));
        if (list2.size() < this.A01) {
            return;
        }
        Pair A012 = A01();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            int intValue = ((Number) list2.get(i2)).intValue();
            Object obj3 = A012.first;
            if (intValue < ((Number) obj3).intValue()) {
                list2.set(i2, obj3);
            } else {
                Object obj4 = A012.second;
                if (intValue > ((Number) obj4).intValue()) {
                    list2.set(i2, obj4);
                }
            }
        }
    }

    public boolean A03() {
        return this.A02.size() >= this.A01;
    }
}
