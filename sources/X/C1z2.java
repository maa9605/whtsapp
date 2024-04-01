package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1z2  reason: invalid class name */
/* loaded from: classes2.dex */
public class C1z2 {
    public static volatile C1z2 A03;
    public final C24G A00;
    public static final byte[] A02 = new byte[0];
    public static final Charset A01 = Charset.forName("UTF-8");

    public C1z2(C24G c24g) {
        this.A00 = c24g;
    }

    public static C1z2 A00() {
        if (A03 == null) {
            synchronized (C1z2.class) {
                if (A03 == null) {
                    if (C24G.A01 == null) {
                        synchronized (C24G.class) {
                            if (C24G.A01 == null) {
                                C24G.A01 = new C24G();
                            }
                        }
                    }
                    A03 = new C1z2(C24G.A01);
                }
            }
        }
        return A03;
    }

    public static final byte[] A01(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(i, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr2);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new C24H(e);
        }
    }

    public static final byte[] A02(String str, byte[] bArr, byte[] bArr2) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(bArr2, str));
            return mac.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new C24H(e);
        }
    }

    public final byte[] A03(C44651zQ c44651zQ, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] A1h = AnonymousClass029.A1h(bArr, c44651zQ.A00);
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        order.putLong(A1h.length);
        return AnonymousClass029.A1g(A02("HmacSHA512", AnonymousClass029.A1h(A1h, bArr3, order.array()), bArr2), 32);
    }

    public byte[] A04(String str, long j, C44961zw c44961zw, byte[] bArr, byte[] bArr2) {
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        order.putLong(j);
        return A02("HmacSHA256", AnonymousClass029.A1h(bArr2, bArr, order.array(), str.getBytes(A01)), this.A00.A00(c44961zw.A00).A01);
    }

    public byte[] A05(String str, long j, byte[] bArr, C44961zw c44961zw) {
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        order.putLong(j);
        return A02("HmacSHA256", AnonymousClass029.A1h(bArr, order.array(), str.getBytes(A01)), this.A00.A00(c44961zw.A00).A02);
    }
}
