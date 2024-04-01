package X;

import android.content.Context;
import android.os.Build;
import com.whatsapp.util.Log;
import java.io.File;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.0KF */
/* loaded from: classes.dex */
public class C0KF {
    public static final byte[] A01 = {0, 2};
    public static final Object A00 = new Object();

    public static File A00(Context context) {
        return new File(context.getFilesDir(), "backup_token");
    }

    public static void A01(Context context, InterfaceC002901k interfaceC002901k, C000500h c000500h) {
        interfaceC002901k.AS1(new RunnableEBaseShape4S0200000_I0_4(context, c000500h, 7));
    }

    public static boolean A02() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean A03(Context context, AnonymousClass012 anonymousClass012, C000500h c000500h) {
        if (A02()) {
            return !A00(context).exists() || anonymousClass012.A05() - c000500h.A00.getLong("backup_token_file_timestamp", -1L) > TimeUnit.DAYS.toMillis(14L);
        }
        return false;
    }

    public static byte[] A04(Context context, String str) {
        byte[] A0F;
        int length;
        if (A02()) {
            File A002 = A00(context);
            if (A002.exists()) {
                synchronized (A00) {
                    A0F = C02A.A0F(A002);
                }
                if (A0F != null && (length = A0F.length) != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C0FH.A0I);
                    sb.append(str.substring(Math.max(str.length() - 4, 0)));
                    String obj = sb.toString();
                    byte[] bArr = A01;
                    try {
                        int length2 = bArr.length;
                        int i = length2 + 4 + 16 + 20;
                        if (length >= i) {
                            byte[] bArr2 = new byte[length2];
                            System.arraycopy(A0F, 0, bArr2, 0, length2);
                            int i2 = length2 + 0;
                            if (Arrays.equals(bArr2, bArr)) {
                                byte[] bArr3 = new byte[4];
                                System.arraycopy(A0F, i2, bArr3, 0, 4);
                                int i3 = i2 + 4;
                                byte[] bArr4 = new byte[16];
                                System.arraycopy(A0F, i3, bArr4, 0, 16);
                                int i4 = i3 + 16;
                                SecretKeySpec secretKeySpec = new SecretKeySpec(A05(obj, bArr3), "AES/OFB/NoPadding");
                                Cipher cipher = Cipher.getInstance("AES/OFB/NoPadding");
                                cipher.init(2, secretKeySpec, new IvParameterSpec(bArr4));
                                return cipher.doFinal(A0F, i4, length - i4);
                            }
                            throw new C03840Hi();
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("size mismatch expected length:");
                        sb2.append(i);
                        sb2.append(", actual length:");
                        sb2.append(length);
                        throw new InvalidParameterException(sb2.toString());
                    } catch (Exception e) {
                        Log.e("BackupTokenUtils/decrypt/unable to decrypt", e);
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static byte[] A05(String str, byte[] bArr) {
        return new SecretKeySpec(C02A.A05(str.getBytes(), bArr, 16, 128).getEncoded(), "AES").getEncoded();
    }
}
