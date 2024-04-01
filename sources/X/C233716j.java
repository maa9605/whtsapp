package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.16j  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C233716j {
    static {
        C233716j.class.getClassLoader();
    }

    public static Parcelable A00(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void A01(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
