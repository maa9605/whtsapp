package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* renamed from: X.2aD  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52192aD implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2vS
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C52192aD(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C52192aD[i];
        }
    };
    public final byte A00;
    public final int A01;
    public final File A02;
    public final boolean A03;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C52192aD(InterfaceC52182aC interfaceC52182aC) {
        this.A00 = interfaceC52182aC.ADz();
        this.A02 = interfaceC52182aC.AAA();
        this.A03 = interfaceC52182aC.AFH();
        this.A01 = interfaceC52182aC.ACu();
    }

    public C52192aD(Parcel parcel) {
        this.A00 = parcel.readByte();
        String readString = parcel.readString();
        if (readString != null) {
            this.A02 = new File(readString);
            this.A03 = parcel.readByte() == 1;
            this.A01 = parcel.readInt();
            return;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A00);
        parcel.writeString(this.A02.getAbsolutePath());
        parcel.writeByte(this.A03 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A01);
    }
}
