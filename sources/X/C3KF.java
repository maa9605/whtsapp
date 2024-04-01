package X;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.3KF  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3KF extends AbstractC53492h0 implements InterfaceC52102a4 {
    @Override // X.InterfaceC52102a4
    public long A9q() {
        return 0L;
    }

    @Override // X.InterfaceC52102a4
    public String ABN() {
        return "image/*";
    }

    @Override // X.InterfaceC52102a4
    public int getType() {
        return 0;
    }

    public C3KF(File file, long j) {
        super(file, j);
    }

    @Override // X.InterfaceC52102a4
    public Bitmap AVV(int i) {
        long j = i;
        long j2 = j * j * 2;
        try {
            ParcelFileDescriptor open = ParcelFileDescriptor.open(this.A04, 268435456);
            try {
                Bitmap A03 = C43981yK.A03(i, j2, open);
                if (open != null) {
                    open.close();
                    return A03;
                }
                return A03;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (open != null) {
                        try {
                            open.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (IOException | SecurityException e) {
            Log.e("got exception decoding bitmap ", e);
            return null;
        }
    }
}
