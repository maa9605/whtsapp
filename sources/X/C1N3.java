package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: X.1N3  reason: invalid class name */
/* loaded from: classes.dex */
public class C1N3 {
    public static final String[] A01 = {"MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAMWgn5TcPCGUk6hH1vTtkEtDA+cMoMN6\ne054bRXk2tWfgzZ4ziO065KNxkkajyxynJNRQ2oWAw/WBaZ0Qao/52MCAwEAAQ==\n"};
    public static final String[] A00 = {"picture1", "password", "qwerty", "abc123", "Million2", "iloveyou", "password1", "qqww1122"};

    public static boolean A00(byte[] bArr, byte[] bArr2) {
        String[] strArr;
        Signature signature;
        for (String str : A01) {
            try {
                signature = Signature.getInstance("SHA256withRSA");
                signature.initVerify(KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0))));
                signature.update(bArr);
            } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e) {
                Log.e("EncryptedBackupUtils/verifySignature/exception.", e);
            }
            if (signature.verify(bArr2)) {
                return true;
            }
        }
        return false;
    }
}
