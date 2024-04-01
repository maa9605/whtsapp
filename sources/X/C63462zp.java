package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.2zp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C63462zp extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2zo
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C63462zp(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C63462zp[i];
        }
    };
    public final float A00;
    public final int A01;

    public C63462zp(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readFloat();
    }

    public C63462zp(Parcelable parcelable, int i, float f) {
        super(parcelable);
        this.A01 = i;
        this.A00 = f;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
    }
}
