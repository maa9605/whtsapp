package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.10L  reason: invalid class name */
/* loaded from: classes.dex */
public final class C10L implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.10J
        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C10L[0];
        }

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C10L(parcel);
        }
    };
    public final C10K[] A00;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10L(Parcel parcel) {
        this.A00 = new C10K[parcel.readInt()];
        int i = 0;
        while (true) {
            C10K[] c10kArr = this.A00;
            if (i >= c10kArr.length) {
                return;
            }
            c10kArr[i] = parcel.readParcelable(C10K.class.getClassLoader());
            i++;
        }
    }

    public C10L(List list) {
        C10K[] c10kArr = new C10K[list.size()];
        this.A00 = c10kArr;
        list.toArray(c10kArr);
    }

    public C10L(C10K... c10kArr) {
        this.A00 = c10kArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10L.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A00, ((C10L) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C10K[] c10kArr = this.A00;
        parcel.writeInt(c10kArr.length);
        for (C10K c10k : c10kArr) {
            parcel.writeParcelable(c10k, 0);
        }
    }
}
