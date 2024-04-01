package X;

import com.whatsapp.authentication.FingerprintBottomSheet;

/* renamed from: X.4H6  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4H6 implements InterfaceC06550Tv {
    public final /* synthetic */ InterfaceC06550Tv A00;
    public final /* synthetic */ C4H7 A01;

    public C4H6(C4H7 c4h7, InterfaceC06550Tv interfaceC06550Tv) {
        this.A01 = c4h7;
        this.A00 = interfaceC06550Tv;
    }

    public /* synthetic */ void A00() {
        this.A01.A05.AOf();
    }

    @Override // X.InterfaceC06550Tv
    public void AHZ(int i, CharSequence charSequence) {
        this.A00.AHZ(i, charSequence);
    }

    @Override // X.InterfaceC06550Tv
    public void AHa() {
        this.A00.AHa();
    }

    @Override // X.InterfaceC06550Tv
    public void AHb(int i, CharSequence charSequence) {
        this.A00.AHb(i, charSequence);
    }

    @Override // X.InterfaceC06550Tv
    public void AHc(byte[] bArr) {
        FingerprintBottomSheet fingerprintBottomSheet = this.A01.A02;
        fingerprintBottomSheet.A15(false);
        fingerprintBottomSheet.A02.setEnabled(false);
        fingerprintBottomSheet.A01.setEnabled(false);
        this.A00.AHc(bArr);
    }
}
