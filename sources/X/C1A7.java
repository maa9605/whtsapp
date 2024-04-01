package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1A7 */
/* loaded from: classes.dex */
public class C1A7 extends AbstractC39731qd {
    public static final HashMap A07;
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.13Q
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            HashSet hashSet = new HashSet();
            String str = null;
            int i = 0;
            byte[] bArr = null;
            PendingIntent pendingIntent = null;
            C30381aQ c30381aQ = null;
            int i2 = 0;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                switch (65535 & readInt) {
                    case 1:
                        i = C07K.A0A(parcel, readInt);
                        hashSet.add(1);
                        break;
                    case 2:
                        str = C07K.A0u(parcel, readInt);
                        hashSet.add(2);
                        break;
                    case 3:
                        i2 = C07K.A0A(parcel, readInt);
                        hashSet.add(3);
                        break;
                    case 4:
                        bArr = C07K.A1o(parcel, readInt);
                        hashSet.add(4);
                        break;
                    case 5:
                        pendingIntent = (PendingIntent) C07K.A0W(parcel, readInt, PendingIntent.CREATOR);
                        hashSet.add(5);
                        break;
                    case 6:
                        c30381aQ = (C30381aQ) C07K.A0W(parcel, readInt, C30381aQ.CREATOR);
                        hashSet.add(6);
                        break;
                    default:
                        C07K.A1H(parcel, readInt);
                        break;
                }
            }
            if (parcel.dataPosition() == A09) {
                return new C1A7(hashSet, i, str, i2, bArr, pendingIntent, c30381aQ);
            }
            throw new C07L(C000200d.A07(37, "Overread allowed size end=", A09), parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C1A7[i];
        }
    };
    public int A00;
    public PendingIntent A01;
    public C30381aQ A02;
    public String A03;
    public byte[] A04;
    public final int A05;
    public final Set A06;

    public C1A7(Set set, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, C30381aQ c30381aQ) {
        this.A06 = set;
        this.A05 = i;
        this.A03 = str;
        this.A00 = i2;
        this.A04 = bArr;
        this.A01 = pendingIntent;
        this.A02 = c30381aQ;
    }

    static {
        HashMap hashMap = new HashMap();
        A07 = hashMap;
        hashMap.put("accountType", new C31211bt(7, false, 7, false, "accountType", 2, null));
        HashMap hashMap2 = A07;
        hashMap2.put("status", new C31211bt(0, false, 0, false, "status", 3, null));
        hashMap2.put("transferBytes", new C31211bt(8, false, 8, false, "transferBytes", 4, null));
    }

    public C1A7() {
        this.A06 = new AnonymousClass036(3);
        this.A05 = 1;
    }

    @Override // X.AbstractC231215h
    public Object A02(C31211bt c31211bt) {
        int i = c31211bt.A05;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return this.A04;
                    }
                    throw new IllegalStateException(C000200d.A07(37, "Unknown SafeParcelable id=", i));
                }
                return Integer.valueOf(this.A00);
            }
            return this.A03;
        }
        return Integer.valueOf(this.A05);
    }

    @Override // X.AbstractC231215h
    public boolean A03(C31211bt c31211bt) {
        return this.A06.contains(Integer.valueOf(c31211bt.A05));
    }

    @Override // X.AbstractC231215h
    public /* synthetic */ Map A05() {
        return A07;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        Set set = this.A06;
        if (set.contains(1)) {
            AnonymousClass088.A1G(parcel, 1, this.A05);
        }
        if (set.contains(2)) {
            AnonymousClass088.A1M(parcel, 2, this.A03, true);
        }
        if (set.contains(3)) {
            AnonymousClass088.A1G(parcel, 3, this.A00);
        }
        if (set.contains(4)) {
            AnonymousClass088.A1Q(parcel, 4, this.A04, true);
        }
        if (set.contains(5)) {
            AnonymousClass088.A1L(parcel, 5, this.A01, i, true);
        }
        if (set.contains(6)) {
            AnonymousClass088.A1L(parcel, 6, this.A02, i, true);
        }
        AnonymousClass088.A1D(parcel, A03);
    }
}
