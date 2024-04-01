package X;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1CO */
/* loaded from: classes.dex */
public class C1CO implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.1CM
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                return new C1CO(readStrongBinder);
            }
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C1CO[i];
        }
    };
    public Messenger A00;
    public C1CR A01;

    public C1CO(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.A00 = new Messenger(iBinder);
        } else {
            this.A01 = new C1CR(iBinder);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void A00(Message message) {
        Messenger messenger = this.A00;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        C1CR c1cr = this.A01;
        if (c1cr != null) {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                c1cr.A00.transact(1, obtain, null, 1);
                return;
            } finally {
                obtain.recycle();
            }
        }
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.A00;
            IBinder binder = messenger != null ? messenger.getBinder() : this.A01.asBinder();
            C1CO c1co = (C1CO) obj;
            Messenger messenger2 = c1co.A00;
            return binder.equals(messenger2 != null ? messenger2.getBinder() : c1co.A01.asBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        Messenger messenger = this.A00;
        return (messenger != null ? messenger.getBinder() : this.A01.asBinder()).hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.A00;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.A01.asBinder());
        }
    }
}
