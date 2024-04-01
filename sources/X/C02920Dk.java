package X;

import java.util.Arrays;
import javax.security.auth.Destroyable;

/* renamed from: X.0Dk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C02920Dk implements Destroyable {
    public boolean A00;
    public final byte[] A01;

    public C02920Dk(byte[] bArr) {
        int length = bArr.length;
        if (length == 32) {
            this.A01 = bArr;
            return;
        }
        StringBuilder A0P = C000200d.A0P("Wrong length: ");
        A0P.append(length);
        throw new IllegalArgumentException(A0P.toString());
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        if (this.A00) {
            return;
        }
        Arrays.fill(this.A01, (byte) 0);
        this.A00 = true;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.A00;
    }
}
