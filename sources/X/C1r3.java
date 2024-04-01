package X;

import android.os.Parcel;

/* renamed from: X.1r3  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1r3 extends BinderC236817r implements InterfaceC237718a {
    public final /* synthetic */ C18F A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1r3(C18F c18f) {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        this.A00 = c18f;
    }

    @Override // X.BinderC236817r
    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            BinderC06190Rw binderC06190Rw = new BinderC06190Rw(this.A00.AAd(new C0SL(AbstractBinderC31681ch.A00(parcel.readStrongBinder()))));
            parcel2.writeNoException();
            C236917s.A01(parcel2, binderC06190Rw);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            BinderC06190Rw binderC06190Rw2 = new BinderC06190Rw(this.A00.AAb(new C0SL(AbstractBinderC31681ch.A00(parcel.readStrongBinder()))));
            parcel2.writeNoException();
            C236917s.A01(parcel2, binderC06190Rw2);
            return true;
        }
    }
}
