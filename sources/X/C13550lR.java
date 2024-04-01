package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.0lR */
/* loaded from: classes.dex */
public final class C13550lR implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0lQ
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C13550lR(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C13550lR[i];
        }
    };
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final CharSequence A04;
    public final CharSequence A05;
    public final String A06;
    public final ArrayList A07;
    public final ArrayList A08;
    public final ArrayList A09;
    public final boolean A0A;
    public final int[] A0B;
    public final int[] A0C;
    public final int[] A0D;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C13550lR(C02820Cz c02820Cz) {
        ArrayList arrayList = c02820Cz.A0A;
        int size = arrayList.size();
        int[] iArr = new int[size * 5];
        this.A0D = iArr;
        if (c02820Cz.A0D) {
            ArrayList arrayList2 = new ArrayList(size);
            this.A07 = arrayList2;
            int[] iArr2 = new int[size];
            this.A0C = iArr2;
            int[] iArr3 = new int[size];
            this.A0B = iArr3;
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                C09320d3 c09320d3 = (C09320d3) arrayList.get(i2);
                int i3 = i + 1;
                iArr[i] = c09320d3.A00;
                C0BA c0ba = c09320d3.A05;
                arrayList2.add(c0ba != null ? c0ba.A0S : null);
                int i4 = i3 + 1;
                iArr[i3] = c09320d3.A01;
                int i5 = i4 + 1;
                iArr[i4] = c09320d3.A02;
                int i6 = i5 + 1;
                iArr[i5] = c09320d3.A03;
                i = i6 + 1;
                iArr[i6] = c09320d3.A04;
                iArr2[i2] = c09320d3.A07.ordinal();
                iArr3[i2] = c09320d3.A06.ordinal();
            }
            this.A03 = c02820Cz.A06;
            this.A06 = c02820Cz.A09;
            this.A02 = c02820Cz.A00;
            this.A01 = ((C0D0) c02820Cz).A01;
            this.A05 = c02820Cz.A08;
            this.A00 = ((C0D0) c02820Cz).A00;
            this.A04 = c02820Cz.A07;
            this.A08 = c02820Cz.A0B;
            this.A09 = c02820Cz.A0C;
            this.A0A = c02820Cz.A0F;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public C13550lR(Parcel parcel) {
        this.A0D = parcel.createIntArray();
        this.A07 = parcel.createStringArrayList();
        this.A0C = parcel.createIntArray();
        this.A0B = parcel.createIntArray();
        this.A03 = parcel.readInt();
        this.A06 = parcel.readString();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A05 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A00 = parcel.readInt();
        this.A04 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A08 = parcel.createStringArrayList();
        this.A09 = parcel.createStringArrayList();
        this.A0A = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.A0D);
        parcel.writeStringList(this.A07);
        parcel.writeIntArray(this.A0C);
        parcel.writeIntArray(this.A0B);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        TextUtils.writeToParcel(this.A05, parcel, 0);
        parcel.writeInt(this.A00);
        TextUtils.writeToParcel(this.A04, parcel, 0);
        parcel.writeStringList(this.A08);
        parcel.writeStringList(this.A09);
        parcel.writeInt(this.A0A ? 1 : 0);
    }
}
