package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.lang.Thread;
import java.util.List;

/* renamed from: X.176 */
/* loaded from: classes.dex */
public class AnonymousClass176 {
    public static volatile AnonymousClass176 A0A;
    public final Context A00;
    public final Context A01;
    public final C13H A02;
    public final InterfaceC232215r A03;
    public final C39761qg A04;
    public final C17G A05;
    public final C39831qn A06;
    public final C39851qp A07;
    public final C39871qr A08;
    public final C39881qs A09;

    public AnonymousClass176(AnonymousClass178 anonymousClass178) {
        Context context = anonymousClass178.A00;
        C07K.A1Q(context, "Application context can't be null");
        Context context2 = anonymousClass178.A01;
        C07K.A1P(context2);
        this.A00 = context;
        this.A01 = context2;
        this.A03 = C31261bz.A00;
        this.A05 = new C17G(this);
        C39851qp c39851qp = new C39851qp(this);
        c39851qp.A0B();
        this.A07 = c39851qp;
        A01(c39851qp);
        String str = AnonymousClass175.A00;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 134);
        sb.append("Google Analytics ");
        sb.append(str);
        sb.append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        c39851qp.A02(4, sb.toString(), null, null, null);
        C39871qr c39871qr = new C39871qr(this);
        c39871qr.A0B();
        this.A08 = c39871qr;
        C39881qs c39881qs = new C39881qs(this);
        c39881qs.A0B();
        this.A09 = c39881qs;
        C39761qg c39761qg = new C39761qg(this, anonymousClass178);
        AbstractC31511cO abstractC31511cO = new AbstractC31511cO(this) { // from class: X.1ql
            {
                super(this);
            }

            @Override // X.AbstractC31511cO
            public final void A0D() {
            }
        };
        AbstractC31511cO abstractC31511cO2 = new AbstractC31511cO(this) { // from class: X.1qf
            @Override // X.AbstractC31511cO
            public final void A0D() {
            }

            {
                super(this);
                C07K.A1P(this.A03);
            }
        };
        AbstractC31511cO abstractC31511cO3 = new AbstractC31511cO(this) { // from class: X.1qj
            public final C31601cX A00;

            {
                super(this);
                this.A00 = new C31601cX();
            }

            @Override // X.AbstractC31511cO
            public final void A0D() {
                AnonymousClass176 anonymousClass176 = ((AnonymousClass174) this).A00;
                C13H c13h = anonymousClass176.A02;
                C07K.A1P(c13h);
                if (c13h.A03 == null) {
                    synchronized (c13h) {
                        if (c13h.A03 == null) {
                            C31601cX c31601cX = new C31601cX();
                            Context context3 = c13h.A01;
                            PackageManager packageManager = context3.getPackageManager();
                            String packageName = context3.getPackageName();
                            c31601cX.A02 = packageName;
                            c31601cX.A03 = packageManager.getInstallerPackageName(packageName);
                            String str2 = null;
                            try {
                                PackageInfo packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
                                if (packageInfo != null) {
                                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                                    if (!TextUtils.isEmpty(applicationLabel)) {
                                        packageName = applicationLabel.toString();
                                    }
                                    str2 = packageInfo.versionName;
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                                String valueOf = String.valueOf(packageName);
                                Log.e("GAv4", valueOf.length() != 0 ? "Error retrieving package info: appName set to ".concat(valueOf) : new String("Error retrieving package info: appName set to "));
                            }
                            c31601cX.A00 = packageName;
                            c31601cX.A01 = str2;
                            c13h.A03 = c31601cX;
                        }
                    }
                }
                C31601cX c31601cX2 = c13h.A03;
                C31601cX c31601cX3 = this.A00;
                if (!TextUtils.isEmpty(c31601cX2.A00)) {
                    c31601cX3.A00 = c31601cX2.A00;
                }
                if (!TextUtils.isEmpty(c31601cX2.A01)) {
                    c31601cX3.A01 = c31601cX2.A01;
                }
                if (!TextUtils.isEmpty(c31601cX2.A02)) {
                    c31601cX3.A02 = c31601cX2.A02;
                }
                if (!TextUtils.isEmpty(c31601cX2.A03)) {
                    c31601cX3.A03 = c31601cX2.A03;
                }
                C39881qs c39881qs2 = anonymousClass176.A09;
                AnonymousClass176.A01(c39881qs2);
                c39881qs2.A0C();
                String str3 = c39881qs2.A01;
                if (str3 != null) {
                    c31601cX3.A00 = str3;
                }
                c39881qs2.A0C();
                String str4 = c39881qs2.A02;
                if (str4 != null) {
                    c31601cX3.A01 = str4;
                }
            }
        };
        AbstractC31511cO abstractC31511cO4 = new AbstractC31511cO(this) { // from class: X.1qm
            {
                super(this);
            }

            @Override // X.AbstractC31511cO
            public final void A0D() {
            }
        };
        C07K.A1P(context);
        if (C13H.A04 == null) {
            synchronized (C13H.class) {
                if (C13H.A04 == null) {
                    C13H.A04 = new C13H(context);
                }
            }
        }
        C13H c13h = C13H.A04;
        c13h.A00 = new Thread.UncaughtExceptionHandler() { // from class: X.177
            {
                AnonymousClass176.this = this;
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                C39851qp c39851qp2 = AnonymousClass176.this.A07;
                if (c39851qp2 != null) {
                    c39851qp2.A09("Job execution failed", th);
                }
            }
        };
        this.A02 = c13h;
        C30321aJ c30321aJ = new C30321aJ(this);
        abstractC31511cO.A0B();
        abstractC31511cO2.A0B();
        abstractC31511cO3.A0B();
        abstractC31511cO4.A0B();
        C39831qn c39831qn = new C39831qn(this);
        c39831qn.A0B();
        this.A06 = c39831qn;
        c39761qg.A0B();
        this.A04 = c39761qg;
        AnonymousClass176 anonymousClass176 = c30321aJ.A00;
        A01(anonymousClass176.A09);
        C39881qs c39881qs2 = anonymousClass176.A09;
        c39881qs2.A0C();
        c39881qs2.A0C();
        if (c39881qs2.A04) {
            c39881qs2.A0C();
        }
        c39881qs2.A0C();
        final C39801qk c39801qk = c39761qg.A00;
        c39801qk.A0C();
        C07K.A1c(!c39801qk.A02, "Analytics backend already started");
        c39801qk.A02 = true;
        C13H c13h2 = ((AnonymousClass174) c39801qk).A00.A02;
        C07K.A1P(c13h2);
        Runnable runnable = new Runnable() { // from class: X.17D
            /* JADX WARN: Code restructure failed: missing block: B:109:0x00f7, code lost:
                if (r0 == false) goto L55;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 273
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C17D.run():void");
            }
        };
        C07K.A1P(runnable);
        c13h2.A02.submit(runnable);
    }

    public static AnonymousClass176 A00(Context context) {
        C07K.A1P(context);
        if (A0A == null) {
            synchronized (AnonymousClass176.class) {
                if (A0A == null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AnonymousClass176 anonymousClass176 = new AnonymousClass176(new AnonymousClass178(context));
                    A0A = anonymousClass176;
                    synchronized (C30321aJ.class) {
                        List<Runnable> list = C30321aJ.A01;
                        if (list != null) {
                            for (Runnable runnable : list) {
                                runnable.run();
                            }
                            C30321aJ.A01 = null;
                        }
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    long longValue = ((Long) C17L.A09.A00).longValue();
                    if (elapsedRealtime2 > longValue) {
                        C39851qp c39851qp = anonymousClass176.A07;
                        A01(c39851qp);
                        c39851qp.A0A("Slow initialization (ms)", Long.valueOf(elapsedRealtime2), Long.valueOf(longValue));
                    }
                }
            }
        }
        return A0A;
    }

    public static void A01(AbstractC31511cO abstractC31511cO) {
        C07K.A1Q(abstractC31511cO, "Analytics service not created/initialized");
        C07K.A1b(abstractC31511cO.A00, "Analytics service not initialized");
    }
}
