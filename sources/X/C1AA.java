package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.1AA  reason: invalid class name */
/* loaded from: classes.dex */
public class C1AA extends AbstractC39731qd {
    public static final C006702y A06;
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.13O
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            int i = 0;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                switch (65535 & readInt) {
                    case 1:
                        i = C07K.A0A(parcel, readInt);
                        break;
                    case 2:
                        arrayList = C07K.A0y(parcel, readInt);
                        break;
                    case 3:
                        arrayList2 = C07K.A0y(parcel, readInt);
                        break;
                    case 4:
                        arrayList3 = C07K.A0y(parcel, readInt);
                        break;
                    case 5:
                        arrayList4 = C07K.A0y(parcel, readInt);
                        break;
                    case 6:
                        arrayList5 = C07K.A0y(parcel, readInt);
                        break;
                    default:
                        C07K.A1H(parcel, readInt);
                        break;
                }
            }
            C07K.A1G(parcel, A09);
            return new C1AA(i, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C1AA[i];
        }
    };
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public final int A05;

    public C1AA() {
        this.A05 = 1;
    }

    @Override // X.AbstractC231215h
    public boolean A03(C31211bt c31211bt) {
        return true;
    }

    static {
        C006702y c006702y = new C006702y();
        A06 = c006702y;
        c006702y.put("registered", C31211bt.A00("registered", 2));
        C006702y c006702y2 = A06;
        c006702y2.put("in_progress", C31211bt.A00("in_progress", 3));
        c006702y2.put("success", C31211bt.A00("success", 4));
        c006702y2.put("failed", C31211bt.A00("failed", 5));
        c006702y2.put("escrowed", C31211bt.A00("escrowed", 6));
    }

    public C1AA(int i, List list, List list2, List list3, List list4, List list5) {
        this.A05 = i;
        this.A00 = list;
        this.A01 = list2;
        this.A02 = list3;
        this.A03 = list4;
        this.A04 = list5;
    }

    @Override // X.AbstractC231215h
    public Object A02(C31211bt c31211bt) {
        int i = c31211bt.A05;
        switch (i) {
            case 1:
                return Integer.valueOf(this.A05);
            case 2:
                return this.A00;
            case 3:
                return this.A01;
            case 4:
                return this.A02;
            case 5:
                return this.A03;
            case 6:
                return this.A04;
            default:
                throw new IllegalStateException(C000200d.A07(37, "Unknown SafeParcelable id=", i));
        }
    }

    @Override // X.AbstractC231215h
    public Map A05() {
        return A06;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A05);
        AnonymousClass088.A1N(parcel, 2, this.A00);
        AnonymousClass088.A1N(parcel, 3, this.A01);
        AnonymousClass088.A1N(parcel, 4, this.A02);
        AnonymousClass088.A1N(parcel, 5, this.A03);
        AnonymousClass088.A1N(parcel, 6, this.A04);
        AnonymousClass088.A1D(parcel, A03);
    }
}
