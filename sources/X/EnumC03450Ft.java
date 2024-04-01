package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: X.0Ft  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC03450Ft {
    UNENCRYPTED(0),
    CRYPT12(12),
    CRYPT13(13),
    CRYPT14(14),
    CRYPT15(15);
    
    public static SparseArray A00;
    public static EnumC03450Ft A01;
    public static EnumC03450Ft A02;
    public final int version;

    EnumC03450Ft(int i) {
        this.version = i;
    }

    public static synchronized EnumC03450Ft A00() {
        EnumC03450Ft enumC03450Ft;
        EnumC03450Ft[] values;
        synchronized (EnumC03450Ft.class) {
            enumC03450Ft = A01;
            if (enumC03450Ft == null) {
                enumC03450Ft = CRYPT15;
                for (EnumC03450Ft enumC03450Ft2 : values()) {
                    if (enumC03450Ft2.version > enumC03450Ft.version) {
                        enumC03450Ft = enumC03450Ft2;
                    }
                }
                A01 = enumC03450Ft;
            }
        }
        return enumC03450Ft;
    }

    public static synchronized EnumC03450Ft A01() {
        EnumC03450Ft enumC03450Ft;
        EnumC03450Ft[] values;
        synchronized (EnumC03450Ft.class) {
            enumC03450Ft = A02;
            if (enumC03450Ft == null) {
                enumC03450Ft = CRYPT12;
                for (EnumC03450Ft enumC03450Ft2 : values()) {
                    if (enumC03450Ft2.version < enumC03450Ft.version) {
                        enumC03450Ft = enumC03450Ft2;
                    }
                }
                A02 = enumC03450Ft;
            }
        }
        return enumC03450Ft;
    }

    public static synchronized EnumC03450Ft A02(int i) {
        EnumC03450Ft enumC03450Ft;
        synchronized (EnumC03450Ft.class) {
            if (A00 == null) {
                A03();
            }
            enumC03450Ft = (EnumC03450Ft) A00.get(i);
        }
        return enumC03450Ft;
    }

    public static synchronized void A03() {
        EnumC03450Ft[] values;
        synchronized (EnumC03450Ft.class) {
            A00 = new SparseArray(values().length);
            for (EnumC03450Ft enumC03450Ft : values()) {
                A00.append(enumC03450Ft.version, enumC03450Ft);
            }
        }
    }

    public static synchronized EnumC03450Ft[] A04(EnumC03450Ft enumC03450Ft, EnumC03450Ft enumC03450Ft2) {
        EnumC03450Ft[] enumC03450FtArr;
        synchronized (EnumC03450Ft.class) {
            if (A00 == null) {
                A03();
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                SparseArray sparseArray = A00;
                if (i < sparseArray.size()) {
                    int keyAt = sparseArray.keyAt(i);
                    if (keyAt >= enumC03450Ft.version && keyAt <= enumC03450Ft2.version) {
                        arrayList.add(A00.get(keyAt));
                    }
                    i++;
                } else {
                    Collections.sort(arrayList, new Comparator() { // from class: X.3Zr
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return ((EnumC03450Ft) obj).version - ((EnumC03450Ft) obj2).version;
                        }
                    });
                    enumC03450FtArr = (EnumC03450Ft[]) arrayList.toArray(new EnumC03450Ft[0]);
                }
            }
        }
        return enumC03450FtArr;
    }
}
