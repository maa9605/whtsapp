package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* renamed from: X.0me  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C14250me extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0md
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C14250me(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C14250me[i];
        }
    };

    public C14250me(Parcel parcel) {
        super(parcel);
    }

    public C14250me(Parcelable parcelable) {
        super(parcelable);
    }
}
