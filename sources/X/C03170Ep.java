package X;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

/* renamed from: X.0Ep */
/* loaded from: classes.dex */
public class C03170Ep {
    public static volatile C03170Ep A05;
    public Boolean A00;
    public final C0LH A01;
    public final AnonymousClass012 A02;
    public final C000500h A03;
    public final C003701t A04;

    public C03170Ep(C001200o c001200o, AnonymousClass012 anonymousClass012, C003701t c003701t, C000500h c000500h) {
        this.A02 = anonymousClass012;
        this.A04 = c003701t;
        this.A03 = c000500h;
        boolean A07 = A07();
        Application application = c001200o.A00;
        this.A01 = A07 ? new C0LH(application) { // from class: X.1hw
            public final C11690iB A00;

            @Override // X.C0LH
            public void A5c(C0HE c0he, InterfaceC06550Tv interfaceC06550Tv) {
            }

            {
                this.A00 = new C11690iB(new C1SW(application));
            }

            @Override // X.C0LH
            public boolean A5t() {
                return this.A00.A00() == 0;
            }

            @Override // X.C0LH
            public boolean AEQ() {
                return this.A00.A00() != 11;
            }

            @Override // X.C0LH
            public boolean AFJ() {
                return this.A00.A00() != 12;
            }
        } : new C0LH(application) { // from class: X.0LG
            public final C0LI A00;

            {
                this.A00 = new C0LI(application);
            }

            @Override // X.C0LH
            public void A5c(C0HE c0he, InterfaceC06550Tv interfaceC06550Tv) {
                final WeakReference weakReference = new WeakReference(interfaceC06550Tv);
                try {
                    this.A00.A01(null, c0he, new C0LJ() { // from class: X.1ip
                        @Override // X.C0LJ
                        public void A00() {
                            Log.i("AppAuthManager/authenticate: authentication failed");
                            InterfaceC06550Tv interfaceC06550Tv2 = (InterfaceC06550Tv) weakReference.get();
                            if (interfaceC06550Tv2 != null) {
                                interfaceC06550Tv2.AHa();
                            }
                        }

                        @Override // X.C0LJ
                        public void A01(int i, CharSequence charSequence) {
                            StringBuilder sb = new StringBuilder("AppAuthManager/authenticate: authentication error=");
                            sb.append(i);
                            sb.append(" errString=");
                            sb.append((Object) charSequence);
                            Log.e(sb.toString());
                            InterfaceC06550Tv interfaceC06550Tv2 = (InterfaceC06550Tv) weakReference.get();
                            if (interfaceC06550Tv2 != null) {
                                interfaceC06550Tv2.AHZ(i, charSequence);
                            }
                        }

                        @Override // X.C0LJ
                        public void A02(int i, CharSequence charSequence) {
                            StringBuilder sb = new StringBuilder("AppAuthManager/authenticate: authentication help=");
                            sb.append(i);
                            sb.append(" errString=");
                            sb.append((Object) charSequence);
                            Log.i(sb.toString());
                            InterfaceC06550Tv interfaceC06550Tv2 = (InterfaceC06550Tv) weakReference.get();
                            if (interfaceC06550Tv2 != null) {
                                interfaceC06550Tv2.AHb(i, charSequence);
                            }
                        }

                        @Override // X.C0LJ
                        public void A03(C12930kK c12930kK) {
                            Log.i("AppAuthManager/authenticate: authentication succeeded");
                            InterfaceC06550Tv interfaceC06550Tv2 = (InterfaceC06550Tv) weakReference.get();
                            if (interfaceC06550Tv2 != null) {
                                interfaceC06550Tv2.AHc(null);
                            }
                        }
                    });
                } catch (NullPointerException e) {
                    e.getMessage();
                    InterfaceC06550Tv interfaceC06550Tv2 = (InterfaceC06550Tv) weakReference.get();
                    if (interfaceC06550Tv2 != null) {
                        interfaceC06550Tv2.AHa();
                    }
                }
            }

            @Override // X.C0LH
            public boolean A5t() {
                C0LI c0li = this.A00;
                return c0li.A03() && c0li.A02();
            }

            @Override // X.C0LH
            public boolean AEQ() {
                return this.A00.A02();
            }

            @Override // X.C0LH
            public boolean AFJ() {
                return this.A00.A03();
            }
        };
    }

    public static C03170Ep A00() {
        if (A05 == null) {
            synchronized (C03170Ep.class) {
                if (A05 == null) {
                    A05 = new C03170Ep(C001200o.A01, AnonymousClass012.A00(), C003701t.A00(), C000500h.A00());
                }
            }
        }
        return A05;
    }

    public void A01(Activity activity) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Method method = Activity.class.getMethod("setDisablePreviewScreenshots", Boolean.TYPE);
                method.setAccessible(true);
                method.invoke(activity, Boolean.valueOf(A05()));
            } catch (Exception e) {
                Log.e("Could not invoke setDisablePreviewScreenshots()", e);
            }
        }
    }

    public void A02(C0HE c0he, InterfaceC06550Tv interfaceC06550Tv) {
        C000700j.A07(A06());
        this.A01.A5c(c0he, interfaceC06550Tv);
    }

    public void A03(boolean z) {
        Boolean bool = this.A00;
        if (bool == null || bool.booleanValue() != z) {
            this.A00 = Boolean.valueOf(z);
            C000200d.A1C("AppAuthManager/setIsAuthenticationNeeded: ", z);
            C000200d.A0j(this.A03, "fingerprint_authentication_needed", z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000d, code lost:
        if (r2.A01.AEQ() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A04() {
        /*
            r2 = this;
            boolean r0 = r2.A06()
            if (r0 == 0) goto Lf
            X.0LH r0 = r2.A01
            boolean r0 = r0.AEQ()
            r1 = 1
            if (r0 != 0) goto L10
        Lf:
            r1 = 0
        L10:
            java.lang.String r0 = "AppAuthManager/hasEnrolledBiometrics: enrolled: "
            X.C000200d.A1C(r0, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03170Ep.A04():boolean");
    }

    public boolean A05() {
        return Build.VERSION.SDK_INT >= 23 && this.A03.A00.getBoolean("privacy_fingerprint_enabled", false) && this.A01.A5t();
    }

    public boolean A06() {
        return Build.VERSION.SDK_INT >= 23 && this.A01.AFJ();
    }

    public boolean A07() {
        return this.A04.A0C(266);
    }

    public boolean A08() {
        SharedPreferences sharedPreferences = this.A03.A00;
        boolean z = sharedPreferences.getBoolean("privacy_fingerprint_enabled", false);
        boolean z2 = sharedPreferences.getBoolean("fingerprint_authentication_needed", false);
        boolean A04 = A04();
        if (A04 && z && z2) {
            long A03 = this.A02.A03();
            long j = sharedPreferences.getLong("app_background_time", 0L) + sharedPreferences.getLong("privacy_fingerprint_timeout", 60000L);
            C000200d.A1V(C000200d.A0P("AppAuthManager/shouldShowAuthPrompt: show prompt if necessary: "), j < A03);
            return j < A03;
        }
        StringBuilder A0P = C000200d.A0P("AppAuthManager/shouldShowAuthPrompt: No prompt: ");
        A0P.append(!A04);
        A0P.append(" || ");
        A0P.append(!z);
        A0P.append(" || ");
        C000200d.A1V(A0P, !z2);
        return false;
    }

    public boolean A09() {
        return !A05() || this.A03.A00.getBoolean("privacy_fingerprint_show_notification_content", true);
    }
}
