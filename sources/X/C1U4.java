package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1U4  reason: invalid class name */
/* loaded from: classes.dex */
public class C1U4 extends C14250me {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0n2
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C1U4(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C1U4[i];
        }
    };
    public int A00;
    public int A01;
    public int A02;

    public C1U4(Parcel parcel) {
        super(parcel);
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public C1U4(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
