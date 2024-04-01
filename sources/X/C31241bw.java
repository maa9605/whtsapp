package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.1bw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31241bw extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.15l
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = null;
            ArrayList arrayList = null;
            int i = 0;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i2 = 65535 & readInt;
                if (i2 == 1) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i2 == 2) {
                    str = C07K.A0u(parcel, readInt);
                } else if (i2 != 3) {
                    C07K.A1H(parcel, readInt);
                } else {
                    arrayList = C07K.A0z(parcel, readInt, C31251bx.CREATOR);
                }
            }
            C07K.A1G(parcel, A09);
            return new C31241bw(i, str, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31241bw[i];
        }
    };
    public final int A00;
    public final String A01;
    public final ArrayList A02;

    public C31241bw(int i, String str, ArrayList arrayList) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = arrayList;
    }

    public C31241bw(String str, Map map) {
        ArrayList arrayList;
        this.A00 = 1;
        this.A01 = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new C31251bx(str2, (C31211bt) map.get(str2)));
            }
        }
        this.A02 = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A00);
        AnonymousClass088.A1M(parcel, 2, this.A01, false);
        AnonymousClass088.A1O(parcel, 3, this.A02, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
