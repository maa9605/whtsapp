package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.07l */
/* loaded from: classes.dex */
public final class C015907l implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0uC
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C015907l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C015907l[i];
        }
    };
    public final float A00;
    public final float A01;
    public final float A02;
    public final C016007m A03;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C015907l(C016007m c016007m, float f, float f2, float f3) {
        this.A03 = c016007m;
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
    }

    public C015907l(Parcel parcel) {
        this.A03 = (C016007m) parcel.readParcelable(C016007m.class.getClassLoader());
        this.A02 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A00 = parcel.readFloat();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C015907l) {
            C015907l c015907l = (C015907l) obj;
            if (this.A00 == c015907l.A00) {
                C016007m c016007m = this.A03;
                return c016007m == null ? c015907l.A03 == null : c016007m.equals(c015907l.A03) && this.A01 == c015907l.A01 && this.A02 == c015907l.A02;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        C016007m c016007m = this.A03;
        return (int) (((((((c016007m != null ? 527.0f + c016007m.hashCode() : 17.0f) * 31.0f) + this.A02) * 31.0f) + this.A01) * 31.0f) + this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CameraPosition");
        sb.append("{target=");
        sb.append(this.A03);
        sb.append(", zoom=");
        sb.append(this.A02);
        sb.append(", tilt=");
        sb.append(this.A01);
        sb.append(", bearing=");
        sb.append(this.A00);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, i);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }
}
