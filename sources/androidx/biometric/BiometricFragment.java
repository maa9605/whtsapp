package androidx.biometric;

import X.AbstractC02800Cx;
import X.ActivityC02330At;
import X.C02820Cz;
import X.C06570Tx;
import X.C07O;
import X.C0BA;
import X.C0HE;
import X.C0HK;
import X.C11710iD;
import X.C11740iG;
import X.C11790iL;
import X.C11800iM;
import X.C28451Sa;
import X.ExecutorC11760iI;
import X.InterfaceC05620Pl;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.biometric.BiometricFragment;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class BiometricFragment extends C0BA {
    public Handler A00 = new Handler(Looper.getMainLooper());
    public C28451Sa A01;

    @Override // X.C0BA
    public void A0g() {
        this.A0U = true;
        if (Build.VERSION.SDK_INT == 29) {
            final C28451Sa c28451Sa = this.A01;
            if ((c28451Sa.A02() & 32768) != 0) {
                c28451Sa.A0M = true;
                this.A00.postDelayed(new Runnable(c28451Sa) { // from class: X.0i9
                    public final WeakReference A00;

                    {
                        this.A00 = new WeakReference(c28451Sa);
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        WeakReference weakReference = this.A00;
                        if (weakReference.get() != null) {
                            ((C28451Sa) weakReference.get()).A0M = false;
                        }
                    }
                }, 250L);
            }
        }
    }

    @Override // X.C0BA
    public void A0h(int i, int i2, Intent intent) {
        if (i == 1) {
            this.A01.A0J = false;
            if (i2 == -1) {
                A13(new C11710iD(null, 1));
                return;
            }
            A12(10, A0F(R.string.generic_error_user_canceled));
            A0x();
        }
    }

    @Override // X.C0BA
    public void A0t() {
        this.A0U = true;
        if (Build.VERSION.SDK_INT < 29 && !this.A01.A0J) {
            ActivityC02330At A09 = A09();
            if (A09 == null || !A09.isChangingConfigurations()) {
                A11(0);
            }
        }
    }

    @Override // X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        ActivityC02330At A09 = A09();
        if (A09 != null) {
            C28451Sa c28451Sa = (C28451Sa) new C06570Tx(A09).A00(C28451Sa.class);
            this.A01 = c28451Sa;
            C0HK c0hk = c28451Sa.A0A;
            if (c0hk == null) {
                c0hk = new C0HK();
                c28451Sa.A0A = c0hk;
            }
            c0hk.A05(this, new InterfaceC05620Pl() { // from class: X.1SQ
                @Override // X.InterfaceC05620Pl
                public void AIK(Object obj) {
                    C11710iD c11710iD = (C11710iD) obj;
                    if (c11710iD != null) {
                        BiometricFragment biometricFragment = BiometricFragment.this;
                        biometricFragment.A13(c11710iD);
                        C28451Sa c28451Sa2 = biometricFragment.A01;
                        if (c28451Sa2.A0A == null) {
                            c28451Sa2.A0A = new C0HK();
                        }
                        C28451Sa.A00(c28451Sa2.A0A, null);
                    }
                }
            });
            C28451Sa c28451Sa2 = this.A01;
            if (c28451Sa2.A08 == null) {
                c28451Sa2.A08 = new C0HK();
            }
            c28451Sa2.A08.A05(this, new InterfaceC05620Pl() { // from class: X.1SR
                /* JADX WARN: Code restructure failed: missing block: B:49:0x00a6, code lost:
                    if (X.C07O.A11(r3, r2, com.google.android.search.verification.client.R.array.hide_fingerprint_instantly_prefixes) != false) goto L50;
                 */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
                @Override // X.InterfaceC05620Pl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void AIK(java.lang.Object r10) {
                    /*
                        r9 = this;
                        X.0i0 r10 = (X.C11590i0) r10
                        if (r10 == 0) goto L52
                        androidx.biometric.BiometricFragment r5 = androidx.biometric.BiometricFragment.this
                        int r2 = r10.A00
                        java.lang.CharSequence r3 = r10.A01
                        r7 = 1
                        r8 = 0
                        switch(r2) {
                            case 1: goto L11;
                            case 2: goto L11;
                            case 3: goto L11;
                            case 4: goto L11;
                            case 5: goto L11;
                            case 6: goto Lf;
                            case 7: goto L11;
                            case 8: goto L11;
                            case 9: goto L11;
                            case 10: goto L11;
                            case 11: goto L11;
                            case 12: goto L11;
                            case 13: goto L11;
                            case 14: goto L11;
                            case 15: goto L11;
                            default: goto Lf;
                        }
                    Lf:
                        r2 = 8
                    L11:
                        android.content.Context r4 = r5.A0a()
                        int r1 = android.os.Build.VERSION.SDK_INT
                        r0 = 21
                        if (r1 < r0) goto L53
                        r0 = 29
                        if (r1 >= r0) goto L53
                        r0 = 7
                        if (r2 == r0) goto L26
                        r0 = 9
                        if (r2 != r0) goto L53
                    L26:
                        if (r4 == 0) goto L53
                        boolean r0 = X.C11800iM.A04(r4)
                        if (r0 == 0) goto L53
                        X.1Sa r0 = r5.A01
                        int r1 = r0.A02()
                        r0 = 32768(0x8000, float:4.5918E-41)
                        r1 = r1 & r0
                        r0 = 0
                        if (r1 == 0) goto L3c
                        r0 = 1
                    L3c:
                        if (r0 == 0) goto L53
                        r5.A10()
                    L41:
                        X.1Sa r2 = r5.A01
                        r1 = 0
                        X.0HK r0 = r2.A08
                        if (r0 != 0) goto L4f
                        X.0HK r0 = new X.0HK
                        r0.<init>()
                        r2.A08 = r0
                    L4f:
                        X.C28451Sa.A00(r0, r1)
                    L52:
                        return
                    L53:
                        boolean r0 = r5.A16()
                        if (r0 == 0) goto Lb0
                        if (r3 != 0) goto L63
                        android.content.Context r0 = r5.A0a()
                        java.lang.String r3 = X.C07O.A0P(r0, r2)
                    L63:
                        r0 = 5
                        if (r2 != r0) goto L76
                        X.1Sa r0 = r5.A01
                        int r1 = r0.A00
                        if (r1 == 0) goto L6f
                        r0 = 3
                        if (r1 != r0) goto L72
                    L6f:
                        r5.A12(r2, r3)
                    L72:
                        r5.A0x()
                        goto L41
                    L76:
                        X.1Sa r0 = r5.A01
                        boolean r0 = r0.A0L
                        if (r0 == 0) goto L87
                        r5.A12(r2, r3)
                        r5.A0x()
                    L82:
                        X.1Sa r0 = r5.A01
                        r0.A0L = r7
                        goto L41
                    L87:
                        r5.A14(r3)
                        android.os.Handler r6 = r5.A00
                        X.0i4 r4 = new X.0i4
                        r4.<init>()
                        android.content.Context r3 = r5.A0a()
                        if (r3 == 0) goto Lad
                        java.lang.String r2 = android.os.Build.MODEL
                        int r1 = android.os.Build.VERSION.SDK_INT
                        r0 = 28
                        if (r1 != r0) goto Lad
                        r0 = 2130903053(0x7f03000d, float:1.7412913E38)
                        boolean r0 = X.C07O.A11(r3, r2, r0)
                        if (r0 == 0) goto Lad
                    La8:
                        long r0 = (long) r8
                        r6.postDelayed(r4, r0)
                        goto L82
                    Lad:
                        r8 = 2000(0x7d0, float:2.803E-42)
                        goto La8
                    Lb0:
                        if (r3 != 0) goto Lcd
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        r0 = 2131887011(0x7f1203a3, float:1.9408617E38)
                        java.lang.String r0 = r5.A0F(r0)
                        r1.append(r0)
                        java.lang.String r0 = " "
                        r1.append(r0)
                        r1.append(r2)
                        java.lang.String r3 = r1.toString()
                    Lcd:
                        r5.A12(r2, r3)
                        r5.A0x()
                        goto L41
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1SR.AIK(java.lang.Object):void");
                }
            });
            C28451Sa c28451Sa3 = this.A01;
            if (c28451Sa3.A09 == null) {
                c28451Sa3.A09 = new C0HK();
            }
            c28451Sa3.A09.A05(this, new InterfaceC05620Pl() { // from class: X.1SS
                @Override // X.InterfaceC05620Pl
                public void AIK(Object obj) {
                    CharSequence charSequence = (CharSequence) obj;
                    if (charSequence != null) {
                        BiometricFragment biometricFragment = BiometricFragment.this;
                        if (biometricFragment.A16()) {
                            biometricFragment.A14(charSequence);
                        }
                        C28451Sa c28451Sa4 = biometricFragment.A01;
                        C0HK c0hk2 = c28451Sa4.A08;
                        if (c0hk2 == null) {
                            c0hk2 = new C0HK();
                            c28451Sa4.A08 = c0hk2;
                        }
                        C28451Sa.A00(c0hk2, null);
                    }
                }
            });
            C28451Sa c28451Sa4 = this.A01;
            if (c28451Sa4.A0D == null) {
                c28451Sa4.A0D = new C0HK();
            }
            c28451Sa4.A0D.A05(this, new InterfaceC05620Pl() { // from class: X.1ST
                @Override // X.InterfaceC05620Pl
                public void AIK(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        final BiometricFragment biometricFragment = BiometricFragment.this;
                        if (biometricFragment.A16()) {
                            biometricFragment.A14(biometricFragment.A0F(R.string.fingerprint_not_recognized));
                        }
                        C28451Sa c28451Sa5 = biometricFragment.A01;
                        if (!c28451Sa5.A0I) {
                            Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                        } else {
                            Executor executor = c28451Sa5.A0H;
                            if (executor == null) {
                                executor = new ExecutorC11760iI();
                            }
                            executor.execute(new Runnable() { // from class: X.0i2
                                @Override // java.lang.Runnable
                                public void run() {
                                    C28451Sa c28451Sa6 = BiometricFragment.this.A01;
                                    AbstractC11700iC abstractC11700iC = c28451Sa6.A04;
                                    if (abstractC11700iC == null) {
                                        abstractC11700iC = new C1SY();
                                        c28451Sa6.A04 = abstractC11700iC;
                                    }
                                    abstractC11700iC.A00();
                                }
                            });
                        }
                        C28451Sa c28451Sa6 = biometricFragment.A01;
                        if (c28451Sa6.A0D == null) {
                            c28451Sa6.A0D = new C0HK();
                        }
                        C28451Sa.A00(c28451Sa6.A0D, Boolean.FALSE);
                    }
                }
            });
            C28451Sa c28451Sa5 = this.A01;
            if (c28451Sa5.A0F == null) {
                c28451Sa5.A0F = new C0HK();
            }
            c28451Sa5.A0F.A05(this, new InterfaceC05620Pl() { // from class: X.1SU
                @Override // X.InterfaceC05620Pl
                public void AIK(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        BiometricFragment biometricFragment = BiometricFragment.this;
                        if (biometricFragment.A15()) {
                            if (biometricFragment != null) {
                                if (Build.VERSION.SDK_INT < 21) {
                                    Log.e("BiometricFragment", "Failed to check device credential. Not supported prior to API 21.");
                                } else {
                                    biometricFragment.A10();
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            CharSequence A03 = biometricFragment.A01.A03();
                            if (A03 == null) {
                                A03 = biometricFragment.A0F(R.string.default_error_msg);
                            }
                            biometricFragment.A12(13, A03);
                            biometricFragment.A0x();
                            biometricFragment.A11(2);
                        }
                        biometricFragment.A01.A05(false);
                    }
                }
            });
            C28451Sa c28451Sa6 = this.A01;
            if (c28451Sa6.A0E == null) {
                c28451Sa6.A0E = new C0HK();
            }
            c28451Sa6.A0E.A05(this, new InterfaceC05620Pl() { // from class: X.1SV
                @Override // X.InterfaceC05620Pl
                public void AIK(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        BiometricFragment biometricFragment = BiometricFragment.this;
                        biometricFragment.A11(1);
                        biometricFragment.A0x();
                        C28451Sa c28451Sa7 = biometricFragment.A01;
                        if (c28451Sa7.A0E == null) {
                            c28451Sa7.A0E = new C0HK();
                        }
                        C28451Sa.A00(c28451Sa7.A0E, Boolean.FALSE);
                    }
                }
            });
        }
    }

    public void A0x() {
        this.A01.A0N = false;
        A0z();
        if (!this.A01.A0J && A0W()) {
            C02820Cz c02820Cz = new C02820Cz(A0C());
            c02820Cz.A06(this);
            c02820Cz.A05();
        }
        Context A0a = A0a();
        if (A0a != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT != 29 || str == null) {
                return;
            }
            for (String str2 : A0a.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                if (str.equals(str2)) {
                    final C28451Sa c28451Sa = this.A01;
                    c28451Sa.A0K = true;
                    this.A00.postDelayed(new Runnable(c28451Sa) { // from class: X.0i8
                        public final WeakReference A00;

                        {
                            this.A00 = new WeakReference(c28451Sa);
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            WeakReference weakReference = this.A00;
                            if (weakReference.get() != null) {
                                ((C28451Sa) weakReference.get()).A0K = false;
                            }
                        }
                    }, 600L);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0y() {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.A0y():void");
    }

    public final void A0z() {
        this.A01.A0N = false;
        if (A0W()) {
            AbstractC02800Cx A0C = A0C();
            DialogFragment dialogFragment = (DialogFragment) A0C.A0Q.A01("androidx.biometric.FingerprintDialogFragment");
            if (dialogFragment != null) {
                if (dialogFragment.A0W()) {
                    dialogFragment.A11();
                    return;
                }
                C02820Cz c02820Cz = new C02820Cz(A0C);
                c02820Cz.A06(dialogFragment);
                c02820Cz.A05();
            }
        }
    }

    public final void A10() {
        CharSequence charSequence;
        ActivityC02330At A09 = A09();
        if (A09 == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager A00 = C11800iM.A00(A09);
        if (A00 == null) {
            A12(12, A0F(R.string.generic_error_no_keyguard));
            A0x();
            return;
        }
        C11740iG c11740iG = this.A01.A06;
        if (c11740iG != null) {
            charSequence = c11740iG.A01;
        } else {
            charSequence = null;
        }
        Intent createConfirmDeviceCredentialIntent = A00.createConfirmDeviceCredentialIntent(charSequence, null);
        if (createConfirmDeviceCredentialIntent == null) {
            A12(14, A0F(R.string.generic_error_no_device_credential));
            A0x();
            return;
        }
        this.A01.A0J = true;
        if (A16()) {
            A0z();
        }
        createConfirmDeviceCredentialIntent.setFlags(134742016);
        A0O(createConfirmDeviceCredentialIntent, 1, null);
    }

    public void A11(int i) {
        if (i == 3 || !this.A01.A0M) {
            if (A16()) {
                this.A01.A00 = i;
                if (i == 1) {
                    A12(10, C07O.A0P(A0a(), 10));
                }
            }
            C28451Sa c28451Sa = this.A01;
            C11790iL c11790iL = c28451Sa.A07;
            if (c11790iL == null) {
                c11790iL = new C11790iL();
                c28451Sa.A07 = c11790iL;
            }
            CancellationSignal cancellationSignal = c11790iL.A00;
            if (cancellationSignal != null) {
                try {
                    cancellationSignal.cancel();
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                c11790iL.A00 = null;
            }
            C0HE c0he = c11790iL.A01;
            if (c0he != null) {
                try {
                    c0he.A01();
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
                }
                c11790iL.A01 = null;
            }
        }
    }

    public final void A12(final int i, final CharSequence charSequence) {
        C28451Sa c28451Sa = this.A01;
        if (c28451Sa.A0J) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!c28451Sa.A0I) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            c28451Sa.A0I = false;
            Executor executor = c28451Sa.A0H;
            if (executor == null) {
                executor = new ExecutorC11760iI();
            }
            executor.execute(new Runnable() { // from class: X.0i1
                @Override // java.lang.Runnable
                public void run() {
                    C28451Sa c28451Sa2 = BiometricFragment.this.A01;
                    AbstractC11700iC abstractC11700iC = c28451Sa2.A04;
                    if (abstractC11700iC == null) {
                        abstractC11700iC = new C1SY();
                        c28451Sa2.A04 = abstractC11700iC;
                    }
                    abstractC11700iC.A01(i, charSequence);
                }
            });
        }
    }

    public final void A13(final C11710iD c11710iD) {
        C28451Sa c28451Sa = this.A01;
        if (!c28451Sa.A0I) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            c28451Sa.A0I = false;
            Executor executor = c28451Sa.A0H;
            if (executor == null) {
                executor = new ExecutorC11760iI();
            }
            executor.execute(new Runnable() { // from class: X.0i5
                @Override // java.lang.Runnable
                public void run() {
                    C28451Sa c28451Sa2 = BiometricFragment.this.A01;
                    AbstractC11700iC abstractC11700iC = c28451Sa2.A04;
                    if (abstractC11700iC == null) {
                        abstractC11700iC = new C1SY();
                        c28451Sa2.A04 = abstractC11700iC;
                    }
                    abstractC11700iC.A02(c11710iD);
                }
            });
        }
        A0x();
    }

    public final void A14(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = A0F(R.string.default_error_msg);
        }
        this.A01.A04(2);
        C28451Sa c28451Sa = this.A01;
        C0HK c0hk = c28451Sa.A0B;
        if (c0hk == null) {
            c0hk = new C0HK();
            c28451Sa.A0B = c0hk;
        }
        C28451Sa.A00(c0hk, charSequence);
    }

    public boolean A15() {
        if (Build.VERSION.SDK_INT <= 28) {
            if ((this.A01.A02() & 32768) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (X.C07O.A11(r8, r4, com.google.android.search.verification.client.R.array.crypto_fingerprint_fallback_prefixes) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A16() {
        /*
            r10 = this;
            int r7 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            r9 = 0
            if (r7 < r6) goto L3e
            X.0At r8 = r10.A09()
            if (r8 == 0) goto L40
            X.1Sa r0 = r10.A01
            X.0iE r0 = r0.A05
            if (r0 == 0) goto L40
            java.lang.String r5 = android.os.Build.MANUFACTURER
            java.lang.String r4 = android.os.Build.MODEL
            if (r7 != r6) goto L40
            r1 = 2130903047(0x7f030007, float:1.74129E38)
            if (r5 == 0) goto L35
            android.content.res.Resources r0 = r8.getResources()
            java.lang.String[] r3 = r0.getStringArray(r1)
            int r2 = r3.length
            r1 = 0
        L28:
            if (r1 >= r2) goto L35
            r0 = r3[r1]
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 != 0) goto L3e
            int r1 = r1 + 1
            goto L28
        L35:
            r0 = 2130903046(0x7f030006, float:1.7412899E38)
            boolean r0 = X.C07O.A11(r8, r4, r0)
            if (r0 == 0) goto L40
        L3e:
            r9 = 1
        L3f:
            return r9
        L40:
            if (r7 != r6) goto L3f
            android.content.Context r0 = r10.A0a()
            boolean r0 = X.C11800iM.A03(r0)
            if (r0 != 0) goto L3f
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.A16():boolean");
    }
}
