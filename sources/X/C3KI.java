package X;

import android.graphics.Bitmap;
import java.io.File;

/* renamed from: X.3KI  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3KI extends AbstractC53492h0 implements InterfaceC52102a4 {
    public final long A00;

    @Override // X.InterfaceC52102a4
    public String ABN() {
        return "video/*";
    }

    @Override // X.InterfaceC52102a4
    public int getType() {
        return 1;
    }

    public C3KI(File file, long j, long j2) {
        super(file, j);
        this.A00 = j2;
    }

    @Override // X.InterfaceC52102a4
    public long A9q() {
        return this.A00;
    }

    @Override // X.InterfaceC52102a4
    public Bitmap AVV(int i) {
        return C02180Ae.A0I(this.A04);
    }
}
