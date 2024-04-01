package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* renamed from: X.2aX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52322aX implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2vf
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C52322aX(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C52322aX[i];
        }
    };
    public final C42611w2 A00;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C52322aX(C42611w2 c42611w2) {
        this.A00 = c42611w2;
    }

    public C52322aX(Parcel parcel) {
        Byte b;
        Parcelable readParcelable = parcel.readParcelable(Uri.class.getClassLoader());
        if (readParcelable != null) {
            C42611w2 c42611w2 = new C42611w2((Uri) readParcelable);
            this.A00 = c42611w2;
            if (parcel.readByte() == 1) {
                b = Byte.valueOf(parcel.readByte());
            } else {
                b = null;
            }
            c42611w2.A0A(b);
            String readString = parcel.readString();
            C42611w2 c42611w22 = this.A00;
            File file = readString == null ? null : new File(readString);
            synchronized (c42611w22) {
                c42611w22.A06 = file;
            }
            this.A00.A0B(parcel.readString());
            this.A00.A0C(parcel.readString());
            C42611w2 c42611w23 = this.A00;
            String readString2 = parcel.readString();
            synchronized (c42611w23) {
                c42611w23.A09 = readString2;
            }
            C42611w2 c42611w24 = this.A00;
            String readString3 = parcel.readString();
            synchronized (c42611w24) {
                c42611w24.A0A = readString3;
            }
            C42611w2 c42611w25 = this.A00;
            int readInt = parcel.readInt();
            synchronized (c42611w25) {
                c42611w25.A01 = readInt;
            }
            String readString4 = parcel.readString();
            C42611w2 c42611w26 = this.A00;
            File file2 = readString4 != null ? new File(readString4) : null;
            synchronized (c42611w26) {
                c42611w26.A05 = file2;
            }
            C42611w2 c42611w27 = this.A00;
            Rect rect = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
            synchronized (c42611w27) {
                c42611w27.A03 = rect;
            }
            C42611w2 c42611w28 = this.A00;
            boolean z = parcel.readByte() == 1;
            synchronized (c42611w28) {
                c42611w28.A0E = z;
            }
            C42611w2 c42611w29 = this.A00;
            Point point = (Point) parcel.readParcelable(Point.class.getClassLoader());
            synchronized (c42611w29) {
                c42611w29.A02 = point;
            }
            C42611w2 c42611w210 = this.A00;
            int readInt2 = parcel.readInt();
            synchronized (c42611w210) {
                c42611w210.A00 = readInt2;
            }
            return;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str;
        Rect rect;
        C42611w2 c42611w2 = this.A00;
        parcel.writeParcelable(c42611w2.A0F, i);
        Byte A06 = c42611w2.A06();
        if (A06 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeByte(A06.byteValue());
        }
        parcel.writeString(c42611w2.A05() == null ? null : c42611w2.A05().getAbsolutePath());
        parcel.writeString(c42611w2.A07());
        parcel.writeString(c42611w2.A09());
        parcel.writeString(c42611w2.A08());
        synchronized (c42611w2) {
            str = c42611w2.A0A;
        }
        parcel.writeString(str);
        parcel.writeInt(c42611w2.A01());
        parcel.writeString(c42611w2.A03() != null ? c42611w2.A03().getAbsolutePath() : null);
        synchronized (c42611w2) {
            rect = c42611w2.A03;
        }
        parcel.writeParcelable(rect, i);
        parcel.writeByte(c42611w2.A0D() ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(c42611w2.A02(), i);
        parcel.writeInt(c42611w2.A00());
    }
}
