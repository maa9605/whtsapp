package X;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.1d8  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C31901d8 extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.18s
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31901d8[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = null;
            DataHolder dataHolder = null;
            ParcelFileDescriptor parcelFileDescriptor = null;
            byte[] bArr = null;
            long j = 0;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i = 65535 & readInt;
                if (i == 2) {
                    str = C07K.A0u(parcel, readInt);
                } else if (i == 3) {
                    dataHolder = (DataHolder) C07K.A0W(parcel, readInt, DataHolder.CREATOR);
                } else if (i == 4) {
                    parcelFileDescriptor = (ParcelFileDescriptor) C07K.A0W(parcel, readInt, ParcelFileDescriptor.CREATOR);
                } else if (i == 5) {
                    j = C07K.A0N(parcel, readInt);
                } else if (i != 6) {
                    C07K.A1H(parcel, readInt);
                } else {
                    bArr = C07K.A1o(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C31901d8(str, dataHolder, parcelFileDescriptor, j, bArr);
        }
    };
    public long A00;
    public ParcelFileDescriptor A01;
    public DataHolder A02;
    public String A03;
    public byte[] A04;

    public C31901d8(String str, DataHolder dataHolder, ParcelFileDescriptor parcelFileDescriptor, long j, byte[] bArr) {
        this.A03 = str;
        this.A02 = dataHolder;
        this.A01 = parcelFileDescriptor;
        this.A00 = j;
        this.A04 = bArr;
    }

    public C31901d8() {
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
        this.A00 = 0L;
        this.A04 = null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1M(parcel, 2, this.A03, false);
        AnonymousClass088.A1L(parcel, 3, this.A02, i, false);
        AnonymousClass088.A1L(parcel, 4, this.A01, i, false);
        AnonymousClass088.A1I(parcel, 5, this.A00);
        AnonymousClass088.A1Q(parcel, 6, this.A04, false);
        AnonymousClass088.A1D(parcel, A03);
        this.A01 = null;
    }
}
