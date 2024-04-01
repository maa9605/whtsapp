package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1A9  reason: invalid class name */
/* loaded from: classes.dex */
public class C1A9 extends AbstractC39731qd {
    public static final HashMap A06;
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.13P
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            HashSet hashSet = new HashSet();
            C1A7 c1a7 = null;
            int i = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i2 = 65535 & readInt;
                if (i2 == 1) {
                    i = C07K.A0A(parcel, readInt);
                    hashSet.add(1);
                } else if (i2 == 2) {
                    c1a7 = (C1A7) C07K.A0W(parcel, readInt, C1A7.CREATOR);
                    hashSet.add(2);
                } else if (i2 == 3) {
                    str = C07K.A0u(parcel, readInt);
                    hashSet.add(3);
                } else if (i2 == 4) {
                    str2 = C07K.A0u(parcel, readInt);
                    hashSet.add(4);
                } else if (i2 != 5) {
                    C07K.A1H(parcel, readInt);
                } else {
                    str3 = C07K.A0u(parcel, readInt);
                    hashSet.add(5);
                }
            }
            if (parcel.dataPosition() == A09) {
                return new C1A9(hashSet, i, c1a7, str, str2, str3);
            }
            throw new C07L(C000200d.A07(37, "Overread allowed size end=", A09), parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C1A9[i];
        }
    };
    public C1A7 A00;
    public String A01;
    public String A02;
    public String A03;
    public final int A04;
    public final Set A05;

    public C1A9() {
        this.A05 = new HashSet(3);
        this.A04 = 1;
    }

    static {
        HashMap hashMap = new HashMap();
        A06 = hashMap;
        hashMap.put("authenticatorInfo", new C31211bt(11, false, 11, false, "authenticatorInfo", 2, C1A7.class));
        HashMap hashMap2 = A06;
        hashMap2.put("signature", new C31211bt(7, false, 7, false, "signature", 3, null));
        hashMap2.put("package", new C31211bt(7, false, 7, false, "package", 4, null));
    }

    public C1A9(Set set, int i, C1A7 c1a7, String str, String str2, String str3) {
        this.A05 = set;
        this.A04 = i;
        this.A00 = c1a7;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
    }

    @Override // X.AbstractC231215h
    public Object A02(C31211bt c31211bt) {
        int i = c31211bt.A05;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return this.A01;
                    }
                    throw new IllegalStateException(C000200d.A07(37, "Unknown SafeParcelable id=", i));
                }
                return this.A02;
            }
            return this.A00;
        }
        return Integer.valueOf(this.A04);
    }

    @Override // X.AbstractC231215h
    public boolean A03(C31211bt c31211bt) {
        return this.A05.contains(Integer.valueOf(c31211bt.A05));
    }

    @Override // X.AbstractC231215h
    public /* synthetic */ Map A05() {
        return A06;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        Set set = this.A05;
        if (set.contains(1)) {
            AnonymousClass088.A1G(parcel, 1, this.A04);
        }
        if (set.contains(2)) {
            AnonymousClass088.A1L(parcel, 2, this.A00, i, true);
        }
        if (set.contains(3)) {
            AnonymousClass088.A1M(parcel, 3, this.A02, true);
        }
        if (set.contains(4)) {
            AnonymousClass088.A1M(parcel, 4, this.A01, true);
        }
        if (set.contains(5)) {
            AnonymousClass088.A1M(parcel, 5, this.A03, true);
        }
        AnonymousClass088.A1D(parcel, A03);
    }
}
