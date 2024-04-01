package android.support.v4.media;

import X.C000200d;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0fe
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new RatingCompat[i];
        }
    };
    public final float A00;
    public final int A01;

    public RatingCompat(int i, float f) {
        this.A01 = i;
        this.A00 = f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("Rating:style=");
        A0P.append(this.A01);
        A0P.append(" rating=");
        float f = this.A00;
        A0P.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return A0P.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
    }
}
