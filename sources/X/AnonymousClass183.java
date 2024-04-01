package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.183  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass183 {
    static {
        AnonymousClass183.class.getClassLoader();
    }

    public static Parcelable A00(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
