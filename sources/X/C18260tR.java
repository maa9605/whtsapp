package X;

import android.net.Uri;
import android.os.Handler;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0tR  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C18260tR {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public int A04;
    public long A05;
    public InterfaceC06400Sy A06;
    public String A07;
    public final Handler A0A = new Handler();
    public final long A09 = TimeUnit.SECONDS.toNanos(7);
    public boolean A08 = false;

    public C18260tR(InterfaceC06400Sy interfaceC06400Sy) {
        this.A06 = interfaceC06400Sy;
    }

    public final void A00() {
        double d = this.A02;
        double d2 = this.A03;
        double d3 = this.A00;
        double d4 = this.A01;
        try {
            final URL url = new URL(Uri.parse("https://www.facebook.com/maps/provider_by_viewport?").buildUpon().appendQueryParameter("swlat", String.valueOf(d)).appendQueryParameter("swlon", String.valueOf(d2)).appendQueryParameter("nelat", String.valueOf(d3)).appendQueryParameter("nelon", String.valueOf(d4)).appendQueryParameter("v", this.A07).appendQueryParameter("zoom", String.valueOf(this.A04)).build().toString());
            this.A05 = System.nanoTime();
            this.A08 = false;
            C18620u2.A01(new AbstractRunnableC18610u1() { // from class: X.1Wj
                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
                    if (r6.equals("osm") != false) goto L28;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
                    if (r6.equals("openstreetmap") != false) goto L28;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
                    r0 = X.EnumC18360tc.OSM;
                 */
                @Override // X.AbstractRunnableC18610u1, java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        r8 = this;
                        X.0tR r5 = X.C18260tR.this
                        java.net.URL r0 = r2
                        if (r5 == 0) goto Lab
                        java.lang.String r3 = ""
                        r6 = 0
                        java.io.InputStream r7 = r0.openStream()     // Catch: java.io.IOException -> L2a
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L2a
                        r4.<init>()     // Catch: java.io.IOException -> L2a
                        r0 = 1024(0x400, float:1.435E-42)
                        byte[] r2 = new byte[r0]     // Catch: java.io.IOException -> L2a
                    L16:
                        int r1 = r7.read(r2)     // Catch: java.io.IOException -> L2a
                        if (r1 < 0) goto L25
                        java.lang.String r0 = new java.lang.String     // Catch: java.io.IOException -> L2a
                        r0.<init>(r2, r6, r1)     // Catch: java.io.IOException -> L2a
                        r4.append(r0)     // Catch: java.io.IOException -> L2a
                        goto L16
                    L25:
                        java.lang.String r1 = r4.toString()     // Catch: java.io.IOException -> L2a
                        goto L2b
                    L2a:
                        r1 = r3
                    L2b:
                        boolean r0 = r1.equals(r3)
                        if (r0 != 0) goto Laa
                        java.lang.Class<X.0tc> r0 = X.EnumC18360tc.class
                        java.util.EnumSet r4 = java.util.EnumSet.noneOf(r0)
                        java.lang.String r0 = "\"payload\":["
                        int r0 = r1.indexOf(r0)
                        int r0 = r0 + 11
                        java.lang.String r2 = r1.substring(r0)
                        r0 = 93
                        int r1 = r2.indexOf(r0)
                        r0 = -1
                        if (r1 == r0) goto Laa
                        java.lang.String r1 = r2.substring(r6, r1)
                        java.lang.String r0 = "[^A-Za-z0-9,]"
                        java.lang.String r0 = r1.replaceAll(r0, r3)
                        java.lang.String r1 = r0.trim()
                        java.lang.String r0 = ","
                        java.lang.String[] r3 = r1.split(r0)
                        int r2 = r3.length
                        r1 = 0
                    L62:
                        if (r1 >= r2) goto La5
                        r6 = r3[r1]
                        java.util.Locale r0 = java.util.Locale.US
                        java.lang.String r6 = r6.toLowerCase(r0)
                        int r0 = r6.hashCode()
                        switch(r0) {
                            case -1081373969: goto L7b;
                            case 110345: goto L86;
                            case 3198960: goto L8f;
                            case 1807548271: goto L9a;
                            default: goto L73;
                        }
                    L73:
                        X.0tc r0 = X.EnumC18360tc.UNKNOWN
                    L75:
                        r4.add(r0)
                        int r1 = r1 + 1
                        goto L62
                    L7b:
                        java.lang.String r0 = "mapbox"
                        boolean r0 = r6.equals(r0)
                        if (r0 == 0) goto L73
                        X.0tc r0 = X.EnumC18360tc.MAPBOX
                        goto L75
                    L86:
                        java.lang.String r0 = "osm"
                        boolean r0 = r6.equals(r0)
                        if (r0 == 0) goto L73
                        goto La2
                    L8f:
                        java.lang.String r0 = "here"
                        boolean r0 = r6.equals(r0)
                        if (r0 == 0) goto L73
                        X.0tc r0 = X.EnumC18360tc.HERE
                        goto L75
                    L9a:
                        java.lang.String r0 = "openstreetmap"
                        boolean r0 = r6.equals(r0)
                        if (r0 == 0) goto L73
                    La2:
                        X.0tc r0 = X.EnumC18360tc.OSM
                        goto L75
                    La5:
                        X.0Sy r0 = r5.A06
                        r0.setCurrentAttribution(r4)
                    Laa:
                        return
                    Lab:
                        r0 = 0
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C29331Wj.run():void");
                }
            });
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
