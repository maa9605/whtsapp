package X;

import android.os.Build;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLException;

/* renamed from: X.03M  reason: invalid class name */
/* loaded from: classes.dex */
public class C03M {
    public static volatile C03M A00;

    public static InterfaceC27881Pd A00() {
        if (Build.VERSION.SDK_INT > 18) {
            return new InterfaceC27881Pd() { // from class: X.1nZ
                public Cipher A00;
                public SecretKey A01;
                public byte[] A02;

                @Override // X.InterfaceC27881Pd
                public byte[] A73(long j, byte[] bArr, byte[] bArr2, int i, int i2) {
                    try {
                        this.A00.init(2, this.A01, new GCMParameterSpec(128, C38101nY.A00(this.A02, j)));
                        this.A00.updateAAD(bArr);
                        return this.A00.doFinal(bArr2, i, i2);
                    } catch (InvalidAlgorithmParameterException e) {
                        throw new C27871Pc((byte) 80, new SSLException("Invalid Algorithm Params", e));
                    } catch (InvalidKeyException e2) {
                        throw new C27871Pc((byte) 80, new SSLException(" Invalid Key", e2));
                    } catch (BadPaddingException e3) {
                        throw new C27871Pc((byte) 80, new SSLException("Bad padding", e3));
                    } catch (IllegalBlockSizeException e4) {
                        throw new C27871Pc((byte) 80, new SSLException("Illegal block size ", e4));
                    }
                }

                @Override // X.InterfaceC27881Pd
                public byte[] A7b(long j, byte[] bArr, byte[] bArr2, int i, int i2) {
                    try {
                        this.A00.init(1, this.A01, new GCMParameterSpec(128, C38101nY.A00(this.A02, j)));
                        this.A00.updateAAD(bArr);
                        return this.A00.doFinal(bArr2, i, i2);
                    } catch (InvalidAlgorithmParameterException e) {
                        throw new C27871Pc((byte) 80, new SSLException("Invalid Algorithm Params", e));
                    } catch (InvalidKeyException e2) {
                        throw new C27871Pc((byte) 80, new SSLException(" Invalid Key", e2));
                    } catch (BadPaddingException e3) {
                        throw new C27871Pc((byte) 80, new SSLException("Bad padding", e3));
                    } catch (IllegalBlockSizeException e4) {
                        throw new C27871Pc((byte) 80, new SSLException("Illegal block size ", e4));
                    }
                }

                @Override // X.InterfaceC27881Pd
                public C03O ACe() {
                    return C03O.A00();
                }

                @Override // X.InterfaceC27881Pd
                public void AEk(byte[] bArr, byte[] bArr2) {
                    if (bArr != null && bArr.length == 16) {
                        if (bArr2 != null && bArr2.length == 12) {
                            this.A02 = bArr2;
                            this.A01 = new SecretKeySpec(bArr, "AES");
                            try {
                                try {
                                    this.A00 = Cipher.getInstance("AES/GCM/NoPadding", "AndroidOpenSSL");
                                    return;
                                } catch (NoSuchAlgorithmException e) {
                                    throw new C27871Pc((byte) 80, new SSLException("AES/GCM/NoPadding not found", e));
                                } catch (NoSuchPaddingException e2) {
                                    throw new C27871Pc((byte) 80, new SSLException("No such padding", e2));
                                }
                            } catch (NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException unused) {
                                this.A00 = Cipher.getInstance("AES/GCM/NoPadding");
                                return;
                            }
                        }
                        throw new C27871Pc((byte) 80, new SSLException("Invalid iv length."));
                    }
                    throw new C27871Pc((byte) 80, new SSLException("Invalid key length."));
                }
            };
        }
        return new C38101nY();
    }
}
