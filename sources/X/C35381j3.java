package X;

import java.io.File;

/* renamed from: X.1j3  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C35381j3 extends C0HS {
    public Exception A00;
    public final C012005w A01;
    public final AnonymousClass240 A02;
    public final String A03;
    public final String A04;

    public C35381j3(C012005w c012005w, String str, String str2, AnonymousClass240 anonymousClass240) {
        this.A01 = c012005w;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = anonymousClass240;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
        if (r3.equals("image/gif") == false) goto L40;
     */
    @Override // X.C0HS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A07(java.lang.Object[] r8) {
        /*
            r7 = this;
            java.lang.String r0 = r7.A04     // Catch: java.io.IOException -> La2
            java.net.URL r1 = new java.net.URL     // Catch: java.io.IOException -> La2
            r1.<init>(r0)     // Catch: java.io.IOException -> La2
            java.net.URLConnection r0 = r1.openConnection()     // Catch: java.io.IOException -> La2
            r0.connect()     // Catch: java.io.IOException -> La2
            java.io.InputStream r0 = r1.openStream()     // Catch: java.io.IOException -> La2
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.io.IOException -> La2
            r5.<init>(r0)     // Catch: java.io.IOException -> La2
            X.05w r4 = r7.A01     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            r6.<init>()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = X.C0DD.A0J()     // Catch: java.lang.Throwable -> L9b
            r6.append(r0)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r3 = r7.A03     // Catch: java.lang.Throwable -> L9b
            int r1 = r3.hashCode()     // Catch: java.lang.Throwable -> L9b
            r0 = -879267568(0xffffffffcb977110, float:-1.984976E7)
            r2 = 1
            if (r1 == r0) goto L40
            r0 = 1331848029(0x4f62635d, float:3.79816269E9)
            if (r1 != r0) goto L49
            java.lang.String r0 = "video/mp4"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L9b
            r1 = 0
            if (r0 != 0) goto L4a
            goto L49
        L40:
            java.lang.String r0 = "image/gif"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L9b
            r1 = 1
            if (r0 != 0) goto L4a
        L49:
            r1 = -1
        L4a:
            if (r1 == 0) goto L5d
            if (r1 != r2) goto L4f
            goto L60
        L4f:
            java.lang.String r1 = "Unexpected info type ("
            java.lang.String r0 = ")"
            java.lang.String r1 = X.C000200d.A0I(r1, r3, r0)     // Catch: java.lang.Throwable -> L9b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9b
            throw r0     // Catch: java.lang.Throwable -> L9b
        L5d:
            java.lang.String r0 = ".mp4"
            goto L62
        L60:
            java.lang.String r0 = ".gif"
        L62:
            r6.append(r0)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L9b
            java.io.File r4 = r4.A0L(r0)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L9b
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9b
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L9b
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L94
            int r1 = r5.read(r2)     // Catch: java.lang.Throwable -> L94
        L7e:
            r0 = -1
            if (r1 == r0) goto L8a
            r0 = 0
            r3.write(r2, r0, r1)     // Catch: java.lang.Throwable -> L94
            int r1 = r5.read(r2)     // Catch: java.lang.Throwable -> L94
            goto L7e
        L8a:
            r3.flush()     // Catch: java.lang.Throwable -> L94
            r3.close()     // Catch: java.lang.Throwable -> L9b
            r5.close()     // Catch: java.io.IOException -> La2
            return r4
        L94:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L96
        L96:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L9a
        L9a:
            throw r0     // Catch: java.lang.Throwable -> L9b
        L9b:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L9d
        L9d:
            r0 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> La1
        La1:
            throw r0     // Catch: java.io.IOException -> La2
        La2:
            r0 = move-exception
            r7.A00 = r0
            com.whatsapp.util.Log.e(r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35381j3.A07(java.lang.Object[]):java.lang.Object");
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        File file = (File) obj;
        if (file != null) {
            this.A02.AKO(this.A04, file, null);
            return;
        }
        Exception exc = this.A00;
        if (exc == null) {
            return;
        }
        this.A02.AKE(exc);
    }
}
