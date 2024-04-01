package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.3NV  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3NV {
    public String A03;
    public int A02 = -1;
    public int A01 = -1;
    public int A00 = -1;
    public final CopyOnWriteArrayList A06 = new CopyOnWriteArrayList();
    public final ArrayList A04 = new ArrayList();
    public final HashMap A05 = new HashMap();

    public int A00(String str) {
        Number number = (Number) this.A05.get(str);
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public void A01() {
        this.A06.add("done");
    }

    public synchronized void A02(String str) {
        this.A06.add(str);
    }

    public synchronized void A03(String str) {
        this.A06.add(str);
    }

    public synchronized void A04(String str) {
        this.A06.add(str);
    }

    public synchronized void A05(String str) {
        this.A04.add(str);
        CopyOnWriteArrayList copyOnWriteArrayList = this.A06;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-success");
        copyOnWriteArrayList.add(sb.toString());
    }

    public synchronized void A06(String str, int i) {
        HashMap hashMap = this.A05;
        Integer num = (Integer) hashMap.get(str);
        Integer valueOf = Integer.valueOf(Integer.valueOf(num == null ? 0 : num.intValue()).intValue() + 1);
        hashMap.put(str, valueOf);
        this.A00 = i;
        this.A03 = str;
        CopyOnWriteArrayList copyOnWriteArrayList = this.A06;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-error-");
        sb.append(valueOf);
        sb.append("-");
        sb.append(i);
        copyOnWriteArrayList.add(sb.toString());
    }

    public boolean A07(String str) {
        Number number = (Number) this.A05.get(str);
        if (this.A04.contains(str)) {
            return false;
        }
        return number == null || number.intValue() < 3;
    }

    public String toString() {
        return this.A06.toString();
    }
}
