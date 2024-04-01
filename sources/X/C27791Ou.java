package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Ou  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C27791Ou implements Parcelable, Comparable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2tx
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C27791Ou(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C27791Ou[i];
        }
    };
    public C27631Od A00;
    public final String A01;
    public transient AbstractC005302j A02;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C27791Ou(AbstractC005302j abstractC005302j, C27631Od c27631Od) {
        this.A02 = abstractC005302j;
        this.A01 = abstractC005302j.getRawString();
        this.A00 = c27631Od;
    }

    public C27791Ou(Parcel parcel) {
        String readString = parcel.readString();
        if (readString != null) {
            this.A01 = readString;
            C27631Od c27631Od = (C27631Od) parcel.readParcelable(C27631Od.class.getClassLoader());
            if (c27631Od == null) {
                throw null;
            }
            this.A00 = c27631Od;
            return;
        }
        throw null;
    }

    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public int compareTo(C27791Ou c27791Ou) {
        C27631Od c27631Od = c27791Ou.A00;
        long j = c27631Od.A0G;
        C27631Od c27631Od2 = this.A00;
        int signum = (int) Math.signum((float) (j - c27631Od2.A0G));
        return signum == 0 ? (int) Math.signum(c27631Od.A06 - c27631Od2.A06) : signum;
    }

    public synchronized AbstractC005302j A01() {
        AbstractC005302j abstractC005302j;
        abstractC005302j = this.A02;
        if (abstractC005302j == null) {
            String str = this.A01;
            abstractC005302j = AbstractC005302j.A02(str);
            StringBuilder sb = new StringBuilder();
            sb.append("contactRawJid = ");
            sb.append(str);
            C000700j.A04(abstractC005302j, sb.toString());
            this.A02 = abstractC005302j;
        }
        return abstractC005302j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
