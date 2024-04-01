package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0fw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10370fw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new C10380fx(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C10380fx[i];
    }
}
