package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* renamed from: X.1Q0  reason: invalid class name */
/* loaded from: classes.dex */
public class C1Q0 extends AbstractC35941jz {
    @Override // X.AbstractC35941jz
    public int A08() {
        return 20;
    }

    public C1Q0(C03280Fb c03280Fb, C02L c02l, C03290Fc c03290Fc, C03310Fe c03310Fe, C000400f c000400f, C0Fi c0Fi, File file) {
        super(c03280Fb, c02l, c03290Fc, c03310Fe, c000400f, c0Fi, file);
    }

    @Override // X.AbstractC35941jz
    public C0HN A09(C27321Mx c27321Mx, String str) {
        if (c27321Mx.A01 == null) {
            Log.e("BackupFileCrypt12/verifyFooterIntegrity/jidSuffix is null");
            return new C0HN(2, null);
        }
        return c27321Mx.A01(this.A04, str, A0H());
    }

    @Override // X.AbstractC35941jz
    public C27321Mx A0B(RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[16];
        byte[] bArr2 = new byte[4];
        int read = randomAccessFile.read(bArr);
        int read2 = randomAccessFile.read(bArr2);
        if (read == 16 && read2 == 4) {
            return new C27321Mx(bArr, bArr2);
        }
        Log.e("Backup/BackupFileCrypt12/footer is null");
        return null;
    }

    @Override // X.AbstractC35941jz
    public C27321Mx A0C(byte[] bArr) {
        String A0H = A0H();
        byte[] bArr2 = new byte[4];
        Arrays.fill(bArr2, (byte) 45);
        if (A0H != null) {
            int length = A0H.length();
            if (length < 2) {
                StringBuilder sb = new StringBuilder("BackupFooter/get-jid-suffix/unexpected-phone-number ");
                sb.append(A0H);
                sb.append(" it has less than ");
                sb.append(2);
                sb.append(" digits");
                Log.e(sb.toString());
                return new C27321Mx(bArr, bArr2);
            }
            System.arraycopy(A0H.getBytes(), length - 2, bArr2, 2, 2);
        }
        StringBuilder A0W = C000200d.A0W("BackupFooter/get-jid-suffix ", A0H, " suffix: ");
        A0W.append(new String(bArr2));
        Log.i(A0W.toString());
        return new C27321Mx(bArr, bArr2);
    }

    @Override // X.AbstractC35941jz
    public EnumC03450Ft A0F() {
        return EnumC03450Ft.CRYPT12;
    }
}
