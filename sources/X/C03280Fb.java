package X;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.0Fb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03280Fb {
    public static volatile C03280Fb A07;
    public Cipher A00;
    public Cipher A01;
    public Cipher A02;
    public Cipher A03;
    public Cipher A04;
    public Cipher A05;
    public boolean A06;

    public static C03280Fb A00() {
        if (A07 == null) {
            synchronized (C03280Fb.class) {
                if (A07 == null) {
                    A07 = new C03280Fb();
                }
            }
        }
        return A07;
    }

    public static final InputStream A01(InputStream inputStream, Cipher cipher, byte[] bArr, byte[] bArr2, AtomicLong atomicLong) {
        cipher.init(2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
        return new InflaterInputStream(new C28161Qh(inputStream, cipher, atomicLong));
    }

    public static final ZipInputStream A02(InputStream inputStream, Cipher cipher, byte[] bArr, byte[] bArr2, AtomicLong atomicLong) {
        cipher.init(2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
        return new ZipInputStream(new C28161Qh(inputStream, cipher, atomicLong));
    }

    public static final CipherOutputStream A03(OutputStream outputStream, Cipher cipher, byte[] bArr, byte[] bArr2) {
        cipher.init(1, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
        return new CipherOutputStream(outputStream, cipher);
    }

    public synchronized ZipInputStream A04(InputStream inputStream, EnumC03450Ft enumC03450Ft, byte[] bArr, byte[] bArr2, AtomicLong atomicLong) {
        int ordinal = enumC03450Ft.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("unsupported key selector ");
                        sb.append(enumC03450Ft);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (bArr != null && bArr2 != null) {
                        A06();
                        return A02(inputStream, this.A02, bArr, bArr2, atomicLong);
                    }
                }
                if (bArr != null && bArr2 != null) {
                    A06();
                    return A02(inputStream, this.A01, bArr, bArr2, atomicLong);
                }
            }
            if (bArr != null && bArr2 != null) {
                A06();
                return A02(inputStream, this.A00, bArr, bArr2, atomicLong);
            }
        }
        return new ZipInputStream(inputStream);
    }

    public synchronized ZipOutputStream A05(OutputStream outputStream, EnumC03450Ft enumC03450Ft, byte[] bArr, byte[] bArr2) {
        int ordinal = enumC03450Ft.ordinal();
        if (ordinal == 0) {
            return new ZipOutputStream(outputStream);
        } else if (ordinal == 1) {
            A06();
            return new ZipOutputStream(A03(outputStream, this.A03, bArr, bArr2));
        } else if (ordinal == 3) {
            A06();
            return new ZipOutputStream(A03(outputStream, this.A04, bArr, bArr2));
        } else if (ordinal == 4) {
            A06();
            return new ZipOutputStream(A03(outputStream, this.A05, bArr, bArr2));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("unsupported key selector ");
            sb.append(enumC03450Ft);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final synchronized void A06() {
        if (this.A06) {
            return;
        }
        this.A03 = Cipher.getInstance("AES/GCM/NoPadding");
        this.A00 = Cipher.getInstance("AES/GCM/NoPadding");
        this.A04 = Cipher.getInstance("AES/GCM/NoPadding");
        this.A01 = Cipher.getInstance("AES/GCM/NoPadding");
        this.A05 = Cipher.getInstance("AES/GCM/NoPadding");
        this.A02 = Cipher.getInstance("AES/GCM/NoPadding");
        this.A06 = true;
    }
}
