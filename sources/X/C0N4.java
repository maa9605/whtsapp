package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.0N4  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0N4 extends C0N2 {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2uK
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C0N4(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C0N4[i];
        }
    };
    public long A00;
    public C014006r A01;
    public final LinkedHashSet A02;

    @Override // X.C0N2
    public int A08() {
        return 3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C0N4(C03650Gn c03650Gn, String str, int i, int i2, String str2, BigDecimal bigDecimal, LinkedHashSet linkedHashSet) {
        this.A02 = linkedHashSet;
        if (c03650Gn != null) {
            this.A05 = c03650Gn;
            A06(i);
            A05(i2);
            this.A07 = str;
            this.A0A = str2;
            A09(c03650Gn, bigDecimal);
            return;
        }
        throw null;
    }

    public C0N4(Parcel parcel) {
        A07(parcel);
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        this.A02 = new LinkedHashSet();
        for (int i = 0; i < readInt; i++) {
            this.A02.add(C013606n.A00(parcel));
        }
        A09(this.A05, new BigDecimal(readString));
    }

    public void A09(C03650Gn c03650Gn, BigDecimal bigDecimal) {
        InterfaceC013706o interfaceC013706o;
        if (bigDecimal == null || c03650Gn == null) {
            return;
        }
        LinkedHashSet linkedHashSet = c03650Gn.A0A;
        LinkedHashSet linkedHashSet2 = this.A02;
        if (linkedHashSet2 != null && linkedHashSet != null) {
            Iterator it = linkedHashSet2.iterator();
            while (it.hasNext()) {
                interfaceC013706o = (InterfaceC013706o) it.next();
                if (linkedHashSet.contains(interfaceC013706o)) {
                    break;
                }
            }
        }
        interfaceC013706o = C013806p.A06;
        this.A01 = new C014006r(bigDecimal, interfaceC013706o.A9i());
    }

    @Override // X.C0N2
    public String toString() {
        StringBuilder A0P = C000200d.A0P("[ WALLET: ");
        A0P.append(super.toString());
        A0P.append(" balance: ");
        A0P.append(this.A01);
        A0P.append(" ]");
        return A0P.toString();
    }

    @Override // X.C0N2, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01.toString());
        LinkedHashSet linkedHashSet = this.A02;
        parcel.writeInt(linkedHashSet.size());
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC013706o) it.next()).writeToParcel(parcel, i);
        }
    }
}
