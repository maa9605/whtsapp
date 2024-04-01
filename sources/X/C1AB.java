package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1AB  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1AB extends AbstractC39731qd {
    public static final HashMap A05;
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.13N
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            HashSet hashSet = new HashSet();
            ArrayList arrayList = null;
            int i = 0;
            C1AA c1aa = null;
            int i2 = 0;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i3 = 65535 & readInt;
                if (i3 == 1) {
                    i = C07K.A0A(parcel, readInt);
                    hashSet.add(1);
                } else if (i3 == 2) {
                    arrayList = C07K.A0z(parcel, readInt, C1A9.CREATOR);
                    hashSet.add(2);
                } else if (i3 == 3) {
                    i2 = C07K.A0A(parcel, readInt);
                    hashSet.add(3);
                } else if (i3 != 4) {
                    C07K.A1H(parcel, readInt);
                } else {
                    c1aa = (C1AA) C07K.A0W(parcel, readInt, C1AA.CREATOR);
                    hashSet.add(4);
                }
            }
            if (parcel.dataPosition() == A09) {
                return new C1AB(hashSet, i, arrayList, i2, c1aa);
            }
            throw new C07L(C000200d.A07(37, "Overread allowed size end=", A09), parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C1AB[i];
        }
    };
    public int A00;
    public C1AA A01;
    public ArrayList A02;
    public final int A03;
    public final Set A04;

    public C1AB(Set set, int i, ArrayList arrayList, int i2, C1AA c1aa) {
        this.A04 = set;
        this.A03 = i;
        this.A02 = arrayList;
        this.A00 = i2;
        this.A01 = c1aa;
    }

    static {
        HashMap hashMap = new HashMap();
        A05 = hashMap;
        hashMap.put("authenticatorData", new C31211bt(11, true, 11, true, "authenticatorData", 2, C1A9.class));
        A05.put("progress", new C31211bt(11, false, 11, false, "progress", 4, C1AA.class));
    }

    public C1AB() {
        this.A04 = new HashSet(1);
        this.A03 = 1;
    }

    @Override // X.AbstractC231215h
    public final Object A02(C31211bt c31211bt) {
        int i = c31211bt.A05;
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    return this.A01;
                }
                throw new IllegalStateException(C000200d.A07(37, "Unknown SafeParcelable id=", i));
            }
            return this.A02;
        }
        return Integer.valueOf(this.A03);
    }

    @Override // X.AbstractC231215h
    public final boolean A03(C31211bt c31211bt) {
        return this.A04.contains(Integer.valueOf(c31211bt.A05));
    }

    @Override // X.AbstractC231215h
    public final /* synthetic */ Map A05() {
        return A05;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        Set set = this.A04;
        if (set.contains(1)) {
            AnonymousClass088.A1G(parcel, 1, this.A03);
        }
        if (set.contains(2)) {
            AnonymousClass088.A1O(parcel, 2, this.A02, true);
        }
        if (set.contains(3)) {
            AnonymousClass088.A1G(parcel, 3, this.A00);
        }
        if (set.contains(4)) {
            AnonymousClass088.A1L(parcel, 4, this.A01, i, true);
        }
        AnonymousClass088.A1D(parcel, A03);
    }
}
