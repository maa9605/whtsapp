package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.16p  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C234316p {
    static {
        C234316p.class.getClassLoader();
    }

    public static Parcelable A00(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
