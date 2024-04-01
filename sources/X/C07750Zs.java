package X;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Zs */
/* loaded from: classes.dex */
public final class C07750Zs {
    public static final Class[] A03;
    public final InterfaceC09030cV A00;
    public final Map A01;
    public final Map A02;

    static {
        Class[] clsArr = new Class[29];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = Double.TYPE;
        clsArr[3] = double[].class;
        Class<SizeF> cls = Integer.TYPE;
        clsArr[4] = cls;
        clsArr[5] = int[].class;
        clsArr[6] = Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = String.class;
        clsArr[9] = String[].class;
        clsArr[10] = Binder.class;
        clsArr[11] = Bundle.class;
        clsArr[12] = Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = CharSequence.class;
        clsArr[17] = CharSequence[].class;
        clsArr[18] = ArrayList.class;
        clsArr[19] = Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = Parcelable.class;
        clsArr[22] = Parcelable[].class;
        clsArr[23] = Serializable.class;
        clsArr[24] = Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = SparseArray.class;
        int i = Build.VERSION.SDK_INT;
        clsArr[27] = i >= 21 ? Size.class : cls;
        if (i >= 21) {
            cls = SizeF.class;
        }
        clsArr[28] = cls;
        A03 = clsArr;
    }

    public C07750Zs() {
        this.A01 = new HashMap();
        this.A00 = new InterfaceC09030cV() { // from class: X.0cU
            {
                C07750Zs.this = this;
            }

            @Override // X.InterfaceC09030cV
            public Bundle ASA() {
                Map map = C07750Zs.this.A02;
                Set keySet = map.keySet();
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(keySet.size());
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
                for (Object obj : keySet) {
                    arrayList.add(obj);
                    arrayList2.add(map.get(obj));
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("keys", arrayList);
                bundle.putParcelableArrayList("values", arrayList2);
                return bundle;
            }
        };
        this.A02 = new HashMap();
    }

    public C07750Zs(Map map) {
        this.A01 = new HashMap();
        this.A00 = new InterfaceC09030cV() { // from class: X.0cU
            {
                C07750Zs.this = this;
            }

            @Override // X.InterfaceC09030cV
            public Bundle ASA() {
                Map map2 = C07750Zs.this.A02;
                Set keySet = map2.keySet();
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(keySet.size());
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
                for (Object obj : keySet) {
                    arrayList.add(obj);
                    arrayList2.add(map2.get(obj));
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("keys", arrayList);
                bundle.putParcelableArrayList("values", arrayList2);
                return bundle;
            }
        };
        this.A02 = new HashMap(map);
    }

    public static C07750Zs A00(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return new C07750Zs();
        }
        HashMap hashMap = new HashMap();
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                hashMap.put(str, bundle2.get(str));
            }
        }
        if (bundle == null) {
            return new C07750Zs(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                hashMap.put(parcelableArrayList.get(i), parcelableArrayList2.get(i));
            }
            return new C07750Zs(hashMap);
        }
        throw new IllegalStateException("Invalid bundle passed as restored state");
    }

    public final C0HK A01(String str, boolean z, Object obj) {
        C09040cW c09040cW;
        Map map = this.A01;
        C0HK c0hk = (C0HK) map.get(str);
        if (c0hk != null) {
            return c0hk;
        }
        Map map2 = this.A02;
        if (map2.containsKey(str)) {
            c09040cW = new C09040cW(this, str, map2.get(str));
        } else if (z) {
            c09040cW = new C09040cW(this, str, obj);
        } else {
            c09040cW = new C09040cW(this, str);
        }
        map.put(str, c09040cW);
        return c09040cW;
    }

    public void A02(String str, Object obj) {
        if (obj != null) {
            for (Class cls : A03) {
                if (!cls.isInstance(obj)) {
                }
            }
            StringBuilder A0P = C000200d.A0P("Can't put value with type ");
            A0P.append(obj.getClass());
            A0P.append(" into saved state");
            throw new IllegalArgumentException(A0P.toString());
        }
        C0HL c0hl = (C0HL) this.A01.get(str);
        if (c0hl != null) {
            c0hl.A0B(obj);
        } else {
            this.A02.put(str, obj);
        }
    }
}
