package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.1br */
/* loaded from: classes.dex */
public final class C31191br extends C08G implements InterfaceC231115g {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.15e
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            int i = 0;
            ArrayList arrayList = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i2 = 65535 & readInt;
                if (i2 == 1) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i2 != 2) {
                    C07K.A1H(parcel, readInt);
                } else {
                    arrayList = C07K.A0z(parcel, readInt, C31181bq.CREATOR);
                }
            }
            C07K.A1G(parcel, A09);
            return new C31191br(i, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31191br[i];
        }
    };
    public final int A00;
    public final SparseArray A01;
    public final HashMap A02;

    public C31191br() {
        this.A00 = 1;
        this.A02 = new HashMap();
        this.A01 = new SparseArray();
    }

    public C31191br(int i, ArrayList arrayList) {
        this.A00 = i;
        this.A02 = new HashMap();
        this.A01 = new SparseArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            C31181bq c31181bq = (C31181bq) obj;
            String str = c31181bq.A02;
            int i3 = c31181bq.A01;
            this.A02.put(str, Integer.valueOf(i3));
            this.A01.put(i3, str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A00);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.A02;
        for (String str : hashMap.keySet()) {
            arrayList.add(new C31181bq(str, ((Number) hashMap.get(str)).intValue()));
        }
        AnonymousClass088.A1O(parcel, 2, arrayList, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
