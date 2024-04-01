package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Ty  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28821Ty extends C14250me {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0mo
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C28821Ty(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C28821Ty[i];
        }
    };
    public int A00;

    public C28821Ty(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
    }

    public C28821Ty(Parcelable parcelable, int i) {
        super(parcelable);
        this.A00 = i;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }
}
