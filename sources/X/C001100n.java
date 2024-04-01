package X;

import android.os.Build;
import android.os.Process;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* renamed from: X.00n  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C001100n {
    public static final byte[] A00;

    static {
        StringBuilder sb = new StringBuilder();
        String str = Build.FINGERPRINT;
        if (str != null) {
            sb.append(str);
        }
        String str2 = Build.SERIAL;
        if (str2 != null) {
            sb.append(str2);
        }
        try {
            A00 = sb.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 encoding not supported");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0118 A[Catch: all -> 0x0137, TryCatch #1 {, blocks: (B:15:0x007c, B:17:0x0084, B:19:0x0087, B:21:0x0095, B:22:0x009a, B:26:0x00da, B:27:0x00e0, B:29:0x00ee, B:31:0x00f0, B:32:0x010e, B:34:0x0110, B:35:0x0117, B:36:0x0118, B:37:0x0136, B:25:0x00ae), top: B:44:0x007c, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00() {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001100n.A00():void");
    }

    public static byte[] A01() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeLong(System.currentTimeMillis());
                dataOutputStream.writeLong(System.nanoTime());
                dataOutputStream.writeInt(Process.myPid());
                dataOutputStream.writeInt(Process.myUid());
                dataOutputStream.write(A00);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        dataOutputStream.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (IOException e) {
            throw new SecurityException("Failed to generate seed", e);
        }
    }
}
