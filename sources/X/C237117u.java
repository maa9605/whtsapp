package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.17u  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C237117u {
    static {
        C237117u.class.getClassLoader();
    }

    public static Parcelable A00(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
