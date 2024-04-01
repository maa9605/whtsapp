package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: X.1ep  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C32841ep extends AbstractC13390lB {
    public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: X.1BZ
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C32841ep(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C32841ep(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C32841ep[i];
        }
    };
    public CharSequence A00;
    public boolean A01;

    public C32841ep(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A01 = parcel.readInt() == 1;
    }

    public C32841ep(Parcelable parcelable) {
        super(parcelable);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("TextInputLayout.SavedState{");
        A0P.append(Integer.toHexString(System.identityHashCode(this)));
        A0P.append(" error=");
        A0P.append((Object) this.A00);
        A0P.append("}");
        return A0P.toString();
    }

    @Override // X.AbstractC13390lB, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(super.A00, i);
        TextUtils.writeToParcel(this.A00, parcel, i);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
