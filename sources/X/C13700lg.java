package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.0lg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13700lg implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0lf
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C13700lg(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C13700lg[i];
        }
    };
    public int A00;
    public String A01;
    public ArrayList A02;
    public ArrayList A03;
    public C13550lR[] A04;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C13700lg() {
        this.A01 = null;
    }

    public C13700lg(Parcel parcel) {
        this.A01 = null;
        this.A02 = parcel.createTypedArrayList(C13720li.CREATOR);
        this.A03 = parcel.createStringArrayList();
        this.A04 = (C13550lR[]) parcel.createTypedArray(C13550lR.CREATOR);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.A02);
        parcel.writeStringList(this.A03);
        parcel.writeTypedArray(this.A04, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
    }
}
