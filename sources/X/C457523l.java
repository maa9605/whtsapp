package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.23l  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C457523l implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.3a1
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C457523l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C457523l[i];
        }
    };
    public int A00;
    public int A01;
    public Intent A02;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C457523l(Intent intent, int i, int i2) {
        this.A02 = intent;
        this.A01 = i;
        this.A00 = i2;
    }

    public C457523l(Parcel parcel) {
        Intent intent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        if (intent != null) {
            this.A02 = intent;
            this.A01 = parcel.readInt();
            this.A00 = parcel.readInt();
            return;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
