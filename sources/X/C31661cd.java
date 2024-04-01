package X;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1cd */
/* loaded from: classes.dex */
public final class C31661cd extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.17k
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31661cd[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            C31651cc c31651cc = null;
            IBinder iBinder = null;
            PendingIntent pendingIntent = null;
            IBinder iBinder2 = null;
            IBinder iBinder3 = null;
            int i = 1;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                switch (65535 & readInt) {
                    case 1:
                        i = C07K.A0A(parcel, readInt);
                        break;
                    case 2:
                        c31651cc = (C31651cc) C07K.A0W(parcel, readInt, C31651cc.CREATOR);
                        break;
                    case 3:
                        iBinder = C07K.A0U(parcel, readInt);
                        break;
                    case 4:
                        pendingIntent = (PendingIntent) C07K.A0W(parcel, readInt, PendingIntent.CREATOR);
                        break;
                    case 5:
                        iBinder2 = C07K.A0U(parcel, readInt);
                        break;
                    case 6:
                        iBinder3 = C07K.A0U(parcel, readInt);
                        break;
                    default:
                        C07K.A1H(parcel, readInt);
                        break;
                }
            }
            C07K.A1G(parcel, A09);
            return new C31661cd(i, c31651cc, iBinder, pendingIntent, iBinder2, iBinder3);
        }
    };
    public int A00;
    public PendingIntent A01;
    public InterfaceC235617f A02;
    public C31651cc A03;
    public C18C A04;
    public C18D A05;

    public C31661cd(int i, C31651cc c31651cc, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        C18D c31771cu;
        C18C c31761ct;
        this.A00 = i;
        this.A03 = c31651cc;
        InterfaceC235617f interfaceC235617f = null;
        if (iBinder == null) {
            c31771cu = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            c31771cu = queryLocalInterface instanceof C18D ? (C18D) queryLocalInterface : new C31771cu(iBinder);
        }
        this.A05 = c31771cu;
        this.A01 = pendingIntent;
        if (iBinder2 == null) {
            c31761ct = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            c31761ct = queryLocalInterface2 instanceof C18C ? (C18C) queryLocalInterface2 : new C31761ct(iBinder2);
        }
        this.A04 = c31761ct;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            interfaceC235617f = queryLocalInterface3 instanceof InterfaceC235617f ? (InterfaceC235617f) queryLocalInterface3 : new C31621cZ(iBinder3);
        }
        this.A02 = interfaceC235617f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A00);
        AnonymousClass088.A1L(parcel, 2, this.A03, i, false);
        C18D c18d = this.A05;
        AnonymousClass088.A1K(parcel, 3, c18d == null ? null : c18d.asBinder());
        AnonymousClass088.A1L(parcel, 4, this.A01, i, false);
        C18C c18c = this.A04;
        AnonymousClass088.A1K(parcel, 5, c18c == null ? null : c18c.asBinder());
        InterfaceC235617f interfaceC235617f = this.A02;
        AnonymousClass088.A1K(parcel, 6, interfaceC235617f != null ? interfaceC235617f.asBinder() : null);
        AnonymousClass088.A1D(parcel, A03);
    }
}
