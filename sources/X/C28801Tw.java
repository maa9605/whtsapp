package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1Tw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28801Tw extends C14250me {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0ma
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C28801Tw(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C28801Tw[i];
        }
    };
    public Set A00;

    public C28801Tw(Parcel parcel) {
        super(parcel);
        int readInt = parcel.readInt();
        this.A00 = new HashSet();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Collections.addAll(this.A00, strArr);
    }

    public C28801Tw(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00.size());
        Set set = this.A00;
        parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
    }
}
