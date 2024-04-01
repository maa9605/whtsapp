package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.3lV  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C79343lV extends C04420Kc {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.3TJ
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C79343lV(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C79343lV[i];
        }
    };
    public long A00;
    public long A01;
    public DeviceJid A02;
    public String A03;

    public C79343lV(C04420Kc c04420Kc, DeviceJid deviceJid, String str, long j, long j2) {
        super(c04420Kc);
        this.A02 = deviceJid;
        this.A03 = str;
        this.A00 = j;
        this.A01 = j2;
    }

    public C79343lV(Parcel parcel) {
        super(parcel);
        this.A02 = (DeviceJid) parcel.readParcelable(DeviceJid.class.getClassLoader());
        String readString = parcel.readString();
        if (readString != null) {
            this.A03 = readString;
            this.A00 = parcel.readLong();
            this.A01 = parcel.readLong();
            return;
        }
        throw null;
    }

    @Override // X.C04420Kc
    public C02590Ca A01() {
        long j = this.A00;
        if (j > 0 || this.A01 > 0) {
            DeviceJid deviceJid = this.A02;
            int i = 1;
            int i2 = (deviceJid != null ? 1 : 0) + 1 + (j > 0 ? 1 : 0);
            long j2 = this.A01;
            C04P[] c04pArr = new C04P[i2 + (j2 > 0 ? 1 : 0)];
            c04pArr[0] = new C04P("call-id", this.A03, null, (byte) 0);
            if (deviceJid != null) {
                c04pArr[1] = new C04P("call-creator", deviceJid);
                i = 2;
            }
            if (j > 0) {
                c04pArr[i] = new C04P("audio_duration", String.valueOf(j), null, (byte) 0);
                i++;
            }
            if (j2 > 0) {
                c04pArr[i] = new C04P("video_duration", String.valueOf(j2), null, (byte) 0);
            }
            return new C02590Ca("terminate", c04pArr, null, null);
        }
        return null;
    }

    @Override // X.C04420Kc, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
    }
}
