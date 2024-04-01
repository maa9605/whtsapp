package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.1dG  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31981dG extends C08G implements C08H {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.18t
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            int i = 0;
            Intent intent = null;
            int i2 = 0;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i3 = 65535 & readInt;
                if (i3 == 1) {
                    i = C07K.A0A(parcel, readInt);
                } else if (i3 == 2) {
                    i2 = C07K.A0A(parcel, readInt);
                } else if (i3 != 3) {
                    C07K.A1H(parcel, readInt);
                } else {
                    intent = (Intent) C07K.A0W(parcel, readInt, Intent.CREATOR);
                }
            }
            C07K.A1G(parcel, A09);
            return new C31981dG(i, i2, intent);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31981dG[i];
        }
    };
    public int A00;
    public Intent A01;
    public final int A02;

    public C31981dG() {
        this.A02 = 2;
        this.A00 = 0;
        this.A01 = null;
    }

    public C31981dG(int i, int i2, Intent intent) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = intent;
    }

    @Override // X.C08H
    public final Status ADG() {
        if (this.A00 == 0) {
            return Status.A07;
        }
        return Status.A04;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A02);
        AnonymousClass088.A1G(parcel, 2, this.A00);
        AnonymousClass088.A1L(parcel, 3, this.A01, i, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
