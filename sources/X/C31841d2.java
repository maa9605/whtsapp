package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;
import com.google.android.gms.maps.model.CameraPosition;

/* renamed from: X.1d2 */
/* loaded from: classes.dex */
public final class C31841d2 extends C236717q implements IGoogleMapDelegate {
    public C31841d2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final C0SM A5F(C31871d5 c31871d5) {
        Parcel A00 = A00();
        C236917s.A02(A00, c31871d5);
        Parcel A01 = A01(11, A00);
        C0SM A002 = AbstractBinderC31681ch.A00(A01.readStrongBinder());
        A01.recycle();
        return A002;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void A5N(IObjectWrapper iObjectWrapper) {
        Parcel A00 = A00();
        C236917s.A01(A00, iObjectWrapper);
        A02(5, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void A5O(IObjectWrapper iObjectWrapper, C18Y c18y) {
        Parcel A00 = A00();
        C236917s.A01(A00, iObjectWrapper);
        C236917s.A01(A00, c18y);
        A02(6, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void A5P(IObjectWrapper iObjectWrapper, int i, C18Y c18y) {
        Parcel A00 = A00();
        C236917s.A01(A00, iObjectWrapper);
        A00.writeInt(i);
        C236917s.A01(A00, c18y);
        A02(7, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final CameraPosition A8k() {
        Parcel A01 = A01(1, A00());
        CameraPosition cameraPosition = (CameraPosition) C236917s.A00(A01, CameraPosition.CREATOR);
        A01.recycle();
        return cameraPosition;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final IProjectionDelegate ACc() {
        IProjectionDelegate c31811cz;
        Parcel A01 = A01(26, A00());
        IBinder readStrongBinder = A01.readStrongBinder();
        if (readStrongBinder == null) {
            c31811cz = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (queryLocalInterface instanceof IProjectionDelegate) {
                c31811cz = (IProjectionDelegate) queryLocalInterface;
            } else {
                c31811cz = new C31811cz(readStrongBinder);
            }
        }
        A01.recycle();
        return c31811cz;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final IUiSettingsDelegate ADd() {
        IUiSettingsDelegate c31821d0;
        Parcel A01 = A01(25, A00());
        IBinder readStrongBinder = A01.readStrongBinder();
        if (readStrongBinder == null) {
            c31821d0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (queryLocalInterface instanceof IUiSettingsDelegate) {
                c31821d0 = (IUiSettingsDelegate) queryLocalInterface;
            } else {
                c31821d0 = new C31821d0(readStrongBinder);
            }
        }
        A01.recycle();
        return c31821d0;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean AFt() {
        Parcel A01 = A01(17, A00());
        boolean z = A01.readInt() != 0;
        A01.recycle();
        return z;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void AGX(IObjectWrapper iObjectWrapper) {
        Parcel A00 = A00();
        C236917s.A01(A00, iObjectWrapper);
        A02(4, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void ARl() {
        A02(94, A00());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean ATA(boolean z) {
        Parcel A00 = A00();
        A00.writeInt(z ? 1 : 0);
        Parcel A01 = A01(20, A00);
        boolean z2 = A01.readInt() != 0;
        A01.recycle();
        return z2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void ATB(InterfaceC237718a interfaceC237718a) {
        Parcel A00 = A00();
        C236917s.A01(A00, interfaceC237718a);
        A02(33, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean ATH(C31861d4 c31861d4) {
        Parcel A00 = A00();
        C236917s.A02(A00, c31861d4);
        Parcel A01 = A01(91, A00);
        boolean z = A01.readInt() != 0;
        A01.recycle();
        return z;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void ATI(int i) {
        Parcel A00 = A00();
        A00.writeInt(i);
        A02(16, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void ATL(float f) {
        Parcel A00 = A00();
        A00.writeFloat(f);
        A02(93, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void ATQ(boolean z) {
        Parcel A00 = A00();
        A00.writeInt(z ? 1 : 0);
        A02(22, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void ATS(C18b c18b) {
        Parcel A00 = A00();
        C236917s.A01(A00, c18b);
        A02(99, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void ATT(InterfaceC237818c interfaceC237818c) {
        Parcel A00 = A00();
        C236917s.A01(A00, interfaceC237818c);
        A02(96, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void ATU(C18S c18s) {
        Parcel A00 = A00();
        C236917s.A01(A00, c18s);
        A02(32, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void ATW(C18T c18t) {
        Parcel A00 = A00();
        C236917s.A01(A00, c18t);
        A02(28, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void ATX(C18V c18v) {
        Parcel A00 = A00();
        C236917s.A01(A00, c18v);
        A02(30, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void ATZ(int i, int i2, int i3, int i4) {
        Parcel A00 = A00();
        A00.writeInt(i);
        A00.writeInt(i2);
        A00.writeInt(i3);
        A00.writeInt(i4);
        A02(39, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void AU3(boolean z) {
        Parcel A00 = A00();
        A00.writeInt(z ? 1 : 0);
        A02(18, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void AV9() {
        A02(8, A00());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void clear() {
        A02(14, A00());
    }
}
