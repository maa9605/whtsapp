package X;

import android.os.Build;
import android.util.Log;
import androidx.biometric.BiometricFragment;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: X.0iH */
/* loaded from: classes.dex */
public class C11750iH {
    public AbstractC02800Cx A00;

    public C11750iH(ActivityC02330At activityC02330At, Executor executor, AbstractC11700iC abstractC11700iC) {
        if (activityC02330At == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        if (abstractC11700iC != null) {
            AbstractC02800Cx A0N = activityC02330At.A0N();
            C28451Sa c28451Sa = (C28451Sa) new C06570Tx(activityC02330At).A00(C28451Sa.class);
            this.A00 = A0N;
            if (c28451Sa != null) {
                c28451Sa.A0H = executor;
                c28451Sa.A04 = abstractC11700iC;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("AuthenticationCallback must not be null.");
    }

    public void A00() {
        AbstractC02800Cx abstractC02800Cx = this.A00;
        if (abstractC02800Cx == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        BiometricFragment biometricFragment = (BiometricFragment) abstractC02800Cx.A0Q.A01("androidx.biometric.BiometricFragment");
        if (biometricFragment == null) {
            Log.e("BiometricPromptCompat", "Unable to cancel authentication. BiometricFragment not found.");
        } else {
            biometricFragment.A11(3);
        }
    }

    public void A01(C11740iG c11740iG) {
        if (c11740iG != null) {
            AbstractC02800Cx abstractC02800Cx = this.A00;
            if (abstractC02800Cx == null) {
                Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
                return;
            } else if (abstractC02800Cx.A0r()) {
                Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
                return;
            } else {
                BiometricFragment biometricFragment = (BiometricFragment) abstractC02800Cx.A0Q.A01("androidx.biometric.BiometricFragment");
                if (biometricFragment == null) {
                    biometricFragment = new BiometricFragment();
                    C02820Cz c02820Cz = new C02820Cz(abstractC02800Cx);
                    c02820Cz.A09(0, biometricFragment, "androidx.biometric.BiometricFragment", 1);
                    c02820Cz.A05();
                    abstractC02800Cx.A0B();
                }
                ActivityC02330At A09 = biometricFragment.A09();
                if (A09 == null) {
                    Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
                    return;
                }
                C28451Sa c28451Sa = biometricFragment.A01;
                c28451Sa.A06 = c11740iG;
                char c = c11740iG.A03 ? (char) 33023 : (char) 255;
                int i = Build.VERSION.SDK_INT;
                if (i >= 23 && i < 30 && c == 15) {
                    c28451Sa.A05 = C11800iM.A02();
                } else {
                    c28451Sa.A05 = null;
                }
                if (biometricFragment.A15()) {
                    biometricFragment.A01.A0G = biometricFragment.A0F(R.string.confirm_device_credential_password);
                } else {
                    biometricFragment.A01.A0G = null;
                }
                if (Build.VERSION.SDK_INT >= 21 && biometricFragment.A15() && new C11690iB(new C1SW(A09)).A00() != 0) {
                    biometricFragment.A01.A0I = true;
                    biometricFragment.A10();
                    return;
                } else if (biometricFragment.A01.A0K) {
                    biometricFragment.A00.postDelayed(new Runnable(biometricFragment) { // from class: X.0i7
                        public final WeakReference A00;

                        {
                            this.A00 = new WeakReference(biometricFragment);
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            WeakReference weakReference = this.A00;
                            if (weakReference.get() != null) {
                                ((BiometricFragment) weakReference.get()).A0y();
                            }
                        }
                    }, 600L);
                    return;
                } else {
                    biometricFragment.A0y();
                    return;
                }
            }
        }
        throw new IllegalArgumentException("PromptInfo cannot be null.");
    }
}
