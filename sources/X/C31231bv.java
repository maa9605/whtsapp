package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1bv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31231bv extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.15k
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            ArrayList arrayList = null;
            String str = null;
            int i = 0;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i2 = 65535 & readInt;
                if (i2 == 1) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i2 == 2) {
                    arrayList = C07K.A0z(parcel, readInt, C31241bw.CREATOR);
                } else if (i2 != 3) {
                    C07K.A1H(parcel, readInt);
                } else {
                    str = C07K.A0u(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C31231bv(i, arrayList, str);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31231bv[i];
        }
    };
    public final int A00;
    public final String A01;
    public final HashMap A02;

    public C31231bv(int i, ArrayList arrayList, String str) {
        this.A00 = i;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C31241bw c31241bw = (C31241bw) arrayList.get(i2);
            String str2 = c31241bw.A01;
            HashMap hashMap2 = new HashMap();
            int size2 = c31241bw.A02.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C31251bx c31251bx = (C31251bx) c31241bw.A02.get(i3);
                hashMap2.put(c31251bx.A02, c31251bx.A01);
            }
            hashMap.put(str2, hashMap2);
        }
        this.A02 = hashMap;
        C07K.A1P(str);
        this.A01 = str;
        for (Object obj : hashMap.keySet()) {
            Map map = (Map) this.A02.get(obj);
            for (Object obj2 : map.keySet()) {
                ((C31211bt) map.get(obj2)).A01 = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = this.A02;
        for (String str : hashMap.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) hashMap.get(str);
            for (String str2 : map.keySet()) {
                C000200d.A1T(sb, "  ", str2, ": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A00);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.A02;
        for (String str : hashMap.keySet()) {
            arrayList.add(new C31241bw(str, (Map) hashMap.get(str)));
        }
        AnonymousClass088.A1O(parcel, 2, arrayList, false);
        AnonymousClass088.A1M(parcel, 3, this.A01, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
