package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.19U  reason: invalid class name */
/* loaded from: classes.dex */
public class C19U {
    public static final AbstractC30501ag A00;
    public static final C30521ai A01;
    public static final C227413u A02;
    public static final C19T A03 = new C19T() { // from class: X.1e3
    };

    static {
        C30521ai c30521ai = new C30521ai();
        A01 = c30521ai;
        AbstractC30501ag abstractC30501ag = new AbstractC30501ag() { // from class: X.1fI
            @Override // X.AbstractC30501ag
            public final InterfaceC30511ah A01(Context context, Looper looper, C230114w c230114w, Object obj, InterfaceC227813z interfaceC227813z, AnonymousClass140 anonymousClass140) {
                return new AbstractC39661qU(context, looper, interfaceC227813z, anonymousClass140, c230114w) { // from class: X.16f
                    public final C241919v A00;
                    public final C241919v A01;
                    public final C241919v A02;
                    public final C241919v A03;
                    public final C241919v A04;
                    public final C241919v A05;
                    public final C241919v A06;
                    public final C241919v A07;
                    public final C1A5 A08;

                    @Override // X.AbstractC229914u
                    public final String A05() {
                        return "com.google.android.gms.wearable.internal.IWearableService";
                    }

                    @Override // X.AbstractC229914u
                    public final String A06() {
                        return "com.google.android.gms.wearable.BIND";
                    }

                    @Override // X.AbstractC39661qU, X.InterfaceC30511ah
                    public final int ABP() {
                        return 8600000;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(context, looper, 14, c230114w, interfaceC227813z, anonymousClass140);
                        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
                        C07K.A1P(context);
                        synchronized (C1A5.class) {
                            if (C1A5.A01 == null) {
                                C1A5.A01 = new C1A5(context);
                            }
                        }
                        C1A5 c1a5 = C1A5.A01;
                        this.A00 = new C241919v();
                        this.A01 = new C241919v();
                        this.A02 = new C241919v();
                        this.A03 = new C241919v();
                        this.A04 = new C241919v();
                        this.A05 = new C241919v();
                        this.A06 = new C241919v();
                        this.A07 = new C241919v();
                        C07K.A1P(newCachedThreadPool);
                        this.A08 = c1a5;
                    }

                    @Override // X.AbstractC229914u
                    public final /* synthetic */ IInterface A03(IBinder iBinder) {
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                        if (queryLocalInterface instanceof InterfaceC241819u) {
                            return queryLocalInterface;
                        }
                        return new C32421e0(iBinder);
                    }

                    @Override // X.AbstractC229914u
                    public final String A04() {
                        return this.A08.A02() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
                    }

                    @Override // X.AbstractC229914u
                    public final void A07(int i, IBinder iBinder, Bundle bundle, int i2) {
                        if (Log.isLoggable("WearableClient", 2)) {
                            StringBuilder sb = new StringBuilder(41);
                            sb.append("onPostInitHandler: statusCode ");
                            sb.append(i);
                            Log.v("WearableClient", sb.toString());
                        }
                        if (i == 0) {
                            this.A00.A00(iBinder);
                            this.A01.A00(iBinder);
                            this.A02.A00(iBinder);
                            this.A03.A00(iBinder);
                            this.A04.A00(iBinder);
                            this.A05.A00(iBinder);
                            this.A06.A00(iBinder);
                            this.A07.A00(iBinder);
                        }
                        super.A07(i, iBinder, bundle, i2);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
                        if (r6 < 8600000) goto L11;
                     */
                    @Override // X.AbstractC229914u, X.InterfaceC30511ah
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void A6Q(X.InterfaceC229514q r8) {
                        /*
                            r7 = this;
                            java.lang.String r5 = "com.google.android.wearable.app.cn"
                            boolean r0 = r7.ARf()
                            if (r0 != 0) goto La9
                            android.content.Context r4 = r7.A0F     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            r0 = 128(0x80, float:1.794E-43)
                            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r5, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            android.os.Bundle r1 = r0.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            r3 = 0
                            if (r1 == 0) goto L8b
                            java.lang.String r0 = "com.google.android.wearable.api.version"
                            int r6 = r1.getInt(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            r0 = 8600000(0x8339c0, float:1.2051167E-38)
                            if (r6 >= r0) goto La9
                        L24:
                            java.lang.String r2 = "WearableClient"
                            r0 = 82
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            r1.<init>(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            java.lang.String r0 = "The Wear OS app is out of date. Requires API version 8600000 but found "
                            r1.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            r1.append(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            java.lang.String r0 = r1.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            android.util.Log.w(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            java.lang.String r1 = "com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR"
                            android.content.Intent r0 = new android.content.Intent     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            r0.<init>(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            android.content.Intent r2 = r0.setPackage(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            r0 = 65536(0x10000, float:9.18355E-41)
                            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            if (r0 != 0) goto L6e
                            java.lang.String r0 = "market://details"
                            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            android.net.Uri$Builder r1 = r0.buildUpon()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            java.lang.String r0 = "id"
                            android.net.Uri$Builder r0 = r1.appendQueryParameter(r0, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            android.net.Uri r1 = r0.build()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            java.lang.String r0 = "android.intent.action.VIEW"
                            android.content.Intent r2 = new android.content.Intent     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            r2.<init>(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                        L6e:
                            android.app.PendingIntent r4 = android.app.PendingIntent.getActivity(r4, r3, r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            r3 = 6
                            java.lang.String r0 = "Connection progress callbacks cannot be null."
                            X.C07K.A1Q(r8, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            r7.A08 = r8     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            android.os.Handler r2 = r7.A0G     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            java.util.concurrent.atomic.AtomicInteger r0 = r7.A0C     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            int r1 = r0.get()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            r0 = 3
                            android.os.Message r0 = r2.obtainMessage(r0, r1, r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            r2.sendMessage(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
                            goto L8d
                        L8b:
                            r6 = 0
                            goto L24
                        L8d:
                            return
                        L8e:
                            r4 = 0
                            r3 = 16
                            java.lang.String r0 = "Connection progress callbacks cannot be null."
                            X.C07K.A1Q(r8, r0)
                            r7.A08 = r8
                            android.os.Handler r2 = r7.A0G
                            java.util.concurrent.atomic.AtomicInteger r0 = r7.A0C
                            int r1 = r0.get()
                            r0 = 3
                            android.os.Message r0 = r2.obtainMessage(r0, r1, r3, r4)
                            r2.sendMessage(r0)
                            return
                        La9:
                            super.A6Q(r8)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C233416f.A6Q(X.14q):void");
                    }

                    @Override // X.AbstractC229914u, X.InterfaceC30511ah
                    public final boolean ARf() {
                        return !this.A08.A02();
                    }
                };
            }
        };
        A00 = abstractC30501ag;
        A02 = new C227413u("Wearable.API", abstractC30501ag, c30521ai);
    }
}
