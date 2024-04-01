package X;

import android.os.SystemClock;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.3Yi  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C72013Yi {
    public int A00 = 0;
    public long A01 = 262144;
    public final long A02;
    public final AbstractC000600i A03;
    public final Mp4Ops A04;
    public final C001200o A05;
    public final File A06;
    public static final byte[] A07 = {102, 116, 121, 112};
    public static final byte[] A09 = {109, 111, 111, 118};
    public static final byte[] A08 = {109, 100, 97, 116};

    public C72013Yi(C001200o c001200o, Mp4Ops mp4Ops, AbstractC000600i abstractC000600i, File file, long j) {
        this.A05 = c001200o;
        this.A04 = mp4Ops;
        this.A03 = abstractC000600i;
        this.A06 = file;
        this.A02 = j;
    }

    public static boolean A00(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - 4;
        int length2 = bArr2.length;
        if (length >= length2) {
            for (int i = 0; i < length2; i++) {
                if (bArr[4 + i] != bArr2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int A01(boolean z) {
        Mp4Ops.LibMp4StreamCheckResult mp4streamcheck;
        try {
            File file = this.A06;
            long j = this.A02;
            Log.i("mp4ops/check/start");
            int i = 0;
            while (true) {
                try {
                    mp4streamcheck = Mp4Ops.mp4streamcheck(file.getAbsolutePath(), z, j);
                    if (mp4streamcheck.success || !mp4streamcheck.ioException) {
                        break;
                    }
                    SystemClock.sleep(100L);
                    i++;
                    if (i >= 5) {
                        break;
                    }
                } catch (Error e) {
                    Log.e("mp4ops/integration fail/", e);
                    throw new C04100In(0, "stream integrity check error", new Throwable());
                }
            }
            if (mp4streamcheck.success) {
                Log.i("mp4ops/streamcheck/finished");
                long j2 = mp4streamcheck.bytesRequiredToExtractThumbnail;
                if (j2 > 0) {
                    this.A01 = j2;
                    return 1;
                }
                return 1;
            }
            StringBuilder A0P = C000200d.A0P("mp4ops/streamcheck/error_message/");
            A0P.append(mp4streamcheck.errorMessage);
            Log.e(A0P.toString());
            int i2 = mp4streamcheck.errorCode;
            StringBuilder A0P2 = C000200d.A0P("integrity check failed, error_code: ");
            A0P2.append(i2);
            throw new C04100In(i2, A0P2.toString(), new Throwable());
        } catch (C04100In e2) {
            Log.e("Mp4StreamCheck/failed/exception", e2);
            return 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A02(long r15) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72013Yi.A02(long):boolean");
    }
}
