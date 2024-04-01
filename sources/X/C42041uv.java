package X;

import android.content.Context;
import com.google.android.search.verification.client.R;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1uv */
/* loaded from: classes2.dex */
public final class C42041uv implements InterfaceC007103c {
    public static int A00(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return 3;
                    }
                    throw new IllegalArgumentException(C000200d.A0D("unrecognized SignalMessageType; value=", i));
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static C02E A01() {
        C02E A00 = C02E.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    public static C462626b A02() {
        C462626b A00 = C462626b.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    public static C42621w3 A03(byte[] bArr) {
        int length = bArr.length;
        if (length == 80) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 0, 16);
            byte[] bArr3 = new byte[32];
            System.arraycopy(bArr, 16, bArr3, 0, 32);
            byte[] bArr4 = new byte[32];
            System.arraycopy(bArr, 48, bArr4, 0, 32);
            return new C42621w3(bArr3, bArr4, bArr2);
        }
        StringBuilder A0P = C000200d.A0P("Invalid length of derived secret; length=");
        A0P.append(length);
        throw new AssertionError(A0P.toString());
    }

    public static String A04(Context context, int i) {
        return context.getString(R.string.share_too_many_items_with_placeholder, Integer.valueOf(i));
    }

    public static String A05(C002301c c002301c) {
        return new C50152Qf(c002301c.A0I(), "#,#0.00").A00(1.0d).contains(",") ? "," : ".";
    }

    public static List A06(int[] iArr, Long l) {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                break;
            }
            j += iArr[i];
            if (i != length - 1 || l == null) {
                if (j > j2) {
                    int i2 = (int) ((((j - j2) + 15) / 16) * 16);
                    arrayList.add(Integer.valueOf(i2));
                    j3 = j2;
                    j2 = i2 + j2;
                }
                i++;
            } else if (j > j2) {
                arrayList.add(Integer.valueOf((int) (l.longValue() - j2)));
            } else {
                arrayList.remove(arrayList.size() - 1);
                arrayList.add(Integer.valueOf((int) (l.longValue() - j3)));
                return arrayList;
            }
        }
        return arrayList;
    }

    public static Cipher A07(byte[] bArr, byte[] bArr2, int i) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(i, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(bArr));
            return cipher;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new AssertionError(e);
        }
    }

    public static Mac A08(byte[] bArr, byte[] bArr2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(bArr2, "HmacSHA256"));
            mac.update(bArr);
            return mac;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
