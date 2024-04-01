package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;

/* renamed from: X.1d0  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31821d0 extends C236717q implements IUiSettingsDelegate {
    public C31821d0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void ASr(boolean z) {
        Parcel A00 = A00();
        A00.writeInt(z ? 1 : 0);
        A02(2, A00);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void ATP(boolean z) {
        Parcel A00 = A00();
        A00.writeInt(z ? 1 : 0);
        A02(3, A00);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void AUF(boolean z) {
        Parcel A00 = A00();
        A00.writeInt(z ? 1 : 0);
        A02(1, A00);
    }
}
