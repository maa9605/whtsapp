package X;

import java.util.Arrays;
import javax.security.auth.Destroyable;

/* renamed from: X.0Dl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C02930Dl implements Destroyable {
    public boolean A00;
    public final byte[] A01;

    public C02930Dl(byte[] bArr) {
        this.A01 = bArr;
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
