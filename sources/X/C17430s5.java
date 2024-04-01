package X;

import android.os.Build;
import com.whatsapp.util.Log;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandomSpi;

/* renamed from: X.0s5  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17430s5 extends SecureRandomSpi {
    public static DataInputStream A00;
    public static OutputStream A01;
    public static final File A02 = new File("/dev/urandom");
    public static final Object A03 = new Object();
    public boolean seeded;

    @Override // java.security.SecureRandomSpi
    public byte[] engineGenerateSeed(int i) {
        byte[] bArr = new byte[i];
        engineNextBytes(bArr);
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[Catch: all -> 0x0049, TRY_ENTER, TryCatch #4 {IOException -> 0x0052, blocks: (B:5:0x000b, B:6:0x000d, B:16:0x0043, B:17:0x0044, B:18:0x0047, B:7:0x000e, B:15:0x0042, B:25:0x004e), top: B:35:0x000b }] */
    @Override // java.security.SecureRandomSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void engineNextBytes(byte[] r5) {
        /*
            r4 = this;
            boolean r0 = r4.seeded
            if (r0 != 0) goto Lb
            byte[] r0 = X.C001100n.A01()
            r4.engineSetSeed(r0)
        Lb:
            java.lang.Object r3 = X.C17430s5.A03     // Catch: java.io.IOException -> L52
            monitor-enter(r3)     // Catch: java.io.IOException -> L52
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L4f
            java.io.DataInputStream r1 = X.C17430s5.A00     // Catch: java.lang.Throwable -> L4c
            if (r1 != 0) goto L41
            java.io.File r1 = X.C17430s5.A02     // Catch: java.io.IOException -> L22 java.lang.Throwable -> L4c
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.IOException -> L22 java.lang.Throwable -> L4c
            r0.<init>(r1)     // Catch: java.io.IOException -> L22 java.lang.Throwable -> L4c
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch: java.io.IOException -> L22 java.lang.Throwable -> L4c
            r1.<init>(r0)     // Catch: java.io.IOException -> L22 java.lang.Throwable -> L4c
            X.C17430s5.A00 = r1     // Catch: java.io.IOException -> L22 java.lang.Throwable -> L4c
            goto L41
        L22:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r1.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = "Failed to open "
            r1.append(r0)     // Catch: java.lang.Throwable -> L4c
            java.io.File r0 = X.C17430s5.A02     // Catch: java.lang.Throwable -> L4c
            r1.append(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = " for reading"
            r1.append(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L4c
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch: java.lang.Throwable -> L4c
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L4c
            throw r0     // Catch: java.lang.Throwable -> L4c
        L41:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4f
            monitor-enter(r1)     // Catch: java.io.IOException -> L52
            r1.readFully(r5)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            return
        L49:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            throw r0     // Catch: java.io.IOException -> L52
        L4c:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4c
            throw r0     // Catch: java.lang.Throwable -> L4f
        L4f:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4f
            throw r0     // Catch: java.io.IOException -> L52
        L52:
            r2 = move-exception
            java.lang.String r0 = "Failed to read from "
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            java.io.File r0 = X.C17430s5.A02
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17430s5.engineNextBytes(byte[]):void");
    }

    @Override // java.security.SecureRandomSpi
    public void engineSetSeed(byte[] bArr) {
        OutputStream outputStream;
        if ("samsung".equalsIgnoreCase(Build.MANUFACTURER)) {
            this.seeded = true;
            return;
        }
        try {
            synchronized (A03) {
                outputStream = A01;
                if (outputStream == null) {
                    outputStream = new FileOutputStream(A02);
                    A01 = outputStream;
                }
            }
            outputStream.write(bArr);
            outputStream.flush();
            this.seeded = true;
        } catch (IOException e) {
            Log.w("unable to seed PRNG", e);
        }
    }
}
