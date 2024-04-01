package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.2zt  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C63502zt extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2zs
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C63502zt(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C63502zt[i];
        }
    };
    public final float A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C63502zt(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readInt() == 1;
        this.A00 = parcel.readFloat();
    }

    public C63502zt(Parcelable parcelable, String str, String str2, boolean z, float f) {
        super(parcelable);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
        this.A00 = f;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeFloat(this.A00);
    }
}
