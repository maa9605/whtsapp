package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Rh */
/* loaded from: classes2.dex */
public class C50332Rh implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.3TQ
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C50332Rh(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C50332Rh[i];
        }
    };
    public final UserJid A00;
    public final C50362Rk A01;
    public final List A02;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C50332Rh(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.A02 = arrayList;
        parcel.readList(arrayList, C50352Rj.class.getClassLoader());
        UserJid userJid = (UserJid) parcel.readParcelable(UserJid.class.getClassLoader());
        if (userJid != null) {
            this.A00 = userJid;
            C50362Rk c50362Rk = (C50362Rk) parcel.readParcelable(C50362Rk.class.getClassLoader());
            if (c50362Rk == null) {
                throw null;
            }
            this.A01 = c50362Rk;
            return;
        }
        throw null;
    }

    public C50332Rh(List list, C50362Rk c50362Rk, UserJid userJid) {
        this.A02 = list;
        this.A01 = c50362Rk;
        this.A00 = userJid;
    }

    public int A00() {
        int i = 0;
        for (C50352Rj c50352Rj : this.A02) {
            i += c50352Rj.A01.size();
        }
        return i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, 0);
    }
}
