package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.Locale;

/* renamed from: X.2MV */
/* loaded from: classes2.dex */
public class C2MV {
    public static volatile C2MV A06;
    public final C000400f A00;
    public final AnonymousClass012 A01;
    public final C001200o A02;
    public final C02F A03;
    public final C03340Fh A04;
    public final C2MX A05;

    public C2MV(C001200o c001200o, AnonymousClass012 anonymousClass012, C000400f c000400f, C02F c02f, C03340Fh c03340Fh, C2MX c2mx) {
        this.A02 = c001200o;
        this.A01 = anonymousClass012;
        this.A00 = c000400f;
        this.A03 = c02f;
        this.A04 = c03340Fh;
        this.A05 = c2mx;
        c03340Fh.A00(new C0GG() { // from class: X.3tH
            {
                C2MV.this = this;
            }

            @Override // X.C0GG
            public void A04(AbstractC005302j abstractC005302j) {
                C2MV.this.A05(abstractC005302j);
            }

            @Override // X.C0GG
            public void A05(AbstractC005302j abstractC005302j) {
                C2MV.this.A05(abstractC005302j);
            }
        });
    }

    public static C2MV A00() {
        if (A06 == null) {
            synchronized (C2MV.class) {
                if (A06 == null) {
                    A06 = new C2MV(C001200o.A01, AnonymousClass012.A00(), C000400f.A00(), C02F.A00(), C03340Fh.A00, C2MX.A00);
                }
            }
        }
        return A06;
    }

    public final File A01() {
        C001200o c001200o = this.A02;
        if (c001200o.A00.getExternalCacheDir() == null) {
            Log.e("draftvoicenotecache/getcachedvoicenotesdirectory/external cache directory could not be accessed");
            return null;
        }
        File file = new File(c001200o.A00.getExternalCacheDir().getAbsolutePath(), "Cached Voice Notes");
        if (file.exists() || file.mkdir()) {
            return file;
        }
        Log.e("draftvoicenotecache/getcachedvoicenotefile/problem creating directory ");
        return null;
    }

    public final File A02(AbstractC005302j abstractC005302j) {
        File A01 = A01();
        if (A01 == null) {
            return null;
        }
        return new File(A01, String.format(Locale.US, "%s.%s", abstractC005302j.getRawString(), "opus"));
    }

    public final File A03(AbstractC005302j abstractC005302j) {
        File A01 = A01();
        if (A01 == null) {
            Log.i("draftvoicenotecache/getquotedmessagefile/cached voice note directory is null");
            return null;
        }
        return new File(A01, String.format(Locale.US, "%s.txt", abstractC005302j.getRawString()));
    }

    public void A04() {
        File[] listFiles;
        File A01 = A01();
        if (A01 != null && (listFiles = A01.listFiles()) != null) {
            for (File file : listFiles) {
                long lastModified = file.lastModified() + 604800000;
                if (this.A01.A00 != null) {
                    if (lastModified <= System.currentTimeMillis()) {
                        AnonymousClass024.A0f(file);
                        file.getName();
                    }
                } else {
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0010, code lost:
        if (X.AnonymousClass024.A0f(r0) == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(X.AbstractC005302j r6) {
        /*
            r5 = this;
            java.lang.String r0 = "Chat jid cannot be null"
            X.C000700j.A04(r6, r0)
            java.io.File r0 = r5.A02(r6)
            if (r0 == 0) goto L12
            boolean r0 = X.AnonymousClass024.A0f(r0)
            r2 = 1
            if (r0 != 0) goto L13
        L12:
            r2 = 0
        L13:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "draftvoicenotecache/deletevoicenote/ deleted: "
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = " jid "
            r1.append(r0)
            r1.append(r6)
            r1.toString()
            r0 = r5
            java.io.File r1 = r5.A03(r6)
            if (r1 == 0) goto L38
            boolean r0 = r1.exists()
            if (r0 == 0) goto L38
            r1.delete()
        L38:
            if (r2 == 0) goto L70
            X.2MX r0 = r5.A05
            X.023 r4 = r0.A00
            monitor-enter(r4)
            X.023 r0 = r0.A00     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L6d
        L45:
            r1 = r3
            X.0G5 r1 = (X.C0G5) r1
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L6b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L6d
            X.1i7 r2 = (X.C34801i7) r2     // Catch: java.lang.Throwable -> L6d
            com.whatsapp.Conversation r1 = r2.A00     // Catch: java.lang.Throwable -> L6d
            X.02j r0 = r1.A2a     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r6.equals(r0)     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L45
            X.08q r0 = r1.A0n     // Catch: java.lang.Throwable -> L6d
            X.1Fq r1 = new X.1Fq     // Catch: java.lang.Throwable -> L6d
            r1.<init>()     // Catch: java.lang.Throwable -> L6d
            android.os.Handler r0 = r0.A02     // Catch: java.lang.Throwable -> L6d
            r0.post(r1)     // Catch: java.lang.Throwable -> L6d
            goto L45
        L6b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6d
            return
        L6d:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6d
            throw r0
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2MV.A05(X.02j):void");
    }
}
