package X;

import java.io.File;

/* renamed from: X.0G6  reason: invalid class name */
/* loaded from: classes.dex */
public class C0G6 {
    public static volatile C0G6 A01;
    public final C001200o A00;

    public C0G6(C001200o c001200o) {
        this.A00 = c001200o;
    }

    public void A00(byte[] bArr) {
        C000700j.A06(bArr.length == 32);
        C02A.A07(bArr, new File(this.A00.A00.getFilesDir(), "encrypted_backup.key"));
    }

    public byte[] A01() {
        byte[] A0F = C02A.A0F(new File(this.A00.A00.getFilesDir(), "encrypted_backup.key"));
        if (A0F != null) {
            C000700j.A06(A0F.length == 32);
            return A0F;
        }
        return null;
    }
}
