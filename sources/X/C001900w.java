package X;

import android.content.Context;
import com.facebook.soloader.SoLoader;
import com.facebook.superpack.AssetDecompressor;
import com.whatsapp.AbstractAppShell;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.00w */
/* loaded from: classes.dex */
public class C001900w {
    public static final Integer[] A08 = {0, 1};
    public static volatile C001900w A09;
    public String A00;
    public String A01;
    public final C002000y A03;
    public final InterfaceC002901k A04;
    public boolean A02 = false;
    public final AtomicBoolean A07 = new AtomicBoolean(true);
    public final HashMap A05 = new HashMap();
    public final Set A06 = new HashSet();

    public C001900w(InterfaceC002901k interfaceC002901k, C002000y c002000y) {
        this.A04 = interfaceC002901k;
        this.A03 = c002000y;
    }

    public static C001900w A00() {
        if (A09 == null) {
            synchronized (C001900w.class) {
                if (A09 == null) {
                    A09 = new C001900w(C002801j.A00(), C002000y.A00());
                }
            }
        }
        return A09;
    }

    public static final String A01(int i) {
        return new String[]{"arm64-v8a", "armeabi-v7a", "x86", "x86_64"}[i];
    }

    public static boolean A02(Context context, String str) {
        if (!new File(new File(new File(context.getFilesDir(), "decompressed"), AbstractAppShell.COMPRESSED_LIBS_ARCHIVE_NAME), C000200d.A0I("lib", str, ".so")).exists()) {
            C000200d.A15("whatsappassetdecompressor/load-library-from-archive File missing: ", str);
            return false;
        }
        try {
            return SoLoader.A03(str);
        } catch (UnsatisfiedLinkError e) {
            StringBuilder sb = new StringBuilder("whatsappassetdecompressor/load-library-from-archive error: ");
            sb.append(str);
            Log.w(sb.toString(), e);
            return false;
        }
    }

    public final String A03(int i) {
        if (i != 0) {
            if (i == 1) {
                return "strings";
            }
            throw new RuntimeException(C000200d.A0D("Compressed folder not explicitly specified for assetType: ", i));
        }
        String str = this.A00;
        if (str == null) {
            String A01 = A01(AssetDecompressor.get_architecture());
            this.A00 = A01;
            return A01;
        }
        return str;
    }

    public boolean A04(Context context, String str) {
        String str2;
        Boolean bool = Boolean.TRUE;
        HashMap hashMap = this.A05;
        boolean z = true;
        if (bool.equals(hashMap.get(str))) {
            return true;
        }
        if (!this.A02) {
            hashMap.put(str, Boolean.FALSE);
            return false;
        }
        try {
            File file = new File(new File(new File(context.getFilesDir(), "decompressed"), str), ".superpack_version");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) file.length());
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            fileInputStream.close();
            str2 = new String(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            str2 = "";
        }
        if ((str2.isEmpty() || !str2.equals(this.A01)) && !this.A06.contains(str)) {
            z = false;
        }
        hashMap.put(str, Boolean.valueOf(z));
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x008d, code lost:
        if (r3.contains("libvlc.so") != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A05(final android.content.Context r6, java.lang.String r7, int r8, boolean r9) {
        /*
            r5 = this;
            boolean r0 = r5.A02
            X.C000700j.A07(r0)
            java.lang.String r0 = "compressed/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r5.A03(r8)
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r3 = r1.toString()
            java.io.File r1 = r6.getFilesDir()
            java.lang.String r2 = "decompressed"
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r2)
            java.io.File r4 = new java.io.File
            r4.<init>(r0, r7)
            java.io.File r0 = r6.getFilesDir()
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r2)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L4c
            boolean r0 = r1.mkdir()
            if (r0 != 0) goto L4c
            java.lang.String r1 = "Could not create decompressed assets directory"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L4c:
            boolean r0 = r4.exists()
            if (r0 != 0) goto L55
            r4.mkdir()
        L55:
            if (r9 != 0) goto L9d
            boolean r0 = r5.A04(r6, r7)
            if (r0 == 0) goto L9d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.AnonymousClass017.A00(r6)
        L65:
            r2 = 1
            if (r8 != 0) goto L95
            java.lang.String r1 = r5.A00
            if (r1 != 0) goto L76
            int r0 = com.facebook.superpack.AssetDecompressor.get_architecture()
            java.lang.String r1 = A01(r0)
            r5.A00 = r1
        L76:
            java.lang.String r0 = "armeabi-v7a"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L8f
            java.lang.String r0 = "libwhatsapp.so"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L8f
            java.lang.String r0 = "libvlc.so"
            boolean r0 = r3.contains(r0)
            r1 = 0
            if (r0 == 0) goto L90
        L8f:
            r1 = 1
        L90:
            java.lang.String r0 = "libvlc.so needs to be co-located in armv7 builds, to avoid setting off a bug on some older x86 devices"
            X.C000700j.A0A(r1, r0)
        L95:
            int r0 = r3.size()
            if (r0 > 0) goto L9c
            r2 = 0
        L9c:
            return r2
        L9d:
            android.content.res.AssetManager r0 = r6.getAssets()
            java.io.InputStream r2 = r0.open(r3)
            java.lang.String r0 = "."
            int r0 = r7.lastIndexOf(r0)     // Catch: java.lang.Throwable -> Le2
            int r1 = r0 + 1
            int r0 = r7.length()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r1 = r7.substring(r1, r0)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r0 = r4.getAbsolutePath()     // Catch: com.facebook.superpack.AssetDecompressionException -> Ldb java.lang.Throwable -> Le2
            java.lang.String[] r0 = com.facebook.superpack.AssetDecompressor.decompress(r2, r1, r0)     // Catch: com.facebook.superpack.AssetDecompressionException -> Ldb java.lang.Throwable -> Le2
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> Le2
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le2
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Le2
            X.01k r1 = r5.A04     // Catch: java.lang.Throwable -> Le2
            X.1QR r0 = new X.1QR     // Catch: java.lang.Throwable -> Le2
            r0.<init>()     // Catch: java.lang.Throwable -> Le2
            r1.AS1(r0)     // Catch: java.lang.Throwable -> Le2
            java.util.Set r0 = r5.A06     // Catch: java.lang.Throwable -> Le2
            r0.add(r7)     // Catch: java.lang.Throwable -> Le2
            if (r2 == 0) goto L65
            r2.close()
            goto L65
        Ldb:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Le2
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le2
            throw r0     // Catch: java.lang.Throwable -> Le2
        Le2:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Le4
        Le4:
            r0 = move-exception
            if (r2 == 0) goto Lea
            r2.close()     // Catch: java.lang.Throwable -> Lea
        Lea:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001900w.A05(android.content.Context, java.lang.String, int, boolean):boolean");
    }
}
