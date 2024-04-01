package X;

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.1qA  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC39461qA extends BinderC236817r implements C18T {
    public final /* synthetic */ C18J A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC39461qA(C18J c18j) {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
        this.A00 = c18j;
    }

    @Override // X.BinderC236817r
    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            this.A00.ALi((LatLng) C236917s.A00(parcel, LatLng.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
