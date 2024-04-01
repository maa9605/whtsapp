package X;

import android.graphics.BitmapFactory;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: X.1wv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43141wv {
    public static volatile C43141wv A02;
    public final C01B A00;
    public final C455322l A01;

    public C43141wv(C01B c01b, C455322l c455322l) {
        this.A00 = c01b;
        this.A01 = c455322l;
    }

    public static long A00(int[] iArr) {
        if (iArr == null || iArr.length != 4) {
            return -1L;
        }
        return iArr[0] + iArr[1] + iArr[2];
    }

    public static C43141wv A01() {
        if (A02 == null) {
            synchronized (C41961un.class) {
                if (A02 == null) {
                    A02 = new C43141wv(C01B.A00(), C455322l.A00());
                }
            }
        }
        return A02;
    }

    public static InputStream A02(File file, long j) {
        return new C0MB(new C43351xG(new BufferedInputStream(new FileInputStream(file)), j), C41961un.A0A);
    }

    public boolean A03(File file, int i, boolean z) {
        InputStream A022 = A02(file, i);
        try {
            C455322l c455322l = this.A01;
            if (c455322l != null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                boolean z2 = true;
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(A022, null, options);
                int i2 = c455322l.A02(z).A00;
                if (options.outHeight <= i2 && options.outWidth <= i2) {
                    z2 = false;
                }
                A022.close();
                return z2;
            }
            throw null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A022.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }
}
