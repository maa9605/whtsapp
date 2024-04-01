package X;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.0LI  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0LI {
    public final Context A00;

    public C0LI(Context context) {
        this.A00 = context;
    }

    public static FingerprintManager A00(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return null;
        }
        return (FingerprintManager) context.getSystemService(FingerprintManager.class);
    }

    public void A01(C09S c09s, C0HE c0he, final C0LJ c0lj) {
        FingerprintManager A00;
        CancellationSignal cancellationSignal;
        if (Build.VERSION.SDK_INT < 23 || (A00 = A00(this.A00)) == null) {
            return;
        }
        FingerprintManager.CryptoObject cryptoObject = null;
        if (c0he != null) {
            cancellationSignal = (CancellationSignal) c0he.A00();
        } else {
            cancellationSignal = null;
        }
        if (c09s != null) {
            Cipher cipher = c09s.A01;
            if (cipher != null) {
                cryptoObject = new FingerprintManager.CryptoObject(cipher);
            } else {
                Signature signature = c09s.A00;
                if (signature != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(signature);
                } else {
                    Mac mac = c09s.A02;
                    if (mac != null) {
                        cryptoObject = new FingerprintManager.CryptoObject(mac);
                    }
                }
            }
        }
        A00.authenticate(cryptoObject, cancellationSignal, 0, new FingerprintManager.AuthenticationCallback() { // from class: X.0kJ
            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationError(int i, CharSequence charSequence) {
                C0LJ.this.A01(i, charSequence);
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationFailed() {
                C0LJ.this.A00();
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationHelp(int i, CharSequence charSequence) {
                C0LJ.this.A02(i, charSequence);
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
                C0LJ c0lj2 = C0LJ.this;
                FingerprintManager.CryptoObject cryptoObject2 = authenticationResult.getCryptoObject();
                C09S c09s2 = null;
                if (cryptoObject2 != null) {
                    if (cryptoObject2.getCipher() != null) {
                        c09s2 = new C09S(cryptoObject2.getCipher());
                    } else if (cryptoObject2.getSignature() != null) {
                        c09s2 = new C09S(cryptoObject2.getSignature());
                    } else if (cryptoObject2.getMac() != null) {
                        c09s2 = new C09S(cryptoObject2.getMac());
                    }
                }
                c0lj2.A03(new C12930kK(c09s2));
            }
        }, null);
    }

    public boolean A02() {
        FingerprintManager A00;
        return Build.VERSION.SDK_INT >= 23 && (A00 = A00(this.A00)) != null && A00.hasEnrolledFingerprints();
    }

    public boolean A03() {
        FingerprintManager A00;
        return Build.VERSION.SDK_INT >= 23 && (A00 = A00(this.A00)) != null && A00.isHardwareDetected();
    }
}
