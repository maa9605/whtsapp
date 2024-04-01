package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.0oS */
/* loaded from: classes.dex */
public class C15330oS implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0oR
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C15330oS(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C15330oS[i];
        }
    };
    public int A00;
    public int A01;
    public boolean A02;
    public int[] A03;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C15330oS() {
    }

    public C15330oS(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt() == 1;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.A03 = iArr;
            parcel.readIntArray(iArr);
        }
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("FullSpanItem{mPosition=");
        A0P.append(this.A01);
        A0P.append(", mGapDir=");
        A0P.append(this.A00);
        A0P.append(", mHasUnwantedGapAfter=");
        A0P.append(this.A02);
        A0P.append(", mGapPerSpan=");
        A0P.append(Arrays.toString(this.A03));
        A0P.append('}');
        return A0P.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int length;
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        int[] iArr = this.A03;
        if (iArr != null && (length = iArr.length) > 0) {
            parcel.writeInt(length);
            parcel.writeIntArray(this.A03);
            return;
        }
        parcel.writeInt(0);
    }
}
