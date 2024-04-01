package X;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.1Uj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28911Uj implements InterfaceC15880pU, InterfaceC15870pT {
    public static final TreeMap A08 = new TreeMap();
    public int A00;
    public final int A01;
    public final double[] A02;
    public final int[] A03;
    public final long[] A04;
    public final String[] A05;
    public final byte[][] A06;
    public volatile String A07;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public C28911Uj(int i) {
        this.A01 = i;
        int i2 = i + 1;
        this.A03 = new int[i2];
        this.A04 = new long[i2];
        this.A02 = new double[i2];
        this.A05 = new String[i2];
        this.A06 = new byte[i2];
    }

    public static C28911Uj A00(String str, int i) {
        TreeMap treeMap = A08;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                C28911Uj c28911Uj = (C28911Uj) ceilingEntry.getValue();
                c28911Uj.A07 = str;
                c28911Uj.A00 = i;
                return c28911Uj;
            }
            C28911Uj c28911Uj2 = new C28911Uj(i);
            c28911Uj2.A07 = str;
            c28911Uj2.A00 = i;
            return c28911Uj2;
        }
    }

    public void A01() {
        TreeMap treeMap = A08;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.A01), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    public void A02(int i, String str) {
        this.A03[i] = 4;
        this.A05[i] = str;
    }

    @Override // X.InterfaceC15880pU
    public void A5i(InterfaceC15870pT interfaceC15870pT) {
        for (int i = 1; i <= this.A00; i++) {
            int i2 = this.A03[i];
            if (i2 == 1) {
                ((C28961Up) interfaceC15870pT).A00.bindNull(i);
            } else if (i2 == 2) {
                ((C28961Up) interfaceC15870pT).A00.bindLong(i, this.A04[i]);
            } else if (i2 == 3) {
                ((C28961Up) interfaceC15870pT).A00.bindDouble(i, this.A02[i]);
            } else if (i2 == 4) {
                ((C28961Up) interfaceC15870pT).A00.bindString(i, this.A05[i]);
            } else if (i2 == 5) {
                ((C28961Up) interfaceC15870pT).A00.bindBlob(i, this.A06[i]);
            }
        }
    }

    @Override // X.InterfaceC15880pU
    public String ADE() {
        return this.A07;
    }
}
