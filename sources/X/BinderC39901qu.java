package X;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1qu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC39901qu extends BinderC235917i implements C18D {
    public final C14C A00;

    public BinderC39901qu(C14C c14c) {
        super("com.google.android.gms.location.ILocationListener");
        this.A00 = c14c;
    }

    @Override // X.BinderC235917i
    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            final Location location = (Location) (parcel.readInt() == 0 ? null : (Parcelable) Location.CREATOR.createFromParcel(parcel));
            synchronized (this) {
                C14C c14c = this.A00;
                C14B c14b = new C14B() { // from class: X.1cb
                    @Override // X.C14B
                    public final /* synthetic */ void AGp(Object obj) {
                        ((AnonymousClass184) obj).onLocationChanged(location);
                    }
                };
                C07K.A1Q(c14b, "Notifier must not be null");
                HandlerC30551am handlerC30551am = c14c.A01;
                handlerC30551am.sendMessage(handlerC30551am.obtainMessage(1, c14b));
            }
            return true;
        }
        return false;
    }
}
