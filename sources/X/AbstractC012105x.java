package X;

import android.media.MediaScannerConnection;
import android.net.Uri;
import com.whatsapp.NativeMediaHandler;
import com.whatsapp.util.Log;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.05x */
/* loaded from: classes.dex */
public abstract class AbstractC012105x {
    public C0HM A00;
    public final NativeMediaHandler A01;
    public final AnonymousClass034 A02;
    public final C001200o A03;
    public final C02C A04;
    public final Object A05 = new Object();
    public static final String A08 = C000200d.A0L(new StringBuilder(), "WhatsApp", " Audio");
    public static final String A07 = C000200d.A0L(new StringBuilder(), "WhatsApp", " Animated Gifs");
    public static final String A0F = C000200d.A0L(new StringBuilder(), "WhatsApp", " Voice Notes");
    public static final String A0E = C000200d.A0L(new StringBuilder(), "WhatsApp", " Video");
    public static final String A0B = C000200d.A0L(new StringBuilder(), "WhatsApp", " Images");
    public static final String A0A = C000200d.A0L(new StringBuilder(), "WhatsApp", " Documents");
    public static final String A0C = C000200d.A0L(new StringBuilder(), "WhatsApp", " Profile Photos");
    public static final String A09 = C000200d.A0L(new StringBuilder(), "WhatsApp", " Calls");
    public static final String A0D = C000200d.A0L(new StringBuilder(), "WhatsApp", " Stickers");
    public static SimpleDateFormat A06 = new SimpleDateFormat("yyyyww", Locale.US);

    public AbstractC012105x(C001200o c001200o, AnonymousClass034 anonymousClass034, NativeMediaHandler nativeMediaHandler, C02C c02c) {
        this.A03 = c001200o;
        this.A02 = anonymousClass034;
        this.A01 = nativeMediaHandler;
        this.A04 = c02c;
    }

    public static File A01(File file, String str) {
        boolean z = false;
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
            } else if (file.isDirectory()) {
                z = true;
            }
        }
        if (!z && !file.mkdirs()) {
            Log.e("app/extsharedfile/folder/created/false");
        }
        return new File(file, str);
    }

    public static final File A02(File file, String str, String str2, String str3) {
        String name;
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.replace('/', '-'));
            sb.append(str3);
            name = sb.toString();
        } else if (str2 != null) {
            name = new File(str2).getName();
        } else {
            Log.e("fmessageio/getDownloadFile/no_url");
            return null;
        }
        return A01(file, name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x002e, code lost:
        if (r3.isDirectory() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A03(java.io.File r3, boolean r4) {
        /*
            boolean r0 = r3.exists()     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto Lf
            boolean r0 = r3.isFile()     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L2a
            r3.delete()     // Catch: java.lang.Throwable -> L5b
        Lf:
            boolean r0 = r3.mkdirs()     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L30
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r1.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = "fmessageio/prepareFolder/mkdirs failed: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L5b
            r1.append(r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L5b
            com.whatsapp.util.Log.e(r0)     // Catch: java.lang.Throwable -> L5b
            goto L30
        L2a:
            boolean r0 = r3.isDirectory()     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto Lf
        L30:
            if (r4 == 0) goto L5a
            java.lang.String r0 = ".nomedia"
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L5b
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L5a
            r1.createNewFile()     // Catch: java.io.IOException -> L43 java.lang.Throwable -> L5b
            goto L59
        L43:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r1.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = "fmessageio/prepareFolder "
            r1.append(r0)     // Catch: java.lang.Throwable -> L5b
            r1.append(r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L5b
            com.whatsapp.util.Log.e(r0, r2)     // Catch: java.lang.Throwable -> L5b
            goto L5a
        L59:
            return
        L5a:
            return
        L5b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC012105x.A03(java.io.File, boolean):void");
    }

    public C0HM A04() {
        C0HM c0hm;
        synchronized (this.A05) {
            if (this.A00 == null) {
                A0O();
            }
            c0hm = this.A00;
            if (c0hm == null) {
                throw null;
            }
        }
        return c0hm;
    }

    public File A05() {
        return new File(this.A03.A00.getFilesDir(), "business_activity_report.zip");
    }

    public File A06() {
        return new File(this.A03.A00.getFilesDir(), "dyi.zip");
    }

    public File A07() {
        File file = new File(this.A03.A00.getCacheDir(), "export_chats");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public File A08() {
        File file = new File(this.A03.A00.getCacheDir(), "export_business_activity");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public File A09() {
        File file = new File(this.A03.A00.getCacheDir(), "export_dyi");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public File A0A() {
        File file = new File(this.A03.A00.getCacheDir(), "export_gdpr");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public File A0B() {
        File file = A04().A03;
        A03(file, true);
        return file;
    }

    public File A0C() {
        File file = new File(this.A03.A00.getFilesDir(), "Gifs");
        A03(file, false);
        return file;
    }

    public File A0D() {
        File file = A04().A0A;
        A03(file, false);
        return file;
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x00be, code lost:
        if (r1 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.File A0E(byte r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC012105x.A0E(byte, int, int):java.io.File");
    }

    public File A0F(AnonymousClass097 anonymousClass097) {
        if (C003101m.A0T(anonymousClass097.A0n.A00)) {
            return new File(this.A03.A00.getFilesDir(), "gdpr.zip.tmp");
        }
        return A02(A0B(), anonymousClass097.A06, anonymousClass097.A09, ".tmp");
    }

    public File A0G(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName());
        sb.append(".chck");
        return A0L(sb.toString());
    }

    public File A0H(String str) {
        File A072 = A07();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".txt");
        return new File(A072, sb.toString().replaceAll("[?:\\\\/*\"<>|]", ""));
    }

    public File A0I(String str) {
        File A082 = A08();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".zip");
        return new File(A082, sb.toString().replaceAll("[?:\\\\/*\"<>|]", ""));
    }

    public File A0J(String str) {
        File A092 = A09();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".zip");
        return new File(A092, sb.toString().replaceAll("[?:\\\\/*\"<>|]", ""));
    }

    public File A0K(String str) {
        File A0A2 = A0A();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".zip");
        return new File(A0A2, sb.toString().replaceAll("[?:\\\\/*\"<>|]", ""));
    }

    public File A0L(String str) {
        return A01(A0B(), str);
    }

    public File A0M(String str, String str2) {
        File A062 = this.A02.A06(".StickerThumbs");
        A03(A062, false);
        return A02(A062, str, str2, ".thumb.webp");
    }

    public File A0N(boolean z, String str, String str2, String str3) {
        if (z) {
            return new File(this.A03.A00.getFilesDir(), "gdpr.zip.enc.tmp");
        }
        if (str != null) {
            return A02(A0B(), str, str3, ".enc.tmp");
        }
        return A02(A0B(), str2, str3, ".enc.tmp");
    }

    public void A0O() {
        synchronized (this.A05) {
            this.A00 = new C0HM(this);
            C02C c02c = this.A04;
            C001200o c001200o = this.A03;
            File file = new File(c001200o.A00.getFilesDir(), "Stickers");
            A03(file, false);
            Set set = c02c.A01;
            set.add(file);
            set.add(A07());
            set.add(A0A());
            set.add(A09());
            set.add(A08());
            File file2 = A04().A09;
            A03(file2, false);
            set.add(file2);
            set.add(A0C());
            File file3 = new File(c001200o.A00.getCacheDir(), "stickers_cache");
            A03(file3, false);
            set.add(file3);
            set.add(A04().A08);
            set.add(A04().A06);
            set.add(A04().A07);
            NativeMediaHandler nativeMediaHandler = this.A01;
            if (nativeMediaHandler != null) {
                NativeMediaHandler.initFileHandlingCallbacks(nativeMediaHandler);
            } else {
                throw null;
            }
        }
    }

    public final void A0P(File file) {
        File[] listFiles;
        File file2 = new File(file, ".nomedia");
        if (file2.exists() && file2.delete() && (listFiles = file.listFiles()) != null) {
            A0Q(Arrays.asList(listFiles), null);
        }
    }

    public void A0Q(List list, final Runnable runnable) {
        int size = list.size();
        String[] strArr = new String[list.size()];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((File) list.get(i)).getAbsolutePath();
        }
        final AtomicInteger atomicInteger = new AtomicInteger(size);
        MediaScannerConnection.scanFile(this.A03.A00, strArr, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: X.1Fd
            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public final void onScanCompleted(String str, Uri uri) {
                AtomicInteger atomicInteger2 = atomicInteger;
                Runnable runnable2 = runnable;
                StringBuilder sb = new StringBuilder("fmessageio/rescan/scan completed: file=");
                sb.append(str);
                sb.append(" uri=");
                sb.append(uri);
                Log.i(sb.toString());
                if (atomicInteger2.decrementAndGet() <= 0 && runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }

    public boolean A0R(File file) {
        return file.getCanonicalPath().startsWith(A04().A0A.getCanonicalPath());
    }

    public boolean A0S(File file) {
        return file.getCanonicalPath().startsWith(A04().A03.getCanonicalPath()) || file.getCanonicalPath().startsWith(A04().A09.getCanonicalPath());
    }

    public boolean A0T(File file) {
        if (A0R(file)) {
            String canonicalPath = file.getCanonicalPath();
            C0HM A04 = A04();
            return (canonicalPath.startsWith(A04.A0H.getCanonicalPath()) || canonicalPath.startsWith(A04.A0I.getCanonicalPath()) || canonicalPath.startsWith(A04.A0J.getCanonicalPath()) || canonicalPath.startsWith(A04.A0K.getCanonicalPath()) || canonicalPath.startsWith(A04.A0L.getCanonicalPath()) || canonicalPath.startsWith(A04.A0M.getCanonicalPath()) || canonicalPath.startsWith(A04.A0B.getCanonicalPath()) || canonicalPath.startsWith(A04.A0C.getCanonicalPath()) || canonicalPath.startsWith(A04.A0D.getCanonicalPath()) || canonicalPath.startsWith(A04.A0E.getCanonicalPath()) || canonicalPath.startsWith(A04.A0F.getCanonicalPath()) || canonicalPath.startsWith(A04.A04.getCanonicalPath()) || canonicalPath.startsWith(A04.A0O.getCanonicalPath())) ? false : true;
        }
        return false;
    }
}
