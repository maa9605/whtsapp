package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;

/* renamed from: X.31U  reason: invalid class name */
/* loaded from: classes2.dex */
public class C31U extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.31T
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C31U(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C31U[i];
        }
    };
    public final String A00;
    public final String A01;

    public C31U(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public C31U(Parcelable parcelable, String str, String str2) {
        super(parcelable);
        if (!TextUtils.isEmpty(str2)) {
            this.A01 = str;
            this.A00 = str2;
            return;
        }
        this.A01 = null;
        this.A00 = null;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
