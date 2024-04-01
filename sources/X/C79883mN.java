package X;

import com.whatsapp.util.Log;

/* renamed from: X.3mN  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C79883mN implements InterfaceC010405f {
    public final /* synthetic */ C454321z A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ byte[] A02;

    public C79883mN(C454321z c454321z, byte[] bArr, String str) {
        this.A00 = c454321z;
        this.A02 = bArr;
        this.A01 = str;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        Log.e("BackupTokenProtocolHelper/sendBackupTokenRequest/delivery-failure");
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        Log.e("BackupTokenProtocolHelper/sendBackupTokenRequest/error");
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        Log.i("BackupTokenProtocolHelper/sendBackupTokenRequest/success");
        this.A00.A04.AS1(new RunnableEBaseShape1S1200000_I1(this, this.A02, this.A01, 2));
    }
}
