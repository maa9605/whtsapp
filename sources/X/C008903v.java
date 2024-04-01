package X;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.zip.ZipEntry;

/* renamed from: X.03v  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C008903v extends C009003w {
    public final int A00;

    public C008903v(Context context, File file, String str, int i) {
        super(context, str, file);
        this.A00 = i;
    }

    @Override // X.AbstractC008503r
    public AbstractC20770yA A04() {
        return new C1Z0(this) { // from class: X.1pg
            public File A00;
            public final int A01;

            {
                this.A00 = new File(((AbstractC008503r) C008903v.this).A01.getApplicationInfo().nativeLibraryDir);
                this.A01 = C008903v.this.A00;
            }

            @Override // X.C1Z0
            public boolean A02(ZipEntry zipEntry, String str) {
                String A0I;
                String name = zipEntry.getName();
                C008903v c008903v = C008903v.this;
                boolean z = false;
                if (str.equals(((AbstractC008503r) c008903v).A00)) {
                    ((AbstractC008503r) c008903v).A00 = null;
                    A0I = String.format("allowing consideration of corrupted lib %s", str);
                } else if ((this.A01 & 1) == 0) {
                    A0I = C000200d.A0I("allowing consideration of ", name, ": self-extraction preferred");
                } else {
                    File file = new File(this.A00, str);
                    if (!file.isFile()) {
                        A0I = String.format("allowing considering of %s: %s not in system lib dir", name, str);
                    } else {
                        long length = file.length();
                        long size = zipEntry.getSize();
                        if (length != size) {
                            A0I = String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", file, Long.valueOf(length), Long.valueOf(size));
                        } else {
                            A0I = C000200d.A0I("not allowing consideration of ", name, ": deferring to libdir");
                            Log.d("ApkSoSource", A0I);
                            return z;
                        }
                    }
                }
                z = true;
                Log.d("ApkSoSource", A0I);
                return z;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[Catch: all -> 0x008b, TRY_ENTER, TryCatch #1 {all -> 0x008b, blocks: (B:3:0x000b, B:5:0x0025, B:7:0x0031, B:9:0x003a, B:12:0x0045, B:14:0x004d, B:17:0x0058, B:19:0x0067, B:22:0x0072), top: B:31:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[Catch: all -> 0x008b, TRY_LEAVE, TryCatch #1 {all -> 0x008b, blocks: (B:3:0x000b, B:5:0x0025, B:7:0x0031, B:9:0x003a, B:12:0x0045, B:14:0x004d, B:17:0x0058, B:19:0x0067, B:22:0x0072), top: B:31:0x000b }] */
    @Override // X.AbstractC008503r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] A05() {
        /*
            r6 = this;
            java.io.File r0 = r6.A00
            java.io.File r1 = r0.getCanonicalFile()
            android.os.Parcel r3 = android.os.Parcel.obtain()
            r5 = 2
            r3.writeByte(r5)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = r1.getPath()     // Catch: java.lang.Throwable -> L8b
            r3.writeString(r0)     // Catch: java.lang.Throwable -> L8b
            long r0 = r1.lastModified()     // Catch: java.lang.Throwable -> L8b
            r3.writeLong(r0)     // Catch: java.lang.Throwable -> L8b
            android.content.Context r4 = r6.A01     // Catch: java.lang.Throwable -> L8b
            android.content.pm.PackageManager r2 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L8b
            r1 = 0
            if (r2 == 0) goto L30
            java.lang.String r0 = r4.getPackageName()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L8b
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r0, r1)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L8b
            int r0 = r0.versionCode     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L8b
            goto L31
        L30:
            r0 = 0
        L31:
            r3.writeInt(r0)     // Catch: java.lang.Throwable -> L8b
            int r0 = r6.A00     // Catch: java.lang.Throwable -> L8b
            r2 = 1
            r0 = r0 & r2
            if (r0 != 0) goto L45
            r3.writeByte(r1)     // Catch: java.lang.Throwable -> L8b
            byte[] r0 = r3.marshall()     // Catch: java.lang.Throwable -> L8b
            r3.recycle()
            return r0
        L45:
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = r0.nativeLibraryDir     // Catch: java.lang.Throwable -> L8b
            if (r1 != 0) goto L58
            r3.writeByte(r2)     // Catch: java.lang.Throwable -> L8b
            byte[] r0 = r3.marshall()     // Catch: java.lang.Throwable -> L8b
            r3.recycle()
            return r0
        L58:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L8b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L8b
            java.io.File r1 = r0.getCanonicalFile()     // Catch: java.lang.Throwable -> L8b
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L8b
            if (r0 != 0) goto L72
            r3.writeByte(r2)     // Catch: java.lang.Throwable -> L8b
            byte[] r0 = r3.marshall()     // Catch: java.lang.Throwable -> L8b
            r3.recycle()
            return r0
        L72:
            r3.writeByte(r5)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = r1.getPath()     // Catch: java.lang.Throwable -> L8b
            r3.writeString(r0)     // Catch: java.lang.Throwable -> L8b
            long r0 = r1.lastModified()     // Catch: java.lang.Throwable -> L8b
            r3.writeLong(r0)     // Catch: java.lang.Throwable -> L8b
            byte[] r0 = r3.marshall()     // Catch: java.lang.Throwable -> L8b
            r3.recycle()
            return r0
        L8b:
            r0 = move-exception
            r3.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C008903v.A05():byte[]");
    }
}
