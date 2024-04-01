package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.1cY  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31611cY extends C08G implements C08H {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.17e
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31611cY[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            Status status = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                if ((65535 & readInt) != 1) {
                    C07K.A1H(parcel, readInt);
                } else {
                    status = (Status) C07K.A0W(parcel, readInt, Status.CREATOR);
                }
            }
            C07K.A1G(parcel, A09);
            return new C31611cY(status);
        }
    };
    public final Status A00;

    public C31611cY(Status status) {
        this.A00 = status;
    }

    @Override // X.C08H
    public final Status ADG() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1L(parcel, 1, this.A00, i, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
