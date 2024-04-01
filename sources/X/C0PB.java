package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0PB  reason: invalid class name */
/* loaded from: classes.dex */
public class C0PB extends AbstractC005302j {
    public static final C0PB A00 = new C0PB();
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.2xT
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C0PB(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C0PB[i];
        }
    };

    @Override // com.whatsapp.jid.Jid
    public String getServer() {
        return "s.whatsapp.net";
    }

    @Override // com.whatsapp.jid.Jid
    public int getType() {
        return 9;
    }

    public C0PB() {
        super("gdpr");
    }

    public C0PB(Parcel parcel) {
        super(parcel);
    }
}
